package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.FragmentsUser.ActivityFragment
import com.example.myapplication.FragmentsUser.DashboardFragment
import com.example.myapplication.FragmentsUser.HomeFragment
import com.example.myapplication.FragmentsUser.ProfileFragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {
    lateinit var homeFragment: HomeFragment
    lateinit var activityFragment: ActivityFragment
    lateinit var dashboardFragment: DashboardFragment
    lateinit var profileFragment: ProfileFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // chip navigation init function
        chip_navigation_bottom_menu_init()

    }

    fun chip_navigation_bottom_menu_init(){
        // chip navigation bar init
        val chipNavigation : ChipNavigationBar = findViewById(R.id.chip_navigation_bar)
        // when app is open default homeFragment is shown
        /*************** start ********************/
        chipNavigation.setItemSelected(R.id.home)
        homeFragment =
            HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
        /*************** end ********************/

        // onclick listner for chic navigation menu when clicked frame layout in main activity is replaced by fragements
        /*************** start ********************/
        chipNavigation.setOnItemSelectedListener{id ->
            when (id) {
                R.id.home -> {
                    homeFragment =
                        HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.activity -> {
                    activityFragment =
                        ActivityFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, activityFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.dashboard -> {
                    dashboardFragment =
                        DashboardFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, dashboardFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.profile -> {
                    profileFragment =
                        ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
            }
        }
    }
    /*************** end ********************/
}
