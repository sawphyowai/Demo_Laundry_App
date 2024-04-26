package com.example.laundry_demo.orderdetail;

import com.example.laundry_demo.enums.LaundryStatus;
import com.example.laundry_demo.enums.WashingStatus;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/laundry_demo/orderdetail/OrderDetailState;", "", "list", "", "Lcom/example/laundry_demo/enums/WashingStatus;", "order", "Lcom/example/laundry_demo/orderdetail/OrderDetailDataVO;", "(Ljava/util/List;Lcom/example/laundry_demo/orderdetail/OrderDetailDataVO;)V", "getList", "()Ljava/util/List;", "getOrder", "()Lcom/example/laundry_demo/orderdetail/OrderDetailDataVO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_debug"})
public final class OrderDetailState {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.laundry_demo.enums.WashingStatus> list = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.laundry_demo.orderdetail.OrderDetailDataVO order = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.laundry_demo.orderdetail.OrderDetailState.Companion Companion = null;
    
    public OrderDetailState(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.example.laundry_demo.enums.WashingStatus> list, @org.jetbrains.annotations.NotNull
    com.example.laundry_demo.orderdetail.OrderDetailDataVO order) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.laundry_demo.enums.WashingStatus> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.laundry_demo.orderdetail.OrderDetailDataVO getOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.laundry_demo.enums.WashingStatus> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.laundry_demo.orderdetail.OrderDetailDataVO component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.laundry_demo.orderdetail.OrderDetailState copy(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.example.laundry_demo.enums.WashingStatus> list, @org.jetbrains.annotations.NotNull
    com.example.laundry_demo.orderdetail.OrderDetailDataVO order) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/laundry_demo/orderdetail/OrderDetailState$Companion;", "", "()V", "idle", "Lcom/example/laundry_demo/orderdetail/OrderDetailState;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.laundry_demo.orderdetail.OrderDetailState idle() {
            return null;
        }
    }
}