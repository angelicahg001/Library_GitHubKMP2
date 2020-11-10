package com.worldmobile.model

import com.worldmobile.api.GitHubApi
import com.worldmobile.api.UpdateProblem
import com.worldmobile.presentation.DataRepository


class MembersDataRepository(private val api: GitHubApi) : DataRepository {

  override var members: List<Member>? = null

  override var onRefreshListeners: List<() -> Unit> = emptyList()

  override suspend fun update() {
    val newMembers = try {
      api.getMembers()
    } catch (cause: Throwable) {
      throw UpdateProblem()
    }

    if (newMembers != members) {
      members = newMembers
      callRefreshListeners()
    }
  }


  private fun callRefreshListeners() {
    onRefreshListeners.forEach { it() }
  }
}
