/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow_cluster_service_protos.proto

package com.linkedin.tony.rpc.proto;

public final class TensorFlowCluster {
  private TensorFlowCluster() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf service {@code TensorFlowClusterService}
   */
  public static abstract class TensorFlowClusterService
      implements com.google.protobuf.Service {
    protected TensorFlowClusterService() {}

    public interface Interface {
      /**
       * <code>rpc getTaskInfos(.GetTaskInfosRequestProto) returns (.GetTaskInfosResponseProto);</code>
       */
      public abstract void getTaskInfos(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto> done);

      /**
       * <code>rpc getClusterSpec(.GetClusterSpecRequestProto) returns (.GetClusterSpecResponseProto);</code>
       */
      public abstract void getClusterSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto> done);

      /**
       * <code>rpc registerWorkerSpec(.RegisterWorkerSpecRequestProto) returns (.RegisterWorkerSpecResponseProto);</code>
       */
      public abstract void registerWorkerSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto> done);

      /**
       * <code>rpc registerTensorBoardUrl(.RegisterTensorBoardUrlRequestProto) returns (.RegisterTensorBoardUrlResponseProto);</code>
       */
      public abstract void registerTensorBoardUrl(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto> done);

      /**
       * <code>rpc registerExecutionResult(.RegisterExecutionResultRequestProto) returns (.RegisterExecutionResultResponseProto);</code>
       */
      public abstract void registerExecutionResult(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto> done);

      /**
       * <code>rpc finishApplication(.EmptyProto) returns (.EmptyProto);</code>
       *
       * <pre>
       * Signals a AM that it can exit now.
       * </pre>
       */
      public abstract void finishApplication(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto> done);

