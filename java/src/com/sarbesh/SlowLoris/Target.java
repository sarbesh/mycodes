package com.sarbesh.SlowLoris;

public class Target {
    private String target;
    private int port;
    private int connections;
    private int timer;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getConnections() {
        return connections;
    }

    public void setConnections(int connections) {
        this.connections = connections;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public Target(String target, int port, int connections, int timer) {
        this.target = target;
        this.port = port;
        this.connections = connections;
        this.timer = timer;
    }

    public Target() {
    }
}
