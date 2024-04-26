package com.example.laundry_demo.enums;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/example/laundry_demo/enums/WashingStatus;", "", "laundryStatus", "Lcom/example/laundry_demo/enums/LaundryStatus;", "label", "", "(Lcom/example/laundry_demo/enums/LaundryStatus;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getLaundryStatus", "()Lcom/example/laundry_demo/enums/LaundryStatus;", "Cleaning", "Delivery", "Drying", "Washing", "Lcom/example/laundry_demo/enums/WashingStatus$Cleaning;", "Lcom/example/laundry_demo/enums/WashingStatus$Delivery;", "Lcom/example/laundry_demo/enums/WashingStatus$Drying;", "Lcom/example/laundry_demo/enums/WashingStatus$Washing;", "app_debug"})
public abstract class WashingStatus {
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.enums.LaundryStatus laundryStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String label = null;
    
    private WashingStatus(com.example.laundry_demo.enums.LaundryStatus laundryStatus, java.lang.String label) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.laundry_demo.enums.LaundryStatus getLaundryStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/laundry_demo/enums/WashingStatus$Cleaning;", "Lcom/example/laundry_demo/enums/WashingStatus;", "status", "Lcom/example/laundry_demo/enums/LaundryStatus;", "name", "", "(Lcom/example/laundry_demo/enums/LaundryStatus;Ljava/lang/String;)V", "app_debug"})
    public static final class Cleaning extends com.example.laundry_demo.enums.WashingStatus {
        @org.jetbrains.annotations.NotNull
        private final com.example.laundry_demo.enums.LaundryStatus status = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        public Cleaning(@org.jetbrains.annotations.NotNull
        com.example.laundry_demo.enums.LaundryStatus status, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/laundry_demo/enums/WashingStatus$Delivery;", "Lcom/example/laundry_demo/enums/WashingStatus;", "status", "Lcom/example/laundry_demo/enums/LaundryStatus;", "name", "", "(Lcom/example/laundry_demo/enums/LaundryStatus;Ljava/lang/String;)V", "app_debug"})
    public static final class Delivery extends com.example.laundry_demo.enums.WashingStatus {
        @org.jetbrains.annotations.NotNull
        private final com.example.laundry_demo.enums.LaundryStatus status = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        public Delivery(@org.jetbrains.annotations.NotNull
        com.example.laundry_demo.enums.LaundryStatus status, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/laundry_demo/enums/WashingStatus$Drying;", "Lcom/example/laundry_demo/enums/WashingStatus;", "status", "Lcom/example/laundry_demo/enums/LaundryStatus;", "name", "", "(Lcom/example/laundry_demo/enums/LaundryStatus;Ljava/lang/String;)V", "app_debug"})
    public static final class Drying extends com.example.laundry_demo.enums.WashingStatus {
        @org.jetbrains.annotations.NotNull
        private final com.example.laundry_demo.enums.LaundryStatus status = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        public Drying(@org.jetbrains.annotations.NotNull
        com.example.laundry_demo.enums.LaundryStatus status, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/laundry_demo/enums/WashingStatus$Washing;", "Lcom/example/laundry_demo/enums/WashingStatus;", "status", "Lcom/example/laundry_demo/enums/LaundryStatus;", "name", "", "(Lcom/example/laundry_demo/enums/LaundryStatus;Ljava/lang/String;)V", "app_debug"})
    public static final class Washing extends com.example.laundry_demo.enums.WashingStatus {
        @org.jetbrains.annotations.NotNull
        private final com.example.laundry_demo.enums.LaundryStatus status = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        public Washing(@org.jetbrains.annotations.NotNull
        com.example.laundry_demo.enums.LaundryStatus status, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
        }
    }
}