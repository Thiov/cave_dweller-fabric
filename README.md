# Cave Dweller (Fabric Port)

An unofficial Fabric port of [Cave Dweller Evolved](https://www.curseforge.com/minecraft/mc-mods/cave-dweller-evolved)
by **SiverDX (Cadentem)**, ported to Fabric Loader 0.19.2 and Minecraft 26.2.

> **Looking for another Minecraft version?** The [`26.1.2/`](26.1.2/), [`26.1/`](26.1/), [`1.21.11/`](1.21.11/), [`1.21.10/`](1.21.10/) and [`1.20.1/`](1.20.1/) subdirectories are self-contained Fabric builds for those Minecraft versions.

> **Playing NeoForge or Forge?** See the sibling project [cave_dweller-neoforge](https://github.com/Thiov/cave_dweller-neoforge).

> All gameplay design, model, animations, and sounds are by the original authors.
> This project only adapts the existing code to Fabric.
>
> - Upstream (archived): https://github.com/SiverDX/cave_dweller
> - Original CurseForge: https://www.curseforge.com/minecraft/mc-mods/cave-dweller-evolved
> - License: MIT (preserved from upstream — see [LICENSE](LICENSE))

## Requirements

- Minecraft **26.2**
- Fabric Loader **0.19.2+**
- Fabric API **0.153.0+26.2**
- GeckoLib **5.5.3** (Fabric)
- Java **25**

## Features

- Cave Dweller mob with original GeckoLib model and animations
- 21 unique sounds (cave noises, chase, flee, hurt, death, footsteps)
- Configurable spawn timing, light level limits, dimension whitelist, biome rules
- Climbs walls, crawls through 1-block gaps, breaks doors
- Custom spawn egg
- Configuration via `config/cave_dweller-server.json`

## Known limitations

- Auto-reload of config requires a server restart (Forge upstream reloaded live)
- Depth-strider water-speed bonus from upstream is currently disabled
- Bug reports welcome

## Building from source

```bash
# Place GeckoLib's Fabric jar in libs/ before building
# (download from https://modrinth.com/mod/geckolib/version/L6bn4TS8)
cp ~/Downloads/geckolib-fabric-26.2-5.5.3.jar libs/

# Requires Gradle 9.4+ run on JDK 25.
# Minecraft 26.x is non-obfuscated, so this uses Loom's net.fabricmc.fabric-loom plugin.
gradle build
# Output: build/libs/cave_dweller-1.6.4-fabric.jar
```

JDK 25 required (it must be the JDK Gradle itself runs on).

## License

MIT, preserved from upstream. See [LICENSE](LICENSE).

## Credits

- **SiverDX (Cadentem)** — Cave Dweller Evolved (Forge upstream)
- The original Cave Dweller mod authors — base concept and assets
- [GeckoLib](https://github.com/bernie-g/geckolib) team — animation engine
- [Thiov](https://github.com/Thiov) — Fabric port for 26.2
