# Cave Dweller (Fabric Port — 1.21.10)

Self-contained Fabric build of Cave Dweller Evolved for **Minecraft 1.21.10**.
Forked from the 26.1.2 port in the parent directory; downported to use the
1.21.10 fabric-api / GeckoLib / Mojang mappings.

## Requirements

- Minecraft **1.21.10**
- Fabric Loader **0.16.0+** (tested with 0.19.2)
- Fabric API **0.138.4+1.21.10**
- GeckoLib **5.3-alpha-3** (Fabric)
- Java **21**

## Building from source

```bash
# Place the dependency jars in libs/ before building (gitignored):
#   geckolib-fabric-1.21.10-5.3-alpha-3.jar
#   fabric-api-0.138.4+1.21.10.jar
# Both are on Modrinth.

./gradlew build
# Output: build/libs/cave_dweller-1.6.4-fabric-1.21.10.jar
```

JDK 21 required. Built with fabric-loom 1.16-SNAPSHOT and Mojang official
mappings.

## License

MIT, preserved from upstream. See `../LICENSE`.
