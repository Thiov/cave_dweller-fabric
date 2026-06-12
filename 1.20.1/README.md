# Cave Dweller (Fabric Port — 1.20.1)

Self-contained Fabric build of Cave Dweller Evolved for **Minecraft 1.20.1**.
Backported from the 1.21.10 port in [`../1.21.10/`](../1.21.10/); uses the
1.20.1 fabric-api / GeckoLib 4 / Mojang mappings.

## Requirements

- Minecraft **1.20.1**
- Fabric Loader **0.15.0+**
- Fabric API **0.92.0+1.20.1** or newer
- GeckoLib **4.2+** (Fabric, built against 4.4.9)
- Java **17+**

## Notable differences from the 1.21.10 port

- GeckoLib 4 instead of 5 (different model/animation resource layout:
  `assets/cave_dweller/geo/` and `assets/cave_dweller/animations/`)
- Networking uses the classic Fabric `FriendlyByteBuf` channel API
  (1.20.1 has no custom payload codecs)
- Restores the upstream 1.20.1 head-tracking and emissive eyes layer code

## Building from source

```bash
./gradlew build
# Output: build/libs/cave_dweller-1.6.4-fabric-1.20.1.jar
```

GeckoLib is resolved from its maven repository, so no jars need to be placed
in `libs/` for this version. JDK 17+ required (JDK 21 recommended for running
Gradle). Built with fabric-loom and Mojang official mappings.

## License

MIT, preserved from upstream. See `../LICENSE`.
