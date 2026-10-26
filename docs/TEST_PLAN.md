# Immersive Biome — tests et sécurité
Version 0.1.0-PROPOSED | Statut: NOT_RUN

| Test | Scénario et critère |
|---|---|
| B-01 | `gradle build` sous JDK21 avec NeoForge versionnée; exit code 0 et HEAD précis |
| B-02 | Client Minecraft 1.21.1: lancement avec JAR exact |
| B-03 | Serveur dédié: aucune classe client illégale ni crash |
| P-01 | SavedData structuré et versionné, persistance après sauvegarde complète et redémarrage |
| P-02 | GZIP/NBT extérieur corrompu, seed mismatch, état version inconnue: quarantaine non destructive si interceptable; limite du loader signalée |
| P-03 | Fichier SavedData absent mais provenance monde déjà existante: ne pas réinitialiser silencieusement |
| R-01 | Déchargement/rechargement, dimension, horloge et rattrapage: progression appliquée une seule fois |
| R-02 | Deux régions minecraft:forest avec trajectoires historiques différentes: preuve de diversité et observabilité |
| R-03 | Aucune physique/entité/production hors chunks; aucun force-load |
| V-01 | Profiler charge réelle TPS/MSPT/allocations; pas de valeur inventée |
| L-01 | Revue de licences et acceptation du propriétaire avant toute release |

Le build minimal ne prouve pas P/R/V. Chaque preuve doit lier source HEAD, fichier/JAR, commande, environnement, résultat, limite et date réellement connue.
