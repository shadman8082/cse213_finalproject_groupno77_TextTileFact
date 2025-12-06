package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class Report {
    private int reportId;
    private String reportType; // "Logistics", "Performance", "Vehicle", "Shipment", "Financial"
    private LocalDate periodFrom;
    private LocalDate periodTo;
    private LocalDateTime generatedDate;
    private String generatedBy;
    private Map<String, Object> data; // Flexible data storage
    private String summary;
    private String fileFormat; // "PDF", "CSV", "HTML"
    private String filePath;

    public Report(int reportId, String reportType, LocalDate periodFrom, LocalDate periodTo, LocalDateTime generatedDate, String generatedBy, Map<String, Object> data, String summary, String fileFormat, String filePath) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.periodFrom = periodFrom;
        this.periodTo = periodTo;
        this.generatedDate = generatedDate;
        this.generatedBy = generatedBy;
        this.data = data;
        this.summary = summary;
        this.fileFormat = fileFormat;
        this.filePath = filePath;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(LocalDate periodFrom) {
        this.periodFrom = periodFrom;
    }

    public LocalDate getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(LocalDate periodTo) {
        this.periodTo = periodTo;
    }

    public LocalDateTime getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDateTime generatedDate) {
        this.generatedDate = generatedDate;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}

