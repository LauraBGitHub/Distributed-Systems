import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class Service01Server{
    private int port = 8080;
    private Server server;
  
    private void start() throws IOException {
      server = ServerBuilder.forPort(port)
          .addService(new RFIDServiceImpl())
          .build()
          .start();
      System.out.println("Server started, listening on " + port);
      Runtime.getRuntime().addShutdownHook(new Thread() {
        @Override
        public void run() {
          System.err.println("*** shutting down gRPC server since JVM is shutting down");
          Service01Server.this.stop();
          System.err.println("*** server shut down");
        }
      });
    }