# Outillage DEV — installation et vérification
Version 0.1.0-PROPOSED

Le dépôt est préparé avec Gradle (ModDevGradle), JDK 21 et CI GitHub Actions. Les versions sont des **cibles de setup**, non une qualification runtime.

## Bootstrap
- Installer JDK 21 dans un workspace isolé.
- Exécuter `./gradlew --no-daemon build`, conserver la sortie, le code de sortie, le commit SHA et l'artefact.
- Le wrapper vise Gradle 9.2.1 et épingle le SHA-256 officiel de `gradle-9.2.1-bin.zip` (`72f44c9f8ebcb1af43838f45ee5c4aa9c5444898b3468ab3f4af7b6076c5bc3f`) dans `gradle/wrapper/gradle-wrapper.properties`. Le JAR généré par Gradle 9.2.1 correspond au checksum officiel du wrapper (`423cb469ccc0ecc31f0e4e1c309976198ccb734cdcbb7029d4bda0f18f57e8d9`).
- Pour régénérer le wrapper, utiliser Gradle 9.2.1 et `gradle wrapper --gradle-version 9.2.1 --distribution-type bin --gradle-distribution-sha256-sum 72f44c9f8ebcb1af43838f45ee5c4aa9c5444898b3468ab3f4af7b6076c5bc3f`; vérifier la source et les checksums avant de modifier les fichiers générés.
- Un build PASS ne valide que le squelette et ses tests JVM, pas les GameTests ni le runtime Minecraft. La présence du workflow GitHub ne constitue pas à elle seule une exécution réussie.
- Lancer client/serveur/GameTests dans un runtime Minecraft isolé seulement lorsque les gates le requièrent.

La CI utilise le wrapper du dépôt avec JDK 21; elle ne publie ni JAR ni release et ne stocke pas de secrets.
