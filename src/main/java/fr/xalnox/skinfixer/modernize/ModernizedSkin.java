package fr.xalnox.skinfixer.modernize;

import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.model.ModelPart;

public class ModernizedSkin {
    private ModelPart leftSleeve;
    private ModelPart rightSleeve;
    private ModelPart leftPants;
    private ModelPart rightPants;
    private ModelPart jacket;

    public ModernizedSkin(EntityModel model,float dilation) {
        this.leftSleeve = new ModelPart(model, 48,48);
        this.leftSleeve.setPivot(5.f,2.f,0.f);
        this.leftSleeve.addCuboid(-1.f,-2.f,-2.f,4,12,4,dilation + 0.25f);
        this.rightSleeve = new ModelPart(model,40,32);
        this.rightSleeve.setPivot(-5.f,2.f,0.f);
        this.rightSleeve.addCuboid(-3.f,-2.f,-2.f,4,12,4, dilation + 0.25f);
        this.leftPants = new ModelPart(model,0,48);
        this.leftPants.setPivot(1.9f,12.f,0.f);
        this.leftPants.addCuboid(-2.f,0.f,-2.f,4,12,4, dilation + 0.25f);
        this.rightPants = new ModelPart(model,0,32);
        this.rightPants.setPivot(-1.9f,12.f,0.f);
        this.rightPants.addCuboid(-2.f,0.f,-2.f,4,12,4, dilation + 0.25f);
        this.jacket = new ModelPart(model,16,32);
        this.jacket.addCuboid(-4.f,0.f,-2.f,8,12,4,dilation + 0.25f);
    }
}
