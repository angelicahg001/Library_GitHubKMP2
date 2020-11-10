package com.worldmobile.presentation

import com.worldmobile.model.Member


interface MembersView : BaseView {
  var isUpdating: Boolean
  fun onUpdate(members: List<Member>)
}