      /**
       * <code>rpc taskExecutorHeartbeat(.HeartbeatRequestProto) returns (.HeartbeatResponseProto);</code>
       *
       * <pre>
       * To be used only by the Task Executor
       * </pre>
       */
      public abstract void taskExecutorHeartbeat(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new TensorFlowClusterService() {
        @java.lang.Override
        public  void getTaskInfos(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto> done) {
          impl.getTaskInfos(controller, request, done);
        }

        @java.lang.Override
        public  void getClusterSpec(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto> done) {
          impl.getClusterSpec(controller, request, done);
        }

        @java.lang.Override
        public  void registerWorkerSpec(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto> done) {
          impl.registerWorkerSpec(controller, request, done);
        }

        @java.lang.Override
        public  void registerTensorBoardUrl(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto> done) {
          impl.registerTensorBoardUrl(controller, request, done);
        }

        @java.lang.Override
        public  void registerExecutionResult(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto> done) {
          impl.registerExecutionResult(controller, request, done);
        }

        @java.lang.Override
        public  void finishApplication(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto> done) {
          impl.finishApplication(controller, request, done);
        }

        @java.lang.Override
        public  void taskExecutorHeartbeat(
            com.google.protobuf.RpcController controller,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto request,
            com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto> done) {
          impl.taskExecutorHeartbeat(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.getTaskInfos(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto)request);
            case 1:
              return impl.getClusterSpec(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto)request);
            case 2:
              return impl.registerWorkerSpec(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto)request);
            case 3:
              return impl.registerTensorBoardUrl(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto)request);
            case 4:
              return impl.registerExecutionResult(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto)request);
            case 5:
              return impl.finishApplication(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto)request);
            case 6:
              return impl.taskExecutorHeartbeat(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto.getDefaultInstance();
            case 1:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto.getDefaultInstance();
            case 2:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto.getDefaultInstance();
            case 3:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto.getDefaultInstance();
            case 4:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto.getDefaultInstance();
            case 5:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance();
            case 6:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.getDefaultInstance();
            case 1:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto.getDefaultInstance();
            case 2:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto.getDefaultInstance();
            case 3:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto.getDefaultInstance();
            case 4:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto.getDefaultInstance();
            case 5:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance();
            case 6:
              return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc getTaskInfos(.GetTaskInfosRequestProto) returns (.GetTaskInfosResponseProto);</code>
     */
    public abstract void getTaskInfos(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto> done);

    /**
     * <code>rpc getClusterSpec(.GetClusterSpecRequestProto) returns (.GetClusterSpecResponseProto);</code>
     */
    public abstract void getClusterSpec(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto> done);

    /**
     * <code>rpc registerWorkerSpec(.RegisterWorkerSpecRequestProto) returns (.RegisterWorkerSpecResponseProto);</code>
     */
    public abstract void registerWorkerSpec(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto> done);

    /**
     * <code>rpc registerTensorBoardUrl(.RegisterTensorBoardUrlRequestProto) returns (.RegisterTensorBoardUrlResponseProto);</code>
     */
    public abstract void registerTensorBoardUrl(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto> done);

    /**
     * <code>rpc registerExecutionResult(.RegisterExecutionResultRequestProto) returns (.RegisterExecutionResultResponseProto);</code>
     */
    public abstract void registerExecutionResult(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto> done);

    /**
     * <code>rpc finishApplication(.EmptyProto) returns (.EmptyProto);</code>
     *
     * <pre>
     * Signals a AM that it can exit now.
     * </pre>
     */
    public abstract void finishApplication(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto> done);

    /**
     * <code>rpc taskExecutorHeartbeat(.HeartbeatRequestProto) returns (.HeartbeatResponseProto);</code>
     *
     * <pre>
     * To be used only by the Task Executor
     * </pre>
     */
    public abstract void taskExecutorHeartbeat(
        com.google.protobuf.RpcController controller,
        com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto request,
        com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return com.linkedin.tony.rpc.proto.TensorFlowCluster.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.getTaskInfos(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.getClusterSpec(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.registerWorkerSpec(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.registerTensorBoardUrl(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto>specializeCallback(
              done));
          return;
        case 4:
          this.registerExecutionResult(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto>specializeCallback(
              done));
          return;
        case 5:
          this.finishApplication(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto>specializeCallback(
              done));
          return;
        case 6:
          this.taskExecutorHeartbeat(controller, (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto)request,
            com.google.protobuf.RpcUtil.<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto.getDefaultInstance();
        case 1:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto.getDefaultInstance();
        case 2:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto.getDefaultInstance();
        case 3:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto.getDefaultInstance();
        case 4:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto.getDefaultInstance();
        case 5:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance();
        case 6:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.getDefaultInstance();
        case 1:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto.getDefaultInstance();
        case 2:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto.getDefaultInstance();
        case 3:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto.getDefaultInstance();
        case 4:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto.getDefaultInstance();
        case 5:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance();
        case 6:
          return com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends com.linkedin.tony.rpc.proto.TensorFlowCluster.TensorFlowClusterService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void getTaskInfos(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.getDefaultInstance()));
      }

      public  void getClusterSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto.getDefaultInstance()));
      }

      public  void registerWorkerSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto.getDefaultInstance()));
      }

      public  void registerTensorBoardUrl(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto.getDefaultInstance()));
      }

      public  void registerExecutionResult(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto.getDefaultInstance()));
      }

      public  void finishApplication(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance()));
      }

      public  void taskExecutorHeartbeat(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto request,
          com.google.protobuf.RpcCallback<com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(6),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto.class,
            com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto getTaskInfos(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto request)
          throws com.google.protobuf.ServiceException;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto getClusterSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto request)
          throws com.google.protobuf.ServiceException;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto registerWorkerSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto request)
          throws com.google.protobuf.ServiceException;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto registerTensorBoardUrl(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto request)
          throws com.google.protobuf.ServiceException;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto registerExecutionResult(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto request)
          throws com.google.protobuf.ServiceException;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto finishApplication(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto request)
          throws com.google.protobuf.ServiceException;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto taskExecutorHeartbeat(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto getTaskInfos(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.getDefaultInstance());
      }


      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto getClusterSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetClusterSpecResponseProto.getDefaultInstance());
      }


      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto registerWorkerSpec(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterWorkerSpecResponseProto.getDefaultInstance());
      }


      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto registerTensorBoardUrl(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterTensorBoardUrlResponseProto.getDefaultInstance());
      }


      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto registerExecutionResult(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.RegisterExecutionResultResponseProto.getDefaultInstance());
      }


      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto finishApplication(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.EmptyProto.getDefaultInstance());
      }


      public com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto taskExecutorHeartbeat(
          com.google.protobuf.RpcController controller,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(6),
          controller,
          request,
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.HeartbeatResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:TensorFlowClusterService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'tensorflow_cluster_service_protos.prot" +
      "o\032$yarn_tensorflow_cluster_protos.proto2" +
      "\315\004\n\030TensorFlowClusterService\022E\n\014getTaskI" +
      "nfos\022\031.GetTaskInfosRequestProto\032\032.GetTas" +
      "kInfosResponseProto\022K\n\016getClusterSpec\022\033." +
      "GetClusterSpecRequestProto\032\034.GetClusterS" +
      "pecResponseProto\022W\n\022registerWorkerSpec\022\037" +
      ".RegisterWorkerSpecRequestProto\032 .Regist" +
      "erWorkerSpecResponseProto\022c\n\026registerTen" +
      "sorBoardUrl\022#.RegisterTensorBoardUrlRequ",
      "estProto\032$.RegisterTensorBoardUrlRespons" +
      "eProto\022f\n\027registerExecutionResult\022$.Regi" +
      "sterExecutionResultRequestProto\032%.Regist" +
      "erExecutionResultResponseProto\022-\n\021finish" +
      "Application\022\013.EmptyProto\032\013.EmptyProto\022H\n" +
      "\025taskExecutorHeartbeat\022\026.HeartbeatReques" +
      "tProto\032\027.HeartbeatResponseProtoB3\n\033com.l" +
      "inkedin.tony.rpc.protoB\021TensorFlowCluste" +
      "r\210\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}