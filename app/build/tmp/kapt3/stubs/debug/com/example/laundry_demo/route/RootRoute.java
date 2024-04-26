package com.example.laundry_demo.route;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b6\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/example/laundry_demo/route/RootRoute;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "Companion", "app_debug"})
public abstract class RootRoute {
    @org.jetbrains.annotations.NotNull
    private java.lang.String route;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String splash = "/splash";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String login = "/login";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String main = "/main";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String checkout = "/checkout";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String payment = "/payment";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String paymentSuccess = "/paymentSuccess";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String orderDetail = "/orderDetail";
    @org.jetbrains.annotations.NotNull
    public static final com.example.laundry_demo.route.RootRoute.Companion Companion = null;
    
    private RootRoute(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/laundry_demo/route/RootRoute$Companion;", "", "()V", "checkout", "", "login", "main", "orderDetail", "payment", "paymentSuccess", "splash", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}