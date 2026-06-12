# Cave Dweller (Fabric Port — 1.21.11)

Self-contained Fabric build of Cave Dweller Evolved for **Minecraft 1.21.11**.
Forked from the 26.1.2 port in the parent directory; uses the 1.21.11
fabric-api / GeckoLib 5.4 / Mojang mappings.

## Requirements

- Minecraft **1.21.11**
- Fabric Loader **0.16.0+** (tested with 0.19.2)
- Fabric API **0.141.0+1.21.11** or newer
- GeckoLib **5.4+** (Fabric, built against 5.4.5)
- Java **21**

## Building from source

```bash
gradle build
# Output: build/libs/cave_dweller-1.6.4-fabric-1.21.11.jar
```

GeckoLib resolves from its maven repository, so no jars need to be placed in
`libs/` for this version. JDK 21 required, with Gradle 9.2+ (fabric-loom
1.15.5) and Mojang official mappings.

## License

MIT, preserved from upstream. See `../LICENSE`.
