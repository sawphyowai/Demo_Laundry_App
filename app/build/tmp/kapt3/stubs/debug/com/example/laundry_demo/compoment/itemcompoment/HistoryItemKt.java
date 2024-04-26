package com.example.laundry_demo.compoment.itemcompoment;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.laundry_demo.enums.LaundryStatus;
import com.example.laundry_demo.enums.WashingStatus;
import com.example.laundry_demo.history.HistoryDataVO;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\tH\u0007\u00a8\u0006\f"}, d2 = {"HistoryItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lcom/example/laundry_demo/history/HistoryDataVO;", "HistoryItemPreview", "HistoryProgress", "selectWashing", "Lcom/example/laundry_demo/enums/WashingStatus;", "HistoryProgressPreview", "HistoryStatus", "app_debug"})
public final class HistoryItemKt {
    
    @androidx.compose.runtime.Composable
    public static final void HistoryItem(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.example.laundry_demo.history.HistoryDataVO item) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HistoryProgress(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.enums.WashingStatus selectWashing, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void HistoryStatus(@org.jetbrains.annotations.NotNull
    com.example.laundry_demo.enums.WashingStatus item) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void HistoryProgressPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    public static final void HistoryItemPreview() {
    }
}