package com.reptil.panda.euphoria

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val homeFragment = HomeFragment.newInstance()
                openFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_portfolio -> {
                val portfolioFragment = PortfolioFragment.newInstance()
                openFragment(portfolioFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_trade -> {
                val tradeFragment = TradeFragment.newInstance()
                openFragment(tradeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_education -> {
                val educationFragment = EducationFragment.newInstance()
                openFragment(educationFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}