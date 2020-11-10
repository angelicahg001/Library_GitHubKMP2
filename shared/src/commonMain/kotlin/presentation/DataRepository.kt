package com.worldmobile.presentation

import com.worldmobile.model.Member


interface DataRepository {
  val members: List<Member>?
  var onRefreshListeners: List<() -> Unit>

  suspend fun update()
}
