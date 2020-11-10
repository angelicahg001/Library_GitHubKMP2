package com.worldmobile

import android.os.Build

actual fun platformName(): String {
  return "Android ${Build.VERSION.RELEASE}"
}
