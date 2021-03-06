package com.grillo78.littlecritters.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class MixinClientEntity {

    @OnlyIn(Dist.CLIENT)
    @Inject(method = "shouldRenderAtSqrDistance", at = @At("RETURN"), cancellable = true)
    public void shouldRenderAtSqrDistance(double distance, CallbackInfoReturnable callbackInfoReturnable){
        if(((Entity)(Object)this).level.isClientSide){
            if(((Entity)(Object)this).getType() == EntityType.BEE || ((Entity)(Object)this).getType() == EntityType.SILVERFISH){
                callbackInfoReturnable.setReturnValue(distance<4600);
            }
        }
    }

}
