package com.grillo78.littlecritters.client.entities.model;// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.grillo78.littlecritters.common.entities.FlyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.math.MathHelper;

public class FlyModel<F extends AnimalEntity> extends EntityModel<FlyEntity> {
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer bonething;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;
	private final ModelRenderer bone2;
	private final ModelRenderer bone8;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone9;
	private final ModelRenderer bone7;

	public FlyModel() {
		texWidth = 64;
		texHeight = 64;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setPos(0.0F, -4.0F, 6.0F);
		bone.addChild(body);
		body.texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);
		body.texOffs(0, 20).addBox(-3.0F, -1.0F, -9.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		bonething = new ModelRenderer(this);
		bonething.setPos(0.0F, 19.0F, 0.0F);
		body.addChild(bonething);
		bonething.texOffs(20, 0).addBox(1.0F, -22.0F, -14.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bonething.texOffs(19, 20).addBox(-5.0F, -22.0F, -14.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(1.0F, 2.0F, 0.0F);
		bonething.addChild(bone3);
		setRotationAngle(bone3, -0.1745F, 0.0F, 0.0F);
		bone3.texOffs(4, 17).addBox(-2.0F, -14.9688F, -15.8299F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.0F, 19.0F, 1.0F);
		body.addChild(bone4);
		bone4.texOffs(28, 38).addBox(-4.0F, -21.0F, -14.0F, 7.0F, 6.0F, 4.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setPos(0.175F, -5.0F, -3.325F);
		bone.addChild(left_wing);
		setRotationAngle(left_wing, 0.2618F, 0.0873F, 0.0F);
		left_wing.texOffs(36, 13).addBox(0.0126F, 0.0118F, 0.0065F, 7.0F, 0.0F, 11.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setPos(-1.1F, -5.0F, -3.4F);
		bone.addChild(right_wing);
		setRotationAngle(right_wing, 0.2618F, -0.0873F, 0.0F);
		right_wing.texOffs(36, 25).addBox(-6.9974F, 0.0092F, -0.0028F, 7.0F, 0.0F, 11.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-3.5F, 0.0F, 1.5F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.1745F, 0.0F, 0.2618F);
		bone2.texOffs(0, 12).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setPos(2.5F, 0.0F, 1.5F);
		bone.addChild(bone8);
		setRotationAngle(bone8, 0.1745F, 0.0F, -0.2618F);
		bone8.texOffs(0, 12).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(2.5F, 0.0F, -0.5F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.2618F);
		bone5.texOffs(0, 17).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(2.5F, 0.0F, -2.5F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -0.1745F, 0.0F, -0.1745F);
		bone6.texOffs(20, 26).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setPos(-3.5F, 0.0F, -2.5F);
		bone.addChild(bone9);
		setRotationAngle(bone9, -0.1745F, 0.0F, 0.2618F);
		bone9.texOffs(4, 12).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setPos(-3.5F, 0.0F, -0.5F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 0.2618F);
		bone7.texOffs(0, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(FlyEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		boolean flag = entityIn.isOnGround() && entityIn.getDeltaMovement().lengthSqr() < 1.0E-7D;
		if (!flag) {
			float f = ageInTicks * 2.1F;
			this.right_wing.yRot = 0.0F;
			this.right_wing.zRot = MathHelper.cos(f) * (float) Math.PI * 0.15F;
			this.left_wing.xRot = this.right_wing.xRot;
			this.left_wing.yRot = this.right_wing.yRot;
			this.left_wing.zRot = -this.right_wing.zRot;
		}
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}