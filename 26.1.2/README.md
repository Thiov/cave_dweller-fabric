# Cave Dweller (Fabric Port — 26.1.2)

Self-contained Fabric build of Cave Dweller Evolved for **Minecraft 26.1.2**.
Same code era as the 26.2 port in the parent directory; uses the 26.1.2
fabric-api / GeckoLib 5.5. Minecraft 26.x is non-obfuscated, so it builds
with Loom's `net.fabricmc.fabric-loom` plugin.

## Requirements

- Minecraft **26.1.2**
- Fabric Loader **0.19.2+**
- Fabric API **0.146.1+26.1.2**
- GeckoLib **5.5.1** (Fabric)
- Java **25**

## Building from source

```bash
# Place GeckoLib's Fabric jar in libs/ before building
# (download from https://modrinth.com/mod/geckolib/version/gXL7ILee)
cp ~/Downloads/geckolib-fabric-26.1.2-5.5.1.jar libs/

# Requires Gradle 9.4+ run on JDK 25.
gradle build
# Output: build/libs/cave_dweller-1.6.4-fabric-26.1.2.jar
```

JDK 25 required (it must be the JDK Gradle itself runs on).

## License

MIT, preserved from upstream. See `../LICENSE`.
