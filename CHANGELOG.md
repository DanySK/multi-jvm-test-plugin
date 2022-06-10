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
