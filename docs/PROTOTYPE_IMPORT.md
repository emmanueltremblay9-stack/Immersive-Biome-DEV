# Gate d'import IB-GATE-002 — candidat non adopté
Version 0.1.0-PROPOSED

Des documents historiques décrivent v0.4 à v0.8 de IB-GATE-002, avec des tests Java/Python et un travail SavedData/NBT. Le dernier rapport mentionne **168 contrôles Java et 23 Python**, 288 périodes synthétiques, 3 régions. Ces résultats sont seulement RAPPORTÉS, hors des deux dépôts initialement vides. Compilation NeoForge et essais en monde réel NOT_RUN dans ces rapports. Le code complet et les empreintes originales doivent être retrouvés avant réutilisation.

1. Récupérer le paquet/source exacte v0.8, hachage SHA-256 et ses licences. Ne pas copier depuis une reconstitution partielle.
2. Inventorier les fichiers Java, patches, ressources, preuves et dépendances; vérifier le mod ID et l'API de SavedData NeoForge 21.1.233.
3. Comparer aux fichiers du HEAD courant; pas de reset ni écrasement.
4. Rejouer tests locaux; distinguer assertions, fichiers statiques, unitaires, GameTests.
5. Compiler avec le vrai Gradle/NeoForge, puis tester lecture/sauvegarde/redémarrage sur mondes isolés, corruption, seed, absence et idempotence.
6. Après acceptation explicite seulement, intégrer par PR étroite; interdire tags/Release/upload pendant cette porte.

Les rapports historiques ne sont ni un JAR installé, ni une autorisation de migration.
