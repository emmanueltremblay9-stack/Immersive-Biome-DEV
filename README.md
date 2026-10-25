# Immersive Biome — DEV

**Dirty Studyo | Minecraft Java 1.21.1 | NeoForge 21.1.233 | Java 21**

Ce dépôt public est le code de développement du mod **Immersive Biome**. La branche de préparation contient un **squelette technique seulement** : aucune simulation régionale, génération de biome ni mécanique de jeu implémentée à ce stade.

## Direction de conception

Évolution écologique régionale persistante, diversifiée par histoire, observable et déterministe. Hors chunks chargés, seul un **état abstrait** peut avancer; jamais de physique, entité, machine, production, placement de blocs ni chunks forcés. CIVITAS, PNJ, RPG et Neural Core exclus du périmètre actuel; Immersive Transcendence ON HOLD.

## Baseline technique — PROPOSED

| Champ | Valeur provisoire |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.233 (cible héritée du candidat IB-GATE-002) |
| Java | 21 |
| Outil | ModDevGradle 2.0.148; Gradle 9.2.1 |
| Mod ID | `immersive_biome` — ASSUMED |
| Package | `com.dirtystudyo.immersivebiome` — ASSUMED |
| Mod version | `0.1.0-dev` — ASSUMED, ne désigne pas IB-GATE-002 v0.8 |
| Licence déclarée dans les métadonnées du prototype de squelette | All Rights Reserved — PROPOSED; revue requise avant release |

La séparation de dépôt, les cibles historiques et les garanties de sécurité sont documentées dans le dépôt **privé** `Immersive-Biome-GPT`; les versions PROPOSED ne sont pas approuvées par un commit.

## Construire

Prérequis : JDK 21 et Gradle 9.2.1. Utiliser `gradle --no-daemon build`. Le Gradle Wrapper complet (`gradlew` et `gradle-wrapper.jar`) **n'est pas encore versionné**; avant de le déclarer disponible, générer et vérifier le wrapper officiel, puis le committer dans une PR dédiée. Le workflow GitHub Actions emploie Gradle via `gradle/actions/setup-gradle` et ne publie rien.

Aucune compilation réelle ni GameTest n'est encore certifié. Consulter `docs/TEST_PLAN.md` et `docs/PROTOTYPE_IMPORT.md` avant d'intégrer les candidats IB-GATE-002.

## Sécurité

Développement sur mondes isolés. Ne jamais modifier des sauvegardes personnelles. Une erreur GZIP/NBT peut se produire avant le chargement de SavedData; ne pas prétendre qu'une quarantaine protège tout cas tant que le runtime n'a pas été testé. Aucun push, merge, tag, Release, téléchargement CurseForge/Modrinth ou installation Prism n'est autorisé par la CI.
