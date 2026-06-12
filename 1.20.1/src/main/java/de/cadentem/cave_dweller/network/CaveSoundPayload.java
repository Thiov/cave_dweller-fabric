package de.cadentem.cave_dweller.network;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;

public record CaveSoundPayload(ResourceLocation soundResource, BlockPos playerPosition, float volume, float pitch) {
    public static final ResourceLocation ID = new ResourceLocation("cave_dweller", "cave_sound");

    public FriendlyByteBuf encode() {
        FriendlyByteBuf buffer = PacketByteBufs.create();
        buffer.writeResourceLocation(soundResource);
        buffer.writeBlockPos(playerPosition);
        buffer.writeFloat(volume);
        buffer.writeFloat(pitch);
        return buffer;
    }

    public static CaveSoundPayload decode(FriendlyByteBuf buffer) {
        return new CaveSoundPayload(
                buffer.readResourceLocation(),
                buffer.readBlockPos(),
                buffer.readFloat(),
                buffer.readFloat());
    }
}
