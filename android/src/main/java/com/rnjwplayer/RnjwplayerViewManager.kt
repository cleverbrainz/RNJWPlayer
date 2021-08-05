package com.rnjwplayer

import android.R
import android.graphics.Color
import android.view.View
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.jwplayer.pub.view.JWPlayerView


class RnjwplayerViewManager : SimpleViewManager<View>() {
  override fun getName() = "RnjwplayerView"

  lateinit var playerView: JWPlayerView;

  override fun createViewInstance(reactContext: ThemedReactContext): View {
    return View(reactContext)
  }

  @ReactProp(name = "color")
  fun setColor(view: View, color: String) {
    view.setBackgroundColor(Color.parseColor(color))
  }
}
