package com.xideral.v0;

import java.io.*;

// 1. Clase serializable con control de versión y campos transient
class ProcessingReport implements Serializable {
    // Control de versión para la serialización
    private static final long serialVersionUID = 1L;

    private final String batchName;
    private final int processedItemsCount;
    
    // Este campo NO se guardará en disco (se ignorará en la serialización)
    private final transient String internalSessionId; 

    public ProcessingReport(String batchName, int processedItemsCount, String internalSessionId) {
        this.batchName = batchName;
        this.processedItemsCount = processedItemsCount;
        this.internalSessionId = internalSessionId;
    }

    public int getProcessedItemsCount() { return processedItemsCount; }
    public String getInternalSessionId() { return internalSessionId; }

    @Override
    public String toString() {
        return "ProcessingReport { batchName='" + batchName + 
               "', items=" + processedItemsCount + 
               ", internalSessionId='" + internalSessionId + "' }";
    }
}