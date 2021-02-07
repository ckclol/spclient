package spiritualclient.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.util.ResourceLocation;

public class SplashProgress {

	private static final int MAX = 7;
	private static int PROGRESS = 0;
	private static String CURRENT = "";
	private static ResourceLocation splash;
	private static UnicodeFontRenderer ufr;
	public static void update() {
		if (Minecraft.getMinecraft() == null || Minecraft.getMinecraft().getLanguageManager() == null) {
			return;
		}
		drawSplash(Minecraft.getMinecraft().getTextureManager());
	}
	public static void setProgress(int getProgress, String givenText) {
		PROGRESS = getProgress;
		CURRENT = givenText;
	}
	public static void drawSplash(TextureManager tm) {
		ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
		int sf = sr.getScaleFactor();
		Framebuffer fb = new Framebuffer(sr.getScaledWidth() * sf, sr.getScaledHeight() * sf, true);
		fb.bindFramebuffer(false);
		GlStateManager.matrixMode(GL11.GL_PROJECTION);
		GlStateManager.loadIdentity();
		GlStateManager.ortho(0.0D, (double)sr.getScaledWidth(), (double)sr.getScaledHeight(), 0.0D, 100.0D, 3000.0D);
		GlStateManager.matrixMode(GL11.GL_MODELVIEW);
		GlStateManager.translate(0.0F, 0.0F, -2000.0F);
		GlStateManager.disableLighting();
	    GlStateManager.disableFog();
	    GlStateManager.disableDepth();
	    GlStateManager.enableTexture2D();
	    if (splash == null) {
	    	splash = new ResourceLocation("spiritualclient/splash.png");
	    }
	    tm.bindTexture(splash);
	    GlStateManager.resetColor();
	    GlStateManager.color(1.0F, 1.0F, 1.0F);
	    Gui.drawScaledCustomSizeModalRect(2, 2, 2, 2, 1920, 1080, sr.getScaledWidth(), sr.getScaledWidth(), 1920, 1080);
	    drawProgress();
	    fb.unbindFramebuffer();
	    fb.framebufferRender(sr.getScaledWidth() * sf, sr.getScaledHeight() * sf);
	    GlStateManager.alphaFunc(510, 0.1F);
	    Minecraft.getMinecraft().updateDisplay();
	    }
	private static void drawProgress() {
		if (Minecraft.getMinecraft().gameSettings == null || Minecraft.getMinecraft().getTextureManager() == null) {
			return;
		}
		if (ufr == null) {
			ufr = UnicodeFontRenderer.getFontOnPC("Minecraftia", 20);
		}
		ScaledResolution sr2 = new ScaledResolution(Minecraft.getMinecraft());
	}
	private static void resetTextureState() {
		
	}
}
