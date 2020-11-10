import UIKit
import shared

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
  
  public lazy var dataRepository = { MembersDataRepository(api: GitHubApi()) }()

  var window: UIWindow?

  static var appDelegate: AppDelegate {
    return UIApplication.shared.delegate as! AppDelegate
  }
}

