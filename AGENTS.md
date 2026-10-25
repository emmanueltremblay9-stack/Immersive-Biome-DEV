# Agent / Codex boundaries — Immersive Biome DEV
Version 0.1.0-PROPOSED

- Read real branch, HEAD, dirty status, PRs, current Gradle files and relevant AGENTS.md before any edit. Do not presume main is the active work branch.
- Scope only the named TASK; preserve unrelated newer work. No global clean, reset, dependency upgrades, or mass migrations without exact authority.
- The skeleton is **not** IB-GATE-002 v0.8; no code import until origin, digest, licence, expected behavior and compatibility have been verified.
- Mod ID / package / mod version in this starter are ASSUMED. Do not silently freeze them into the canon.
- No gameplay, worldgen, regional persistence, off-chunk physics, PvE, NPC, RPG, Neural Core or other mod integrations without scoped design/approval and tests.
- Never run tests that mutate personal saves or shared servers. Use isolated worlds; preserve corrupt SavedData bytes for controlled diagnosis.
- Satisfy validation with real command, exit code, SHA, exact test scenario, artifacts and limits; local/static PASS never means runtime PASS.
- Repo is PUBLIC. No secrets, account tokens, detailed user data, private canon or private world logs.
- Do not merge, tag, create a Release, upload, deploy to Prism or distribution sites, alter protection/secrets/permissions or trigger paid services without explicit authority.
- For explicit Codex handoffs, obey the receiving Project's file-only .md rule and its declared scope, not another mod's permissions.
