package com.statuswa.fasttalkchat.toolsdownload.model.FBStoryModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class NodeModel implements Serializable {
    @SerializedName("node")
    private NodeDataModel nodeDataModel;

    public NodeDataModel getNodeDataModel() {
        return nodeDataModel;
    }

    public void setNodeDataModel(NodeDataModel nodeDataModel) {
        this.nodeDataModel = nodeDataModel;
    }

}
