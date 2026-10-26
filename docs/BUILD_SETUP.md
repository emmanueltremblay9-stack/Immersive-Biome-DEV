# Outillage DEV — installation et vérification
Version 0.1.0-PROPOSED

Le dépôt est préparé avec Gradle (ModDevGradle), JDK 21 et CI GitHub Actions. Les versions sont des **cibles de setup**, non une qualification runtime.

## Bootstrap
- Installer JDK21, Gradle9.2.1 (ou environnement équivalent) dans un workspace isolé.
- Exécuter `gradle --no-daemon build`, conserver sortie, exit code, commit SHA et artefact.
- Exécuter `gradle wrapper --gradle-version 9.2.1` et examiner `gradlew`, `gradlew.bat`, `gradle/wrapper/gradle-wrapper.properties` et le JAR binaire; préparer une PR distincte. **Aucun wrapper JAR n'est versionné aujourd'hui**.
- Ne jamais déclarer de build PASS avant son exécution. La présence du workflow GitHub n'est pas une exécution réussie.
- Lancer client/serveur/GameTests dans un runtime Minecraft isolé seulement lorsque les gates le requièrent.

La CI utilise Gradle installé par l'action de setup; elle ne publie ni JAR ni release et ne stocke pas de secrets.
