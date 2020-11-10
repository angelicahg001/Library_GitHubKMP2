package com.worldmobile.githubkmp

import android.app.Application
import com.worldmobile.api.GitHubApi
import com.worldmobile.model.MembersDataRepository
import com.worldmobile.presentation.DataRepository


class GitHubKMPApplication : Application() {

  val dataRepository: DataRepository by lazy {
    MembersDataRepository(GitHubApi())
  }
}
