import Foundation
import shared

class MemberList {
  
  var members: [Member] = []
  
  func updateMembers(_ newMembers: [Member]) {
    members.removeAll()
    members.append(contentsOf: newMembers)
  }
}

