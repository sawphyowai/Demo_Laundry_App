package com.example.laundry_demo.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laundry_demo.route.MainRoute
import com.example.laundry_demo.ui.theme.Laundry_demoTheme
import com.example.laundry_demo.R


@Composable
fun MainBottomNavigation(
    routes:List<MainRoute>,
    currentRoute:() -> String?,
    onTopItem:(MainRoute) -> Unit,

) {
    BottomAppBar(
        modifier=Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary.copy(alpha=0.05f)
    ) {
        routes.forEach {screen->
            NavigationBarItem(
                selected = currentRoute()==screen.route ,
                onClick = {
                    onTopItem(screen)
                }
                ,icon = {
                    Icon(painter = painterResource(id = screen.icon) ,
                        contentDescription =screen.label)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = Color.Gray,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp)
                ),
                label = {
                    Text(text = screen.label)
                }
                )
        }
    }
}

@Preview
@Composable
fun MainBottomNavigationPreview() {
    Laundry_demoTheme {
        MainBottomNavigation(
            routes= listOf(
                MainRoute.Home("Home"),
                MainRoute.Home("Chat"),
                MainRoute.Home("History"),
                MainRoute.Home("Profile"),
            ),
            currentRoute = {
                MainRoute.Home("Home").route
            },
            onTopItem={}
        )
    }
}