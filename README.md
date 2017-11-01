# Presence-Footsteps

An overly complicated footstep sound enhancement mod for Minecraft.

Originally authored by Hurricaaane, updated by Sollace to from Minecraft 1.8 to Minecraft 1.10.

Ported to Minecraft 1.12 and 1.12.2 (todo) by ndousson.

# Requierements

Libraries required before compiling this project:

 - [MC Commons](https://github.com/Sollace/MC-Commons)
 - [LiteLoader](http://www.liteloader.com/)

# DO

- Updated code to MC 1.12
- Updated ForgeGradle to 2.3-SNAPSHOT
- Updated MCPBot Mapping Release
- Remove MineLittlePony dependencies
- Added french translation

# TODO

- Fix loading lang (no lang is working)
- Fix crash when player is jumping (no method isJumping, cf. error below)

```
Nov 01, 2017 4:03:30 PM eu.ha3.mc.haddon.implem.HaddonPrivateEntry get
INFO: (Haddon) PrivateEntry isJumping cannot resolve bf
Nov 01, 2017 4:03:30 PM eu.ha3.mc.haddon.implem.HaddonPrivateEntry get
INFO: (Haddon) PrivateEntry isJumping cannot resolve field_70703_bu
```

# Installation (IntelliJ IDEA)

1. Clone project
2. Import project with build.gradle in IDE
3. Run gradle task named setupDecompWorkspace
4. Refresh all gradle project
5. Clone MC-Commons in lib
6. Run gradle genIntellijRuns
7. Run minecraft client
8. Start coding
9. Run gradle build when you finished