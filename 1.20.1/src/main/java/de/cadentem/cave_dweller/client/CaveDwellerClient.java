package de.cadentem.cave_dweller.client;

import de.cadentem.cave_dweller.network.CaveSoundPayload;
import de.cadentem.cave_dweller.registry.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CaveDwellerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntityTypes.CAVE_DWELLER, CaveDwellerRenderer::new);

        ClientPlayNetworking.registerGlobalReceiver(CaveSoundPayload.ID, (client, handler, buffer, responseSender) -> {
            // Decode on the network thread - the buffer is released once this handler returns
            CaveSoundPayload payload = CaveSoundPayload.decode(buffer);
            client.execute(() -> HandleCaveSound.handle(payload));
        });
    }
}
