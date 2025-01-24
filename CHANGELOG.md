## [3.2.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.1.2...3.2.0) (2025-01-24)

### Dependency updates

* **api-deps:** update dependency java to v23.0.2+7 ([#799](https://github.com/DanySK/multi-jvm-test-plugin/issues/799)) ([635435b](https://github.com/DanySK/multi-jvm-test-plugin/commit/635435bd32ae41fc460976c31b9f08f9febe2e6b))
* **deps:** drop mockito ([#790](https://github.com/DanySK/multi-jvm-test-plugin/issues/790)) ([0767bfd](https://github.com/DanySK/multi-jvm-test-plugin/commit/0767bfde726479b8448e05cd8ab0ad24f4d6cca8))
* **deps:** update dependency com.mohamedrejeb.ksoup:ksoup-html to v0.5.0 ([#788](https://github.com/DanySK/multi-jvm-test-plugin/issues/788)) ([c50086b](https://github.com/DanySK/multi-jvm-test-plugin/commit/c50086bfb2e3b41e57c8310502d69be4d700086c))
* **deps:** update dependency org.mockito:mockito-core to v5.15.2 ([#789](https://github.com/DanySK/multi-jvm-test-plugin/issues/789)) ([5feb2d2](https://github.com/DanySK/multi-jvm-test-plugin/commit/5feb2d22ee8750ec449960da83277016f28de245))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#793](https://github.com/DanySK/multi-jvm-test-plugin/issues/793)) ([2154be7](https://github.com/DanySK/multi-jvm-test-plugin/commit/2154be71a3fc2ec886d29f6a12bfa5e7860d2d3c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#796](https://github.com/DanySK/multi-jvm-test-plugin/issues/796)) ([eca2e4c](https://github.com/DanySK/multi-jvm-test-plugin/commit/eca2e4c505255f2662034f785830dd87c0d21bfc))
* **deps:** update node.js to 22.13 ([#791](https://github.com/DanySK/multi-jvm-test-plugin/issues/791)) ([e7e0a76](https://github.com/DanySK/multi-jvm-test-plugin/commit/e7e0a76ce3436c21c59f55d8a321bff51f905aa0))
* **deps:** update plugin com.gradle.develocity to v3.19.1 ([#798](https://github.com/DanySK/multi-jvm-test-plugin/issues/798)) ([4d372ea](https://github.com/DanySK/multi-jvm-test-plugin/commit/4d372eade56c6290cc028048a565fc5fb8f6a3c0))
* **deps:** update plugin multijvmtesting to v3.1.2 ([#787](https://github.com/DanySK/multi-jvm-test-plugin/issues/787)) ([199dd10](https://github.com/DanySK/multi-jvm-test-plugin/commit/199dd100de1cba7052f4acda59522f795d11a721))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.0 ([#795](https://github.com/DanySK/multi-jvm-test-plugin/issues/795)) ([9df616b](https://github.com/DanySK/multi-jvm-test-plugin/commit/9df616bacc517ca5701e647b8bebe6af1749ef7e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.7.1 ([#797](https://github.com/DanySK/multi-jvm-test-plugin/issues/797)) ([e2871be](https://github.com/DanySK/multi-jvm-test-plugin/commit/e2871be7cdfd4bc1b3056f17e8fec90d184712fe))

## [3.1.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.1.1...3.1.2) (2024-12-27)

### Dependency updates

* **deps:** update plugin multijvmtesting to v3.1.1 ([#786](https://github.com/DanySK/multi-jvm-test-plugin/issues/786)) ([7626182](https://github.com/DanySK/multi-jvm-test-plugin/commit/762618242c4b076295aa8bdba4b74cb1ceaa9078))

### Bug Fixes

* disable KMP testing on multiple JVMs by default ([1c22848](https://github.com/DanySK/multi-jvm-test-plugin/commit/1c22848d56ac482ca2ec6b0ead400feefce25738))

## [3.1.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.1.0...3.1.1) (2024-12-27)

### Bug Fixes

* assume kotlin multiplatform if there are no test classes directories ([e087bb9](https://github.com/DanySK/multi-jvm-test-plugin/commit/e087bb954432b6450b9a67d91190905c6c720536))

### Style improvements

* prefer `associateWith` to `associate` ([ecb1211](https://github.com/DanySK/multi-jvm-test-plugin/commit/ecb1211281abedeb1e5a6d3350a3312eae3ef54e))

## [3.1.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.0.3...3.1.0) (2024-12-27)

### Features

* add experimental support for kotlin multiplatform ([#784](https://github.com/DanySK/multi-jvm-test-plugin/issues/784)) ([9ad6521](https://github.com/DanySK/multi-jvm-test-plugin/commit/9ad652147eb352c11265b9eab5920fed64dd5f0f))

## [3.0.3](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.0.2...3.0.3) (2024-12-27)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#783](https://github.com/DanySK/multi-jvm-test-plugin/issues/783)) ([07c64c6](https://github.com/DanySK/multi-jvm-test-plugin/commit/07c64c6e1990d26eb53645c85373c634c4a69641))
* **deps:** update plugin multijvmtesting to v3.0.2 ([#780](https://github.com/DanySK/multi-jvm-test-plugin/issues/780)) ([be27630](https://github.com/DanySK/multi-jvm-test-plugin/commit/be27630e8bbc09bb4d29483919adf3d50add18ef))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.18 ([#782](https://github.com/DanySK/multi-jvm-test-plugin/issues/782)) ([13c21f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/13c21f5725f9fc73f4171307e11bb55ce2410f83))
* **deps:** update plugin publishoncentral to v7.0.4 ([#781](https://github.com/DanySK/multi-jvm-test-plugin/issues/781)) ([2e56883](https://github.com/DanySK/multi-jvm-test-plugin/commit/2e56883d43918c19a548392ff06dc646e68fc8e2))

### Bug Fixes

* remove println ([dcfa6bb](https://github.com/DanySK/multi-jvm-test-plugin/commit/dcfa6bb5a5267d55da537633732be8c46ae3b196))

## [3.0.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.0.1...3.0.2) (2024-12-20)

### Dependency updates

* **core-deps:** update dependency gradle to v8.12 ([#779](https://github.com/DanySK/multi-jvm-test-plugin/issues/779)) ([aa1a4e1](https://github.com/DanySK/multi-jvm-test-plugin/commit/aa1a4e15cb3f5f6b0915fdf542c02df1716de5f9))
* **deps:** update plugin multijvmtesting to v3.0.1 ([#771](https://github.com/DanySK/multi-jvm-test-plugin/issues/771)) ([129b932](https://github.com/DanySK/multi-jvm-test-plugin/commit/129b93204385c56b290558dbbdce5c17a98fb61d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.17 ([#772](https://github.com/DanySK/multi-jvm-test-plugin/issues/772)) ([eb484e7](https://github.com/DanySK/multi-jvm-test-plugin/commit/eb484e7dfdccf193a4ce38fe959897851f35b2bd))
* **deps:** update plugin publishoncentral to v7.0.1 ([#773](https://github.com/DanySK/multi-jvm-test-plugin/issues/773)) ([e6e8ce4](https://github.com/DanySK/multi-jvm-test-plugin/commit/e6e8ce4a7cfae3f9e875ac7159af0219f327cc5b))
* **deps:** update plugin publishoncentral to v7.0.2 ([#777](https://github.com/DanySK/multi-jvm-test-plugin/issues/777)) ([8f98ef6](https://github.com/DanySK/multi-jvm-test-plugin/commit/8f98ef6d8ded0b7ca794ede8d2a58ad61a8d21c9))
* **deps:** update plugin publishoncentral to v7.0.3 ([#778](https://github.com/DanySK/multi-jvm-test-plugin/issues/778)) ([808a152](https://github.com/DanySK/multi-jvm-test-plugin/commit/808a152a15f530b183b83e1500abab0b4fb17ad8))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.26 ([#774](https://github.com/DanySK/multi-jvm-test-plugin/issues/774)) ([f462433](https://github.com/DanySK/multi-jvm-test-plugin/commit/f4624332fb1cfc2355b8a33f0270446adb385135))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.27 ([#775](https://github.com/DanySK/multi-jvm-test-plugin/issues/775)) ([3d87000](https://github.com/DanySK/multi-jvm-test-plugin/commit/3d870001656e48de3a69659214a22db055d215e7))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.28 ([#776](https://github.com/DanySK/multi-jvm-test-plugin/issues/776)) ([deaf385](https://github.com/DanySK/multi-jvm-test-plugin/commit/deaf38554afd9d1bc4cdc45bc78dab3d95e3efc0))

## [3.0.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/3.0.0...3.0.1) (2024-12-16)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.116 ([#764](https://github.com/DanySK/multi-jvm-test-plugin/issues/764)) ([f5a1323](https://github.com/DanySK/multi-jvm-test-plugin/commit/f5a1323146af35d286c308d354136a456f2697c1))
* **deps:** update plugin com.gradle.develocity to v3.19 ([#769](https://github.com/DanySK/multi-jvm-test-plugin/issues/769)) ([af91734](https://github.com/DanySK/multi-jvm-test-plugin/commit/af917345af83db4d6e6f5e14110f83eae2d3dcbf))
* **deps:** update plugin kotlin-qa to v0.78.0 ([#767](https://github.com/DanySK/multi-jvm-test-plugin/issues/767)) ([43cd8b0](https://github.com/DanySK/multi-jvm-test-plugin/commit/43cd8b030c7824d9ce5f5399ae4f2294bceaf5c4))
* **deps:** update plugin multijvmtesting to v2.0.1 ([#761](https://github.com/DanySK/multi-jvm-test-plugin/issues/761)) ([e6b5549](https://github.com/DanySK/multi-jvm-test-plugin/commit/e6b5549d003836c56f22d5590663230f02cdc1e2))
* **deps:** update plugin multijvmtesting to v3 ([#762](https://github.com/DanySK/multi-jvm-test-plugin/issues/762)) ([ffe52e8](https://github.com/DanySK/multi-jvm-test-plugin/commit/ffe52e8796695b557f78c7373a1a26648856b891))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.16 ([#768](https://github.com/DanySK/multi-jvm-test-plugin/issues/768)) ([c6e03d6](https://github.com/DanySK/multi-jvm-test-plugin/commit/c6e03d64a20c32dfa0ca3c5f706718c6d07d1684))
* **deps:** update plugin publishoncentral to v6.0.1 ([#763](https://github.com/DanySK/multi-jvm-test-plugin/issues/763)) ([6f3ade1](https://github.com/DanySK/multi-jvm-test-plugin/commit/6f3ade1bbe02ebbcedf45e62edc1ffbfe002cf77))
* **deps:** update plugin publishoncentral to v7 ([#765](https://github.com/DanySK/multi-jvm-test-plugin/issues/765)) ([8f9619d](https://github.com/DanySK/multi-jvm-test-plugin/commit/8f9619d910737f18d78edbd167788199b6f0b775))

### Documentation

* **deps:** update dependency org.jetbrains.dokka to v2 ([#770](https://github.com/DanySK/multi-jvm-test-plugin/issues/770)) ([7479646](https://github.com/DanySK/multi-jvm-test-plugin/commit/747964670b92bd8f99442a03f5ebf6fc3b37b294))

### Build and continuous integration

* disambiguate the drop task name ([#766](https://github.com/DanySK/multi-jvm-test-plugin/issues/766)) ([4322b1b](https://github.com/DanySK/multi-jvm-test-plugin/commit/4322b1b3450aa41770637bb49481e331aaea303f))
* **release:** disambiguate the release task name ([645d8e0](https://github.com/DanySK/multi-jvm-test-plugin/commit/645d8e00ad0fdac90753b4f7dfbd9fafb3d58cc9))

## [3.0.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/2.0.1...3.0.0) (2024-12-06)

### ⚠ BREAKING CHANGES

* do not apply the java plugin forcibly, react to applications of java or kotlin-jvm (#760)

### Features

* do not apply the java plugin forcibly, react to applications of java or kotlin-jvm ([#760](https://github.com/DanySK/multi-jvm-test-plugin/issues/760)) ([887df71](https://github.com/DanySK/multi-jvm-test-plugin/commit/887df718e712d74f8e5331d52e989c2e81c0b66a))

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.77.1 ([#757](https://github.com/DanySK/multi-jvm-test-plugin/issues/757)) ([d860c1d](https://github.com/DanySK/multi-jvm-test-plugin/commit/d860c1d0e46244e8464732b86a99bb3c2f9b62e0))

### Build and continuous integration

* do not retry releases on failure ([8aae897](https://github.com/DanySK/multi-jvm-test-plugin/commit/8aae897a46d2cfd7612b05f7810d83d098c8012c))

## [2.0.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/2.0.0...2.0.1) (2024-12-06)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.1.0 ([#750](https://github.com/DanySK/multi-jvm-test-plugin/issues/750)) ([ca3af66](https://github.com/DanySK/multi-jvm-test-plugin/commit/ca3af66a437592ec8d6b83e23fb50e9d60180426))
* **deps:** update plugin kotlin-qa to v0.77.0 ([0e4f533](https://github.com/DanySK/multi-jvm-test-plugin/commit/0e4f5331221a19145bf27ca6abf67826b2e309f0))
* **deps:** update plugin multijvmtesting to v2 ([#755](https://github.com/DanySK/multi-jvm-test-plugin/issues/755)) ([8070d4f](https://github.com/DanySK/multi-jvm-test-plugin/commit/8070d4f5a06f69d06e814bb040ac657637b54825))

### Bug Fixes

* fix the LTS version detection ([be7d53f](https://github.com/DanySK/multi-jvm-test-plugin/commit/be7d53f6d4229bf9cd07a2f5d22d1f4983caa2b6))

### Performance improvements

* compute the latest LTS more efficiently ([8c40e2e](https://github.com/DanySK/multi-jvm-test-plugin/commit/8c40e2ef398b716e0241bff431544c403b1ab695))

### Build and continuous integration

* bind ubuntu to 24.04 ([09118cb](https://github.com/DanySK/multi-jvm-test-plugin/commit/09118cb830ebda90d5be70f6aa7f8e76dc3f380a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.24 ([#758](https://github.com/DanySK/multi-jvm-test-plugin/issues/758)) ([393621a](https://github.com/DanySK/multi-jvm-test-plugin/commit/393621a035f2cfff10ffcdf8374e0a5b4a922c3a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.25 ([#759](https://github.com/DanySK/multi-jvm-test-plugin/issues/759)) ([b868f1f](https://github.com/DanySK/multi-jvm-test-plugin/commit/b868f1f8bd773429dc39829af2a9344926bc7234))

### Style improvements

* switch property name to SCREAMING_SNAKE_CASE ([6f526b9](https://github.com/DanySK/multi-jvm-test-plugin/commit/6f526b9e04352bc294df865028fdebc3f8db9abb))
* switch property name to SCREAMING_SNAKE_CASE ([f60b9e0](https://github.com/DanySK/multi-jvm-test-plugin/commit/f60b9e0cfb4d8b634cc58a4238db7d7dd08bcc55))

## [2.0.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.3.2...2.0.0) (2024-12-05)

### ⚠ BREAKING CHANGES

* switch property name to SCREAMING_SNAKE_CASE

### Dependency updates

* **deps:** update node.js to 22.12 ([#754](https://github.com/DanySK/multi-jvm-test-plugin/issues/754)) ([3022e06](https://github.com/DanySK/multi-jvm-test-plugin/commit/3022e062479bd72364e36b84b6af049fd5f13ea0))
* **deps:** update plugin kotlin-qa to v0.70.2 ([#743](https://github.com/DanySK/multi-jvm-test-plugin/issues/743)) ([8cf995c](https://github.com/DanySK/multi-jvm-test-plugin/commit/8cf995c0a18dc92cf16a8bccf7c85be3b53474c0))
* **deps:** update plugin multijvmtesting to v1.3.2 ([#740](https://github.com/DanySK/multi-jvm-test-plugin/issues/740)) ([03431a0](https://github.com/DanySK/multi-jvm-test-plugin/commit/03431a0db53725f7fb5fa3399be5cf63e9d73b2d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.15 ([#741](https://github.com/DanySK/multi-jvm-test-plugin/issues/741)) ([c8e4ff3](https://github.com/DanySK/multi-jvm-test-plugin/commit/c8e4ff3323921ae682c12d6f6796b4ce87596940))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.9.0 ([#752](https://github.com/DanySK/multi-jvm-test-plugin/issues/752)) ([56804fd](https://github.com/DanySK/multi-jvm-test-plugin/commit/56804fd5ab4388309819077fff81eb273b6465c5))
* **deps:** update plugin publishoncentral to v5.1.11 ([#742](https://github.com/DanySK/multi-jvm-test-plugin/issues/742)) ([d81bdc3](https://github.com/DanySK/multi-jvm-test-plugin/commit/d81bdc3332350050b5504948d33b43a5890e8089))
* **deps:** update plugin publishoncentral to v6 ([#753](https://github.com/DanySK/multi-jvm-test-plugin/issues/753)) ([4805e16](https://github.com/DanySK/multi-jvm-test-plugin/commit/4805e161737f52d7d0b18c482e063fd553a16eba))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.23 ([#744](https://github.com/DanySK/multi-jvm-test-plugin/issues/744)) ([81355df](https://github.com/DanySK/multi-jvm-test-plugin/commit/81355df1975baa14aa8f971f020d034746e536a3))
* drop unreleased staging repos on OSSRH ([6ed5eb0](https://github.com/DanySK/multi-jvm-test-plugin/commit/6ed5eb0bdfe217c8487442151399948c1d1b6cb5))
* improve the workflow cancelling policies ([a225d48](https://github.com/DanySK/multi-jvm-test-plugin/commit/a225d48a03dc229e8bf3346995d97529f63cafaa))

### Style improvements

* switch property name to SCREAMING_SNAKE_CASE ([9934013](https://github.com/DanySK/multi-jvm-test-plugin/commit/9934013b00528bc3222c673709628829c0a260fa))

## [1.3.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.3.1...1.3.2) (2024-11-20)

### Dependency updates

* **core-deps:** update dependency gradle to v8.11.1 ([#739](https://github.com/DanySK/multi-jvm-test-plugin/issues/739)) ([a9e74e5](https://github.com/DanySK/multi-jvm-test-plugin/commit/a9e74e51262301fcc36c1fe12d25d680cf71e651))
* **deps:** update plugin kotlin-qa to v0.70.1 ([#733](https://github.com/DanySK/multi-jvm-test-plugin/issues/733)) ([16ceff7](https://github.com/DanySK/multi-jvm-test-plugin/commit/16ceff74b65c11d46c8d5f3ac4aa8b6fb5ca0856))
* **deps:** update plugin multijvmtesting to v1.3.1 ([#734](https://github.com/DanySK/multi-jvm-test-plugin/issues/734)) ([cadcefd](https://github.com/DanySK/multi-jvm-test-plugin/commit/cadcefd826e765408f5c41391658ccdc32f089ab))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.14 ([#736](https://github.com/DanySK/multi-jvm-test-plugin/issues/736)) ([2cf66b1](https://github.com/DanySK/multi-jvm-test-plugin/commit/2cf66b1a526a6d72c7961429454feb15d82a1018))
* **deps:** update plugin publishoncentral to v5.1.10 ([#735](https://github.com/DanySK/multi-jvm-test-plugin/issues/735)) ([57c9ef0](https://github.com/DanySK/multi-jvm-test-plugin/commit/57c9ef0752e3dac09a6564674f7e420d44888c8c))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.18 ([#737](https://github.com/DanySK/multi-jvm-test-plugin/issues/737)) ([3289dd0](https://github.com/DanySK/multi-jvm-test-plugin/commit/3289dd091c7d26eb7bb2a8a35dd672ebe175a478))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.22 ([#738](https://github.com/DanySK/multi-jvm-test-plugin/issues/738)) ([6c03112](https://github.com/DanySK/multi-jvm-test-plugin/commit/6c0311228a4fd0922362492a7f50380b76865051))

## [1.3.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.3.0...1.3.1) (2024-11-17)

### Dependency updates

* **core-deps:** update dependency gradle to v8.11 ([#724](https://github.com/DanySK/multi-jvm-test-plugin/issues/724)) ([c546449](https://github.com/DanySK/multi-jvm-test-plugin/commit/c54644945b803f35d87008fa1435d9c85dc318af))
* **deps:** update dependency com.mohamedrejeb.ksoup:ksoup-html to v0.4.1 ([#723](https://github.com/DanySK/multi-jvm-test-plugin/issues/723)) ([73cc5f4](https://github.com/DanySK/multi-jvm-test-plugin/commit/73cc5f4ceb4b2cfc93c4a4c2d9f3bd9151731ff1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.115 ([#725](https://github.com/DanySK/multi-jvm-test-plugin/issues/725)) ([2912d12](https://github.com/DanySK/multi-jvm-test-plugin/commit/2912d122c34239d75145289fa0f1a7291b03bd56))
* **deps:** update plugin com.gradle.develocity to v3.18.2 ([#727](https://github.com/DanySK/multi-jvm-test-plugin/issues/727)) ([f87b1c2](https://github.com/DanySK/multi-jvm-test-plugin/commit/f87b1c261c961bd8f9de3ed37dd15a2cb18c8622))
* **deps:** update plugin kotlin-qa to v0.70.0 ([#732](https://github.com/DanySK/multi-jvm-test-plugin/issues/732)) ([0a76eca](https://github.com/DanySK/multi-jvm-test-plugin/commit/0a76ecad0ceff57f3ccf0bdc4adcb91f05d26ac2))
* **deps:** update plugin multijvmtesting to v1.3.0 ([#722](https://github.com/DanySK/multi-jvm-test-plugin/issues/722)) ([476e9a1](https://github.com/DanySK/multi-jvm-test-plugin/commit/476e9a18ea41b0b79eadbbb4585c0871a6c40cf9))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.13 ([#726](https://github.com/DanySK/multi-jvm-test-plugin/issues/726)) ([4e429e4](https://github.com/DanySK/multi-jvm-test-plugin/commit/4e429e40935cb560cd57812451373ded304fe336))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.14 ([#728](https://github.com/DanySK/multi-jvm-test-plugin/issues/728)) ([3e94da8](https://github.com/DanySK/multi-jvm-test-plugin/commit/3e94da83fccb7c1b3f63b21e2d9fc028b0702fa9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.15 ([#729](https://github.com/DanySK/multi-jvm-test-plugin/issues/729)) ([49e2063](https://github.com/DanySK/multi-jvm-test-plugin/commit/49e20636192647560f360a85f1431ba1760a8d53))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.16 ([#730](https://github.com/DanySK/multi-jvm-test-plugin/issues/730)) ([46209c6](https://github.com/DanySK/multi-jvm-test-plugin/commit/46209c64b98ef2579bb0e342bc252ef629434743))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.17 ([#731](https://github.com/DanySK/multi-jvm-test-plugin/issues/731)) ([b1d4528](https://github.com/DanySK/multi-jvm-test-plugin/commit/b1d45289dce44c8eca24a592b85f64d1121b08ae))

## [1.3.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.8...1.3.0) (2024-11-08)

### Dependency updates

* **api-deps:** update dependency java to v23 ([#721](https://github.com/DanySK/multi-jvm-test-plugin/issues/721)) ([75b6f4a](https://github.com/DanySK/multi-jvm-test-plugin/commit/75b6f4a44eb671672f9884102d34045115dab886))
* **deps:** update dependency org.jetbrains.kotlin.jvm to v2.0.21 ([ce76a95](https://github.com/DanySK/multi-jvm-test-plugin/commit/ce76a95149fedca4564d8cf6af31dab7fc80060f))
* **deps:** update dependency org.mockito:mockito-core to v5.14.0 ([40eb02c](https://github.com/DanySK/multi-jvm-test-plugin/commit/40eb02ca64f51dbfed599f8d752735ae4ea09c55))
* **deps:** update dependency org.mockito:mockito-core to v5.14.1 ([5810f91](https://github.com/DanySK/multi-jvm-test-plugin/commit/5810f915a13660dfe47a84a4534c180d5a2cd03d))
* **deps:** update dependency org.mockito:mockito-core to v5.14.2 ([1376733](https://github.com/DanySK/multi-jvm-test-plugin/commit/13767336c346ab714aec3e6b317b219c76b89988))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.108 ([5ca21d6](https://github.com/DanySK/multi-jvm-test-plugin/commit/5ca21d6ee22a11f3fad8ba7978df182b783c5ecf))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.109 ([f22afbe](https://github.com/DanySK/multi-jvm-test-plugin/commit/f22afbe0b9d105134931688c567a8f8748e9eb28))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.110 ([5d222c8](https://github.com/DanySK/multi-jvm-test-plugin/commit/5d222c8751cfa2bd3f206432fa56b36160bb9fd8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.111 ([cd11bdc](https://github.com/DanySK/multi-jvm-test-plugin/commit/cd11bdc93cb706c69c7f4b178f568ccbe8ab4d6d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.112 ([fda3dbf](https://github.com/DanySK/multi-jvm-test-plugin/commit/fda3dbf6ceafa24f43bf541b12088b553447512e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.113 ([ec627c8](https://github.com/DanySK/multi-jvm-test-plugin/commit/ec627c8452d6e9e3561f9c9bb8e02a151d4b0279))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.114 ([6418c42](https://github.com/DanySK/multi-jvm-test-plugin/commit/6418c4282aba3610aa4c60c6cf46d450fe34f35d))
* **deps:** update node.js to 20.18 ([0f5c834](https://github.com/DanySK/multi-jvm-test-plugin/commit/0f5c834564b86fd96a4a6782799668f56d999a9e))
* **deps:** update node.js to v22 ([de07076](https://github.com/DanySK/multi-jvm-test-plugin/commit/de070767b208658e273094181d1c367f8f49e3bc))
* **deps:** update plugin kotlin-qa to v0.67.3 ([c0e2500](https://github.com/DanySK/multi-jvm-test-plugin/commit/c0e250087a5e1411bc5ede9153776f216fc636a8))
* **deps:** update plugin kotlin-qa to v0.68.0 ([eec11d0](https://github.com/DanySK/multi-jvm-test-plugin/commit/eec11d0dd265dd32fd44154ce3c3d215274f6cb8))
* **deps:** update plugin kotlin-qa to v0.69.0 ([ddf0b9a](https://github.com/DanySK/multi-jvm-test-plugin/commit/ddf0b9ad5f5804d6592b0963e10b9a2f6fa1075b))
* **deps:** update plugin multijvmtesting to v1.2.8 ([589786f](https://github.com/DanySK/multi-jvm-test-plugin/commit/589786fc1518d47de820d179dcb9e3f5cc548e0d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.13 ([4ddd521](https://github.com/DanySK/multi-jvm-test-plugin/commit/4ddd52170dacfd84c0f555bc4da101b857d3b4ad))
* **deps:** update plugin publishoncentral to v5.1.8 ([b88cb4f](https://github.com/DanySK/multi-jvm-test-plugin/commit/b88cb4f93581e7dcf1fcaec74040239e62d6c2c5))
* **deps:** update plugin publishoncentral to v5.1.9 ([2380fcb](https://github.com/DanySK/multi-jvm-test-plugin/commit/2380fcbe58cac04599a55834c7731612505f19a7))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.2.0 ([fb833cb](https://github.com/DanySK/multi-jvm-test-plugin/commit/fb833cbb8249947514dd2acdad6adfc495fe9c12))
* **deps:** update actions/checkout action to v4.2.1 ([c5994e0](https://github.com/DanySK/multi-jvm-test-plugin/commit/c5994e0fe4ef0bc87cc17ce0fb09af63ac675ec2))
* **deps:** update actions/checkout action to v4.2.2 ([111fbde](https://github.com/DanySK/multi-jvm-test-plugin/commit/111fbde22846583e222968ef9fee55eb2786bdc0))
* **deps:** update actions/setup-node action to v4.1.0 ([d48a4fa](https://github.com/DanySK/multi-jvm-test-plugin/commit/d48a4fa699beb2987df94c3735cad35c250bda44))
* **deps:** update danysk/action-checkout action to v0.2.20 ([177560e](https://github.com/DanySK/multi-jvm-test-plugin/commit/177560eacdedb390a55e9008755f6145d8ab2047))
* **deps:** update danysk/action-checkout action to v0.2.21 ([5b2abbd](https://github.com/DanySK/multi-jvm-test-plugin/commit/5b2abbdeecfe0f6bfab727a7f5843c695317bac2))
* **deps:** update danysk/action-checkout action to v0.2.22 ([199ca37](https://github.com/DanySK/multi-jvm-test-plugin/commit/199ca378763d65ccf85d3aa6240d263eaf805198))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.10 ([8812b54](https://github.com/DanySK/multi-jvm-test-plugin/commit/8812b54b37cc350637f4c10e9d14671d5ed3f708))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.11 ([90fddaa](https://github.com/DanySK/multi-jvm-test-plugin/commit/90fddaad41511bfa31c47f083c67860ec0100070))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.12 ([ec6e5ef](https://github.com/DanySK/multi-jvm-test-plugin/commit/ec6e5ef5e3eaea541c9ba72a8e64126dd33d19c4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.7 ([10fa656](https://github.com/DanySK/multi-jvm-test-plugin/commit/10fa656cf1bb3c61ddead652e9b4b5d381e7d257))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.8 ([09efb1c](https://github.com/DanySK/multi-jvm-test-plugin/commit/09efb1c230fd1fab3b0b1418c3cf444d42c61e4e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.9 ([aefce5d](https://github.com/DanySK/multi-jvm-test-plugin/commit/aefce5d742440137d7ccf1c6c384954ebf4d8fa6))
* **deps:** update dependency ubuntu github actions runner to v24 ([4cafb35](https://github.com/DanySK/multi-jvm-test-plugin/commit/4cafb3583880e3cd16a79930461bdd0d1bcaafb9))

### General maintenance

* try a different setup to trigger renovate ([f59c90a](https://github.com/DanySK/multi-jvm-test-plugin/commit/f59c90adcf13298020c9f699aa42d2217b44a8c0))

## [1.2.8](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.7...1.2.8) (2024-09-23)

### Dependency updates

* **core-deps:** update dependency gradle to v8.10.2 ([f67072e](https://github.com/DanySK/multi-jvm-test-plugin/commit/f67072e737d149c54f5b8fd9c3a213aea39ec651))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.106 ([547a9fd](https://github.com/DanySK/multi-jvm-test-plugin/commit/547a9fdb580fb4c7d85d8be099bd0c5dbd22b0ba))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.107 ([d26682f](https://github.com/DanySK/multi-jvm-test-plugin/commit/d26682fc1fff7b943c645586e53ce28f3e997385))
* **deps:** update plugin kotlin-qa to v0.67.1 ([0580a98](https://github.com/DanySK/multi-jvm-test-plugin/commit/0580a989c4751c2a52ee777cdc88d06abcacb62a))
* **deps:** update plugin kotlin-qa to v0.67.2 ([5286730](https://github.com/DanySK/multi-jvm-test-plugin/commit/528673048ba316e5321e04f1d322a4265fd1e67c))
* **deps:** update plugin multijvmtesting to v1.2.7 ([aa433ba](https://github.com/DanySK/multi-jvm-test-plugin/commit/aa433bac4c726cd0682c21fc380ed2892be0f233))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.12 ([e5f4a4b](https://github.com/DanySK/multi-jvm-test-plugin/commit/e5f4a4bdccc0120ec1e33fb8a05f83c0f240d8a5))
* **deps:** update plugin publishoncentral to v5.1.7 ([67a1e50](https://github.com/DanySK/multi-jvm-test-plugin/commit/67a1e50fce97030fdcd3d30a1cd72ed3d1b28aa6))

### Build and continuous integration

* **deps:** update actions/setup-node action to v4.0.4 ([4d5f35d](https://github.com/DanySK/multi-jvm-test-plugin/commit/4d5f35dec57058f652c88ce9864a2c626cd17954))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.6 ([407d53f](https://github.com/DanySK/multi-jvm-test-plugin/commit/407d53f797138b8e8db0ed65e5a5e10a8fc7be64))

## [1.2.7](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.6...1.2.7) (2024-09-12)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.103 ([34c87b7](https://github.com/DanySK/multi-jvm-test-plugin/commit/34c87b7550445695d9445ee5db1bef1397acf4be))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.104 ([13d479f](https://github.com/DanySK/multi-jvm-test-plugin/commit/13d479fd0205e3bb4dbce50437a78df47fb7b3e6))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.105 ([2c651f8](https://github.com/DanySK/multi-jvm-test-plugin/commit/2c651f87934bf582ad760ac3b680ba1553689173))
* **deps:** update plugin com.gradle.develocity to v3.18.1 ([3b721a5](https://github.com/DanySK/multi-jvm-test-plugin/commit/3b721a5c7113ee196706196b328acaabaac94edb))
* **deps:** update plugin gradlepluginpublish to v1.3.0 ([c833813](https://github.com/DanySK/multi-jvm-test-plugin/commit/c8338134aa8db582908d0589a679a951a6b62e5b))
* **deps:** update plugin multijvmtesting to v1.2.6 ([8ea259f](https://github.com/DanySK/multi-jvm-test-plugin/commit/8ea259fa33ebb65bf572997772913086b6280cdf))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.10 ([3a42875](https://github.com/DanySK/multi-jvm-test-plugin/commit/3a42875e6f9b2cd979f01c9ee8495076496ba08e))

### Bug Fixes

* make `TestOnSpecificJvmVersion.Companion` internal ([37a7054](https://github.com/DanySK/multi-jvm-test-plugin/commit/37a7054c706f90473b24c295542cc6f7c85b3f38))

### Documentation

* document `MultiJVMTestingExtension.Companion` ([a2ae475](https://github.com/DanySK/multi-jvm-test-plugin/commit/a2ae4755937e81bd74f814d93452cc3c19d788ae))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.5 ([796661c](https://github.com/DanySK/multi-jvm-test-plugin/commit/796661c6ff9bf5242a96a434ad1613d7147d7335))

### Style improvements

* remove redundant opt-in ([578fac8](https://github.com/DanySK/multi-jvm-test-plugin/commit/578fac890d3b8084cbe2ad89e3b71fe8d007cf4e))

## [1.2.6](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.5...1.2.6) (2024-09-09)

### Dependency updates

* **core-deps:** update dependency gradle to v8.10.1 ([2c0e3fb](https://github.com/DanySK/multi-jvm-test-plugin/commit/2c0e3fb2d42b968fe9489dc0c6d28030310446be))
* **deps:** update dependency org.mockito:mockito-core to v5.13.0 ([fb4fa11](https://github.com/DanySK/multi-jvm-test-plugin/commit/fb4fa117edbc3a86269be35275e05bbc621ed609))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.100 ([0f1e714](https://github.com/DanySK/multi-jvm-test-plugin/commit/0f1e71450bf3806c2f842464c685f3c8a8949a49))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.101 ([4bcf7c0](https://github.com/DanySK/multi-jvm-test-plugin/commit/4bcf7c02c5b0727475ee750093f902577c53f222))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.102 ([7d50630](https://github.com/DanySK/multi-jvm-test-plugin/commit/7d506307df2a4a6a7a5d8584008996b0e5c40ccd))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.99 ([30ecc50](https://github.com/DanySK/multi-jvm-test-plugin/commit/30ecc50b541d80bb7bbdbeb7bb2e777aef9936ce))
* **deps:** update node.js to 20.17 ([2fa6592](https://github.com/DanySK/multi-jvm-test-plugin/commit/2fa65920c30b96fa540fbdbc0cbc7b33c9929b15))
* **deps:** update plugin gradlepluginpublish to v1.2.2 ([9b20684](https://github.com/DanySK/multi-jvm-test-plugin/commit/9b20684af008b641acbb3a9933258701370ec7c8))
* **deps:** update plugin kotlin-qa to v0.66.0 ([a282f01](https://github.com/DanySK/multi-jvm-test-plugin/commit/a282f011cf03a3aace90c654f04a8f86f8cddcdb))
* **deps:** update plugin kotlin-qa to v0.66.1 ([3ebbe15](https://github.com/DanySK/multi-jvm-test-plugin/commit/3ebbe1561bfea38affde6e7d13364e82af65c7e6))
* **deps:** update plugin multijvmtesting to v1.2.5 ([dfcb2ec](https://github.com/DanySK/multi-jvm-test-plugin/commit/dfcb2ec15ed78ed28e2807d061cf178035880e16))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.4 ([3a02c1b](https://github.com/DanySK/multi-jvm-test-plugin/commit/3a02c1b36d90674d21c89eeabf7641d09651e8f4))

## [1.2.5](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.4...1.2.5) (2024-08-22)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.0.20 ([3f986e7](https://github.com/DanySK/multi-jvm-test-plugin/commit/3f986e7125564d25b01a11fed41c59ed9fce4774))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.96 ([d97f099](https://github.com/DanySK/multi-jvm-test-plugin/commit/d97f099ba1e3c7946b978a8a1be75d844602921d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.97 ([32aac5c](https://github.com/DanySK/multi-jvm-test-plugin/commit/32aac5cbf14e09377929d3cc94ad0ad4ae67f39f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.98 ([eea8751](https://github.com/DanySK/multi-jvm-test-plugin/commit/eea875105a996e7ea4d7963a0498b8dfbff64b28))
* **deps:** update plugin com.gradle.develocity to v3.18 ([305a988](https://github.com/DanySK/multi-jvm-test-plugin/commit/305a988bb76a6cb8680ec52a2c77d26d38b54b08))
* **deps:** update plugin multijvmtesting to v1.2.4 ([f6f1748](https://github.com/DanySK/multi-jvm-test-plugin/commit/f6f17482a79b0d8fc9387e997b6c25ca0bb667c1))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.9 ([81a100b](https://github.com/DanySK/multi-jvm-test-plugin/commit/81a100b7c716b42f95d30032f396463c288edd57))
* **deps:** update plugin publishoncentral to v5.1.6 ([f7f6a66](https://github.com/DanySK/multi-jvm-test-plugin/commit/f7f6a668119ed239bfc67cac4f90dab685442b57))

## [1.2.4](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.3...1.2.4) (2024-08-14)

### Dependency updates

* **core-deps:** update dependency gradle to v8.10 ([ff379bc](https://github.com/DanySK/multi-jvm-test-plugin/commit/ff379bc3e5188fb19a2d8d956c4dc1d8663d5c97))
* **deps:** update plugin kotlin-qa to v0.65.1 ([3e9259b](https://github.com/DanySK/multi-jvm-test-plugin/commit/3e9259b106c034bcbcae94b1857bdb0062853c77))
* **deps:** update plugin kotlin-qa to v0.65.2 ([fabb4ad](https://github.com/DanySK/multi-jvm-test-plugin/commit/fabb4adc6f230043e90643407e1a9aa1195958f6))
* **deps:** update plugin multijvmtesting to v1.2.3 ([a88fc6b](https://github.com/DanySK/multi-jvm-test-plugin/commit/a88fc6bcd5ef05f0c0b19afd25c1f00752bc028a))
* **deps:** update plugin publishoncentral to v5.1.5 ([400d947](https://github.com/DanySK/multi-jvm-test-plugin/commit/400d9473e3698d3ff33a02dcc5b149675f9a78e5))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.3 ([3b706ff](https://github.com/DanySK/multi-jvm-test-plugin/commit/3b706ffbd77275ead3912ea07f19928deff8b6d3))

## [1.2.3](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.2...1.2.3) (2024-08-06)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2.0.10 ([e7634a4](https://github.com/DanySK/multi-jvm-test-plugin/commit/e7634a4ad3631dddbadd7c8940047a3f47fe4658))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.92 ([b204a46](https://github.com/DanySK/multi-jvm-test-plugin/commit/b204a46fca5c8144ecc8868e973f489cd88f264b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.93 ([f5abb07](https://github.com/DanySK/multi-jvm-test-plugin/commit/f5abb07589a106c41dd7f659b0c2c8930f1ca8f1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.94 ([c916a0c](https://github.com/DanySK/multi-jvm-test-plugin/commit/c916a0c1b0671fe8fd74ca4b66725543f0d9f57c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.95 ([3f92d25](https://github.com/DanySK/multi-jvm-test-plugin/commit/3f92d2591ceb6a9e88a83a461dcc3421c9482ac9))
* **deps:** update node.js to 20.16 ([38469bc](https://github.com/DanySK/multi-jvm-test-plugin/commit/38469bcfef7c1d0bb1190ffd3c9fa02d220dc6e4))
* **deps:** update plugin kotlin-qa to v0.64.0 ([219c5cb](https://github.com/DanySK/multi-jvm-test-plugin/commit/219c5cbe1d8984faaab84975096659931a9db9ae))
* **deps:** update plugin kotlin-qa to v0.64.1 ([1fb90ee](https://github.com/DanySK/multi-jvm-test-plugin/commit/1fb90ee5a31698b4a9b5f2c3111fb39cc20b0825))
* **deps:** update plugin kotlin-qa to v0.64.2 ([9252c06](https://github.com/DanySK/multi-jvm-test-plugin/commit/9252c06b49233f314cde5c658d7142366ea0fbc3))
* **deps:** update plugin kotlin-qa to v0.64.3 ([62cdb73](https://github.com/DanySK/multi-jvm-test-plugin/commit/62cdb734d07fc5565207583fdb562313fdd9b959))
* **deps:** update plugin kotlin-qa to v0.65.0 ([1335e62](https://github.com/DanySK/multi-jvm-test-plugin/commit/1335e6243088e57359de812ba08cadafc3f0b333))
* **deps:** update plugin multijvmtesting to v1.2.2 ([0f4ee66](https://github.com/DanySK/multi-jvm-test-plugin/commit/0f4ee66e4b82838bf88cd46e9ecebf6defadeee7))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.1 ([18e0f85](https://github.com/DanySK/multi-jvm-test-plugin/commit/18e0f85dad98698e3ed1b58df4738f3491cdf001))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.2 ([a260880](https://github.com/DanySK/multi-jvm-test-plugin/commit/a2608804cf6d71d3aac8f4fb78b25e602c1b1fc9))

## [1.2.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.1...1.2.2) (2024-07-23)

### Bug Fixes

* disable test tasks incompatible with the compile JVM ([a1d0b08](https://github.com/DanySK/multi-jvm-test-plugin/commit/a1d0b08176a99d10bacffa5a925f0e60b6ff8766))

### Build and continuous integration

* use the task configuration avoidance API to set the Kotlin compiler options ([2513ad7](https://github.com/DanySK/multi-jvm-test-plugin/commit/2513ad7a09dd4afd3c620730d5b21c8b4153d9ff))

## [1.2.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.2.0...1.2.1) (2024-07-23)

### Bug Fixes

* set the base toolchain version after evaluation ([9f8c82f](https://github.com/DanySK/multi-jvm-test-plugin/commit/9f8c82f59937c5ba327ce5e9ca9a25d2fbf7e512))

### Tests

* delete the temporary folders in CI ([e55fc2d](https://github.com/DanySK/multi-jvm-test-plugin/commit/e55fc2db1f1a24c1c74481623b40fbd568fad2d7))

### Build and continuous integration

* get a codecov token from the repo secrets ([9322ace](https://github.com/DanySK/multi-jvm-test-plugin/commit/9322ace156315680ebfc908512f8e778aad1051e))
* remove info logging ([a506e2a](https://github.com/DanySK/multi-jvm-test-plugin/commit/a506e2a88d107bbc1dadf68ef3a3dad0e8be721a))

## [1.2.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.1.1...1.2.0) (2024-07-22)

### Features

* improve the configuration avoidance ([#615](https://github.com/DanySK/multi-jvm-test-plugin/issues/615)) ([b6c9b6a](https://github.com/DanySK/multi-jvm-test-plugin/commit/b6c9b6a37c0a9dbdd911a07c4f44f1b5ce52ea76))

### Dependency updates

* **deps:** update plugin com.gradle.develocity to v3.17.6 ([7fa7a6c](https://github.com/DanySK/multi-jvm-test-plugin/commit/7fa7a6cffb277b2e4c1d503af3e2e0f48cf470ba))

### Tests

* reduce the JVMs to test with to save space in CI ([a2c483d](https://github.com/DanySK/multi-jvm-test-plugin/commit/a2c483d1ef69b69801c3f03ef73381823471c413))

### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v3.5.0 ([6715dae](https://github.com/DanySK/multi-jvm-test-plugin/commit/6715dae67e51eaffcd0db81a521da99d92ddf019))

## [1.1.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.1.0...1.1.1) (2024-07-18)

### Dependency updates

* **deps:** update plugin kotlin-qa to v0.62.4 ([bb2a93e](https://github.com/DanySK/multi-jvm-test-plugin/commit/bb2a93e2f7620b9f937600da37d3f2056eb11a3c))
* **deps:** update plugin kotlin-qa to v0.63.0 ([c09bded](https://github.com/DanySK/multi-jvm-test-plugin/commit/c09bdeddc1b38652e1fede53a66276e1a386b50d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.8 ([2030234](https://github.com/DanySK/multi-jvm-test-plugin/commit/2030234e6fb030d60fe6fb8abd58f343dfa33d49))
* **deps:** update plugin publishoncentral to v5.1.4 ([f38dc15](https://github.com/DanySK/multi-jvm-test-plugin/commit/f38dc1569337f7bf275ac440d640c14620ce7328))

### Performance improvements

* migrate from `create` to `register` for configuration avoidance (thanks @Vampire) ([6fd0e83](https://github.com/DanySK/multi-jvm-test-plugin/commit/6fd0e834d86abec808190b5d865ae86e29c5a631))

### Build and continuous integration

* always push the buildScan results ([307ea01](https://github.com/DanySK/multi-jvm-test-plugin/commit/307ea0110045c020eb0b8c59e12e9dfece9039fa))
* configure the wrapper checksum verification ([8419b37](https://github.com/DanySK/multi-jvm-test-plugin/commit/8419b37411f65d81b5fccf8c53ebce3c6cd6b436))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.3.0 ([bf73753](https://github.com/DanySK/multi-jvm-test-plugin/commit/bf737537bc67da29671130d927bc828927aa5ed5))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.4.0 ([f9e2554](https://github.com/DanySK/multi-jvm-test-plugin/commit/f9e25541314604ac9c1e489f84cb050cc7ccfe89))

### Refactoring

* leave `TestOnSpecificJvmVersion` abstract instead of using horrible kludges (thanks @Vampire for the suggestion) ([d43952b](https://github.com/DanySK/multi-jvm-test-plugin/commit/d43952b2b8a0ee8e3ebd50fef3ec84594c0bbc9a))

## [1.1.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.0.4...1.1.0) (2024-07-16)

### Features

* disable test tasks if no JVM is available for the selected platform ([d7f3245](https://github.com/DanySK/multi-jvm-test-plugin/commit/d7f324597ebe3cba18c7fd36329801a4c88a5b30))

### Dependency updates

* **deps:** update dependency org.mockito:mockito-core to v5.12.0 ([90ee1ec](https://github.com/DanySK/multi-jvm-test-plugin/commit/90ee1ec2ac7197ff38161127481a30ff81fc18b6))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.91 ([3da73d4](https://github.com/DanySK/multi-jvm-test-plugin/commit/3da73d41abaeabbc01b3cea30741a155b5fff7e4))
* **deps:** update node.js to 20.15 ([2f2e2aa](https://github.com/DanySK/multi-jvm-test-plugin/commit/2f2e2aac36d152c1b02130bb3d143e1d587af927))
* **deps:** update plugin multijvmtesting to v1 ([9a9ead3](https://github.com/DanySK/multi-jvm-test-plugin/commit/9a9ead3b844a60d19f0c56df3700ccfbb88f142f))
* **deps:** update plugin multijvmtesting to v1.0.4 ([4826824](https://github.com/DanySK/multi-jvm-test-plugin/commit/48268244a3ef0108e60458f4f7fc78b418fd48ae))
* **deps:** update plugin publishoncentral to v5.1.3 ([1757efa](https://github.com/DanySK/multi-jvm-test-plugin/commit/1757efae1c682895c5923081d59b6b1cc2c9f46b))

### Build and continuous integration

* auto-overwrite the hooks configuration ([8b7b68f](https://github.com/DanySK/multi-jvm-test-plugin/commit/8b7b68f87db38dfcf7c4ffba8243b33396add9b4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3 ([e6512fe](https://github.com/DanySK/multi-jvm-test-plugin/commit/e6512feed5e236e751e0da812d6d9bf2a907cc85))
* **deps:** update danysk/build-check-deploy-gradle-action action to v3.2.0 ([45c402b](https://github.com/DanySK/multi-jvm-test-plugin/commit/45c402b247750fdead682f9c4594f6710ebe5aa0))
* **deps:** update dependency macos github actions runner to v14 ([317382b](https://github.com/DanySK/multi-jvm-test-plugin/commit/317382b9b6a0761994e88f9d8d76dd68a303ebd2))
* install the version of node from the package.json ([e4ae467](https://github.com/DanySK/multi-jvm-test-plugin/commit/e4ae467477a4468520dec19777f9fa9af738450e))
* read the Central username from the secrets ([95000a3](https://github.com/DanySK/multi-jvm-test-plugin/commit/95000a3f6c2b18e7cbc90bff0ba04f0aee51019b))

### General maintenance

* ignore `.kotlin` and `node_modules` ([e402366](https://github.com/DanySK/multi-jvm-test-plugin/commit/e4023669b282222fc46db8b1f2b10fd208432fbc))

## [1.0.4](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.0.3...1.0.4) (2024-07-16)


### Dependency updates

* **core-deps:** update dependency gradle to v8.9 ([da8257a](https://github.com/DanySK/multi-jvm-test-plugin/commit/da8257afec060e29f943001989c2bf1b377c8a6c))
* **deps:** update plugin tasktree to v4 ([3b95ec7](https://github.com/DanySK/multi-jvm-test-plugin/commit/3b95ec7ec252fbfce33a698d6913cd218079a312))

## [1.0.3](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.0.2...1.0.3) (2024-07-16)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v2 ([09ae5ac](https://github.com/DanySK/multi-jvm-test-plugin/commit/09ae5ac300742bd1ad6d8fd04af2559fa2db5d80))
* **deps:** update dependency com.mohamedrejeb.ksoup:ksoup-html to v0.4.0 ([910f266](https://github.com/DanySK/multi-jvm-test-plugin/commit/910f26604d9fc26ef89d76568c2899b7aabe260a))
* **deps:** update dependency org.jacoco:org.jacoco.core to v0.8.12 ([8fc04fc](https://github.com/DanySK/multi-jvm-test-plugin/commit/8fc04fc24d3ed859c51fbcf2c9f45bda728f5d5f))
* **deps:** update kotest to v5.9.1 ([4d01a5b](https://github.com/DanySK/multi-jvm-test-plugin/commit/4d01a5b34d66300087e8ceb97c7a03a6a648e7f9))
* **deps:** update plugin gitsemver to v3.1.7 ([fdd2343](https://github.com/DanySK/multi-jvm-test-plugin/commit/fdd23434c12f8d61d23824a41757c819b9d95702))
* **deps:** update plugin publishoncentral to v5.0.26 ([9f6b3e0](https://github.com/DanySK/multi-jvm-test-plugin/commit/9f6b3e0a28bfe8eb9d700c4b7633a4e3385900c3))

## [1.0.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.0.1...1.0.2) (2024-07-15)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v1.9.24 ([806221f](https://github.com/DanySK/multi-jvm-test-plugin/commit/806221fe0fae6512d4355f899ba1baafcb6dbd68))
* **deps:** update dependency com.mohamedrejeb.ksoup:ksoup-html to v0.3.2 ([cdf1729](https://github.com/DanySK/multi-jvm-test-plugin/commit/cdf172973c3de218bd223b1742e8376875b896bb))
* **deps:** update kotest to v5.8.1 ([7337e2a](https://github.com/DanySK/multi-jvm-test-plugin/commit/7337e2a901003b67b4452deae716e8a608d3d9e7))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.7 ([a1a6f11](https://github.com/DanySK/multi-jvm-test-plugin/commit/a1a6f11a774e2b7532a2f60ac0c69bd06aff2e2f))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.7 ([7b1719b](https://github.com/DanySK/multi-jvm-test-plugin/commit/7b1719b711d7d67d3ef167a3d7253189c71d828b))
* **deps:** update danysk/action-checkout action to v0.2.19 ([b423489](https://github.com/DanySK/multi-jvm-test-plugin/commit/b423489cc89f07218d6b40a4d4e7bafeb44d65d0))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.24 ([ba23cc1](https://github.com/DanySK/multi-jvm-test-plugin/commit/ba23cc1f0f3017a379adca6ab46fe70a33b7f8a0))
* **deps:** update dependency macos github actions runner to v13 ([d93e8e4](https://github.com/DanySK/multi-jvm-test-plugin/commit/d93e8e44468546f83646e6bd5209284feda7d7f6))

## [1.0.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/1.0.0...1.0.1) (2024-07-15)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.9.20 ([c92f25e](https://github.com/DanySK/multi-jvm-test-plugin/commit/c92f25e7511cb34658a342b920ee8e4df48d26a6))


### Build and continuous integration

* **mergify:** extend from the base config ([08b8c02](https://github.com/DanySK/multi-jvm-test-plugin/commit/08b8c0268b44ffdfca7a545d2ef9a90209ffaaac))

## [1.0.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.9...1.0.0) (2024-07-15)


### ⚠ BREAKING CHANGES

* scrape the gradle Java compatibility table page more robustly

### Bug Fixes

* scrape the gradle Java compatibility table page more robustly ([bdef273](https://github.com/DanySK/multi-jvm-test-plugin/commit/bdef2735f4ba3a24b8d0ae012680d3e706807fd6))
* work around `Class 'TestOnSpecificJvmVersion' is not abstract and does not implement abstract base class member 'getDryRun'.`. See also: https://discuss.gradle.org/t/custom-task-and-dryrun-in-gradle-8x/47882/2 ([f797c08](https://github.com/DanySK/multi-jvm-test-plugin/commit/f797c08de751c1a9d598b518b734527074a11fd1))


### Tests

* enable develocity inside a test ([b319e26](https://github.com/DanySK/multi-jvm-test-plugin/commit/b319e2609e317713a9aa4fe913f30dd3a55c5aef))
* fix test name clash ([785575f](https://github.com/DanySK/multi-jvm-test-plugin/commit/785575f6472772b55185a455b79e1cd36f4fb252))


### Build and continuous integration

* `toLowerCase(): String` is deprecated. Use `lowercase()` instead. ([d0b3d59](https://github.com/DanySK/multi-jvm-test-plugin/commit/d0b3d59d9636adbc1f9a1925b5dfbea8323d1daa))
* disable fail-fast for matrix job ([1a5a246](https://github.com/DanySK/multi-jvm-test-plugin/commit/1a5a246d55e9ca359b134cb3784e03c54e73b610))
* exclude detekt from the Kotlin version enforcement ([0753b60](https://github.com/DanySK/multi-jvm-test-plugin/commit/0753b60135685d1af806ec37133f4106bdf737e5))
* migrate to the compilerOptions DSL. More details are here: https://kotl.in/u1r8l ([6e6054d](https://github.com/DanySK/multi-jvm-test-plugin/commit/6e6054dffdbc692fe2f588bea39436138f63a5fd))
* switch Gradle Enterprise to Develocity ([78229ae](https://github.com/DanySK/multi-jvm-test-plugin/commit/78229aed2168b912bc975043c51789663305360c))
* update kotlin-qa to 0.62.3 ([6c180f7](https://github.com/DanySK/multi-jvm-test-plugin/commit/6c180f7051d9d0296ebaff01c90a8ce0c777d665))
* update multi-jvm-test to 0.5.10-dev02-d0b3d59 ([6be629d](https://github.com/DanySK/multi-jvm-test-plugin/commit/6be629db8fe7febc30b16754a378958c0c22fdf4))

## [0.5.9](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.8...0.5.9) (2024-02-09)


### Dependency updates

* **core-deps:** update dependency gradle to v8.6 ([574baa6](https://github.com/DanySK/multi-jvm-test-plugin/commit/574baa6caf26b39e440cba6679a05436c8330d0b))
* **deps:** update dependency org.mockito:mockito-core to v5.10.0 ([d22611f](https://github.com/DanySK/multi-jvm-test-plugin/commit/d22611f040cfdee0aed37c9fb9de4d55f549fbff))
* **deps:** update plugin gitsemver to v3.1.1 ([e99aee6](https://github.com/DanySK/multi-jvm-test-plugin/commit/e99aee67d5e7d546e46b96dc5105ad512e35f450))
* **deps:** update plugin kotlin-qa to v0.59.1 ([cc35c7c](https://github.com/DanySK/multi-jvm-test-plugin/commit/cc35c7cb607a0ea76f6cc937026f14c5935005e7))
* **deps:** update plugin kotlin-qa to v0.60.0 ([1f4ed09](https://github.com/DanySK/multi-jvm-test-plugin/commit/1f4ed09b097af3304ed47158300b0065663d284a))
* **deps:** update plugin multijvmtesting to v0.5.8 ([c46ef13](https://github.com/DanySK/multi-jvm-test-plugin/commit/c46ef13e191dac0f0638df1cf142b3d6278aa32b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.1 ([1e62a44](https://github.com/DanySK/multi-jvm-test-plugin/commit/1e62a44a2b34b610572f4c610ef64c237cc03b86))
* **deps:** update plugin publishoncentral to v5.0.23 ([5941ff7](https://github.com/DanySK/multi-jvm-test-plugin/commit/5941ff77979debd042a9313adace6084029be27f))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.17 ([4f422b1](https://github.com/DanySK/multi-jvm-test-plugin/commit/4f422b14218a0131461edbd384b3d1055bdc83e4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.19 ([c6494dc](https://github.com/DanySK/multi-jvm-test-plugin/commit/c6494dc9975502f6400ac0fc9e728536c1dc5922))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.20 ([f6a51b1](https://github.com/DanySK/multi-jvm-test-plugin/commit/f6a51b1f897d86d308fd087fa9bb63c3042527ca))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.3.0 ([b2d3421](https://github.com/DanySK/multi-jvm-test-plugin/commit/b2d342111acd715d1a27cd6790cae38a9719d7c3))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.3.1 ([5ffe3e9](https://github.com/DanySK/multi-jvm-test-plugin/commit/5ffe3e92fedb573260979ab1c9c637704cbe560e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.3.2 ([955c74f](https://github.com/DanySK/multi-jvm-test-plugin/commit/955c74f5d94412750964a94077960451d0138dd1))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.4.0 ([6ee9be6](https://github.com/DanySK/multi-jvm-test-plugin/commit/6ee9be6e669fb016b821d467165b318ec74d7c43))

## [0.5.8](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.7...0.5.8) (2024-01-31)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.9.22 ([71a1bca](https://github.com/DanySK/multi-jvm-test-plugin/commit/71a1bcae53a2d0ea3ab7ece36f3676876f2653b1))
* **deps:** update dependency org.mockito:mockito-core to v5.8.0 ([9ca3bc3](https://github.com/DanySK/multi-jvm-test-plugin/commit/9ca3bc3e25b3f939c7a81f8bd579b72ecd2e575a))
* **deps:** update dependency org.mockito:mockito-core to v5.9.0 ([1108f24](https://github.com/DanySK/multi-jvm-test-plugin/commit/1108f242a1b4f7043ebb1014470d5827a8c5df94))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.79 ([9349816](https://github.com/DanySK/multi-jvm-test-plugin/commit/9349816a1e9194c8c7aacc80664289d4f4480073))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.80 ([a39ab29](https://github.com/DanySK/multi-jvm-test-plugin/commit/a39ab2973648a8ce3acd855ecbda4d6206f935e0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.81 ([ee3ba68](https://github.com/DanySK/multi-jvm-test-plugin/commit/ee3ba682c1c8197aefd8c76ef78d4d8ce9039f89))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.82 ([d01da70](https://github.com/DanySK/multi-jvm-test-plugin/commit/d01da70350e207a0bfa22cfe9cd7ec06f5f86a4e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.83 ([741f261](https://github.com/DanySK/multi-jvm-test-plugin/commit/741f26151a935661a4ae7c678ed9d7abf97b31fa))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.84 ([8815ecf](https://github.com/DanySK/multi-jvm-test-plugin/commit/8815ecffbee58c919e036310092d6b50484c3a05))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.85 ([00fcf33](https://github.com/DanySK/multi-jvm-test-plugin/commit/00fcf330cb6cba89874fd518901ce84ac2df6b52))
* **deps:** update node.js to 20.11 ([8f220d8](https://github.com/DanySK/multi-jvm-test-plugin/commit/8f220d8ae55349c22f1f34d8c570922309fa786d))
* **deps:** update plugin com.gradle.enterprise to v3.16 ([6979ccc](https://github.com/DanySK/multi-jvm-test-plugin/commit/6979ccca3cf8a6dc78a71ca96c424befc2ddb888))
* **deps:** update plugin com.gradle.enterprise to v3.16.1 ([89d8eb6](https://github.com/DanySK/multi-jvm-test-plugin/commit/89d8eb6fb882bd0e6cee8cf624d9283c103b7909))
* **deps:** update plugin com.gradle.enterprise to v3.16.2 ([30fd999](https://github.com/DanySK/multi-jvm-test-plugin/commit/30fd999742d49f30af7e14ca7e59cf34abf0a83c))
* **deps:** update plugin gitsemver to v2.0.4 ([d80ddb2](https://github.com/DanySK/multi-jvm-test-plugin/commit/d80ddb2cc6f463f5410d52aea16e741771226844))
* **deps:** update plugin gitsemver to v2.0.5 ([51353a8](https://github.com/DanySK/multi-jvm-test-plugin/commit/51353a8fd3a88adfef954ce904df858f29deeba6))
* **deps:** update plugin gitsemver to v3 ([f631977](https://github.com/DanySK/multi-jvm-test-plugin/commit/f631977bfcd8129d4a171bb381fbd437e87db584))
* **deps:** update plugin gitsemver to v3.1.0 ([ad2a4c2](https://github.com/DanySK/multi-jvm-test-plugin/commit/ad2a4c28de972a39a5c0237cd7f673c1e0bb3413))
* **deps:** update plugin kotlin-qa to v0.55.2 ([86ed7f6](https://github.com/DanySK/multi-jvm-test-plugin/commit/86ed7f6a2070ae62141963c295dba372acabe99d))
* **deps:** update plugin kotlin-qa to v0.56.0 ([1b0a912](https://github.com/DanySK/multi-jvm-test-plugin/commit/1b0a912f8b8506c7bbf3a1a86f6186f21f1edaa9))
* **deps:** update plugin kotlin-qa to v0.57.0 ([0e8ed45](https://github.com/DanySK/multi-jvm-test-plugin/commit/0e8ed45a9c78d4a81b219dc5afb2ecd6855052bc))
* **deps:** update plugin kotlin-qa to v0.59.0 ([20832fb](https://github.com/DanySK/multi-jvm-test-plugin/commit/20832fb631bb5dedf9b52646b1899200f96e974d))
* **deps:** update plugin multijvmtesting to v0.5.7 ([78f1ae0](https://github.com/DanySK/multi-jvm-test-plugin/commit/78f1ae00124b2a09ee51a3ad3be4f423f79629bb))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.16 ([a8c3f7c](https://github.com/DanySK/multi-jvm-test-plugin/commit/a8c3f7c53d472b1a9e10750092020ef6c1c3b52a))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.17 ([3f08135](https://github.com/DanySK/multi-jvm-test-plugin/commit/3f08135c9c0b9637ac244337aecf3f41ca666e5a))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.18 ([306b54a](https://github.com/DanySK/multi-jvm-test-plugin/commit/306b54aaee8121e825244784cd1be6946ec9390e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2 ([13a3f41](https://github.com/DanySK/multi-jvm-test-plugin/commit/13a3f41bf46ee00a84f1103c550c1d8caa2e503c))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.8.0 ([f745446](https://github.com/DanySK/multi-jvm-test-plugin/commit/f745446ef58df74c1432137b5ff00dac0bdd175b))
* **deps:** update plugin publishoncentral to v5.0.22 ([4da4541](https://github.com/DanySK/multi-jvm-test-plugin/commit/4da4541453500f2a4ee4ba48f1131d21659c9669))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.12 ([4836bdc](https://github.com/DanySK/multi-jvm-test-plugin/commit/4836bdc6e8f1f7b5cd25f15b5a8c51963618aa1a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.13 ([3377134](https://github.com/DanySK/multi-jvm-test-plugin/commit/337713457c0146c53fe7973af998f9040e22a58a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.14 ([a4c184b](https://github.com/DanySK/multi-jvm-test-plugin/commit/a4c184b5e25e7870f0e3a5c3437f7519586f97a9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.15 ([169abe2](https://github.com/DanySK/multi-jvm-test-plugin/commit/169abe253655e07be9b9dd4b4bd285f1a57c4f03))

## [0.5.7](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.6...0.5.7) (2023-11-26)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.9.21 ([e7001b1](https://github.com/DanySK/multi-jvm-test-plugin/commit/e7001b13766c7317c3d9ff49748eb8416ebcf6fa))
* **deps:** update dependency org.jacoco:org.jacoco.core to v0.8.11 ([ae68e46](https://github.com/DanySK/multi-jvm-test-plugin/commit/ae68e46dc1c7d83b5fc539e18d5fe75e56ba2e78))
* **deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.8.22 ([6bf5dbe](https://github.com/DanySK/multi-jvm-test-plugin/commit/6bf5dbed375ab662ef61d828effda6bd32e28e31))
* **deps:** update dependency org.mockito:mockito-core to v5.6.0 ([290ad42](https://github.com/DanySK/multi-jvm-test-plugin/commit/290ad42b61059f3c9932d4e8856a46c9ee9e5f23))
* **deps:** update dependency org.mockito:mockito-core to v5.7.0 ([7da4733](https://github.com/DanySK/multi-jvm-test-plugin/commit/7da4733dbb8f42601a5b672af1b3c3bad1de6129))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.70 ([08a37be](https://github.com/DanySK/multi-jvm-test-plugin/commit/08a37be869432d846f1e78c18fb8a61c9eb67b98))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.71 ([d8b0f38](https://github.com/DanySK/multi-jvm-test-plugin/commit/d8b0f380cf463e29dbf8c0cda0cdaf238d2dbad1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.72 ([b233a0c](https://github.com/DanySK/multi-jvm-test-plugin/commit/b233a0cad76f5b2be30a50c0f6778872d2694f3a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.74 ([782f15a](https://github.com/DanySK/multi-jvm-test-plugin/commit/782f15ad7a8e51a7a7c92c9a09487d5512e420c3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.75 ([e4a7010](https://github.com/DanySK/multi-jvm-test-plugin/commit/e4a70104e75f14e2f530b61da758e735346c9a90))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.76 ([5e769a3](https://github.com/DanySK/multi-jvm-test-plugin/commit/5e769a3768bc2fb90609edd28e5ed951c137e48a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.77 ([45b94ee](https://github.com/DanySK/multi-jvm-test-plugin/commit/45b94eeb5e93c4a007c5b4562f1730fbbe16ca06))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.78 ([0c52fcb](https://github.com/DanySK/multi-jvm-test-plugin/commit/0c52fcbf039ffad8b27db098e50aa6926351b1b6))
* **deps:** update kotest to v5.8.0 ([64ac2b2](https://github.com/DanySK/multi-jvm-test-plugin/commit/64ac2b25e1e5cc468b88eb7ed601440d15d67afa))
* **deps:** update node.js to 20.10 ([b6a834a](https://github.com/DanySK/multi-jvm-test-plugin/commit/b6a834acb48b86c077f3eae05dc769f00256005f))
* **deps:** update node.js to 20.9 ([6d92ea3](https://github.com/DanySK/multi-jvm-test-plugin/commit/6d92ea3ebe1a4d6a538b280e8e9783aafcce396a))
* **deps:** update node.js to v20 ([e2ac3e1](https://github.com/DanySK/multi-jvm-test-plugin/commit/e2ac3e12a13f2977f6660c18f9e2f55edc076af8))
* **deps:** update plugin gitsemver to v1.1.11 ([7e7ef2e](https://github.com/DanySK/multi-jvm-test-plugin/commit/7e7ef2ecdb01cee9fe6a087218277c92b1369a82))
* **deps:** update plugin gitsemver to v1.1.13 ([0ddf6c4](https://github.com/DanySK/multi-jvm-test-plugin/commit/0ddf6c4ff539fe08b835e0ef73f0fa32c405662f))
* **deps:** update plugin gitsemver to v1.1.14 ([452ef14](https://github.com/DanySK/multi-jvm-test-plugin/commit/452ef1429ce01a235673b453cdbab03e4d1b3812))
* **deps:** update plugin gitsemver to v1.1.15 ([229dc97](https://github.com/DanySK/multi-jvm-test-plugin/commit/229dc97310f77d2fe2f848f36290ef3707ef82aa))
* **deps:** update plugin gitsemver to v2 ([5d93e03](https://github.com/DanySK/multi-jvm-test-plugin/commit/5d93e03de4b8afd0b5927ff9de2cb2d0b8abda4f))
* **deps:** update plugin gitsemver to v2.0.1 ([049f8ca](https://github.com/DanySK/multi-jvm-test-plugin/commit/049f8caaecaa40349d9071c57df5edcc6b79b03f))
* **deps:** update plugin gitsemver to v2.0.2 ([899c5ab](https://github.com/DanySK/multi-jvm-test-plugin/commit/899c5aba89efdc800889ac7f06efe06260966317))
* **deps:** update plugin gitsemver to v2.0.3 ([8c78982](https://github.com/DanySK/multi-jvm-test-plugin/commit/8c7898286c7a6b862d87fd43d3166c6275174ead))
* **deps:** update plugin kotlin-qa to v0.52.0 ([9ad1465](https://github.com/DanySK/multi-jvm-test-plugin/commit/9ad14654eaed6a52a377aa0ddd3b2830bbd9d8cd))
* **deps:** update plugin kotlin-qa to v0.55.1 ([1af6c36](https://github.com/DanySK/multi-jvm-test-plugin/commit/1af6c36dfba958899045a5ce941c5fd52d06ef73))
* **deps:** update plugin multijvmtesting to v0.5.6 ([157fabc](https://github.com/DanySK/multi-jvm-test-plugin/commit/157fabc0ce6850a59c09eb00812e75f446661e35))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.11 ([81906ef](https://github.com/DanySK/multi-jvm-test-plugin/commit/81906ef01c32703c77922610dc94419c7c126b27))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.13 ([f1eb16e](https://github.com/DanySK/multi-jvm-test-plugin/commit/f1eb16ef2defb67a498ef743353133e3a24d2cf0))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.14 ([2e2ccba](https://github.com/DanySK/multi-jvm-test-plugin/commit/2e2ccba49e79d0104bc1d802044bdddb6d2bcbc0))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.15 ([910b10d](https://github.com/DanySK/multi-jvm-test-plugin/commit/910b10d05f6a198f3e0b0cf61e6368f92d2d1004))
* **deps:** update plugin publishoncentral to v5.0.20 ([2f4e6c6](https://github.com/DanySK/multi-jvm-test-plugin/commit/2f4e6c6d369d9d90cec5f467b225a24d48ae01c8))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.1 ([9a4bedf](https://github.com/DanySK/multi-jvm-test-plugin/commit/9a4bedf94ce9293df4adf6a8d882c13944d99b55))
* **deps:** update danysk/action-checkout action to v0.2.14 ([08665d4](https://github.com/DanySK/multi-jvm-test-plugin/commit/08665d439c1afb3fbcb9fc14272b421ca80d3190))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.11 ([b4c54b6](https://github.com/DanySK/multi-jvm-test-plugin/commit/b4c54b6f4efdec5bb001b0b9b39570ce595f7e62))

## [0.5.6](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.5...0.5.6) (2023-10-16)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.9.10 ([e356a53](https://github.com/DanySK/multi-jvm-test-plugin/commit/e356a537271577f7c04586eff250797c14bff121))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.49 ([7e09d26](https://github.com/DanySK/multi-jvm-test-plugin/commit/7e09d26b6327b43d6fb910809115bcdb7e3f1f97))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.50 ([1eab9ca](https://github.com/DanySK/multi-jvm-test-plugin/commit/1eab9ca944801eee11d8aa440ffc992d6e6da3fb))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.51 ([353cbdb](https://github.com/DanySK/multi-jvm-test-plugin/commit/353cbdbbffd3eb8ae19c4dfa0efde7acd58b2a23))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.52 ([5d404b3](https://github.com/DanySK/multi-jvm-test-plugin/commit/5d404b3e8929289a1f80d848b28c75b0ec4f2d24))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.53 ([1e6440d](https://github.com/DanySK/multi-jvm-test-plugin/commit/1e6440d93e7b39db511557dcfa9eebfe4429f7d9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.54 ([fc606de](https://github.com/DanySK/multi-jvm-test-plugin/commit/fc606dee35b0919400270005af2069a5380b5237))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.55 ([8903c61](https://github.com/DanySK/multi-jvm-test-plugin/commit/8903c61e54aa989d66cce482f7dec1b453f24dac))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.56 ([ff1b9be](https://github.com/DanySK/multi-jvm-test-plugin/commit/ff1b9be08e273ccc941e16bb7e1c8493175c83dc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.58 ([b03238f](https://github.com/DanySK/multi-jvm-test-plugin/commit/b03238f6f86c177a6136577ffdf05b4a24776007))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.59 ([ab8a8fb](https://github.com/DanySK/multi-jvm-test-plugin/commit/ab8a8fb0918ee395346f40eefbffe66716f19308))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.60 ([1849b30](https://github.com/DanySK/multi-jvm-test-plugin/commit/1849b30bed229efde3e9727725b11bdbc5916fc2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.61 ([49c6d63](https://github.com/DanySK/multi-jvm-test-plugin/commit/49c6d6383f51a699b95c7adc2b47611ff4f75f99))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.62 ([38dad18](https://github.com/DanySK/multi-jvm-test-plugin/commit/38dad18da63a412a6ac94d95cd1a90cbe9bc6360))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.63 ([2186c68](https://github.com/DanySK/multi-jvm-test-plugin/commit/2186c688d5fdce98f946f5228e1504333abd5f66))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.64 ([c353f6f](https://github.com/DanySK/multi-jvm-test-plugin/commit/c353f6f4daab28d4a0dc0cad5830511ad3b624bc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.65 ([8875c1a](https://github.com/DanySK/multi-jvm-test-plugin/commit/8875c1a0b39a849757b8ba7d2a887e7ae3b3addc))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.67 ([694ecb4](https://github.com/DanySK/multi-jvm-test-plugin/commit/694ecb4e3120c734aa3691692485ed071dc543b7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.68 ([02654fc](https://github.com/DanySK/multi-jvm-test-plugin/commit/02654fc5d76d1419d2482840058bb0691ef1efdc))
* **deps:** update eclipse-temurin docker tag to v21 ([753498f](https://github.com/DanySK/multi-jvm-test-plugin/commit/753498f9eb2b331afb53658756386e79af111933))
* **deps:** update kotest to v5.7.2 ([1e2dea1](https://github.com/DanySK/multi-jvm-test-plugin/commit/1e2dea1e09cfeaebd352972f928bd0ac5ea22f4b))
* **deps:** update node.js to 18.18 ([096ba8d](https://github.com/DanySK/multi-jvm-test-plugin/commit/096ba8d4b2375b9b0f777fb86997da1df240f76c))
* **deps:** update plugin com.gradle.enterprise to v3.15 ([9388c4f](https://github.com/DanySK/multi-jvm-test-plugin/commit/9388c4f14708ed9165ee56cf823273c13e9b32e3))
* **deps:** update plugin com.gradle.enterprise to v3.15.1 ([2644cc4](https://github.com/DanySK/multi-jvm-test-plugin/commit/2644cc4481b3e91fa7b6050767f05015f84d999e))
* **deps:** update plugin multijvmtesting to v0.5.5 ([e49718c](https://github.com/DanySK/multi-jvm-test-plugin/commit/e49718cd8915ebf3fa88de1a1708d01f4132e04a))


### Build and continuous integration

* **deps:** update actions/checkout action to v4 ([a158d2e](https://github.com/DanySK/multi-jvm-test-plugin/commit/a158d2e6230d26ee7f98b65a882eec20c7b657bb))
* **deps:** update actions/checkout action to v4.1.0 ([82f3d74](https://github.com/DanySK/multi-jvm-test-plugin/commit/82f3d7432db570777382fe756664023731d1cd6d))
* **deps:** update danysk/action-checkout action to v0.2.12 ([e5f024c](https://github.com/DanySK/multi-jvm-test-plugin/commit/e5f024c0b1dce78fc43fbe8b73b65e0dcc2a7135))
* **deps:** update danysk/action-checkout action to v0.2.13 ([97cb788](https://github.com/DanySK/multi-jvm-test-plugin/commit/97cb788e0b5106e0ef26d5a94bee91cf1934d670))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.10 ([74b5177](https://github.com/DanySK/multi-jvm-test-plugin/commit/74b5177027c8346076bea47934013244a185a22e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.9 ([379add1](https://github.com/DanySK/multi-jvm-test-plugin/commit/379add15d9370284e529df30ed291525f984c8cb))

## [0.5.5](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.4...0.5.5) (2023-09-01)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.6.0 ([9af190a](https://github.com/DanySK/multi-jvm-test-plugin/commit/9af190ab7d1d25ada42f9709696f345285275d36))
* **deps:** update danysk/action-checkout action to v0.2.11 ([aa0c74d](https://github.com/DanySK/multi-jvm-test-plugin/commit/aa0c74d14a911e59b639d49beaf70039144b0e20))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.7 ([271a441](https://github.com/DanySK/multi-jvm-test-plugin/commit/271a4419900b0f123256375a56ab253e958e9fc2))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.8 ([d4cbc19](https://github.com/DanySK/multi-jvm-test-plugin/commit/d4cbc19e0d219705bbd69f465478195e67db170a))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.9.0 ([7d3c12e](https://github.com/DanySK/multi-jvm-test-plugin/commit/7d3c12ea61aee7aeb1a1941888df28964d8d37d9))
* **deps:** update dependency org.mockito:mockito-core to v5.5.0 ([ffd519f](https://github.com/DanySK/multi-jvm-test-plugin/commit/ffd519f553403c1d88a5ae3a6d1aa934b0e54a0b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.40 ([59d21e5](https://github.com/DanySK/multi-jvm-test-plugin/commit/59d21e5f23fc1079a774c7337b88ee10e4f33560))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.41 ([26d6c1c](https://github.com/DanySK/multi-jvm-test-plugin/commit/26d6c1c7f82449602e98c0924dd58e41b2170202))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.42 ([1a02d71](https://github.com/DanySK/multi-jvm-test-plugin/commit/1a02d71d259e53ef3426dc32abd06cbef3447486))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.43 ([8af1438](https://github.com/DanySK/multi-jvm-test-plugin/commit/8af1438f2a6c03e42785d4b8ac3f756644e6731b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.44 ([e2feb3e](https://github.com/DanySK/multi-jvm-test-plugin/commit/e2feb3e8c53443685d18f2cde6a0058df949f6b0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.46 ([e8983ce](https://github.com/DanySK/multi-jvm-test-plugin/commit/e8983ce9cd0231d107d0b282361108795c950f12))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.47 ([8ef28fb](https://github.com/DanySK/multi-jvm-test-plugin/commit/8ef28fb6f0e2f5a7bcf0428b05bbf5499f7d533c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.48 ([e4c2a4c](https://github.com/DanySK/multi-jvm-test-plugin/commit/e4c2a4cb11dbbaf8b62dfc91f41c1cbf9ceb59d4))
* **deps:** update node.js to 18.17 ([8ff236c](https://github.com/DanySK/multi-jvm-test-plugin/commit/8ff236c3c882a8b5a9c6e05cf5c7c97a452b9e38))
* **deps:** update plugin com.gradle.enterprise to v3.14 ([8d3fc5c](https://github.com/DanySK/multi-jvm-test-plugin/commit/8d3fc5c9cd1a38cde19569eb5c4359d33d2fd371))
* **deps:** update plugin com.gradle.enterprise to v3.14.1 ([383fade](https://github.com/DanySK/multi-jvm-test-plugin/commit/383fadeb7622788af5766437e754069bee837a29))
* **deps:** update plugin gradlepluginpublish to v1.2.1 ([9e8bb96](https://github.com/DanySK/multi-jvm-test-plugin/commit/9e8bb96b31246b9cd3256c620dd003689122449a))
* **deps:** update plugin multijvmtesting to v0.5.4 ([4d38b70](https://github.com/DanySK/multi-jvm-test-plugin/commit/4d38b70b2fdb21195a504099715bd7b5091e30f7))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.10 ([4ee540f](https://github.com/DanySK/multi-jvm-test-plugin/commit/4ee540fbfcbd962c24a0f3edbb9af7859e722468))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.7.0 ([2cd0e8e](https://github.com/DanySK/multi-jvm-test-plugin/commit/2cd0e8eb5809fff4ce35b01c267551581dea788f))

## [0.5.4](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.3...0.5.4) (2023-07-10)


### Dependency updates

* **core-deps:** update dependency gradle to v8.2.1 ([1a133a5](https://github.com/DanySK/multi-jvm-test-plugin/commit/1a133a5c1ddee31ba4cacc591ba62e054ced4758))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.39 ([be333b3](https://github.com/DanySK/multi-jvm-test-plugin/commit/be333b30580361f9bc590d7993b498be96f90037))
* **deps:** update plugin multijvmtesting to v0.5.3 ([f262437](https://github.com/DanySK/multi-jvm-test-plugin/commit/f26243791c4a309e576111318915bc0c456e7882))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.6.0 ([9f6e4ad](https://github.com/DanySK/multi-jvm-test-plugin/commit/9f6e4addd76d74d9f7cb107bf78772080ebe44f6))

## [0.5.3](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.2...0.5.3) (2023-06-30)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.3 ([40f4b8b](https://github.com/DanySK/multi-jvm-test-plugin/commit/40f4b8bb42722fcfd6b49fb9f33a61a32062a4a1))
* **deps:** update danysk/action-checkout action to v0.2.10 ([0929454](https://github.com/DanySK/multi-jvm-test-plugin/commit/09294547c4ff571e7def8c6778d5c8572c15bbca))


### Dependency updates

* **core-deps:** update dependency gradle to v8.2 ([c597c7a](https://github.com/DanySK/multi-jvm-test-plugin/commit/c597c7a9e16b78bfe4a9486e61106b962e4a3c9e))
* **deps:** update dependency org.mockito:mockito-core to v5.4.0 ([e66cb89](https://github.com/DanySK/multi-jvm-test-plugin/commit/e66cb89ca6535d4ed9b57402d0f23b948a13c263))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.32 ([a5f17e9](https://github.com/DanySK/multi-jvm-test-plugin/commit/a5f17e9fd04a7be7b597ce9b8ccfd2a08eb419b0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.33 ([27974ad](https://github.com/DanySK/multi-jvm-test-plugin/commit/27974ad0a8f795cebd2fe565b580aaf1ad7d70bf))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.34 ([b705041](https://github.com/DanySK/multi-jvm-test-plugin/commit/b70504137104ee9e4c7add81b1b602b374bc4e57))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.35 ([2c87ab3](https://github.com/DanySK/multi-jvm-test-plugin/commit/2c87ab3059550cf90e2b695c1c9287a6cd292934))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.36 ([19439be](https://github.com/DanySK/multi-jvm-test-plugin/commit/19439bed9da2fbb6ac86f12dce87e5002ce923d1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.37 ([64080ad](https://github.com/DanySK/multi-jvm-test-plugin/commit/64080ad3dd1f9a182339aa82a08db6de3307077d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.38 ([b87e6e7](https://github.com/DanySK/multi-jvm-test-plugin/commit/b87e6e7841204da7a2d2d7600cf5ef155db5e822))
* **deps:** update plugin com.gradle.enterprise to v3.13.4 ([b3f886e](https://github.com/DanySK/multi-jvm-test-plugin/commit/b3f886e3920ac9d656645ab0e89e5f14b503f142))
* **deps:** update plugin multijvmtesting to v0.5.2 ([f478075](https://github.com/DanySK/multi-jvm-test-plugin/commit/f478075fbf019fb86334209e5e013f3cd983735b))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.8 ([b2a9d25](https://github.com/DanySK/multi-jvm-test-plugin/commit/b2a9d25fd1d05564b1c3f3a29c3c1bbfa358c4a8))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.9 ([ec48b1e](https://github.com/DanySK/multi-jvm-test-plugin/commit/ec48b1e1995823dbb173195e22d2f32acb785e28))

## [0.5.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.1...0.5.2) (2023-06-05)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.5 ([500b6a9](https://github.com/DanySK/multi-jvm-test-plugin/commit/500b6a99f002ee412d77e7e8bfe851bd3c4079f5))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.6 ([a97f02a](https://github.com/DanySK/multi-jvm-test-plugin/commit/a97f02aa7ffb732f5cbddb55a020025d05d46db2))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.8.20 ([b579d51](https://github.com/DanySK/multi-jvm-test-plugin/commit/b579d5189eaae186c4f18e3e136d75a7c7cac8a0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.27 ([8b4e0de](https://github.com/DanySK/multi-jvm-test-plugin/commit/8b4e0de3f07fd8dd5e9508de39fed42c6b93dd82))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.28 ([57f3009](https://github.com/DanySK/multi-jvm-test-plugin/commit/57f30095f170bdc26bd1070e1780d7fb4b5b761f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.29 ([964f910](https://github.com/DanySK/multi-jvm-test-plugin/commit/964f910e2d56c573acc1931b53c1d6872ef8539d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.30 ([08bbd1a](https://github.com/DanySK/multi-jvm-test-plugin/commit/08bbd1ab4157e7f60786a459cbd49b280853fdf9))
* **deps:** update plugin com.gradle.enterprise to v3.13.3 ([8dc82fd](https://github.com/DanySK/multi-jvm-test-plugin/commit/8dc82fd663f28a201aae0542a05de6c9dc1c785d))
* **deps:** update plugin gitsemver to v1.1.10 ([e9b5d68](https://github.com/DanySK/multi-jvm-test-plugin/commit/e9b5d68777dfe6a063ddbddc53d78f4533cdbf39))
* **deps:** update plugin multijvmtesting to v0.5.1 ([7cfb1ee](https://github.com/DanySK/multi-jvm-test-plugin/commit/7cfb1ee22fce7a40f5b565fea09b1ed8c1dbbd4f))

## [0.5.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.5.0...0.5.1) (2023-05-12)


### Bug Fixes

* do not fail if docs.gradle.org is not reachable ([f740f89](https://github.com/DanySK/multi-jvm-test-plugin/commit/f740f89a12cf8c9e18223a84980bd6da18aa1d4d))


### Dependency updates

* **deps:** update kotest to v5.6.2 ([3b11f17](https://github.com/DanySK/multi-jvm-test-plugin/commit/3b11f178feef7a892f96aa52526441f8762bdfa5))
* **deps:** update plugin com.gradle.enterprise to v3.13.2 ([a89876f](https://github.com/DanySK/multi-jvm-test-plugin/commit/a89876fc7e9b4eb6fe313d796eb2b94ab3966dba))
* **deps:** update plugin multijvmtesting to v0.5.0 ([994e0d9](https://github.com/DanySK/multi-jvm-test-plugin/commit/994e0d9983c60c2f66d92c12ea7e7a78cf9eeaf2))

## [0.5.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.23...0.5.0) (2023-05-08)


### Features

* update the maximum Java version to 20 ([54a35bd](https://github.com/DanySK/multi-jvm-test-plugin/commit/54a35bd7ed6c9e1741b39e6b161b7a2298ef43e3))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.4 ([be0563e](https://github.com/DanySK/multi-jvm-test-plugin/commit/be0563eb2c90e806712bcc48e4d7e2460c04eafc))


### Dependency updates

* **deps:** update dependency org.jacoco:org.jacoco.core to v0.8.10 ([38dd9b2](https://github.com/DanySK/multi-jvm-test-plugin/commit/38dd9b221e9a0f917e16bf49f0558fc3d62e59fa))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.26 ([23156f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/23156f50b7dcfca8152d11229ae465b42ac57918))
* **deps:** update plugin com.gradle.enterprise to v3.13.1 ([b7d8a7b](https://github.com/DanySK/multi-jvm-test-plugin/commit/b7d8a7b6826aade85f01329244d2802e28b27547))
* **deps:** update plugin gitsemver to v1.1.9 ([ac945f0](https://github.com/DanySK/multi-jvm-test-plugin/commit/ac945f05a25809b48af12439d0a6fec8ea44a72e))
* **deps:** update plugin jacoco-testkit to v1.0.12 ([d08f0f9](https://github.com/DanySK/multi-jvm-test-plugin/commit/d08f0f9b9799cab3e9aceee40342753f3d25e2bd))
* **deps:** update plugin kotlin-qa to v0.38.1 ([2821e06](https://github.com/DanySK/multi-jvm-test-plugin/commit/2821e06f826f317066554450be2ee6b57f772507))
* **deps:** update plugin kotlin-qa to v0.38.2 ([e47718b](https://github.com/DanySK/multi-jvm-test-plugin/commit/e47718ba397c9d998fdfa66f84cf1d3ed4f7e229))
* **deps:** update plugin kotlin-qa to v0.39.0 ([165d097](https://github.com/DanySK/multi-jvm-test-plugin/commit/165d0977457f75c5a13956c4ee6966b037e10374))
* **deps:** update plugin kotlin-qa to v0.40.0 ([3bdafe5](https://github.com/DanySK/multi-jvm-test-plugin/commit/3bdafe5a99c7f99dc1ce44520546c55e90c25dcf))
* **deps:** update plugin multijvmtesting to v0.4.23 ([ee729ec](https://github.com/DanySK/multi-jvm-test-plugin/commit/ee729ecf7b574e503f8559b8ddcfabf537da604d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.7 ([67419e8](https://github.com/DanySK/multi-jvm-test-plugin/commit/67419e8b6fd383212707ef201fd14cf97a72897e))
* **deps:** update plugin org.gradle.toolchains.foojay-resolver-convention to v0.5.0 ([0bcd7d2](https://github.com/DanySK/multi-jvm-test-plugin/commit/0bcd7d2cbf467430af5f87a38f1db3f51f8645a9))
* **deps:** update plugin publishoncentral to v5.0.3 ([c0524fe](https://github.com/DanySK/multi-jvm-test-plugin/commit/c0524febf7ba3451f92f231ec85e5feb569aafb0))
* **deps:** update plugin publishoncentral to v5.0.4 ([70d573d](https://github.com/DanySK/multi-jvm-test-plugin/commit/70d573da755bdb088feb417aa45114cffe16ade6))

## [0.4.23](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.22...0.4.23) (2023-04-21)


### Dependency updates

* **core-deps:** update dependency gradle to v8.1.1 ([fb25015](https://github.com/DanySK/multi-jvm-test-plugin/commit/fb25015673251b26d9abee29e23b9640409f3ca9))
* **deps:** update dependency org.mockito:mockito-core to v5.3.1 ([e11fd6f](https://github.com/DanySK/multi-jvm-test-plugin/commit/e11fd6fd4eb985288f924f4d9e2ae669d7b36c43))
* **deps:** update plugin multijvmtesting to v0.4.22 ([2a9e466](https://github.com/DanySK/multi-jvm-test-plugin/commit/2a9e46641f944417aa97f278f84f7c4d7085bd49))

## [0.4.22](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.21...0.4.22) (2023-04-21)


### Bug Fixes

* the latest version of Java supported by Gradle can never be newer than the latest existing ([a6c8176](https://github.com/DanySK/multi-jvm-test-plugin/commit/a6c817635478488fe8c96082f0634ece70122d6f))
* update org.danilopianini.multi-jvm-test-plugin to 0.4.21-dev07-a6c8176 ([aec7b5f](https://github.com/DanySK/multi-jvm-test-plugin/commit/aec7b5ff33a48d2181c615a7b670dd8c61bfa600))


### Build and continuous integration

* **release:** disable comments on PRs upon release ([d730060](https://github.com/DanySK/multi-jvm-test-plugin/commit/d7300600b476a4ba28710a97aa5525633df7ab4d))


### Dependency updates

* **deps:** update plugin gitsemver to v1.1.8 ([4d02474](https://github.com/DanySK/multi-jvm-test-plugin/commit/4d0247419720d61f0bbc15ae8e8beaa90b680bbb))
* **deps:** update plugin multijvmtesting to v0.4.21 ([c4fe445](https://github.com/DanySK/multi-jvm-test-plugin/commit/c4fe4458a2b3d06de7e13bde25368e598fe88ffe))
* **deps:** update plugin publishoncentral to v5.0.1 ([8961794](https://github.com/DanySK/multi-jvm-test-plugin/commit/896179448cd72802915571abc87dfaa159b844f1))
* **deps:** update plugin publishoncentral to v5.0.2 ([7050aa5](https://github.com/DanySK/multi-jvm-test-plugin/commit/7050aa5dd427c038220196378414b4e50a81eaed))


### Tests

* add a test to try that the latest gradle version can be intercepted correctly ([ee10098](https://github.com/DanySK/multi-jvm-test-plugin/commit/ee100986dafb8ba4209a4aef8727a908e1147c8e))


### Style improvements

* fix several style issues ([3a16ad1](https://github.com/DanySK/multi-jvm-test-plugin/commit/3a16ad1e7c286f4f6da39226c6a2699a4ad4493a))

## [0.4.21](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.20...0.4.21) (2023-04-19)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.1 ([bd954ec](https://github.com/DanySK/multi-jvm-test-plugin/commit/bd954ecfc1631a17d6c46ef83e838dd2c23ebf01))
* **deps:** update actions/checkout action to v3.5.2 ([97420aa](https://github.com/DanySK/multi-jvm-test-plugin/commit/97420aab7b9810cfa6502f774316e91a9dfdf551))
* **deps:** update danysk/action-checkout action to v0.2.8 ([78be3af](https://github.com/DanySK/multi-jvm-test-plugin/commit/78be3af1e0900bc3d495c8166c5adfc0422aae45))
* **deps:** update danysk/action-checkout action to v0.2.9 ([5db59ca](https://github.com/DanySK/multi-jvm-test-plugin/commit/5db59cace682f6ace1556fe9b89d74f20b18d729))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.3 ([5f94cc3](https://github.com/DanySK/multi-jvm-test-plugin/commit/5f94cc346e195c29185cb6767c6f83b542c47451))


### Dependency updates

* **core-deps:** update dependency gradle to v8.1 ([#372](https://github.com/DanySK/multi-jvm-test-plugin/issues/372)) ([4828772](https://github.com/DanySK/multi-jvm-test-plugin/commit/4828772ae9ea9b4325a85884407eeb05f95c3fb2))
* **deps:** update dependency org.jacoco:org.jacoco.core to v0.8.9 ([a018fd7](https://github.com/DanySK/multi-jvm-test-plugin/commit/a018fd71c34d997a1eb011833cad818665a40a8a))
* **deps:** update dependency org.mockito:mockito-core to v5.3.0 ([9dec072](https://github.com/DanySK/multi-jvm-test-plugin/commit/9dec07253619cd811a8685c90f977b8df83a42c9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.23 ([227e885](https://github.com/DanySK/multi-jvm-test-plugin/commit/227e8851f094aa1d3d0578a7c07334328343da27))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.24 ([e17eca3](https://github.com/DanySK/multi-jvm-test-plugin/commit/e17eca31de288be5fcfc0b8f9f5c6600e98a1b5a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.25 ([d7484ba](https://github.com/DanySK/multi-jvm-test-plugin/commit/d7484baa268093f403fa01f08a66ca8bdc70c0f5))
* **deps:** update kotest to v5.6.0 ([140331c](https://github.com/DanySK/multi-jvm-test-plugin/commit/140331cdaf5ac8e944eeb6888055f89c476df855))
* **deps:** update kotest to v5.6.1 ([de1f2f0](https://github.com/DanySK/multi-jvm-test-plugin/commit/de1f2f046ed312a714655f017482d09c9ac7a873))
* **deps:** update node.js to 18.16 ([b6d8bd0](https://github.com/DanySK/multi-jvm-test-plugin/commit/b6d8bd0d0b0184f9671ff7168769c0075ef9f30d))
* **deps:** update plugin com.gradle.enterprise to v3.13 ([4532417](https://github.com/DanySK/multi-jvm-test-plugin/commit/4532417c992aaadf1b0dcaa91e4b770e91eba533))
* **deps:** update plugin gitsemver to v1.1.6 ([51bddac](https://github.com/DanySK/multi-jvm-test-plugin/commit/51bddac4769d5e39a0fc75dfd2477b1f3ae1ff7b))
* **deps:** update plugin gitsemver to v1.1.7 ([cbc43da](https://github.com/DanySK/multi-jvm-test-plugin/commit/cbc43da105a43a0c7944b768923674b06e83e911))
* **deps:** update plugin gradlepluginpublish to v1.2.0 ([74fd218](https://github.com/DanySK/multi-jvm-test-plugin/commit/74fd2182d05c7a0478005cdfaf20b581feb94a9e))
* **deps:** update plugin multijvmtesting to v0.4.20 ([3db1c6c](https://github.com/DanySK/multi-jvm-test-plugin/commit/3db1c6ccf94d850a084cfd4e5d7a9803a8477708))
* **deps:** update plugin publishoncentral to v4.1.0 ([fc21a8d](https://github.com/DanySK/multi-jvm-test-plugin/commit/fc21a8d1517ee2e8c06e421c8f47918788e90967))
* **deps:** update plugin publishoncentral to v4.1.1 ([16778de](https://github.com/DanySK/multi-jvm-test-plugin/commit/16778def8635279582754fdb6d24f6cb27010f31))
* **deps:** update plugin publishoncentral to v5 ([1020fd3](https://github.com/DanySK/multi-jvm-test-plugin/commit/1020fd359b77eba12dae92bc8adf367d4a140dfb))

## [0.4.20](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.19...0.4.20) (2023-04-02)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.4.0 ([ddc3db3](https://github.com/DanySK/multi-jvm-test-plugin/commit/ddc3db3cf28bf9c94ce5cf6c69144be86274c95b))
* **deps:** update actions/checkout action to v3.5.0 ([975b3d7](https://github.com/DanySK/multi-jvm-test-plugin/commit/975b3d7ebb6f3bcf0b9421459e3c15edcd36c602))
* **deps:** update danysk/action-checkout action to v0.2.6 ([3f3aad1](https://github.com/DanySK/multi-jvm-test-plugin/commit/3f3aad1b3b4cbea429aa26dcc53f833ffbab4cc4))
* **deps:** update danysk/action-checkout action to v0.2.7 ([f21cd09](https://github.com/DanySK/multi-jvm-test-plugin/commit/f21cd096c3be57cf7942c2511c58c017bfd8fae6))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.1 ([c5f223e](https://github.com/DanySK/multi-jvm-test-plugin/commit/c5f223efaf04937b7350a78c0e01329290dea093))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.2 ([2c79e8d](https://github.com/DanySK/multi-jvm-test-plugin/commit/2c79e8de38cbf7e9e420e705c7bcab35c278de4a))
* **mergify:** disable auto-rebasing due to Mergifyio/mergify[#5074](https://github.com/DanySK/multi-jvm-test-plugin/issues/5074) ([be259bb](https://github.com/DanySK/multi-jvm-test-plugin/commit/be259bb1ab608b134152032a1faad516fba96c10))
* **mergify:** disable auto-rebasing due to Mergifyio/mergify[#5074](https://github.com/DanySK/multi-jvm-test-plugin/issues/5074) ([ef97633](https://github.com/DanySK/multi-jvm-test-plugin/commit/ef97633e6eda7368e62ae87165ce78583f3ec437))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v1.8.20 ([baebc2f](https://github.com/DanySK/multi-jvm-test-plugin/commit/baebc2f44df93adf4467bd2f8d05cf394b2d4cac))
* **deps:** update dependency org.mockito:mockito-core to v5.2.0 ([c192c23](https://github.com/DanySK/multi-jvm-test-plugin/commit/c192c235a5cf769a82155f0eaba36533a95119a7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.17 ([89860a9](https://github.com/DanySK/multi-jvm-test-plugin/commit/89860a93e9a15f1a752337b81f42efe7d9c5567d))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.19 ([92f5302](https://github.com/DanySK/multi-jvm-test-plugin/commit/92f5302b3faea18f83bd209e1dd5143af9776b56))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.20 ([70ab045](https://github.com/DanySK/multi-jvm-test-plugin/commit/70ab0454a90bcbf658a928a432cec11e5119086b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.21 ([966f515](https://github.com/DanySK/multi-jvm-test-plugin/commit/966f5156bbee80b9a021fd276b4df2afe95754a4))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.22 ([6f7664f](https://github.com/DanySK/multi-jvm-test-plugin/commit/6f7664fd9f5fab6389ce5f4e0d76612dd7c8bbd4))
* **deps:** update node.js to 18.15 ([4f498f9](https://github.com/DanySK/multi-jvm-test-plugin/commit/4f498f93a5b64ec53f87338ae73ca60ef1dbe270))
* **deps:** update plugin com.gradle.enterprise to v3.12.5 ([fec7571](https://github.com/DanySK/multi-jvm-test-plugin/commit/fec757162f59500fc6f1cc2f6b9cd12b86a75cc1))
* **deps:** update plugin com.gradle.enterprise to v3.12.6 ([c432a26](https://github.com/DanySK/multi-jvm-test-plugin/commit/c432a26be14dde8f86bcde2af7493fa51b2d0ebb))
* **deps:** update plugin gitsemver to v1.1.4 ([52d88e7](https://github.com/DanySK/multi-jvm-test-plugin/commit/52d88e774400bb75a173888f33f2972bd10fc58a))
* **deps:** update plugin gitsemver to v1.1.5 ([4b2bb2b](https://github.com/DanySK/multi-jvm-test-plugin/commit/4b2bb2be732829b5c035a2125a7e5302abfaba64))
* **deps:** update plugin multijvmtesting to v0.4.18 ([098af51](https://github.com/DanySK/multi-jvm-test-plugin/commit/098af51abb5d8d787eaa464641ed4e09e96e7451))
* **deps:** update plugin multijvmtesting to v0.4.19 ([0bd56c7](https://github.com/DanySK/multi-jvm-test-plugin/commit/0bd56c746e66d49836942532b38e65c431a497dd))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.5 ([663e86f](https://github.com/DanySK/multi-jvm-test-plugin/commit/663e86f3a792fa6608702a07fb1a5698e5a45e7d))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.6 ([4f5f8e3](https://github.com/DanySK/multi-jvm-test-plugin/commit/4f5f8e369ff66cca4a78c1697e0e0c10a1f57bce))
* **deps:** update plugin publishoncentral to v3.3.1 ([aee7ef8](https://github.com/DanySK/multi-jvm-test-plugin/commit/aee7ef8bb27d925355be53926152156d5af9ed78))
* **deps:** update plugin publishoncentral to v3.3.2 ([88cbc7f](https://github.com/DanySK/multi-jvm-test-plugin/commit/88cbc7fc9c21996e84b31d8de16fcd33f52de9a8))
* **deps:** update plugin publishoncentral to v3.3.3 ([34e7e7a](https://github.com/DanySK/multi-jvm-test-plugin/commit/34e7e7a81755b29e3a9e28f1d2697994ab016fad))
* **deps:** update plugin publishoncentral to v3.4.0 ([ff49f91](https://github.com/DanySK/multi-jvm-test-plugin/commit/ff49f913c3673fc50801c4348584166c5122db8c))
* **deps:** update plugin publishoncentral to v4 ([f70f30c](https://github.com/DanySK/multi-jvm-test-plugin/commit/f70f30cc9eeb97b5ab9070a443f9e8eb623d41a9))
* **deps:** update plugin publishoncentral to v4.0.1 ([6243fad](https://github.com/DanySK/multi-jvm-test-plugin/commit/6243fadbd40e3725cab0c81c5b6c8c08e06471af))

## [0.4.19](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.18...0.4.19) (2023-03-04)


### Dependency updates

* **core-deps:** update dependency gradle to v8.0.2 ([284b0ac](https://github.com/DanySK/multi-jvm-test-plugin/commit/284b0acf8a47b98ab9d96774bb60c35d0f907402))

## [0.4.18](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.17...0.4.18) (2023-03-04)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.26 ([d1f78bb](https://github.com/DanySK/multi-jvm-test-plugin/commit/d1f78bb1fd34748284722779084cac9fae7268c5))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.2.0 ([3a10d6c](https://github.com/DanySK/multi-jvm-test-plugin/commit/3a10d6cda5b0772f05e22eb9f226ba8d45001263))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.8.10 ([cf2fe09](https://github.com/DanySK/multi-jvm-test-plugin/commit/cf2fe098261b6700cdd54b26c56c08e02768f246))
* **deps:** update plugin com.gradle.enterprise to v3.12.4 ([7ef5a81](https://github.com/DanySK/multi-jvm-test-plugin/commit/7ef5a8187a9eb8a7306cd2f538cd099454965eec))
* **deps:** update plugin gitsemver to v1.1.1 ([5f57faa](https://github.com/DanySK/multi-jvm-test-plugin/commit/5f57faacdfaed26207f8e8d3ee99031ede89df96))
* **deps:** update plugin gitsemver to v1.1.2 ([1631362](https://github.com/DanySK/multi-jvm-test-plugin/commit/1631362c397ac6026067c38931e372f0c65644c4))
* **deps:** update plugin multijvmtesting to v0.4.17 ([0b229de](https://github.com/DanySK/multi-jvm-test-plugin/commit/0b229de8ab133153e6fdc19c4eb6b454fd2e804c))
* **deps:** update plugin publishoncentral to v3.2.4 ([f4af22e](https://github.com/DanySK/multi-jvm-test-plugin/commit/f4af22ef179edef5b7aa898bdecdf999504478eb))
* **deps:** update plugin publishoncentral to v3.3.0 ([b517c49](https://github.com/DanySK/multi-jvm-test-plugin/commit/b517c49f1ffa8ed041c0b1d9d42778e864d0798b))

## [0.4.17](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.16...0.4.17) (2023-02-19)


### Bug Fixes

* improve the support for mixed Java/Kotlin builds ([0c7388f](https://github.com/DanySK/multi-jvm-test-plugin/commit/0c7388f952e5761f97a180ef83472d8efb04ae36))


### Dependency updates

* **deps:** update plugin gitsemver to v1.0.2 ([f23a50b](https://github.com/DanySK/multi-jvm-test-plugin/commit/f23a50b9c2a6806bc6f0499999f6ee3e97c4a3a4))
* **deps:** update plugin multijvmtesting to v0.4.16 ([f49ca17](https://github.com/DanySK/multi-jvm-test-plugin/commit/f49ca17713a31a162c7cb2422f8fb14533b1a9f6))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.3 ([35017f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/35017f5ec40b14b2f6731555910fa89300e85314))
* **deps:** update plugin publishoncentral to v3.2.3 ([14c3c27](https://github.com/DanySK/multi-jvm-test-plugin/commit/14c3c27bb32c4197fb97f49e443cd29f814e0ded))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.25 ([37b621f](https://github.com/DanySK/multi-jvm-test-plugin/commit/37b621f085b806419d6082a3c83124ad907b35ee))
* enable JaCoCo ([3dca907](https://github.com/DanySK/multi-jvm-test-plugin/commit/3dca9079136b793d2f66e96920084c4fab7d4c77))
* use the lazy configuration API ([399677f](https://github.com/DanySK/multi-jvm-test-plugin/commit/399677f48d2d4cd7eab4c77620b35a7a3ce9f831))


### Documentation

* document the need for `org.gradle.toolchains.foojay-resolver-convention` ([d4b6302](https://github.com/DanySK/multi-jvm-test-plugin/commit/d4b63028d75e5d408648e76695f0388a639983b6))

## [0.4.16](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.15...0.4.16) (2023-02-19)


### General maintenance

* **build:** remove feature preview for catalogs (it is mainline Gradle now) ([64b26d8](https://github.com/DanySK/multi-jvm-test-plugin/commit/64b26d83c2be576e8ca91ea65cfa38cd5206d032))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.3.0 ([eea8ad3](https://github.com/DanySK/multi-jvm-test-plugin/commit/eea8ad38a7dd548e78d6fe98ea8f7525f5a72c0f))
* **deps:** update danysk/action-checkout action to v0.2.5 ([c3fab60](https://github.com/DanySK/multi-jvm-test-plugin/commit/c3fab60fc24eb95707f5c03d061ba9e7d552e196))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.20 ([4d6574d](https://github.com/DanySK/multi-jvm-test-plugin/commit/4d6574d12ab2643188d102ca580207c6453f5bfc))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.21 ([52708e3](https://github.com/DanySK/multi-jvm-test-plugin/commit/52708e3ddbe59a6aa764cf55883b31d8994df9f8))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.22 ([bb9fa72](https://github.com/DanySK/multi-jvm-test-plugin/commit/bb9fa72cfdb75c94a9407c4f9acdbd68b2c75cd3))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.23 ([7a6c42c](https://github.com/DanySK/multi-jvm-test-plugin/commit/7a6c42c507cc9c614a672966cd4049cfafbb2f7b))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.24 ([c853a5a](https://github.com/DanySK/multi-jvm-test-plugin/commit/c853a5afcc97269a9654362c3150276bb2db4908))
* disable windows testing as runners have too little disk space ([987dd0a](https://github.com/DanySK/multi-jvm-test-plugin/commit/987dd0ab9af4872255f6e49e9c8d68ad5cd32e16))
* enable concurrency canceling of old jobs ([60e8204](https://github.com/DanySK/multi-jvm-test-plugin/commit/60e8204ab15ba9adb8f18e5bd9b7f7d104b06e68))
* fix the github actions runner's OS version ([87c1d4c](https://github.com/DanySK/multi-jvm-test-plugin/commit/87c1d4ca6923d471b59781e97a82021ff3f93819))
* just limit testing under Windows, do not compile with newer Java ([dbcdc1c](https://github.com/DanySK/multi-jvm-test-plugin/commit/dbcdc1ca56aa084fb5e6a91a93faac8c8c277abc))
* limit testing under Windows GHA runners ([eb850b4](https://github.com/DanySK/multi-jvm-test-plugin/commit/eb850b47d89f3910f96b8801c460871a56ddd26d))
* **mergify:** update the rules from Alchemist ([11dc7b5](https://github.com/DanySK/multi-jvm-test-plugin/commit/11dc7b5dcac436a4721cb9cd4e48ecf068b95d6b))
* update the URL refs ([f5c214a](https://github.com/DanySK/multi-jvm-test-plugin/commit/f5c214a58cfbc4a7b1a376d0909df0dfa5bdd828))


### Dependency updates

* **core-deps:** update dependency gradle to v8 ([#310](https://github.com/DanySK/multi-jvm-test-plugin/issues/310)) ([39d7ec1](https://github.com/DanySK/multi-jvm-test-plugin/commit/39d7ec154ffa2e0fb583092c755a154dbd32b2ec))
* **core-deps:** update dependency gradle to v8.0.1 ([6697432](https://github.com/DanySK/multi-jvm-test-plugin/commit/66974321c1d69fa954671d0e80312c564b7db9c9))
* **deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.8.10 ([c22ec5d](https://github.com/DanySK/multi-jvm-test-plugin/commit/c22ec5db83805712296e9692a5ab673e13ee0086))
* **deps:** update dependency org.mockito:mockito-core to v4.11.0 ([2334ed6](https://github.com/DanySK/multi-jvm-test-plugin/commit/2334ed6dbd9c139b03e26b0afee8f122bdcddbc8))
* **deps:** update dependency org.mockito:mockito-core to v5 ([255765a](https://github.com/DanySK/multi-jvm-test-plugin/commit/255765a88ddbe8e394f2c2b92812312d49fa62eb))
* **deps:** update dependency org.mockito:mockito-core to v5.1.0 ([8db2ca5](https://github.com/DanySK/multi-jvm-test-plugin/commit/8db2ca56e1d321a1114fc7c57155247990206f89))
* **deps:** update dependency org.mockito:mockito-core to v5.1.1 ([868640f](https://github.com/DanySK/multi-jvm-test-plugin/commit/868640feb317e8149dec27ad1407c7fc7a475e33))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.16 ([55a60cb](https://github.com/DanySK/multi-jvm-test-plugin/commit/55a60cb3da207333ef8c8c031b8c129bd3f9898b))
* **deps:** update kotest to v5.5.5 ([ecdd922](https://github.com/DanySK/multi-jvm-test-plugin/commit/ecdd92265a8de3673efffc34b408de99e9ec1a17))
* **deps:** update node.js to 18.13 ([416992c](https://github.com/DanySK/multi-jvm-test-plugin/commit/416992c94a7652248e37c4853bb087a829cb5843))
* **deps:** update node.js to 18.14 ([f466bf7](https://github.com/DanySK/multi-jvm-test-plugin/commit/f466bf76d0bc326588a371307f5d21ba681ded5f))
* **deps:** update plugin com.gradle.enterprise to v3.12.3 ([12e3527](https://github.com/DanySK/multi-jvm-test-plugin/commit/12e3527b70d34a08d8ca5af246cbe39ce30a8089))
* **deps:** update plugin gitsemver to v1 ([852a985](https://github.com/DanySK/multi-jvm-test-plugin/commit/852a985e2b33fd6a3bab8702bd8a455801197b5b))
* **deps:** update plugin gradlepluginpublish to v1.1.0 ([9bed36d](https://github.com/DanySK/multi-jvm-test-plugin/commit/9bed36d3bf78057e0a77099e37cfddd5622f8fa4))
* **deps:** update plugin kotlin-qa to v0.29.2 ([a28b26b](https://github.com/DanySK/multi-jvm-test-plugin/commit/a28b26ba6439ee44b15b7678c79991d9924afb07))
* **deps:** update plugin multijvmtesting to v0.4.15 ([076b6e4](https://github.com/DanySK/multi-jvm-test-plugin/commit/076b6e4fa288b2a2604a270278401c3b15752449))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.1 ([7840176](https://github.com/DanySK/multi-jvm-test-plugin/commit/784017622a8e2e35e2ad46edf15a14324625a4f9))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.2 ([50d71e5](https://github.com/DanySK/multi-jvm-test-plugin/commit/50d71e5588a3a312119b8645e551f851f4827fb3))
* **deps:** update plugin publishoncentral to v2.0.12 ([0bcfce4](https://github.com/DanySK/multi-jvm-test-plugin/commit/0bcfce46a66a61ce7c93453f864f3c5d385c4091))
* **deps:** update plugin publishoncentral to v3 ([b6e5962](https://github.com/DanySK/multi-jvm-test-plugin/commit/b6e596277ea7c0180615de1fe9b3985850c144fb))
* **deps:** update plugin tasktree to v2.1.1 ([4281ab7](https://github.com/DanySK/multi-jvm-test-plugin/commit/4281ab7fd1160a1266aa9b2da574e834eeaf3776))

## [0.4.15](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.14...0.4.15) (2022-12-30)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.2.0 ([5bf8cc5](https://github.com/DanySK/multi-jvm-test-plugin/commit/5bf8cc5d86ac647f213bae9a0fb9e369a4239008))
* **deps:** update danysk/action-checkout action to v0.2.4 ([f7453e1](https://github.com/DanySK/multi-jvm-test-plugin/commit/f7453e1842301dcf3e34858b95bd24ecf29a0d5f))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.15 ([86877b4](https://github.com/DanySK/multi-jvm-test-plugin/commit/86877b471a195624d9924c5fea224e676d4441cd))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.16 ([bc566ed](https://github.com/DanySK/multi-jvm-test-plugin/commit/bc566edec2231217a04bd201e61c3569f088e816))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.17 ([65f5f32](https://github.com/DanySK/multi-jvm-test-plugin/commit/65f5f326f66def40436281e7a1f9f649d3e9be1d))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.19 ([59d0c02](https://github.com/DanySK/multi-jvm-test-plugin/commit/59d0c0269c58f3754744c6605786ad984cb73256))


### Dependency updates

* **core-deps:** update kotlin monorepo to v1.8.0 ([d8af85f](https://github.com/DanySK/multi-jvm-test-plugin/commit/d8af85fddc9ad186002f8ac3fa9b03ac15f35a44))
* **deps:** update dependency org.mockito:mockito-core to v4.10.0 ([67347eb](https://github.com/DanySK/multi-jvm-test-plugin/commit/67347ebebff5a3f317c7fea012740bdd90e19dc3))
* **deps:** update plugin kotlin-qa to v0.29.0 ([9d8c267](https://github.com/DanySK/multi-jvm-test-plugin/commit/9d8c2672d46fc1ce01b557127a13945cc1f501d6))
* **deps:** update plugin kotlin-qa to v0.29.1 ([22017af](https://github.com/DanySK/multi-jvm-test-plugin/commit/22017af9af242ca1804f5438fd59116eefe9c50c))
* **deps:** update plugin multijvmtesting to v0.4.14 ([073aac9](https://github.com/DanySK/multi-jvm-test-plugin/commit/073aac961de777e6e19d45f708615e12b09faf5e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.24 ([6dc8127](https://github.com/DanySK/multi-jvm-test-plugin/commit/6dc81279034adac9a9540bb06944458d4161b618))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.25 ([dbf4f13](https://github.com/DanySK/multi-jvm-test-plugin/commit/dbf4f1370532081934c106a5f1b732a4f1438bb4))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.1.0 ([55046b2](https://github.com/DanySK/multi-jvm-test-plugin/commit/55046b21b98ee1830a90eb61a78a03f6c0fa869a))
* **deps:** update plugin publishoncentral to v2.0.10 ([c9110e5](https://github.com/DanySK/multi-jvm-test-plugin/commit/c9110e5daee68aa95510bc14537d9944496b61ea))
* **deps:** update plugin publishoncentral to v2.0.11 ([0b9a14c](https://github.com/DanySK/multi-jvm-test-plugin/commit/0b9a14cac7422a15acc86ee9cea4f3ee480bdb03))

## [0.4.14](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.13...0.4.14) (2022-12-01)


### Dependency updates

* **core-deps:** update kotlin monorepo to v1.7.22 ([c9a884b](https://github.com/DanySK/multi-jvm-test-plugin/commit/c9a884bbb546f3b23310842cf5ced71f210ad0fd))
* **deps:** update dependency org.mockito:mockito-core to v4.9.0 ([8bd14f6](https://github.com/DanySK/multi-jvm-test-plugin/commit/8bd14f649a246b6fcd68b17f8da08ffc4f4cb31d))
* **deps:** update plugin kotlin-qa to v0.27.1 ([03426a9](https://github.com/DanySK/multi-jvm-test-plugin/commit/03426a9a8385b07a8b8300a32fd6821d198abb78))
* **deps:** update plugin kotlin-qa to v0.28.0 ([587881a](https://github.com/DanySK/multi-jvm-test-plugin/commit/587881a14aa8a5d8da639622c80715cd01105f55))
* **deps:** update plugin multijvmtesting to v0.4.13 ([941d501](https://github.com/DanySK/multi-jvm-test-plugin/commit/941d5019dbe9fa216216ca7aca293d151c6aa640))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.23 ([63e8d24](https://github.com/DanySK/multi-jvm-test-plugin/commit/63e8d24ae5819e28a6fa1ffcadd9f181f6010fe3))
* **deps:** update plugin publishoncentral to v2.0.9 ([abfe5a0](https://github.com/DanySK/multi-jvm-test-plugin/commit/abfe5a001ad261bb67abe3bb4e656728ef81dcf9))

## [0.4.13](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.12...0.4.13) (2022-11-11)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.11 ([bf9a7c7](https://github.com/DanySK/multi-jvm-test-plugin/commit/bf9a7c799ed877ad79a17c6351421a2d848fd4b3))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.12 ([efd39fe](https://github.com/DanySK/multi-jvm-test-plugin/commit/efd39febff242e75eed2ffe6ab4d6f466e068277))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.13 ([3b8189f](https://github.com/DanySK/multi-jvm-test-plugin/commit/3b8189fe9af894b82518f8b2c7073cfab15ac613))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.14 ([a65ed9c](https://github.com/DanySK/multi-jvm-test-plugin/commit/a65ed9c56ee9b593a467eaefa91ae2a32e901efe))


### Dependency updates

* **core-deps:** update kotlin monorepo to v1.7.21 ([4ef230d](https://github.com/DanySK/multi-jvm-test-plugin/commit/4ef230d60de7c8130647499d0c9df3b0f02b08c4))
* **deps:** update dependency org.mockito:mockito-core to v4.8.1 ([d03bea4](https://github.com/DanySK/multi-jvm-test-plugin/commit/d03bea46e93a1e650e89b53e34ddbb3d161faa38))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.12 ([2bb39ac](https://github.com/DanySK/multi-jvm-test-plugin/commit/2bb39ac212d40240d4d65e16faf73111025d896f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.13 ([481cfc5](https://github.com/DanySK/multi-jvm-test-plugin/commit/481cfc558c220bf0cd565a795bb8635290eb83dd))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.14 ([262818e](https://github.com/DanySK/multi-jvm-test-plugin/commit/262818e90266c1d3e912fd0eb59c5b7bf4a15a50))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.15 ([82c0cb5](https://github.com/DanySK/multi-jvm-test-plugin/commit/82c0cb552681a9cd066312acc242d017f7e03be3))
* **deps:** update kotest to v5.5.2 ([db4dffc](https://github.com/DanySK/multi-jvm-test-plugin/commit/db4dffc6a63800b4111de060c22b85edb8962877))
* **deps:** update kotest to v5.5.3 ([6cd5f84](https://github.com/DanySK/multi-jvm-test-plugin/commit/6cd5f84794c88b7c575a08b8cbe3917ab81c2e28))
* **deps:** update kotest to v5.5.4 ([b8347f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/b8347f59e6ae511d60f2d567510753d5a49f591f))
* **deps:** update node.js to 16.18 ([e05baff](https://github.com/DanySK/multi-jvm-test-plugin/commit/e05baff73b3e8bb267382ae15cb8608a2339a173))
* **deps:** update node.js to 18.12 ([51945b1](https://github.com/DanySK/multi-jvm-test-plugin/commit/51945b1e6133da675544529bc47393b72505e5cc))
* **deps:** update node.js to v18 ([3d59b45](https://github.com/DanySK/multi-jvm-test-plugin/commit/3d59b4562b29bf48390d1b8928a9bdd4f2256ea8))
* **deps:** update plugin kotlin-qa to v0.26.1 ([70a7468](https://github.com/DanySK/multi-jvm-test-plugin/commit/70a74683cd6ea13961433f0a6116490197117ff3))
* **deps:** update plugin kotlin-qa to v0.27.0 ([862671c](https://github.com/DanySK/multi-jvm-test-plugin/commit/862671cf5fe855097c54cb08974f034b7519c22e))
* **deps:** update plugin multijvmtesting to v0.4.12 ([b011f7f](https://github.com/DanySK/multi-jvm-test-plugin/commit/b011f7f299239844ba94a10d169089b62bdb5b56))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.22 ([779c512](https://github.com/DanySK/multi-jvm-test-plugin/commit/779c51276ff14ad72266b1e999c7b6900c431f52))
* **deps:** update plugin publishoncentral to v2.0.7 ([0b5b826](https://github.com/DanySK/multi-jvm-test-plugin/commit/0b5b82606fb84ee5e8353f330a30a3472320ffab))
* **deps:** update plugin publishoncentral to v2.0.8 ([684c2d3](https://github.com/DanySK/multi-jvm-test-plugin/commit/684c2d30c025bad144b33e9f9e71b23bada98ca7))

## [0.4.12](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.11...0.4.12) (2022-10-14)


### Build and continuous integration

* **deps:** update actions/checkout action to v3.1.0 ([97532bc](https://github.com/DanySK/multi-jvm-test-plugin/commit/97532bcd26cf1453e6bca71074267d8c93755a0e))
* **deps:** update danysk/action-checkout action to v0.2.3 ([44ff381](https://github.com/DanySK/multi-jvm-test-plugin/commit/44ff38110328fb52da48f06c25e63b09fc5b715a))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.10 ([d6ee6d1](https://github.com/DanySK/multi-jvm-test-plugin/commit/d6ee6d1af1a8581063a03a5a838a04be23f7e33b))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.7.20 ([318fb96](https://github.com/DanySK/multi-jvm-test-plugin/commit/318fb96bd28de34a733a59e35065b83066e4dcb9))
* **deps:** update kotest to v5.5.0 ([a933d01](https://github.com/DanySK/multi-jvm-test-plugin/commit/a933d012bb076682ef8f0ec9a7a5e4c4840d3a27))
* **deps:** update kotest to v5.5.1 ([5988979](https://github.com/DanySK/multi-jvm-test-plugin/commit/5988979ba8665a13bf64a2f9f0cc087ec8c6a21c))
* **deps:** update plugin kotlin-qa to v0.25.1 ([7132f6b](https://github.com/DanySK/multi-jvm-test-plugin/commit/7132f6b8514a6af54add93414ab6a82bd7acfa10))
* **deps:** update plugin kotlin-qa to v0.26.0 ([aa10c65](https://github.com/DanySK/multi-jvm-test-plugin/commit/aa10c653f351cdf04d3256ed62f95d625530a21b))
* **deps:** update plugin multijvmtesting to v0.4.11 ([a669993](https://github.com/DanySK/multi-jvm-test-plugin/commit/a669993f7e17119d1fc29690f72907f3ef386f9e))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.21 ([3adad4b](https://github.com/DanySK/multi-jvm-test-plugin/commit/3adad4bb9ba0855e82f90c113aa5956ea5e75acd))

## [0.4.11](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.10...0.4.11) (2022-10-01)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.9 ([42cffa3](https://github.com/DanySK/multi-jvm-test-plugin/commit/42cffa35db0fa93cb00133d57bae96f794f605e1))


### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v1.7.20 ([d86949e](https://github.com/DanySK/multi-jvm-test-plugin/commit/d86949e0413b497af274d33cd3e88ab23271b4fa))
* **deps:** update plugin multijvmtesting to v0.4.10 ([8e179f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/8e179f590f9c4f701a02664d0672c755059a39c7))

## [0.4.10](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.9...0.4.10) (2022-09-27)


### Build and continuous integration

* **deps:** update danysk/action-checkout action to v0.2.2 ([9a6597a](https://github.com/DanySK/multi-jvm-test-plugin/commit/9a6597a3f328339502960e4966b9081b0f26e889))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.3 ([ab0a2be](https://github.com/DanySK/multi-jvm-test-plugin/commit/ab0a2be8cabc67f1d7772ab692b7305080de3bfe))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.4 ([6c40c3b](https://github.com/DanySK/multi-jvm-test-plugin/commit/6c40c3b6490936615a59754d2350125ac5cecd15))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.5 ([50b2ccf](https://github.com/DanySK/multi-jvm-test-plugin/commit/50b2ccf0f8e5f82614cb534748c81cad7e632066))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.6 ([0707baa](https://github.com/DanySK/multi-jvm-test-plugin/commit/0707baa2a7ac596056fd74a0372ca3320e8adf42))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.7 ([6fbe753](https://github.com/DanySK/multi-jvm-test-plugin/commit/6fbe75371040e729e8ad20c13b8f855bae1d48d5))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.8 ([8be033d](https://github.com/DanySK/multi-jvm-test-plugin/commit/8be033d400c5699234d43f070631c04515fe5112))


### Dependency updates

* **core-deps:** update eclipse-temurin docker tag to v19 ([196eac2](https://github.com/DanySK/multi-jvm-test-plugin/commit/196eac2118de2881d4de251b48693ea0962ff27e))
* **deps:** update dependency org.mockito:mockito-core to v4.7.0 ([308cb93](https://github.com/DanySK/multi-jvm-test-plugin/commit/308cb93c6f1fd616f059629022b06ec5215738f4))
* **deps:** update dependency org.mockito:mockito-core to v4.8.0 ([a3afcda](https://github.com/DanySK/multi-jvm-test-plugin/commit/a3afcda175a24396767e7f8494383d7a7a6b0c4a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.10 ([f06b007](https://github.com/DanySK/multi-jvm-test-plugin/commit/f06b007be6ba4ab68ef3b5f1d7e523abb63ab1e6))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.11 ([4575df2](https://github.com/DanySK/multi-jvm-test-plugin/commit/4575df2f3d897bb01db3380506717033c1c22ebd))
* **deps:** update kotest to v5.4.2 ([1f668f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/1f668f5155897dd44e8a7686fd346d2d061bfeef))
* **deps:** update node.js to 16.17 ([d1635db](https://github.com/DanySK/multi-jvm-test-plugin/commit/d1635db793a4a687a96f91bdb8d8bf5e94e00c8a))
* **deps:** update plugin com.gradle.enterprise to v3.11 ([48453f5](https://github.com/DanySK/multi-jvm-test-plugin/commit/48453f59a1854cb1290ef631656e433fb0a271ed))
* **deps:** update plugin com.gradle.enterprise to v3.11.1 ([932ca71](https://github.com/DanySK/multi-jvm-test-plugin/commit/932ca7193e61398c85e6117822d55a68212166cd))
* **deps:** update plugin kotlin-qa to v0.22.1 ([1cc766c](https://github.com/DanySK/multi-jvm-test-plugin/commit/1cc766c4b6d32044510ec07e0a4f5e375285db80))
* **deps:** update plugin kotlin-qa to v0.22.2 ([2f9de30](https://github.com/DanySK/multi-jvm-test-plugin/commit/2f9de30159f7488d1739549b6b1d4227dac71da5))
* **deps:** update plugin kotlin-qa to v0.23.0 ([3a0eca2](https://github.com/DanySK/multi-jvm-test-plugin/commit/3a0eca26085fb9de0cd246f6da8ea996d4f5c973))
* **deps:** update plugin kotlin-qa to v0.23.1 ([70eec40](https://github.com/DanySK/multi-jvm-test-plugin/commit/70eec40b103f99bed5209682cada86b6143168f2))
* **deps:** update plugin kotlin-qa to v0.23.2 ([85d7a9b](https://github.com/DanySK/multi-jvm-test-plugin/commit/85d7a9badfb262732944b8490dd21525ebd1bdc2))
* **deps:** update plugin kotlin-qa to v0.24.0 ([7c56506](https://github.com/DanySK/multi-jvm-test-plugin/commit/7c56506ef95478cd659fa28f3069d7c4b6b8e6fa))
* **deps:** update plugin kotlin-qa to v0.25.0 ([b1e7eda](https://github.com/DanySK/multi-jvm-test-plugin/commit/b1e7edac7b4ae32550bc79695236eac76f9a4c7b))
* **deps:** update plugin multijvmtesting to v0.4.9 ([aae3d22](https://github.com/DanySK/multi-jvm-test-plugin/commit/aae3d22bfee456c47bc1dec056ad73d68f9f2627))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.18 ([fad4567](https://github.com/DanySK/multi-jvm-test-plugin/commit/fad456712c2ec7ebb634f1e154809cf9d91d49ea))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.19 ([cf7ff86](https://github.com/DanySK/multi-jvm-test-plugin/commit/cf7ff869a2f96931b41206e116aa05187b092360))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.20 ([9209be6](https://github.com/DanySK/multi-jvm-test-plugin/commit/9209be6e99430945bc635ebaf86af852a28c5dd2))
* **deps:** update plugin publishoncentral to v2.0.6 ([e0286a2](https://github.com/DanySK/multi-jvm-test-plugin/commit/e0286a22c35fa417c10e4325ba92cb186248b635))

## [0.4.9](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.8...0.4.9) (2022-07-28)


### Bug Fixes

* **deps:** update kotest to v5.4.1 ([21dc50e](https://github.com/DanySK/multi-jvm-test-plugin/commit/21dc50e6adc68e1ebc1acf59a787e39e3dda87a7))


### Style improvements

* use check() instead of throwing an IllegalStateException ([196ca29](https://github.com/DanySK/multi-jvm-test-plugin/commit/196ca2906e3deaf162488291484fff974f7be0bd))


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.2 ([a420ba0](https://github.com/DanySK/multi-jvm-test-plugin/commit/a420ba0d33fbbae94b837a464fcc6115fdcc1384))
* generate a single empty-named plugin ([bda0792](https://github.com/DanySK/multi-jvm-test-plugin/commit/bda0792abf9c00b54d5e057b59bf3a5d3a7847ca))
* use the default plugin classpath when testing ([71ad751](https://github.com/DanySK/multi-jvm-test-plugin/commit/71ad7511e6445f7923d39b4e61b13d383a590853))


### Dependency updates

* **deps:** update kotest to v5.4.0 ([828e0a9](https://github.com/DanySK/multi-jvm-test-plugin/commit/828e0a9501d201b63eaa50eeea5a8ed331122082))
* **deps:** update plugin kotlin-qa to v0.20.3 ([61f2381](https://github.com/DanySK/multi-jvm-test-plugin/commit/61f23810d9abd1efaf7dc5890114730a62f65064))
* **deps:** update plugin kotlin-qa to v0.20.4 ([2aa42ee](https://github.com/DanySK/multi-jvm-test-plugin/commit/2aa42eef3e3357005b87d974bb3be9afa9de79fb))
* **deps:** update plugin kotlin-qa to v0.21.0 ([2c4594d](https://github.com/DanySK/multi-jvm-test-plugin/commit/2c4594d4ae433c46c9f0aaa3cbaa31fb6f9875bf))
* **deps:** update plugin kotlin-qa to v0.22.0 ([826621c](https://github.com/DanySK/multi-jvm-test-plugin/commit/826621ce82204466d52811bd43d92b1a4ed54034))
* **deps:** update plugin multijvmtesting to v0.4.8 ([6698594](https://github.com/DanySK/multi-jvm-test-plugin/commit/6698594e61fd025833d5980cc577e63d77dec9da))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.15 ([83409e0](https://github.com/DanySK/multi-jvm-test-plugin/commit/83409e039398344ec2c888bc14e041654ddeda41))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.16 ([c22f483](https://github.com/DanySK/multi-jvm-test-plugin/commit/c22f483fcf52e0ff842735c9c5c84d4ed240c320))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.17 ([45bb221](https://github.com/DanySK/multi-jvm-test-plugin/commit/45bb2213c45e3a98b1a1751df89f8d14b68c31e7))
* **deps:** update plugin publishoncentral to v2.0.4 ([0682638](https://github.com/DanySK/multi-jvm-test-plugin/commit/068263840c002e72173b388b6816c7f0c02e1ba0))
* **deps:** update plugin publishoncentral to v2.0.5 ([a9c6332](https://github.com/DanySK/multi-jvm-test-plugin/commit/a9c6332fe4229f575623dbe859b6d1e70439e65a))

## [0.4.8](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.7...0.4.8) (2022-07-12)


### Dependency updates

* **core-deps:** update dependency org.jetbrains.dokka to v1.7.10 ([406c2e2](https://github.com/DanySK/multi-jvm-test-plugin/commit/406c2e222c9e4347d87042b588837e20330ead0b))
* **deps:** update plugin multijvmtesting to v0.4.7 ([f434609](https://github.com/DanySK/multi-jvm-test-plugin/commit/f434609a53298c57a4e9cc9cd1197b8cde2cbe4c))

## [0.4.7](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.6...0.4.7) (2022-07-12)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.0 ([50ca9a0](https://github.com/DanySK/multi-jvm-test-plugin/commit/50ca9a02f0babc0fc012ee984bc472a03a314bdc))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.1 ([5a3724a](https://github.com/DanySK/multi-jvm-test-plugin/commit/5a3724a1a4e7bf73fc16f9f050af38a732b28cc8))


### Dependency updates

* **core-deps:** update dependency gradle to v7.5-rc-5 ([7d8152a](https://github.com/DanySK/multi-jvm-test-plugin/commit/7d8152a381b49f4ed1472b4bfb6ba87c9c3b8a23))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.9 ([791cebd](https://github.com/DanySK/multi-jvm-test-plugin/commit/791cebd6a34c7c5287a1b54c9ad0dd1671314e40))
* **deps:** update node.js to 16.16 ([0c44204](https://github.com/DanySK/multi-jvm-test-plugin/commit/0c4420410bf03e53956fbcbb1991ec9a82dab74b))
* **deps:** update plugin com.gradle.enterprise to v3.10.3 ([7f9b703](https://github.com/DanySK/multi-jvm-test-plugin/commit/7f9b7033ee790909e237004cc3d4b129df5531bf))
* **deps:** update plugin multijvmtesting to v0.4.6 ([7fe083c](https://github.com/DanySK/multi-jvm-test-plugin/commit/7fe083c26612f2eb11ae72056bc1b48d54326011))
* **deps:** update plugin publishoncentral to v2.0.3 ([b1b5739](https://github.com/DanySK/multi-jvm-test-plugin/commit/b1b57398b92302c760bb1c0aaa126e2f1baf4797))

## [0.4.6](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.5...0.4.6) (2022-07-07)


### Dependency updates

* **core-deps:** update kotlin to v1.7.10 ([8d2778d](https://github.com/DanySK/multi-jvm-test-plugin/commit/8d2778d5a5ac4d374bdc2dbe0e073121df161736))
* **deps:** update plugin multijvmtesting to v0.4.5 ([98de673](https://github.com/DanySK/multi-jvm-test-plugin/commit/98de6730f25e62ac4764df63c7be92b528e182c2))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v1.0.14 ([0825093](https://github.com/DanySK/multi-jvm-test-plugin/commit/0825093ab42552e26c014670f43a8a7f235ea8af))

## [0.4.5](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.4...0.4.5) (2022-07-06)


### Dependency updates

* **core-deps:** update dependency gradle to v7.5-rc-4 ([730dec8](https://github.com/DanySK/multi-jvm-test-plugin/commit/730dec8a1af352dee509a1665a7a7679bade8ff4))
* **deps:** update plugin multijvmtesting to v0.4.4 ([c046151](https://github.com/DanySK/multi-jvm-test-plugin/commit/c0461512fb6fcdb9b17fdd9feecf2b1f09a465c8))

## [0.4.4](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.3...0.4.4) (2022-07-02)


### Dependency updates

* **core-deps:** update dependency gradle to v7.5-rc-3 ([4105dbf](https://github.com/DanySK/multi-jvm-test-plugin/commit/4105dbfe5bcc4c8c2a1180db7f0d318a957cf91f))
* **core-deps:** update dependency org.jetbrains.dokka to v1.7.0 ([60903f1](https://github.com/DanySK/multi-jvm-test-plugin/commit/60903f18e98824854fc45effed0426161a013fbd))
* **deps:** update kotest to v5.3.1 ([ad58cc2](https://github.com/DanySK/multi-jvm-test-plugin/commit/ad58cc23c75aff6d4ef40df33642f7c3e416a25d))
* **deps:** update kotest to v5.3.2 ([a5e9b2e](https://github.com/DanySK/multi-jvm-test-plugin/commit/a5e9b2eadd02b445869a08cd38f2101fd88db623))
* **deps:** update plugin gradlepluginpublish to v1 ([1c665d2](https://github.com/DanySK/multi-jvm-test-plugin/commit/1c665d2cf4ef8f71ad088c1bb7c8e9a378d40581))
* **deps:** update plugin multijvmtesting to v0.4.3 ([2500b06](https://github.com/DanySK/multi-jvm-test-plugin/commit/2500b06d164682409526f72ea88cf74ce06cf702))
* **deps:** update plugin publishoncentral to v0.8.3 ([3c0f0c8](https://github.com/DanySK/multi-jvm-test-plugin/commit/3c0f0c83514927dbd677a3a26701ede415d8f257))
* **deps:** update plugin publishoncentral to v1 ([5962a0e](https://github.com/DanySK/multi-jvm-test-plugin/commit/5962a0ed4c93985179ffd4d019ade0c001922b73))
* **deps:** update plugin publishoncentral to v2 ([76a9d78](https://github.com/DanySK/multi-jvm-test-plugin/commit/76a9d789d4fa3e13d5d942f95c86599783be5b4e))


### Build and continuous integration

* add dry-deployment test and fix the release process for publish-on-central 2.x.x ([b9d9b0a](https://github.com/DanySK/multi-jvm-test-plugin/commit/b9d9b0ab8077e62ecac4820da2855083c2c9c023))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.0.3 ([1b5df2c](https://github.com/DanySK/multi-jvm-test-plugin/commit/1b5df2cdda51dbc9a44cef96917ed69126e1c9ea))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.1.0 ([404f273](https://github.com/DanySK/multi-jvm-test-plugin/commit/404f27315b53b7b897d25f479a1596e1720b8caa))

## [0.4.3](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.2...0.4.3) (2022-06-10)


### Dependency updates

* **core-deps:** update dependency gradle to v7.5-rc-2 ([a12ebd8](https://github.com/DanySK/multi-jvm-test-plugin/commit/a12ebd8d62f5104795b56bafd6885c912cd986b6))
* **deps:** update plugin multijvmtesting to v0.4.2 ([36917b8](https://github.com/DanySK/multi-jvm-test-plugin/commit/36917b8660d26dd0a524098881c5c08ca7d7ea8e))

## [0.4.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.1...0.4.2) (2022-06-09)


### Dependency updates

* **core-deps:** update dependency eclipse-temurin to v18 ([62c141e](https://github.com/DanySK/multi-jvm-test-plugin/commit/62c141eeed4e12755a221093e08c49cae168b700))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.8 ([c8f0075](https://github.com/DanySK/multi-jvm-test-plugin/commit/c8f007584d1e0077598b0b67b692571323ebdc1a))
* **deps:** update plugin com.gradle.enterprise to v3.10.2 ([e2e41ad](https://github.com/DanySK/multi-jvm-test-plugin/commit/e2e41ad0c3bdce793ef9211d24d86ec837c33ff2))
* **deps:** update plugin kotlin-qa to v0.19.1 ([cc9ca1d](https://github.com/DanySK/multi-jvm-test-plugin/commit/cc9ca1d489ff9a9b00de6d1f5123b0e85372db72))
* **deps:** update plugin multijvmtesting to v0.4.1 ([553842e](https://github.com/DanySK/multi-jvm-test-plugin/commit/553842eb0ae10f5ddaec878734de2713085bcf6d))
* **deps:** update plugin publishoncentral to v0.8.1 ([d2d7eac](https://github.com/DanySK/multi-jvm-test-plugin/commit/d2d7eac2d491996df5253af775f275a147270f9c))
* **deps:** update plugin publishoncentral to v0.8.2 ([a0ab084](https://github.com/DanySK/multi-jvm-test-plugin/commit/a0ab084039048176b76cb19975da164a69608329))


### Build and continuous integration

* do not bother uninstalling stuff on Windows, as there still is not enough space ([0907947](https://github.com/DanySK/multi-jvm-test-plugin/commit/090794777b24e231509fbc20f4267237f86656e2))
* do not uninstall DotNet3.5 and kubernetes-cli from windows runners ([9946668](https://github.com/DanySK/multi-jvm-test-plugin/commit/9946668d1770c081192caa8105e750170e266eb6))
* generate commit hooks for conventional commits and pre-commit hooks runnint ktlint ([f3aaeac](https://github.com/DanySK/multi-jvm-test-plugin/commit/f3aaeac05dcd0d77627b707f281c2b32c98ccd92))
* only test the latest JVM on GitHub Actions Windows runners ([2bddb7a](https://github.com/DanySK/multi-jvm-test-plugin/commit/2bddb7a9cc3963efcc586ce795573be2804a0502))
* print packages installed on Windows ([c7e6482](https://github.com/DanySK/multi-jvm-test-plugin/commit/c7e64823137a40da08b54dccf5f15ccfaf1432f3))
* remove unused compiler argument -XXLanguage:+InlineClasses ([1c482e4](https://github.com/DanySK/multi-jvm-test-plugin/commit/1c482e46701b375284215dd539d295f4075bd7dc))
* uninstall Minikube and wixtoolset on windows runners ([2ec0d4e](https://github.com/DanySK/multi-jvm-test-plugin/commit/2ec0d4e76721dbf7345d399b46d2b76696aec905))
* uninstall unused packages on windows ([2ffedc4](https://github.com/DanySK/multi-jvm-test-plugin/commit/2ffedc474b3db63e0af62f5deab4dc57ad9ff1c8))


### Tests

* disable testing on Jvms 14, 15, and 16 on Windows (out of space in CI) ([d4f98c1](https://github.com/DanySK/multi-jvm-test-plugin/commit/d4f98c15c328dce2bb4c734ae8ed2b6a022e3379))
* disable the JDK 13 for Windows (runs out of space in CI) ([a5da8fc](https://github.com/DanySK/multi-jvm-test-plugin/commit/a5da8fc95b27f7cc4bf6f8da02982121a2a5fef6))
* exclude Java 9 and 10 from testing, as it is currently eating too much space in CI ([67fd156](https://github.com/DanySK/multi-jvm-test-plugin/commit/67fd156d85e0b12c77a46a03f3ac8da10d63f336))
* exclude support for Java 12 on Windows, as it runs out of space in CI/CD ([a84fb37](https://github.com/DanySK/multi-jvm-test-plugin/commit/a84fb37ef897b2233cc1fa428d99f2466a82820b))
* restore full testing under windows ([e2db9a7](https://github.com/DanySK/multi-jvm-test-plugin/commit/e2db9a7f508a2c03004541f15f28c30d5815f0ff))

## [0.4.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.4.0...0.4.1) (2022-06-08)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.16 ([2c33a73](https://github.com/DanySK/multi-jvm-test-plugin/commit/2c33a73f8e79599b879051db3bf22f27f60a0e0c))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2 ([e76ffd1](https://github.com/DanySK/multi-jvm-test-plugin/commit/e76ffd1f119f9899c4a6b8bb8f700a9559b802b9))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.0.1 ([64b56be](https://github.com/DanySK/multi-jvm-test-plugin/commit/64b56be7311370b92d71724ea16e9f91fec755e6))
* **deps:** update danysk/build-check-deploy-gradle-action action to v2.0.2 ([689abc4](https://github.com/DanySK/multi-jvm-test-plugin/commit/689abc455b4a04e8efd1993c69846f910d3017af))


### Dependency updates

* **core-deps:** update kotlin to v1.7.0 ([81b6fe3](https://github.com/DanySK/multi-jvm-test-plugin/commit/81b6fe36c053678d65f7389b2a86e8950eb5a882))
* **deps:** update dependency org.mockito:mockito-core to v4.6.0 ([6dab226](https://github.com/DanySK/multi-jvm-test-plugin/commit/6dab226f5326b09ee284561747d37abd96306695))
* **deps:** update dependency org.mockito:mockito-core to v4.6.1 ([2aa3809](https://github.com/DanySK/multi-jvm-test-plugin/commit/2aa3809d2d6a3b96ff8ad0b243007ad4430942fa))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.7 ([d415d17](https://github.com/DanySK/multi-jvm-test-plugin/commit/d415d17b3607ba414a45f1138abfc54b05126520))
* **deps:** update plugin com.gradle.enterprise to v3.10.1 ([2234261](https://github.com/DanySK/multi-jvm-test-plugin/commit/223426114b82e47f43877b065522eb12aaad46c4))
* **deps:** update plugin kotlin-qa to v0.19.0 ([f4c917b](https://github.com/DanySK/multi-jvm-test-plugin/commit/f4c917b04850c5266d320c94b1b96f6fc0ad32f4))
* **deps:** update plugin multijvmtesting to v0.4.0 ([c864131](https://github.com/DanySK/multi-jvm-test-plugin/commit/c8641315a276246e1fa258c76f57187be2adc9d2))
* **deps:** update plugin publishoncentral to v0.8.0 ([a11a18c](https://github.com/DanySK/multi-jvm-test-plugin/commit/a11a18ca2e987929ec8362f87dbc45ad7b4b1faa))

## [0.4.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.7...0.4.0) (2022-05-17)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.14 ([12070e4](https://github.com/DanySK/multi-jvm-test-plugin/commit/12070e42cf0438b29d4bd7d1609c714538fe3763))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.15 ([2f15644](https://github.com/DanySK/multi-jvm-test-plugin/commit/2f1564459fd05dbf89b123d923c3081ec40ab0fc))


### Dependency updates

* **api-deps:** update to Gradle 7.5-rc-1, should fix gradle/gradle[#20369](https://github.com/DanySK/multi-jvm-test-plugin/issues/20369) ([5e9ce88](https://github.com/DanySK/multi-jvm-test-plugin/commit/5e9ce88895d60be2c1fc01f685333a76e7a9056c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.6 ([e5dcdf0](https://github.com/DanySK/multi-jvm-test-plugin/commit/e5dcdf09407422ecdfe495e2cc1c114cdb308ab2))
* **deps:** update io.kotest to v5.3.0 ([2bcf11d](https://github.com/DanySK/multi-jvm-test-plugin/commit/2bcf11dd0be48350e49a26ad24bf549c0963c8ca))
* **deps:** update node.js to 16.15 ([3b3ca15](https://github.com/DanySK/multi-jvm-test-plugin/commit/3b3ca15440b81910a156098642d98abc889bd429))
* **deps:** update plugin kotlin-qa to v0.16.2 ([2679240](https://github.com/DanySK/multi-jvm-test-plugin/commit/2679240d33b6afcb8b4a4b4c025b2b2b6918940f))
* **deps:** update plugin kotlin-qa to v0.17.0 ([f9a4598](https://github.com/DanySK/multi-jvm-test-plugin/commit/f9a45984cc375ea689d968afffbe0a0168d24a9c))
* **deps:** update plugin kotlin-qa to v0.18.0 ([f1ebefe](https://github.com/DanySK/multi-jvm-test-plugin/commit/f1ebefeb7e721742f9ed8aeb8880277f5995e5d2))
* **deps:** update plugin multijvmtesting to v0.3.7 ([97ede82](https://github.com/DanySK/multi-jvm-test-plugin/commit/97ede8283c85231029c974d759de2e5eba1fdeb2))
* **deps:** update plugin publishoncentral to v0.7.19 ([e11cd34](https://github.com/DanySK/multi-jvm-test-plugin/commit/e11cd3420bc132a2be220bd5549b6266244816dd))

### [0.3.7](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.6...0.3.7) (2022-04-25)


### Style improvements

* add trailing commas ([27448a2](https://github.com/DanySK/multi-jvm-test-plugin/commit/27448a2b3f6226dbd4522d0bdf33b7ad0b322293))
* suppress ConstructorParameterNaming over data class meant to interoperate with YAML ([0457663](https://github.com/DanySK/multi-jvm-test-plugin/commit/04576631d955cf12d7021b53d1c97640f7f49748))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.0.1 ([e224660](https://github.com/DanySK/multi-jvm-test-plugin/commit/e22466035a811befe513acbd8ab4135120d9c993))
* **deps:** update actions/checkout action to v3.0.2 ([8279ce1](https://github.com/DanySK/multi-jvm-test-plugin/commit/8279ce11a27b0cef4a33dccac1c5d25e467b1720))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.13 ([6e79d76](https://github.com/DanySK/multi-jvm-test-plugin/commit/6e79d7620653f747783c21c23f127caf7cda2897))
* use a dedicated deployment token ([d70e355](https://github.com/DanySK/multi-jvm-test-plugin/commit/d70e3550c0a574cb70605ebd3adc0dd167bdd63c))


### Dependency updates

* **core-deps:** update plugin dokka to v1.6.21 ([e6948ac](https://github.com/DanySK/multi-jvm-test-plugin/commit/e6948acdfebf6cbfd8b4d4520bc9b1435d3cde87))
* **deps:** update dependency org.jetbrains.kotlin:kotlin-gradle-plugin to v1.6.21 ([2ce8050](https://github.com/DanySK/multi-jvm-test-plugin/commit/2ce8050c88776ef4c2ad024efe3021ab7f2d23bf))
* **deps:** update dependency org.mockito:mockito-core to v4.5.0 ([05e785f](https://github.com/DanySK/multi-jvm-test-plugin/commit/05e785f15fbce9ea89167b443876e688e130bcd4))
* **deps:** update dependency org.mockito:mockito-core to v4.5.1 ([8f18ff4](https://github.com/DanySK/multi-jvm-test-plugin/commit/8f18ff46f26595d0ea3a558365e09ceefd982709))
* **deps:** update plugin com.gradle.enterprise to v3.10 ([5362e74](https://github.com/DanySK/multi-jvm-test-plugin/commit/5362e74319806de90a082aef93b0f1dcc4fee45f))
* **deps:** update plugin kotlin-qa to v0.15.1 ([94f3033](https://github.com/DanySK/multi-jvm-test-plugin/commit/94f3033c04ee19ea29d6d07529a802b7df82fa89))
* **deps:** update plugin kotlin-qa to v0.16.0 ([e175225](https://github.com/DanySK/multi-jvm-test-plugin/commit/e175225874cbb831ab48a85b4def2c50ddf05455))
* **deps:** update plugin kotlin-qa to v0.16.1 ([3f231d8](https://github.com/DanySK/multi-jvm-test-plugin/commit/3f231d87a167239d64b98d90db24208cf054c2a2))
* **deps:** update plugin multijvmtesting to v0.3.6 ([a211928](https://github.com/DanySK/multi-jvm-test-plugin/commit/a21192892af71b33ec6dd9ae9ee9fad6b363e7b9))
* **deps:** update plugin publishoncentral to v0.7.17 ([ce46a7d](https://github.com/DanySK/multi-jvm-test-plugin/commit/ce46a7d610b43d48e82893c3a31e20d5c22b94d6))
* **deps:** update plugin publishoncentral to v0.7.18 ([2ca0065](https://github.com/DanySK/multi-jvm-test-plugin/commit/2ca00654b872caeafda9769946afe15159671c55))

### [0.3.6](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.5...0.3.6) (2022-04-14)


### Build and continuous integration

* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.10 ([c0c49f2](https://github.com/DanySK/multi-jvm-test-plugin/commit/c0c49f2f4d2953ede44c91e0c1fe0b9be8c42a18))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.11 ([db3d0c3](https://github.com/DanySK/multi-jvm-test-plugin/commit/db3d0c3c6ec1db16af36ffa1ce877519e58f1a43))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.12 ([fc17fd0](https://github.com/DanySK/multi-jvm-test-plugin/commit/fc17fd02e83911a775bdf54e6271addaf2cf64c4))


### Dependency updates

* **core-deps:** update plugin dokka to v1.6.20 ([d645a31](https://github.com/DanySK/multi-jvm-test-plugin/commit/d645a311e58f431b0ba8ac1c8ac32eb43f795b94))
* **deps:** update dependency org.jacoco:org.jacoco.core to v0.8.8 ([b12c801](https://github.com/DanySK/multi-jvm-test-plugin/commit/b12c80142428be492f23b6df3a293744574ff67b))
* **deps:** update io.kotest to v5.2.3 ([43479d8](https://github.com/DanySK/multi-jvm-test-plugin/commit/43479d8d454f72294bc4f13ad4a64e4bb56cde7d))
* **deps:** update plugin kotlin-qa to v0.14.2 ([521bcd7](https://github.com/DanySK/multi-jvm-test-plugin/commit/521bcd70e0e825a4bf2ed523331c04c256be83d5))
* **deps:** update plugin kotlin-qa to v0.15.0 ([d2ea0df](https://github.com/DanySK/multi-jvm-test-plugin/commit/d2ea0df10f18e0f842d0f571fc45b1e96f3bacee))
* **deps:** update plugin multijvmtesting to v0.3.5 ([5222872](https://github.com/DanySK/multi-jvm-test-plugin/commit/5222872912f6c4592937d0cad5f3448da1d86842))
* **deps:** update plugin publishoncentral to v0.7.16 ([ed9aa42](https://github.com/DanySK/multi-jvm-test-plugin/commit/ed9aa4206536321caab08e9a988cd5faa4256703))

### [0.3.5](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.4...0.3.5) (2022-04-04)


### Dependency updates

* **core-deps:** update plugin kotlin-jvm to v1.6.20 ([dd69eb9](https://github.com/DanySK/multi-jvm-test-plugin/commit/dd69eb96758f7826cef1d3222125f57da10afea0))
* **deps:** update dependency org.mockito:mockito-core to v4.3.0 ([ad45367](https://github.com/DanySK/multi-jvm-test-plugin/commit/ad453671226fb5cd461410f49ef2a84bd8b4b736))
* **deps:** update dependency org.mockito:mockito-core to v4.3.1 ([f2a25aa](https://github.com/DanySK/multi-jvm-test-plugin/commit/f2a25aaee1d9c0ba111373bfc3aacdb528e9304c))
* **deps:** update dependency org.mockito:mockito-core to v4.4.0 ([abb0313](https://github.com/DanySK/multi-jvm-test-plugin/commit/abb0313ff38f92b560d99e1b15e3aa567dae7e8f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.4 ([b16a2b1](https://github.com/DanySK/multi-jvm-test-plugin/commit/b16a2b15f398e723c6befc68a21cad8ab3140834))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.5 ([13e5797](https://github.com/DanySK/multi-jvm-test-plugin/commit/13e5797ec1a3120eb1c64706c60160f770872050))
* **deps:** update io.kotest ([5c87307](https://github.com/DanySK/multi-jvm-test-plugin/commit/5c87307fe69d2c044d97cfa1fb0ebb892f1b8deb))
* **deps:** update io.kotest to v5.2.1 ([2e28987](https://github.com/DanySK/multi-jvm-test-plugin/commit/2e2898768c0bcb45f947cc7462259eb90a02db01))
* **deps:** update io.kotest to v5.2.2 ([10b0da4](https://github.com/DanySK/multi-jvm-test-plugin/commit/10b0da4992e097e59048320e1a5b7efdabea4b9f))
* **deps:** update node.js to 16.14 ([eabce19](https://github.com/DanySK/multi-jvm-test-plugin/commit/eabce1966e67f2b003cbfe0ca0f2e13ecab10ad7))
* **deps:** update plugin com.gradle.enterprise to v3.8.1 ([5a22ba6](https://github.com/DanySK/multi-jvm-test-plugin/commit/5a22ba68cb8a469af0b6e6f53fe722878ad9d14f))
* **deps:** update plugin com.gradle.enterprise to v3.9 ([0288ec7](https://github.com/DanySK/multi-jvm-test-plugin/commit/0288ec7b9cabebd0bc540a1c1db65ccf3cd8cef2))
* **deps:** update plugin gradlepluginpublish to v0.20.0 ([c57917a](https://github.com/DanySK/multi-jvm-test-plugin/commit/c57917a9f19dee1565c843c371c249c73f65a25a))
* **deps:** update plugin gradlepluginpublish to v0.21.0 ([fb898f9](https://github.com/DanySK/multi-jvm-test-plugin/commit/fb898f92682ba1b6d492900ba00183299151423f))
* **deps:** update plugin kotlin-qa to v0.10.0 ([82b38f8](https://github.com/DanySK/multi-jvm-test-plugin/commit/82b38f8cf99f501b30da201db5759e0625562d69))
* **deps:** update plugin kotlin-qa to v0.10.1 ([95c1370](https://github.com/DanySK/multi-jvm-test-plugin/commit/95c1370406c7db1b57ef27482fc07d8308d4ff22))
* **deps:** update plugin kotlin-qa to v0.12.0 ([1bb94c7](https://github.com/DanySK/multi-jvm-test-plugin/commit/1bb94c72818f1084f260e0f28958559553f164b1))
* **deps:** update plugin kotlin-qa to v0.12.1 ([af6f7dc](https://github.com/DanySK/multi-jvm-test-plugin/commit/af6f7dc6e62c699d804ed4dba98d24621e6b7a09))
* **deps:** update plugin kotlin-qa to v0.13.0 ([ac41af4](https://github.com/DanySK/multi-jvm-test-plugin/commit/ac41af44ff086cf66a0621c63218f8f6d918f6aa))
* **deps:** update plugin kotlin-qa to v0.14.0 ([5cd4c58](https://github.com/DanySK/multi-jvm-test-plugin/commit/5cd4c58f46159de63873c5766d9de9ae264d7f3f))
* **deps:** update plugin kotlin-qa to v0.14.1 ([1e040a5](https://github.com/DanySK/multi-jvm-test-plugin/commit/1e040a5a45e26f09ccb8f057653ee70e0edea9e9))
* **deps:** update plugin multijvmtesting to v0.3.4 ([630731e](https://github.com/DanySK/multi-jvm-test-plugin/commit/630731ee03563839ee7e82ba245ef5a210a225a8))
* **deps:** update plugin publishoncentral to v0.7.11 ([85bc564](https://github.com/DanySK/multi-jvm-test-plugin/commit/85bc5640a12ebb29b3d50bc5796be0e1308b3484))
* **deps:** update plugin publishoncentral to v0.7.12 ([270513b](https://github.com/DanySK/multi-jvm-test-plugin/commit/270513ba702c4fd06e097340b0f0850d44ca9477))
* **deps:** update plugin publishoncentral to v0.7.13 ([ca46adc](https://github.com/DanySK/multi-jvm-test-plugin/commit/ca46adc730d43e28dc345c2673199c25438c00fe))
* **deps:** update plugin publishoncentral to v0.7.14 ([5fae731](https://github.com/DanySK/multi-jvm-test-plugin/commit/5fae73100207a83cfca2ea363de658230c82bde4))
* **deps:** update plugin publishoncentral to v0.7.15 ([0a175ff](https://github.com/DanySK/multi-jvm-test-plugin/commit/0a175ff7315f0d583dde9304af3bb4d6cfbb0d94))


### Build and continuous integration

* '-Xopt-in' is deprecated and will be removed in a future release, please use -opt-in instead ([318357c](https://github.com/DanySK/multi-jvm-test-plugin/commit/318357ce06a6fba906302ae99315769eb2b1397b))
* **deps:** update actions/checkout action to v3 ([0d5386b](https://github.com/DanySK/multi-jvm-test-plugin/commit/0d5386bc547696cd03c2bc983a4fe1316b277c5b))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.1.3 ([aa37e8c](https://github.com/DanySK/multi-jvm-test-plugin/commit/aa37e8c03052bb4910addca1c7273c16795108f0))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.0 ([88b9f5e](https://github.com/DanySK/multi-jvm-test-plugin/commit/88b9f5e19cfc17f280551fa4e1dcc0a957e8ccc4))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.1 ([e32e0fa](https://github.com/DanySK/multi-jvm-test-plugin/commit/e32e0faad77b1c6bb34669127373c4c96483b60e))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.6 ([e111c0f](https://github.com/DanySK/multi-jvm-test-plugin/commit/e111c0f63b69270b2942c1857105405c7cd12f76))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.7 ([16c6c1b](https://github.com/DanySK/multi-jvm-test-plugin/commit/16c6c1b594f800396f20ac46b65f55948be134d0))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.8 ([d285c22](https://github.com/DanySK/multi-jvm-test-plugin/commit/d285c22775e94c94d403fdf37a39bdefc92b50c3))
* **deps:** update danysk/build-check-deploy-gradle-action action to v1.2.9 ([1ba47d6](https://github.com/DanySK/multi-jvm-test-plugin/commit/1ba47d641d195b4b389f7eb7329258a0beab8c9f))
* separate the versions of Kotlin and Dokka ([1180f16](https://github.com/DanySK/multi-jvm-test-plugin/commit/1180f1623d1c336cf18fb66ebaf40e8d0888a0ce))

### [0.3.4](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.3...0.3.4) (2022-01-08)


### Bug Fixes

* fix build failure on testByDefaultWith when called with multiple parameters ([e2ad16f](https://github.com/DanySK/multi-jvm-test-plugin/commit/e2ad16f72487e545f1da2b9bce32dd1f43205372))


### Build and continuous integration

* **release:** enable commit-analyzer ([7bbae8e](https://github.com/DanySK/multi-jvm-test-plugin/commit/7bbae8e5fd73934e39061b36ee999cb54c296065))
* **release:** inherit the configuration from the shared preset ([#62](https://github.com/DanySK/multi-jvm-test-plugin/issues/62)) ([ae6b518](https://github.com/DanySK/multi-jvm-test-plugin/commit/ae6b518fe151de5545477019aad6d99b30abafc3))
* **renovate:** fix JSON syntax error ([099451f](https://github.com/DanySK/multi-jvm-test-plugin/commit/099451f02b0235e077ab8fa109d66fff5cd91b39))
* **renovate:** inherit the configuration also from docker-image ([957be71](https://github.com/DanySK/multi-jvm-test-plugin/commit/957be712605afa97a34abc0a9a00fd0f709db710))


### General maintenance

* **release:** correctly enable semantic commit conventions ([30c3b09](https://github.com/DanySK/multi-jvm-test-plugin/commit/30c3b0987b1066bbcb3ae61b7c347933d5610b1d))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.3 ([640803e](https://github.com/DanySK/multi-jvm-test-plugin/commit/640803e44189539005a2d9555ef157131d02f2b8))
* **deps:** update plugin gradlepluginpublish to v0.19.0 ([215490d](https://github.com/DanySK/multi-jvm-test-plugin/commit/215490d1558d16ce8a7dae6bed70a3971124b0a0))
* **deps:** update plugin kotlin-qa to v0.8.3 ([121519b](https://github.com/DanySK/multi-jvm-test-plugin/commit/121519bf8cbef082020c016b4fe9d330e8e3d527))
* **deps:** update plugin kotlin-qa to v0.9.0 ([8bbec49](https://github.com/DanySK/multi-jvm-test-plugin/commit/8bbec49e47a20c6adf6fe0453f8703fa5c9c0ee7))
* **deps:** update plugin multijvmtesting to v0.3.3 ([9c33a69](https://github.com/DanySK/multi-jvm-test-plugin/commit/9c33a691a0ed58c4b87acf0c569068e012ed5de7))
* **deps:** update plugin publishoncentral to v0.7.10 ([b993ebe](https://github.com/DanySK/multi-jvm-test-plugin/commit/b993ebe22e8cb2d020cc9fad3fd86178340ac212))
* **deps:** update plugin publishoncentral to v0.7.9 ([57b3bea](https://github.com/DanySK/multi-jvm-test-plugin/commit/57b3bea109f220ae24699213684ecf74f9563469))

## [0.3.3](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.2...0.3.3) (2021-12-27)


### Bug Fixes

* **deps:** update plugin dokka to v1.6.10 ([7f76241](https://github.com/DanySK/multi-jvm-test-plugin/commit/7f76241852fcfbeea571c3729bb89c5dcbe5cfab))

## [0.3.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.1...0.3.2) (2021-12-22)


### Bug Fixes

* **deps:** update dependency gradle to v7.3.3 ([6edbd64](https://github.com/DanySK/multi-jvm-test-plugin/commit/6edbd64b8dd3ba1ec0ca92c2c3cd534e14c62fbd))

## [0.3.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.3.0...0.3.1) (2021-12-15)


### Bug Fixes

* **deps:** update dependency gradle to v7.3.2 ([38c8e1a](https://github.com/DanySK/multi-jvm-test-plugin/commit/38c8e1af36f9eb0107b56d907ea45f252f028c65))

# [0.3.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.2.2...0.3.0) (2021-12-06)


### Features

* add Kotlin support, see https://bit.ly/3EwbGT6 ([0b59560](https://github.com/DanySK/multi-jvm-test-plugin/commit/0b5956073feac5032111458364845aaca19b2ee5))

## [0.2.2](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.2.1...0.2.2) (2021-12-04)


### Bug Fixes

* access the gradle compatibility table lazily ([a0a2dd9](https://github.com/DanySK/multi-jvm-test-plugin/commit/a0a2dd98c5560e7e9f71cdad0899f927bb6dc433))

## [0.2.1](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.2.0...0.2.1) (2021-12-01)


### Bug Fixes

* **deps:** update dependency gradle to v7.3.1 ([8bd1e4c](https://github.com/DanySK/multi-jvm-test-plugin/commit/8bd1e4c697f806cc6afb4f1d856892eec4b83d6c))

### Changelog

All notable changes to this project will be documented in this file. Dates are displayed in UTC.

Generated by [`auto-changelog`](https://github.com/CookPete/auto-changelog).

#### [Unreleased](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.2.0...HEAD)

#### [0.2.0](https://github.com/DanySK/multi-jvm-test-plugin/compare/0.1.0...0.2.0)

> 10 November 2021

- Create gradle.properties [`34b3088`](https://github.com/DanySK/multi-jvm-test-plugin/commit/34b3088500a59ccefbec22c7a61c0dd5965701a3)
- Enable QA and refactor [`83867d1`](https://github.com/DanySK/multi-jvm-test-plugin/commit/83867d187f7d27bf187fa07ea9f2960d3dcda6d2)
- Enable the build scans [`d10e345`](https://github.com/DanySK/multi-jvm-test-plugin/commit/d10e345bdd6368e67ea7b9a3dbe3db417818b6f4)
- Remove unused submodule [`ebcb20f`](https://github.com/DanySK/multi-jvm-test-plugin/commit/ebcb20ff5716629fb86cbc50cee411fccb5b29f0)
- Run checks in parallel [`22865f0`](https://github.com/DanySK/multi-jvm-test-plugin/commit/22865f0ada59cb430818ddbc66b99a5633a0a3e7)
- Switch to a "stable" self [`c622eaa`](https://github.com/DanySK/multi-jvm-test-plugin/commit/c622eaa76aa3772148e4a09c822654e295a1e166)
- Update dependency org.mockito:mockito-core to v4 [`b696551`](https://github.com/DanySK/multi-jvm-test-plugin/commit/b6965515ccd47b954f5ee0700003d54716945ef9)
- Update plugin com.gradle.enterprise to v3.7 [`4539097`](https://github.com/DanySK/multi-jvm-test-plugin/commit/4539097364f77f36a14b1ced83061c22f104bc8c)
- Update plugin com.gradle.enterprise to v3.7.1 [`555a17d`](https://github.com/DanySK/multi-jvm-test-plugin/commit/555a17d2252c86d6d012bb31725d291c83ba8f17)
- Update plugin dokka to v1.5.31 [`0308ddf`](https://github.com/DanySK/multi-jvm-test-plugin/commit/0308ddf82e5789728389e6c47f7711e42ec989b7)
- Update plugin gradlePluginPublish to v0.17.0 [`f7cb077`](https://github.com/DanySK/multi-jvm-test-plugin/commit/f7cb0770448dd8c3d373f626c99786c206bf67b0)
- Update plugin kotlin-qa to v0.2.0 [`587211b`](https://github.com/DanySK/multi-jvm-test-plugin/commit/587211b06d1ca3c0675cc0c36e0edeb2640fdf99)
- Update plugin kotlin-qa to v0.2.1 [`df66cc6`](https://github.com/DanySK/multi-jvm-test-plugin/commit/df66cc65dfd834e49e9271fcc24427764fb23b2f)
- Update plugin kotlin-qa to v0.2.2 [`0ab7e43`](https://github.com/DanySK/multi-jvm-test-plugin/commit/0ab7e433b0e3c0e3ea5db72ea051569359ff0267)
- Update plugin kotlin-qa to v0.3.2 [`9fc6df5`](https://github.com/DanySK/multi-jvm-test-plugin/commit/9fc6df5cd1b857e2dde8109cba0a44d25f41400f)
- Update plugin publishOnCentral to v0.6.1 [`fdce50b`](https://github.com/DanySK/multi-jvm-test-plugin/commit/fdce50b170adf20ffe414d02da31a2a162c6c76c)
- Use my custom checkout [`d469623`](https://github.com/DanySK/multi-jvm-test-plugin/commit/d469623ad166b40966e624117b45f62c9d4d8212)
- Use the default Java instance for Gradle [`5f1a99f`](https://github.com/DanySK/multi-jvm-test-plugin/commit/5f1a99f897e03629214541812162e5ecda3aa0f3)

#### 0.1.0

> 4 October 2021

- Add support to detection of the latest Java compatible with Gradle [`78cd488`](https://github.com/DanySK/multi-jvm-test-plugin/commit/78cd48822f66d6e241ffadc8e0eef29066f1df65)
- Add task group and description [`71e6b74`](https://github.com/DanySK/multi-jvm-test-plugin/commit/71e6b745180f8cfe6343542dd44984f99d4f52f1)
- Change tests to work for every version of Java [`530112a`](https://github.com/DanySK/multi-jvm-test-plugin/commit/530112af7e1fb0ad5f917c0e88e759e1c4dad7df)
- Create CHANGELOG.md [`ef0c240`](https://github.com/DanySK/multi-jvm-test-plugin/commit/ef0c2404aea347f9ca335b4c224c03b37dac3fdd)
- Create LICENSE [`672b163`](https://github.com/DanySK/multi-jvm-test-plugin/commit/672b163fafd67913c3e75ca49d25bf8e57b96945)
- Do not require classgraph [`4c94a70`](https://github.com/DanySK/multi-jvm-test-plugin/commit/4c94a70bd7f150475ef06eca47908685c76bf887)
- Do not run on updates on CHANGELOG and LICENSE [`9da066c`](https://github.com/DanySK/multi-jvm-test-plugin/commit/9da066c5a7035f7f6df1572ef628c9110b4ffecd)
- First seemingly working version [`d043258`](https://github.com/DanySK/multi-jvm-test-plugin/commit/d043258fa2abc3409a3fe3ba1f8251d74418112d)
- Fix regex potentially matching | [`7bd7a16`](https://github.com/DanySK/multi-jvm-test-plugin/commit/7bd7a1646979d5f51c0b8a1de6978ce035de7083)
- Generate the new plugin name [`655ea82`](https://github.com/DanySK/multi-jvm-test-plugin/commit/655ea8203c0e6cc2521c49f1220c2b2c3f1cc61f)
- Initial commit [`1ca5ee9`](https://github.com/DanySK/multi-jvm-test-plugin/commit/1ca5ee9b7f3e33a7a6e9ee77536cc5f56e632a96)
- No need to specify defaults twice [`38cf816`](https://github.com/DanySK/multi-jvm-test-plugin/commit/38cf816d30ab68dc3701295aefabc79c593e7aa3)
- remove commented lines [`cef1870`](https://github.com/DanySK/multi-jvm-test-plugin/commit/cef18707ff9f894845fe4661c0963efdb366d500)
- Reuse the existing test task [`53838e4`](https://github.com/DanySK/multi-jvm-test-plugin/commit/53838e43d42df9293cbde67f6cb84eee9b547f0c)
- Start with Java 15 [`7f5d5ff`](https://github.com/DanySK/multi-jvm-test-plugin/commit/7f5d5ff21a1c9879ef7d128b01e1a173af87f745)
- Suppress UnstableApiUsage [`706da1e`](https://github.com/DanySK/multi-jvm-test-plugin/commit/706da1e725ff29086050146838183b9fc10edca3)
- Try to simplify the build [`e1b730a`](https://github.com/DanySK/multi-jvm-test-plugin/commit/e1b730ac66dd3b09e0122ee3a04e2a381b5add14)
- Try to trick Renovate into updating the latest Java version for me [`b94e7d8`](https://github.com/DanySK/multi-jvm-test-plugin/commit/b94e7d8cd933bdb7a8bd59d3b73b652fdc01ae4f)
- Update dependency io.github.classgraph:classgraph to v4.8.120 [`27d45d3`](https://github.com/DanySK/multi-jvm-test-plugin/commit/27d45d3e5154ee5fb2748026f337c18eae3e2ae2)
- Update openjdk Docker tag to v18 [`ba492f2`](https://github.com/DanySK/multi-jvm-test-plugin/commit/ba492f2d4ff6afa112507bfb457904133cb3decc)
- Use a version of itself that runs tests as expected [`8e34446`](https://github.com/DanySK/multi-jvm-test-plugin/commit/8e34446e25f86a75ff7e055f1c2d3c5ce63005bf)
- use in-memory signing only in CI [`e1cea30`](https://github.com/DanySK/multi-jvm-test-plugin/commit/e1cea30777e129080d3ef4a37c1d0bba85e23a23)
- Use latest self [`172b3c7`](https://github.com/DanySK/multi-jvm-test-plugin/commit/172b3c753f74d8b4ff9b9ca345d2a1c80936cccb)
- Use the plugin itself for building this plugin [`c057f14`](https://github.com/DanySK/multi-jvm-test-plugin/commit/c057f14c14594a3c4d42b24dd7e215c70a750af8)
- Write README.md [`d74f538`](https://github.com/DanySK/multi-jvm-test-plugin/commit/d74f5386d279146626223bf5a85a4807ad906924)
