package menudrawer.com.br

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = getColor(R.color.black)

        val btoMenu = findViewById<ImageView>(R.id.btoMenu)

        btoMenu.setOnClickListener {

            val navDrawer = findViewById<DrawerLayout>(R.id.navDrawer)

            if (navDrawer.isDrawerOpen(GravityCompat.START)) {
                navDrawer.closeDrawer(GravityCompat.START)
            } else {
                navDrawer.openDrawer(GravityCompat.START)
            }
        }

        //Buscar produtos pelo nome do item clicado.
        val navView = findViewById<NavigationView>(R.id.navView)
        navView.setNavigationItemSelectedListener { menuItem ->
            val title = menuItem.title
            //Toast.makeText(this, title.toString(), Toast.LENGTH_SHORT).show()
            true
        }
    }

}