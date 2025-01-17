package ru.bclib.mixin.client;

import net.minecraft.client.Game;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.bclib.api.dataexchange.DataExchangeAPI;

@Mixin(Game.class)
public class GameMixin {
	
	@Inject(method="onStartGameSession", at=@At("TAIL"))
	public void bcliv_onStart(CallbackInfo ci){
		DataExchangeAPI.sendOnEnter();
	}
}
