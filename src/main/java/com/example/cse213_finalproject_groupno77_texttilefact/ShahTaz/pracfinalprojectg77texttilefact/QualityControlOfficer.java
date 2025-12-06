package com.example.pracfinalprojectg77texttilefact;

import java.time.LocalDate;
import java.util.List;

public class QualityControlOfficer {

    public static class Photo {
        private String defectType;
        private String comment;
        private String photoPath;

        public Photo(String defectType, String comment, String photoPath) {
            this.defectType = defectType;
            this.comment = comment;
            this.photoPath = photoPath;
        }
    }

    public static class BatchItem {
        private String batch;
        private String result;
        private String photos;

        public BatchItem(String batch, String result, String photos) {
            this.batch = batch;
            this.result = result;
            this.photos = photos;
        }
    }

    public static class CheckListItem {
        private String date;
        private int sl;
        private String existingCheckList;
        private String colour;
        private String stitching;
        private String size;

        public CheckListItem(String date, int sl, String existingCheckList,
                             String colour, String stitching, String size) {
            this.date = date;
            this.sl = sl;
            this.existingCheckList = existingCheckList;
            this.colour = colour;
            this.stitching = stitching;
            this.size = size;
        }
    }

    public static class Message {
        private String recipient;
        private String message;
        private String attachment;

        public Message(String recipient, String message, String attachment) {
            this.recipient = recipient;
            this.message = message;
            this.attachment = attachment;
        }
    }

    public static class InspectionRecord {
        private String productCode;
        private int defectCount;
        private double fabricWidth;
        private String shadeVariation;
        private String productionLine;
        private String notes;

        public InspectionRecord(String productCode, int defectCount, double fabricWidth,
                                String shadeVariation, String productionLine, String notes) {
            this.productCode = productCode;
            this.defectCount = defectCount;
            this.fabricWidth = fabricWidth;
            this.shadeVariation = shadeVariation;
            this.productionLine = productionLine;
            this.notes = notes;
        }
    }

    public static class AlertItem {
        private String date;
        private String alertList;
        private int sl;

        public AlertItem(String date, String alertList, int sl) {
            this.date = date;
            this.alertList = alertList;
            this.sl = sl;
        }
    }

    public static class Report {
        private LocalDate date;
        private String production;
        private String inspector;
        private String selectedOption;

        public Report(LocalDate date, String production, String inspector, String selectedOption) {
            this.date = date;
            this.production = production;
            this.inspector = inspector;
            this.selectedOption = selectedOption;
        }
    }

    private List<Photo> photos;
    private List<BatchItem> batches;
    private List<CheckListItem> checkLists;
    private List<Message> messages;
    private List<InspectionRecord> inspectionRecords;
    private List<AlertItem> alerts;
    private List<Report> reports;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<BatchItem> getBatches() {
        return batches;
    }

    public void setBatches(List<BatchItem> batches) {
        this.batches = batches;
    }

    public List<CheckListItem> getCheckLists() {
        return checkLists;
    }

    public void setCheckLists(List<CheckListItem> checkLists) {
        this.checkLists = checkLists;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<InspectionRecord> getInspectionRecords() {
        return inspectionRecords;
    }

    public void setInspectionRecords(List<InspectionRecord> inspectionRecords) {
        this.inspectionRecords = inspectionRecords;
    }

    public List<AlertItem> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<AlertItem> alerts) {
        this.alerts = alerts;
    }

    public List<Report> getReports() {
        return reports;
    }

    @Override
    public String toString() {
        return "QualityControlOfficer{" +
                "photos=" + photos +
                ", batches=" + batches +
                ", checkLists=" + checkLists +
                ", messages=" + messages +
                ", inspectionRecords=" + inspectionRecords +
                ", alerts=" + alerts +
                ", reports=" + reports +
                '}';
    }

    public QualityControlOfficer(List<Photo> photos, List<BatchItem> batches, List<CheckListItem> checkLists, List<Message> messages, List<InspectionRecord> inspectionRecords, List<AlertItem> alerts, List<Report> reports) {
        this.photos = photos;
        this.batches = batches;
        this.checkLists = checkLists;
        this.messages = messages;
        this.inspectionRecords = inspectionRecords;
        this.alerts = alerts;
        this.reports = reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }
}

