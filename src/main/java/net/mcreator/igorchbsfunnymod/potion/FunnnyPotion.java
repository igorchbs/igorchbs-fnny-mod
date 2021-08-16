
package net.mcreator.igorchbsfunnymod.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;

import net.mcreator.igorchbsfunnymod.IgorchbsfunnymodModElements;

@IgorchbsfunnymodModElements.ModElement.Tag
public class FunnnyPotion extends IgorchbsfunnymodModElements.ModElement {
	@ObjectHolder("igorchbsfunnymod:funnny")
	public static final Effect potion = null;
	@ObjectHolder("igorchbsfunnymod:funnny")
	public static final Potion potionType = null;
	public FunnnyPotion(IgorchbsfunnymodModElements instance) {
		super(instance, 3);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("funnny");
		}
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;
		public EffectCustom() {
			super(EffectType.NEUTRAL, -52429);
			setRegistryName("funnny");
			potionIcon = new ResourceLocation("igorchbsfunnymod:textures/disc14.png");
		}

		@Override
		public String getName() {
			return "effect.funnny";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return true;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
