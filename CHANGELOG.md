# Intellij Quasar Changelog

## [Unreleased]
## [1.4.0]
- Update `platformVersion` to `2024.2.5`
- Change since/until build to `242-252.*`
- Update dependencies

## [1.3.0]
- Update `platformVersion` to `2023.3.7`
- Change since/until build to `233-243.*` (2023.3-2024.2.*)
- Cleanup registering the `runIdeForUiTests` task
- Dependencies - upgrade `org.jetbrains.intellij.platform` to `2.0.1`
- Dependencies - upgrade `org.jetbrains.kotlin.jvm` to `1.9.25`
- Dependencies - upgrade `org.jetbrains.kotlinx.kover` to `0.8.3`
- Dependencies - upgrade `org.jetbrains.qodana` to `2024.1.9`
- Migrate to [IntelliJ Platform Gradle Plugin 2.0](https://blog.jetbrains.com/platform/2024/07/intellij-platform-gradle-plugin-2-0/).
- Update GitHub actions

## [1.2.6]
- Upgrade Gradle Wrapper to 8.6
- Update GitHub Actions
- Support new version 241

## [1.2.5]
- Upgrade Gradle Wrapper to 8.5
- Update GitHub Actions
- Support new version 233

## [1.2.4]
- Upgrade Gradle Wrapper to 8.2.1
- GitHub Actions — rearrange the Build workflow
- Update deps and extract versions into toml file
- Support new version 232

## [1.2.1]
- Dependencies - upgrade org.jetbrains.kotlin.jvm to 1.8.10 
- Dependencies - upgrade org.jetbrains.intellij to 1.13.2
- Update GitHub workflows
- Update quasar logo to v2
- Change since/until build to 211-231.* (2021.1 - 2023.1.*)
- Upgrade Gradle Wrapper to 8.0.2
- Change context for files

## [1.1.1]
- Support new Intellij Version 223.*
- Migrate from java to kotlin
- Update to the newest intellij plugin template

## [1.1.0]
- Support new Intellij Version 222.* thx stedop
- Fix shield badges

## [1.0.0]
### Added
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
- Add simple Quasar Live Templates
  - QBtn
    - QBtnGroup
    - QBtnDropdown
  - QAvatar, QLayout, QCard, QSeparator, QBreadcrumbs, QBar
  - QBanner, QPageScroller, QPageSticky, QPage, QPageContainer
  - QFooter, QHeader, QDrawer, QCard, QImg, QMarkupTable, QIcon
  - QChatMessage, QChip, QColor, QEditor, QInfiniteScroll, QExpansionItem
  - QDialog, QForm, QInput, QToggle, QFilePicker, QRadio, QCheckbox
  - QSelect, QSlider, QRange, QTimePicker, QDatePicker, QUploader
  - QVideo, QTree, QTooltip, QSplitter, QSpace, QStepper
  - QVirtualScroll, QSpinners, QSkeleton, QTabs, QTable, QSlideItem
  - QParallax, QPagination, QResizeObserver, QNoSSR, QLinearProgress
  - QKnob, QIntersection, QInnerLoading, QBtnToggle, QCarousel 
  - QCircularProgress, QList, QMenu
