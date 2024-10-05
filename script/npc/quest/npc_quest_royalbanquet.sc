//= Auriga Script ==============================================================
// Royal Banquet Quest Script
//==============================================================================

//============================================================
// WARP
//------------------------------------------------------------
prt_prison.gat,155,290,0	warp	prt_prison_OUT	1,1,prt_pri00.gat,50,120
prt_pri00.gat,54,139,0	warp	prt_pri_to_prt_cas	1,1,prt_cas.gat,182,258

prt_cas_q.gat,154,8,0	warp	qroom_L_to_way_way_to_q	1,1,prt_cas.gat,156,163

prt_cas.gat,278,163,0	script	way_to_qroom_R_qroom_R_	45,1,1,{
OnTouch:
	if(EP16_1QUE < 2) {
		unittalk getnpcid(0,"�������R�m#03"),"�������R�m : ���̐�͋M�o���؍݂��闣�{�ł��B�O���̕��͏o����ł��܂���B",1;
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"�������R�m#03"),"�������R�m : ���҂��󂯂����́A�t���l�̈ē������҂����������B",1;
		end;
	}
	warp "prt_cas_q.gat",135,119;
	end;
}

prt_cas_q.gat,132,119,0	warp	qroom_R_to_way_way_to_q	1,1,prt_cas.gat,274,163
prt_cas_q.gat,130,8,0	warp	qroom_vip_in_qroom_vip_	1,1,prt_cas_q.gat,30,28
prt_cas_q.gat,34,28,0	warp	qroom_vip_out_qroom_vip	1,1,prt_cas_q.gat,134,8
prt_cas_q.gat,130,32,0	script	qroom_heine_in_qroom_he	45,1,1,{
	if(EP16_1QUE > 7 && EP16_1QUE < 16) {
		mes "�]���͕��Ă���]";
		close;
	}
	warp "prt_cas_q.gat",30,78;
	end;
}

prt_cas_q.gat,34,78,0	warp	qroom_heine_out_qroom_h	1,1,prt_cas_q.gat,134,32
prt_cas_q.gat,130,56,0	script	qroom_nerius_in_qroom_n	45,1,1,{
	if(EP16_1QUE > 2 && EP16_1QUE < 7 || EP16_1QUE > 7 && EP16_1QUE < 15) {
		mes "�]���͕��Ă���]";
		close;
	}
	warp "prt_cas_q.gat",30,128;
	end;
}

prt_cas_q.gat,34,128,0	warp	qroom_nerius_out_qroom_	1,1,prt_cas_q.gat,134,56
prt_cas_q.gat,130,80,0	warp	qroom_valter_in_qroom_b	1,1,prt_cas_q.gat,30,178
prt_cas_q.gat,34,178,0	warp	qroom_balter_out_qroom_	1,1,prt_cas_q.gat,134,80
prt_cas_q.gat,153,119,0	warp	qroom_wigner_in_qroom_w	2,2,prt_cas_q.gat,78,21
prt_cas_q.gat,74,21,0	warp	qroom_wigner_out_qroom_	2,2,prt_cas_q.gat,149,119
prt_cas_q.gat,153,143,0	warp	qroom_richard_in_qroom_	2,2,prt_cas_q.gat,78,77
prt_cas_q.gat,74,77,0	warp	qroom_richard_out_qroom	2,2,prt_cas_q.gat,149,143
prt_cas_q.gat,153,167,0	warp	qroom_geob_in_qroom_geo	2,2,prt_cas_q.gat,78,131
prt_cas_q.gat,74,131,0	warp	qroom_geob_out_qroom_ge	2,2,prt_cas_q.gat,149,167
prt_cas_q.gat,153,191,0	warp	qroom_lugen_in_qroom_lu	2,2,prt_cas_q.gat,78,189
prt_cas_q.gat,74,189,0	warp	qroom_lugen_out_qroom_l	2,2,prt_cas_q.gat,149,191
prt_cas.gat,216,184,0	warp	mainhall_in_mainhall_ou	1,1,prt_cas.gat,93,212
prt_cas.gat,93,208,0	warp	mainhall_out_mainhall_i	1,1,prt_cas.gat,216,180
prt_cas.gat,197,148,0	warp	guestroom_l1_in_guestro	1,1,prt_cas.gat,31,117
prt_cas.gat,31,120,0	warp	guestroom_l1_guestroom_	1,1,prt_cas.gat,197,152
prt_cas.gat,178,148,0	warp	guestroom_l2_in_guestro	1,1,prt_cas.gat,27,43
prt_cas.gat,27,47,0		warp	guestroom_l2_guestroom_	1,1,prt_cas.gat,178,152
prt_cas.gat,235,148,0	warp	guestroom_r1_in_guestro	1,1,prt_cas.gat,174,104
prt_cas.gat,174,108,0	warp	guestroom_r1_guestroom_	1,1,prt_cas.gat,235,152
prt_cas.gat,253,148,0	warp	guestroom_r2_in_guestro	1,1,prt_cas.gat,174,37
prt_cas.gat,174,40,0	warp	guestroom_r2_guestroom_	1,1,prt_cas.gat,253,152
prt_cas.gat,130,218,0	warp	library_in_library_out	1,1,prt_cas.gat,303,48
prt_cas.gat,300,48,0	warp	library_out_library_in	1,1,prt_cas.gat,127,218
prt_cas.gat,174,234,0	warp	cruroom_in_cruroom_out	1,1,prt_cas.gat,247,107
prt_cas.gat,247,111,0	warp	cruroom_out_cruroom_in	1,1,prt_cas.gat,174,237
prt_cas.gat,41,275,0	warp	cuisine_in_cuisine_out	1,1,prt_cas.gat,320,182
prt_cas.gat,320,178,0	warp	cuisine_out_cuisine_in	1,1,prt_cas.gat,41,271
prt_cas.gat,54,217,0	warp	dining_in_dining_out	1,1,prt_cas.gat,388,137
prt_cas.gat,392,137,0	warp	dining_out_dining_in	1,1,prt_cas.gat,58,217
prt_cas.gat,216,142,0	warp	cas_out_prt_to_cas		1,1,prontera.gat,156,354
prt_lib_q.gat,9,25,0	warp	#lib_q_to_pprt			1,1,prt_q.gat,155,335

//============================================================
// �N�G�X�gNPC
//------------------------------------------------------------
prontera.gat,121,72,3	script	�����}�g#e16_prt	833,5,5,{
	if(ASH_1QUE < 100) {	//�ِ��E�N�G�X�g���N���A
		mes "[�}�g]";
		mes "����ɂ��́B���{�ł�";
		mes "�A�b�V���o�L���[���Ŋ�����������X��";
		mes "���҂��ĉ����J���Ă��܂��B";
		mes "�������Ȃ����m���Ă���l�̒���";
		mes "^4d4dff�ِ��E�����֕������p�Y^000000�����炵����";
		mes "���ЁA�����Ă��������B";
		next;
		mes "[�}�g]";
		mes "�R�̏����ł͂Ȃ��`���җl������";
		mes "������͓̂���āA";
		mes "�Ȃ��Ȃ��v���悤�ɐi�܂Ȃ��̂ł��B";
		close;
	}
	if(EP16_1QUE == 0) {
		mes "[�}�g]";
		mes "���҂����������B";
		mes strcharinfo(0)+ "�l�ł��ˁH";
		mes "���[�Ɓc�c";
		next;
		mes "[�}�g]";
		mes "�����A�悩�����B";
		mes "�ԈႢ�Ȃ��ł��ˁB";
		mes "�M���h����z�z���ꂽ";
		mes "�l���̊G�ƈ�v���܂��B";
		next;
		mes "[�}�g]";
		mes "�R�̏����ł͂Ȃ��`���җl������";
		mes "������̂͂Ȃ��Ȃ�����āB";
		mes "�s�s�̋}�g�������F�A";
		mes "�l���G��������";
		mes "���Ȃ�����T���Ă���̂ł��B";
		next;
		menu "���ɂȂɂ��p�ł����H",-;
		mes "[�}�g]";
		mes "�͂��B���͍��A���{�ł�";
		mes "�����N�������j������";
		mes "���Ǝ�Âōs���Ă��܂��B";
		next;
		mes "[�}�g]";
		if(checkquest(201730)) {	// ���_�a�U���ς�
			mes "���̏j����";
			mes strcharinfo(0)+ "�l��";
			mes "^4d4dff�M�o�Ƃ��Ă�����^000000�������̂ł��B";
			mes "�Ȃɂ���A���Ȃ���";
			mes "���́A���������N�𓢔����ꂽ";
			mes "�����҂ł�����I";
		}
		else {
			mes strcharinfo(0)+ "�l��";
			mes "�����Ɠ����ɍv�������p�Y�ł��̂ŁA";
			mes "���̏j����^4d4dff�M�o�Ƃ��Ă�����^000000�������̂ł��B";
		}
		next;
		if(select("�M�o�H","���ҁH","���\�ł�") == 3) {
			mes "[�}�g]";
			mes "���A����Ȃ��Ƃ���������炸";
			mes "�c�c�n�b�I";
			mes "���������āA���󂯂���Ƃ����Ӗ���";
			mes "���\�ł��ł��傤���H";
			mes "���肪�Ƃ��������܂��B";
			next;
		}
		mes "[�}�g]";
		mes "�͂��B���͂����̎g���ł��̂ŁA";
		mes "�ڍׂ͂킩��܂��񂪁A";
		mes "���{�ŕ�����Ǝv���܂��B";
		mes "���̏��ҏ���������ɂȂ��Ă��������";
		mes "�����ɘb�͒ʂ�܂�����B";
		next;
		mes "[�}�g]";
		mes "�����A���{�ł͑����̎҂�";
		mes "���Ȃ��̖K���҂��Ă��܂��B";
		mes "���������{�֌������Ă��������B";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�}�g]";
		mes "�����]�ނ̂ł���΁A";
		mes "���������肳���Ă��������܂��B";
		getitem 6933,1;
		setquest 7681;
		set EP16_1QUE,1;
		next;
		if(select("�����Ă����Ȃ�","�����Ă��炤") == 1) {
			mes "[�}�g]";
			mes strcharinfo(0)+ "�l��";
			mes "���ڌ������Ă�������̂ł��ˁB";
			mes "���肪�Ƃ��������܂��B";
			mes "^FF0000�v�����e����^000000�ɓ������܂�����A";
			mes "������ɂ���j���̉��ē��l��";
			mes "���̏��ҏ�����������������B";
			next;
			mes "[�}�g]";
			mes "����ł͎���";
			mes "���̕��ɂ����ҏ��";
			mes "�͂��Ȃ���΂Ȃ�܂���̂ŁA";
			mes "����Ŏ��炢�����܂��B";
			mes "�悢���Ԃ����߂������������B";
			close;
		}
		mes "[�}�g]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��B";
		mes "�����肵����ɏj���̉��ē��l��";
		mes "����܂��̂ł��������������������B";
		next;
		mes "[�}�g]";
		mes "����ł͂����Ă�����Ⴂ�܂��B";
		mes "�悢���Ԃ����߂������������B";
		close2;
		warp "prt_castle.gat",102,24;
		end;
	} else if(EP16_1QUE < 24) {
		mes "[�}�g]";
		mes "����A" +strcharinfo(0)+ "�l�B";
		mes "�ǂ�����܂����H";
		next;
		if(select("�j����ɑ����ė~����","�Ȃ�ł��Ȃ�") == 2) {
			mes "[�}�g]";
			mes "�����ł����B���炢�����܂����B";
			close;
		}
		mes "[�}�g]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��B";
		mes "�����肵����ɏj���̉��ē��l��";
		mes "����܂��̂ł��������������������B";
		next;
		mes "[�}�g]";
		mes "����ł͂����Ă�����Ⴂ�܂��B";
		mes "�悢���Ԃ����߂������������B";
		close2;
		warp "prt_castle.gat",102,24;
		end;
	} else {
		mes "[�}�g]";
		mes strcharinfo(0)+ "�l�B";
		mes "���{�ɂ����肵�܂��傤���H";
		next;
		if(select("���肢���܂�","���������ł�") == 2) {
			mes "[�}�g]";
			mes "�킩��܂����B";
			close;
		}
		mes "[�}�g]";
		mes "����ł͂����肵�܂��B";
		close2;
		warp "prt_cas.gat",18,29;
		end;
	}
OnTouch:
	if(ASH_1QUE < 100)
		end;
	if(EP16_1QUE == 0)
		unittalk "�����}�g : ���҂����������I�@" +strcharinfo(0)+ "�l�ł͂���܂��񂩁H�@���`�����������Ƃ�����܂��I",1;
	if(EP16_1QUE == 24 && EP162_1QUE == 0)
		unittalk "�����}�g : " +strcharinfo(0)+ "�l�I�@��������M�o���ɂĂ��Ȃ������҂��ł��I",1;
	end;
}

geffen.gat,123,68,3		duplicate(�����}�g#e16_prt)	�����}�g#e16_gef	833,5,5
payon.gat,121,72,3		duplicate(�����}�g#e16_prt)	�����}�g#e16_pay	833,5,5
morocc.gat,121,72,3		duplicate(�����}�g#e16_prt)	�����}�g#e16_moc	833,5,5
alberta.gat,121,72,3	duplicate(�����}�g#e16_prt)	�����}�g#e16_alb	833,5,5
aldebaran.gat,159,113,3	duplicate(�����}�g#e16_prt)	�����}�g#e16_alde	833,5,5
dali.gat,114,88,3		duplicate(�����}�g#e16_prt)	�����}�g#e16_dali	833,5,5

prt_castle.gat,106,27,4	script	�j���̉��ē��l#ep16	105,{
	mes "[�q��]";
	mes "�j�����s���Ă������";
	mes "���ē����Ă���܂��B";
	mes "�Ȃ��A���͋{�a���ɂ���܂���";
	mes "�����̕��X������������̂�";
	mes "�U�镑���ɂ͋C�����Ă��������B";
	next;
	if(select("�s�������ł�","�p�͂Ȃ��ł�") == 2) {
		mes "[�q��]";
		mes "�킩��܂����B";
		close;
	}
	mes "[�q��]";
	mes "����ł͂��ē����܂��B";
	close2;
	warp "prt_cas.gat",216,146;
	end;
}

prt_cas.gat,343,67,4	script	�C����i��#ep16lug0	71,{
	switch(EP16_6QUE) {
	case 5:
		mes "[�C����i��]";
		mes "�悤�����B";
		mes "�{�����T���ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�C����i��]";
			mes "�����͐}���قł��B";
			mes "�܂��͖{��I��ł��������B";
			close;
		}
		mes "[�C����i��]";
		mes "�{�̃^�C�g������e�͂킩��܂����H";
		next;
		menu "���[���~�b�h�K�b�c�̗��j",-;
		mes "[�C����i��]";
		mes "���[���~�b�h�K�b�c�̗��j�ł��ˁB";
		mes "�����œǂ݂܂����H";
		mes "����Ƃ��݂��o���ł����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�݂��o���ł��肢���܂��B";
		next;
		mes "[�C����i��]";
		mes "����ł݂͑��o���؂�";
		mes "��o���Ă��������B";
		next;
		emotion 23,"";
		mes "["+strcharinfo(0)+"]";
		mes "�݂��o���؁H";
		mes "�����Ă��܂��񂪁c�c";
		next;
		mes "[�C����i��]";
		mes "���̏ꍇ�͋K���A";
		mes "�݂��o�����ł��܂���B";
		next;
		emotion 4,"";
		mes "["+strcharinfo(0)+"]";
		mes "����ł݂͑��o���؂�";
		mes "�ǂ�����č��΂����ł����H";
		next;
		mes "[�C����i��]";
		mes "�g���؂��������ɂȂ��";
		mes "�ȒP�Ȋm�F��A�����ɔ��s�\�ł��B";
		next;
		emotion 4,"";
		mes "["+strcharinfo(0)+"]";
		mes "�����ƁA�g���؂��Ȃ��ł��B";
		mes "�j���ɎQ�����Ȃ̂�";
		mes "�ו��͑S�������ɒu���Ă��āc�c";
		next;
		mes "[�C����i��]";
		mes "�j���ł����H";
		mes "���������ďj���ɏ��҂��ꂽ�`���җl�H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�����ł��B";
		next;
		mes "[�C����i��]";
		mes "����ł͉��������҂���";
		mes "�`���җl�̃��X�g�ɂ����O������΁A";
		mes "������ő݂��o�����ł��܂��B";
		next;
		mes "[�C����i��]";
		mes "�����ł͏��҂���";
		mes "�`���җl�̃��X�g��z�z���Ă���A";
		mes "��������Ύ���̖����悤";
		mes "�Ή�����悤�Ɍ����Ă���܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�i�悩�����悤�ȁA";
		mes "�l���̈�����̂悤�ȁc�c�j";
		next;
		mes "[�C����i��]";
		mes "����ł͂����O���ǂ����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes strcharinfo(0)+"�ł��B";
		next;
		mes "[�C����i��]";
		mes "���X���҂����������B";
		mes strcharinfo(0)+"�l�ł��ˁB";
		emotion 0;
		next;
		mes "[�C����i��]";
		mes "����ł݂͑��o�����ނ����ԂɁc�c";
		mes "���̌l�I�Ȏ���ł����A";
		mes "�����Ă��������܂����H";
		mes "�O�ŉ����N���Ă���̂�";
		mes "�S���킩��Ȃ��āB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��B";
		mes "�m���Ă���͈͂̂��̂ł悯��΁B";
		while(1) {
			next;
			mes "[�C����i��]";
			mes "���{�ŊJ����Ă���j���́A";
			mes "���Ƃ̐l��`���җl�܂ŏW�߂�";
			mes "^0000cd��̉��̂��߂�^000000�J����Ă����ł����H";
			next;
			switch(select("���q�̒a��","�����̒a����","�����N�ގ����L�O")) {
			case 1:
				mes "[�C����i��]";
				mes "����A���q�̒a���̏j��";
				mes "���̎����ł͂Ȃ��͂��ł����c�c";
				continue;
			case 2:
				mes "[�C����i��]";
				mes "����A�����̒a���̏j��";
				mes "���̎����ł͂Ȃ��͂��ł����c�c";
				continue;
			case 3:
				mes "[�C����i��]";
				mes "�����A�����ł������B";
				break;
			}
			break;
		}
		while(1) {
			next;
			mes "[�C����i��]";
			mes "���̏j���͑S�Ẳ��Ƃ�";
			mes "�Q�����Ă��邻���ł��ˁB";
			mes "^0000cd���Ƃ͑S���ł�����^000000�Ȃ�ł����H";
			next;
			if(select("�Z����","������","������") != 2) {
				mes "["+strcharinfo(0)+"]";
				mes "���݂܂���B";
				mes "������ƍl���������Ă��܂����B";
				mes "������x���肢���܂��B";
				continue;
			}
			mes "[�C����i��]";
			mes "���ꂶ�ቤ�{��";
			mes "�l�ň�ꂩ�����Ă������ł��ˁB";
			mes "�ő��ɂȂ����Ƃł��傤����B";
			break;
		}
		while(1) {
			next;
			mes "[�C����i��]";
			mes "�����Ƃ���ɂ���";
			mes "^0000cd���ʌp�����ɎQ�����Ȃ�����^000000��";
			mes "���邻���ł����A";
			mes "�ǂ̉Ɩ�ł����H";
			next;
			if(select("�E�B�O�i�[�ƃn�C�l��","���x���u���O�ƃ��n���g","�Q�I���O�ƃo���^�[") != 3) {
				mes "["+strcharinfo(0)+"]";
				mes "���݂܂���B";
				mes "������ƍl���������Ă��܂����B";
				mes "������x���肢���܂��B";
				continue;
			}
			mes "[�C����i��]";
			mes "�Q�I���O�Ƃƃo���^�[�Ɓc�c";
			mes "�m���ɁA�[���ł��܂��ˁB";
			break;
		}
		while(1) {
			next;
			mes "[�C����i��]";
			mes "�O�����É��̉Ɩ��";
			mes "^0000cd�Â���^000000�̂�����";
			mes "�����Ȃ����ƌ����Ă܂�����B";
			next;
			if(select("�l���E�X�Ƃł����H","�Q�I���O�Ƃł����H","���n���g�Ƃł����H") != 2) {
				mes "["+strcharinfo(0)+"]";
				mes "���݂܂���B";
				mes "������ƍl���������Ă��܂����B";
				mes "������x���肢���܂��B";
				continue;
			}
			break;
		}
		mes "[�C����i��]";
		mes "�����ł��B^0000cd�Q�I���O��^000000�ł��ˁB";
		next;
		mes "[�C����i��]";
		mes "�ŋ߂͏j���̂��߂��A";
		mes "�}���قɗ���l�����Ȃ��̂ł����A";
		mes "�����𗣂�邱�Ƃ��ł��Ȃ��̂ŁA";
		mes "�b����ɂȂ��Ă���������";
		mes "�����������ł��B";
		next;
		mes "[�C����i��]";
		mes "�葱�����������܂����B";
		mes "����ł͂����炪";
		mes "���[���~�b�h�K�b�c�̗��j�ł��B";
		next;
		mes "[�C����i��]";
		mes "�݂��o�����Ԃ�1�T�Ԃł��B";
		mes "���؂���Ή��؋���������܂��B";
		mes "�`���җl����͂��������܂��񂪁A";
		mes "�������̂��ԋp�����肢�������܂��B";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�C����i��]";
		mes "����ł́B";
		delquest 14499;
		setquest 14500;
		set EP16_6QUE,6;
		getitem 6926,1;
		next;
		mes "�]�v�����e���̋󂫒n��";
		mes "�@�߂�܂����H�]";
		next;
		if(select("�ړ�����","�ړ����Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���̋󂫒n��";
		mes "�@���������]";
		close2;
		warp "prontera.gat",262,67;
		end;
	case 6:
		mes "[�C����i��]";
		mes "�{�͂����S���ǂ݂܂������H";
		mes "�ǂ����܂��̂悤�ł��ˁB";
		next;
		mes "[�C����i��]";
		mes "�܂��͂�������";
		mes "�C�ɓ���{�̃^�C�g������";
		mes "�T���Ă݂Ă��������B";
		mes "�����ċC�ɂȂ������̂�";
		mes "���Гǂ�ł݂Ă��������B";
		mes "�{�͐S�ɏ�����^������̂ł�����B";
		next;
		mes "�]�v�����e���̋󂫒n��";
		mes "�@�߂�܂����H�]";
		next;
		if(select("�ړ�����","�ړ����Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���̋󂫒n��";
		mes "�@���������]";
		close2;
		warp "prontera.gat",262,67;
		end;
	default:
		mes "[�C����i��]";
		mes "�}���قɂ悤�����B";
		next;
		mes "[�C����i��]";
		mes "�܂��͂�������";
		mes "�C�ɓ���{�̃^�C�g������";
		mes "�T���Ă݂Ă��������B";
		mes "�����ċC�ɂȂ������̂�";
		mes "���Гǂ�ł݂Ă��������B";
		mes "�{�͐S�ɏ�����^������̂ł�����B";
		close;
	}
}

prt_cas.gat,364,69,3	script	�ْ������j#ep16lug01	748,{
	mes "[�ْ������j]";
	mes "���[��A�����ɂ��Ȃ��c�c";
	mes "���������ǂ��ɂ��̖{������񂾁B";
	next;
	mes "[���炩���j]";
	mes "���������A�����܂ł���";
	mes "���e�𒲂ׂ�K�v������̂��H";
	close;
}

prt_cas.gat,365,68,3	script	���炩���j#ep16lug01	898,{
	mes "[�ْ������j]";
	mes "���[��A�����ɂ��Ȃ��c�c";
	mes "���������ǂ��ɂ��̖{������񂾁B";
	next;
	mes "[���炩���j]";
	mes "���������A�����܂ł���";
	mes "���e�𒲂ׂ�K�v������̂��H";
	close;
}

prt_pri00.gat,51,116,8	script	�G�������h�E�������X#EP	751,{
	if(BaseLevel < 150) {
		mes "[�G�������h�E�������X]";
		mes "���Ȃ���";
		mes "�֌W�҂ł͂���܂���ˁH";
		mes "�����͊֌W�҈ȊO��";
		mes "�o������֎~���Ă��܂��B";
		mes "�����͂����肢���܂��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�c�c�܂��A��������";
		mes "���������ɂȂ�����";
		mes "���Ȃ��Ȃ�Ǝv���܂����B";
		next;
		mes "�]^ff0000BaseLv��150�ȏ�̏ꍇ";
		mes "�@^ff0000�v�����e���n���č���";
		mes "�@^ff0000�i�s���邱�Ƃ��o���܂�^000000�]";
		close;
	}
	if(!(checkquest(5415) & 0x8)) {		// �v�����e���n���č����ꋖ��
		mes "[�G�������h�E�������X]";
		mes "����ɂ��́B";
		next;
		mes "[�G�������h�E�������X]";
		mes "����ł����c�c";
		mes "��������͊֌W�҈ȊO��";
		mes "�o������֎~���Ă��܂��B";
		mes "�����͂����肢���܂��B";
		next;
		emotion 0;
		mes "[�G�������h�E�������X]";
		mes "�c�c����ɂ��Ă�";
		mes "�����͒N�ł��o����ł���";
		mes "���ł͂Ȃ��̂ł����c�c";
		mes "�c�c�ނށB";
		next;
		mes "[�G�������h�E�������X]";
		mes "���̖��������N��|���ꂽ�Ƃ���";
		mes "�`���җl�����A";
		mes "���{�̏j���ɏ��҂��ꂽ�Ƃ���";
		mes "�b�𕷂��Ă���܂��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "���̕��e�A�g�����܂ꂽ����c�c";
		mes "���������āc�c";
		next;
		emotion 23;
		mes "[�G�������h�E�������X]";
		mes "���҂��ꂽ�`���җl�́A";
		mes "���Ȃ��ł����H";
		next;
		emotion 38;
		mes "[�G�������h�E�������X]";
		mes "�������c�c�����I";
		mes "�\�ŕ����Ă��܂����B";
		mes "���A���Ȃ��̃t�@���ł��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�j�����J��������";
		mes "�����̌x���ɂȂ��Ă��܂���";
		mes "������ƗJ�T��������ł����A";
		mes "����o����";
		mes "�{���ɂ��ꂵ���ł��I";
		next;
		mes "[�G�������h�E�������X]";
		mes "���ȏЉ���Ă�������!!";
		mes "���͉����N���Z�C�_�[��";
		mes "�G�������h�E�������X�Ɛ\���܂��B";
		mes "�`���җl�̊���𕷂���";
		mes "����Ă���܂���!!";
		next;
		mes "[�G�������h�E�������X]";
		mes "���I";
		mes "�������B";
		mes "�T�C�������肢���Ă�";
		mes "�����ł��傤���H";
		next;
		switch(select("�T�C�����Ȃ�","�T�C������")) {
		case 1:
			mes "[�G�������h�E�������X]";
			mes "�����ł����c�c";
			mes "�c�O�ł����A�d���Ȃ��ł��ˁB";
			mes "�C���������炨�肢���܂��B";
			break;
		case 2:
			input '@str$;
			emotion 14;
			mes "[�G�������h�E�������X]";
			mes '@str$;
			next;
			mes "[�G�������h�E�������X]";
			mes "�c�c���킠�`�I";
			mes "���ӂ��܂��B";
			mes "���������Ɏ����ł���";
			mes "�󕨂��ł��܂����B";
			mes "�����ł��B";
			break;
		}
		next;
		mes "[�G�������h�E�������X]";
		mes "���I�@�����I";
		mes "�������B";
		mes "�����I";
		next;
		mes "[�G�������h�E�������X]";
		mes "���́A�����N���Z�C�_�[����";
		mes "�n���č��Ŕ����������ւ̑Ώ���";
		mes "�L���Ȗ`���җl��";
		mes "���肢���Ă݂悤�Ƃ����b��";
		mes "��������ł��B";
		next;
		menu "�n���č��Ŕ����������H",-;
		mes "[�G�������h�E�������X]";
		mes "���`�I";
		mes "��͂�`���җl�Ȃ�";
		mes "���������Ǝv���܂����B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�����O�Ǝ��͂͂��ł�";
		mes "�ؖ����ꂽ�����R�ł����A";
		mes "�ڂ����󋵂����b�����܂��傤�B";
		next;
		mes "[�G�������h�E�������X]";
		mes "���͂����";
		mes "�������Ɖ������ꂸ�ɂ���A";
		mes "�ƂĂ�����Y�܂����";
		mes "���Ȃ̂ł��c�c";
		next;
		menu "�ق��H",-,"����ȂɁc�c",-,"�͂�",-;
		mes "[�G�������h�E�������X]";
		mes "�������̌x�����邱�̒n���č���";
		mes "�O�͂��Ȃ����������X�^�[������";
		mes "�o�����͂��߂��̂ł��B";
		next;
		menu "�c�c�����X�^�[��",-,"�x�����Ă��ł���ˁH",-,"����͑�ςł���",-;
		mes "[�G�������h�E�������X]";
		mes "�����I";
		mes "�������Ă͍���܂��I";
		next;
		emotion 16;
		mes "[�G�������h�E�������X]";
		mes "�������N���Z�C�_�[������";
		mes "�n���č��ɏo�����������X�^�[�ގ���";
		mes "�͂𒍂��ł��܂��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�ł����A�������̓|�������";
		mes "��������������̂ł��B";
		mes "���Ɏ�ɂ����Ȃ��󋵂܂�";
		mes "���Ă��܂��܂����B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�p���������b�ł���";
		mes "�����X�^�[���ǂ���ʂ���";
		mes "�����Ă��Ă��邩������";
		mes "�c���o���Ă��Ȃ��̂ł��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "���A�����܂���B";
		mes "�O�u����";
		mes "���������ł���ˁB";
		next;
		mes "[�G�������h�E�������X]";
		mes "�`���җl�ɂ��肢�������̂́A";
		mes "�ɂȎ��ɒn���č���";
		mes "�����X�^�[�ގ������肢�������̂ł��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�������A";
		mes "�񍐏��������Ă�������";
		mes "�K�v�͂���܂����B";
		mes "����͎��������܂��B";
		next;
		mes "�]�v�����e���n���č���";
		mes "�@�i�s�ł���悤�ɂȂ����]";
		setquest 5415;
		compquest 5415;
		close;
	}
	mes "[�G�������h�E�������X]";
	mes "�n���č��ɓ���܂����H";
	mes "����Ƃ��Ȃɂ��c�c";
	mes "�C�ɂȂ邱�Ƃł��H";
	next;
	switch(select("�n���č��ɍs��","�n���č��ɂ���","���l�ɂ���","�����悤�ȓz��������悤�ȋC������")) {
	case 1:
		mes "[�G�������h�E�������X]";
		mes "�킩��܂����B";
		mes "�ǂ������C�����āc�c�I";
		close2;
		warp "prt_prison.gat",160,290;
		end;
	case 2:
		mes "[�G�������h�E�������X]";
		mes "�ق��ق��I";
		mes "�n���č����C�ɂȂ�܂����H";
		next;
		mes "[�G�������h�E�������X]";
		mes "��̂̍��ɂ́A�߂�Ƃ����҂�";
		mes "���e����{�݂�����悤�ɁA";
		mes "���[���~�b�h�K�b�c������";
		mes "���a�ƈ��S�����������݂�����";
		mes "�����߂�ׂɍ��ꂽ��";
		mes "�����Ă��܂��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "��{�I�ɏ�v��";
		mes "���Ă��Ă͂��܂����c�c";
		next;
		mes "[�G�������h�E�������X]";
		mes "�ƂĂ��Â��{�݂Ȃ̂�";
		mes "�������C���K�v�ȏ�Ԃł��B";
		mes "�󋵂��󋵂Ȃ̂�";
		mes "�C�����ł��Ă��Ȃ��܂�";
		mes "�Ȃ�ł����ǂˁB";
		next;
		mes "[�G�������h�E�������X]";
		mes "�ł��̂ŁA����A";
		mes "���܂�ǂ���Ԃł͂Ȃ��̂ŁA";
		mes "�n���č��ŉ���Ȃǂ��Ȃ��悤��";
		mes "�C��t���Ă��������B";
		close;
	case 3:
		mes "[�G�������h�E�������X]";
		mes "���Ă��������";
		mes "�Ȃ����Ǝv���܂����A";
		mes "�č��̒��ɂ��鑶�݂�����";
		mes "�����X�^�[�����ł��B";
		mes "�N���ǂ��݂Ă�";
		mes "�����X�^�[�ł���ˁH";
		next;
		mes "[�G�������h�E�������X]";
		mes "���܂�ɂ��Â��{�݂ł�����A";
		mes "���ނ��畴�����Ă���������āc�c";
		mes "�����`�������Ă�����e��";
		mes "�Ȃ�܂����A���b���܂��ˁB";
		next;
		mes "[�G�������h�E�������X]";
		mes "�m���Ȃ̂́A�ނ�͉ߋ�";
		mes "���[���~�b�h�K�b�c������";
		mes "�����Ɋׂꂽ���݂��Ƃ������ƁB";
		next;
		mes "[�G�������h�E�������X]";
		mes "�c�O�Ȃ���ނ�̍ߖ���";
		mes "�������c���Ă���";
		mes "�����͂���܂���B";
		next;
		mes "[�G�������h�E�������X]";
		mes "����N���Z�C�_�[��";
		mes "�ߖ��ƒ������L����Ă���";
		mes "�����𖳂����Ă��܂����Ƃ���";
		mes "���Ƃ������ꂽ����������";
		mes "�`����Ă����ł����c�c";
		next;
		mes "[�G�������h�E�������X]";
		mes "�܂��n���č��ɂ���z���";
		mes "���ɋC�ɂ��Ă��Ȃ������Ȃ̂�";
		mes "���͂Ȃ������ł��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�C�ɂȂ�Ƃ���΁A";
		mes "�������I���������";
		mes "����Ȃ��ɂ��ւ�炸�A";
		mes "�O�ɏo��Ȃ��z���";
		mes "����Ƃ������Ƃł��傤���B";
		close;
	case 4:
		mes "[�G�������h�E�������X]";
		mes "���I";
		mes "���̘b�A�������������Ƃ�";
		mes "����܂��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "���B�A�����N���Z�C�_�[��";
		mes "�W�c�ł�����";
		mes "�`���҂̌o�������҂����܂��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "���̔ނ��n���č��Ɏ��e����Ă���";
		mes "�z��ɂ�������ȃ����X�^�[��";
		mes "�O���������Ă���̂�������";
		mes "�����Ă��܂����B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�N���Z�C�_�[�̊Ԃł�";
		mes "�`���ҏo�g�����炫���ƁA";
		mes "�R�����Ă���ɈႢ�Ȃ���";
		mes "����ɂ͂��Ȃ������̂ł����c�c";
		next;
		emotion 23;
		mes "[�G�������h�E�������X]";
		mes "�����I";
		mes "�`���җl���������Ƃ�";
		mes "�v���Ă��܂����!?";
		mes "�����A�����͕��i����";
		mes "�R��A�ϑz�b�������āc�c";
		next;
		mes "[�G�������h�E�������X]";
		mes "�m�M�������Č����܂����A";
		mes "�O���������Ă��郂���X�^�[��";
		mes "�n���č��ɂ���z���";
		mes "�Ⴄ���݂ł��B";
		next;
		mes "[�G�������h�E�������X]";
		mes "�����A�����̌Z���";
		mes "�����e�ʂ݂����Ȃ��̂ł�";
		mes "�Ȃ����Ɓc�c";
		mes "�����X�^�[�ɌZ���e�ʂ�";
		mes "����̂��͒m��܂��񂪁B";
		close;
	}
}

prt_cas_q.gat,80,80,4	script	���n���g�Ǝ���#EP161GAM	57,{
	if(EP16_1QUE < 2) {
		mes "[����]";
		mes "�����ɂ͌�����������";
		mes "�R�����������Ă���";
		mes "���n���g�Ƃ��؍݂��Ă��܂��B";
		close;
	}
	switch(EP16_5QUE) {
	case 0:
		mes "[����]";
		mes "����ɂ��́B���҂����Ă��܂����B";
		mes "�����ɂ͌�����������";
		mes "�R�����������Ă���";
		mes "���n���g�Ƃ��؍݂��Ă��܂��B";
		next;
		mes "[����]";
		if(checkquest(201730)) {	// ���_�a�U���ς�
			mes "���̖��������N��";
			mes "�������ꂽ�Ƃ���";
		}
		else
			mes "�����N�����ɍv�������Ƃ���";
		mes strcharinfo(0)+ "�l�̖�����";
		mes "���X�A���ɂ��Ă���܂��B";
		mes "����ł��Č��h�ł��B";
		next;
		mes "[����]";
		mes "�����̒��ŉ䂪���n���g�Ƃ�";
		mes "�|�[�l�����҂��ł��B";
		next;
		setquest 5402;
		set EP16_5QUE,1;
		mes "[����]";
		mes "����ł͂��ē����܂��B";
		close;
	case 1:
		mes "[����]";
		mes "�䂪���n���g�Ƃ�";
		mes "�|�[�l�����҂��ł��B";
		mes "�ǂ��������肭�������B";
		close;
	case 2:
		mes "[����]";
		mes "�|�[�l�Ƃ��b�͂���܂������H";
		close;
	case 3:
	case 4:
		//if(!(checkquest(73125) & 0x8))
		//	setquest 73125;
		//compquest 73125;
		mes "[����]";
		mes "�퓬�P�����s���Ă���������̂ł��ˁB";
		mes "���͂Ɋ��ӂ��܂��B";
		mes "���̗��{�̑O�ɂ���^ff0000�`���Ҋ��}��^000000��";
		mes "���n���g�Ƃ̌P���������܂��B";
		mes "�ނ���퓬�P�����󂯂Ă��������B";
		next;
		mes "[����]";
		mes "��낵����΁A";
		mes "�����܂ł��ē��������܂��傤���H";
		next;
		if(select("���肢����","�����̑��ŕ����Ă���") == 2) {
			mes "[����]";
			mes "�������܂�܂����B";
			close;
		}
		mes "[����]";
		mes "�������܂�܂����B";
		mes "�ł͂�����ւǂ����B";
		close2;
		warp "prt_cas.gat",15,30;
		end;
	}
	end;
}

prt_cas_q.gat,93,74,4	script	�|�[�E���n���g#EP161GAM	993,{
	switch(EP16_5QUE) {
	case 0:
		cutin "richard_po02.BMP",2;
		emotion 19,"�|�[�E���n���g#EP161GAM";
		mes "[�|�[]";
		mes "�₠�A�L�~��";
		mes "�j���ɏ��҂��ꂽ�`���҂��ȁH";
		mes "�c�c���܂Ȃ����A";
		mes "���͂��ܔ��Ă���̂�";
		mes "�x�݂����̂��B";
		next;
		mes "[�|�[]";
		mes "�����̑O�ɂ��鎷���ɘb����";
		mes "���Ԃ����߂Ă���";
		mes "�܂�����Ƃ����B";
		close2;
		cutin "richard_po01.BMP",255;
		end;
	case 1:
		cutin "richard_po02.BMP",2;
		emotion 52,"�|�[�E���n���g#EP161GAM";
		mes "[�|�[]";
		if(checkquest(201730)) {	// ���_�a�U���ς�
			mes "�₠�B�L�~�����������N��";
			mes "���������Ƃ���";
		}
		else {
			mes "�₠�B�L�~�����������N��";
			mes "�����ɍv�������Ƃ���";
		}
		mes "�`���҂Ȃ񂾂ˁH";
		mes "���̖����͉����ɂ�";
		mes "�L���m���Ă����B";
		next;
		menu "�����A�Ɏf���܂���",-;
		mes "[�|�[]";
		mes "����͂���́B";
		mes "�킴�킴���k���B";
		mes "�悤�����A���n���g�ƂցB";
		next;
		mes "[�|�[]";
		mes "�j�����y����ł��邩�H";
		mes "����Ƃ����ʌp���ɂ��Ă̕���";
		mes "�C�ɂȂ邩�H";
		mes "�ӂӂӁA";
		mes "���̎������ʂɂ��Ǝv�����H";
		next;
		mes "[�|�[]";
		mes "���͉��ʂɋ���������B";
		mes "�����A�ŋ߂͌R���ʂɂ��Ă̂ق���";
		mes "����������̂��B";
		next;
		mes "[�|�[]";
		mes "���ɂȂ��Ă����";
		mes "���̉��Ƃ̉Ɩ�A����";
		mes "�y�������ꂽ��l���Ă��������ȁB";
		next;
		mes "[�|�[]";
		mes "�����A���͉��ʂ��";
		mes "�L�~�̂ق��ɋ���������B";
		next;
		menu "���I",-;
		mes "[�|�[]";
		mes "�c�c�܂��A���̘b�͌�ł悢���B";
		mes "���A��肪����̂��낤�H";
		mes "�j�����y����ōs���Ă���B";
		next;
		cutin "richard_po02.BMP",255;
		delquest 5402;
		delquest 73053;
		set EP16_5QUE,2;
		if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
			mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
			mes "�@�x���̂Ƃ���ɖ߂낤�]";
		} else {
			mes "�]^0000cd���n���g�ƂƂ̈��A���ς܂����B^000000";
			mes "�@���̉��Ƃɂ����A�ɍs�����]";
		}
		next;
		mes "�]�������낤�Ƃ����";
		mes "�@�|�[���b�������Ă����]";
		next;
		cutin "richard_po02.BMP",2;
		mes "[�|�[]";
		mes "���A���ŖZ�������������A";
		mes "�悩�����玄�̘b�𕷂��Ăق����B";
		mes "�O����L�~�ɒ��ڂ��Ă����̂��B";
		mes "���Ԃ�����Ȃ��";
		mes "���ɘb�������ė~�����B";
		close2;
		cutin "richard_po02.BMP",255;
		end;
	case 2:
		cutin "richard_po02.BMP",2;
		mes "[�|�[]";
		mes "�䂪���n���g�Ƃ�";
		mes "�L�~�ɒ��ڂ��Ă��闝�R��";
		mes "�b�����Ƃɂ��悤���B";
		next;
		mes "�]�|�[�E���n���g�������^�ʖڂ�";
		mes "�@����ɂȂ����]";
		next;
		mes "[�|�[]";
		mes "���n���g�Ƃ͌Â����A";
		mes "���m���琬�A��������";
		mes "���[���~�b�h�K�b�c�����̍��h��";
		mes "�S���Ă���B";
		mes "�܂��A�푈���ƌĂԎ҂����邪�ȁB";
		next;
		mes "[�|�[]";
		mes "�D�ꂽ���m�B";
		mes "���A���n���g�Ƃ����߂�D�ꂽ���m�Ƃ�";
		mes "�������ǂɑΉ��ł��镺�m���B";
		mes "���̂��߂ɁA���m������";
		mes "���n���g�Ƃ̐헪�Ɛ�p��";
		mes "�@������ł���B";
		next;
		mes "[�|�[]";
		mes "�ǂ̂悤�ȍ�����낤�Ƃ��A";
		mes "�@������g���ē˔j����";
		mes "���m�̑�ʐ��Y�B";
		mes "���ꂪ���̎�����Ԗ]�ނ��̂��B";
		next;
		mes "[�|�[]";
		mes "�킢�͕ω����A�i������B";
		mes "�����炱���A����ɑΉ��ł���";
		mes "�헪�Ɛ�p���K�v�Ȃ̂��B";
		next;
		mes "[�|�[]";
		mes "���Ȃ킿�A";
		mes "�����̐��̌o�����K�v�ɂȂ�B";
		mes "�����ŃL�~�ւ̂��肢���B";
		mes "����A�L�~��";
		mes "���̎w�肷��퓬�P�����s���Ă��炢";
		mes "��p�f�[�^���Ƃ肽���̂��B";
		next;
		mes "[�|�[]";
		mes "�������A���͂��Ă�����";
		mes "����Ɍ�������V���x������B";
		mes "�ǂ����H";
		mes "���݂������b�ł͂Ȃ��Ǝv�����B";
		next;
		if(select("�퓬�P���ɒ��킷��","�f��") == 2) {
			emotion 57,"�|�[�E���n���g#EP161GAM";
			mes "[�|�[]";
			mes "�������B�c�O�����d���Ȃ��ȁB";
			mes "�C���ς������K�˂ė��Ă���B";
			close2;
			cutin "richard_po02.BMP",255;
			end;
		}
		emotion 33,"�|�[�E���n���g#EP161GAM";
		mes "[�|�[]";
		mes "�������I�@�������I";
		mes "�`�������W���_�����Ȏ҂�";
		mes "�ƂĂ��D�������I";
		mes "���͊��ӂ���B";
		next;
		mes "[�|�[]";
		mes "�����Ɏ蔤�𐮂��Ă����悤�`����B";
		mes "�L�~�͏�������������";
		mes "�ނɐ��������Ă���B";
		mes "���ʂ��y���݂ɂ��Ă邼�I";
		next;
		mes "[�|�[]";
		mes "������邽�߂ɂ�";
		mes "�ǂ����Ă����͂��K�v�Ȃ̂��B";
		next;
		mes "[�|�[]";
		mes "���̐��N�A����͑傫���ω������B";
		mes "���������N�̓o��ɂ��";
		mes "�ِ��E�ւ̐i�o�B";
		mes "�����āA�َ푰�̋Z�p���������A";
		mes "���_�ƂȂ��������N���瓢���ł����B";
		next;
		mes "[�|�[]";
		mes "�c�c�����ׂ����ƂɂˁA";
		mes "����߂邱�Ƃ��\�ɂȂ�A";
		mes "�ߋ��̉p�Y��̐l�ɂ�";
		mes "���悤�ɂȂ����B";
		next;
		mes "[�|�[]";
		mes "���̏󋵂Ŏ���";
		mes "�l���Ȃ��Ă͂����Ȃ���B";
		mes "�c�c�ނ炪�G�ɂȂ����ꍇ�A";
		mes "�ǂ̂悤�ɓ|���΂悢�̂��낤���A�ƁB";
		next;
		mes "[�|�[]";
		mes "���t�B�l����|�����߂ɂ́A";
		mes "�T�t�@����|�����߂ɂ́A";
		mes "���V�A����|�����߂ɂ́A";
		mes "�ߋ��̎���̕��m��|�����߂ɂ�";
		next;
		mes "[�|�[]";
		mes "�ǂ̂悤�Ȑ헪�Ɛ�p��";
		mes "�K�v�ɂȂ�̂��B";
		next;
		if(select("�ނ�͓G����Ȃ��ł��I","����Ȃ��Ƃ��l���Ȃ���΁c�c") == 1) {
			mes "[�|�[]";
			mes "�C���������Ȃ��ł���B";
			mes "�ނ��G�Ƃ͎v���Ă͂��Ȃ��B";
			mes "�����A���n���g�Ƃ̒��Ƃ��ẮA";
			mes "�l���Ȃ��Ă͂����Ȃ��̂���B";
			next;
			mes "[�|�[]";
			mes "����ł͐퓬�P���𗊂ނ�B";
			mes "�ڂ����͎����ɕ����Ă���B";
			setquest 5403;
			set EP16_5QUE,3;
			close2;
			cutin "richard_po02.BMP",255;
			end;
		}
		mes "[�|�[]";
		mes "�c�c";
		mes "�ӊO���ȁB";
		mes "���A";
		mes "���̂悤�ȍl�������鎄�ɂ�";
		mes "������������҂������̂����B";
		next;
		mes "[�|�[]";
		mes "����������ƈ����C�͂��Ȃ��B";
		mes "�t�t�t�A";
		mes "�L�~���C�ɓ�������B";
		next;
		if(select("��������","�ǂꂭ�炢�C�ɓ������H") == 1) {
			mes "[�|�[]";
			mes "����ł͐퓬�P���𗊂ނ�B";
			mes "�ڂ����͎����ɕ����Ă���B";
			setquest 5403;
			set EP16_5QUE,3;
			close2;
			cutin "richard_po02.BMP",255;
			end;
		}
		mes "[�|�[]";
		mes "�ǂꂭ�炢�����āH";
		mes "�n�b�n�b�n�b�n�I";
		mes "�L�~�͖{���ɖʔ����ȁI";
		next;
		mes "[�|�[]";
		mes "�c�c�������ȁB";
		next;
		mes "[�|�[]";
		mes "�L�~�ɁA";
		mes "�v���|�[�Y�����������炢���ȁB";
		mes "�@";
		mes "�]�|�[�E���n���g�͏΂��Ȃ��猾�����]";
		next;
		if(select("�ʔ����ł���","�͂��A���󂯂��܂��I") == 2) {
			if(Sex) {
				mes "[�|�[]";
				mes "�n�b�n�b�n�b�n�I";
				mes "�c�O�Ȃ���䂪���ł�";
				mes "��������F�߂Ă��Ȃ��̂�";
				mes "���f�肵�悤�B";
			} else {
				mes "[�|�[]";
				mes "�n�b�n�b�n�b�n�b�I";
				mes "���������Ă��炦���";
				mes "��k�ł����������̂��B";
			}
			next;
		}
		mes "[�|�[]";
		mes "����ł͐퓬�P���𗊂ނ�B";
		mes "�ڂ����͎����ɕ����Ă���B";
		close2;
		cutin "richard_po02.BMP",255;
		end;
	case 3:
	case 4:
		cutin "richard_po02.BMP",2;
		mes "[�|�[]";
		mes "�P���̐i���͂ǂ����H";
		mes "�ȒP�����Ɍ�������̂ł�";
		mes "���܂���f���Ȃ������������B";
		close2;
		cutin "richard_po02.BMP",255;
		end;
	}
	end;
}

prt_cas.gat,218,182,3	script	�������R�m#01	751,{
	mes "[�������R�m]";
	mes "������͖��������N�������j��";
	mes "���̉��ƂȂ�܂��B";
	mes "���ꂳ��܂����H";
	next;
	if(select("���ꂷ��","���ꂵ�Ȃ�") == 2) {
		mes "[�������R�m]";
		mes "���m�������܂����B";
		mes "����̍ۂ́A���ɂ����|�����������B";
		close;
	}
	mes "[�������R�m]";
	mes "����ł�";
	mes "���ւ��ē��������܂��B";
	close2;
	warp "prt_cas.gat",93,212;
	end;
}

prt_cas.gat,97,216,2	script	���]#vip_alimi	968,{
	mes "[���]]";
	mes "���y���݂��������Ă��܂����H";
	mes "�v���Ԃ�̉����s���ł��̂�";
	mes "�͂肫���ď��������܂����B";
	mes "���C�ɏ����Ɨǂ��̂ł����B";
	close;
}

prt_cas.gat,93,214,0	script	#vip_alimi	139,4,1,{
OnTouch:
	if(EP16_1QUE > 0) {
		switch(getbaseclass(Class,2)) {
		case CLASS_SM:
		case CLASS_KN:
		case CLASS_CR:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : ���x�Ȏ��̌�" +strcharinfo(0)+ "�l�ł��B",1;
			break;
		case CLASS_MG:
		case CLASS_WZ:
		case CLASS_SA:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �^���̒T����"+strcharinfo(0)+"�l�ł��B",1;
			break;
		case CLASS_AC:
		case CLASS_HT:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : ����؂��"+strcharinfo(0)+"�l�ł��B",1;
			break;
		case CLASS_BA:
		case CLASS_DC:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �K���̓`���t"+strcharinfo(0)+"�l�ł��B",1;
			break;
		case CLASS_AL:
		case CLASS_PR:
		case CLASS_MO:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �傢�Ȃ�_�̑㗝�l" +strcharinfo(0)+ "�l�ł��B",1;
			break;
		case CLASS_MC:
		case CLASS_BS:
		case CLASS_AM:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �������鉩���̎�" +strcharinfo(0)+ "�l�ł��B",1;
			break;
		case CLASS_TF:
		case CLASS_AS:
		case CLASS_RG:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �Â��Ȃ�ł̎x�z��" +strcharinfo(0)+ "�l�ł��B",1;
			break;
		case CLASS_NV:
		case CLASS_SNV:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �͂��܂���L�������"+strcharinfo(0)+"�l�ł��B",1;
			break;
		default:
			unittalk getnpcid(0,"���]#vip_alimi"),"���] : �h�邬�Ȃ��M�O�̃}�X�^�[" +strcharinfo(0)+ "�l�ł��B",1;
			break;
		}
	}
	end;
}

prt_cas.gat,161,168,5	script	�������R�m#02	751,{
	mes "[���R�m]";
	mes "�v�����e�������";
	mes "���ē����܂��B";
	next;
	switch(select("���{","�j����","���v�ł�")) {
	case 1:
		mes "[���R�m]";
		mes "���������Ɍ��������";
		mes "���{�ւ̏o������ł��B";
		mes "�n�C�l���A�l���E�X�A�o���^�[�Ƃ�";
		mes "�M�o�p�̋q��������܂��B";
		close;
	case 2:
		mes "[���R�m]";
		mes "�j����͂������瓌�̒ʘH�̐�A";
		mes "�����ɂ���傫�ȓ�������";
		mes "�����ꂢ�������܂��B";
		close;
	case 3:
		mes "[���R�m]";
		mes "�Ȃɂ��������܂�����";
		mes "�����|�����������B";
		close;
	}
}

prt_cas.gat,270,168,3	script	�������R�m#03	751,{
	mes "[���R�m]";
	mes "�v�����e�������";
	mes "���ē����܂��B";
	next;
	switch(select("���{","�j����","���v�ł�")) {
	case 1:
		mes "[���R�m]";
		mes "���������Ɍ��������";
		mes "���{�ւ̏o������ł��B";
		mes "�E�B�O�i�[�A���x���u���O�A";
		mes "�Q�I���O�A���n���g�Ƃ�";
		mes "�q��������܂��B";
		mes "�Q�I���O�Ƃ͌����Ƃł��B";
		close;
	case 2:
		mes "[���R�m]";
		mes "�j����͂������琼�̒ʘH�̐�A";
		mes "�����ɂ���傫�ȓ�������";
		mes "�����ꂢ�������܂��B";
		close;
	case 3:
		mes "[���R�m]";
		mes "�Ȃɂ��������܂�����";
		mes "�����|�����������B";
		close;
	}
}

prt_pri00.gat,58,128,4	script	�Ď��҃e���P�X#ep16	732,{
	if(EP16_1QUE == 13) {
		mes "[�Ď��҃e���P�X]";
		mes "����A�������B";
		mes "�c�c���Ƃ̋L���̊Ԃ���o��";
		mes "�����ɂ���Ƃ������Ƃ́A";
		mes "�ړ��̋���";
		mes "������Ă���悤�ł��ˁB";
		next;
		mes "[�Ď��҃e���P�X]";
		mes "�O�ֈē����܂��傤�B";
		mes "�K�i�ɉ����Đi�ނƁA";
		mes "�N���Z�C�_�[�̎������֏o�܂���B";
		mes "��x�M�o���ɖ߂�A";
		mes "���]����b�𕷂��Ɨǂ��ł��傤�B";
		mes "���C�����āB";
		delquest 7695;
		setquest 7696;
		set EP16_1QUE,14;
		close2;
		warp "prt_pri00.gat",53,128;
		end;
	}
	if(EP16_1QUE > 13) {
		mes "[�Ď��҃e���P�X]";
		mes "�ǂ�����܂������H";
		next;
		if(select("���Ƃ̋L���̊Ԃɍs��","�O�ɏo��")==2) {
			mes "[�Ď��҃e���P�X]";
			mes "�O�ł��ˁB�ǂ����B";
			close2;
			warp "prt_pri00.gat",53,128;
			end;
		}
		mes "[�Ď��҃e���P�X]";
		mes "�͂��B���C�����āB";
		mes "�o�����l�Ɍ����Ȃ��悤��";
		mes "�����ӂ��B";
		close2;
		warp "prt_lib.gat",9,28;
		end;
	}
	mes "[�Ď��҃e���P�X]";
	mes "�C�s�̎ז��ł��B";
	mes "�悻�֍s���Ă��������B";
	close;
OnInit:
	setcell "prt_pri00.gat",60,127,0;
	end;
}


prt_cas.gat,188,258,0	script	prt_cas_to_prt_pri00	45,1,1,{
OnTouch:
	if(EP16_1QUE < 2) {
		unittalk getnpcid(0,"���R�m#ep16_prigate01"),"���R�m : ���̐�ɂ͏���ɓ���Ȃ��ł��������B",1;
		if(!sleep2(3000)) end;
		warp "prt_cas.gat",182,258;
		end;
	}
	warp "prt_pri00.gat",54,134;
	end;
}

prt_cas.gat,180,264,3	script	���R�m#ep16_prigate01	751,{
	unittalk "���R�m : �N���Z�C�_�[�̎������͘L���̍ŉ��ɂ���܂��B",1;
	end;
}

prt_cas.gat,180,251,3	script	���R�m#ep16_prigate02	751,{
	unittalk "���R�m : �Ζ����A�ُ�Ȃ��c�c",1;
	if(!sleep2(2000)) end;
	unittalk "���R�m : �����A������֎��ԂɂȂ��āc�c",1;
	end;
}

prt_cas.gat,91,237,3	script	�G�L�i�V�A#ep16_etc01	803,{
	if(ASH_5QUE < 31) {	// ���������N�ǐՃN�G�X�g
		mes "[�G�L�i�V�A]";
		mes "���̂悤�ȏj����";
		mes "�݂��Ă��炦��Ƃ́c�c";
		mes "�ِ��E�֌������ƌ��߂����ɂ�";
		mes "�\�z���Ȃ��������Ƃł��B";
		next;
		mes "[�G�L�i�V�A]";
		mes "�ƂĂ����ꂵ�����̂ł��ˁB";
		close;
	}
	mes "[�G�L�i�V�A]";
	mes "���Ȃ������҂���Ă����̂ł��ˁI";
	mes "���v���Ԃ�ł��B";
	next;
	cutin "mocseal_rin01.bmp",2;
	mes "[���[��]";
	mes "����A�܂������Ă����̂ˁB";
	mes "����ȏꏊ�ŉ��Ƃ́B";
	mes "���������΃L�h���ꏏ�ɗ��Ă���B";
	mes "�ǂ����֍s���Ă邯�ǁB";
	next;
	cutin "mocseal_rin01.bmp",255;
	mes "[�G�L�i�V�A]";
	mes "�M���h�̐l�ɉ�����ƌ����Ă����̂�";
	mes "�ǂ����Řb������ł�̂ł�";
	mes "�Ȃ��ł��傤���B";
	next;
	cutin "mocseal_rin01.bmp",2;
	mes "[���[��]";
	mes "���������΁B";
	mes "�m�荇�����ۂ��l�ɗU����";
	mes "�H���ɍs�����Č����Ă���B";
	mes strcharinfo(0)+ "��";
	mes "���A���ɍs���Ă����ĂˁB";
	next;
	cutin "mocseal_rin01.bmp",255;
	mes "[�G�L�i�V�A]";
	mes "�����ł��ˁB";
	mes "�v���Ԃ�ł����A";
	mes "����Ă݂��炢���ł��ˁB";
	mes "�����������ԂƏj�����y���݂܂��傤�B";
	close;
}

prt_cas.gat,89,238,5	script	���[��#ep16_etc02	885,{
	if(ASH_5QUE < 31) {	// ���������N�ǐՃN�G�X�g
		cutin "mocseal_rin01.bmp",2;
		mes "[���[��]";
		mes "�Ȃ�قǁA�T���Ȑl�Ԃ�";
		mes "��������ėV�Ԃ̂ˁB";
		mes "��������������A";
		mes "�Y��ȃh���X�ł�";
		mes "���Ċy������������B";
		close2;
		cutin "mocseal_rin01.bmp",255;
		end;
	}
	cutin "mocseal_rin01.bmp",2;
	mes "[���[��]";
	mes "�Ȃ�قǁA�T���Ȑl�Ԃ�";
	mes "��������ėV�Ԃ̂ˁB";
	mes "����A" +strcharinfo(0);
	mes "���������̋@����́B";
	mes "�y���݂܂��傤�B";
	close2;
	cutin "mocseal_rin01.bmp",255;
	end;
}

prt_cas.gat,367,123,7	script	�L�h#ep16_etc04	884,{
	if(ASH_5QUE < 31) {	// ���������N�ǐՃN�G�X�g
		mes "[�L�h]";
		mes "���[�����A�G�L�i�V�A��";
		mes "��̂ǂ��ɍs���Ă��܂����񂾁B";
		mes "��l�Ƃ����؂ȉ���";
		mes "�����ꂷ�����낤�B";
		cutin "mocseal_kid01.bmp",2;
		next;
		mes "[�L�h]";
		mes "�܂�����";
		mes "�����͍��؂�����";
		mes "���ɂ͒ނ荇��Ȃ��ꏊ���B";
		mes "�@";
		mes "�܂��A���܂ɂ͗ǂ����B";
		close2;
		cutin "mocseal_kid01.bmp",255;
		end;
	}
	mes "[�L�h]";
	mes "�v���Ԃ肾�ȁB";
	mes "�������[���ƃG�L�i�V�A�ɂ͉�������H";
	cutin "mocseal_kid01.bmp",2;
	next;
	mes "[�L�h]";
	mes "��l�Ƃ����؂ȉ���";
	mes "�����Ԃ�";
	mes "������Ă������낤�H";
	next;
	mes "[�L�h]";
	mes "�c�c�����͍��؂�����";
	mes "���ɂ͒ނ荇��Ȃ��B";
	mes "�@";
	mes "�܂��A���܂ɂȂ�ǂ����B";
	close2;
	cutin "mocseal_kid01.bmp",255;
	end;
}

prt_cas.gat,215,146,0	script	#ep16_evt_01_on	139,1,1,{
	end;
OnTouch:
	if(EP16_1QUE == 1) {
		cloakoffnpc "���]�x��#ep16_01";
		unittalk getnpcid(0,"���]�x��#ep16_01"),"���]�x�� : ���҂����Ă��܂����B" +strcharinfo(0)+ " �l�B",1;
	}
	end;
}

prt_cas.gat,217,150,3	script(CLOAKED)	���]�x��#ep16_01	967,{
	if(EP16_1QUE == 1) {
		mes "[���]�x��]";
		mes strcharinfo(0)+ "�l";
		mes "���҂����Ă���܂����B";
		mes "�����A�j���̏��ҏ��";
		mes "���͂��ł����悤�ł��ˁB";
		next;
		mes "[���]�x��]";
		mes "�����ł̐����ɕs�ւ��Ȃ��悤";
		mes "�����b�����Ă��������܂��B";
		mes "�x���E�g���C���C�g�Ɛ\���܂��B";
		mes "�ǂ����A�x���Ƃ��Ăт��������B";
		next;
		mes "[���]�x��]";
		mes strcharinfo(0)+ "�l��";
		mes "���ʂȋM�o�Ƃ���";
		mes "���҂���Ă���܂��̂ŁA";
		mes "�������̗p�ӂ��������܂��B";
		next;
		mes "[���]�x��]";
		mes "�܂������i��ł���������";
		mes "�L���̏\���H���A";
		mes "^4d4dff����^000000�i��ł��������B";
		next;
		mes "[���]�x��]";
		mes "���́A��ɍs����";
		mes "�����̏����������Ă��������܂��̂ŁA";
		mes "�������Ƃ��z�����������B";
		close2;
		cloakonnpc "���]�x��#ep16_01";
	}
	end;
}

prt_cas.gat,163,163,0	script	#ep16_evt_02_on	139,3,3,{
OnTouch:
	if(EP16_1QUE == 1) {
		cloakoffnpc "���]�x��#ep16_02";
		unittalk getnpcid(0,"���]�x��#ep16_02"),"���]�x�� : ������ł��B�����̘L����i��ł��������B"+strcharinfo(0)+"�l�B",1;
	}
	end;
}

prt_cas.gat,155,165,4	script(CLOAKED)	���]�x��#ep16_02	967,{
	if(EP16_1QUE == 1) {
		mes "[���]�x��]";
		mes "�M�o�p�̋q����";
		mes "������ɗp�ӂ���Ă��܂��B";
		mes "�����Ă����Ɍ�����";
		mes "^4d4dff��ԍŏ��̕���^000000�ł��B";
		next;
		mes "[���]�x��]";
		mes "���ʂȋM�o�̐����ɂ��Ă�";
		mes "���������ꂽ���";
		mes "���������Ă��������܂��̂�";
		mes "������܂ł��z�����������B";
		close2;
		cloakonnpc "���]�x��#ep16_02";
	}
	end;
}

prt_cas_q.gat,146,8,0	script	#ep16_evt_03_on	139,1,1,{
	if(EP16_1QUE == 1) {
		cloakoffnpc "���]�x��#ep16_03";
		unittalk getnpcid(0,"���]�x��#ep16_03"),"���]�x�� : ������̂������ɂȂ�܂��B"+strcharinfo(0)+"�l�B",1;
	}
	end;
}

prt_cas_q.gat,135,10,4	script(CLOAKED)	���]�x��#ep16_03	967,{
	if(EP16_1QUE == 1) {
		mes "[���]�x��]";
		mes "�ڂ������e�ɂ��܂��Ă�";
		mes "���������";
		mes "���������Ă��������܂��B";
		mes "�ǂ����A�����肭�������B";
		close2;
		cloakonnpc;
	}
	end;
}

prt_cas_q.gat,26,30,3	script	���]�x��#ep16_main	967,{
	switch(EP16_1QUE) {
	case 0:
		end;
	case 1:
		if(countitem(6933) > 0)
			delitem 6933,1;
		mes "[���]�x��]";
		mes "�����J���������܂���";
		mes "���肪�Ƃ��������܂��B";
		mes "�M�o�ł���������";
		mes strcharinfo(0)+ "�l�ɂ�";
		mes "���ʂɗ��{�̕�����";
		mes "���蓖�Ă��Ă��܂��B";
		next;
		mes "[���]�x��]";
		mes "�����ɂ��܂��ẮA";
		mes "�������ē����܂��̂ŁA";
		mes "�m�F�̍ۂɂ�";
		mes "���\���t�����������B";
		next;
		if(select("�M�o�ɂ��ĕ���","��낵�����肢���܂�") == 2) {
			mes "[���]�x��]";
			mes "���肪�Ƃ��������܂��B";
			mes strcharinfo(0)+ "�l�ɂ�";
			mes "�S�n�悢�؍݂ɂȂ��܂��悤";
			mes "�s�͂����Ă��������܂��B";
			next;
			mes "[���]�x��]";
			mes "����ł́A��������";
			mes "���ʂȋM�o�̈Ӗ��ɂ���";
			mes "���������Ă��������܂��B";
			next;
		}
		mes "[���]�x��]";
		mes "���݁A����ŊJ�Â��Ă���";
		mes "���������N�����̏j���́A";
		mes "�A�b�V���o�L���[���ւ�";
		mes "�������A�҂��j���A";
		mes "�J�����߂̂��̂ł����c�c";
		next;
		mes "[���]�x��]";
		mes "�����ɁA�ƂĂ��d�v��";
		mes "���ʌp���Ҍ���̂��߂�";
		mes "�Ȃł�����̂ł��B";
		next;
		mes "[���]�x��]";
		mes "�e���Ƃ���r�o���ꂽ";
		mes "���ʌp�������������a��������";
		mes "�]�����󂯂āA";
		mes "���̏j���̍Œ���";
		mes "^FF0000���̉��ʌp���҂�����^000000";
		mes "�ƂȂ�\��ł��B";
		next;
		mes "[���]�x��]";
		mes "�����āA�����ȑՊ������s����O��";
		mes "���s����鉤�Ƃ����̋V����";
		mes "�ʉ߂���΁A";
		mes "���[���~�b�h�K�b�c������";
		mes "�V���������É���";
		mes "�}���邱�ƂɂȂ�ł��傤�B";
		next;
		switch(select("����Ǝ����ɂȂ�̊֌W���H","���Ƃ����Ŏ��s�����V���Ƃ�")) {
		case 1:
			mes "[���]�x��]";
			mes strcharinfo(0)+ "�l��";
			mes "���́A���Ƃ����Ŏ��s�����A";
			mes "�������ʌp���҂�";
			mes "���̒n�ɏZ�ގ҂ɔF�߂��邽�߂�";
			mes "�K�v�ȋV���ւ�";
			mes "����l�Ƃ��ď��҂��ꂽ�̂ł��B";
			break;
		case 2:
			mes "[���]�x��]";
			mes "�����Ƃ̌���Ȃ��h���̂��߂ɁA";
			mes "�����āA���������ɑI�肳�ꂽ�҂�";
			mes "���̒n�̖���";
			mes "�F�߂��邽�߂ɍs��";
			mes "���������̔閧�̋V���ł��B";
			next;
			mes "[���]�x��]";
			mes  strcharinfo(0)+ "�l��";
			mes "���̋V���̗���l�Ƃ���";
			mes "���҂��ꂽ�̂ł��B";
			break;
		}
		next;
		mes "[���]�x��]";
		mes "�V���̗���l�́A";
		mes "�e�M���h�Ő��E���ꂽ�L�\�Ȑl���A";
		mes "�܂��ِ͈��E������";
		mes "�P���������т𗧂Ă��p�Y��";
		mes "���̎��i��^���邱�Ƃɂ��������ł��B";
		next;
		if(checkquest(201730)) {	// ���_�a�U���ς�
			mes "[���]�x��]";
			mes "���Ȃ���";
			mes "���������N�𓢔����ꂽ�p�Y�ł�����";
			mes "�I�΂�Ȃ��ق���";
			mes "�Ԉ���Ă���ł��傤�ˁB";
		}
		else {
			mes "[���]�x��]";
			mes "�����Ă��̌��ʁA";
			mes strcharinfo(0)+ "�l��";
			mes "�I�肳�ꂽ�̂ł��B";
		}
		next;
		menu "�V���͂��s�����ł����H",-;
		mes "[���]�x��]";
		mes "�������A�m�����ł�";
		mes "���Ɍp���Ҍ����";
		mes "�ŏI�i�K�̂悤�ł��B";
		next;
		mes "[���]�x��]";
		mes "��̉��l���a�ɂ��ވʂ���āA";
		mes "�����A���{���A���Ȃ�";
		mes "�������Ă��܂������c�c";
		mes "�K���ɂ��ă��[���~�b�h�K�b�c������";
		mes "�����Ƃ��x���Ă���ꏊ�B";
		next;
		mes "[���]�x��]";
		mes "�����V���������É����}���鎞�ł��B";
		next;
		mes "[���]�x��]";
		mes "����ƁA����l�Ƃ���";
		mes "���҂���Ă���܂��̂ŁA";
		mes "�j���ɎQ������O�ɁA";
		mes "�e�Ɩ��K�₵��";
		mes "���A�����Ă��������K�v���������܂��B";
		next;
		mes "[���]�x��]";
		mes "���̗��{�́A�e�Ɩ傪";
		mes "��s�v�����e���ɏh�������ۂ�";
		mes "�����p�ɂȂ�ꏊ�B";
		mes "���݁A���̕�����������";
		mes "�S�đ��̉Ɩ�̕����؍݂���Ă��܂��B";
		next;
		mes "[���]�x��]";
		mes "����قǁA�e�Ɩ��";
		mes strcharinfo(0)+ "�l��";
		mes "�������ꂽ���Ƃ�`���܂����̂ŁA";
		mes "�܂���^4d4dff��������߂�";
		mes "^4d4dff�n�C�l���Ƃ���K��^000000����Ă�";
		mes "�������ł��傤���H";
		next;
		mes "[���]�x��]";
		mes "���{���̈ē��������Ă��������܂��ƁA";
		mes "���̕���������̂�^0000FF���̗��{^000000�B";
		mes "�n�C�l���ƁA�l���E�X�ƁA";
		mes "�o���^�[�Ƃ̎҂̕������������܂��B";
		next;
		mes "[���]�x��]";
		mes "�L�����o�āA�������ɂȂ�̂�";
		mes "^0000FF���̗��{^000000�ł��B";
		mes "�E�B�O�i�[�ƁA���n���g�ƁA";
		mes "�Q�I���O�ƁA���x���u���O�Ƃ�";
		mes "���������������܂��B";
		next;
		mes "[���]�x��]";
		mes "�e�Ɩ�̕������ւ�";
		mes "���A�������Ă��Y��Ȃ��B";
		delquest 7681;
		setquest 7682;
		setquest 7683;
		setquest 73051;
		setquest 73052;
		setquest 73053;
		setquest 73054;
		setquest 73055;
		setquest 73056;
		set EP16_1QUE,2;
		close;
	case 2:
		if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
			mes "[���]�x��]";
			mes "��������Ȃ����܂��B";
			mes "���ʌp���Ҍ��肪";
			mes "�\����x��Ă���܂��āA";
			mes "���΂炭���Ԃ������邻���ł��B";
			next;
			mes "[���]�x��]";
			mes "�����Ԃ܂ŏ����]�T��";
			mes "�o���܂����̂�";
			mes "�j�����y����ŗ��Ă�";
			mes "�������ł��傤���H";
			next;
			mes "[���]�x��]";
			mes "�V���̊J�n���Ԃɂ́A";
			mes "�ē����̋{��}�W�V������";
			mes "�K�₷��Ƃ����A�������Ă��܂�����A";
			mes "����܂ŏj�������y���݂��������B";
			next;
			mes "[���]�x��]";
			mes "���傤��^4d4dff�l���E�X�Ƃ̂��ߏ삪";
			mes "^4d4dff�j����ŉ���Ƃ�]��ł���^000000";
			mes "�Ƃ����`��������܂��B";
			mes strcharinfo(0)+"�l��";
			mes "���Ȃ�C�ɓ���ꂽ�悤�ł��ˁB";
			delquest 7685;
			delquest 7686;
			delquest 73065;
			setquest 7687;
			set EP16_1QUE,3;
			close;
		} else {
			mes "[���]�x��]";
			mes "����قǁA�e�Ɩ��";
			mes strcharinfo(0)+ "�l��";
			mes "�������ꂽ��";
			mes "�A�������Ă��܂��B";
			next;
			mes "[���]�x��]";
			mes "�F�l�A���҂��ɂȂ��Ă܂��̂�";
			mes "�����߂ɂ����A�Ɍ������Ă��������B";
			next;
			mes "[���]�x��]";
			mes "�܂��K�₵�Ă��Ȃ��Ɩ�́c�c";
			next;
			mes "[���]�x��]";
			mes ( (!(checkquest(7683)&0x8)) ? "�n�C�l����": "");
			mes ( (checkquest(73051)) ? "�l���E�X��": "");
			mes ( (checkquest(73053)) ? "���n���g��": "");
			mes ( (checkquest(73052)) ? "�o���^�[��": "");
			mes ( (checkquest(73054)) ? "�E�B�O�i�[��": "");
			mes ( (checkquest(73055)) ? "���x���u���O��": "");
			mes ( (checkquest(73056)) ? "�Q�I���O��": "")+"�ł��B";
			close;
		}
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[���]�x��]";
		mes "�V���̊J�n���Ԃɂ́A";
		mes "�ē����̋{��}�W�V������";
		mes "�K�₷��Ƃ����A�������Ă��܂�����A";
		mes "����܂ŏj�������y���݂��������B";
		next;
		mes "[���]�x��]";
		mes "�j����ł�";
		mes "^4d4dff�l���E�X��^000000�̕��X��";
		mes "���҂����Ă���Ƃ̂��Ƃł��B";
		close;
	case 7:
		mes "[���]�x��]";
		mes "�j���͂������ł������H";
		mes "�A�b�V���o�L���[������";
		mes "�A�҂��ꂽ�p�Y������";
		mes "���}���鉃�ł��̂ŁA";
		mes "�j�����̂͒����ɓn����";
		mes "�J�Â���邻���ł���B";
		next;
		mes "[���]�x��]";
		mes "���������΁A��ق�";
		mes "�{��}�W�V�����̖K�₪����܂����B";
		mes "���̉Ɩ���܂������A";
		mes "�ēx�A���̕����ɖK�₷���";
		mes "�\���Ă��܂����̂�";
		mes "�������邩�Ǝv���܂��B";
		if(!sleep2(500)) end;
		next;
		cloakoffnpc "�}�W�V�����E�j������#ep16_wiz01";
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �ӂ����`�V�˃}�W�V�����I�@�j�������̂���������`�I",1;
		mes "[���]�x��]";
		mes "����B";
		mes "���傤�ǁA�����悤�ł��ˁB";
		mes "�ڂ������e�͂�����̎҂�";
		mes "�����₭�������B";
		delquest 7691;
		setquest 7692;
		set EP16_1QUE,8;
		next;
		mes "[�j������]";
		mes "�₠�I";
		mes "���Ȃ����\��";
		mes strcharinfo(0)+"�l�ł��ˁB";
		mes "����ł��Ă��ꂵ���ł���I";
		next;
		mes "[�j������]";
		mes "���b���������̂�";
		mes "��܂�܂Ȃ�ł����`�A";
		mes "�����V�����͂��܂����Ⴄ�����ł��̂�";
		mes "���������ړ����܂��傤�I";
		next;
		mes "[�j������]";
		mes "�����Ȃ��ł���������B";
		mes "�J�E���g�_�E���X�^�`�g�I";
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �R�I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �Q�I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �P�I",1;
		if(!sleep2(500)) end;
		close2;
		cloakonnpc "�}�W�V�����E�j������#ep16_wiz01";
		warp "prt_lib.gat",89,44;
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[���]�x��]";
		mes "��������Ȃ����B";
		mes strcharinfo(0)+"�l�B";
		mes "�V���͂����I������̂ł��傤���B";
		next;
		cloakoffnpc "�}�W�V�����E�j������#ep16_wiz01";
		mes "[�j������]";
		mes "�Ȃɂ������Ă��ł����I";
		mes "�܂��V���͏I����ĂȂ��ł���I";
		next;
		mes "[���]�x��]";
		mes "���킠!?";
		next;
		mes "[�j������]";
		mes "�}���Ŗ߂�܂���B";
		mes "�S�̏����͂�낵���ł��ˁH";
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �R�I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �Q�I",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�}�W�V�����E�j������#ep16_wiz01"),"�}�W�V�����E�j������ : �P�I",1;
		if(!sleep2(500)) end;
		close2;
		cloakonnpc "�}�W�V�����E�j������#ep16_wiz01";
		warp "prt_lib.gat",89,44;
		end;
	case 14:
		mes "[���]�x��]";
		mes "��������Ȃ����܂��B";
		mes strcharinfo(0)+"�l��";
		mes "���s�݂̊Ԃɓ`����";
		mes "�a�����Ă���܂��B";
		next;
		mes "[���]�x��]";
		mes "�w�d�v�ȉ�c���s���A";
		mes "�@����܂őҋ@���Ă���悤�ɁB";
		mes "�@�S�Ă����肵����";
		mes "�@���}�ɒm�点��B";
		mes "�@����܂ŏj�����y���݂Ȃ����x";
		mes "�c�c�Ƃ̂��Ƃł��B";
		next;
		mes "[���]�x��]";
		mes "����Ƃ́A�ʌ��ł��傤���H";
		mes "^4d4dff�n�C�l����^000000�̕�����";
		mes "��҂Ǝi�Ղ̕�������";
		mes "���킽�������o���肵�Ă���̂�";
		mes "���Ă��܂��܂����B";
		next;
		mes "[���]�x��]";
		mes "�Ȃɂ��������̂ł��傤���H";
		next;
		if(select("�c�c","�����ł�")==2) {
			mes "[���]�x��]";
			mes "�����c�c�ł����B";
			next;
		}
		mes "[���]�x��]";
		mes "�n�b�I�@���炵�܂����B";
		mes "�����o���܂�������ł����ˁB";
		mes "�\���󂠂�܂���B";
		next;
		mes "[���]�x��]";
		mes "�����Ɓc�c�������I";
		mes "������`����a�����Ă܂����I";
		next;
		mes "[���]�x��]";
		mes "^4d4dff�l���E�X��^000000�̂��ߏ삩��";
		mes "�e�B�[�^�C���̏��҂����Ă��܂��B";
		next;
		mes "[���]�x��]";
		mes strcharinfo(0)+"�l��";
		mes "���߂�ɂȂ�����A";
		mes "�A�������Ă����";
		mes "�����Ă���܂��B";
		mes "�����ɂ��Ԏ����܂��傤���H";
		next;
		if(select("�����ɖK�₷��","��ŖK�₷��")==2) {
			mes "[���]�x��]";
			mes "����ł͖K�₳��鎞��";
			mes "���m�点���������B";
			close;
		}
		mes "[���]�x��]";
		mes "����ł͍������������";
		mes "���`�����Ă����܂��傤�B";
		mes "�s���Ă�������Ⴂ�܂��B";
		delquest 7696;
		setquest 7697;
		set EP16_1QUE,15;
		close;
	case 15:
		mes "[���]�x��]";
		mes "�l���E�X�Ƃ̂������́A";
		mes "���̕��������ׂ�ɂȂ�܂��B";
		mes "�n�C�l���Ƃ̂��ׂ�ł��B";
		next;
		mes "[���]�x��]";
		mes strcharinfo(0)+"�l��";
		mes "�K���`���Ă���܂��̂�";
		mes "���ł����K�˂��������B";
		close;
	case 16:
		mes "[���]�x��]";
		mes "�n�C�l���Ƃ���";
		mes "�ʉ�̗v��������܂����B";
		mes "���߂�ɂȂ�����A";
		mes "�n�C�l���Ƃ�K�˂Ă��������B";
		mes "�Ƃ����A���ł����B";
		close;
	case 17:
		mes "[���]�x��]";
		mes "��������Ȃ����܂��B";
		mes "���߂�ɂȂ�܂����̂�";
		mes "�j�������l�����Ăт��܂��B";
		next;
		mes "[���]�x��]";
		mes "���ꂪ�ł��ˁc�c";
		mes "�{��}�W�V�����̃j�������l��";
		mes "��قǁA���̕�����";
		mes "��э���ł��܂��āB";
		next;
		mes "[���]�x��]";
		mes "�����Ɂu�ǂ��ɍs����!?�v��";
		mes "����������ꂽ�̂ŁA";
		mes strcharinfo(0)+"�l��";
		mes "�T���Ă����̂��Ǝv���܂��B";
		next;
		cloakoffnpc "�}�W�V�����E�j������#ep16_wiz01";
		mes "[�j������]";
		mes "�V�ˁI�@�{��}�W�V����";
		mes "�j�������Q��I";
		next;
		mes "[���]�x��]";
		mes "�c�c����A���傤�Ǘǂ�";
		mes "�^�C�~���O�ł����ˁB";
		close;
	default:
		mes "[���]�x��]";
		mes strcharinfo(0)+"�l�A";
		mes "���̃x���߂�";
		mes "��p�ł��傤���H";
		next;
		if(select("�j���������Ă�","���ł��Ȃ��ł�")==2) {
			mes "[���]�x��]";
			mes "�킩��܂����B";
			close;
		}
		mes "[���]�x��]";
		mes "�{��}�W�V�����A�j�������l��";
		mes "���Ăт���̂ł��ˁH";
		mes "���X���҂����������B";
		next;
		mes "[���]�x��]";
		mes "���A���Ăт��܂����̂�";
		mes "��������������Ǝv���܂��B";
		next;
		cloakoffnpc "�}�W�V�����E�j������#ep16_wiz01";
		mes "[�j������]";
		mes "�V�ˁI�@�{��}�W�V����";
		mes "�j�������Q��I";
		mes "���Ăяo�����肪�Ƃ��������܂��B";
		mes "����Ȃɂ����ɉ����������ł��ˁI";
		close;
	}
	end;
}

prt_cas_q.gat,28,28,3	script(CLOAKED)	�}�W�V�����E�j������#ep16_wiz01	735,{
	if(EP16_1QUE == 17) {
		mes "[�j������]";
		mes "�͂����I";
		mes "�_�[�������҂����`";
		next;
		menu "�c�c",-;
		mes "[�j������]";
		mes "������͂�����������H";
		next;
		mes "[�j������]";
		mes "�����āA���[���~�b�h�K�b�c������";
		mes "�������A���Ƃ́I";
		mes "�閧�𒲍�������Ă�����";
		mes "�������Ȃ��}�W�V������";
		mes "���̐��̂ǂ��ɂ����ł����H";
		mes "�����ł���ˁH";
		next;
		mes "[�j������]";
		mes "�`���ɂ��łȂ��I";
		mes "���ގd���ƎЌ�푈���炯�I";
		mes "�M�������Ȃ��ދ��ȋ{��I";
		next;
		mes "[�j������]";
		mes "���������ǁA����";
		mes "�{��}�W�V�����ɂȂ���";
		mes "�{���ɗǂ������Ǝv���Ă܂����I";
		mes "�����ō��I";
		next;
		mes "[�j������]";
		mes "��[�A�{��}�W�V�����̐E��";
		mes "���肵�Ă��āA�������Ⴍ�Ȃ���";
		mes "�ِ��E�ւ̗��w���";
		mes "�x�����Ă��炦���ł���B";
		mes "���̎��ԂɂȂ�܂�";
		mes "�ދ��ȐE�ꂾ�������ǁI";
		next;
		mes "[�j������]";
		mes "�ƁA�E�Ƃ̘b�͂����܂łɂ��ā`";
		next;
		mes "[�j������]";
		mes "�����͂��ׂďI���܂�����B";
		mes "��̘c�݂͉��Ƃ̋L���̊Ԃ���";
		mes "���ꂽ�̂�";
		mes "�Q�[�g���������ɐݒu���܂����B";
		next;
		mes "[�j������]";
		mes "����ƁA�����";
		mes "^4d4dff���Ƃ̋L���̊Ԃɒ��ڌ������邩^000000�A";
		mes "����^4d4dff�j�������Ăяo����^000000��";
		mes "�g���Ă��������B";
		mes "����̓T�[�r�X�ł�����ˁI";
		next;
		menu "�j�������Ăяo�����H",-;
		mes "[�j������]";
		mes "�͂��A���̃j�������ɉ��������";
		mes "���ł������̎��]��ʂ���";
		mes "�Ăяo���Ă��������Ƃ����b�ł��B";
		mes "�����ɗ��Ă����܂�����I";
		set EP16_1QUE,18;
		next;
		mes "[�j������]";
		mes "�����A����ł͍s���܂����H";
		next;
		if(select("�ړ�����","�������K�v��")==2) {
			mes "[�j������]";
			mes "�ł�����A�������I��莟��";
			mes "���Ăт������`���B";
			mes "������������Ȃ�������A";
			mes "����^4d4dff���Ƃ̋L���̊�^000000�ɗ��Ă��������ˁB";
			next;
			mes "[�j������]";
			mes "���͒m���Ă܂�����ˁB";
			mes "�͂͂́B";
			close;
		}
		mes "[�j������]";
		mes "���ꂶ��ڂ��҂��ā`";
		mes "�͂��I";
		close2;
		warp "prt_lib.gat",89,44;
		end;
	} else if(EP16_1QUE > 17) {
		mes "[�j������]";
		mes "���ꂶ��";
		mes "���Ƃ̋L���̊Ԃ�";
		mes "�o�����܂����H";
		next;
		if(select("���Ƃ̋L���̊Ԃɏo��","�K�v�Ȃ��I")==2) {
			mes "[�j������]";
			mes "���͒m���Ă܂�����ˁB";
			mes "�͂͂́B";
			close;
		}
		mes "[�j������]";
		mes "���ꂶ��ڂ��҂��ā`";
		mes "�͂��I";
		close2;
		warp "prt_lib.gat",89,44;
		end;
	}
	end;
}

prt_cas.gat,197,164,0	script	#ep16_evt_7688	139,3,3,{
OnTouch:
	if(EP16_1QUE == 3) {
		mes "["+strcharinfo(0)+"]";
		mes "�i�N���̘b��������������j";
		next;
		cloakoffnpc "���������q#ep16_01";
		cloakoffnpc "���]#ep16_01";
		mes "[���������q]";
		mes "��قǂ̘b�͊m�����ȁH";
		next;
		mes "[���]]";
		mes "�������ł��B";
		mes "���T���̏�����";
		mes "�҂����蓖�Ă͂܂�͂��ł���B";
		next;
		mes "[���������q]";
		mes "�ӂށc�c";
		next;
		mes "[���]]";
		mes "�ނ��܂����ʌp�����������Ă��邨���B";
		mes "���߂Ă������";
		mes "�\�������܂��B";
		next;
		mes "[���������q]";
		mes "�����́H";
		mes "�i��ł���̂��H";
		mes "�c�c���̒j�ɉ����܂�Ȃ��悤";
		mes "�Ăяo���Ȃ���΂����񂼁B";
		next;
		mes "[���]]";
		mes "�������ł��B";
		mes "�c�c�������A�ڍׂ͂܂���قǁB";
		next;
		mes "[���]]";
		mes "���낻��j���ɎQ�����Ȃ����";
		mes "�����܂��񂩂�B";
		next;
		mes "[���������q]";
		mes "�������ȁB";
		mes "�ł́A��ŉ���B";
		mes "�@";
		mes "�������]�����Ȃ��ł����B";
		cloakonnpc "���������q#ep16_01";
		next;
		mes "[���]]";
		mes "�c�c";
		mes "�ʓ|�������l���ȁc�c";
		cloakonnpc "���]#ep16_01";
		next;
		mes "�]�s�{�ӂȂ���";
		mes "�@�������Șb�𕷂��Ă��܂����悤���]";
		delquest 7687;
		setquest 7688;
		set EP16_1QUE,4;
		close;
	}
	end;
}

prt_cas.gat,197,155,6	script(CLOAKED)	���������q#ep16_01	865,{}

prt_cas.gat,199,154,2	script(CLOAKED)	���]#ep16_01	47,{}

prt_cas.gat,106,240,3	script	�X�s�[�J�E�l���E�X#ep16_02	10115,{
	if(EP16_1QUE < 3) {
		unittalk "�X�s�[�J : �c�c����B",1;
		end;
	} else if(EP16_1QUE == 3) {
		cutin "ep16_spica_nerius01.bmp",2;
		mes "[�X�s�[�J]";
		mes "���̉Ɩ�̕��Ƃ�";
		mes "���i�͂�����邱�Ƃ�";
		mes "�Ȃ��Ȃ�����̂ł��B";
		close2;
		cutin "ep16_spica_nerius01.bmp",255;
		end;
	} else if(EP16_1QUE == 4) {
		cloakoffnpc "�X�s�[�J�E�l���E�X#ep16_02";
		cloakoffnpc "�N���b�N�X#ep16_02";
		mes "[�X�s�[�J]";
		mes "���҂����Ă���܂����B";
		mes strcharinfo(0)+"�l�B";
		mes "���ƂÂĂ͂��܂�";
		mes "�`������悤�ł��ˁB";
		cutin "ep16_spica_nerius01.bmp",2;
		next;
		mes "[�X�s�[�J]";
		mes "���������N�����̂��߂�";
		mes "�v�������`���ҁB";
		mes "���܂������􂾂����ƕ����Ă��܂��B";
		next;
		menu "��������",-;
		mes "[�X�s�[�J]";
		mes "�ł��������ł͂���܂��񂩁B";
		mes "���̏�͋M���̂悤��";
		mes "�p�Y�ׂ̈̏j���ł��B";
		mes "���M���������ɂȂ��Ă��������B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����ł��I";
		mes "�����āA�������ƈꏏ��";
		mes "���邩��Ƃ�����";
		mes "�N������������܂��񂩂�";
		mes "���ł��K�₵�ĉ������B";
		next;
		mes "[�X�L�A]";
		mes "�����������Ȃ̂��v���Ԃ�Ȃ̂�";
		mes "���������H��L�΂������ł����B";
		next;
		cutin "ep16_spica_nerius07.bmp",2;
		mes "[�X�s�[�J]";
		mes "�c�c�ӂ��ӂ���";
		next;
		mes "[�X�s�[�J]";
		mes "���~�߂͎��ɔC���Ă����B";
		mes "�N���b�N�X�A���������H";
		mes "���̔��g���V�т����ƌ����Ă���B";
		next;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "����A���̂���l�B�H";
		mes "���ɉ����ǂ�����ƁH";
		next;
		mes "[�N���b�N�X]";
		mes "���͂ǂ��܂ł�����l�B��";
		mes "�����Ȃ̂͂����m�ł���ˁH";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ʔ�����k���ȁB";
		mes "����A�M�l�����B��";
		mes "�Ď����Ƃ��ė����̂�";
		mes "�m���Ă��邼�H";
		next;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "�Ⴂ�܂��I";
		mes "�Ⴄ��ł���I";
		mes "�c�c����H�@������ɋ���̂�";
		mes "�n�C�l���l�ł͂���܂��񂩁H";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����A�{�����B";
		mes "�j�[�q���I�@�������ł��I";
		next;
		cloakoffnpc "�j�[�q���E�n�C�l��#ep16_02";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����Ȃɑ傫�Ȑ���";
		mes "�Ă΂Ȃ��Ă�������A�X�L�A�B";
		mes strcharinfo(0)+"�l��";
		mes "�ꏏ�ł������B";
		next;
		mes "[�j�[�q��]";
		mes "�m���Ƀl���E�X�Ɩ�Ȃ�";
		mes "�ꏏ�ɋ��Ă��ςȌ����";
		mes "�󂯂���͂��Ȃ��B";
		mes "�����Ȕ��f���B";
		next;
		cutin "ep16_spica_nerius06.bmp",0;
		mes "[�X�s�[�J]";
		mes "�X�L�A�B";
		mes "�����ăn�C�l���Ƃ̕��B";
		mes "������݂��ɖ��O���Ăэ���";
		mes "���ɂȂ����񂾁H";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "��قǘL���ŉ��������";
		mes "���O�ŌĂэ����悤�ɂ��܂�����B";
		mes "���{�Ńn�C�l���Ƃƃl���E�X�Ƃ�";
		mes "����ł��܂�����B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�����ŋC���]�����o�������A";
		mes "�N�ɂ͊��ӂ��Ă���B";
		mes "�����āc�c";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes strcharinfo(0)+"�l�ɂ�";
		mes "�Ӎ߂����Ȃ���΂Ǝv���A";
		mes "�����ɖK�˂Ă݂���";
		mes "���łɏj����Ɍ��������ƁB";
		next;
		menu "�Ӎ߁H",-;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "��قǂ́c�c";
		mes "�����}���鎖���ł����A";
		mes "����𓭂��Ă��܂��܂����B";
		mes "�ǂ������������B";
		next;
		cloakoffnpc "�r�I�����^�[�E�n�C�l��#ep16_02";
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		mes "[���ɐ���������]";
		mes "���́c�c�͂͂́c�c�I";
		mes "�j�[�q���l�A������������";
		mes "�Ȃ�Ƃ܂����ʌp���҂ɂ�";
		mes "������Ă����̂Ɂc�c";
		next;
		mes "[���ɐ���������]";
		mes "����A����͂���́B";
		mes "�����ȏ��n�Ɩ�ł���";
		mes "�l���E�X�̌�ߏ삶��ȁ`���H";
		next;
		mes "[���ɐ���������]";
		mes "�j�[�q���l�B";
		mes "���ɉƖ�����̂Ă�";
		mes "�l���E�X�Ƃɍs���Ă��܂�";
		mes "����Ȃ̂ł����H";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "�r�I�����^�[�A";
		mes "�Ȃ�Ȃ񂾁A���̖���́I";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",255;
		mes "[�r�I�����^�[]";
		mes "�Ԉ�������͌����Ă��܂����B";
		mes "�����ł��傤�H";
		mes "�Ɩ�̒��ł̑ҋ��͍ň��B";
		mes "�����ŗߏ�����Ă߂ɂ����";
		mes "��Q�̐l�������I�@�ȁ`��ĂˁH";
		mes "����͂͂͂́`�I";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "���������ɂ���I";
		mes "�א��ɂ��قǂ����邼�B";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",255;
		mes "[�r�I�����^�[]";
		mes "���炠��`�j�[�q���l��";
		mes "�{�����肷��̂ˁH";
		mes "�����ł��B���������";
		mes "����������ƕ\�����āc�c";
		next;
		cutin "ep16_crux_findel01.bmp",2;
		mes "[�N���b�N�X]";
		mes "�ǂ̉Ɩ�̗ߏ�Ȃ̂���";
		mes "�����Ă���܂��񂪁A";
		mes "���̕ӂɂ��Ă��������܂��񂩁H";
		mes "����l�ɂ���ȏ�A";
		mes "���J�I�Ȕ���������Ȃ�";
		mes "������ɂ��l��������܂��B";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ق��Ă���A�N���b�N�X�B";
		mes "�����̍s���̈Ӗ�����������";
		mes "��͂��Ȏ҂Ǝ���";
		mes "����ɂ�����肩�H";
		mes "���̂悤�Ȏ��Ńn�C�l���Ƃ�";
		mes "���݂𔃂�����͂Ȃ��B";
		next;
		cutin "ep16_spica_nerius07.bmp",2;
		mes "[�X�s�[�J]";
		mes "�������Ǝv���܂��񂩁H";
		mes "�r�I�����^�[�E�R���g�E�n�C�l���l�H";
		next;
		mes "[�X�s�[�J]";
		mes "�ނɑ΂���M���̋C������";
		mes "�\�������������܂����B";
		mes "�������A�����ő������Ƃ����";
		mes "�D��h����̂̓n�C�l���Ƃł���H";
		next;
		mes "[�X�s�[�J]";
		mes "�ނ̃X�L�����_�������]�݂Ȃ�";
		mes "�ǂ�������ɂȂ����Ă��������B";
		mes "�������A�l���E�X�Ƃ�";
		mes "�������܂Ȃ��ł��������ˁH";
		cutin "ep16_spica_nerius02.bmp",2;
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "����͌������Ă�邩��";
		mes "�����ɖ߂�B";
		mes "�����Ȃ��ƖT�n�̐l�ԂƂ͂���";
		mes "�Ɩ�̖��ł��O�𔱂��邵���Ȃ��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		mes "[�r�I�����^�[]";
		mes "������܂����B�߂�܂���B";
		mes "�l���E�X�Ƃɂł������ł�";
		mes "�D���ɍs���ĉ������I";
		next;
		cloakonnpc "�r�I�����^�[�E�n�C�l��#ep16_02";
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "����c�c";
		mes "�ǂ����Ă���Șb�Ɂc�c�H";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�ʖڂ���܂���B";
		mes "���̎҂̖���ɂ��Ă�";
		mes "���������ĎӍߒv���܂��B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "��قǂ���Ӎ߂΂���ł��ˁB";
		mes "�j�[�q���͈����Ȃ��̂Ɂc�c";
		next;
		cutin "ep16_spica_nerius01.bmp",1;
		mes "[�X�s�[�J]";
		mes "�m���Ƀj�[�q���l�͈����Ȃ��B";
		mes "�����ȁc�c";
		mes "�]�����Ɩ]�܂��낤��";
		mes "�Ɩ�̖���w�����̂Ȃ�΁A";
		mes "�S�Ă̐ӔC�𕉂����ɂȂ�B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "���̒ʂ肾�B";
		mes "���̓n�C�l���Ƃ̖���";
		mes "�w�����Đ����Ă���B";
		mes "�n�C�l���̑S�Ăɑ΂���";
		mes "�ӔC�����Ȃ���΂Ȃ�Ȃ����ꂾ�B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�X�L�A�A�N���e�ɂȂ闝�R�Ɠ������B";
		cloakoffnpc "���{���]#ep16_02";
		unittalk getnpcid(0,"���{���]#ep16_02"),"���{���] : �x���̒Ⴂ�������ł��B�������ł����H",1;
		next;
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_02"),"�j�[�q�� : �����܂��傤�B",1;
		unittalk getnpcid(0,"�X�L�A�E�l���E�X#ep16_02"),"�X�L�A : ������t�������B",1;
		cutin "ep16_spica_nerius01.bmp",1;
		mes "[�X�s�[�J]";
		mes "�����͂ǂ�����Ɩ�̕������";
		mes "���̂悤�Ȏd�ł����󂯂Ă���Ƃ�";
		mes "�m��Ȃ����c�c";
		next;
		cloakonnpc "���{���]#ep16_02";
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�j���̗ǂ����͋C��";
		mes "�����S���󂵂Ă��܂����悤���B";
		mes "���͂���Ŏ��炵�܂��B";
		mes "�����@������";
		mes "�܂��b�����܂��傤�B";
		next;
		cutin "ep16_spica_nerius05.bmp",1;
		mes "[�X�s�[�J]";
		mes "�����B�����炱���A";
		mes "���͐����ɏ��҂�v���܂��B";
		mes "���̎��A�f��Ȃ��ł��������B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�l���E�X�Ǝ�������̏��҂�";
		mes "�f��킯������܂����B";
		mes "����ł͂܂��B";
		next;
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_02";
		cutin "ep16_spica_nerius01.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ӂށc�c";
		mes "���ށc�c";
		mes "�X�L�A�A���̕�������";
		mes "������ƌ����Ă���B";
		next;
		cutin "ep16_spica_nerius02.bmp",2;
		mes "[�X�s�[�J]";
		mes "�����āA�N���b�N�X�B";
		mes "������n�������]�ɂ���";
		mes "�B���ɒ��ׂĂ���B";
		mes "�C�����Ȃ�B";
		unittalk getnpcid(0,"�N���b�N�X#ep16_02"),"�N���b�N�X : �������܂�܂����A����l�B",1;
		next;
		mes "[�X�s�[�J]";
		mes "���̎҂̖ڂ��x���Ă��A";
		mes "���̖ڂ��x���Ȃ����B";
		mes strcharinfo(0)+"�l��";
		mes "�悭���Ă���B";
		mes "�����������낤�H";
		next;
		menu "�܂��A�������ς��܂�����",-;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "��A���̌������H";
		mes "���͌��X���ߒ��Řb������";
		mes "����Ă���g���B";
		mes "�M�o�Ȃ̂Œ��J�Ȍ��t������";
		mes "�S�����Ă͂����̂����A";
		mes "�s����䂦�ɐh���ĂȁB";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "���A��ρI";
		mes "�j�[�q���̗l�q���c�c�I";
		mes "�܂�œD�����Ă���݂����ɁI";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ނ����񂾕������A";
		mes "�W���[�X�ɊԈႤ�قǂ�";
		mes "�x�����Ⴂ���̂�������";
		mes "���ꂾ���Ő������Ƃ͎v���Ȃ��B";
		mes "��������C������ȁc�c";
		next;
		cutin "ep16_spica_nerius05.bmp",2;
		mes "[�X�s�[�J]";
		mes strcharinfo(0)+"�B";
		mes "�ʔ������Ȏ����N����Ǝv��Ȃ����H";
		mes "�����c�c�������B�������B";
		mes "���������玄�����͂��������";
		mes "�߂鎖�ɂ��悤�B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "�����H�@���̂܂܍s�����Ⴄ�́H";
		mes "�j�[�q���͂ǂ����ɂ��񂶂�H";
		mes "�r���œ|�ꂽ��ǂ�����́H";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�����܂ŋC�ɂȂ�Ȃ�";
		mes "������ɍs���Ă��΂����B";
		mes "���̂��Ƃ̓N���b�N�X��";
		mes "����Ă���邩����v�B";
		unittalk getnpcid(0,"�X�s�[�J�E�l���E�X#ep16_02"),"�X�s�[�J : �N���b�N�X�A�����ɖ߂낤�B",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�N���b�N�X#ep16_02"),"�N���b�N�X : �͂��A����l�B",1;
		next;
		cloakonnpc "�X�s�[�J�E�l���E�X#ep16_02";
		cloakonnpc "�N���b�N�X#ep16_02";
		mes "[�X�L�A]";
		mes "���́c�c�`���җl�H";
		mes "�`���җl����ɍs���Ă�";
		mes "�_���ł����H";
		mes "���������ŋ삯����Ă�";
		mes "�݂�ȕςȖڂŌ���Ǝv���܂��B";
		cutin "ep16_skia_nerius01.bmp",0;
		next;
		mes "[�X�L�A]";
		mes "���̓o���Ȃ��悤��";
		mes "���čs���Ă݂܂��B";
		mes "�X�s�[�J�͉����ɋC�Â���";
		mes "����Ȏ����������񂾂Ǝv���܂��B";
		mes "�����Ɖ�������܂��B";
		next;
		if(select("�d���Ȃ��ł��ˁc�c","�j�[�q���ɋ߂Â��`�����X�ł���") == 2) {
			mes "[�X�L�A]";
			mes "�ɁA�j�[�q���Ɂc�c�I";
			mes "�`���җl���A������Ȃ��ł��������I";
			mes "��A���͐S�z�Ȃ����ł��I";
			cutin "ep16_skia_nerius02.bmp",0;
			next;
		}
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���͏j�����";
		mes "�O�ɏo���͂��ł��B";
		mes "�����Ɨ��{�Ɍ��������͂��Ȃ̂�";
		mes "�������ɍs���Ă݂܂��傤�I";
		delquest 7688;
		setquest 7689;
		set EP16_1QUE,5;
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else if(EP16_1QUE == 5) {
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���͏j�����";
		mes "�O�ɏo���͂��ł��B";
		mes "�����Ɨ��{�Ɍ��������͂��Ȃ̂�";
		mes "�������ɍs���Ă݂܂��傤�I";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else {
		cutin "ep16_spica_nerius02.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ʔ������Ȏ����N����Ǝv��Ȃ����H";
		mes "�����c�c�������B�������B";
		close2;
		cutin "ep16_spica_nerius02.bmp",255;
		end;
	}
}

prt_cas.gat,104,240,5	script	�X�L�A�E�l���E�X#ep16_02	10116,{
	if(EP16_1QUE < 3) {
		unittalk "�X�L�A : �c�c",1;
		end;
	} else if(EP16_1QUE == 3) {
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes strcharinfo(0)+"�l";
		mes "�j���͂ǂ��ł����H";
		mes "���͂��̂悤�ȏj���͏��߂ĂȂ̂�";
		mes "�����ْ����Ă��܂��āc�c";
		next;
		mes "[�X�L�A]";
		mes "���A�����ďj�������߂�";
		mes "�Ƃ����Ӗ��ł͂Ȃ��c�c";
		mes "���Ɛ�������΂������ȁB";
		next;
		cutin "ep16_spica_nerius01.bmp",2;
		mes "[�X�s�[�J]";
		mes "��������K�v�͂Ȃ��B";
		mes "�������Ɩ���̎����B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����ł��ˁB";
		mes "�]�v�Ȏ��������܂����B";
		mes "��ώ���v���܂����B";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else if(EP16_1QUE == 4) {
		cloakoffnpc "�X�s�[�J�E�l���E�X#ep16_02";
		cloakoffnpc "�N���b�N�X#ep16_02";
		mes "[�X�s�[�J]";
		mes "���҂����Ă���܂����B";
		mes strcharinfo(0)+"�l�B";
		mes "���ƂÂĂ͂��܂�";
		mes "�`������悤�ł��ˁB";
		cutin "ep16_spica_nerius01.bmp",2;
		next;
		mes "[�X�s�[�J]";
		mes "���������N�����̂��߂�";
		mes "�v�������`���ҁB";
		mes "���܂������􂾂����ƕ����Ă��܂��B";
		next;
		menu "��������",-;
		mes "[�X�s�[�J]";
		mes "�ł��������ł͂���܂��񂩁B";
		mes "���̏�͋M���̂悤��";
		mes "�p�Y�ׂ̈̏j���ł��B";
		mes "���M���������ɂȂ��Ă��������B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����ł��I";
		mes "�����āA�������ƈꏏ��";
		mes "���邩��Ƃ�����";
		mes "�N������������܂��񂩂�";
		mes "���ł��K�₵�ĉ������B";
		next;
		mes "[�X�L�A]";
		mes "�����������Ȃ̂��v���Ԃ�Ȃ̂�";
		mes "���������H��L�΂������ł����B";
		next;
		cutin "ep16_spica_nerius07.bmp",2;
		mes "[�X�s�[�J]";
		mes "�c�c�ӂ��ӂ���";
		next;
		mes "[�X�s�[�J]";
		mes "���~�߂͎��ɔC���Ă����B";
		mes "�N���b�N�X�A���������H";
		mes "���̔��g���V�т����ƌ����Ă���B";
		next;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "����A���̂���l�B�H";
		mes "���ɉ����ǂ�����ƁH";
		next;
		mes "[�N���b�N�X]";
		mes "���͂ǂ��܂ł�����l�B��";
		mes "�����Ȃ̂͂����m�ł���ˁH";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ʔ�����k���ȁB";
		mes "����A�M�l�����B��";
		mes "�Ď����Ƃ��ė����̂�";
		mes "�m���Ă��邼�H";
		next;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "�Ⴂ�܂��I";
		mes "�Ⴄ��ł���I";
		mes "�c�c����H�@������ɋ���̂�";
		mes "�n�C�l���l�ł͂���܂��񂩁H";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����A�{�����B";
		mes "�j�[�q���I�@�������ł��I";
		next;
		cloakoffnpc "�j�[�q���E�n�C�l��#ep16_02";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����Ȃɑ傫�Ȑ���";
		mes "�Ă΂Ȃ��Ă�������A�X�L�A�B";
		mes strcharinfo(0)+"�l��";
		mes "�ꏏ�ł������B";
		next;
		mes "[�j�[�q��]";
		mes "�m���Ƀl���E�X�Ɩ�Ȃ�";
		mes "�ꏏ�ɋ��Ă��ςȌ����";
		mes "�󂯂���͂��Ȃ��B";
		mes "�����Ȕ��f���B";
		next;
		cutin "ep16_spica_nerius06.bmp",0;
		mes "[�X�s�[�J]";
		mes "�X�L�A�B";
		mes "�����ăn�C�l���Ƃ̕��B";
		mes "������݂��ɖ��O���Ăэ���";
		mes "���ɂȂ����񂾁H";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "��قǘL���ŉ��������";
		mes "���O�ŌĂэ����悤�ɂ��܂�����B";
		mes "���{�Ńn�C�l���Ƃƃl���E�X�Ƃ�";
		mes "����ł��܂�����B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�����ŋC���]�����o�������A";
		mes "�N�ɂ͊��ӂ��Ă���B";
		mes "�����āc�c";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes strcharinfo(0)+"�l�ɂ�";
		mes "�Ӎ߂����Ȃ���΂Ǝv���A";
		mes "�����ɖK�˂Ă݂���";
		mes "���łɏj����Ɍ��������ƁB";
		next;
		menu "�Ӎ߁H",-;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "��قǂ́c�c";
		mes "�����}���鎖���ł����A";
		mes "����𓭂��Ă��܂��܂����B";
		mes "�ǂ������������B";
		next;
		cloakoffnpc "�r�I�����^�[�E�n�C�l��#ep16_02";
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		mes "[���ɐ���������]";
		mes "���́c�c�͂͂́c�c�I";
		mes "�j�[�q���l�A������������";
		mes "�Ȃ�Ƃ܂����ʌp���҂ɂ�";
		mes "������Ă����̂Ɂc�c";
		next;
		mes "[���ɐ���������]";
		mes "����A����͂���́B";
		mes "�����ȏ��n�Ɩ�ł���";
		mes "�l���E�X�̌�ߏ삶��ȁ`���H";
		next;
		mes "[���ɐ���������]";
		mes "�j�[�q���l�B";
		mes "���ɉƖ�����̂Ă�";
		mes "�l���E�X�Ƃɍs���Ă��܂�";
		mes "����Ȃ̂ł����H";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "�r�I�����^�[�A";
		mes "�Ȃ�Ȃ񂾁A���̖���́I";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",255;
		mes "[�r�I�����^�[]";
		mes "�Ԉ�������͌����Ă��܂����B";
		mes "�����ł��傤�H";
		mes "�Ɩ�̒��ł̑ҋ��͍ň��B";
		mes "�����ŗߏ�����Ă߂ɂ����";
		mes "��Q�̐l�������I�@�ȁ`��ĂˁH";
		mes "����͂͂͂́`�I";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "���������ɂ���I";
		mes "�א��ɂ��قǂ����邼�B";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",255;
		mes "[�r�I�����^�[]";
		mes "���炠��`�j�[�q���l��";
		mes "�{�����肷��̂ˁH";
		mes "�����ł��B���������";
		mes "����������ƕ\�����āc�c";
		next;
		cutin "ep16_crux_findel01.bmp",2;
		mes "[�N���b�N�X]";
		mes "�ǂ̉Ɩ�̗ߏ�Ȃ̂���";
		mes "�����Ă���܂��񂪁A";
		mes "���̕ӂɂ��Ă��������܂��񂩁H";
		mes "����l�ɂ���ȏ�A";
		mes "���J�I�Ȕ���������Ȃ�";
		mes "������ɂ��l��������܂��B";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ق��Ă���A�N���b�N�X�B";
		mes "�����̍s���̈Ӗ�����������";
		mes "��͂��Ȏ҂Ǝ���";
		mes "����ɂ�����肩�H";
		mes "���̂悤�Ȏ��Ńn�C�l���Ƃ�";
		mes "���݂𔃂�����͂Ȃ��B";
		next;
		cutin "ep16_spica_nerius07.bmp",2;
		mes "[�X�s�[�J]";
		mes "�������Ǝv���܂��񂩁H";
		mes "�r�I�����^�[�E�R���g�E�n�C�l���l�H";
		next;
		mes "[�X�s�[�J]";
		mes "�ނɑ΂���M���̋C������";
		mes "�\�������������܂����B";
		mes "�������A�����ő������Ƃ����";
		mes "�D��h����̂̓n�C�l���Ƃł���H";
		next;
		mes "[�X�s�[�J]";
		mes "�ނ̃X�L�����_�������]�݂Ȃ�";
		mes "�ǂ�������ɂȂ����Ă��������B";
		mes "�������A�l���E�X�Ƃ�";
		mes "�������܂Ȃ��ł��������ˁH";
		cutin "ep16_spica_nerius02.bmp",2;
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "����͌������Ă�邩��";
		mes "�����ɖ߂�B";
		mes "�����Ȃ��ƖT�n�̐l�ԂƂ͂���";
		mes "�Ɩ�̖��ł��O�𔱂��邵���Ȃ��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		mes "[�r�I�����^�[]";
		mes "������܂����B�߂�܂���B";
		mes "�l���E�X�Ƃɂł������ł�";
		mes "�D���ɍs���ĉ������I";
		next;
		cloakonnpc "�r�I�����^�[�E�n�C�l��#ep16_02";
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "����c�c";
		mes "�ǂ����Ă���Șb�Ɂc�c�H";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�ʖڂ���܂���B";
		mes "���̎҂̖���ɂ��Ă�";
		mes "���������ĎӍߒv���܂��B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "��قǂ���Ӎ߂΂���ł��ˁB";
		mes "�j�[�q���͈����Ȃ��̂Ɂc�c";
		next;
		cutin "ep16_spica_nerius01.bmp",1;
		mes "[�X�s�[�J]";
		mes "�m���Ƀj�[�q���l�͈����Ȃ��B";
		mes "�����ȁc�c";
		mes "�]�����Ɩ]�܂��낤��";
		mes "�Ɩ�̖���w�����̂Ȃ�΁A";
		mes "�S�Ă̐ӔC�𕉂����ɂȂ�B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "���̒ʂ肾�B";
		mes "���̓n�C�l���Ƃ̖���";
		mes "�w�����Đ����Ă���B";
		mes "�n�C�l���̑S�Ăɑ΂���";
		mes "�ӔC�����Ȃ���΂Ȃ�Ȃ����ꂾ�B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�X�L�A�A�N���e�ɂȂ闝�R�Ɠ������B";
		cloakoffnpc "���{���]#ep16_02";
		unittalk getnpcid(0,"���{���]#ep16_02"),"���{���] : �x���̒Ⴂ�������ł��B�������ł����H",1;
		next;
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_02"),"�j�[�q�� : �����܂��傤�B",1;
		unittalk getnpcid(0,"�X�L�A�E�l���E�X#ep16_02"),"�X�L�A : ������t�������B",1;
		cutin "ep16_spica_nerius01.bmp",1;
		mes "[�X�s�[�J]";
		mes "�����͂ǂ�����Ɩ�̕������";
		mes "���̂悤�Ȏd�ł����󂯂Ă���Ƃ�";
		mes "�m��Ȃ����c�c";
		next;
		cloakonnpc "���{���]#ep16_02";
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�j���̗ǂ����͋C��";
		mes "�����S���󂵂Ă��܂����悤���B";
		mes "���͂���Ŏ��炵�܂��B";
		mes "�����@������";
		mes "�܂��b�����܂��傤�B";
		next;
		cutin "ep16_spica_nerius05.bmp",1;
		mes "[�X�s�[�J]";
		mes "�����B�����炱���A";
		mes "���͐����ɏ��҂�v���܂��B";
		mes "���̎��A�f��Ȃ��ł��������B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�l���E�X�Ǝ�������̏��҂�";
		mes "�f��킯������܂����B";
		mes "����ł͂܂��B";
		next;
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_02";
		cutin "ep16_spica_nerius01.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ӂށc�c";
		mes "���ށc�c";
		mes "�X�L�A�A���̕�������";
		mes "������ƌ����Ă���B";
		next;
		cutin "ep16_spica_nerius02.bmp",2;
		mes "[�X�s�[�J]";
		mes "�����āA�N���b�N�X�B";
		mes "������n�������]�ɂ���";
		mes "�B���ɒ��ׂĂ���B";
		mes "�C�����Ȃ�B";
		unittalk getnpcid(0,"�N���b�N�X#ep16_02"),"�N���b�N�X : �������܂�܂����A����l�B",1;
		next;
		mes "[�X�s�[�J]";
		mes "���̎҂̖ڂ��x���Ă��A";
		mes "���̖ڂ��x���Ȃ����B";
		mes strcharinfo(0)+"�l��";
		mes "�悭���Ă���B";
		mes "�����������낤�H";
		next;
		menu "�܂��A�������ς��܂�����",-;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "��A���̌������H";
		mes "���͌��X���ߒ��Řb������";
		mes "����Ă���g���B";
		mes "�M�o�Ȃ̂Œ��J�Ȍ��t������";
		mes "�S�����Ă͂����̂����A";
		mes "�s����䂦�ɐh���ĂȁB";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "���A��ρI";
		mes "�j�[�q���̗l�q���c�c�I";
		mes "�܂�œD�����Ă���݂����ɁI";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�ނ����񂾕������A";
		mes "�W���[�X�ɊԈႤ�قǂ�";
		mes "�x�����Ⴂ���̂�������";
		mes "���ꂾ���Ő������Ƃ͎v���Ȃ��B";
		mes "��������C������ȁc�c";
		next;
		cutin "ep16_spica_nerius05.bmp",2;
		mes "[�X�s�[�J]";
		mes strcharinfo(0)+"�B";
		mes "�ʔ������Ȏ����N����Ǝv��Ȃ����H";
		mes "�����c�c�������B�������B";
		mes "���������玄�����͂��������";
		mes "�߂鎖�ɂ��悤�B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "�����H�@���̂܂܍s�����Ⴄ�́H";
		mes "�j�[�q���͂ǂ����ɂ��񂶂�H";
		mes "�r���œ|�ꂽ��ǂ�����́H";
		next;
		cutin "ep16_spica_nerius06.bmp",2;
		mes "[�X�s�[�J]";
		mes "�����܂ŋC�ɂȂ�Ȃ�";
		mes "������ɍs���Ă��΂����B";
		mes "���̂��Ƃ̓N���b�N�X��";
		mes "����Ă���邩����v�B";
		unittalk getnpcid(0,"�X�s�[�J�E�l���E�X#ep16_02"),"�X�s�[�J : �N���b�N�X�A�����ɖ߂낤�B",1;
		unittalk getnpcid(0,"�N���b�N�X#ep16_02"),"�N���b�N�X : �͂��A����l�B",1;
		next;
		cloakonnpc "�X�s�[�J�E�l���E�X#ep16_02";
		cloakonnpc "�N���b�N�X#ep16_02";
		mes "[�X�L�A]";
		mes "���́c�c�`���җl�H";
		mes "�`���җl����ɍs���Ă�";
		mes "�_���ł����H";
		mes "���������ŋ삯����Ă�";
		mes "�݂�ȕςȖڂŌ���Ǝv���܂��B";
		cutin "ep16_skia_nerius01.bmp",0;
		next;
		mes "[�X�L�A]";
		mes "���̓o���Ȃ��悤��";
		mes "���čs���Ă݂܂��B";
		mes "�X�s�[�J�͉����ɋC�Â���";
		mes "����Ȏ����������񂾂Ǝv���܂��B";
		mes "�����Ɖ�������܂��B";
		next;
		if(select("�d���Ȃ��ł��ˁc�c","�j�[�q���ɋ߂Â��`�����X�ł���") == 2) {
			mes "[�X�L�A]";
			mes "�ɁA�j�[�q���Ɂc�c�I";
			mes "�`���җl���A������Ȃ��ł��������I";
			mes "��A���͐S�z�Ȃ����ł��I";
			cutin "ep16_skia_nerius02.bmp",0;
			next;
		}
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���͏j�����";
		mes "�O�ɏo���͂��ł��B";
		mes "�����Ɨ��{�Ɍ��������͂��Ȃ̂�";
		mes "�������ɍs���Ă݂܂��傤�I";
		delquest 7688;
		setquest 7689;
		set EP16_1QUE,5;
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else if(EP16_1QUE == 5) {
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���͏j�����";
		mes "�O�ɏo���͂��ł��B";
		mes "�����Ɨ��{�Ɍ��������͂��Ȃ̂�";
		mes "�������ɍs���Ă݂܂��傤�I";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else {
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "�c�c�����������܂��B";
		mes "�������Ƃ��N����Ȃ����";
		mes "�����̂ł����B";
		close2;
		cutin "ep16_skia_nerius02.bmp",255;
		end;
	}
}

prt_cas.gat,108,240,3	script	�N���b�N�X#ep16_02	10118,{
	if(EP16_1QUE < 4) {
		cutin "ep16_crux_findel01.bmp",2;
		mes "[�N���b�N�X]";
		mes "���̎��͂��C�ɂȂ��炸�B";
		mes "�����̌�q�ł��B";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else if(EP16_1QUE == 4) {
		cutin "ep16_crux_findel01.bmp",2;
		mes "[�N���b�N�X]";
		mes "�܂�������܂����ˁB";
		mes "����l�����҂��ł��B";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else if(EP16_1QUE == 5) {
		cutin "ep16_crux_findel01.bmp",2;
		mes "[�N���b�N�X]";
		mes "�܂�������܂����ˁB";
		mes "����l�����҂��ł��B";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	} else {
		cutin "ep16_crux_findel01.bmp",2;
		mes "[�N���b�N�X]";
		mes "����l�̎w���ɂ��Ďv�Ē��ł��B";
		mes "����������ׂɂ͂���l�̂��΂�";
		mes "����Ȃ���΂Ȃ�Ȃ��̂Łc�c";
		close2;
		cutin "ep16_crux_findel03.bmp",255;
		end;
	}
}

prt_cas.gat,107,237,2	script(CLOAKED)	�j�[�q���E�n�C�l��#ep16_02	10114,{}

prt_cas.gat,103,235,7	script(CLOAKED)	�r�I�����^�[�E�n�C�l��#ep16_02	959,{}

prt_cas.gat,108,235,2	script(CLOAKED)	���{���]#ep16_02	80,{}

prt_cas.gat,197,164,0	script	#ep16_evt_7689	139,2,3,{
OnTouch:
	if(EP16_1QUE == 5) {
		mes "�]�O������A�N����";
		mes "�@������֗���C�z������]";
		next;
		cloakoffnpc "���������q#ep16_01";
		cloakoffnpc "���]#ep16_01";
		mes "[���]]";
		mes "�������ł������H";
		next;
		mes "[���������q]";
		mes "���ށA�����Ȃ��B";
		mes "���߂Ă����قǂł͂Ȃ���";
		mes "�Ȃ��Ȃ��̎肪����͓���ꂽ���B";
		next;
		mes "[���]]";
		mes "�򂪂��Ȃ���ʓI�ł����B";
		mes "�c�c���̕��́A";
		mes "�ϐ����������Ȃ������悤�ł��ˁB";
		next;
		mes "[���������q]";
		mes "�����������ɐ��܂�Ă�����";
		mes "���O������ꂽ�����͂���B";
		mes "�͂͂͂́I";
		next;
		mes "[���]]";
		mes "�͂͂́c�c";
		mes "���ꂩ��ǂ��Ȃ���܂����H";
		mes "���̕��͂��̂܂܂ŁH";
		next;
		mes "[���������q]";
		mes "���ށB�����Ă����B";
		mes "���̗l�Ȃ�΁A";
		mes "�����ɕ�����������";
		mes "�v�����낤�B";
		next;
		mes "[���������q]";
		mes "��X�́A���낻��";
		mes "�v���̏��������悤����Ȃ����B";
		cloakonnpc "���������q#ep16_01";
		cloakonnpc "���]#ep16_01";
		if(!sleep2(1000)) end;
		cloakoffnpc "�X�L�A�E�l���E�X#ep16_7689";
		mes "�]��������l��";
		mes "�@���̂܂ܕ��������čs�����]";
		next;
		mes "[�X�L�A]";
		mes "����";
		mes strcharinfo(0)+"�l�I";
		mes "�j�[�q���͌�����܂������H";
		cutin "ep16_skia_nerius01.bmp",0;
		next;
		switch(select("������Ȃ�","��������")) {
		case 1:
			mes "[�X�L�A]";
			mes "�����ł����c�c";
			mes "�@";
			mes "�j�[�q���͂ǂ���";
			mes "�s���Ă��܂�����ł��傤�H";
			next;
			mes "[�X�L�A]";
			mes "�����ƕ����ɖ߂ꂽ�Ȃ�";
			mes "������ł��B";
			next;
			mes "[�X�L�A]";
			mes "�ł��A���{�ɂ�";
			mes "��������������邩��c�c";
			mes "���̏�Ԃł�";
			mes "�߂肽���Ȃ��񂶂�Ȃ����ȁB";
			cutin "ep16_skia_nerius02.bmp",0;
			next;
			mes "�]���̎��A��������l��";
			mes "�@�������p�ɂ����̕�������";
			mes "�@���߂������������Ă����]";
			break;
		case 2:
			mes "[�X�L�A]";
			mes "�{���ł����I";
			mes "�j�[�q���͂ǂ��Ɂc�c";
			next;
			menu "�K���ȏꏊ������",-,"��������l�������������w��",-;
			mes "[�X�L�A]";
			mes "���̕����ł����c�c�H";
			mes "�@";
			mes "�]���̎��A���Ȃ����K����";
			mes "�@�w����������������";
			mes "�@���߂����������Ă����]";
			break;
		}
		next;
		mes "[�X�L�A]";
		mes strcharinfo(0)+"�l";
		mes "�s���Ă݂܂��傤�I";
		setquest 7690;
		delquest 7689;
		set EP16_1QUE,6;
		close2;
		cutin "ep16_skia_nerius02.bmp",255;
		cloakonnpc "�X�L�A�E�l���E�X#ep16_7689";
		end;
	}
}

prt_cas.gat,202,163,3	script(CLOAKED)	�X�L�A�E�l���E�X#ep16_7689	10116,{}

prt_cas.gat,31,116,0	script	#ep16_evt_7690	139,1,1,{
OnTouch:
	if(EP16_1QUE == 6) {
		cloakoffnpc "�X�L�A�E�l���E�X#ep16_7690";
		cloakoffnpc "�j�[�q���E�n�C�l��#ep16_7690";
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_7690"),"�j�[�q�� : �����c�c",1;
		if(!sleep2(1000)) end;
		unittalk getnpcid(0,"�X�L�A�E�l���E�X#ep16_7690"),"�X�L�A : �j�[�q���I",1;
		end;
	}
	end;
}

prt_cas.gat,31,116,3	script(CLOAKED)	�j�[�q���E�n�C�l��#ep16_7690	10114,{
	if(EP16_1QUE == 6) {
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c�N���H";
		mes strcharinfo(0)+"�H";
		mes "�ǂ����Ă����ɁH";
		next;
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_7690"),"�j�[�q�� : �����c�c",1;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "���́c�c�����Ă���̂��H";
		mes "���ɂ��Ђǂ��B";
		mes "�ڂ܂�������c�c";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���A���v�ł����H";
		mes "���Ȃ�����";
		mes "�ǂ����Ă��̕����ɁH";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����������Ă��܂����݂���";
		mes "����������c�c";
		mes "�������ꂽ���]��";
		mes "�x�߂�ꏊ�܂�";
		mes "�ē����Ă���Ƃ��c�c";
		mes "�c�c����";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�x���̒Ⴂ���������Ɓc�c";
		mes "�������񂾂��c�c";
		next;
		switch(select("���v�H","���Ɏア�H")) {
		case 1:
			cutin "ep16_nihi_miseria_heine01.bmp",2;
			mes "[�j�[�q��]";
			mes "�c�c���܂Ȃ��B";
			mes "�Ȃ�Ƃ��c�c�����Ȃ��B";
			next;
			mes "[�j�[�q��]";
			mes "���ɋ����킯�ł͂Ȃ����c�c";
			mes "�@";
			mes "���i�͂����܂łЂǂ���";
			mes "�Ȃ�Ȃ��񂾂��c�c";
			break;
		case 2:
			cutin "ep16_nihi_miseria_heine01.bmp",2;
			mes "[�j�[�q��]";
			mes "����A";
			mes "����Ȃ��Ƃ́c�c";
			mes "�@";
			mes "�����ċ����킯�ł��Ȃ����c�c";
			next;
			mes "[�j�[�q��]";
			mes "�����Ȃ�A����ȕ��ɂ́c�c";
			break;
		}
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c��Ȃ��B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "����Ȃ��Ɓc�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "���œ|��Ȃ��Ă悩������B";
		mes "���̃j�[�q���������̂�";
		mes "���Ɩ`���җl���������́B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�ӂӁA�m���ɂ������ȁB";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c���������΁A";
		mes "�����ɗ����͓̂�l�������H";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "��q�������悤�ȋC��";
		mes "�����񂾂��c�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "��q�H";
		mes "���̕����ɂ�";
		mes "���Ȃ��������Ȃ��������ǁc�c�H";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�����Ȃ̂��H";
		next;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���H";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "����A�Ȃ�ł��Ȃ��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�������B";
		mes "���낻��V���̎蔤��";
		mes "�����Ă����������Ȃ����Ԃ��B";
		next;
		mes "[�j�[�q��]";
		mes "�o�Ȃ���ɂ��悵�Ȃ��ɂ���";
		mes "��l�����߂�̂��ǂ��������B";
		mes "�K���ɂ����X�ɏ�Ԃ�";
		mes "�ǂ��Ȃ��Ă������ȁB";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�����Ŏ��Ԃ𖳑ʂɂ��Ă�����A";
		mes "�܂��Ȃɂ������Ă��܂��B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "��l�Ŗ߂��H";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�����B�T���Ă���Ă��肪�Ƃ��B";
		mes "�X�L�A�A";
		mes strcharinfo(0)+"�l���B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����ł͎��炷��B";
		mes "�@";
		mes "�]�j�[�q���͂܂�����";
		mes "�@��Ȃ�������������";
		mes "�@�������o�čs�����]";
		next;
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_7690";
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�c�c����Ȃ�A���v���ȁB";
		next;
		cutin "ep16_skia_nerius03.bmp",0;
		mes "[�X�L�A]";
		mes "����ł�";
		mes strcharinfo(0)+"�l�A";
		mes "���������߂�܂��傤���B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "������A�{�얂�p�t��";
		mes strcharinfo(0)+"�l�̕�����";
		mes "�������Ă���Ǝv���܂��B";
		mes "�V���ł܂�������܂��傤�B";
		delquest 7690;
		setquest 7691;
		set EP16_1QUE,7;
		close2;
		cutin "ep16_skia_nerius01.bmp",255;
		end;
	}
}

prt_cas.gat,29,117,5	script(CLOAKED)	�X�L�A�E�l���E�X#ep16_7690	10116,{
	if(EP16_1QUE == 6) {
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c�N���H";
		mes strcharinfo(0)+"�H";
		mes "�ǂ����Ă����ɁH";
		next;
		unittalk getnpcid(0,"�j�[�q���E�n�C�l��#ep16_7690"),"�j�[�q�� : �����c�c",1;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "���́c�c�����Ă���̂��H";
		mes "���ɂ��Ђǂ��B";
		mes "�ڂ܂�������c�c";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���A���v�ł����H";
		mes "���Ȃ�����";
		mes "�ǂ����Ă��̕����ɁH";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����������Ă��܂����݂���";
		mes "����������c�c";
		mes "�������ꂽ���]��";
		mes "�x�߂�ꏊ�܂�";
		mes "�ē����Ă���Ƃ��c�c";
		mes "�c�c����";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�x���̒Ⴂ���������Ɓc�c";
		mes "�������񂾂��c�c";
		next;
		switch(select("���v�H","���Ɏア�H")) {
		case 1:
			cutin "ep16_nihi_miseria_heine01.bmp",2;
			mes "[�j�[�q��]";
			mes "�c�c���܂Ȃ��B";
			mes "�Ȃ�Ƃ��c�c�����Ȃ��B";
			next;
			mes "[�j�[�q��]";
			mes "���ɋ����킯�ł͂Ȃ����c�c";
			mes "�@";
			mes "���i�͂����܂łЂǂ���";
			mes "�Ȃ�Ȃ��񂾂��c�c";
			break;
		case 2:
			cutin "ep16_nihi_miseria_heine01.bmp",2;
			mes "[�j�[�q��]";
			mes "����A";
			mes "����Ȃ��Ƃ́c�c";
			mes "�@";
			mes "�����ċ����킯�ł��Ȃ����c�c";
			next;
			mes "[�j�[�q��]";
			mes "�����Ȃ�A����ȕ��ɂ́c�c";
			break;
		}
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c��Ȃ��B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "����Ȃ��Ɓc�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "���œ|��Ȃ��Ă悩������B";
		mes "���̃j�[�q���������̂�";
		mes "���Ɩ`���җl���������́B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�ӂӁA�m���ɂ������ȁB";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c���������΁A";
		mes "�����ɗ����͓̂�l�������H";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "��q�������悤�ȋC��";
		mes "�����񂾂��c�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "��q�H";
		mes "���̕����ɂ�";
		mes "���Ȃ��������Ȃ��������ǁc�c�H";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�����Ȃ̂��H";
		next;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�j�[�q���H";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "����A�Ȃ�ł��Ȃ��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�������B";
		mes "���낻��V���̎蔤��";
		mes "�����Ă����������Ȃ����Ԃ��B";
		next;
		mes "[�j�[�q��]";
		mes "�o�Ȃ���ɂ��悵�Ȃ��ɂ���";
		mes "��l�����߂�̂��ǂ��������B";
		mes "�K���ɂ����X�ɏ�Ԃ�";
		mes "�ǂ��Ȃ��Ă������ȁB";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�����Ŏ��Ԃ𖳑ʂɂ��Ă�����A";
		mes "�܂��Ȃɂ������Ă��܂��B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "��l�Ŗ߂��H";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�����B�T���Ă���Ă��肪�Ƃ��B";
		mes "�X�L�A�A";
		mes strcharinfo(0)+"�l���B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����ł͎��炷��B";
		mes "�@";
		mes "�]�j�[�q���͂܂�����";
		mes "�@��Ȃ�������������";
		mes "�@�������o�čs�����]";
		next;
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_7690";
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�c�c����Ȃ�A���v���ȁB";
		next;
		cutin "ep16_skia_nerius03.bmp",0;
		mes "[�X�L�A]";
		mes "����ł�";
		mes strcharinfo(0)+"�l�A";
		mes "���������߂�܂��傤���B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "������A�{�얂�p�t��";
		mes strcharinfo(0)+"�l�̕�����";
		mes "�������Ă���Ǝv���܂��B";
		mes "�V���ł܂�������܂��傤�B";
		delquest 7690;
		setquest 7691;
		set EP16_1QUE,7;
		close2;
		cutin "ep16_skia_nerius01.bmp",255;
		end;
	} else if(EP16_1QUE == 7) {
		mes "[�X�L�A]";
		mes strcharinfo(0)+"�l�B";
		mes "�j�[�q���͂������v�݂����B";
		mes "�ꏏ�ɒT���Ă����";
		mes "���肪�Ƃ��������܂����B";
		next;
		mes "[�X�L�A]";
		mes "���낻��{�얂�p�t��";
		mes strcharinfo(0)+"�l�̕�����";
		mes "�������Ă���Ǝv���܂��B";
		mes "�V���ł܂�������܂��傤�B";
		close2;
		cutin "ep16_skia_nerius01.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,19,85,4	script	�N���l�J�[�E�n�C�l��#ep16_01	10119,{
	switch(EP16_1QUE) {
	case 0:
	case 1:
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�N�̖K��͋����Ă��Ȃ��B";
		mes "���₩�ɉ�����Ȃ����B";
		close2;
		cutin "ep16_kronecker_granz_heine.bmp",255;
		end;
	case 2:
		if(!checkquest(73065)) {
			mes "�]�����b���Ă���悤���B";
			mes "�@�߂Â��Ă݂悤�]";
			close;
		}
		if(checkquest(7683) & 0x1) {
			cutin "ep16_kronecker_granz_heine.bmp",2;
			mes "[�N���l�J�[]";
			mes "�����ꂵ���p�������������B";
			mes "�n�C�l���Ƃ��\���ĎӍ߂���B";
			next;
			cutin "ep16_friedrich_stolz_heine.bmp",1;
			mes "[�t���[�h���q]";
			mes "���A���x�ꂽ�B";
			mes "�����n�C�l���Ƃ̌�����ł���";
			mes "�t���[�h���q�E";
			mes "�V���g���c�E�n�C�l�����B";
			next;
			mes "[�t���[�h���q]";
			mes "���̕��͐�㓖��Ŏ��̕��ł���";
			mes "�O�����c������B";
			next;
			cutin "ep16_kronecker_granz_heine.bmp",2;
			mes "[�N���l�J�[]";
			mes "�N���l�J�[�E�O�����c�E�n�C�l�����B";
			next;
			cutin "ep16_friedrich_stolz_heine.bmp",1;
			mes "[�t���[�h���q]";
			mes "�����Ă�����ɂ���̂�";
			mes "�������ʌ���";
			mes "�s�[�^�[�E�n�C�l���B";
			next;
			cutin "ep16_petter_heine01.bmp",0;
			mes "[�s�[�^�[]";
			mes "���̗E�җl�ɂ���o����";
			mes "�ƂĂ����h�ł��B";
			next;
			cutin "ep16_friedrich_stolz_heine.bmp",1;
			mes "[�t���[�h���q]";
			mes "�����Đ�قǏo�čs�����̂�";
			mes "���̑��q�̃j�[�q���ł��B";
			next;
			mes "[�t���[�h���q]";
			mes "�n�C�l���Ƃ̐����Ȓ��n�����A";
			mes "�܂��c���Ƃ��낪�����ĂȁB";
			mes "��قǂ̌��A���߂ĎӍ߂���B";
			next;
			cutin "ep16_kronecker_granz_heine.bmp",2;
			mes "[�N���l�J�[]";
			mes "�����͕����Ă����B";
			mes "���͎q�ǂ��̂킪�܂܂�";
			mes "�����Ă��鎞�ł͂Ȃ��̂��B";
			next;
			cutin "ep16_petter_heine01.bmp",0;
			mes "[�s�[�^�[]";
			mes "�c�c����a���B";
			mes "�j�[�q���ɗ₽���������ł́H";
			mes "���ʌp�����͖{���A";
			mes "�j�[�q���ɂ���ׂ��͂��B";
			next;
			mes "[�s�[�^�[]";
			mes "�����T�n�ł��鎄���c�c";
			next;
			cutin "ep16_kronecker_granz_heine.bmp",2;
			mes "[�N���l�J�[]";
			mes "�����܂łɂ��Ȃ����B";
			mes "�j�[�q���ɂ͑f���������B";
			next;
			mes "[�N���l�J�[]";
			mes "�Ɩ�̐������ɍ��v����v�f��";
			mes "��������ɂ��ւ�炸";
			mes "�p�����ɂ��Ă͐��������Ď咣����B";
			mes "���͂ɗ~���������Ƃ���";
			mes "�؋��ł͂Ȃ����I";
			next;
			cutin "ep16_petter_heine01.bmp",0;
			mes "[�s�[�^�[]";
			mes "������O�̌�����َE�����";
			mes "���S���Ă���Ƃ������l�q�ł���B";
			next;
			cutin "ep16_kronecker_granz_heine.bmp",2;
			mes "[�N���l�J�[]";
			mes "�n�C�l���̖��ŋ���ł��錠���B";
			mes "���̑S�Ă��������҂��j�[�q�����B";
			next;
			mes "[�N���l�J�[]";
			mes "�����͂����^�ɗ������Ă���̂��B";
			mes "���̂����ł͋q�l�̑O�ɗ�������";
			mes "�b������̂��p���������B";
			next;
			mes "[�N���l�J�[]";
			mes "��ώ��炵���B";
			mes "�ǂ����Ă��̂悤�Ȏ҂�";
			mes "�䂪�Ɩ�ɐ��܂�A";
			mes "����Ȗ����N�����̂��B";
			next;
			mes "[�N���l�J�[]";
			mes "�N�͋V���ɎQ�ς���ƕ������B";
			mes "^0000ff���̉��ʂ͕K���n�C�l����^000000��";
			mes "�߂��ė��邾�낤�B";
			next;
			mes "[�N���l�J�[]";
			mes "���͈ȑO�A���҂��W�߂�";
			mes "�������������ʌp����";
			mes "�s�����̂��c�c";
			next;
			cutin "ep16_friedrich_stolz_heine.bmp",1;
			mes "[�t���[�h���q]";
			mes "�����A�ŗL�͌�₾����";
			mes "^0000ff�o���^�[�Ƃ̃A�C�[���E�A����^000000��";
			mes "�˔@�Ƃ��đ��̌��������A";
			mes "^0000ff�Q�I���O�Ƃ̃G�����X�g^000000��";
			mes "�ނ��a��Ƃ����������������񂾁B";
			next;
			mes "[�t���[�h���q]";
			mes "����ɂ���ăG�����X�g��";
			mes "�������ʂɊm�肷�邩�Ǝv������A";
			mes "�ˑR�A^0000ff�����̈ӎv^000000���������B";
			mes "���ɂ�^0000ff���ܓa���̈ӎv^000000��";
			mes "����ł���悤�Ɏv����ȁB";
			next;
			mes "[�t���[�h���q]";
			mes "�c�c�Ƃɂ������̎���������������";
			mes "���ʌp���҂̑I��ɂ��Ă�";
			mes "�����ōēx�s�����ƂɂȂ����B";
			mes "�n�C�l���Ƃł͍����";
			mes "^0000ff�s�[�^�[�����^000000�ɂȂ��Ă���B";
			next;
			mes "[�N���l�J�[]";
			mes "���̉Ɩ�ł�";
			mes "�s�[�^�[���x������҂������̂��B";
			mes "^ff0000�s�[�^�[������";
			mes "^ff0000�����Ƃɗ��v�������炷^000000���Ƃ�";
			mes "�ł���Ɗm�M���Ă���B";
			cutin "ep16_kronecker_granz_heine.bmp",2;
			next;
			menu "�����Ƃ̗��v�c�c",-;
			mes "[�N���l�J�[]";
			mes "��������B";
			mes "������j�[�q���c�c";
			mes "�������i��ł���B";
			mes "�݂��Ƃ��Ȃ��j���c�c";
			next;
			cutin "ep16_friedrich_stolz_heine.bmp",1;
			mes "[�t���[�h���q]";
			mes "�c�c";
			mes "�j�[�q���͈����z�ł͂Ȃ��B";
			mes "�n�C�l���Ƃ̖��ɔw���s����";
			mes "��x�����������Ƃ��Ȃ����ȁB";
			next;
			mes "[�t���[�h���q]";
			mes "���q������݂��Ă�킯����Ȃ��B";
			mes "�������A�j�[�q���c�c";
			mes "���̎q�́c�c";
			next;
			mes "[�N���l�J�[]";
			cutin "ep16_kronecker_granz_heine.bmp",2;
			mes "�݂��񂶂�Ȃ��B���\�����߂��B";
			mes "�n�C�l���Ƃ͋���Ȗ��͂�������";
			mes "���܂��ƌn�B";
			next;
			mes "[�N���l�J�[]";
			mes "�����̖��c�c�~�[���A�ɂ�";
			mes "�����̗��R������̂��B";
			next;
			mes "[�t���[�h���q]";
			cutin "ep16_kronecker_granz_heine.bmp",1;
			mes "����ȏ�͉Ɩ���̂��Ƃ��B";
			mes "���܂�C�ɂ��Ȃ��ł���B";
			mes "�Ƃɂ����A��ł܂�����B";
			next;
			compquest 7683;
			mes "[�t���[�h���q]";
			mes "�߂������ɉ��ʌp���͏I���B";
			mes "�������͂��̏���������̂�";
			mes "���Ԃ��������\����Ȃ��B";
			next;
			mes "[�t���[�h���q]";
			mes "�N���܂��K�₵�Ă��Ȃ�";
			mes "�Ɩ傪����Ȃ�";
			mes "�K�₵�Ă݂Ȃ����B";
			next;
			if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
				mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
				mes "�@�x���̂Ƃ���ɖ߂낤�]";
			} else {
				mes "�]^0000cd�n�C�l���ƂƂ̈��A���ς܂����B^000000";
				mes "�@���̉��Ƃɂ����A�ɍs�����]";
			}
			cutin "ep16_kronecker_granz_heine.bmp",255;
			close;
		} else {
			cutin "ep16_kronecker_granz_heine.bmp",1;
			mes "[�t���[�h���q]";
			mes "�N���܂��K�₵�Ă��Ȃ�";
			mes "�Ɩ傪����Ȃ�";
			mes "�K�₵�Ă݂Ȃ����B";
			close2;
			cutin "ep16_kronecker_granz_heine.bmp",255;
			end;
		}
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�����������ʌp�����I���B";
		mes "�\�z���Ă����ʂ�A";
		mes "�s�[�^�[���L�͂��낤�B";
		next;
		mes "[�N���l�J�[]";
		mes "�N�͏j�����y����ł��邩�H";
		mes "���ʌp�����I�������";
		mes "�Ō�̋V���ׂ̈�";
		mes "�ړ�������\�肾���c�c";
		next;
		mes "[�N���l�J�[]";
		mes "�N�ɂ͓��ʂɋ{�얂�p�t��";
		mes "�h�������悤�B";
		mes "�K���ɏj�����y���񂾌�A";
		mes "�����ɖ߂��Ă��Ȃ����B";
		close2;
		cutin "ep16_kronecker_granz_heine.bmp",255;
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
		end;
	case 16:
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�҂��Ă������B";
		mes "���Ƃ̒p�����N���悤��";
		mes "���܂�C���i�܂Ȃ����B";
		next;
		mes "[�N���l�J�[]";
		mes "�Q�ς̎��i��^�����͉̂����ŁA";
		mes "���n�ɗ������������̂��N���B";
		next;
		mes "[�N���l�J�[]";
		mes "�P�������ɘb�����B";
		mes "�܂��A���̎҂�����";
		mes "^4d4dff���~���̐S���̌���^000000��";
		mes "�_���Ă����z��̂悤���B";
		next;
		mes "[�N���l�J�[]";
		mes "�V���̕����ɂ������̂�";
		mes "�܂����U���������Ƃ�";
		mes "���ɂ��v��Ȃ������B";
		next;
		mes "[�N���l�J�[]";
		mes "�ǂ����ċU�����������̂�";
		mes "���Ƃ̋L���̊Ԃɂ���";
		mes "���j���𒲂ׂĂ݂���";
		next;
		mes "[�N���l�J�[]";
		mes "���ǂ͒T���o���Ȃ������B";
		mes "�������A�s���Ȃ��̂����͔��������B";
		next;
		menu "^4d4dff�^����m��ҁH^000000",-;
		mes "[�N���l�J�[]";
		mes "���Ƃ̋L���̊Ԃ�";
		mes "��������ė����̂��B";
		mes "�v���̂ق������Ȃ悤���ȁB";
		next;
		mes "[�N���l�J�[]";
		mes "�^����m�点��ׂɂ�";
		mes "���Ԃ�k��Ȃ��ƂȂ�Ȃ��B";
		next;
		mes "[�N���l�J�[]";
		mes "�t���[�h���q�B";
		mes "�ߋ��ɍs���b�𗊂ށB";
		next;
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "���Ԉړ��ɒ������{�얂�p�t������B";
		mes "���̎҂̗͂��g���A";
		mes "�ߋ��ɍs���Ē������s���Ăق����B";
		next;
		menu "�܂����j�������H",-;
		mes "[�t���[�h���q]";
		mes "�m���Ă���̂��B";
		mes "�Ȃ�Θb���͂₢�B";
		mes "�ނƈꏏ�ɉߋ��ɍs���Ăق����̂��B";
		next;
		menu "���~���̐S���̍s���ł��ˁH",-;
		mes "[�t���[�h���q]";
		mes "�������B";
		mes "�����ĉ��Ƃ̋L���̊ԂƂ���";
		mes "�ꏊ���̂��ꕔ�̊֘A�҈ȊO��";
		mes "�������肪�ւ���ꂽ�ꏊ�B";
		next;
		mes "[�t���[�h���q]";
		mes "�閧�����炷�邽�߂ɂ��A";
		mes "����ȏ�A���l���������ނ��Ƃ�";
		mes "�ł��Ȃ��̂��B";
		mes "�͂�݂��Ăق����B";
		next;
		menu "�킩��܂���",-;
		mes "[�t���[�h���q]";
		mes "�ߋ��̃v�����e����ɍs���A";
		mes "�����������̂����ׂĂ��Ă���B";
		next;
		mes "[�t���[�h���q]";
		mes "�c�c�����";
		mes strcharinfo(0)+"�a�B";
		mes "�N�ɂ͗�������B";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�t���[�h���q]";
		mes "�j�[�q���̎����B";
		mes "�N�ɐ������b�ɂȂ��Ă���悤���B";
		mes "�l���E�X�Ƃ̂���l�����ɂ��B";
		next;
		mes "[�t���[�h���q]";
		mes "���́A�{�얂�p�t�̗͂��g���A";
		mes "�ߋ��ɒ����ɍs�����Ƃ��Ă��Ă����̂�";
		mes "�l���E�X�Ƃ̃X�s�[�J�a���B";
		next;
		mes "[�t���[�h���q]";
		mes "���N���l�J�[�̓��~���̐S���̍s����";
		mes "���������ς�����������";
		mes "���̒�Ăɑ��т������B";
		next;
		mes "[�t���[�h���q]";
		mes "�ߋ��ɂ������Ƃ��Ă����̂�";
		mes "�^����˂��~�߂邱�Ƃ�";
		mes "�j�[�q���̖����ɂȂ����";
		mes "�l�����̂�������Ȃ��B";
		next;
		mes "[�t���[�h���q]";
		mes "�X�s�[�J�a��";
		mes "���̏P���Ƃ̍s����{���������B";
		mes "�j�[�q���̋^���𐰂炷���߂ɁB";
		next;
		mes "[�t���[�h���q]";
		mes "�Ȃɂ������̏P���̎��A";
		mes "�s�[�^�[���h����A";
		mes "���~���̐S���������U���ƌ����";
		mes "�F�A�������Ƃ���ł��Ȃ������B";
		next;
		mes "[�t���[�h���q]";
		mes "�����A�j�[�q���́A";
		mes "�j�[�q���͓������̂��B";
		next;
		mes "[�t���[�h���q]";
		mes "���q�̐���������Ƃ����̂́A";
		mes "�{���Ɋ��������̂Ȃ̂��B";
		next;
		mes "[�t���[�h���q]";
		mes "�����ăX�s�[�J�a�ƌN�̂悤��";
		mes "���q�Ɏ^������҂�����B";
		mes "�V����������������B";
		mes "�c�c�����b�����ꂽ�ȁB";
		next;
		mes "[�N���l�J�[]";
		mes "�j�������͏������o������";
		mes "�N�̕����ɍs������B";
		mes "���ꂩ��j�������ƈꏏ��";
		mes "�s�������Ȃ����B";
		setquest 7699;
		delquest 7698;
		set EP16_1QUE,17;
		close2;
		cutin "ep16_kronecker_granz_heine.bmp",255;
		end;
	case 17:
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�j�������Ƃ������p�t��";
		mes "�N�̕�����K�˂�B";
		mes "�����őҋ@���Ă��Ă���B";
		close2;
		cutin "ep16_kronecker_granz_heine.bmp",255;
		end;
	case 18:
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "��]���̂Ă�ɂ͂܂������B";
		mes "���͌N�̂��Ƃ�M���Ă���B";
		close2;
		cutin "ep16_kronecker_granz_heine.bmp",255;
		end;
	case 24:
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�N�̐s�͂̂�������";
		mes "�䂪�Ɩ�ɂ�����ꂽ";
		mes "�����𐰂炷���Ƃ��ł����B";
		next;
		mes "[�N���l�J�[]";
		mes "��͐Q����ł���s�[�^�[����";
		mes "�N����Ηǂ��̂����B";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,21,83,3	script	�t���[�h���q�E�n�C�l��#ep16_01	10120,{
	switch(EP16_1QUE) {
	case 0:
	case 1:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�����Ȃ��o���肷��Ƃ́B";
		mes "�����ɏo�čs���Ȃ����B";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	case 2:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "����΂���͂ȁc�c";
		mes "�j�[�q�������������Ă�����";
		mes "�����̂����c�c";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�N���j�����y���񂾂�ǂ����H";
		mes "�j�[�q�����j����Ɍ����������B";
		next;
		mes "[�t���[�h���q]";
		mes "����ۂ͗ǂ��Ȃ��������낤��";
		mes "�j�[�q���͈����q�ł͂Ȃ��B";
		mes "�����c�c";
		next;
		mes "[�t���[�h���q]";
		mes "����A���ł��Ȃ��B";
		mes "�Y��Ă���B";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
		end;
	case 16:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "����Ɨ������B";
		mes "�������𒷂����đ҂��Ă���B";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	case 17:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�j�������͍�Ƃ��I������A";
		mes "�N�̕����Ɍ������ƌ����Ă�������";
		mes "���΂炭�҂��Ă���B";
		mes "�ǂ����ʂ����҂��Ă��邼�B";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	case 18:
	case 19:
	case 20:
	case 21:
	case 22:
		mes "[�t���[�h���q]";
		mes "�c�c";
		next;
		mes "�]�l���������Ă���悤���B";
		mes "�@���͘b��������̂���߂Ă������]";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	case 23:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�������b�͕������B";
		mes "�����ɋ��𓾂�";
		mes "�N�����Ƃ̋L���̊Ԃ����R��";
		mes "�o����ł���悤�ɂ��Ă���B";
		next;
		mes "[�t���[�h���q]";
		mes "�c�c�������A��ςȂ��ƂɂȂ����ȁB";
		mes "�����炱�������Ƃ��c�����A";
		mes "���̍������Ȃ��Ă͂����Ȃ��B";
		next;
		mes "[�t���[�h���q]";
		mes "�N�ɂ͖{���Ɋ��ӂ��Ă���B";
		mes "�����N���n�C�l���Ƃ̗͂�";
		mes "�K�v�Ƃ���Ȃ��";
		mes "�N�̗͂ɂȂ鎖��񑩂��悤�B";
		next;
		mes "[�t���[�h���q]";
		mes "�N�ɓn�����V��";
		mes "���̒��x������t�Ȃ̂��B";
		mes "�{���ɐ\����Ȃ��B";
		mes "�����A�{�a�̓����ł̐����ɂ����Ă�";
		mes "�s�ւ��Ȃ��悤�Ɏ��v�炨���B";
		next;
		mes "[�t���[�h���q]";
		mes "�c�c�����̎��ł�";
		mes "�ߋ����ς��Ȃ��ƒm���Ă���B";
		mes "�������A���̎������ɂ�";
		mes "�ǂ����鎖���ł��Ȃ��̂��B";
		next;
		mes "[�t���[�h���q]";
		mes "�������ɏo���鎖����邵���Ȃ��B";
		next;
		mes "[�t���[�h���q]";
		mes "�����Łc�c";
		mes "�N�̓s�����ǂ����ł��܂�Ȃ��B";
		mes "���ꂩ����ߋ��ɍs���A";
		mes "���~���̐S���������";
		mes "���炢�����̂��B";
		next;
		mes "[�t���[�h���q]";
		mes "���ꂪ�����ɍ���ŁA";
		mes "�댯�𔺂����Ƃ��Ƃ������Ƃ�";
		mes "�d�X���m���Ă���B";
		mes "��������͌N�ɂ���";
		mes "���߂Ȃ����ƂȂ̂��B";
		next;
		menu "�����󂯂�",-;
		mes "[�t���[�h���q]";
		mes "���肪�Ƃ��B";
		mes "�N�Ȃ炻�������Ă�����";
		mes "�v���Ă�����B";
		next;
		mes "[�t���[�h���q]";
		mes "�N���撣���Ă���ԁA";
		mes "���������F�X���������Ă���B";
		next;
		mes "[�t���[�h���q]";
		mes "���̎��A�N�������҂ɂ��Ă�";
		mes "���������Ă���Ƃ��낾�B";
		mes "�K���A�������Ă݂��邼�B";
		close2;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		set EP16_1QUE,24;
		delquest 7704;
		setquest 7705;
		setquest 201875;
		getitem 6919,40;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	default:
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�c�c�����̎��ł�";
		mes "�ߋ����ς��Ȃ��ƒm���Ă���B";
		mes "�������A���̎������ɂ�";
		mes "�ǂ����鎖���ł��Ȃ��̂��B";
		next;
		mes "[�t���[�h���q]";
		mes "�������ɏo���鎖����邵���Ȃ��B";
		next;
		mes "[�t���[�h���q]";
		mes "�N���撣���Ă���ԁA";
		mes "���������F�X���������Ă���B";
		next;
		mes "[�t���[�h���q]";
		mes "���̎��A�N�������҂ɂ��Ă�";
		mes "���������Ă���Ƃ��낾�B";
		mes "�e���A�e�X�̎d�����撣�낤�B";
		close2;
		cutin "ep16_friedrich_stolz_heine.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,18,83,5	script	�s�[�^�[�E�n�C�l��#ep16_01	987,{
	switch(EP16_1QUE) {
	case 0:
	case 1:
		cutin "ep16_petter_heine01.bmp",1;
		mes "[�s�[�^�[]";
		mes "�j���ɏ��҂��ꂽ�p�Y�̕��ł��ˁB";
		mes "�M���B�̂��߂̏j���Ȃ̂ł�����";
		mes "�y����ŉ������B";
		close2;
		cutin "ep16_petter_heine01.bmp",255;
		end;
	case 2:
		cutin "ep16_petter_heine01.bmp",1;
		mes "[�s�[�^�[]";
		mes "�͂́c�c";
		mes "����͂��Ȃ�{���Ă��܂��ˁB";
		close2;
		cutin "ep16_petter_heine01.bmp",255;
		end;
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		cutin "ep16_petter_heine01.bmp",0;
		mes "[�s�[�^�[]";
		mes "���ʌp���ɎQ������";
		mes "�����҂ł͂���܂����A";
		mes "�ʂ����Ď��͐������̂�";
		mes "�Y��ł��܂��܂��B";
		next;
		mes "[�s�[�^�[]";
		mes "�݂�Ȃׂ̈��v���Ă��鎖��";
		mes "�ނ����߂Ă���̂ł͂Ȃ����c�c";
		next;
		mes "[�s�[�^�[]";
		mes "���̏󋵂������Ƃ��A";
		mes "�����̕��������L�͂���";
		mes "�����Ă���̂ł����A";
		mes "�{���ɂ����Ȃ̂��B";
		next;
		mes "[�s�[�^�[]";
		mes "�ǂ�قǑ傫�ȐӔC������̂�";
		mes "�ǂ�قǊ撣��Ȃ����";
		mes "�Ȃ�Ȃ��̂��c�c";
		mes "�l���鎖�����������Ă��܂��B";
		next;
		mes "[�s�[�^�[]";
		mes "������Ƃ�����";
		mes "������킯�ɂ������܂���B";
		mes "�����撣��Ȃ��ƁB";
		close2;
		cutin "ep16_petter_heine01.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,19,85,0	script	#ep16_heine_evt01	139,12,12,{
OnTouch:
	if(EP16_1QUE == 2 && !(checkquest(73065) & 0x8)) {
		cloakoffnpc "�j�[�q���E�n�C�l��#ep16_01";
		cloakoffnpc "�s�[�^�[�E�n�C�l��#ep16_01";
		cloakonnpc "�s�[�^�[�E�n�C�l��#ep16_02";
	} else if(EP16_1QUE < 10) {
		cloakonnpc "�s�[�^�[�E�n�C�l��#ep16_02";
		cloakoffnpc "�s�[�^�[�E�n�C�l��#ep16_01";
	} else if(EP16_1QUE > 9) {
		cloakonnpc "�s�[�^�[�E�n�C�l��#ep16_01";
		cloakoffnpc "�s�[�^�[�E�n�C�l��#ep16_02";
	}
	end;
}

prt_cas_q.gat,22,77,0	script	#ep16_heine_evt02	139,3,3,{
OnTouch:
	if(EP16_1QUE == 2 && !checkquest(73065)) {
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "���O�́c�c";
		mes "���������������̂�";
		mes "�킩���Ă���̂��I";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",0;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_petter_heine01.bmp",1;
		mes "[�s�[�^�[]";
		mes "���A���������Ă��������B";
		mes "�O�����c���c�c";
		next;
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�捏�A����𓭂����̂�";
		mes "�Ȃ̈ꑰ�̎҂����I";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",0;
		mes "[�j�[�q��]";
		mes "�c�c���";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",0;
		mes "[�j�[�q��]";
		mes "�c�c���";
		mes "����𓭂����̂�";
		mes "�������̂ق��ł��I";
		next;
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�I";
		mes "�@";
		mes "�j�[�q���I";
		next;
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�n����!!";
		mes "�悩�ォ�̘b�ł͂Ȃ��I";
		mes "���O�́A���ɂ�";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",0;
		mes "[�j�[�q��]";
		mes "�{�Ƃɖ߂�܂��B";
		mes "�������������B";
		next;
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�j�[�q���A����́c�c";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",0;
		mes "[�j�[�q��]";
		mes "����B";
		mes "���������ɂ��闝�R�͂���܂���B";
		next;
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�Ɩ�̈���Ƃ���";
		mes "�����ɂ��邱�ƁA";
		mes "���ꂪ���O�̋`�����I";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",0;
		mes "[�j�[�q��]";
		mes "�����Ɩ�̈���H";
		mes "����܂�";
		mes "����Ƃ��ĔF�߂Ă��ꂽ���ƂȂ�";
		mes "����܂�����!?";
		next;
		mes "[�j�[�q��]";
		mes "�捏���A����܂ł�";
		mes "�܂Ƃ��ɑ�������Ă��ꂽ���Ƃ��I";
		next;
		cutin "ep16_petter_heine01.bmp",1;
		mes "[�s�[�^�[]";
		mes "�c�c";
		mes "�@";
		mes "�������A�j�[�q���B";
		mes "���Ȃ��́c�c";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",0;
		mes "[�j�[�q��]";
		mes "���������A���̉Ɩ傪";
		mes "���ɂ����������Y��ł����I";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",0;
		mes "[�j�[�q��]";
		mes "�j�[�q���E�~�[���A�I";
		mes "�𗧂����Ɣ��f����";
		mes "����ꂽ�����I";
		next;
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�����܂łɂ��Ă����B";
		mes "�j�[�q���B";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",0;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_nihi_miseria_heine03.bmp",0;
		mes "[�j�[�q��]";
		mes "�F�߂͂����ɁA";
		mes "�ӔC���������ɉ����t����";
		mes "�c�c��������ȏ�͌��ł��I";
		next;
		mes "�]�j�[�q���ƌĂ΂ꂽ�N��";
		mes "�@���Ȃ��̂ق���";
		mes "�@�������Ă���]";
		next;
		switch(select("���������Ȃ�","����������")) {
		case 1:
		cutin "ep16_nihi_miseria_heine04.bmp",0;
			mes "[�j�[�q��]";
			mes "�I";
			mes "�@";
			mes "����B�ǂ��Ă��������B";
			break;
		case 2:
			mes "[�j�[�q��]";
			mes "�c�c���Ȃǂɐ��|���͕K�v����܂���B";
			mes "���A�͕����̉��ɂ���";
			mes "�O�����c���ɂǂ����B";
			break;
		}
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",255;
		mes "�]�j�[�q���͕s�@���Ȃ܂�";
		mes "�@�������o�čs���Ă��܂����]";
		next;
		cloakonnpc "�j�[�q���E�n�C�l��#ep16_01";
		cutin "ep16_friedrich_stolz_heine.bmp",1;
		mes "[�t���[�h���q]";
		mes "�j�[�q��";
		mes "�҂��Ȃ����I";
		next;
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�ǂ�������ȃt���[�h���q�I";
		mes "�s�[�^�[�����I";
		next;
		cutin "ep16_petter_heine01.bmp",1;
		mes "[�s�[�^�[]";
		mes "�������c�c";
		next;
		cutin "ep16_kronecker_granz_heine.bmp",2;
		mes "[�N���l�J�[]";
		mes "�ӂ�A���ӋC�����������āB";
		mes "���܂Ŏq�ǂ��̂���ł���̂��B";
		setquest 73065;
		compquest 73065;
		close2;
		cutin "ep16_kronecker_granz_heine.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,22,80,3	script(CLOAKED)	�j�[�q���E�n�C�l��#ep16_01	10114,{}

prt_cas_q.gat,9,90,3	script(CLOAKED)	�s�[�^�[�E�n�C�l��#ep16_02	10117,{
	mes "�]�����ɂނ̂��ꂵ�������B";
	mes "�@��b���ł����Ԃł͂Ȃ��]";
	close;
}

prt_cas_q.gat,142,38,0	script	#ep16_evt_7686	139,5,5,{
	end;
OnTouch:
	if(EP16_1QUE == 2 && (checkquest(7683) & 0x8) && !checkquest(7686)) {
		cloakoffnpc "�X�L�A#ep16_7686";
		cloakoffnpc "�j�[�q��#ep16_7686";
		mes "�]�n�C�l���Ƃ̕������o�čs����";
		mes "�@�N�ƁA��l�̏��������������Ă����]";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "���Ȃ��́c�c";
		mes "���Ȃ����\�̃V���h�E�v�����Z�X�ł����H";
		next;
		mes "[�j�[�q��]";
		mes "���Ȃ�����ς����ł��ˁB";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�c�c���A";
		mes "�n�C�l���Ƃ̌��q�l�ł������B";
		next;
		mes "[�X�L�A]";
		mes "�����V���h�E�Ȃ̂�";
		mes "�����Ă��܂����A";
		mes "���ꂪ��ς��Ǝv�������Ƃ�";
		mes "��x������܂���B";
		next;
		mes "[�X�L�A]";
		mes "���́A�����ł��邱�Ƃ�";
		mes "���Ă��邾���ł�����B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�������A���Ȃ����g���]��ŁA";
		mes "���̂悤�ɐ��܂ꂽ�킯�ł�";
		mes "�Ȃ��ł��傤�H";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����B";
		mes "���̓V���h�E�Ƃ��Ĉ炿�܂����B";
		mes "�������A����ɋ^���";
		mes "���������Ƃ͂���܂����ǁc�c";
		next;
		mes "[�X�L�A]";
		mes "���Ȃ��Ƃ��A���̎���";
		mes "����I���������̂ł��B";
		mes "���ꂪ���̓��ł��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "���̂悤�ɍl�����邠�Ȃ���";
		mes "�����܂����B";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "���́A�����ɂ���ꂽ";
		mes "�~�[���A�Ƃ��������̂Ă�����";
		mes "�����v���Ă��܂��B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�~�[���A�c�c�H";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "�s�K�Ƃ����Ӗ��ł��B";
		mes "�Ђǂ����ł��傤�H";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�c�c";
		next;
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		mes "[�j�[�q��]";
		mes "���܂ꂽ�����牽�������Ȃ���";
		mes "����ꑱ���Đ������";
		mes "�ǂ��Ȃ�̂��m���Ă��܂����H";
		next;
		mes "[�j�[�q��]";
		mes "�������g�������̂ł��B";
		mes "�{���ɁA����ۂɂȂ����悤�ɁB";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		mes "[�j�[�q��]";
		mes "���͉��������Ă���̂ł��傤���B";
		mes "���݂܂���B";
		mes "���Ȃ��Ɍ������Ƃł͂Ȃ������B";
		next;
		cutin "ep16_skia_nerius02.bmp",0;
		mes "[�X�L�A]";
		mes "�����Ȃ��Ƃ������Ƃ́I";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "���ɂł��A�ǂ�Ȃ��̂ɂ�";
		mes "�ς�邱�Ƃ��ł��܂��񂩁H";
		mes "�l�Ɍ��߂�ꂽ�����͂���܂���B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c�����A�ł��ˁB";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "���������΁A";
		mes "�܂����A�����Ă��܂���ł����ˁB";
		mes "�j�[�q���E�~�[���A�E�n�C�l���ł��B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "���̓X�L�A�B";
		mes "�X�L�A�E�l���E�X�ł��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�Ăю~�߂Ă��܂���";
		mes "�\����Ȃ��B";
		mes "�V���h�E�v�����Z�X�̂��Ȃ���";
		mes "��l�ŁA�L���ɂ����̂ɂ�";
		mes "���R���������̂ł��傤�H";
		next;
		cutin "ep16_skia_nerius03.bmp",0;
		mes "[�X�L�A]";
		mes "���v�ł���I";
		mes "�p�����I��点��";
		mes "�A��ł�������B";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�ł��A���낻��X�s�[�J�̂��Ƃ�";
		mes "�A��Ȃ��ƁA�x������";
		mes "����ꂿ�Ⴄ��������܂���B";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "����͑�ςł��ˁB";
		mes "������������Ă����Ȃ��ẮB";
		next;
		cutin "ep16_skia_nerius01.bmp",0;
		mes "[�X�L�A]";
		mes "�����I";
		mes "����ł́A���炵�܂��B";
		cloakonnpc "�X�L�A#ep16_7686";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�c�c";
		next;
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		mes "[�j�[�q��]";
		mes "�X�L�A���B";
		mes "�l���E�X�Ƃɂ�";
		mes "�ʔ������삳�񂪂�����̂��B";
		close2;
		cloakonnpc "�j�[�q��#ep16_7686";
		cutin "ep16_nihi_miseria_heine02.bmp",255;
		setquest 7686;
		compquest 7686;
		end;
	}
	end;
}

prt_cas_q.gat,141,39,5	script(CLOAKED)	�X�L�A#ep16_7686	10116,{}

prt_cas_q.gat,144,38,3	script(CLOAKED)	�j�[�q��#ep16_7686	10114,{}

prt_cas_q.gat,19,136,0	script	#ep16_evt_neriusroom	139,12,12,{
OnTouch:
	if(EP162_1QUE > 1) {
		cloakonnpc "��q�R�m�N���b�N�X#ep16_room01";
		cloakonnpc "�X�s�[�J�E�l���E�X#ep16_room01";
		cloakonnpc "�X�L�A�E�l���E�X#ep16_room01";
	} else if(EP16_1QUE > 14 && EP16_1QUE < 17) {
		cloakonnpc "��q�R�m�N���b�N�X#ep16_room01";
		cloakonnpc "�X�s�[�J�E�l���E�X#ep16_room01";
		cloakonnpc "�X�L�A�E�l���E�X#ep16_room01";
		cloakoffnpc "�X�s�[�J�E�l���E�X#ep16_room02";
	} else if(EP16_1QUE > 2 && EP16_1QUE < 7) {
		cloakonnpc "��q�R�m�N���b�N�X#ep16_room01";
		cloakonnpc "�X�s�[�J�E�l���E�X#ep16_room01";
		cloakonnpc "�X�L�A�E�l���E�X#ep16_room01";
	} else if(EP16_1QUE > 17) {
		cloakonnpc "�X�L�A�E�l���E�X#ep16_room01";
	}
	end;
}

prt_cas_q.gat,20,139,3	script	�X�s�[�J�E�l���E�X#ep16_room01	10115,{
	switch(EP16_1QUE) {
	case 0:
	case 1:
		cutin "ep16_spica_nerius01.bmp",1;
		mes "[�X�s�[�J]";
		mes "�j���ɏ��҂��ꂽ���ł����H";
		mes "�����͏j����ł͂���܂����B";
		close2;
		cutin "ep16_spica_nerius01.bmp",255;
		end;
	case 2:
		if(checkquest(73051)) {
			mes "[�X�s�[�J]";
			mes "���Ȃ����\��";
			mes strcharinfo(0)+"�l�ł��ˁB";
			mes "�����J�A���Ӓv���܂��B";
			mes "���̓l���E�X�Ƃ�";
			mes "�X�s�[�J�Ɛ\���܂��B";
			cutin "ep16_spica_nerius01.bmp",1;
			next;
			mes "[�X�L�A]";
			mes "�X�L�A�ł��B";
			mes "����o���Ċ������ł��B";
			cutin "ep16_skia_nerius01.bmp",0;
			next;
			mes "[�X�s�[�J]";
			mes "�����āA������͎��̐ꑮ��q�R�m��";
			mes "�N���b�N�X�ł��B";
			cutin "ep16_spica_nerius01.bmp",1;
			next;
			mes "[�N���b�N�X]";
			mes "�N���b�N�X�E�t�@�C���f���Ɛ\���܂��B";
			mes "���݁A�l���E�X�ƂŌ����w��ł��܂��B";
			cutin "ep16_crux_findel01.bmp",2;
			next;
			mes "[�X�s�[�J]";
			mes "�{���Ȃ瓖��ł���ꂪ����ׂ��ł���";
			mes "����̏j���ɂ͉p�Y���͂���";
			mes "�����̗��q������ƕ����܂����B";
			cutin "ep16_spica_nerius01.bmp",1;
			next;
			mes "[�X�s�[�J]";
			mes "�Љ�׋��Ƃ�������";
			mes "�������o�q����ɑ���";
			mes "�o�Ȃ��邱�ƂɂȂ����̂ł��B";
			next;
			menu "���ʌp�����͂ǂ��ɁH",-;
			cutin "ep16_spica_nerius05.bmp",1;
			mes "[�X�s�[�J]";
			mes "���q�c�c";
			mes "�G���q��T���Ă���̂ł����H";
			mes "�G���q�̋��ꏊ�́c�c";
			mes "���[���Ɓc�c";
			unittalk getnpcid(0,"��q�R�m�N���b�N�X#ep16_room01"),"�N���b�N�X : �c�c",1;
			next;
			cutin "ep16_spica_nerius06.bmp",1;
			mes "[�X�s�[�J]";
			mes "���A�m��Ȃ��킯�ł͂���܂���I";
			mes "�G���q�̋��ꏊ�ł���ˁH";
			mes "����́c�c���[���Ɓc�c";
			unittalk getnpcid(0,"��q�R�m�N���b�N�X#ep16_room01"),"�N���b�N�X : �}���قɂ���͂��ł��B",1;
			next;
			cutin "ep16_spica_nerius01.bmp",1;
			mes "[�X�s�[�J]";
			mes "�����I�@�}���فI";
			mes "�G���q�Ȃ牤�{�̐}���قɂ��܂��B";
			mes "�܂������ɋ�����������";
			mes "���ׂ��̂ł����Ă���̂ł��傤�I";
			next;
			cutin "ep16_spica_nerius02.bmp",1;
			mes "[�X�s�[�J]";
			mes "�l���E�X�͉��ʂ�";
			mes "����������܂��񂩂�B";
			mes "�G���q�������ɉ��ʌp����";
			mes "�o��K�v�͂Ȃ������̂ł��B";
			next;
			cutin "ep16_spica_nerius01.bmp",1;
			mes "[�X�s�[�J]";
			mes "�`����̌�₾���炩�A";
			mes "�����D������ɓ����Ă����ł��B";
			next;
			menu "���ʂɋ����������̂͂Ȃ��H",-;
			cutin "ep16_spica_nerius05.bmp",1;
			mes "[�X�s�[�J]";
			mes "����̓l���E�X�̓����̂����ł��B";
			mes "�l���E�X�Ƃ͐�c��X�A";
			mes "���������S�ł��邽�߁A";
			mes "���܂������I�o����Ă��܂��B";
			next;
			cutin "ep16_spica_nerius03.bmp",1;
			mes "[�X�s�[�J]";
			mes "������G���q���o�Ȃ�������A";
			mes "���ƃX�L�A�̂ǂ��炩��";
			mes "���܌��Ƃ���";
			mes "�����������Ă����ł��傤�B";
			next;
			cutin "ep16_spica_nerius02.bmp",1;
			mes "[�X�s�[�J]";
			mes "��͂�����������Ă���܂��āB";
			mes "���ʁA�o�����J�[�h���G���q�������B";
			mes "�ƌ����킯�ł��B";
			next;
			cutin "ep16_spica_nerius01.bmp",1;
			mes "[�X�s�[�J]";
			mes "���āA�Ɩ�̘b��";
			mes "���̂��炢�ɂ��܂��傤�B";
			mes "���̉Ɩ�ƈ��A�͂��܂������H";
			next;
			mes "[�X�s�[�J]";
			mes "�����v���Ԃ�ɓ������R�ł��B";
			mes "�H��L�΂����Ă��������܂��B";
			next;
			cutin "ep16_skia_nerius03.bmp",0;
			mes "[�X�L�A]";
			mes "�`���җl���������ƈꏏ��";
			mes "�y���݂܂��傤��I";
			mes "�n�C�l���Ƃ̌��q�l��";
			mes "�b�����������ł����B";
			next;
			cutin "ep16_spica_nerius06.bmp",1;
			mes "[�X�s�[�J]";
			mes "�X�L�A�A�����鎄�̔��g�B";
			mes "���O�͂����������{�̂���";
			mes "���t�������o���܂��傤�ˁH";
			next;
			cutin "ep16_spica_nerius07.bmp",1;
			mes "[�X�s�[�J]";
			mes "�Ƃɂ����A��X�l���E�X�Ƃ�";
			mes "���Ȃ������ł��󂯓���܂��B";
			mes "�C�ɂ����K�₵�Ă��������B";
			next;
			//setquest 7684;
			//compquest 7684;
			delquest 73051;
			if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
				mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
				mes "�@�x���̂Ƃ���ɖ߂낤�]";
				next;
			}
			cutin "ep16_spica_nerius01.bmp",1;
			mes "[�X�s�[�J]";
			mes "�������͏j���̏���������̂�";
			mes "���܂莞�Ԃ͂Ȃ��̂ł����c�c";
			next;
			mes "[�X�s�[�J]";
			mes "�܂��K�₵�Ă��Ȃ��Ɩ傪����Ȃ�";
			mes "�K�₵�Ă݂Ă͂ǂ��ł����H";
			close2;
			cutin "ep16_spica_nerius01.bmp",255;
			end;
		}
		mes "[�X�s�[�J]";
		mes "�܂��K�₵�Ă��Ȃ��Ɩ傪����Ȃ�";
		mes "�K�₵�Ă݂Ă͂ǂ��ł����H";
		cutin "ep16_spica_nerius01.bmp",1;
		close2;
		cutin "ep16_spica_nerius01.bmp",255;
		end;
	case 3:
	case 4:
	case 5:
	case 6:
		end;
	case 7:
		mes "[�X�s�[�J]";
		mes "�X�L�A�����̘̂b�͕������B";
		mes "�j�[�q�����q�l��";
		mes "�ӊO�Ǝ��Ɏォ�����悤���ȁB";
		cutin "ep16_spica_nerius01.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�c�c";
		cutin "ep16_spica_nerius03.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�����Ǝ��̖ڂ͐ߌ��ł͂Ȃ��B";
		mes "�����B����������񂶂�Ȃ����H";
		next;
		switch(select("�������l���݂�","�Ȃ�")) {
		case 1:
			mes "[�X�s�[�J]";
			mes "��قǁA�X�L�A��";
			mes "�����悤�Ȏ��������Ă����B";
			mes "�N���b�N�X�ɒ��ׂ�������";
			mes "�債�����͂Ȃ�������B";
			next;
			mes "[�X�s�[�J]";
			mes "����̏j���͑�K�͌̂�";
			mes "�l��s���ɂȂ��Ă��ĂȁB";
			mes "�Վ��Ōٗp�����҂̒���";
			mes "�s�R�l�������ꍞ��ł����̂���";
			mes "�m��Ȃ��ȁB";
			break;
		case 2:
			mes "[�X�s�[�J]";
			mes "�c�c�������B";
			mes "������l�̏����ɉ߂��Ȃ��B";
			mes "�p�Y�ł���N�������̂Ȃ�";
			mes "�����������ɂ��Ă������B";
			cutin "ep16_spica_nerius07.bmp",1;
			break;
		}
		next;
		mes "[�X�s�[�J]";
		mes "�Ƃɂ������͂��̎���";
		mes "�����Ƃŋc�_���������B";
		cutin "ep16_spica_nerius02.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�V�l�������ǂ��܂Ŏ��̌��t��";
		mes "�����X����̂��͋^�₾���ȁB";
		close2;
		cutin "ep16_spica_nerius01.bmp",255;
		end;
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
	case 14:
	case 15:
	case 16:
	case 17:
		end;
	case 18:
	case 19:
	case 20:
	case 21:
	case 22:
	case 23:
		mes "[�X�s�[�J]";
		mes "�N����J���₦�Ȃ��ȁB";
		mes "�������l�X�Ȏ���";
		mes "�������܂�āc�c";
		cutin "ep16_spica_nerius01.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�������܂�ǂ���Ԃł͂Ȃ���";
		mes "�����͗�̕s�R�l���̔w���";
		mes "�T���Ă���Ƃ��낾�B";
		next;
		mes "[�X�s�[�J]";
		mes "�c�c�����������ŁA";
		mes "����ɐ���ł��閖�[��";
		mes "�߂���̂����X���낤���A";
		mes "���Ȃ����̓}�V���B";
		next;
		menu "�X�L�A�́H",-;
		mes "[�X�s�[�J]";
		mes "�j�[�q�����q��";
		mes "�V�тɍs���Ă��܂�����B";
		mes "����Ȓj�̂ǂ����ǂ��񂾂��B";
		mes "��ȊO�A����ƌ����āc�c";
		cutin "ep16_spica_nerius03.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�܂����c�c";
		mes "�܂����A����Ȃ̂��H";
		mes "�X�L�A�͔ނ̊O���ɍ��ꂽ�̂��H";
		mes "�N���b�N�X�A�N�̈ӌ����q�ׂ�I";
		cutin "ep16_spica_nerius05.bmp",1;
		next;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "�X�s�[�J�l�A�j�[�q�����q��";
		mes "���݁A�ސT���Ǝf���Ă��܂��B";
		mes "�O�o�ȂǏo���Ȃ��̂ł́H";
		next;
		mes "[�X�s�[�J]";
		mes "�����������c�c��������B";
		mes "�X�L�A�̓j�[�q���̋ސT���";
		mes "�K�˂Ă������c�c���āB";
		mes "����������悤�Ȃ��Ƃ���Ȃ����I";
		cutin "ep16_spica_nerius06.bmp",1;
		next;
		menu "�N���b�N�X�A����J�l�c�c",-;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "�͂��c�c";
		mes "�����s�����̂ł����H";
		mes "�m���ɂ���l������ȏ�\������O��";
		mes "�߂�������������������܂���B";
		next;
		cutin "ep16_crux_findel02.bmp",2;
		mes "[�N���b�N�X]";
		mes "����ł́A�܂��B";
		close2;
		cutin "ep16_spica_nerius01.bmp",255;
		end;
	case 24:
		if(EP162_1QUE > 0) {
			cutin "ep16_spica_nerius01.bmp",1;
			mes "[�X�s�[�J]";
			mes "�₠�A"+strcharinfo(0)+"�B";
			mes "���傤�Ǎ��A���ɓ������āA";
			mes "�莝���������ɂȂ��Ă����Ƃ��낾�B";
			next;
			cutin "ep16_spica_nerius05.bmp",1;
			mes "[�X�s�[�J]";
			mes "����̌��͋�J���������ȁB";
			mes "��Ԃ̌��J�҂͊ԈႢ�Ȃ�";
			mes strcharinfo(0)+"���낤�B";
			next;
			cutin "ep16_spica_nerius07.bmp",1;
			mes "[�X�s�[�J]";
			mes "�ŏ��͂�����Ƃ���";
			mes "�������炾�������c�c�B";
			mes "�ӂӂӁc�c";
			mes "�������őދ����邱�Ƃ�";
			mes "�Ȃ�������B";
			next;
			mes "[�X�s�[�J]";
			mes "�����A�����������炢�ł�";
			mes "�����Ă���Ă������B";
			mes "�`���җl�̎���ł�";
			mes "�ʔ������Ȏ��������������ȁB";
			close2;
			cutin "ep16_spica_nerius01.bmp",255;
			end;
		}
		mes "[�X�s�[�J]";
		mes "�N����J���₦�Ȃ��ȁB";
		mes "�������l�X�Ȏ���";
		mes "�������܂�āc�c";
		cutin "ep16_spica_nerius01.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�������܂�ǂ���Ԃł͂Ȃ���";
		mes "�����͗�̕s�R�l���̔w���";
		mes "�T���Ă���Ƃ��낾�B";
		next;
		mes "[�X�s�[�J]";
		mes "�c�c�����������ŁA";
		mes "����ɐ���ł��閖�[��";
		mes "�߂���̂����X���낤���A";
		mes "���Ȃ����̓}�V���B";
		next;
		menu "�X�L�A�́H",-;
		mes "[�X�s�[�J]";
		mes "�j�[�q�����q��";
		mes "�V�тɍs���Ă��܂�����B";
		mes "����Ȓj�̂ǂ����ǂ��񂾂��B";
		mes "��ȊO�A����ƌ����āc�c";
		cutin "ep16_spica_nerius03.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "�܂����c�c";
		mes "�܂����A����Ȃ̂��H";
		mes "�X�L�A�͔ނ̊O���ɍ��ꂽ�̂��H";
		mes "�N���b�N�X�A�N�̈ӌ����q�ׂ�I";
		cutin "ep16_spica_nerius05.bmp",1;
		next;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "�X�s�[�J�l�A�j�[�q�����q��";
		mes "���݁A�ސT���Ǝf���Ă��܂��B";
		mes "�O�o�ȂǏo���Ȃ��̂ł́H";
		next;
		mes "[�X�s�[�J]";
		mes "�����������c�c��������B";
		mes "�X�L�A�̓j�[�q���̋ސT���";
		mes "�K�˂Ă������c�c���āB";
		mes "����������悤�Ȃ��Ƃ���Ȃ����I";
		cutin "ep16_spica_nerius06.bmp",1;
		next;
		menu "�N���b�N�X�A����J�l�c�c",-;
		cutin "ep16_crux_findel03.bmp",2;
		mes "[�N���b�N�X]";
		mes "�͂��c�c";
		mes "�����s�����̂ł����H";
		mes "�m���ɂ���l������ȏ�\������O��";
		mes "�߂�������������������܂���B";
		next;
		cutin "ep16_crux_findel02.bmp",2;
		mes "[�N���b�N�X]";
		mes "����ł́A�܂��B";
		close2;
		cutin "ep16_spica_nerius01.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,18,136,5	script	�X�L�A�E�l���E�X#ep16_room01	10116,{
	cutin "ep16_skia_nerius03.bmp",0;
	mes "[�X�L�A]";
	mes "����ɂ��́I";
	mes "����o���Č��h�ł��I";
	close2;
	cutin "ep16_skia_nerius03.bmp",255;
	end;
}

prt_cas_q.gat,21,140,3	script	��q�R�m�N���b�N�X#ep16_room01	10118,{
	cutin "ep16_crux_findel01.bmp",1;
	mes "[�N���b�N�X]";
	mes "���̎��͂��C�ɂȂ��炸�B";
	close2;
	cutin "ep16_crux_findel01.bmp",255;
	end;
}

prt_cas_q.gat,18,136,5	script(CLOAKED)	�X�s�[�J�E�l���E�X#ep16_room02	10115,{
	if(EP16_1QUE == 15) {
		mes "[�X�s�[�J]";
		mes "�x�������ȁc�c";
		cutin "ep16_skia_shadow01.bmp",1;
		next;
		mes "[�X�s�[�J]";
		mes "���A�ʂɗ��R��������";
		mes "���҂����킯�ł͂Ȃ��B";
		mes "�V�����ɂ����������̂�����";
		mes "�݂�ȉ�c�΂���łȁB";
		cloakoffnpc "�j�[�q���E�n�C�l��#ep16_nroom01";
		next;
		mes "[�X�s�[�J]";
		mes "����͂���́c�c";
		mes "�n�C�l���Ƃ̌��q���B";
		mes "�ސT�������󂯂����ɂ�";
		mes "�����Ǝ��R�ɕ�������Ă���ȁB";
		next;
		mes "[�j�[�q��]";
		mes "�����ł��ˁB";
		mes "�s�v�c�Ȃ��ƂɃQ�I���O�Ƃ���";
		mes "���ւ̗i��ƒ�������̂ł��B";
		mes "�������ŁA���̗��{���Ȃ��";
		mes "���R�Ɉړ��ł��鋖���o�܂����B";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		next;
		mes "[�X�s�[�J]";
		mes "�Q�I���O�Ƃ̃L���T�����l���H";
		mes "�Ƃ������G�����X�g���q���B";
		mes "���ʌp���V���̏P����";
		mes "�E�C����s�����Ƃ����҂�";
		mes "�S�������ꂽ�̂��낤�B";
		mes "�ǂ���ɂ��抴�ӂ����Ȃ��ȁB";
		cutin "ep16_skia_shadow01.bmp",1;
		next;
		mes "[�j�[�q��]";
		mes "�E�C�ł͂���܂���B";
		mes "�����s�����Ȃ��Ă�";
		mes "�N���������s�����Ƃ����ł��傤�B";
		mes "�c�c�����";
		mes "�����������P�������ł��B";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		next;
		cutin "ep16_skia_shadow01.bmp",1;
		mes "[�X�s�[�J]";
		mes "����Ȃ��Ƃ͂Ȃ��I";
		mes "���͐S�������ꂽ�I";
		next;
		mes "[�X�s�[�J]";
		mes "�c�c���A����Ȃ�ł��Ȃ��B";
		cutin "ep16_skia_shadow05.bmp",0;
		next;
		mes "[�j�[�q��]";
		mes "�����ɗ����̂́A";
		mes strcharinfo(0)+"�l��";
		mes "�`����������������������ł��B";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		next;
		mes "[�j�[�q��]";
		mes "������X�L�A�B";
		mes "�������Ă����ł����H";
		next;
		mes "[�X�s�[�J]";
		mes "�X�A�X�L�A���ƁH";
		mes "��A���̓X�s�[�J���I";
		mes "���̎q�͂��̏�ɂ͋��Ȃ����I";
		cutin "ep16_skia_shadow03.bmp",0;
		next;
		mes "[�j�[�q��]";
		mes "�c�c�����������ł����B";
		mes "����ł̓V���h�E�B";
		mes "�����������̂ł����H";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		next;
		mes "[�X�L�A]";
		mes "�c�c�ӂ��B";
		mes "�ǂ����ĕ���������ł����H";
		cutin "ep16_skia_shadow04.bmp",0;
		next;
		mes "[�j�[�q��]";
		mes "�o�q���Ƃ��Ă��A";
		mes "�S�Ă������Ƃ������͂Ȃ��ł��傤�H";
		mes "�����݂��̈Ⴄ������";
		mes "���������ł���B";
		cutin "ep16_nihi_miseria_heine02.bmp",2;
		next;
		mes "[�X�L�A]";
		mes "�����Ȃ�ł����H";
		mes "����Ȃ�c�c�������ł��B";
		mes "�������Ă���Ă��āc�c";
		cutin "ep16_skia_shadow05.bmp",0;
		next;
		menu "�ǂ����Ă���Ȏp���H",-;
		mes "[�X�L�A]";
		mes "����́A��������ł���";
		mes "�X�s�[�J�����ׂł��B";
		mes "�����X�s�[�J�Ƃ���";
		mes "�\�ɏo�鎖�������ł���B";
		cutin "ep16_skia_shadow01.bmp",0;
		next;
		mes "[�X�L�A]";
		mes "�X�s�[�J�͓���Ƃ���";
		mes "�K�v�Ȓm�����w�сA";
		mes "���̓X�s�[�J����邽�߂ɁA";
		mes "�C�z�̏�������킢�����K���܂����B";
		cutin "ep16_skia_shadow02.bmp",0;
		next;
		mes "[�X�L�A]";
		mes "��ɉe����X�s�[�J�����";
		mes "���ɂ̓X�s�[�J�̉e�ƂȂ�܂����B";
		next;
		mes "[�X�L�A]";
		mes "����Ȏ���l�X��";
		mes "�V���h�E�v�����Z�X�ƌĂт܂����B";
		mes "�����A���̏�ŁA";
		mes "����Ȃɂ����R�ɓ����̂�";
		mes "���߂ĂȂ�ł���B";
		next;
		mes "[�X�L�A]";
		mes "�Ƃɂ����A���͐Ȃ��O���Ă���";
		mes "�X�s�[�J�̑�������Ă����ł��B";
		mes "�j���ő�l�������Ă���Ƃ����";
		mes "�����Ȃ��Ƃ����܂��񂩂�B";
		cutin "ep16_skia_shadow04.bmp",0;
		next;
		mes "[�j�[�q��]";
		mes "�X�s�[�J������";
		mes "���߂��܂����H";
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		next;
		mes "[�X�L�A]";
		mes "^0000ff�厖�Șb^000000�����ɁA";
		mes "^0000ff������ɉ�ɍs��^000000��";
		mes "�����Ă��܂����B";
		cutin "ep16_skia_shadow01.bmp",0;
		next;
		menu "�厖�Șb�H",-;
		mes "[�X�L�A]";
		mes "�́A�͂��B";
		mes "��؂Ȑl�����A�厖�Șb�ł��B";
		cutin "ep16_skia_shadow05.bmp",0;
		next;
		mes "[�j�[�q��]";
		mes "�Ƃ����";
		mes strcharinfo(0)+"�l��";
		mes "�C�������d��������̂�";
		mes "���̘b��`���ɗ����̂ł��B";
		mes "�n�C�l���Ƃɂ��炵�Ăق����̂ł��B";
		cutin "ep16_nihi_miseria_heine04.bmp",2;
		next;
		menu "�킴�킴���Ă��ꂽ�́H",-;
		mes "[�j�[�q��]";
		mes strcharinfo(0)+"�l��";
		mes "�l���E�X�Ƃ�K�₵�Ă���ƕ����āA";
		mes "�������ɍs���悤�Ɍ������̂ł��B";
		next;
		cutin "ep16_skia_shadow03.bmp",0;
		mes "[�X�L�A]";
		mes "�t���[�h���q�l���H";
		mes "�����炭�V���ŋN��������";
		mes "���Ă̘b�ł���ˁB";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����͒��ڕ����Ăق����ł��B";
		next;
		mes "[�j�[�q��]";
		mes "�b�������Ȃ�܂�����";
		mes "�܂��͂���l�Ƃ����l��";
		mes "����ĉ������B";
		next;
		cutin "ep16_skia_shadow04.bmp",0;
		mes "[�X�L�A]";
		mes "�c�c������܂����B";
		mes "�ڂ������̓X�s�[�J���߂�����";
		mes "���ڕ����Ă݂܂��B";
		next;
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "����ł͍s���܂��傤�B";
		next;
		cutin "ep16_skia_shadow04.bmp",0;
		mes "[�X�L�A]";
		mes strcharinfo(0)+"�l�A";
		mes "�j�[�q���l";
		mes "�܂����Ă��������ˁB";
		setquest 7698;
		delquest 7697;
		set EP16_1QUE,16;
		close2;
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		end;
	} else if(EP16_1QUE == 16 || EP16_1QUE == 17) {
		mes "[�X�L�A]";
		mes "���̓X�s�[�J���߂�܂ł�";
		mes "���𒅑ւ����܂���̂�";
		mes "���̏�𗣂���܂���B";
		cutin "ep16_skia_shadow04.bmp",1;
		next;
		mes "[�X�L�A]";
		mes "�����A�X�s�[�J��";
		mes "�����킹�Ă��܂�����";
		mes "��ςȎ��ɂȂ�܂�����B";
		close2;
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,23,133,2	script(CLOAKED)	�j�[�q���E�n�C�l��#ep16_nroom01	10114,{
	if(EP16_1QUE == 16) {
		cutin "ep16_nihi_miseria_heine01.bmp",2;
		mes "[�j�[�q��]";
		mes "�󋵂����܂�ǂ�����܂���B";
		mes "�����ړ����������ǂ��ł��傤�B";
		close2;
		cutin "ep16_nihi_miseria_heine01.bmp",255;
		end;
	}
	end;
}

prt_cas.gat,321,25,1	script	�G���q�E�l���E�X#ep16_erihi	881,{
	mes "[�G���q]";
	mes "�j�����J���Ă邾�������āA";
	mes "�����Ƃɂ��₩���ˁB";
	mes "�ł��A�����͐}���ق�����";
	mes "�Â��ɂ��Ă���邩�ȁH";
	close;
}

prt_cas_q.gat,20,184,3	script	�C�A���E�o���^�[#ep16wal	55,10,10,{
	if(EP16_1QUE < 2) {
		mes "[�C�A��]";
		mes "�����ɂǂ������";
		mes "�����ė����H";
		mes "�l���Ă�Œǂ��o���O�ɁA";
		mes "�o�čs���������I";
		close;
	}
	if(EP16_3QUE == 0) {
		mes "[�C�A��]";
		mes "����A�M���́H";
		next;
		menu "�����A�Ɏf���܂���",-;
		mes "[�C�A��]";
		mes "�M��������̏j���ɏ��҂��ꂽ";
		mes "�`���җl�ł��ˁB";
		mes "�����������̂́A���m�ɂ�";
		mes "���ʌp���̋V���̂ق��ł����c�c";
		mes "�ِ��E�ɂĊ��􂳂ꂽ����";
		mes "����ł��Č��h�ł��B";
		next;
		mes "[�C�A��]";
		mes "�����ƁA����B";
		mes "���̓o���^�[�Ƃ̓���A";
		mes "^0000cd�C�A���E�o���^�[^000000�Ɛ\���܂��B";
		next;
		mes "[�C�A��]";
		mes "�o���^�[�Ƃ́A";
		mes "�R�m�����d�񂶂�Ɩ�ł��B";
		mes "�܂��A�C��f�Ղ��c��ł���";
		mes "���̂��߂ɍv�����Ă���܂��B";
		next;
		mes "[�C�A��]";
		mes "�Ƃ���ŁA�䂪^0000cd�o���^�[�Ƃ�";
		mes "���ʌp���ɂ͎Q�����܂���^000000���A";
		mes "�����Ƃ̒��̈�Ƃ���";
		mes "�V���ɂ͎Q�񂳂��Ă����������Ƃ�";
		mes "�Ȃ��Ă���܂��B";
		mes "��낵�����肢���܂��B";
		next;
		mes "[�C�A��]";
		mes "�c�c��������������܂��񂪁A";
		mes "�ȑO�A�e���Ƃ���p�����҂�";
		mes "�ꓯ�ɏW�܂������Ƃ�����܂����B";
		mes "���̎��ɁA�䂪�Ɩ�̌��҂�";
		mes "^0000cd�s�K�Ȏ���^000000���N���Ă��܂����̂ł��B";
		next;
		menu "�s�K�Ȏ��́H",-;
		mes "[�C�A��]";
		mes "���l�B�䂪�Ɩ�̉��ʌ���";
		mes "^0000cd�A�C�[���E�A����^000000���s�ˎ����N�����A";
		mes "^0000cd�Q�I���O�Ƃ̌�p�҂ɂ����";
		mes "^0000cd���f���ꂽ^000000�̂ł��B";
		next;
		mes "[�C�A��]";
		mes "������󂯂āA�䂪�Ɩ��";
		mes "���l����Ӗ��Ƃ���";
		mes "^0000cd����̉��ʌp����";
		mes "^0000cd�Q�����Ȃ����ƂɌ���^000000���܂����B";
		next;
		mes "[�C�A��]";
		mes "�c�c�\����Ȃ��B";
		mes "���̂悤�ȏj���̏��";
		mes "�s�g�Șb�����Ă��܂��܂����ˁB";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c";
		next;
		mes "[�C�A��]";
		mes "�A�C�[���E�A�m�A";
		mes "������ɗ��Ȃ����B";
		mes "�@";
		mes "�]�o���^�[�Ɠ���̌��t��";
		mes "�@��l�̐N���������";
		mes "�@�߂Â��Ă����]";
		next;
		mes "[�C�A��]";
		mes "�������^0000cd���̉��ł���";
		mes "^0000cd�A�C�[���E�A�m^000000�ł��B";
		mes "���N�̐��l�̋V���}�����";
		mes "�Ɩ�̒��ɂȂ�o���^�[�Ƃ�";
		mes "�p�����ƂɂȂ�܂��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "���߂܂��āB";
		mes "^0000cd�A�C�[���E�A�m�E�o���^�[^000000�ł��B";
		mes "����ł��Č��h�ł��B";
		next;
		if(select("���A��Ԃ�","���ʌp���̘b��U��") == 1) {
			mes "[�A�C�[���E�A�m]";
			mes "�܂��܂���y�̎���";
			mes "���肪�Ƃ��������܂��B";
			mes "�`���җl�́c�c";
			next;
		}
		mes "�]�A�C�[���E�A�m�Ƃ̑Θb��";
		mes "�@���荞�ނ悤�ɂ��āA";
		mes "�@����C�A���������グ���]";
		next;
		mes "[�C�A��]";
		mes "�`���җl�I";
		mes "���낻��j��������オ�邱��ł��B";
		mes "�ǂ����A�y����ł��������B";
		next;
		delquest 73052;
		//setquest 14469;
		//compquest 14469;
		setquest 73070;
		set EP16_3QUE,1;
		if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
			mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
			mes "�@�x���̂Ƃ���ɖ߂낤�]";
		} else {
			mes "�]^0000cd�o���^�[�ƂƂ̈��A���ς܂����B^000000";
			mes "�@���̉��Ƃɂ����A�ɍs�����]";
		}
		next;
		mes "�]���̎��A�A�C�[���E�A�m��";
		mes "�@�b�������Ă����]";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c";
		mes "�����A���b������܂��B";
		mes "��낵����΁A";
		mes "���ɘb�������Ă��������B";
		close;
	}
	if(EP16_3QUE <= 1 && !(checkquest(14516) & 0x8)) {
		cloakoffnpc "�������l#ep16wal";
		mes "[���n���g�Ɩ�̐l��]";
		mes "���v���Ԃ�ł��B";
		mes "�C�A���l�B";
		next;
		mes "[�C�A��]";
		mes "���p��!?";
		mes "^0000cd�ȑO�̉��ʌp���ȍ~^000000�A";
		mes "�ڐG���邱�Ƃ�";
		mes "�����؂��Ȃ���";
		mes "�݂��Ɍ��_�t�����͂��I";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "������񏳒m���Ă��܂��Ƃ��B";
		mes "�ł����c�c";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�ŋ߁A������̌�p�҂�";
		mes "���X��k���܂���Ă���Ƃ����b��";
		mes "�����ɂ͂��݂܂��ĂˁB";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�܂��A�B��K���Ȃ��Ƃ�";
		mes "���͂̎҂͔ނ�";
		mes "����ɂ��Ă��Ȃ��悤�ł����c�c";
		next;
		mes "[�C�A��]";
		mes "�c�c���̘b���B";
		mes "���łɎ�͑ł����B";
		next;
		mes "[�C�A��]";
		mes "�A�C�[���E�A�m�ɂ́A";
		mes "^0000cd�Z�̂��Ƃ͖Y���^000000��";
		mes "�����܂߂Ă����Ă���B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "���ꂪ�őP�ł��傤�B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "������ɂł��A��X��";
		mes "^0000cd�Q�I���O�Ƃ̉��ʌ���";
		mes "^0000cd�E�߂悤�Ƃ��Ă���^000000��";
		mes "�m����킯�ɂ͂����܂��񂩂�ȁB";
		next;
		mes "[�C�A��]";
		mes "�c�c���ɂ���񂶂�Ȃ��B";
		mes "�ǂ��ŒN�������Ă��邩���킩��񂼁B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "����A����B";
		mes "�c�c�܂��A�v���";
		mes "�A�C�[���E�A�����l���\�����ꂽ������";
		mes "^0000cd���Ƃ��N�����O�ɂԂꂽ^000000";
		mes "���̂ł����B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�o���^�[�Ƃ̌�p�҂ł�������";
		mes "�A�C�[���E�A�����l�̌���";
		mes "���Ɉ⊶�ł�����B";
		next;
		mes "[�C�A��]";
		mes "�c�c�N����p�҂ɂȂ낤��";
		mes "�䂪�Ɩ�����܂�";
		mes "�����Ă����Ȃ�Ί֌W�Ȃ��B";
		next;
		mes "[�C�A��]";
		mes "�������A�Ȃ�";
		mes "�������`�̂��߂Ɠ����Ă���";
		mes "�A�C�[���E�A������";
		mes "���̂悤�ȍs�����N�������̂��c�c";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�c�c����͋C�ɂ͂Ȃ�܂��B";
		mes "���Ƃ�����";
		mes "���X�A�ǋ����邱�Ƃ͊����܂���B";
		next;
		mes "[�C�A��]";
		mes "�Q�I���O�Ƃ̌�p�҂�";
		mes "��������Ă���悤����Ȃ����B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�͂��A�������ƕ����Ă��܂��B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�ǂ���ɂ���A�A�C�[���E�A�����l��";
		mes "�Q�I���O�Ƃ̌�p�҂�";
		mes "�E����Ă��܂��������ŁA";
		mes "^0000cd�o���^�[�Ƃ́A���x��";
		mes "^0000cd���ʌp���ɎQ���ł��Ȃ��Ȃ���^000000�̂�";
		mes "�c�O�ł����B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�c���ꂽ�o���^�[�̌�p�҂��A";
		mes "���̌���ǂ����Ƃ��~�߂��ʂȂ�A";
		mes "���߂Ē��ӂƊĎ���";
		mes "�ӂ�ʂ悤�ɂ��肢�������܂��B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "���ʗ~�����ɓ��傪���̉Ɩ��";
		mes "���q���ÎE���悤�Ƃ����A";
		mes "�ȂǂƂ������Ƃ��\�����ɂȂ�΁A";
		mes "��ԍ���̂̓C�A���l�ł́H";
		next;
		mes "[�C�A��]";
		mes "�M�l�A������������C��!?";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�����I";
		mes "�Â��ɁB�吺�͏o���Ȃ��ł��������B";
		mes "�o���^�[�̌�p�җl��";
		mes "�������Ă��܂��܂���B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�����b�������̂́A����";
		mes "�݂��ɋC��t���܂��傤�A�ƁB";
		mes "���ꂾ���ł��B";
		next;
		mes "[�C�A��]";
		mes "�c�c";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�����ƁA���낻��߂�˂΁B";
		mes "����ł͎��炵�܂��B";
		mes "�݂��ɗǂ��j�����߂����܂��傤�B";
		next;
		cloakonnpc "�������l#ep16wal";
		mes "[�C�A��]";
		mes "�N�\�b���ӋC�ȁI";
		mes "����ȓz�Ƃ��ꂩ���";
		mes "���g�܂Ȃ���΂����Ȃ��̂��I";
		next;
		mes "[�C�A��]";
		mes "�c�c���ǁA�c�������̂�";
		mes "�L�\�ȉ��̎������A�Ƃ́c�c";
		mes "�@";
		mes "�Ƃ񂾂��΂��킾�B";
		setquest 14516;
		compquest 14516;
		close;
	}
	if(EP16_1QUE == 2) {
		mes "[�C�A��]";
		mes "���낻��j��������オ�邱��ł��B";
		mes "�ǂ����A�y����ł��������B";
		close;
	}
	mes "[�C�A��]";
	mes "�j���͊y����ł��܂����H";
	mes "�M�������̂��߂̏j���ł��B";
	mes "�S�s���܂Ŋy����ł��������B";
	close;
OnTouch:
	if(EP16_3QUE <= 1 && !(checkquest(14516) & 0x8)) {
		cloakoffnpc "�������l#ep16wal";
		mes "[���n���g�Ɩ�̐l��]";
		mes "���v���Ԃ�ł��B";
		mes "�C�A���l�B";
		next;
		mes "[�C�A��]";
		mes "���p��!?";
		mes "^0000cd�ȑO�̉��ʌp���ȍ~^000000�A";
		mes "�ڐG���邱�Ƃ�";
		mes "�����؂��Ȃ���";
		mes "�݂��Ɍ��_�t�����͂��I";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "������񏳒m���Ă��܂��Ƃ��B";
		mes "�ł����c�c";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�ŋ߁A������̌�p�҂�";
		mes "���X��k���܂���Ă���Ƃ����b��";
		mes "�����ɂ͂��݂܂��ĂˁB";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�܂��A�B��K���Ȃ��Ƃ�";
		mes "���͂̎҂͔ނ�";
		mes "����ɂ��Ă��Ȃ��悤�ł����c�c";
		next;
		mes "[�C�A��]";
		mes "�c�c���̘b���B";
		mes "���łɎ�͑ł����B";
		next;
		mes "[�C�A��]";
		mes "�A�C�[���E�A�m�ɂ́A";
		mes "^0000cd�Z�̂��Ƃ͖Y���^000000��";
		mes "�����܂߂Ă����Ă���B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "���ꂪ�őP�ł��傤�B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "������ɂł��A��X��";
		mes "^0000cd�Q�I���O�Ƃ̉��ʌ���";
		mes "^0000cd�E�߂悤�Ƃ��Ă���^000000��";
		mes "�m����킯�ɂ͂����܂��񂩂�ȁB";
		next;
		mes "[�C�A��]";
		mes "�c�c���ɂ���񂶂�Ȃ��B";
		mes "�ǂ��ŒN�������Ă��邩���킩��񂼁B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "����A����B";
		mes "�c�c�܂��A�v���";
		mes "�A�C�[���E�A�����l���\�����ꂽ������";
		mes "^0000cd���Ƃ��N�����O�ɂԂꂽ^000000";
		mes "���̂ł����B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�o���^�[�Ƃ̌�p�҂ł�������";
		mes "�A�C�[���E�A�����l�̌���";
		mes "���Ɉ⊶�ł�����B";
		next;
		mes "[�C�A��]";
		mes "�c�c�N����p�҂ɂȂ낤��";
		mes "�䂪�Ɩ�����܂�";
		mes "�����Ă����Ȃ�Ί֌W�Ȃ��B";
		next;
		mes "[�C�A��]";
		mes "�������A�Ȃ�";
		mes "�������`�̂��߂Ɠ����Ă���";
		mes "�A�C�[���E�A������";
		mes "���̂悤�ȍs�����N�������̂��c�c";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�c�c����͋C�ɂ͂Ȃ�܂��B";
		mes "���Ƃ�����";
		mes "���X�A�ǋ����邱�Ƃ͊����܂���B";
		next;
		mes "[�C�A��]";
		mes "�Q�I���O�Ƃ̌�p�҂�";
		mes "��������Ă���悤����Ȃ����B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�͂��A�������ƕ����Ă��܂��B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�ǂ���ɂ���A�A�C�[���E�A�����l��";
		mes "�Q�I���O�Ƃ̌�p�҂�";
		mes "�E����Ă��܂��������ŁA";
		mes "^0000cd�o���^�[�Ƃ́A���x��";
		mes "^0000cd���ʌp���ɎQ���ł��Ȃ��Ȃ���^000000�̂�";
		mes "�c�O�ł����B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�c���ꂽ�o���^�[�̌�p�҂��A";
		mes "���̌���ǂ����Ƃ��~�߂��ʂȂ�A";
		mes "���߂Ē��ӂƊĎ���";
		mes "�ӂ�ʂ悤�ɂ��肢�������܂��B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "���ʗ~�����ɓ��傪���̉Ɩ��";
		mes "���q���ÎE���悤�Ƃ����A";
		mes "�ȂǂƂ������Ƃ��\�����ɂȂ�΁A";
		mes "��ԍ���̂̓C�A���l�ł́H";
		next;
		mes "[�C�A��]";
		mes "�M�l�A������������C��!?";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�����I";
		mes "�Â��ɁB�吺�͏o���Ȃ��ł��������B";
		mes "�o���^�[�̌�p�җl��";
		mes "�������Ă��܂��܂���B";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�����b�������̂́A����";
		mes "�݂��ɋC��t���܂��傤�A�ƁB";
		mes "���ꂾ���ł��B";
		next;
		mes "[�C�A��]";
		mes "�c�c";
		next;
		mes "[���n���g�Ɩ�̐l��]";
		mes "�����ƁA���낻��߂�˂΁B";
		mes "����ł͎��炵�܂��B";
		mes "�݂��ɗǂ��j�����߂����܂��傤�B";
		next;
		cloakonnpc "�������l#ep16wal";
		mes "[�C�A��]";
		mes "�N�\�b���ӋC�ȁI";
		mes "����ȓz�Ƃ��ꂩ���";
		mes "���g�܂Ȃ���΂����Ȃ��̂��I";
		next;
		mes "[�C�A��]";
		mes "�c�c���ǁA�c�������̂�";
		mes "�L�\�ȉ��̎������A�Ƃ́c�c";
		mes "�@";
		mes "�Ƃ񂾂��΂��킾�B";
		setquest 14516;
		compquest 14516;
		close;
	}
	end;
}

prt_cas_q.gat,23,187,3	script(CLOAKED)	�������l#ep16wal	86,{}

prt_cas_q.gat,14,184,5	script	�A�C�[���E�A�m#ep16wal	983,{
	switch(EP16_3QUE) {
	case 0:
		mes "[�A�C�[���E�A�m]";
		mes "�`���җl�ł��ˁB";
		mes "����ȏꏊ�܂�";
		mes "�K�˂Ă�������Ƃ́c�c";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�������̉Ɩ��";
		mes "��\������͂�����ɂ��܂��B";
		mes "�����A�����Ȃ�A";
		mes "����ł���C�A���l����ǂ����B";
		close;
	case 1:
		mes "[�A�C�[���E�A�m]";
		mes "�c�c�b���������Ƃ�����܂��B";
		next;
		switch(select("�����Ƙb�������������ł�","�A�C�[���E�A�����ɂ���")) {
		case 1:
			mes "[�A�C�[���E�A�m]";
			mes "�Z���񂪖\��A�E���ꂽ";
			mes "���̘b�ɂ��āA�ł����H";
			mes "���Ȃ������̂��肦�Ȃ��\��";
			mes "�{���ɐM���Ă���̂ł����H";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�Z���񂪂���Ȏ������c�c";
			mes "�������A�\�͂��ӂ邤�Ȃ��";
			mes "���肦�܂���B";
			break;
		case 2:
			mes "[�A�C�[���E�A�m]";
			mes "�m���ɁB";
			mes "��قǂ̃C�A���l��";
			mes "���X�킴�Ƃ炵�������ł�����ˁB";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�����܂ł��Ăł��A����";
			mes "���R��^�������Ȃ��悤�ł��B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�c�c���Ȃ����o���^�[�Ƃ̉\��";
			mes "�������ł��傤�H";
			mes "�A�C�[���E�A�����c�c�Z����";
			mes "�\��A�E���ꂽ���̘b���B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�������A";
			mes "�Z���񂪂���Ȏ������c�c";
			mes "�������A�\�͂��ӂ邤�Ȃ�Ă���";
			mes "����͂����Ȃ���ł��B";
			break;
		}
		next;
		mes "[�A�C�[���E�A�m]";
		mes "���Ƃ��A���ꂪ�{�����Ƃ��Ă�";
		mes "�c�c";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�Z����́c�c�Z����ɂ́c�c�I";
		mes "�Ȃɂ����R��������";
		mes "���������͂��ł��I";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�������^���͒N���m�炸�A";
		mes "�\�������݂�ȐM���Ă��܂��c�c";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c";
		mes "���Ȃ��ɘb�����������̂́A";
		mes "�܂��ɌZ����̂��ƂȂ�ł��B";
		mes "�Z����́A���̎����c�c";
		mes "�^����m�肽���̂ł��B";
		next;
		switch(select("���S�����̂ł́H","���Ȃ��͉������Ȃ���ł����H")) {
		case 1:
			mes "[�A�C�[���E�A�m]";
			mes "�������A�����͂��Ă��܂��I";
			mes "�����ǉƖ�̂��̂���������";
			mes "�����ߋ����@��Ԃ��Ă܂�";
			mes "^0000cd�������Ă܂���Ă��邱�Ƃ�";
			mes "^0000cd���܂�D�܂����l���ĂȂ�^000000�悤�ł��B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "����^0000cd�G�����X�g�E�Q�I���O^000000��";
			mes "�ʉ�邱�Ƃ��ł��Ă��Ȃ��̂ł��B";
			break;
		case 2:
			mes "[�A�C�[���E�A�m]";
			mes "�܂����I";
			mes "��قǂ��������悤��";
			mes "���͐^���͕ʂɂ���Ǝv���Ă��܂��B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�������A�C�A���l�������ł��傤�H";
			mes "����^0000cd�������Ă��邱�Ƃ�";
			mes "^0000cd�o���^�[�Ƃ̐l�Ԃ�";
			mes "^0000cd���܂�D�܂����l���ĂȂ�^000000�悤�ł��B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�Ђǂ��W�Q����A��ԏd�v��";
			mes "^0000cd�G�����X�g�E�Q�I���O^000000��";
			mes "�ʉ���ł��Ȃ��̂ł��B";
			break;
		}
		next;
		switch(select("�G�����X�g�E�Q�I���O�H","��Ȃ��̂ł����H")) {
		case 1:
			mes "[�A�C�[���E�A�m]";
			mes "�͂��B";
			mes "�Ƃ̎҂́A����";
			mes "�G�����X�g�ɉ���Ƃ�";
			mes "��ԋ����Ă��Ȃ��悤�ł��B";
			break;
		case 2:
			mes "[�A�C�[���E�A�m]";
			mes "�����ł��B";
			mes "�ނ͌����Ƃł���Q�I���O�Ƃ���";
			mes "�I�o���ꂽ���ʌp�����҂ł����B";
			mes "�Z����ƈ�Ԓ����ǂ��āc�c";
			mes "�����āA�Z��������f������";
			mes "�����Ă���l���ł��B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "������A�ނ�";
			mes "�����������Ă��邻���ł����c�c";
			break;
		}
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�������A�����̓���m���Ă���̂�";
		mes "�Z����̂��΂ɂ���^0000cd���R�m^000000��";
		mes "�Z������h����^0000cd�G�����X�g�E�Q�I���O^000000��";
		mes "�͂��Ȃ̂ł��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "����Ƃ�����Ȃ����A";
		mes "�ǂ����璲�ׂ�΂����̂��c�c";
		mes "�ǂ����`���җl��";
		mes "���͓Y���𒸂��Ȃ��ł��傤���B";
		next;
		while(1) {
			switch(select("�G�����X�g�E�Q�I���O�ɉ��","���R�m���畷����","�������݂���")) {
			case 1:
				mes "[�A�C�[���E�A�m]";
				mes "�����A������";
				mes "�ނɂ͉�Ȃ���ł����āB";
				mes "�����F�X�����܂�����";
				mes "�����ӂ�����̏�ԂȂ�ł��B";
				mes "����ȏ�͖����ł��B";
				next;
				continue;
			case 2:
				break;
			case 3:
				mes "[�A�C�[���E�A�m]";
				mes "�󋵂𒲂ׂ����ʁA";
				mes "�����A�Z����̂��΂ɂ����̂�";
				mes "^0000cd���R�m^000000��";
				mes "^0000cd�G�����X�g�E�Q�I���O^000000����";
				mes "�����Ă��܂��B";
				mes "�c�c�������A";
				next;
				continue;
			}
			break;
		}
		mes "[�A�C�[���E�A�m]";
		mes "���R�m����c�c�H";
		next;
		menu "���R�m�͂ǂ��ɁH",-;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c���ق��܂����B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "���͌Z����̎��R�m��";
		mes "�Z��������̂Ăē������̂ŁA";
		mes "���ɂȂ��āA���ق����̂ł��B";
		mes "������񎩕��̎��R�m���B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c����";
		mes "���R�m�Ƃ������t����A";
		mes "���ɂ������Ȃ��ł���B";
		next;
		menu "���R�m�ɉ�܂��傤",-;
		mes "[�A�C�[���E�A�m]";
		mes "�������A���R�m�ƌ����Ȃ���";
		mes "�����𐾂�����N�𗠐؂���";
		mes "�������҂��c�c�I";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c�����A�����ł��ˁB";
		mes "�G�����X�g�E�Q�I���O����";
		mes "������Ȃ��̂Ȃ�A";
		mes "���R�m���璲�ׂ�̂�";
		mes "���R�̗���ł��傤�B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "���̎��R�m�������҂�";
		mes "�Z����̎��R�m��";
		mes "���ɌP�������Ă�������";
		mes "�����Ă��܂��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�Z����̎��R�m��T���Ȃ�A";
		mes "���̎��R�m�𖱂߂Ă����҂�";
		mes "����Ƃ����ł��傤�B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c�������A����";
		mes "�ނ��؂�̂Ă��l�Ԃł��B";
		mes "���X��킹���Ȃǁc�c";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "����A�ł��c�c";
		mes "���͌Z����ɂȂɂ��������̂��A";
		mes "�^����m�肽���̂ł��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�`���җl�B";
		mes "�ǂ����A�ނ��T���Ă�";
		mes "���炦�܂��񂩁H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�A�C�[���E�A�m]";
			mes "�c�c�����ł����B";
			mes "�����ł���ˁB";
			mes "�ǂ�ȂɎ����m�肽���Ƃ�";
			mes "�M���ɂ͊֌W�̂Ȃ����Ƃł����B";
			mes "�����܂ŕ����Ă��炦�������ł�";
			mes "���肪�����Ǝv��Ȃ���΁B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "�������A����";
			mes "�C���ς����";
			mes "���͂��Ă���������Ȃ�A";
			mes "���̎��͎���K�˂Ă��������B";
			next;
			mes "[�A�C�[���E�A�m]";
			mes "���͂Ȃ�Ƃ��ނ��";
			mes "��ɍs����悤";
			mes "�������Ă݂܂��傤�B";
			close;
		}
		mes "[�A�C�[���E�A�m]";
		mes "���肪�Ƃ��������܂��I";
		mes "���̎��R�m�́c�c";
		mes "�T�t�������ۂ͂��܂�����";
		mes "�o���^�[�Ƃ̋R�m�Ƃ��Ă�";
		mes "�ݐЂ��Ă���͂��ł��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "^0000cd�A���x���^�̓쑤�ɂ���";
		mes "^0000cd�o���^�[�Ƃ̓@��^000000�ɂ���Ǝv���܂��B";
		mes "���O��";
		mes "^0000cd�T�C�}���E�o���^�[�E�}�[�V����^000000�ł��B";
		mes "��낵�����肢���܂��B";
		delquest 14516;
		delquest 73070;
		setquest 14470;
		set EP16_3QUE,2;
		next;
		mes "�]�A���x���^�̓쑤�ɂ���";
		mes "�@�o���^�[�Ƃ̓@��Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�o���^�[�Ƃ̓@��Ɍ��������]";
		close2;
		warp "alberta.gat",49,36;
		end;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�A�C�[���E�A�m]";
		mes "���R�m�������T�C�}���ɂ�";
		mes "��܂������H";
		mes "�܂��o���^�[�Ƃɂ��Ă��ꂽ�Ȃ�";
		mes "^0000cd�A���x���^�̓쑤�ɂ���";
		mes "^0000cd�o���^�[�Ƃ̓@��^000000�ɂ���Ǝv���܂��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�c�c�{��ɂ܂�����";
		mes "���ق��Ă��܂������Ƃ�";
		mes "���X�Ȃ���Ɍ�����Ă��܂��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�����Ƙb�������Ă�ꂽ��";
		mes "�Ȃɂ��ς���Ă����ł��傤���B";
		next;
		mes "�]�A���x���^�̓쑤�ɂ���";
		mes "�@�o���^�[�Ƃ̓@��Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�o���^�[�Ƃ̓@��Ɍ��������]";
		close2;
		warp "alberta.gat",49,36;
		end;
	case 7:
		mes "[�A�C�[���E�A�m]";
		mes "�߂�܂����ˁB";
		mes "���ʂ͂���܂������H";
		next;
		mes "�]�A�C�[���E�A�����̎��R�m��";
		mes "�@�o����o�܂ƁA";
		mes "�@����Ęb�������e���ȒP��";
		mes "�@���������]";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "���ꂪ����^0000cd�莆^000000�ł����B";
		mes "�c�c�m����";
		mes "�����̉Ɩ�̖�͂�";
		mes "�Z����̕M�ՂɊԈႢ����܂���B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "���̎��R�m�͉\�̂悤��";
		mes "�Z����𗠐؂��ė��ꂽ";
		mes "�킯�ł͂Ȃ������ł��ˁB";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "��͂�Z����͉��̗��R���Ȃ��A";
		mes "���̂悤�ȍs����";
		mes "�N�������킯�ł͂Ȃ������c�c";
		mes "�����A�ړI����������ł��ˁB ";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��������̂�";
		mes "�����܂ł̂悤�ł��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�͂��B";
		mes "��������͎��̖�ڂł��B";
		mes "�����܂ł����͂��������A";
		mes "���肪�Ƃ��������܂��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�o���^�[�Ƃ̗͂��K�v�Ȏ���";
		mes "���ł��K�˂ė��ĉ������B";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�A�C�[���E�A�m]";
		mes "�`���җl�͍���A";
		mes "�o���^�[�Ƃ̑厖��";
		mes "���q���܂ł��B";
		mes "���ł����͂��܂��B";
		delitem 6929,1;
		delquest 14474;
		setquest 201900;
		set EP16_3QUE,8;
		getitem 6919,30;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		close;
	case 8:
		mes "[�A�C�[���E�A�m]";
		mes "�`���җl���m�点�Ă��ꂽ";
		mes "�������ɁA";
		mes "���͑��̏����W�߂Ă��܂��B";
		mes "�܂�����܂��񂪂�����";
		mes "�^���𖾂������Ƃ��ł����";
		mes "�l���Ă��܂��B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�A���x���^�ɍs���Ă���";
		mes "�T�C�}�����Ăт܂����B";
		mes "���͈�l�ł������̗͂�";
		mes "�K�v�Ƃ���鎞�ł�����B";
		next;
		mes "[�A�C�[���E�A�m]";
		mes "�^����������������������A";
		mes "�`���җl���ēx���Ăт��܂��B";
		close;
	}
	end;
}

alberta.gat,48,33,7	script	�o���^�[�Ƃ̎���#ep16wal	109,{
	switch(EP16_3QUE) {
	case 2:
		mes "[�o���^�[�Ƃ̎���]";
		mes "�������V�C�������I";
		mes "�������c�c���͉��~��";
		mes "�N�����Ȃ��̂��Ȃ��B";
		mes "�₵�����̂��B";
		next;
		menu "�����܂���A�o���^�[�Ƃ̓@��ł����H",-;
		mes "[�o���^�[�Ƃ̎���]";
		mes "�����ł����c�c";
		mes "������p�ł��傤���H";
		mes "���͊F�v�����e���ɏo�����Ă���A";
		mes "�c�O�Ȃ���A����ł�����̂�";
		mes "����܂��񂪁c�c";
		next;
		menu "�A�C�[���E�A�m���痊�܂�ė��܂���",-;
		mes "[�o���^�[�Ƃ̎���]";
		mes "�����A�����Ȃ̂ł��ˁI";
		mes "�A�C�[���E�A�m�l�ɌĂ΂�邱�Ƃ�";
		mes "����قǑ҂��Ă���";
		mes "�b�オ����܂����B";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "�A�C�[���E�A�m�l�̎��R�m�A";
		mes "�T�C�}����^0000cd�C�Y���[�h^000000��";
		mes "�o������D���┑���Ă���";
		mes "^0000cd�D������^000000�̋߂��ɂ��܂��B";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "���ł��A�C�[���E�A�m�l�̌Ăт���������΁A";
		mes "�v�����e���ɏ����ł�����";
		mes "��������悤�ɂ�����������";
		mes "�҂��Ă��܂��B";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "�C�Y���[�h�s���̑D������ꏊ��";
		mes "�s���Č��ĉ������B";
		mes "�����ɂ���Ǝv���܂��B";
		delquest 14470;
		setquest 73058;
		set EP16_3QUE,3;
		next;
		mes "�]�C�Y���[�h�s���̑D������ꏊ��";
		mes "�@�����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�C�Y���[�h�s���̑D������ꏊ��";
		mes "�@���������]";
		close2;
		warp "alberta.gat",188,142;
		end;
	case 3:
		mes "[�o���^�[�Ƃ̎���]";
		mes "�A�C�[���E�A�m�l�̎��R�m�A";
		mes "�T�C�}����^0000cd�C�Y���[�h^000000��";
		mes "�o������D���┑���Ă���";
		mes "^0000cd�D������^000000�̋߂��ɂ��܂��B";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "���ł��A�C�[���E�A�m�l�̌Ăт���������΁A";
		mes "�v�����e���ɏ����ł�����";
		mes "��������悤�ɂ�����������";
		mes "�҂��Ă��܂��B";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "�C�Y���[�h�s���̑D������ꏊ��";
		mes "�s���Č��ĉ������B";
		mes "�����ɂ���Ǝv���܂��B";
		next;
		mes "�]�C�Y���[�h�s���̑D������ꏊ��";
		mes "�@�����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�C�Y���[�h�s���̑D������ꏊ��";
		mes "�@���������]";
		close2;
		warp "alberta.gat",188,142;
		end;
	case 4:
		mes "[�o���^�[�Ƃ̎���]";
		mes "�������V�C�������I";
		mes "�������c�c���͉��~��";
		mes "�N�����Ȃ��̂��Ȃ��B";
		mes "�₵�����̂��B";
		close;
	default:
		mes "[�o���^�[�Ƃ̎���]";
		mes "�A���X�L�B�Ƃ̎����A";
		mes "�}�n�g�c�c";
		mes "�ق��Ă����璲�q��";
		mes "�̂�₪���āc�c�I";
		mes "��������ȏ�͋�����!!";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "�������@����ꌬ�����Ă邾���ŁA";
		mes "�A���x���^�ō��̉Ɩ�H";
		mes "�o���^�[�Ƃ��Ȃ񂾂�";
		mes "�v���Ă����!!";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "��X���ڂ̑O�ɂ�����";
		mes "�ڂ����킹���Ȃ�";
		mes "�����̕��ۂŁc�c�B";
		next;
		mes "[�o���^�[�Ƃ̎���]";
		mes "����l�l�͗D������������";
		mes "�����Ă��邪�c�c";
		mes "���ꂾ���狳�{������";
		mes "�y�͍���B";
		close;
	}
}

alberta.gat,187,147,7	script	���R�m#ep16wal	470,{
	switch(EP16_3QUE) {
	case 3:
		mes "[�T�C�}��]";
		mes "�c�c";
		mes "����������c�c";
		mes "�����������N����C�����܂��B";
		next;
		menu "�A�C�[���E�A�m�̎��R�m�ł����H",-;
		mes "[�T�C�}��]";
		mes "�����A�C�[���E�A�m�l��";
		mes "���R�m�ł����c�c";
		mes "���̌�p�ł��傤���H";
		mes "�܂����c�c";
		mes "�A�C�[���E�A�m�l�̐g�ɉ���!?";
		emotion 0,"���R�m#ep16wal";
		next;
		mes "[�T�C�}��]";
		mes "��͂肱�̂悤�ȏꏊ��";
		mes "�҂��Ă���ꍇ�ł͂Ȃ�����!!";
		mes "��U�߂͂������ł���!?";
		next;
		mes "[�T�C�}��]";
		mes "�U���H�@���Q�H�@�����H";
		mes "�����N������ł����H";
		mes "�����c�c�I�@�������ɂł�";
		mes "�o������ׂ���!?";
		next;
		menu "���������Ă���������",-;
		mes "[�T�C�}��]";
		mes "�͂��c�c��U�ߗl�������Ă񂾂̂ł�";
		mes "�Ȃ���ł��ˁB";
		mes "����ł��������ƌ����̂�";
		mes "�ǂ������ł��B";
		next;
		mes "[�T�C�}��]";
		mes "�ł́A���ɉ��̗p���H";
		mes "����A�����肠�Ȃ���";
		mes "�ǂ���l�ł��傤�B";
		next;
		mes "�]���܂ł̂��Ƃ��T�C�}���ɘb�����]";
		next;
		mes "[�T�C�}��]";
		mes "����́A���炵�܂����c�c";
		mes "����^0000cd�T�C�}���E�o���^�[�E�}�[�V����^000000�ł��B";
		next;
		mes "[�T�C�}��]";
		mes "�\����Ȃ��̂ł����A����";
		mes "�A�C�[���E�A�����l�̎��R�m������";
		mes "^0000cd�P�C���E�o���^�[�E�E�H�[�J�[^000000��";
		mes "�s���Ɋւ��Ă͎���";
		mes "������Ȃ��̂ł��B";
		next;
		menu "���O�ɂ��ׂăo���^�[������܂���",-;
		mes "[�T�C�}��]";
		mes "�o���^�[�Ɩ�ɏ������ꂽ�ȏ�A";
		mes "�o���^�[�Ɩ�̐l������";
		mes "�z�����ꂽ�R�m�����͂��ׂ�";
		mes "�o���^�[�Ƃ������O��Ⴄ";
		mes "��������Ȃ�ł��B";
		next;
		mes "[�T�C�}��]";
		mes "�������O��^�����Ă�ƁA";
		mes "�������������܂��B";
		mes "�܂�����͗D�ꂽ�R�m�Ƃ���";
		mes "�F�肳�ꂽ�Ƃ����傫��";
		mes "�����S�ł�����܂��B";
		next;
		menu "�P�C���̋��ꏊ��m���Ă���l�́H",-;
		mes "[�T�C�}��]";
		mes "���́A�A�C�[���E�A�m�l��";
		mes "���{�܂ł����肵�����A";
		mes "�R�m�c�ɂ�����Ɗ�����̂ł����A";
		mes "���̎��ɉ��l���̋R�m��������";
		mes "^0000cd�������\^000000�𕷂������Ƃ�����܂��B";
		next;
		mes "[�T�C�}��]";
		mes "^0000cd�v�����e���č��ɓ�����Ă���X��^000000��";
		mes "���̍���^0000cd�o���^�[�Ƃ̐l������^000000��";
		mes "�b�������Ă���̂𕷂����炵���ł��B";
		next;
		mes "[�T�C�}��]";
		mes "�����Ǎŋ߂͉��{�ōs���j���̂�����";
		mes "���O�ɏo������͂��Ȃ������̂ŁA";
		mes "�������Ǝv���܂����B";
		mes "���̍l���ł͂��Ԃ�ނ�";
		mes "^0000cd�P�C��^000000�̂悤�ł��B";
		next;
		mes "[�T�C�}��]";
		mes "���Ȃ�C�ɂȂ���e�ł������A";
		mes "���̕��Œ���";
		mes "���ׂ��������̂ł����c�c";
		mes "�A�C�[���E�A�m�l����A���x���^�ɖ߂��";
		mes "�������Ă��܂��A�ǂ����鎖���ł��Ȃ���";
		mes "�����ɖ߂鎖�ɂȂ��Ă��܂��܂����B";
		next;
		menu "�v�����e���č��̃X���H",-;
		mes "[�T�C�}��]";
		mes "�͂��B";
		mes "�{���͕�����܂��񂪁A";
		mes "�������̐��E�ł�";
		mes "^0000cd�r�b�O�t�b�g�}��^000000��";
		mes "�Ă΂�Ă���݂����ł���B";
		next;
		mes "[�T�C�}��]";
		mes "���X�̓X�����x�̔�r�I";
		mes "�߂̌y���ƍߎ҂͑��̏ꏊ�Ɋċւ��܂����A";
		mes "�ނ̓A���i�x���c���ł��X�������Ă���";
		mes "���܂����炵���ł��B";
		next;
		mes "[�T�C�}��]";
		mes "�O����̖�������A";
		mes "�������̕��ň����p������A";
		mes "���{�̒n���č���";
		mes "���e���ꂽ�炵���ł��B";
		mes "���Ȃ݂Ƀv�����e�������{����";
		mes "�n���č��ɍs���܂���B";
		next;
		mes "[�T�C�}��]";
		mes "���̎҂͑嗤�̂����鏊��";
		mes "�����Ă��邹����������܂��񂪁A";
		mes "�F��ȏ��������Ă��邻���ł��B";
		next;
		mes "[�T�C�}��]";
		mes "����Ńo���^�[�Ƃ̐l��";
		mes "�ڌ������̂���������Ȃ��Ă��A";
		mes "���𓾂鎖���o���邩������Ȃ���";
		mes "�l���Ă��܂������c�c";
		next;
		menu "��񂠂肪�Ƃ��������܂�",-;
		mes "[�T�C�}��]";
		mes "���{�ɖ߂�܂�����";
		mes "��U�߂ɂ�낵�����`�����������B";
		mes "�����͎����m���Ɏ���Ă���ƁB";
		next;
		mes "[�T�C�}��]";
		mes "�����Ď����K�v�Ȏ��́A";
		mes "���ł��������悤��";
		mes "�����͂��Ă����";
		mes "�`���ĉ������B";
		next;
		mes "[�T�C�}��]";
		mes "�ł́A���C�����āB";
		delquest 73058;
		setquest 14471;
		set EP16_3QUE,4;
		next;
		mes "�]�v�����e�������{����";
		mes "�@�v�����e���č��ɍs����炵���B";
		mes "�@�����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�v�����e���č��Ɍ��������]";
		close2;
		warp "prt_pri00.gat",51,123;
		end;
	case 4:
		mes "[�T�C�}��]";
		mes "�č��̕��ŉ������́A";
		mes "���߂܂������H";
		mes "�����܂��ł�����c�c";
		next;
		mes "[�T�C�}��]";
		mes "^0000cd���{�̒n���č�^000000�Ɋċւ��ꂽ";
		mes "^0000cd�r�b�O�t�b�g�}��^000000�Ƃ����l����";
		mes "�K�˂Ă݂Ă��������B";
		next;
		mes "[�T�C�}��]";
		mes "���ꂩ��c�c";
		mes "�A�C�[���E�A�����l���瑼�̘b��";
		mes "�����Ă��܂��񂩁H";
		mes "�����v�����e���ɍs�����ƂɂȂ�����";
		mes "�A�C�[���E�A�����l�Ɏ��̋C������";
		mes "�K�����`���������B";
		next;
		mes "�]�v�����e�������{����";
		mes "�@�v�����e���č��ɍs����炵���B";
		mes "�@�����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�v�����e���č��Ɍ��������]";
		close2;
		warp "prt_pri00.gat",51,123;
		end;
	default:
		mes "[���R�m]";
		mes "�������Ȃ��ԂɁA";
		mes "������U�ߗl�̐g�ɁA";
		mes "�����N������c�c";
		mes "�������ɂł��v�����e���ɍs�������B";
		next;
		mes "[���R�m]";
		mes "����A�����Ɠ{����B";
		mes "���������҂��Ƃɂ��悤�B";
		mes "���̂����Ă�Œ�����͂��c�c�B";
		next;
		mes "[���R�m]";
		mes "�������������c�c�B";
		close;
	}
}

prt_pri00.gat,57,119,1	script	�r�b�O�t�b�g�}��#ep16wal	54,{
	switch(EP16_3QUE) {
	case 4:
		mes "[�r�b�O�t�b�g�}��]";
		mes "�g�������A�Ă����W���K�C���c�c";
		mes "�V�N�ȃ`�[�Y�c�c";
		mes "�͂��c�c����ȏ���";
		mes "�����߂��Ă����";
		mes "���ʂ̐H�ו����H�ׂ����Ȃ�񂾂Ȃ��B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���A���̌��܂ł�����";
		mes "�H�ו����^��ł����";
		mes "������������c�c";
		mes "�������ɂł���������̂ɁB";
		next;
		emotion 23;
		mes "[�r�b�O�t�b�g�}��]";
		mes "����!?";
		mes "����܂����ꂽ!!!!";
		mes "�|��!!!!";
		mes "�����ǉ��������ɕ߂܂��Ă���Ԃ�";
		mes "���S����ȁc�c";
		next;
		menu "�r�b�O�t�b�g�}���H",-;
		emotion 6;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����I";
		mes "���A��������͐H�ׂȂ����I";
		mes "����ȉƒ{�̃G�T�݂����ȐH�ו���";
		mes "�H�ׂȂ��I";
		mes "���͔��H�Ƃł͂Ȃ����ǁA";
		mes "�����炢�킩��I";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���ɐH���炵�����̂�";
		mes "�����ė��Ă���I";
		mes "������č����Ƃ��Ă��H�������Ȃ��̂�";
		mes "�񋟂���̂�������O����Ȃ���!?";
		next;
		menu "�Ŏ�ł͂Ȃ��ł�",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�Ŏ炶��Ȃ��́H";
		mes "�Ȃ炢�����ǁB";
		mes "�����̐H�ו��͍ň��Ȃ񂾁B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����ǂ��񂽒N�H";
		mes "���������ł͖`���҂̂悤��";
		mes "�݂��邯�ǁB";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "����A����Ȃ��̂�";
		mes "�d�v����Ȃ��ȁc�c";
		mes "���ɕ����������������ė�����";
		mes "�������ȁH";
		mes "���̒��Ƀ^�_�Ƃ������͂Ȃ��A";
		mes "����͒m���Ă����ȁH";
		next;
		emotion 4,"";
		menu "�c�c�����]�݂ł����H",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "��������o���Ă���B";
		next;
		menu "����͎��̌����O�̂��Ƃł�",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�Ȃ񂾂�A�܂�Ȃ��z���ȁB";
		mes "�����ɓ���邭�炢�Ȃ�";
		mes "������x�n�ʂ������ʒu�ɂ���";
		mes "�z����Ȃ��̂��H";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�킩�����A�F�߂�B";
		mes "���������ȗ��݂��Ƃ������炢��";
		mes "�������Ă��邵�ȁB";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�ŏ�������҂����Ă��Ȃ��B";
		mes "���������Ă݂��������B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�������f��̂����������B";
		mes "���������Y�ނӂ肭�炢��";
		mes "���Ă����Ίy���������̂ɂ�B";
		next;
		menu "�{���ɖ]��ł��鎖�͉��ł����H",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����Zeny�Ɍ��܂��Ă��邶��Ȃ����B";
		mes "���z�͂��񂽂��~��������ɂ����";
		mes "�ς��B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����̓_���B�����݂̂̈ꊇ�����B";
		mes "�Q�N�ȏ�߂��Ă���Zeny�̂ݎ󂯎��B";
		mes "������������o������";
		mes "�C�����ǂ��g���Ă�邩��B";
		next;
		menu "����ł�",-;
		emotion 32;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����A�����I�@��k����!";
		mes "��k����ʂł��Ȃ��񂾂ȁB";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "����ɎႢ������";
		mes "���߂�̂����܂�ɂ������B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�҂���!!�@���񂽂����Ă�����";
		mes "�������݂������Ƃ������񂾁I";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "����!!";
		mes "�h�����L�q�ƃO���[���T���_!!";
		mes "���ꂾ�I";
		mes "����������ė��Ă���B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����̐H�ו��͂��܂�ɂ��Ђǂ���";
		mes "���������H�ׂ��Ȃ��񂾁B";
		mes "����ł����H�ו��̂��Ƃ΂���";
		mes "�l���Ă���B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "����ԐH�ׂ������̂�����Ȃ񂾁B";
		mes "���̂��炢�͊��������ȁH";
		mes "^0000cd�h�����L�q1��";
		mes "�O���[���T���_1�M�I^000000";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂭ�炢�͏o���܂��B";
		mes "�������҂��ĉ������B ";
		next;
		emotion 18;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�҂Ăƌ���Ȃ��Ă�";
		mes "�ǂ��ɂ��s���Ȃ�������S����B";
		delquest 14471;
		setquest 14472;
		set EP16_3QUE,5;
		close;
	case 5:
		if(countitem(12055) < 1 || countitem(12065) < 1) {
			mes "[�r�b�O�t�b�g�}��]";
			mes "�҂���!!�@������Ƒ҂��Ă�B";
			mes "�L�q�̖��̓�����";
			mes "�T���_�̐V�N�ȏL�������Ȃ����H";
			next;
			mes "[�r�b�O�t�b�g�}��]";
			mes "�{���ɐH�ו���������";
			mes "�����̂��H";
			mes "^0000cd�h�����L�q1��";
			mes "�O���[���T���_1�M�I^000000";
			next;
			mes "[�r�b�O�t�b�g�}��]";
			mes "����������ė���܂ł͉���";
			mes "��������Ȃ����I";
			mes "���񂾂̂�������";
			mes "�����ė��Ă��邩�m�F����";
			mes "�ēx�����ė��Ă���I";
			close;
		}
		mes "[�r�b�O�t�b�g�}��]";
		mes "����������B���̓������B";
		mes "�����ė������̂��o���Ă݂�B";
		next;
		menu "�����ɂ���܂�",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���c�c���ꂱ��I";
		mes "������������ĐH�ׂ邺�B";
		mes "����ŁA�����������������Ă݂�B";
		next;
		menu "�����Ńo���^�[�Ƃ̐l�Ԃ�������",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����A���ꂪ�C�ɂȂ��Ă����̂��B";
		mes "���񂽂��m���Ă̒ʂ�";
		mes "���Ղ��s���o���^�[�Ƃ�";
		mes "�A���x���^�ƃv�����e�������O����";
		mes "���[���~�b�h�K�b�c�ł�";
		mes "�������鎖���������B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�L���m���Ă���z�ȊO�ɂ́A";
		mes "�g�������܂��B����������Ă��邵�B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�������A���̉Ɩ�̖�͂�";
		mes "���܂�ɂ��ς���Ă��ĂȁB";
		mes "�Łc�c����������񂾁B";
		mes "^0000cd�x�C���X^000000�ŁB";
		next;
		menu "�o���^�[�Ƃ̒N�������̂ł����H",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�N�Ȃ̂������m��Ȃ��B";
		mes "���͂����Ɠ�����";
		mes "�d�������Ă����񂾁B";
		mes "�m���Ă����ȁH";
		mes "�l���H�ׂčs���ɂ͎d����";
		mes "���Ȃ��Ƃ����Ȃ�����H";
		next;
		menu "�X���ł��ˁI",-;
		emotion 6;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�l�����������������͂�߂�B";
		mes "���̘b�����������Ȃ��̂��H";
		mes "�Ƃ͂������͋`����厖�ɂ���B";
		mes "�L�q�ƃT���_�������Ă��Ă��ꂽ";
		mes "�񑩕��͎�邺�B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�Ƃɂ������炭�Âт��i�D�������j��";
		mes "���h����ԂŎs��ɗ����Ă�������";
		mes "�߂Â��Ďd����������B";
		mes "����őf�������̏�𗣂ꂽ�񂾁B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�s��̋������Ŋm�F���Ă݂��񂾂��ǁA";
		mes "�ƂĂ��Ȃ����z�̋���";
		mes "�����Ă����񂾁B";
		mes "������ ^0000cd�Â��莆���ꖇ";
		mes "^000000�ꏏ�ɂ������񂾁B";
		mes "^0000cd���^000000��������Ă���莆���B";
		next;
		menu "�莆�����Ńo���^�[�Ƃ��Ǝv�����̂ł����H",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�܂��A�}���ȁB";
		mes "�����炻�̘b�������炵�悤��";
		mes "�����񂶂�Ȃ����B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���̑܂ɓ����Ă������z���m�F���āA";
		mes "���͂��̓��̎d�����I���悤��";
		mes "���Ă����񂾁B";
		mes "���̂��炢�A���n���ǂ���������ȁB";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����ǂ����ɁA";
		mes "���̌Âт��i�D�����Ă����z��";
		mes "���ꂽ�񂾂�B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���̌�͌���Ȃ��Ă��킩���ȁH";
		mes "3�l���炢�̒j�Ɛ���Ă�̂���";
		mes "�v�������炢�ɐ��������B";
		mes "���̐������I";
		mes "�ӂ��c�c�����U��񂷎��I";
		mes "���̎��c�c���͌����񂾂�A������B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�厖�ɉB���Ă�����^0000cd��^000000���B";
		mes "�����Ă���^0000cd���ɂ��������^000000���B";
		mes "����ŕ����������H�@�ǂ���H";
		mes "���̂��炢�Ȃ�M���邾��H";
		next;
		menu "�{���Ɍ������̂ł����H",-;
		emotion 6;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���A�^���[���ˁB";
		mes "���̐E�Ƃ������Y�ꂽ�H";
		next;
		menu "�X���ł��I",-;
		emotion 7;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���A�܂������₪����!!";
		mes "������[�I�@���ړI�Ɍ�����!?";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�Ƃɂ����A���̐E�ƓI��";
		mes "���ł��u�ԓI�ɃL���b�`����";
		mes "�ڂ��K�v�Ȃ́B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�l���p�b�ƌ����u�ԂɁA���z�̈ʒu��";
		mes "���肪�����Ă��镐��Ɨl�q�A������";
		mes "���̑������炢��";
		mes "�S���c�����Ȃ���΂Ȃ�Ȃ�";
		mes "����Փx�Z�p��K�v�Ƃ�����E�Ȃ񂾂��B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���͐M�����Ȃ��Ă�";
		mes "���̐E�ƓI�Ȕ\�͂͐M�����B";
		emotion 23,"";
		next;
		menu "�M���Ă݂܂�",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����ƕK�v�ȏ��͂Ȃ��H";
		mes "����̓f�U�[�g���H�ׂ����Ȃ����B";
		next;
		menu "�H�ׂ����͂悭�Ȃ��ł���I",-;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���A�f�U�[�g!!";
		mes "���̃f�U�[�g���������c�c";
		delitem 12055,1;
		delitem 12065,1;
		delquest 14472;
		setquest 14473;
		set EP16_3QUE,6;
		next;
		mes "�]�x�C���X�Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������")==1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�x�C���X�Ɍ��������]";
		close2;
		warp "veins.gat",160,164;
		end;
	case 6:
		mes "[�r�b�O�t�b�g�}��]";
		mes "�����H�@�C���ς�����̂��H";
		mes "�����Ɠ��������ł�����̂��H";
		mes "�Ȃ�A�}�X�e�������������";
		mes "���݂������ǁc�c";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "������ǂ��ɍs����";
		mes "�����̂��Y�ꂽ�̂��H";
		mes "^0000cd�x�C���X^000000�ɍs����";
		mes "����������B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���ɂ܂������";
		mes "�f�U�[�g�����ė��āI";
		next;
		mes "�]�x�C���X�Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������")==1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�x�C���X�Ɍ��������]";
		close2;
		warp "veins.gat",160,164;
		end;
	default:
		mes "[�r�b�O�t�b�g�}��]";
		mes "�g�������A�Ă����W���K�C���c�c";
		mes "�V�N�ȃ`�[�Y�c�c";
		mes "�͂��c�c����ȏ���";
		mes "�����߂��Ă����";
		mes "���ʂ̐H�ו����H�ׂ����Ȃ�񂾂Ȃ��B";
		next;
		mes "[�r�b�O�t�b�g�}��]";
		mes "���A���̌��܂ł�����";
		mes "�H�ו����^��ł����";
		mes "������������c�c";
		mes "�������ɂł���������̂ɁB";
		next;
		emotion 23;
		mes "[�r�b�O�t�b�g�}��]";
		mes "����!?";
		mes "����܂����ꂽ!!!!";
		mes "�|��!!!!";
		mes "�����ǉ��������ɕ߂܂��Ă���Ԃ�";
		mes "���S����ȁc�c";
		close;
	}
}

veins.gat,156,160,7	script	K#ep16wal	934,{
	switch(EP16_3QUE) {
	case 6:
		emotion 7;
		mes "[K]";
		mes "���񂽁A�N���H";
		mes "����������Ȃ��I�������Ă���񂾁H";
		mes "�I���̍��z��_���Ă���̂��H";
		mes "����͎c�O���B";
		mes "�I���̍��z��_���Ă����z��";
		mes "���̑O�č��ɑ������΂��肾���H";
		next;
		mes "[K]";
		mes "���蒇�Ԃ��炻��ȏ���";
		mes "���L����Ȃ��݂������ȁH";
		mes "�č��ɍs�������Ȃ��Ȃ�";
		mes "���₩�ɂ������������B";
		next;
		menu "�͂��߂܂��āA�P�C���E�o���^�[�E�E�H�[�J�[",-;
		mes "[K]";
		mes "�c�c�m��Ȃ����O���B";
		next;
		menu "��N�����̂Ă����؂��",-;
		mes "[K]";
		mes "���O�c�c�N���H";
		mes "�ǂ����ăI���̏��ɗ���";
		mes "����Șb������!!";
		next;
		menu "�^����m�肽���̂ł�",-;
		mes "[K]";
		mes "�^���H";
		mes "�����I";
		mes "����m�낤�Ƃ��Ă���b!?";
		next;
		menu "�m���Ă���̂͂��Ȃ��̕���",-;
		mes "[K]";
		mes "�c�c�����Ă݂�B";
		mes "���O�͒N���H";
		mes "�A�C�[���E�A�����l�̎��Ɋւ���";
		mes "�����m���Ă���̂��H";
		next;
		mes "[K]";
		mes "�����ɂ���Ă͂��O�̖���";
		mes "�������Ă���c�c";
		mes "�܂��̓I���̐��̂�m���Ă���";
		mes "�����̂������̗��R���B";
		next;
		mes "[K]";
		mes "���A�����Ă݂�B";
		mes "���O�͒N���H";
		mes "�ǂ�����ăI����K�˂ė����H";
		mes "�����ăA�C�[���E�A�����l�̎��ɑ΂���";
		mes "����m���Ă���H";
		next;
		menu "�A�C�[���E�A�m����̈˗��Œ��ׂĂ���",-;
		mes "[K]";
		mes "�����A�Ȃ�Ƃ������Ƃ��c�c";
		mes "�A�C�[���E�A�m�l�c�c�H";
		mes "���̕������ɁH";
		mes "�ǂ�قǑ҂���т����Ƃ��c";
		next;
		mes "[K]";
		mes "���A��ώ��炵�܂����I";
		mes "�\���󂠂�܂���I";
		mes "�ǂ������̖������������������!!";
		next;
		mes "[K]";
		mes "���͂����o���^�[�Ƃ������O��";
		mes "�g�������o���܂���c�c";
		mes "�����������Ȃ�A���̐��̉q����";
		mes "���O������Ȃ���΂Ȃ�܂���B";
		mes "����Ɏ��͂��̐�����鎖��";
		mes "�o���Ȃ������ߐl�ł��B";
		next;
		mes "[K]";
		mes "�A�C�[���E�A�m�l���A�C�[���E�A�����l��";
		mes "���ɑ΂��Ė{�i�I�ɒ�����";
		mes "�n�߂��̂ł����H";
		mes "����Ȃ玄�����̕��̑���";
		mes "�S�͂�s�����A���͂��܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����ł͂���܂���B";
		mes "�A�C�[���E�A�m�l���Z�l�̎���";
		mes "�^�������Ă��āA�������";
		mes "���ׂĂ݂��������Ȃ̂ł����A";
		mes "���낢��Ɩ�肪����";
		mes "���X�i��ł��܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̂悤�ȗ��R��������";
		mes "��r�I�ȓ�����鎖���ł��鎄��";
		mes "����ɒ��ׂ邽�߂ɓ����Ă��܂��B";
		next;
		mes "[K]";
		mes "�����ł����c�c";
		mes "����Ȃ玄�͂ǂ̂悤��";
		mes "���͂���΂悢�ł��傤�H";
		mes "�^���𖾂������߂Ȃ�";
		mes "���ł����͂��܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�C�[���E�A�����l�Ƃ̊Ԃɂ��������Ƃ���";
		mes "�b���Ē�����Α��v�ł��B";
		mes "�A�C�[���E�A�����l��";
		mes "�S���Ȃ�O�ɏ��������R�ƁA";
		mes "�ǂ����Ă����ɂ���̂��A�Ȃǂł��B";
		next;
		mes "[K]";
		mes "�������͂��̕������񂾍ہA";
		mes "�����N�����̂��A�����m��܂���B";
		mes "�Ƃ����̂��A���̎������N����O�A";
		mes "����^0000cd�C����^�����Ă�����";
		mes "���邱�ƂɂȂ�܂����B^000000";
		next;
		mes "[K]";
		mes "�����ĔC�����I���Ė߂낤�Ƃ������A";
		mes "��ʂ�Zeny�ƈꏏ��^0000cd�莆���ꖇ";
		mes "^000000�����Ă��܂����B";
		mes "^0000cd��΃��[���~�b�h�K�b�c��";
		mes "�߂��ė��Ȃ��悤��^000000�Ƃ���";
		mes "���e�ł����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂩ��́H";
		next;
		mes "[K]";
		mes "���̌シ���ɕ��̉\�ł��̕���";
		mes "�S���Ȃ������Ƃ�m��܂����B";
		mes "�}���Ń��[���~�b�h�K�b�c��";
		mes "�߂肽�������̂ł����A";
		next;
		mes "[K]";
		mes "�莆�ɂ� ^0000cd�����ĉ��������Ă�";
		mes "�߂��ė����^000000�Ƃ����w����";
		mes "�������̂ł������鎖��";
		mes "�ł��܂���ł����c�c�B";
		next;
		mes "[K]";
		mes "���΂炭���Ă���\�𕷂��܂����B";
		mes "�A�C�[���E�A�����l�̗��\��";
		mes "�s���Ƃ���ɔ������ɂ��āA�ł��B";
		next;
		mes "[K]";
		mes "���_�c�c";
		mes "��N�𗠐؂������R�m�̘b���c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ȃ�قǁc�c�A�C�[���E�A�����l��";
		mes "���Ȃ����������܂�Ȃ��悤��";
		mes "�ی삵�悤�Ƃ�����ł��ˁB";
		mes "�g�ӂɖ�肪����Έ��";
		mes "����̂͂��Ȃ��Ȃ̂ŁB";
		next;
		mes "[K]";
		mes "�Ȃ�قǁc�c";
		mes "���̂悤�ȈӐ}���������̂ł��傤���B";
		mes "���͂����܂ł͍l�����Ȃ��āc�c";
		mes "����ł́A�����̂��߂�";
		mes "�����A�C�[���E�A�����l���璸����";
		mes "^0000cd�莆�ƌ�^000000�������グ�܂��B";
		next;
		mes "[K]";
		mes "�A�C�[���E�A�m�l�ɂ��n�����������B";
		mes "�ǂ�������炪���̕��̖��_��";
		mes "�񕜂���̂ɗ͂ɂȂ�΁c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���͎����Ă��ĉ������B";
		mes "�R�m�ɂƂ��Č��͖��ƈꏏ�ł�����B";
		mes "�A�C�[���E�A�����l�������";
		mes "�]��ł���Ǝv���܂��B";
		next;
		if(checkitemblank() == 0) {
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[K]";
		mes "�킩��܂����B";
		mes "����ł͋C��t���Ă��߂艺�����B";
		delquest 14473;
		setquest 14474;
		getitem 6929,1;
		set EP16_3QUE,7;
		next;
		mes "�]�A�C�[���E�A�m�̂���ꏊ��";
		mes "�@�����������ȁH�]";
		next;
		if(select("������Ȃ�","������")==1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�A�C�[���E�A�m�ɉ��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",26,178;
		end;
	case 7:
		mes "[K]";
		mes "�A�C�[���E�A�m�l�Ɏ莆��";
		mes "��̘b�͓`���Ă���܂������H";
		next;
		mes "[K]";
		mes "�����A�킽���̗͂��K�v�Ȃ�";
		mes "���ł����̐g��������";
		mes "�`���ĉ������B";
		next;
		mes "�]�A�C�[���E�A�m�̂���ꏊ��";
		mes "�@�����������ȁH�]";
		next;
		if(select("������Ȃ�","������")==1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�A�C�[���E�A�m�ɉ��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",26,178;
		end;
	default:
		mes "[K]";
		mes "�߂肽���B";
		mes "�܂����̏ꏊ�Ɂc�c";
		close;
	}
}

prt_cas_q.gat,82,21,1	script	�����B�G���E�E�B�O�i�[#ep16wig	10132,{
	if(EP16_1QUE < 2) {
		end;
	}
	switch(EP16_4QUE) {
	case 0:
		mes "[�����B�G��]";
		mes "�悤�����A�`���җl�B";
		mes "���̓E�B�O�i�[�Ƃ�";
		mes "^0000cd�����B�G���E�E�B�O�i�[^000000�Ɛ\���܂��B";
		next;
		menu "�����A�Ɏf���܂���",-;
		mes "[�����B�G��]";
		mes "�����A����͂���́B";
		mes "�����A����������Ƃ͌��h�ł��B";
		next;
		mes "[�����B�G��]";
		mes "����̉��͏j���̈Ӗ�������܂���";
		mes "���ʌp���̘b���i�s����悤�ŁB";
		mes "����A�͂͂́B";
		mes "�`���җl�͂��łɂ������ł��傤�ȁB";
		next;
		mes "[�����B�G��]";
		mes "���̉Ɩ�ł�";
		mes "���ʌp����������₪����܂��̂�";
		mes "���ЁA����ɂȂ��Ă��������B";
		next;
		mes "[�����B�G��]";
		mes "�����Ă�����͉䂪��";
		mes "^0000cd�J�^���i�E�E�B�O�i�[^000000�ł��B";
		next;
		mes "[�J�^���i]";
		mes "��������悤�B";
		mes "�E�B�O�i�[�Ƃɂ悤�����B";
		next;
		mes "[�J�^���i]";
		mes "�`���җl�̕֋X��}��悤";
		mes "�������͍ő�̎x�����������܂���B";
		mes "�ǂ����������";
		mes "���̔�������Ă��������܂��B";
		next;
		mes "[�J�^���i]";
		mes "���������Ԃ��������Ȃ�";
		mes "���x�̓E�B�O�i�[�̖{�Ƃɂ�";
		mes "���K�₭�������܂��B";
		mes "���ł��`���җl�����}���܂���B";
		next;
		mes "[�J�^���i]";
		mes "�c�c�Ƃ���ŁA���Ȃ��H";
		mes "^0000cd�����Q��^000000�͂ǂ��ɍs�����̂�����B";
		next;
		cloakoffnpc "�����Q���E�E�B�O�i�[#ep16wig00";
		cloakonnpc "�����Q���E�E�B�O�i�[#ep16wig";
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���Ăтł����H";
		next;
		cutin "16jur_nor.bmp",255;
		mes "[�����B�G��]";
		mes "�����Q���B���傤�ǂ悢�Ƃ���ɁB";
		mes "�`���җl�A";
		mes "�䂪^0000cd�E�B�O�i�[�Ƃ̌�p��^000000�ɂ���";
		mes "^0000cd���ʌp�����^000000�̃����Q���ł��B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�Љ�ɂ�������܂���";
		mes "^0000cd�����Q���E�E�B�O�i�[^000000�Ɛ\���܂��B";
		mes "����ł��Č��h�ł��B";
		next;
		mes "[�����Q��]";
		mes "�`���җl�A�ǂ��������났���������B";
		mes "�K�v�Ȃ��̂������";
		mes "���ł�����������Ă��������ˁB";
		next;
		menu "���肪�Ƃ��������܂�",-;
		mes "[�����Q��]";
		mes "����ł͎��͎��炵�܂��B";
		next;
		cloakonnpc "�����Q���E�E�B�O�i�[#ep16wig00";
		cloakoffnpc "�����Q���E�E�B�O�i�[#ep16wig";
		cutin "16jur_nor.bmp",255;
		mes "[�����B�G��]";
		mes "�Ȃ񂾁B�����s���Ă��܂��̂��B";
		next;
		mes "[�����B�G��]";
		mes "�c�c�ӂ��A";
		mes "�܂������Ќ𐫂������ɓ������B";
		mes "���ꂩ���p�҂Ƃ���";
		mes "�l�ɐڂ��邱�Ƃ������Ȃ邾�낤�ɁB";
		mes "�ǂ������q�̖�������������������B";
		next;
		mes "[�����B�G��]";
		mes "������낵�����";
		mes "�E�B�O�i�[�Ƃ̑��̎q�������ɂ�";
		mes "����ɂȂ��Ă��������B";
		mes "�����N��ł��|�����p�Y��";
		mes "�j���ɎQ������ƕ�����";
		mes "�݂Ȋy���݂ɂ��Ă���܂��B";
		next;
		mes "[�����B�G��]";
		mes "�ł́A�ǂ�������������";
		mes "�����났���������B";
		next;
		delquest 73054;
		//setquest 14475;
		//compquest 14475;
		setquest 73075;
		set EP16_4QUE,1;
		if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
			mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
			mes "�@�x���̂Ƃ���ɖ߂낤�]";
		} else {
			mes "�]^0000cd�E�B�O�i�[�ƂƂ̈��A���ς܂����B^000000";
			mes "�@���̉��Ƃɂ����A�ɍs�����]";
		}
		next;
		mes "�]���̎��A�����Q����";
		mes "�@�b�������Ă����]";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���A��蒆�A���炵�܂��B";
		mes "�������Ԃ������";
		mes "�����������b���܂���H";
		mes "�悯��Ύ��ɘb�������Ă��������ˁB";
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 1:
		mes "[�����B�G��]";
		mes "�`���җl�A�E�B�O�i�[�Ƃɂ悤�����B";
		next;
		mes "[�����B�G��]";
		mes "������낵�����";
		mes "�E�B�O�i�[�Ƃ̎q�������ɂ�";
		mes "����ɂȂ��Ă��������B";
		mes "�`���җl�̂��b�𕷂����";
		mes "������Ԃł��傤�B";
		close;
	case 2:
		mes "[�����B�G��]";
		mes "�q�������ɂ�";
		mes "����ɂȂ�܂������H";
		mes "������낵�����";
		mes "�e�B�[�^�C���ł��������ł����H";
		next;
		mes "[�����B�G��]";
		mes "�������v�w��";
		mes "�`���җl�̘b�𕷂��鎖��";
		mes "�ƂĂ��������̂ł��B";
		mes "�o���k�͂����Ŕ�������̂ł�";
		mes "����܂��񂩂�B";
		next;
		mes "[�J�^���i]";
		mes "���������B";
		mes "�q���B�Ɏ���͂���܂���ł������H";
		mes "�킪�܂܂������Ă��܂��Ă����̂�";
		mes "�ƂĂ��S�z�ł��B";
		next;
		mes "[�J�^���i]";
		mes "�ŋ߂͒��ӂ���悤�ɂ��Ă���̂ł���";
		mes "�����`���җl�Ɏ���Ȏ���";
		mes "�s�Ȃ����悤�ł����";
		mes "����ɂ��l�т������܂��B";
		next;
		menu "���v�ł�",-;
		mes "[�J�^���i]";
		mes "�����ł����H";
		mes "����Ȃ�ǂ��̂ł�����ǁc�c";
		mes "���������q���B�̂킪�܂܂�";
		mes "�����������C�����܂��B";
		next;
		mes "[�J�^���i]";
		mes "�O��̉��ʌp����c�ł�";
		mes "�����������Q������";
		mes "�p���N���܂������c�c";
		next;
		mes "[�����B�G��]";
		mes "���ʂɏA�������̂�";
		mes "����قǏd�v�ł͂Ȃ���B";
		mes "�����̂�����̂�";
		mes "�Ȃ�ׂ����ĉ��ɂȂ�B";
		mes "����Ȏ��Ń����Q����";
		mes "�X�g���X��^�������͂Ȃ��B";
		next;
		mes "[�J�^���i]";
		mes "���Ȃ��͗~���Ȃ������܂��B";
		mes "�E�B�O�i�[�Ƃ���";
		mes "�����y�o�����Ƃ�����";
		mes "�ǂ�ȂɌ��h�ł��傤�B";
		mes "�����Ƃ̒��ł���ہA";
		mes "�i��������Ƃ������̂ł���B";
		next;
		mes "[�����B�G��]";
		mes "�͂���I";
		mes "����Ȃ��̂����ʓ|�Ȃ������B";
		mes "����ɖY�ꂽ�̂��H";
		mes "�����b�����������������낤�B";
		next;
		mes "[�����B�G��]";
		mes "���Ƃ����ɂȂ����Ƃ����";
		mes "���v�𓾂悤�ƏW�܂�";
		mes "�n�G�������邾�����B";
		next;
		mes "[�����B�G��]";
		mes "����ɁA���ɂȂ邽�߂�";
		mes "�ǂꂾ���̍��Y���K�v���B";
		mes "�ȑO�A�E�B�O�i�[�Ƃ�";
		mes "�X����������������B";
		next;
		mes "[�J�^���i]";
		mes "����B";
		mes "���̔��΂ɂȂ�\����";
		mes "���邶��Ȃ��ł����B";
		mes "�E�B�O�i�[�Ƃ̗��ꂪ";
		mes "�m�ł�����̂ɂȂ�̂ł́H";
		next;
		mes "[�J�^���i]";
		mes "���̓����Q�����x����";
		mes "�J�g�����ƃA�C�U�b�N�����܂��B";
		next;
		mes "[�����B�G��]";
		mes "�ӂӂ��c�c�A�C�U�b�N���B";
		mes "�������ȁB";
		mes "����A�䂪�q�Ȃ��痊���������肾�B";
		next;
		menu "�A�C�U�b�N�l��M�����Ă����ł���",-;
		mes "[�����B�G��]";
		mes "�����A�`���җl�A�\���󂠂�܂���B";
		mes "�b������܂����B";
		next;
		menu "�������A���\���Ȃ�",-;
		mes "[�����B�G��]";
		mes "�b���o�����łł����A";
		mes "�A�C�U�b�N�͂ǂ��ł������B";
		mes "�䂪�q�B�̒���";
		mes "�����Ƃ��E�B�O�i�[�Ƃ炵���q�ł��B";
		next;
		mes "[�����B�G��]";
		mes "�����Q���̓��b�N�X�ɋ��������肷����";
		mes "���ʂ���Y�Ɋ֐S�������āc�c";
		mes "�������J�g�������j�ɐ��܂�Ă�����";
		mes "�S�Ă������p�����Ă�";
		mes "���S�������̂ł����c�c";
		next;
		mes "[�����B�G��]";
		mes "����Ȑ܁A�킪�܂܂������A�C�U�b�N��";
		mes "�E�B�O�i�[�Ƃɑ��������l���Ƃ���";
		mes "����Ă��ꂽ�̂ň���S���܂����B";
		next;
		mes "[�����B�G��]";
		mes "�����A������񑼂̎q���B��";
		mes "���������Ȃ��킯�ł͖����ł���B";
		next;
		menu "�Ӗ��͂킩��܂�",-;
		mes "[�J�^���i]";
		mes "�q���B�̑O�ł͂��̘b��";
		mes "���Ȃ��ł��������ˁB";
		mes "�I���ɔ�r�����̂�";
		mes "�C�����̗ǂ����̂ł�";
		mes "�Ȃ��ł��傤����c�c";
		next;
		mes "[�����B�G��]";
		mes "�����������B";
		mes "�E�B�O�i�[�Ƃ̐l�Ԃł����";
		mes "���Ȍ��t�������Ȃ���΂Ȃ�Ȃ��B";
		mes "���t�𔻒f����͎̂������g���B";
		mes "���Șb�𕷂�����";
		mes "�w�ׂ鎖������B";
		next;
		mes "[�J�^���i]";
		mes "�������A����ł��q���B�̑O��";
		mes "����Ȏ��͌���Ȃ��ł��������B";
		next;
		mes "[�����B�G��]";
		mes "�����q���B�̑O��";
		mes "����Ȏ����������������邩�H";
		next;
		mes "[�J�^���i]";
		mes "����́c�c";
		next;
		mes "[�J�^���i]";
		mes "�Ƃ���ōŋ߁A";
		mes "�A�C�U�b�N���ǂ����ŉ�����";
		mes "���Ă���悤�Ȃ�ł�����";
		mes "�����m�ł����H";
		next;
		mes "[�����B�G��]";
		mes "���x���u���O�Ƃ̎��j��";
		mes "���Ƃ��N�����Ă���炵���ȁB";
		mes "�܂��A�A�C�U�b�N�Ȃ�";
		mes "���v�ł��낤�B";
		next;
		mes "[�J�g����]";
		mes "�L���[�[!!";
		next;
		emotion 23,"�����B�G���E�E�B�O�i�[#ep16wig";
		mes "[�����B�G��]";
		mes "^0000cd�J�g����?!^000000";
		next;
		emotion 23,"�J�^���i�E�E�B�O�i�[#ep16wig";
		mes "[�J�^���i]";
		mes "^0000cd�J�g����!!^000000";
		mes "�������������������̂ł��傤�I";
		next;
		menu "����l�͂����ɁI�@�󋵂����Ă��܂�",-;
		mes "�]�J�g�����ɉ����������̂��낤��!?";
		mes "�@�l�q�����ɂ����Ă݂悤�]";
		cloakonnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		chgquest 14476,14477;
		set EP16_4QUE,3;
		close;
	case 3:
		mes "[�����B�G��]";
		mes "�J�g�����͑��v���낤���H";
		mes "��͂�s���Ă݂�ׂ����B";
		next;
		mes "�]�J�g�����ɉ����������̂��낤��!?";
		mes "�@�l�q�����ɂ����Ă݂悤�]";
		close;
	case 4:
		mes "[�����B�G��]";
		mes "�����A�`���җl�B�q���B��";
		mes "�����N���Ă���̂�";
		mes "�����Ă݂��̂ł����A";
		mes "�����Ă��炦�܂���ł����B";
		next;
		mes "[�J�^���i]";
		mes "���������m�Ȃ��ł��傤���c�c�H";
		next;
		menu "���͌����܂��񂪁A���S���Ă�������",-;
		mes "[�J�^���i]";
		mes "�����ł����B";
		mes "�q���B���ق��Ă���Ɓc�c";
		mes "�`���җl��";
		mes "�����m���Ă���悤�ł��ˁB";
		mes "�q�������̎��A";
		mes "������낵�����肢���܂��B";
		close;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�����B�G��]";
		mes "�q���B�̎��A";
		mes "�ǂ�����낵�����肢���܂��B";
		close;
	default:
		mes "[�����B�G��]";
		mes "�`���җl�A";
		mes "�q���B�ɑ�̘̂b�͕����܂����B";
		mes "���R�܂ł͕����܂���ł�����";
		mes "�`���җl�ɂ͏�����ꂽ�Ƃ�";
		mes "�\���Ă���܂����B";
		next;
		mes "[�J�^���i]";
		mes "�ǂ����ȑO���";
		mes "�����ǂ��Ȃ����悤�ł��B";
		mes "������񍡂܂ł��ǂ������ł����A";
		mes "�����Ɨǂ��Ȃ�܂����B";
		mes "���΂܂������Ƃł��B";
		next;
		mes "[�����B�G��]";
		mes "�`���җl��";
		mes "��X�ɍK�^�������炷���̂悤�ł��B";
		mes "���ꂩ����E�B�O�i�[�Ƃ�";
		mes "���i�����t���������������܂��B";
		next;
		mes "[�J�^���i]";
		mes "�j�����I������為��";
		mes "�E�B�O�i�[�Ƃɂ��z�����������B";
		mes "�`���җl�̖K���";
		mes "���҂����Ă���܂��B";
		close;
	}
}

prt_cas_q.gat,82,23,0	script	�J�^���i�E�E�B�O�i�[#ep16wig	71,{
	switch(EP16_4QUE) {
	case 0:
		mes "[�J�^���i]";
		mes "�悤�����A�`���җl�B";
		mes "���}�������܂��B";
		next;
		mes "[�J�^���i]";
		mes "�K�v�Ȃ��̂������";
		mes "���ł�����������Ă��������B";
		mes "�E�B�O�i�[�Ƃ̎҂Ƃ���";
		mes "�őP��s�������Ă��������܂��B";
		next;
		mes "[�J�^���i]";
		mes "�Ɩ�Ɋւ���b��";
		mes "�E�B�O�i�[�Ƃ̎�ł���";
		mes "�����B�G���E�E�B�O�i�[��";
		mes "���b�Ȃ����Ă��������B";
		close;
	case 1:
	case 2:
		mes "[�J�^���i]";
		mes "�q���B�ɂ͂�����������܂������H";
		mes "�`���җl�Ƃ̉�b��";
		mes "�M�d�Ȍo���ɂȂ�ł��傤�B";
		mes "�����A�傫�ȍ����";
		mes "�Ԃ��������Ƃ��Ȃ�";
		mes "�q�������Ȃ̂Ōo��������܂���B";
		next;
		mes "[�J�^���i]";
		mes "�����p�Y�̉Ɩ�ɉł��ňȗ��A";
		mes "�ƕ��ɂӂ��킵���q��������";
		mes "��ďグ�����ł������c�c";
		next;
		mes "[�J�^���i]";
		mes "�v�����_�⌠�͂ɗ~�������l�ł��āB";
		mes "���Ƃ��Ă͏����S�c��ł��B";
		next;
		mes "[�J�^���i]";
		mes "�����A�q���������]�ނ��̂�";
		mes "�ł�����芐�������Ǝv���Ă��܂��B";
		mes "���̂����ŏ�����Ɍ����鏊��������";
		mes "�S�z�ɂȂ邱�Ƃ������̂ł����c�c";
		next;
		mes "[�J�^���i]";
		mes "�ł��̂ŁA���Ж`���җl��";
		mes "�b�𕷂������ł��B";
		mes "�����̌o����ς񂾕���";
		mes "�b�𕷂��̂��傫�Ȋy���݂ł��B";
		close;
	case 3:
		mes "[�J�^���i]";
		mes "�J�g�����ɉ����������̂ł��傤��!?";
		mes "�������Ă͂���܂���B";
		mes "��͂�s���Ă݂�ׂ�������B";
		next;
		menu "�����ő҂��Ă��Ă�������",-;
		mes "[�J�^���i]";
		mes "�����c�c";
		mes "�������Ȃ���Ηǂ��̂ł����B";
		close;
	case 4:
		mes "[�����B�G��]";
		mes "�����A�`���җl�B";
		mes "�q���B�ɉ����N���Ă���̂�";
		mes "�����Ă݂��̂ł����A";
		mes "�����ĖႦ�܂���ł����B";
		next;
		mes "[�J�^���i]";
		mes "���������m�Ȃ��ł��傤���c�c�H";
		next;
		menu "���͌����܂��񂪁A���S���Ă�������",-;
		mes "[�J�^���i]";
		mes "�����ł����B";
		mes "�q���B���ق��Ă���Ɓc�c";
		mes "�`���җl��";
		mes "�����m���Ă���悤�ł��ˁB";
		mes "�q���B�̎��A";
		mes "������낵�����肢���܂��B";
		close;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�J�^���i]";
		mes "�q���B�̎��A";
		mes "������낵�����肢���܂��B";
		close;
	default:
		mes "[�J�^���i]";
		mes "�q���B�̒����ȑO����";
		mes "�悭�Ȃ����悤�Ɍ����܂��B";
		mes "�`���җl�̂������ł��B";
		next;
		mes "[�J�^���i]";
		mes "�`���җl�͉�X��";
		mes "�K�^�������炷���̂悤�ł��B";
		mes "���ꂩ����E�B�O�i�[�Ƃ�";
		mes "���i�����t���������������܂��B";
		close;
	}
}

prt_cas_q.gat,80,23,5	script(CLOAKED)	�����Q���E�E�B�O�i�[#ep16wig00	989,{}

prt_cas_q.gat,95,9,5	script	�����Q���E�E�B�O�i�[#ep16wig	989,{
	switch(EP16_4QUE) {
	case 0:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���ɉ�ɗ���";
		mes "�񑩂͂���܂������H";
		mes "����ł͊O�ł��҂����������B";
		mes "��ɗ��������珇�Ԃ�";
		mes "����ɂȂ��Ă���܂��̂ŁB";
		mes "���͒N�ɂł������Ȃ̂ł���B";
		next;
		mes "[�����Q��]";
		mes "�������̗��e��";
		mes "����ɂȂ�񑩂ł�����";
		mes "������ɂ���܂��B";
		mes "�Ƃ���Ŕ��̊O�ɂ͑҂��Ă���l��";
		mes "�ǂ�قǂ��鎖�ł��傤�B";
		next;
		mes "[�����Q��]";
		mes "�������������Ő��E�̕��a�����܂��B";
		mes "�����A�������͐��`�I";
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 1:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�A�悩�����B";
		mes "���Ԃ�����悤�ł��ˁB";
		mes "��قǂ͎��炵�܂����B";
		next;
		mes "[�����Q��]";
		mes "�l�I�ɂ͂�������";
		mes "���b�������������̂ł���";
		mes "��l�͏����ł���@���ԈႦ���";
		mes "�����ɓ{��̂ł�����Ɓc�c";
		next;
		mes "[�����Q��]";
		mes "�܂��A�l�O�œ{��Ƃ͎v���܂��񂪁A";
		mes "����ł��ʓ|���͔������������̂ŁB";
		mes "�{���Ɏ��炵�܂����B";
		next;
		mes "[�����Q��]";
		mes "�`���җl�A�b�͕ς��܂���";
		mes "���̉Ƒ����Љ�����܂��B";
		mes "������̗D��ȃ��f�B�[��";
		mes "���̎o�A^0000cd�J�g�����E�E�B�O�i�[^000000�ł��B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����������͎o�A�ł͂Ȃ�";
		mes "�E�B�O�i�[�Ƃ̒����ƏЉ�����";
		mes "��V�ɂ��Ȃ��̂�B";
		next;
		mes "[�J�g����]";
		mes "�`���җl�A�����ɂ��ڂɂ�����܂��B";
		mes "�E�B�O�i�[�Ƃւ悤�����B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����Ă�����͎��̒�A";
		mes "^0000cd�A�C�U�b�N�E�E�B�O�i�[^000000�ł��B";
		next;
		mes "[�����Q��]";
		mes "�E�B�O�i�[�Ƃ̎��j�ł��B";
		mes "�ƋƂɊ֐S���Ȃ�����o�ƈႢ";
		mes "������ۂ��ǂ��̂�";
		mes "������̓E�B�O�i�[�Ƃ�";
		mes "���W������l���ɂȂ�ł��傤�B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "����͂ǂ����B";
		mes "�A�C�U�b�N�E�E�B�O�i�[�Ɛ\���܂��B";
		mes "���̂܂�Ȃ��Ɩ�ɂ܂�";
		mes "�����J�����������h�ł��B";
		mes "�ǂ������y���݂��������܂��悤�B";
		next;
		cutin "16kat_ang.bmp",2;
		mes "[�J�g����]";
		mes "�A�C�U�b�N�I";
		mes "���̂悤�Ȍ��t������";
		mes "�T����悤�ɒ��ӂ����͂���B";
		mes "���Ȃ����Љ�������Q���ɂ������B";
		mes "�E�B�O�i�[�Ƃ̖��ɓD��h�����H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "��k�ł���A";
		mes "�W���E�E�E�_�E���B";
		mes "�o����͖{���Ɍ��ꂵ���ȁB";
		mes "�`���җl�ɂ��������K�v�ł��傤�H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���q�l�Ɏ���ɂȂ錾�t��";
		mes "��k�ł͂Ȃ��̂�B";
		mes "����͕��J�ƌ����́B";
		mes "�`���җl�A��̖���A";
		mes "�ǂ��������������������B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�ǂ��ł��������ǁc�c";
		mes "���͉ƂɋA�肽���ˁB";
		mes "�����͋������������B";
		mes "���߂ďj����ɂł��o���������B";
		next;
		mes "[�����Q��]";
		mes "�����A���ɉ�������Ă���l��";
		mes "�ǂ�Ȃɑ������Ƃ��I";
		mes "���͂��̔��������";
		mes "�݂Ȃɔ�I����`��������񂾁I";
		next;
		mes "[�����Q��]";
		mes "���̌��ꂵ�����Â����{��";
		mes "��؂̌��������炷�悤�ɂˁI";
		mes "�l�X�Ɋy���݂�^����K�v������񂾁B";
		next;
		cutin "16kat_ang.bmp",2;
		mes "[�J�g����]";
		mes "����͉��ʌp���ɑ΂��镎�J��B";
		mes "�őP��s�����ėՂ݂Ȃ����B";
		mes "���Ȃ����v���Ă���ق�";
		mes "�y�X�������̂ł͂���܂���B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���Ȃ��͎��匚�����ƂƂƂ���";
		mes "�����𓱂����ʌp���҂̈�l�ł���";
		mes "���o��Y��Ă͂Ȃ�Ȃ��́B";
		next;
		mes "[�J�g����]";
		mes "�����q���ł͂����Ȃ��́B";
		mes "���̐ӔC�Ƌ`���̏d����";
		mes "�y�񂶂Ȃ��悤�������͂���B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�������I";
		mes "�悭�����Ă��邳�B";
		mes "�����獡�������̑O�ŕ����𐳂��A";
		mes "�w�A�X�^�C���������ɂ����̂��B";
		mes "���̐S�̒��ْ̋��̎���";
		mes "�؂�Ȃ��悤�ɂˁB";
		next;
		mes "[�����Q��]";
		mes "�����������ɂ��邱�Ƃ�";
		mes "��ǂ�����ڂ�";
		mes "�{����񂶂�Ȃ����ȁB";
		mes "�����Ď��͊����ɏ������ł��Ă���B";
		next;
		mes "[�����Q��]";
		mes "�ق�A�����̐V�����}���g��";
		mes "���̓��̐F�ɂ悭�������B";
		mes "�����Ɖ��{�̕��͋C��";
		mes "���邭���Ă���邳�B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�c�c�܂��͂��܂����B";
		mes "���낻�남�ɂ����Ă��炤��B";
		mes "�`���җl�A����ł͂܂��B";
		next;
		cloakonnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c�`���җl�A";
		mes "������낵�����";
		mes "^0000cd�������̗��e�ƃe�B�[�^�C��^000000�ł�";
		mes "�������ł����H";
		next;
		mes "[�J�g����]";
		mes "����l�Ƃ��`���җl�̘b�𕷂��̂�";
		mes "�ƂĂ��y���݂ɂ���Ă���܂����B";
		chgquest 73075,14476;
		set EP16_4QUE,2;
		close2;
		cutin "16kat_nor.bmp",255;
		end;
	case 2:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "^0000cd���ƕ�^000000�͂�����ɂ���܂��B";
		mes "�`���җl�̂��b��S�҂��ɂ��Ă��܂��B";
		mes "�Ƃ���Ŕ��̊O�Ɏ���҂��Ă���l��";
		mes "�ǂꂭ�炢���܂����H";
		next;
		mes "[�����Q��]";
		mes "�����A���Ԃɉ�̂�";
		mes "�҂����Ă��܂��Ă��܂��B";
		mes "�������Ő��E�̕��a�����̂�";
		mes "�h���ł��ˁB";
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 3:
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���o���񂪂Ȃɂ����Ȃ������悤�ł����A";
		mes "�Ђǂ��Q�ĂĂ��āA";
		mes "�ڂ������Ƃ��킩��Ȃ��̂ł��B";
		mes "�`���җl�ɂȂ痎��������";
		mes "�b���̂ł͂Ȃ��ł��傤���B";
		close2;
		cutin "16jur_sim.bmp",255;
		end;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���o���񂪖����������̂�";
		mes "��̉��Ȃ̂���";
		mes "�킩��܂���B";
		next;
		mes "[�����Q��]";
		mes "�����D���Ȑl�X�ɐ���������";
		mes "�T���Ă��炦�΁A";
		mes "���[���I";
		mes "�Ƃ����ԂɌ�����ł��傤�B";
		mes "�������A����ł͕���";
		mes "�ق��Ă��Ȃ����R������̂ł��B";
		next;
		mes "[�����Q��]";
		mes "�d������܂���A";
		mes "�`���җl�ɂ��C������̂�";
		mes "�őP���Ǝv���܂��B";
		mes "�`���җl�̎�ɂ������Ă܂���I";
		close2;
		cutin "16jur_sim.bmp",255;
		end;
	case 11:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�A�ǂ��ł������H";
		mes "�������ʂ́H";
		next;
		menu "���܂ł̂��Ƃ�񍐂���",-;
		mes "[�����Q��]";
		mes "�Ȃ�قǁc�c";
		mes "���������Ă������l��";
		mes "�m�F�ł��Ă��܂��񂩁B";
		mes "���͂��̂܂ɂ������Ă����A";
		mes "�Ƃ������ƂɂȂ�܂��ˁB";
		next;
		menu "���̓J�g�����ɑ΂��ĕΌ�������l������",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "����͈�́H";
		next;
		menu "�J�g�����̎��쎩�����^���Ă��܂�",-;
		mes "[�����Q��]";
		mes "�c�c�I";
		mes "�͂��A���i����R�~���j�P�[�V������";
		mes "�����ƂƂ����ق���������";
		mes "�����Ă����̂ł����c�c";
		mes "�ӂ��Ă����悤�ł��ˁB";
		next;
		cutin "16kat_nor.bmp",2;
		cloakoffnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		mes "[�J�g����]";
		mes "�Ȃ�����m��Ȃ��l�ւ�";
		mes "�]���̂��߂ɂ���Ȏ���";
		mes "����K�v������̂�����H";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�o����!?";
		mes "��̂�����H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����قǂˁB";
		mes "�ł����Ȃ����b�������e��";
		mes "�������炢�O����B";
		mes "�ŁA�l�X����̈����]����";
		mes "���̂������ƁH";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "������x�͂���̂ł́H";
		mes "�ق�A�������Ă�B";
		mes "���͂��ł��ǂ�Ȑl�ɂł�";
		mes "�őP��s�����Đڂ��Ă��邩��";
		mes "�݂�Ȏ����D���Ȃ񂾁B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c�l�X�����Ȃ��ɍD�������̂�";
		mes "���Ȃ��̑ԓx�̂���������";
		mes "�{�C�Ŏv���Ă�́H";
		mes "���ꂽ�c�c�B";
		next;
		mes "[�J�g����]";
		mes "�{���ɕ��ꂽ�c�c�B";
		next;
		mes "[�J�g����]";
		mes "�ȑO�̉��ʌp���̌���";
		mes "���Ȃ��̑ԓx�����ɂȂ���";
		mes "�Ɩ�ɂǂꂾ�����f���������̂�";
		mes "�����Y�ꂽ�̂ˁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���̃R�~���j�P�[�V������";
		mes "��肪����Ƃł��H";
		mes "���ꂶ���̂ǂ�����";
		mes "�����D�����̂��H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c����Ȏ�������Ȃ��̂ˁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�܂������̃��b�N�X�̂���������";
		mes "���������̂����H";
		next;
		cutin "16kat_ang.bmp",2;
		mes "[�J�g����]";
		mes "������B";
		mes "�c�������牽�����Ȃ��Ă��c�c";
		mes "�������A�����N�����Ă�";
		mes "���͂̐l�X�͂��Ȃ��ɑ΂���";
		mes "���ɗD���������B";
		next;
		mes "[�J�g����]";
		mes "�݂�ȏ΂��Ă����B";
		mes "�݂�ȃE�B�O�i�[�Ƃ̌�p�ҁA";
		mes "�������ʌ��̂��Ȃ���";
		mes "�C�ɓ����邽�߂ɁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���ꂪ�O���̂��������ƁH";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "����͂��Ȃ����ے�ł��Ȃ��ł���B";
		mes "�O�������č˔\�̈ꕔ������B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�Ⴆ���b�N�X�̂��������Ƃ��Ă�";
		mes "�����]��ł����Ȃ����킯�ł�";
		mes "�Ȃ����낤�H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���������b�N�X�̒��";
		mes "�ق��Ă��Ă���r����A";
		mes "���ȏL���\�b�����̂�";
		mes "�����]��ł���Ƃł��H";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�����炨�o�����";
		mes "�����������̐l�Ƙb���c�c";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�l���������󂯂Ȃ�";
		mes "��ԗǂ����@�́u���فv�Ȃ́B";
		mes "���t�ɂ��Ȃ���Ύ��s�����Ȃ���B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�K�����������Ƃ͌����Ȃ���B";
		mes "�Ⴆ�΍����������b�����ǁA";
		mes "���o���񂪒��ق������ʁc�c";
		next;
		cutin "16kat_ang.bmp",2;
		mes "[�J�g����]";
		mes "���͂����x�X�g��s�����Ă���!!";
		mes "�m���Ă�H";
		mes "�e�͌������邩�琶�܂��́B";
		mes "�������Ċ撣���Ă�́I";
		next;
		mes "[�J�g����]";
		mes "�ł����ǐl�͏�ӂ������Ȃ��I";
		mes "���͉����ǂ�����΂����́H";
		next;
		menu "����l�Ƃ��A���������Ă�������",-;
		cloakoffnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "��l�Ƃ����߂����I";
		mes "�����N���Ă�̂���";
		mes "�m����������Ȃ�����";
		mes "���������Ȃ�B";
		mes "��l�̐����L���̒[�܂�";
		mes "�����Ă邺�H";
		next;
		mes "[�A�C�U�b�N]";
		mes "���̂܂܂���A�Ƃ̃C���[�W��";
		mes "�����Ȃ����Ⴄ��B";
		next;
		mes "[�A�C�U�b�N]";
		mes "���̑O�Z���񂪒n�̒�܂�";
		mes "���Ƃ��Ă��ꂽ�]����";
		mes "����Ə����񕜂ł����Ƃ���Ȃ񂾁B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�Ƃ����^0000cd���̔��͎o�����^000000����ˁH";
		mes "�l�̏o���肪�����Ƃ���ɂ���������";
		mes "�Ƃ肠���������Ă������ǁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "����A^0000cd���O�������Ă����̂�^0000cd�H";
		next;
		cutin "16kat_ang.bmp",2;
		mes "[�J�g����]";
		mes "�����o�����Ȃ炿���Ƙb���Ȃ�����B";
		mes "�A�C�U�b�N�I";
		mes "���Ȃ��̂����łǂ�Ȃ�";
		mes "�����Ă����Ǝv���Ă���́H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�������c�c";
		mes "�o����̂��߂Ǝv����";
		mes "�a�����Ă��������Ȃ̂Ɂc�c";
		next;
		mes "[�A�C�U�b�N]";
		mes "�ǂ�Ȃɏ����ȕ��ł�";
		mes "�Ƃŕ��������Ȃ�΁c�c";
		mes "�킩���ˁA";
		mes "�������Ƃ�������邩�B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�u���Ƃ�������ł�";
		mes "�܂Ƃ��ɊǗ��ł��Ȃ��҂�";
		mes "�E�B�O�i�[�ƂɕK�v�Ȃ��B";
		mes "�Ǘ��\�͂����ő�̔����ł���v";
		mes "�ł��傤�B";
		next;
		emotion 3,"�����Q���E�E�B�O�i�[#ep16wig";
		mes "[�A�C�U�b�N]";
		mes "�����c�c������������";
		mes "�����ɂ��Ȃ�B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�ŁA���̒��ɂ͂�������";
		mes "���������Ă�́H";
		mes "����ȑ����܂ŋN�����āB";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���̒��ɋ��K�I�ȉ��l��";
		mes "���悤�ȕ��͖�����B";
		mes "�ł��c�c���ɂƂ��Ă�";
		mes "��΂������l�����镨��B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "����́c�c";
		mes "�m�[�g�c�c�H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "���L�H";
		next;
		emotion 3,"�����Q���E�E�B�O�i�[#ep16wig";
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���t�͐T�ނقǗǂ��́B";
		mes "���ڂꂽ���͌��ɖ߂��Ȃ��̂Ɠ����B";
		mes "�ł��N�ɂ�����";
		mes "�����ɂȂ肽���u�Ԃ͂���B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����u���v�ɂȂ��u�ԁB";
		mes "���ꂪ���̓��L���������B";
		next;
		mes "[�J�g����]";
		mes "���قł��l�X�̌�������܂��Ȃ�";
		mes "���t��T�ނ̂��K������";
		mes "�ǂ����ł͂Ȃ������Ƃ������ˁB";
		mes "���͓��L��������������";
		mes "�������炷���B";
		mes "�`���җl�A����ł͎��炢�����܂��B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���o����A���́c�c";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���������́B";
		mes "�C�ɂ��Ȃ��ŁB";
		next;
		cloakonnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�b���܂����������Ȃ��񂾂��ǁB";
		mes "�����������́H";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���O������ɂ��̔���";
		mes "�����o��������c�c";
		mes "�͂��c�c�Ƃɂ����A";
		mes "�ȒP�Ɍ����Ƃ��o����{���Ă�B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�Ȃ�Ŏo���񂪓{��̂��B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�b���ƒ����Ȃ�񂾂��ǁA";
		mes "���o����Ɋւ��鈫���\��";
		mes "�o����Ă���炵���񂾁B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "���̉\�Ȃ畷�������Ƃ���B";
		mes "�ł�������ČZ����";
		mes "�����ɂȂ��Ă��邩��A";
		mes "���̂����Z����";
		mes "�Ȃ�Ƃ����邾�낤��";
		mes "�v���Ă����ǁc�c�H";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�m���Ă����̂��H";
		mes "�Ȃ�Řb���Ă���Ȃ������H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�b�����Ƃ���ŕ��������Ă����낤�H";
		mes "�V�Ɏ������������������Z�����";
		mes "�ǂ��������ł��Ȃ���B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�������Ŏ���̂���ق��";
		mes "������O���������낤�B";
		mes "���e�������������킯�ł͂Ȃ����ˁB";
		mes "�������C�ǂ߂Ȃ��񂾂�B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���O�c�c";
		mes "����{�点�����̂��H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�܂����I";
		mes "���ܘb���Ă���̂͑S�Ď�������B";
		mes "�l�I�Ȋ���Ȃ�ĂȂ�����";
		mes "�Ō�܂ŕ����ė~�����񂾁B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�Z����͉���Ȃ����낤���ǁA";
		mes "���̊O���̂�������";
		mes "�m��Ȃ������Ɏ��Ǝo�����";
		mes "���\�Ȕ�Q�ɂ������񂾁B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�������o���񂪘b���Ă�";
		mes "�e�͌������邩��";
		mes "���܂����Ă��Ƃ���B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�悭����Ȃ��ȁB";
		mes "�������O�������́A";
		mes "��Q��^����񂾁H";
		mes "�݂�Ȕ��������͍D�����낤�H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "����l�́A�ˁB";
		mes "�ł����ׂ̗ɂ���";
		mes "��ɔ�r�����l�ɂƂ��Ă͈Ⴄ�̂��B";
		mes "���Ɏo����͂��̂Ƃ΂������";
		mes "�󂯂Ă������B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�V�g�̂悤�Ȕ����������l�ׂ̗�";
		mes "�}�l�������Ă���ƍl���Ă݂Ă�B";
		mes "�܂����������ĕ��ʂȂ̂�";
		mes "��r�����񂾁B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�����āA�ׂɂ���l����";
		mes "��������Δ������ق�";
		mes "�}�l�͏X�������Ă��܂��B";
		mes "���ꂪ���܂ł̎������Ȃ񂾁B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�o���񂪎󂯂��X�g���X��";
		mes "���ɂЂǂ������낤�ˁB";
		mes "�ǂꂾ���䖝���A�����݂̐S��";
		mes "�Z����ɐڂ��Ă������B";
		mes "�{���̓V�g�͎o����̕�����B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "����ȁc�c���̂悤�ȁc�c";
		mes "���͂����c�c";
		next;
		mes "[�����Q��]";
		mes "�ǂ�����΂����񂾁c�c";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�����H";
		mes "���͂̋�C�ɋC�Â��Ȃ�";
		mes "�Z����ɂ������͂��邯�ǁA";
		mes "���͂ƌ����΂��������O����^����";
		mes "�V�������񂶂�Ȃ����ȁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "�Ƃɂ����A���ܐS�z�Ȃ͎̂o���񂾂�B";
		mes "���܂Ŏo���񂪓{�����̌������Ƃ���H";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�c�c��x�����{�������Ƃ�����B";
		mes "�c�����낾���ǁB";
		mes "�悭�悭�l���Ă݂���";
		mes "���Ə󋵂����Ă����悤�ȁc�c";
		mes "��r�c�c�Ȃ�Č����Ă������B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "���͂����Ə�������������";
		mes "�L�����B�������ǁA";
		mes "�Z����Ǝo���񂪌����������ォ��";
		mes "�b�����Ȃ��Ȃ����̂�";
		mes "�Ȃ�ƂȂ��o���Ă��B";
		mes "����ς�Z���񂪌�������Ȃ����B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���͒N�������̂���";
		mes "�_���Ă���ꍇ�ł͂Ȃ����낤�B";
		mes "�ǂ����܂��傤���A�`���җl�H";
		next;
		menu "�{�����l���Ȃ��߂��o���͖�����ł����H",-;
		mes "[�����Q��]";
		mes "�͂��B���ɓ{��l�Ȃ��";
		mes "���̐��ł����炭";
		mes "���o�����l�����ł�����B";
		next;
		mes "[�����Q��]";
		mes "�`���җl�A�Ƃɂ�����������";
		mes "�����Ă��������B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "���͔������B";
		mes "�ʂɎ����o�����";
		mes "�{�点���킯����Ȃ����B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�҂Ă�A";
		mes "�����͎o����̓��L����";
		mes "����Ɏ����o�������O���낤�B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "����A���͂�����������";
		mes "�����Ȃ�Ȃ��悤�Ɂc�c";
		mes "�`���җl�A�����āI";
		next;
		menu "�v���[���g�Ƃ��ǂ��H",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���o���񂪍D���ȕ��c�c";
		mes "�A�C�U�b�N�͒m���Ă邩�H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�������ǁA";
		mes "���͌Z����Ɠ�����񂵂�";
		mes "�������킹�Ă��Ȃ��񂾁B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�܂�A�����m��Ȃ����Ď����B";
		next;
		menu "��؂Ȏv���o�����镨�Ƃ��Ȃ��H",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "����Ȃ��́c�c���H";
		mes "���邠��I";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�ցH";
		mes "����Ȃ̂����������H";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�܂�����������";
		mes "�Ƒ��ŃR���h�r�[�`��";
		mes "�K�ꂽ���Ƃ��������B";
		mes "���̎��̊C�݂Ɠ��A��";
		mes "�Y��Ȑ΂��E�����o��������B";
		next;
		mes "[�����Q��]";
		mes "�o���񂪍D���������A";
		mes "�����Ȑ΂̒��ɊC���ƃT���S��";
		mes "�����Ă���悤�ȁc�c";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�u�C�ܐ΁v�H";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����I�@���ꂾ�I";
		mes "���ӂɒ݂邵�đ��z�̌������߂��̂�";
		mes "�����ƌ��Ă���ȁB";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�����A�v���o�����B";
		mes "�o����̕����ɂ�����";
		mes "�����Y��Ȑ΁I";
		mes "����͊C�ܐ΂������̂��B";
		next;
		menu "�C�ܐ΂��ĉ��ł����H",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�R���h�̓��Y�i���������̂ł��B";
		mes "�C���̂悤�ɓ����Ȍ����̒���";
		mes "�T���S�⍻�������Ă��܂��B";
		mes "�l�����������܂Ƃ�";
		mes "�Ă΂�Ă܂��ˁB";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "���}���`�X�g�Ȑl��";
		mes "�l���̗܂�l���̑��蕨�Ƃ�";
		mes "�Ăт܂����B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�R���h�r�[�`�̉��n��";
		mes "����������Ό������ł��B";
		mes "�݂�ȂŃ��C���C�����Ȃ���";
		mes "�T����������̂ł��B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�ŋ߂̓R���h�r�[�`�ł�";
		mes "���Ȃ��炵����B";
		mes "���R�͂킩��Ȃ�����";
		mes "^0000cd�R���h�_���W���� 01�i�����A�J���j";
		mes "^0000cd�ɂ��郁�f���[�T^000000����";
		mes "����o����悤�ɂȂ��������ȁB";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�́H";
		mes "�Ȃ�Ń����X�^�[������Ȃ��̂�";
		mes "�����Ă���񂾁H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�ڂ����͒m��Ȃ���B";
		mes "�l���̑��蕨�Ƃ������炢������";
		mes "�����l���v���[���g�ł�";
		mes "�����񂶂�Ȃ��́H";
		mes "�q���̍D�������Șb���B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�������ɔ����l��";
		mes "�������Ă��Ȃ��͂������c�c";
		mes "������A���ł���Ȃ��Ƃ�";
		mes "�m���Ă�񂾁H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "����A���͊C�ܐ΂Ɋւ���";
		mes "���Ƃ��v�悵�Ă����񂾁B";
		mes "�O�͂����ɍ̎�ł��Ă�����";
		mes "�ό��q��C�ɋF��������l��";
		mes "���܂ɒT���Ă����炢�����ˁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "�Ƃ��낪���̊Ԃɂ�";
		mes "�̂�Ȃ��Ȃ��āA";
		mes "�Ԏ��K���Ȃ�ł�߂��񂾁B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�m��Ȃ������c�c";
		mes "���[��A���Ƃ͐΂ɏ���ꂽ�Ԃ�";
		mes "�Ȃɂ��������悤�ȁc�c";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�������ˁB";
		mes "�m���ɉԂ������Ă����B";
		mes "�����������Ԍ͂�Ȃ�������ˁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�A�͂�Ȃ��Ԃ�";
		mes "�Ȃɂ��S�����肪�H";
		next;
		menu "������Ȃ��o�����Ǝv��",-;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "����Ȃ��̂�����̂ł����H";
		mes "�͂�Ă��܂��O�ɂ܂��V�����Ԃ�";
		mes "����΂����̂ł́H";
		next;
		menu "�������̂��؂ɂ������񂾂Ǝv��",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�Ȃ�قǁA�������́B";
		mes "�D���Ȃ��̂������������Ƃ�";
		mes "�]��ł���̂��B";
		mes "�͂�Ă��܂��Ď��ւ����Ԃ�";
		mes "�����u�D���������ԁv�ł͂Ȃ��A�ƁB";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�m���Ɂc�c";
		mes "�������łȂ��N���ɂȂ�Ȃ��";
		mes "�z�����邾���Ŋ��C������B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�ŁA�����Ă��Ă��炦�܂���ˁH";
		next;
		menu "���H",-;
		mes "[�A�C�U�b�N]";
		mes "�܂����A�������ɏW�߂���Ƃł�";
		mes "�v���Ă����łł���?!";
		next;
		mes "[�A�C�U�b�N]";
		mes "���͎��Ƃ̏���������܂����A";
		mes "�Z����͊O�ɏo�邾����";
		mes "�g���������Ȃ��ق�";
		mes "�l���W�܂��Ă��܂��̂Ŗ����ł��B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�����č��̏󋵂�m��l�ł���A";
		mes "�M������l�́c�c";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���肢���܂��B";
		mes "�E�B�O�i�[�Ƃ̕��a��";
		mes "���Ȃ��̎�ɂ������Ă��܂��I";
		next;
		menu "�킩��܂����c�c",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����ł��ˁB";
		mes "^0000cd������Ȃ��o����1��^000000�����";
		mes "���v�����ł��B";
		mes "^0000cd�C�ܐ΂�1��^000000���肢���܂��B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "��낵�����肢���܂��B";
		delquest 14486;
		setquest 14487;
		set EP16_4QUE,12;
		next;
		cutin "16jur_nor.bmp",255;
		mes "�]^0000cd���̃N�G�X�g��i�s���̂�";
		mes "�@^0000cd���f���[�T�𓢔������";
		mes "�@^0000cd�C�ܐ΂����ł��܂�^000000�]";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�C�ܐ΂���肵�ɍs���Ȃ�";
		mes "��낵����΁A�g���̎҂������܂��B";
		mes "�g���̎҂ɃR���h�܂�";
		mes "�ē������܂���B";
		next;
		mes "[�����Q��]";
		mes "������Ȃ��o����";
		mes "�ǂ��œ���ł��邩������Ȃ��̂�";
		mes "�`���җl����̑���";
		mes "��ɓ���Ă��Ă��������B";
		next;
		if(select("���͂ł����܂�","���肢���܂�") == 1) {
			mes "[�����Q��]";
			mes "���͂Ƃ͂������ł��ˁB";
			mes "����ł͂�낵�����肢���܂��B";
			close2;
			cutin "16jur_nor.bmp",255;
			end;
		}
		mes "[�����Q��]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��傤�B";
		close2;
		warp "comodo.gat",34,215;
		end;
	case 12:
		cutin "16jur_sim.bmp",0;
		if(countitem(6927) < 1 || countitem(748) < 1) {
			mes "[�����Q��]";
			mes "�`���җl�A���肢���Ă�������";
			mes "�����܂������H";
			next;
			mes "[�����Q��]";
			mes "���A���������ĉ������肢���Ă�����";
			mes "���Y��ł����H";
			next;
			mes "[�����Q��]";
			mes "^0000cd�C�ܐ΂�1��^000000�B";
			mes "����̓R���h���̓��A�ɂ���";
			mes "���f���[�T��|����";
			mes "��ɓ���邱�Ƃ��o����悤�ł��B";
			next;
			cutin "16jur_nor.bmp",255;
			mes "�]^0000cd���̃N�G�X�g��i�s���̂�";
			mes "�@^0000cd���f���[�T�𓢔������";
			mes "�@^0000cd�C�ܐ΂����ł��܂�^000000�]";
			next;
			cutin "16jur_nor.bmp",0;
			mes "[�����Q��]";
			mes "������^0000cd������Ȃ��o��1��^000000�ł��B";
			next;
			mes "[�����Q��]";
			mes "����Ȏd�������m��܂���";
			mes "���o����𗎂��������邽�߂�";
			mes "�ǂ������肢���܂��B";
			next;
			mes "[�����Q��]";
			mes "�C�ܐ΂���肵�ɍs���Ȃ�";
			mes "��낵����΁A�g���̎҂������܂��B";
			mes "�g���̎҂ɃR���h�܂�";
			mes "�ē������܂���B";
			next;
			mes "[�����Q��]";
			mes "������Ȃ��o����";
			mes "�ǂ��œ���ł��邩������Ȃ��̂�";
			mes "�`���җl����̑���";
			mes "��ɓ���Ă��Ă��������B";
			next;
			if(select("���͂ł����܂�","���肢���܂�") == 1) {
				mes "[�����Q��]";
				mes "���͂Ƃ͂������ł��ˁB";
				mes "����ł͂�낵�����肢���܂��B";
				close2;
				cutin "16jur_nor.bmp",255;
				end;
			}
			mes "[�����Q��]";
			mes "�킩��܂����B";
			mes "����ł͂����肵�܂��傤�B";
			close2;
			warp "comodo.gat",34,215;
			end;
		}
		mes "[�����Q��]";
		mes "�`���җl�A���肢���Ă������̂�";
		mes "�S�ďW�܂�܂������H";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "���낻��䖝�̌��E�ł��c�c";
		mes "�ŋ߁A�o���񂪋��Ȃ����ł�";
		mes "�������ɗ��₩�ȕ��͋C��";
		mes "�Y���Ă���悤�Łc�c�B";
		misceffect 89,"�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		next;
		menu "�ǂ���",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����I";
		mes "�{���ɑS���W�܂����̂ł��ˁI";
		mes "���Ȃ��͖��̉��l�ł��I";
		mes "����ł͂��o������Ă΂Ȃ��Ɓc�c";
		mes "�܂��{���Ă�悤�ł���";
		mes "�ǂ�����ČĂяo�������B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�o����Ȃ�Ă�ł�����B";
		next;
		cloakoffnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�}�ɉ��̗p�Ȃ́H";
		mes "���̎��Ȃ�{���ĂȂ�����";
		mes "�����Ă����āB";
		mes "�{���ɓ{���ĂȂ�����B";
		emotion 6,"�J�g�����E�E�B�O�i�[#ep16wig";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���o����A�����������������B";
		mes "����������{��Ȃ��ŗ~�����B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c�������������̂���";
		mes "�����Ă���̂�ˁH";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�o����̎����������";
		mes "�����o�������c�c���ȁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���́c�c�܂��A�F�X����ȁB";
		mes "�o���񂪂ǂ�ȕ��Ɋ����Ă�����";
		mes "�S�R�m��Ȃ������B";
		next;
		mes "[�����Q��]";
		mes "�ł��Ƒ�������A";
		mes "�Ƒ������炱��";
		mes "�b���Ȃ������̂����m��Ȃ�����";
		mes "�b���ė~���������B";
		next;
		mes "[�����Q��]";
		mes "���݂��̐S�ɋl�܂���";
		mes "���t��������܂܂���";
		mes "����̂悤�Ɍ�������܂��̂ł́c�c";
		mes "�����v�����B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "������B";
		mes "�m���Ɏ�����l�ōl���Ă��B";
		mes "���ɂ��񂪂���B";
		mes "�����Ƒf���ɂȂ�ׂ��������B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�܂����������ɂ����ǁc�c";
		mes "���̎��͉��ł��b������ˁB";
		mes "�c�c����A�o���Ă�H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "����́c�c���̊ԂɁH";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�̂���������B";
		mes "�v���o���Č����炠�̗c������";
		mes "��Ԓ����ǂ����������Ȃ��āB";
		mes "�ق�A���̐΁B";
		mes "�����Œ���������";
		mes "�������T���S���������ˁB";
		next;
		mes "[�����Q��]";
		mes "�l�Ԃ��ꏏ�Ȃ񂶂�Ȃ����ȁB";
		mes "�S��������K�v��";
		mes "������������Ȃ����ǁA";
		mes "�����͌����Ă݂Ȃ���";
		mes "�ǂ�Ȃɔ��������������ɂ���̂��B";
		mes "����Ȃ��Ǝv���B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����ˁB�m���ɂ�������B";
		mes "�������ꂩ��͓w�͂���B";
		mes "�������Ȃ����߂ɂ��B";
		next;
		mes "[�J�g����]";
		mes "�Ƃ���ł���Șb�c�c";
		mes "�N�ɏK�����́H";
		mes "����Ɛl�Ԃ炵����b��";
		mes "�ł�����ˁB";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�l�Ԃ炵����b���āc�c";
		mes "�܂��A������B";
		mes "���ꂩ��͂��݂���";
		mes "�S���I�[�v���ɂ��Ă��������B";
		next;
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�܂��A�����͌Z�킪������ł���������";
		mes "�����P���J�͂�߂悤�B";
		mes "�`���җl������J�l�ł����B";
		mes "����͏��Ȃ��ł���";
		mes "�������̂��߂Ɋ撣���Ă���������";
		mes "�S�΂���̂���ł��B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�p���������p�����������Ă��܂��A";
		mes "�\���󂠂�܂���ł����B";
		mes "�܂����K�₭�������B";
		mes "���߂Ċ��}�������܂��B";
		next;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�̂�������";
		mes "�C�Â������������ł��B";
		mes "�`���җl�ɏ������K�v�Ȏ���";
		mes "�͋y�Ԍ��肨�������܂��B";
		mes "����ł́I";
		delitem 6927,1;
		delitem 748,1;
		delquest 14487;
		set EP16_4QUE,13;
		setquest 201880;
		getitem 6919,30;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		next;
		cutin "16jur_nor.bmp",255;
		mes "�]�����Q���ɂ�����x�b���������";
		mes "�@�E�B�O�i�[�Ƃ̐S�̔�(���܂�)";
		mes "�@�N�G�X�g���J�n�ł��܂��]";
		close;
	case 13:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����A�`���җl�B";
		mes "�悤�����B";
		mes "�j���͊y����ł�����Ⴂ�܂����H";
		mes "�����K�v�ȕ��ł��H";
		next;
		menu "�J�g�����Ƃ̒��͂ǂ��H",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�̂�������";
		mes "�ŋ߂͉�b�������āA";
		mes "���݂��ɐM����������";
		mes "���ɂȂ��Ă��܂��B";
		mes "����ɂł��ˁc�c";
		next;
		cutin "16jur_nor.bmp",255;
		cloakoffnpc "���C�h#ep16wig01";
		mes "[���C�h]";
		mes "���炵�܂��B";
		next;
		mes "[���C�h]";
		mes "�c�c�I";
		mes "����v���܂����B";
		mes "��p���̂悤�ł��̂�";
		mes "�|���͌�ɒv���܂��B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�������A���v�ł���B";
		mes "�\�킸�ɂ��d����";
		mes "�Ȃ����Ă��������B";
		next;
		cutin "16jur_nor.bmp",255;
		menu "���v���Ԃ�",-;
		mes "[���C�h]";
		mes "�ǂ����ł�����܂��������H";
		mes "����Ȃ������c";
		mes "�����c�c�͂��c�c";
		mes "����ɂ��́c�c";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���������Ă��̎҂��c�c�H";
		mes "�`���җl�����̍s����";
		mes "�������ɂȂ����Ƃ����c�c";
		next;
		menu "�����ł�",-;
		mes "[�����Q��]";
		mes "���̎��͎��炵�܂����B";
		mes "�������Ȃ����Ɂc�c";
		mes "���߂Ă��l�т������܂��B";
		next;
		cutin "16jur_nor.bmp",255;
		mes "[���C�h]";
		mes "���[��B";
		mes "��������������Ă����������";
		mes "�C���y�ɂȂ�܂��B";
		mes "�����A�����Ƒ��������Ă��炦����";
		mes "����Ȃ��Ƃɂ́c�c�u�c�u�c�B";
		mes "���������c�c�u�c�u�c�B";
		next;
		menu "�ǂ����܂����H",-;
		mes "[���C�h]";
		mes "�����A�����B";
		mes "�Ȃ�ł�����܂���I";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���́A���́c�c";
		next;
		cutin "16jur_nor.bmp",255;
		mes "[���C�h]";
		mes "����ł͎���v���܂��B";
		mes "�����Ƃ��ĒN�����Ȃ�����";
		mes "���|���s�����܂�ł��̂ŁB";
		next;
		cloakonnpc "���C�h#ep16wig01";
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���c�c������Ɓc�c";
		mes "�܂��āc�c";
		next;
		mes "[�����Q��]";
		mes "�`���җl�c�c";
		next;
		menu "�͂�",-;
		cutin "16jur_sim.bmp",0;
		emotion 3;
		mes "[�����Q��]";
		mes "^0000cd��^000000�݂����ł��B";
		next;
		menu "�c�c�͂��H",-;
		emotion 23,"";
		cutin "16jur_nor.bmp",0;
		emotion 3;
		mes "[�����Q��]";
		mes "�Ȃ�ł��낤�B";
		mes "���̐S���̌ۓ��c�c";
		mes "���̕������߂Ăł��B";
		next;
		mes "[�����Q��]";
		mes "���Ƃ������c�c";
		mes "���̍��肪�~�܂�܂���B";
		mes "�z�ƒ��������ɏ���̂Ȃ��s���B";
		mes "�����Ĉӎu���т������B";
		next;
		mes "[�����Q��]";
		mes "���܂ŏo������������������A";
		mes "�D��ȉ����̉Ԃ̂悤�ł������B";
		mes "�ޏ��͍L�������ɍ炢���Ԃ̂悤��";
		mes "���X����������܂��B";
		next;
		mes "[�����Q��]";
		mes "���܂ŏo����������ɂ͂Ȃ�";
		mes "�͋����������܂��B";
		next;
		mes "[�����Q��]";
		mes "�`���җl�I";
		mes "�ǂ̂悤�ɐS�̓���`�����";
		mes "�ǂ��̂ł��傤���I";
		mes "������A���̌��t�𚑂���";
		mes "�ǂ��̂ł��傤���H";
		next;
		menu "�����͏��߂āH",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�͂��B�����Ăǂ����ޏ���";
		mes "^0000cd���̏����̑���^000000�ł��B";
		mes "�����A����Ȃɋ�������I";
		mes "���̐l���͂��΂炵�����̂�";
		mes "�Ȃ�܂����I";
		next;
		menu "�A�s�[������́H",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�A�s�[���ł����c�c";
		mes "�L���Ɏc��̂́c�c�����I";
		mes "�x���Ԃ���蔲��";
		mes "���̕����̃J�[�e���̌���";
		mes "����ł����l�����܂����I";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "������̎��̉�������";
		mes "�����Ă����l�����܂����B";
		mes "���̕����������̂�";
		mes "����Ԃ��܂������B";
		next;
		mes "[�����Q��]";
		mes "�����ł��ˁA";
		mes "���ƑS��������������";
		mes "�v���[���g����̂�";
		mes "�ǂ��ł��傤���I";
		next;
		menu "���[��c�莆�Ƃ��ǂ��H",-;
		mes "[�����Q��]";
		mes "�莆�I�@�����ł��ˁI";
		mes "���X���҂����������I";
		next;
		menu "�҂H",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���Y��ł����H";
		mes "������������o����";
		mes "�卬�����N���܂��B";
		next;
		mes "[�����Q��]";
		mes "�����Ȃ�Δޏ��c�c";
		mes "���O�������Ă��܂���ł����ˁB";
		mes "�Ƃɂ����ޏ��ɂ����f�ɂȂ�܂��B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�ӂ��c�c";
		mes "����ł͂��̎莆���΂�����������";
		mes "�ꏏ�ɂ��n�����������B";
		mes "���̐S�̐��Ƌ��ɁB";
		next;
		if(select("�킩��܂���","���f��I")==2) {
			cutin "16jur_sim.bmp",0;
			mes "[�����Q��]";
			mes "��͂薳���ł������B";
			mes "����ł͒��ڂ����܂��B";
			next;
			mes "[�����Q��]";
			mes "�����̃��[���~�b�h�K�b�c�j���[�X��";
			mes "�g�b�v��";
			mes "�u�E�B�O�i�[�Ƃ̌�p�ҁA";
			mes "�l�g�Ɉ��܂ꈳ���v";
			mes "�ł����ˁB";
			next;
			mes "[�����Q��]";
			mes "����Ƃ�";
			mes "�u���{���C�h�A�a�@����I�@�����́H�v";
			mes "�Ȃ�ăj���[�X�ɂȂ邩��";
			mes "�m��܂���ˁc�c";
			close2;
			cutin "16jur_nor.bmp",255;
			end;
		}
		mes "[�����Q��]";
		mes "���肪�Ƃ��������܂��I";
		mes "����ł͂��肢���܂��I";
		setquest 14488;
		set EP16_4QUE,14;
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 14:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�I";
		mes "���������Ƒ҂��Ă��܂����I";
		mes "����ŕԎ��́H";
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 15:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl�I";
		mes "���������Ƒ҂��Ă��܂����I";
		mes "����ŕԎ��́H";
		mes "�������ǂ��Ԏ��ł���ˁH";
		next;
		menu "���f�肳��܂���",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�f���c�c���c�c�H";
		mes "����ȁI";
		mes "���͔ޏ��̍D�݂ł͂Ȃ�";
		mes "�Ƃ������ł��傤���I";
		mes "����Ƃ������肵������";
		next;
		menu "����������肻��",-;
		mes "[�����Q��]";
		mes "�͂��I";
		mes "���������Ċ��ɗ��l������̂ł́H";
		mes "��������ȁc�c����Ȗ��͓I�ȕ����c�c";
		mes "��l�Ȃ͂����c�c";
		mes "��͂莄���D���ɂȂ������I";
		next;
		mes "[�����Q��]";
		mes "�n�A�c�c";
		mes "^0000cd���܂�ď��߂Đ؂Ɋ肤����^000000��";
		mes "����Ȃɂ������Â炢���̂Ƃ́I";
		mes "��������āc�c�����ꂵ���c�c";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�ł������l�͂������Ⴂ�܂����I";
		mes "����͏��Ȃ��Ƃ�";
		mes "3��͑�������ׂ����ƁI";
		next;
		mes "[�����Q��]";
		mes "�ŏ��͈���𓥂ݏo�����߁A";
		mes "���̎��͊m�F�̂��߁A";
		mes "�Ō�͍����̉��łȂ���";
		mes "���߂邽�߁B";
		next;
		mes "[�����Q��]";
		mes "�ł�����`���җl�A";
		mes "������x���肢���܂��B";
		next;
		mes "[�����Q��]";
		mes "���ʂȉ����c�c";
		mes "���̐S��`������c�c";
		mes "�����ĉԁc�c";
		next;
		mes "[�����Q��]";
		mes "�C�ܐ΁I";
		mes "�����Ă�����Ȃ��o���I";
		next;
		menu "�������냆���Q���I",-;
		mes "[�����Q��]";
		mes "�ޏ��ւ̃v���[���g�ł��B";
		mes "^0000cd�����ʂ�C�̂悤��";
		mes "���̋��̂��������������Ƃ����S^000000��";
		mes "�ޏ��ւ�^0000cd�s���Ȃ��z����\���S^000000�Ƃ��āI";
		next;
		menu "���ĂƁA���낻��c�c",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���҂����������I";
		mes "�`���җl�A�ǂ������肢���܂��I";
		mes "���̗��̓`�߂ɂȂ��Ă��������I";
		mes "�ޏ��Ɏ��̓����ʂ�悤��";
		mes "�s���Ȃ��D�ӂ����`�����������I";
		next;
		menu "�킩��܂����c�c",-;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���̎莆��^0000cd�C�ܐ�1�A";
		mes "������Ȃ��o��1��^000000��";
		mes "�ޏ��ɂ��`�����������B";
		mes "���肢���܂��B";
		next;
		mes "[�����Q��]";
		mes "�C�ܐ΂͂��̑O�Ɠ�����";
		mes "���f���[�T��|����";
		mes "��ɓ���͂��ł��B";
		next;
		mes "[�����Q��]";
		mes "�`���җl�A����ł͂��肢���܂��B";
		mes "�E�B�O�i�[�͂ǂ�Ȏ؂�ł�";
		mes "�K���Ԃ��܂��B";
		next;
		menu "����",-;
		mes "[�����Q��]";
		mes "���肪�Ƃ��I";
		mes "�Ƃ���Ŕޏ��̖��O�́c�c�H";
		next;
		menu "�����[",-;
		mes "[�����Q��]";
		mes "^0000cd�����[^000000�c�c";
		mes "�Y��Ȗ��O�ł��ˁB";
		mes "���̐S�ɂ��̖����h�J�̂��Ƃ�";
		mes "�Ԃ�܂��傤�I";
		next;
		mes "[�����Q��]";
		mes "�`���җl�A�ǂ�������";
		mes "���̔R����悤�ȋC������";
		mes "�����[�l�ɂ��`�����������I";
		set EP16_4QUE,16;
		delquest 14489;
		setquest 14490;
		next;
		mes "[�����Q��]";
		mes "�C�ܐ΂���肵�ɍs���Ȃ�";
		mes "��낵����΁A�g���̎҂������܂��B";
		mes "�g���̎҂ɃR���h�܂�";
		mes "�ē������܂���B";
		next;
		mes "[�����Q��]";
		mes "������Ȃ��o����";
		mes "�ǂ��œ���ł��邩������Ȃ��̂�";
		mes "�`���җl����̑���";
		mes "��ɓ���Ă��Ă��������B";
		next;
		if(select("���͂ł����܂�","���肢���܂�")==1) {
			mes "[�����Q��]";
			mes "���͂Ƃ͂������ł��ˁB";
			mes "����ł͂�낵�����肢���܂��B";
			close2;
			cutin "16jur_nor.bmp",255;
			end;
		}
		mes "[�����Q��]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��傤�B";
		close2;
		cutin "16jur_nor.bmp",255;
		warp "comodo.gat",34,215;
		end;
	case 16:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����[�l�Ɏ��̐S��`���āc�c";
		mes "�Ƃ����ɂ͂��܂�ɂ�";
		mes "���Ԃ��o���Ă��܂���ˁB";
		next;
		mes "[�����Q��]";
		mes "���������Ĉ˗��̕i��";
		mes "���Y��ɂȂ�܂������H";
		next;
		mes "[�����Q��]";
		mes "�莆�͂������ł��ˁB";
		mes "��̓��f���[�T��|���ē�����";
		mes "^0000cd�C�ܐ�1��";
		mes "������Ȃ��o��1��^000000��";
		mes "���肢���܂��B";
		next;
		mes "[�����Q��]";
		mes "���̂悤�ȕ��}�Ȃ��̂ł�";
		mes "���̐S��`������Ȃ�c�c";
		mes "����Ƀ����[�l��";
		mes "���S�Ɋ����Ȃ��ł��傤�I";
		mes "�����I�@���̂��̐S��";
		mes "���`�����������I";
		next;
		mes "[�����Q��]";
		mes "�C�ܐ΂���肵�ɍs���Ȃ�";
		mes "��낵����΁A�g���̎҂������܂��B";
		mes "�g���̎҂ɃR���h�܂�";
		mes "�ē������܂���B";
		next;
		mes "[�����Q��]";
		mes "������Ȃ��o����";
		mes "�ǂ��œ���ł��邩������Ȃ��̂�";
		mes "�`���җl����̑���";
		mes "��ɓ���Ă��Ă��������B";
		next;
		if(select("���͂ł����܂�","���肢���܂�")==1) {
			mes "[�����Q��]";
			mes "���͂Ƃ͂������ł��ˁB";
			mes "����ł͂�낵�����肢���܂��B";
			close2;
			cutin "16jur_nor.bmp",255;
			end;
		}
		mes "[�����Q��]";
		mes "�킩��܂����B";
		mes "����ł͂����肵�܂��傤�B";
		close2;
		cutin "16jur_nor.bmp",255;
		warp "comodo.gat",34,215;
		end;
	case 17:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl!�@�ǂ��ł������H";
		mes "���͖`���җl��";
		mes "���̕������o���u�Ԃ���";
		mes "�����[�l�ɑ΂���S��";
		mes "���߂鎖���ł��܂���ł����I";
		next;
		emotion 3;
		mes "[�����Q��]";
		mes "�H�������A�������Ă��A";
		mes "���̐l�Ƃ̉�b�̎���";
		mes "�ޏ��̎p���ڂ̑O�ɗh��߂��āc�c";
		mes "����������[�l�̎��΂���";
		mes "�l���Ă��܂��܂��I";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���ꂪ���I���͍��܂�";
		mes "�Ȃ�Ƒ����̍߂�Ƃ����̂ł��傤�I";
		mes "���܂�ɂ������̏����̗���";
		mes "�����W���Ă��܂����B";
		mes "�ł������̐l�����ɂ��܂���";
		mes "�����ł���Ƃ͎v���܂���B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�Ƃ���Ŗ`���җl�̕\��������";
		mes "�ǂ���烁���[�l�����̐S��";
		mes "�󂯎���Ă��ꂽ�̂ł��傤���I";
		next;
		menu "�����������Ԃ��K�v����",-;
		mes "[�����Q��]";
		mes "����ł͎��̐S��";
		mes "�S���󂯎~�߂Ă����������킯�ł�";
		mes "����܂���ˁc�c";
		mes "����ł����܂��܂���I";
		mes "���S�ɋ��܂ꂽ�킯�ł�";
		mes "����܂��񂩂�I";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�N�����D���ɂȂ鎖��";
		mes "�����܂ŋꂵ���Ƃ�";
		mes "�v�������܂���ł����B";
		mes "���t��A��̓�����ɂ�";
		mes "�������ߕt������悤�ł��B";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���ꂩ��͎��̎���";
		mes "�D���ɂȂ��Ă��ꂽ�S�Ă̐l�X��";
		mes "�e�؂ɂ��Ȃ��ẮI";
		next;
		mes "[�����Q��]";
		mes "���߂܂����B";
		mes "���Ԃ��K�v�Ȃ�΁A";
		mes "���̓����[�ɖ����z����`���܂��傤�B";
		mes "���Ɖ^�͂��ނ��̂ł�����I";
		mes "���̐S�𖈓��A�����I";
		next;
		menu "���[��c�c",-;
		emotion 3;
		mes "[�����Q��]";
		mes "���̒����ł͖`���җl��";
		mes "���������Ă����������̂�";
		mes "�S�Ă���肭�����C�������ł��B";
		next;
		menu "�����ł�����",-;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�����A�������B";
		mes "��������Y���Ƃ���ł����B";
		mes "�܂�Ȃ����̂ł���";
		mes "����̋C�������������܂����B";
		mes "�ǂ����󂯎���Ă��������B";
		delquest 14491;
		setquest 201881;
		set EP16_4QUE,18;
		getitem 6919,20;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 18:
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���ꂩ��͎��̎���";
		mes "�D���ɂȂ��Ă��ꂽ�S�Ă̐l�X��";
		mes "�e�؂ɂ��Ȃ��ẮI";
		next;
		mes "[�����Q��]";
		mes "���߂܂����B";
		mes "���Ԃ��K�v�Ȃ�΁A";
		mes "���̓����[�ɖ����z����`���܂��傤�B";
		mes "���Ɖ^�͂��ނ��̂ł�����I";
		mes "���̐S�𖈓��A�����I";
		next;
		mes "[�����Q��]";
		mes "�`���җl�I";
		mes "���ɋC�t�����Ă����";
		mes "���肪�Ƃ��������܂����I";
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,96,7,1	script(CLOAKED)	�J�g�����E�E�B�O�i�[#ep16wig	10125,{
	switch(EP16_4QUE) {
	case 0:
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c�B";
		close2;
		cutin "16kat_nor.bmp",255;
		end;
	case 1:
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�`���җl�A";
		mes "�E�B�O�i�[�Ƃɂ��K�₢���������h�ł��B";
		mes "�����Q���ɂ�";
		mes "��������ɂȂ�܂������H";
		close2;
		cutin "16kat_nor.bmp",255;
		end;
	case 2:
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "���Ƃ��b�����Ă��������B";
		close2;
		cutin "16kat_nor.bmp",255;
		end;
	case 3:
		cutin "16kat_ang.bmp",2;
		mes "[�J�g����]";
		mes "���͔j�ł�I";
		next;
		menu "�ǂ����܂����H",-;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "���o����A�܂��͗����������B";
		mes "�����ɒu�����̂͊m���Ȃ񂾂ˁH";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����A�����I";
		mes "�����ɒu���Ă������́I";
		mes "��قǖ`���җl�Ƃ��b�����Ă���";
		mes "�����ɒu�����̂Ɂc�c";
		mes "�����Ă��܂����́I";
		next;
		menu "���𖳂������̂ł����H",-;
		mes "[�J�g����]";
		mes "���̕�Δ����c�c����";
		mes "���g�͕�΂ł͂Ȃ��̂ł����A";
		mes "�Ƃɂ����厖�Ȃ��̂�������";
		mes "^0000cd�����Ȕ����Ȃ��Ȃ�܂���^000000�B";
		next;
		mes "[�J�g����]";
		mes "��قǃJ�o��������o����";
		mes "�����ɒu�����̂ł����c�c";
		mes "�ǂ����܂��傤�c�c";
		mes "�������N���ɂ����";
		mes "�����ł�������c�c��!!";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "������������";
		mes "�|���ɗ���^0000cd���C�h^000000��";
		mes "�Еt���Ă��܂����̂ł́H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����Q���A�����܂���I";
		mes "���̃��C�h�������Ă����̂�";
		mes "���ڌ����킯�ł͂Ȃ��ł��傤�H";
		mes "�󋵂����Ől���^���̂�";
		mes "�ǂ��Ȃ����ł��B";
		next;
		menu "�b�𕷂��̂͗ǂ��Ă��Ǝv���܂�",-;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�������A���̕K�v�͂���܂���B";
		mes "�b�𕷂��ɂ����΁A";
		mes "�����͋^���Ă���ƍl����ł��傤�B";
		mes "�����ƋC�����Q���鎖�ɂȂ�܂��B";
		next;
		cutin "16jur_sim.bmp",0;
		mes "[�����Q��]";
		mes "�ł�����Ȃɕs���ɂȂ�قǁA";
		mes "�厖�ȕ��Ȃ�ł��傤�H";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "����́c�c���������ǁc�c";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "��΂Ɍ����o���Ȃ���";
		mes "�ʖڂȂ񂾂�ˁH";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�����c�c�����ǁc�c";
		next;
		menu "�ǂ������S���Ă��҂���������",-;
		mes "[�J�g����]";
		mes "�c�c���ꂪ�őP���́c�c";
		mes "�킩��܂���B";
		mes "�^���������Ă���悤�Łc�c";
		next;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "�`���җl��M���Ă݂悤�B";
		mes "�����̌o����ς񂾕�������";
		mes "�����Ə�肭������B";
		next;
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�c�c�����B";
		mes "����ł͂��肢�v���܂��B";
		mes "���͔O�̂���";
		mes "���̏ꏊ��T���Ă݂܂��B";
		next;
		cloakonnpc;
		cutin "16jur_nor.bmp",0;
		mes "[�����Q��]";
		mes "���肢���܂��B";
		mes "^0000cd���C�h�B�͑䏊�ɂ���^000000�ƕ����܂����B";
		chgquest 14477,14478;
		set EP16_4QUE,4;
		close2;
		cutin "16jur_nor.bmp",255;
		end;
	case 11:
		mes "[�����Q��]";
		mes "���o���񂪖����������̂�";
		mes "��̉��Ȃ̂���";
		mes "�킩��܂���B";
		next;
		mes "[�����Q��]";
		mes "�����D���Ȑl�X�ɐ���������";
		mes "�T���Ă��炦�΁A";
		mes "���[���I";
		mes "�Ƃ����ԂɌ�����ł��傤�B";
		mes "�������A����ł͕���";
		mes "�ق��Ă��Ȃ����R������̂ł��B";
		next;
		mes "[�����Q��]";
		mes "�d������܂���A";
		mes "�`���җl�ɂ��C������̂�";
		mes "�őP���Ǝv���܂��B";
		mes "�`���җl�̎�ɂ������Ă܂���I";
		close2;
		cutin "16jur_sim.bmp",255;
		end;
	default:
		cutin "16kat_nor.bmp",2;
		mes "[�J�g����]";
		mes "�`���җl�̂�������";
		mes "�ȑO�����Z��̒���";
		mes "�ǂ��Ȃ����悤�Ɋ����܂��B";
		mes "���ꂩ��͒�B�ɂ�";
		mes "���̒��ɂ��܂��Ă����b��";
		mes "���悤�Ǝv���܂��B";
		next;
		mes "[�J�g����]";
		mes "���܂ł͊���������E���A";
		mes "���t�����ɏo���Ȃ��悤��";
		mes "���Ă��܂�����";
		mes "���ꂪ�ǂ����ł͂Ȃ���";
		mes "�C�Â��܂����B";
		next;
		mes "[�J�g����]";
		mes "���ꂩ��͑f���ɂȂ���";
		mes "����𐶂܂Ȃ��悤��";
		mes "�b�����Ă��������Ǝv���܂��B";
		next;
		mes "[�J�g����]";
		mes "�`���җl�A";
		mes "�{���ɂ��肪�Ƃ��������܂����B";
		close2;
		cutin "16kat_nor.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,90,16,0	script	#ep16wig004	139,14,14,{
	end;
OnTouch:
	if(EP16_4QUE == 2 || EP16_4QUE == 3) {
		cloakoffnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		if(EP16_6QUE == 2 || EP16_6QUE == 8)
			cloakoffnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		else
			cloakonnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
	} else if(EP16_4QUE > 3 && EP16_4QUE < 12) {
		cloakonnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		if(EP16_6QUE == 2 || EP16_6QUE == 8)
			cloakoffnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		else
			cloakonnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
	} else if(EP16_4QUE == 12) {
		cloakonnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		cloakoffnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
	} else {
		cloakoffnpc "�J�g�����E�E�B�O�i�[#ep16wig";
		cloakoffnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
	}

	switch(rand(3)) {
	case 1:
		if(!getnpctimer(1,"�c�Ɏ҂̒j��#ep16wig01") && !getnpctimer(1,"��r�ȏ���#ep16wig01")) {
			donpcevent "��r�ȏ���#ep16wig01::OnStart";
			end;
		}
		break;
	case 2:
		if(!getnpctimer(1,"�c�Ɏ҂̒j��#ep16wig01") && !getnpctimer(1,"��r�ȏ���#ep16wig01")) {
			donpcevent "�c�Ɏ҂̒j��#ep16wig01::OnStart";
			end;
		}
		break;
	}
	end;
}

prt_cas_q.gat,94,7,7	script(CLOAKED)	�A�C�U�b�N�E�E�B�O�i�[#ep16wig	10126,{
	switch(EP16_6QUE) {
	case 2:
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�����A��������Ⴂ�܂������A";
		mes "�Z����Ȃ炠����Ɂc�c";
		next;
		menu "���Ȃ��ɗp������܂�",-;
		mes "[�A�C�U�b�N]";
		mes "���H���t�l�̎��ł����H";
		next;
		menu "�͂�",-;
		mes "[�A�C�U�b�N]";
		mes "���H���t�l���񑩂̎��Ԃ�";
		mes "�x��鎖�͍��܂ň�x��";
		mes "����܂���ł�������B";
		mes "�����������̂ł́A�ƁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "�܂��A�`���җl�������";
		mes "����������̂͑z��O�ł������B";
		mes "����ł͖{���̉�k��";
		mes "�������Ƃ������ł��傤���B";
		next;
		menu "���镨���󂯎��ɂ��܂���",-;
		mes "[�A�C�U�b�N]";
		mes "����H�c�c�����ł����B";
		mes "�ǂ���烔�H���t�l��";
		mes "�`���җl��M�����Ă���悤�ł��ˁB";
		next;
		menu "������Ă���̂���",-;
		mes "[�A�C�U�b�N]";
		mes "�C���������Ȃ��ł��������B";
		mes "���X�^��[�����i�ł�����܂����A";
		mes "���������d�������Ă��镪�ɂ�";
		mes "���肪�M���ɒl����̂�";
		mes "�m�F���K�v�ł����ˁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "������c�c���H���t�l��";
		mes "���`�����������B";
		mes "��舵���ɂ͒��ӂ��Ă��������B";
		next;
		mes "[�A�C�U�b�N]";
		mes "����Ƃ�������肢�����Ă�";
		mes "��낵���ł��傤���H";
		mes "�ŋ߃v�����e���𒆐S�Ƃ���";
		mes "^0000cd�Ƃ���\^000000���L�܂��Ă��邻���ł��B";
		next;
		mes "[�A�C�U�b�N]";
		mes "^0000cd�w�����g�E���x���u���O�Ɋւ���\^000000";
		mes "�������ł��B";
		mes "�Ƃ肠����������Ɏ����Ȃ̂���";
		mes "�m�F���������Ǝv���܂��B";
		next;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�A�C�U�b�N]";
		mes "�]�����d�v�ł��̂�";
		mes "��������O�ɒ��ׂ�K�v������܂��B";
		mes "����ł͂��肢���܂��B";
		set EP16_6QUE,3;
		delquest 14496;
		setquest 14497;
		getitem 6930,1;
		next;
		mes "[�A�C�U�b�N]";
		mes "����ł͎��͂���Ŏ��炵�܂��B";
		cloakonnpc;
		close2;
		cutin "16isa.bmp",255;
		end;
	case 8:
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�����A�`���җl�B";
		mes "�ǂ��ł������H";
		mes "��̕��͓`���Ă����������悤�ł��ˁB";
		mes "�Ƃ���ŉ\�Ɋւ��Ắc�c";
		next;
		menu "���H���t�E���x���u���O���M�̏��ނ�n��",-;
		mes "[�A�C�U�b�N]";
		mes "�m���Ɏ󂯎��܂����B";
		mes "�Ȃ�قǁc�c";
		mes "�����������̂ł��ˁc�c";
		mes "�Ƃ����킯�ŐV���Ƃ�";
		mes "���Ԗ���ŉ����c�c";
		mes "���ƕ��j��ύX����A�ł����B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�������t�����璼�ڎf���܂��B";
		mes "�Ƃ̎��ł��ˁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "�Ƃ������͌��ǐ푈��";
		mes "�N�����Ȃ��Ƃ������ł��ˁB";
		mes "�\�̈З͂����Ȃ��Ȃ������悤�ł��ˁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "�����ɂ����ł��ˁB";
		mes "�����Ɩ���ł̗�����ł߂�";
		mes "�ǂ��@��ł����̂ɁB";
		next;
		mes "[�A�C�U�b�N]";
		mes "�ł����A���H���t�l�Ȃ�";
		mes "����ɗǂ��Ă��o���Ă����ł��傤�B";
		mes "���H���t�l�ɂ͗���������";
		mes "���`�����������B";
		mes "�����ĐV�������ƕ��j�ɂ�";
		mes "���҂��Ă���ƁB";
		next;
		menu "�킩��܂���",-;
		mes "[�A�C�U�b�N]";
		mes "��낵�����肢���܂��B";
		delitem 6931,1;
		delquest 14502;
		setquest 14503;
		set EP16_6QUE,9;
		next;
		mes "[�A�C�U�b�N]";
		mes "����ł͎��͂���Ŏ��炵�܂��B";
		cloakonnpc "�A�C�U�b�N�E�E�B�O�i�[#ep16wig";
		close2;
		cutin "16isa.bmp",255;
		end;
	default:
		break;
	}
	switch(EP16_4QUE) {
	case 0:
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�E�B�O�i�[�Ƃɂ�";
		mes "���߂Ă�������Ⴂ�܂������H";
		mes "����ł͂�����ɂ���܂�";
		mes "����^0000cd���e�ɂ���ɂȂ���^000000���������B";
		close2;
		cutin "16isa.bmp",255;
		end;
	case 1:
	case 2:
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�`���җl�A�܂��̓E�B�O�i�[�Ƃɂ���";
		mes "���̉Ƒ��ɂ������Ă��������܂����H";
		mes "�����A���ʌp�����̌Z��";
		mes "�����̎o�ɂ��B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�ǂ����b��������Ǝv���܂��B";
		close2;
		cutin "16isa.bmp",255;
		end;
	case 12:
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�`���җl�A���肢���Ă�������";
		mes "�W�܂�܂������H";
		next;
		mes "[�A�C�U�b�N]";
		mes "�������ڏW�߂Ă�������";
		mes "������Ƃ��Ă͗ǂ��ł��傤���A";
		mes "�g���̒p���O�ɂ��炯�o���悤��";
		mes "���̂ł��̂Łc�c";
		next;
		mes "[�A�C�U�b�N]";
		mes "���萔�����|�����܂���";
		mes "���肢���܂��B";
		mes "�����A�O�̂��ߏW�߂镨�́A";
		next;
		mes "[�A�C�U�b�N]";
		mes "^0000cd�C�ܐ�1�A������Ȃ��o��1��^000000�ł��B";
		next;
		mes "[�A�C�U�b�N]";
		mes "�`���җl�̎��";
		mes "��X�o��̒����������Ă��܂��B";
		next;
		mes "[�A�C�U�b�N]";
		mes "����ł͂��肢���܂��I";
		mes "�ł��邾�������I";
		close2;
		cutin "16isa.bmp",255;
		end;
	case 13:
		cutin "16isa.bmp",1;
		mes "[�A�C�U�b�N]";
		mes "�`���җl�̂������ŌZ����Ǝo�����";
		mes "�����肪�ł��܂����B";
		mes "�܂��A���̂������ł�����܂����B";
		next;
		mes "[�A�C�U�b�N]";
		mes "���͂́A��k�ł���I";
		mes "�`���җl�A���͂���Ŏ��炵�܂��B";
		close2;
		cutin "16isa.bmp",255;
		end;
	}
}

prt_cas_q.gat,93,10,4	script(CLOAKED)	���C�h#ep16wig01	69,{}

prt_cas.gat,322,216,5	script	���C�h#ep16wig02	69,{
	switch(EP16_4QUE) {
	case 4:
		mes "[���C�h]";
		mes "�������L�c���ƕ]����";
		mes "�L�b�`���|���c�c";
		mes "���Ƃ��I��点�Ȃ��Ɓc�c";
		next;
		mes "[���C�h]";
		mes "�ǂ����ɂ���Ȏ���";
		mes "�����Ă����l��";
		mes "���Ȃ����ȁc�c����";
		mes "������p�ł��傤���H";
		next;
		menu "�E�B�O�i�[�Ƃ̑|����S�����Ă�����H",-;
		mes "[���C�h]";
		mes "���A�͂��B���ł��B";
		mes "�������ł��c�c�H";
		next;
		menu "�����Ȕ������܂���ł������H�J�g�����̕��ł�",-;
		mes "[���C�h]";
		mes "���A�͂��B�������Ɍ��܂����B";
		mes "�P���Ȃ��獂�������锠�ł����B";
		mes "�|���̍ۂɂ͈�x���炵�܂������A";
		mes "�e�[�u����@���I������ɂ�";
		mes "�҂�����ƌ��̈ʒu�ɖ߂��܂����B";
		next;
		menu "�󋵂������Əڂ���",-;
		mes "[���C�h]";
		mes "���́A���݂܂���B";
		mes "������Ă��������Ȃ��Ă�";
		mes "���^���Ă����ł���ˁB";
		next;
		emotion 6,"���C�h#ep16wig02";
		mes "[���C�h]";
		mes "�M���̕����łȂ��Ȃ������̂������āA";
		mes "^0000cd�|�������Ă������C�h������^000000�Ɓc�c";
		next;
		menu "�^���Ă���킯�ł͂Ȃ��ł�",-;
		emotion 6,"���C�h#ep16wig02";
		mes "[���C�h]";
		mes "�ł��S�̕Ћ��ł�";
		mes "�^���Ă����łł��傤�B";
		mes "�Ⴂ�܂����H";
		next;
		emotion 7,"���C�h#ep16wig02";
		mes "[���C�h]";
		mes "�ӂ��c�c";
		mes "���C�h�Ƃ����d�������Ă����";
		mes "���������������\����܂��̂�";
		mes "���v�ł��B";
		mes "�^����̂͊���܂��񂯂ǁB";
		next;
		mes "[���C�h]";
		mes "���͉�������ł��܂���B";
		mes "�ł������ł��ˁc�c";
		mes "���ɐl�́c�c";
		next;
		menu "���Ȃ��̑��ɐl�͂����̂ł����H",-;
		mes "[���C�h]";
		mes "���ꂪ�c�c�����悤�ȁA";
		mes "���Ȃ������悤�ȁB";
		mes "^0000cd�L�b�`�����Y��ɂȂ��";
		mes "^0000cd�v���o������^000000�ł��B";
		mes "���܂�ɉ����Ď��̓��̒���";
		mes "�������Ă��܂��āc�c";
		next;
		emotion 45,"���C�h#ep16wig02";
		mes "[���C�h]";
		mes "���`���`�I";
		mes "�N��������`���Ă����";
		mes "�D�����l�͂��Ȃ��̂��ȁ`�B";
		next;
		menu "��`���܂��傤",-;
		emotion 18,"���C�h#ep16wig02";
		mes "[���C�h]";
		mes "����I";
		mes "��`���Ă�������̂ł����I";
		mes "���ꂶ�Ⴑ��^0000cd�|�������킵^000000��";
		mes "���݂����܂��B";
		mes "���X�܂ł����Ƒ|�����Ă��������ˁI";
		next;
		mes "[���C�h]";
		mes "����Ȑ��@�Ő��삳�ꂽ";
		mes "�ƂĂ��������킵�Ȃ̂�";
		mes "�����ȏꏊ�Ŏg�������ł��܂��B";
		mes "�|���̎菇�܂ŃR�[�`���Ă����";
		mes "�D�ꕨ�ł���B";
		next;
		mes "[���C�h]";
		mes "���߂Ďg�����͋��������m��܂��񂪁A";
		mes "�l�ɊQ�͋y�ڂ����肵�Ȃ��̂�";
		mes "���S���Ă��������B";
		mes "�`���I�ȂƂ������";
		mes "��������������ł��B";
		next;
		if(checkitemblank() == 0) {
			mes "[���C�h]";
			mes "����H";
			mes "�ו��������ς��ł��ˁB";
			mes "�ו���1�ȏ�̋󂫂�����Ă���";
			mes "�܂����Ă��������B";
			close;
		}
		mes "[���C�h]";
		mes "�����A���Ƒ|���ɂ�������";
		mes "���Ԃ�����܂�����ˁB";
		mes "�܂��͕ǂ̃J�r��肩��B";
		mes "�S����������������";
		mes "�Ō�ɏ��|���ł��I";
		delquest 14478;
		setquest 14479;
		setquest 73062;
		getitem 6928,3;
		set EP16_4QUE,5;
		close;
	case 5:
	case 6:
	case 7:
		mes "[���C�h]";
		mes "�����I������̂ł����H";
		mes "���炠��A�܂��݂����ł��ˁB";
		next;
		mes "[���C�h]";
		mes "��قǂ��n���������킵��";
		mes "�����Ƒ|�������Ă��������ˁB";
		close;
	case 8:
		emotion 21;
		mes "[���C�h]";
		mes "���킠�`�I";
		mes "�{���Ƀs�J�s�J�ɂȂ�܂����I";
		mes "���̘r�͂���";
		mes "�����܂ł̑|���͖����ł��B";
		mes "�������L�b�`������";
		mes "���|���ɓ]�E���܂��񂩁H";
		next;
		mes "[���C�h]";
		mes "���̕����͗Վ���";
		mes "�g�p������̂Ƃ͂����A";
		mes "���[���~�b�h�K�b�c�ō��̕x���ւ�";
		mes "�E�B�O�i�[�Ƃ��g�p���܂����B";
		next;
		mes "[���C�h]";
		mes "���R����Ɍ������Ƌ��";
		mes "�J�[�y�b�g���₦�ԂȂ��^�΂�";
		mes "�����Ă����̂ł��B";
		mes "����Ɏ��A���܂ł��̂悤��";
		mes "�D��ō��؂ȌՂ̔��";
		mes "���߂Č��܂����B";
		next;
		menu "�Ƌ�ł͂Ȃ��l�̘b���������ł�",-;
		mes "[���C�h]";
		mes "�͂��c�c";
		mes "������Ƃ͋�C��ǂ�ł��������B";
		mes "�������M���𑊎肵�Ă������";
		mes "����Ȃɓ݊��Ƃ́c�c";
		next;
		mes "[���C�h]";
		mes "�͂��A�����܂ŕ�������";
		mes "�킩��܂���ˁB";
		mes "�Ȃ�����^0000cd�Ƌ�̘b^000000�����Ă����̂��B";
		next;
		menu "�܂����Ƌ�̔z�B�l�H",-;
		mes "[���C�h]";
		mes "���͒N�Ƃ͌����Ă܂��񂯂�";
		mes "���ɂ��o���肷��l�𒲂ׂ��";
		mes "�������邩������܂���ˁB";
		mes "�Ƃ���Łc�c";
		mes "�{���ɔ��𖳂������̂ł����H";
		next;
		mes "[���C�h]";
		mes "���{�ł͂����ȉ\�b�𕷂��܂����A";
		mes "�����ɋ��񂾘b�ł��B";
		mes "�E�B�O�i�[�Ƃ̉��q�l��";
		mes "�ƂĂ����������ł͂���܂��񂩁B";
		next;
		mes "[���C�h]";
		mes "�c���������̉��q�l�΂���";
		mes "���ڂ𗁂тĂ����̂�";
		mes "�X�g���X�����܂������P�l�̂ق���";
		mes "�l�X�̒��ڂ��W�߂悤�ƕK�����ƁB";
		next;
		mes "[���C�h]";
		mes "���̂悤�ȉ\�b������̂ł��B";
		next;
		mes "[���C�h]";
		mes "�܂��A�ꕔ�̐l�̊Ԃ�";
		mes "�����₩��Ă��邾���̂悤�ł����A";
		mes "�{���̃e�B�[�^�C�����I��鍠�ɂ�";
		mes "���{���ɒm��n�邩���m��܂���B";
		next;
		menu "���₢��A�܂���",-;
		emotion 6;
		mes "[���C�h]";
		mes "������u�\�v�Ȃ̂ł��B";
		mes "���͂��������������ł��B";
		mes "���ꂶ�ᎄ�͂���Ŏ��炵�܂��B";
		next;
		menu "�z�B�l���Ăǂ��ɂ���́H",-;
		mes "[���C�h]";
		mes "�����ł��ˁA�v�����e���̂ǂ����c�c";
		mes "�Ƃ͎v���܂����B";
		mes "�܂���^0000cd�v�����e���쐼��";
		mes "^0000cd���䂪����ł���ӂ�^000000��";
		mes "�s���Ă݂Ă��������B";
		mes "���X�͂��̋߂��ł�����B";
		next;
		mes "[���C�h]";
		mes "���A����Ǝ��͉����b���Ă��܂���B";
		mes "�\�b�͉\�ł�����B";
		delquest 14483;
		setquest 14484;
		set EP16_4QUE,9;
		next;
		mes "�]�z�B�l�̂Ƃ���Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�z�B�l�̂Ƃ���Ɍ��������]";
		close2;
		warp "prontera.gat",46,94;
		end;
	case 9:
		mes "[���C�h]";
		mes "�`���җl�H";
		mes "�Ƌ�z�B���̕��ł�����c�c";
		mes "^0000cd������̋߂�^000000���Ǝv���܂��B";
		mes "�����B";
		next;
		mes "[���C�h]";
		mes "���ꂶ�ᎄ�͑|���̑��������܂��̂ŁB";
		mes "���炢�����܂��B";
		next;
		mes "�]�z�B�l�̂Ƃ���Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�z�B�l�̂Ƃ���Ɍ��������]";
		close2;
		warp "prontera.gat",46,94;
		end;
	case 14:
		emotion 6;
		mes "[���C�h]";
		mes "���[�����I";
		mes "�Ȃ�Ċ�łȉ���Ȃ񂾁c�c";
		mes "�S�R�����Ȃ��ȁc�c";
		mes "���Ŗl������Ȏ����c�c";
		next;
		menu "�����܂���",-;
		mes "[���C�h]";
		mes "��I�}�ɘb�������Ȃ��ŁI";
		mes "�т�����I";
		mes "���A���c�c����Ȃ��Ă͂��B";
		mes "���[�ƁA���߂ĉ�̂��ȁH";
		mes "�O�ɂ����������Ƃ�����̂��ȁH";
		mes "�`���҂̕��A����ˁH";
		next;
		menu "�o���ĂȂ��́H",-;
		emotion 16;
		mes "[���C�h]";
		mes "�����A�������B";
		mes "�͂��A�����ł����ˁB";
		mes "^0000cd����o����̂�����^000000�c�c";
		mes "�ǂ̂悤�Ȃ��p���ł��傤�H";
		next;
		menu "�Ȃ񂩊������ς�����H",-;
		mes "[���C�h]";
		mes "�܁A�܂����I";
		mes "�l�͂����ǂ���c�c����";
		mes "�l�A����Ȃ��ā[�A���I";
		mes "���͂����ǂ���ł�";
		mes "�A�n�n�B";
		next;
		menu "�����Q���̎莆��n��",-;
		mes "[���C�h]";
		mes "����́c�c����������";
		mes "�����̐������ł����H";
		mes "�������傫�Ȏ��s�ł��H";
		next;
		menu "�ǂ����ǂ�ł�������",-;
		mes "[���C�h]";
		mes "����ł́c�c";
		mes "�ǂ�ł݂܂��B";
		next;
		emotion 14;
		mes "[���C�h]";
		mes "�u�����Ȃ�ł������Ȃ����D���ł��B";
		mes "�@���̂������D���ł��B";
		mes "�@�f�[�g�������ł��B";
		mes "�@�@�@�@�@�@�@�@�@�@�@�����Q���v";
		mes "�c�c�͂��c�c�����H";
		mes "�c�c���[��c�c�͂��B";
		next;
		mes "[���C�h]";
		mes "�����Ɓc�c";
		mes "�܂肱��́c�c";
		mes "����c�c�ł����H";
		next;
		menu "���u���^�[",-;
		mes "[���C�h]";
		mes "�ӂ��c�c�\���󂠂�܂���";
		mes "���Ԃ�����Ɠ`���Ă��������B";
		mes "���S�́c�c�����A";
		mes "���肪�����ł����ǁc�c";
		next;
		menu "���������ė��l����������H",-;
		mes "[���C�h]";
		mes "�����A�����ł͂���܂��񂪁c�c";
		mes "�Ƃɂ������Ԃ����������B";
		mes "���܂�ɂ��ˑR�ł����A";
		mes "�g�����Ⴂ�܂����B";
		next;
		mes "[���C�h]";
		mes "����Ɏ��͍��A";
		mes "�����Ȃ�Ăł��܂���B";
		mes "^0000cd������Ƃ����������܂���^000000�B";
		next;
		menu "�킩��܂���",-;
		mes "[���C�h]";
		mes "�͂��A�{���ɐ\���󂠂�܂���B";
		next;
		menu "���O�����ł������Ă������ȁH",-;
		mes "[���C�h]";
		mes "���h�c�c";
		mes "�����A^0000cd�����[^000000�ł��B";
		set EP16_4QUE,15;
		delquest 14488;
		setquest 14489;
		close;
	case 15:
		mes "[���C�h]";
		mes "�����Q���l�ɂ�";
		mes "���`�������������ł��傤���B";
		mes "�C�����Q���Ȃ��悤�ɂ��肢���܂��B";
		close;
	case 16:
		if(countitem(6927) < 1 || countitem(748) < 1) {
			mes "[���C�h]";
			mes "�����Q���l�ɂ�";
			mes "���`�������������ł��傤���B";
			mes "�C�����Q���Ȃ��悤�ɂ��肢���܂��B";
			close;
		}
		emotion 7;
		mes "[�����[]";
		mes "���[�����I";
		mes "���I���񂾂�A����I";
		mes "�A���Ă�����";
		mes "�^�_���Ⴈ���Ȃ����}�W�ŁI";
		next;
		menu "�ǂ������́H",-;
		mes "[�����[]";
		mes "�����I�@�������I";
		mes "�܂����炵����ł��ˁB";
		mes "�����Q���l����̓`���ł����H";
		next;
		menu "�����Q���̑z����`���ɗ���",-;
		mes "[�����[]";
		mes "�\���󂠂�܂���";
		mes "���f�肳���Ă��������܂��B";
		mes "�ł��{�����Y��ł��ˁB";
		mes "�΂̒��ɐ����͂����Ă��ł����H";
		next;
		menu "�����Q������̈��̕\��",-;
		mes "[�����[]";
		mes "���[��B";
		mes "�{���Ƀ_���Ȃ�ł����ǂˁB";
		mes "�c�c���[��A�b���Ă����̂��ȁB";
		mes "�l�̔閧���c�c";
		next;
		menu "�閧�H",-;
		mes "[�����[]";
		mes "�閧���̔閧�ł��B";
		mes "��΂ɒm��ꂽ��_���Ȃ�ł��B";
		next;
		mes "[�����[]";
		mes "�͂��A�`���җl�����ɂ�";
		mes "�b���܂����ǁA";
		mes "�����œ����Ă������C�h��";
		mes "^0000cd�o^000000�ł��B";
		mes "�����A�`���җl���m���Ă����l��";
		mes "�o�̕��ł��B";
		next;
		menu "�Ȃ�قǁA�o���������̂�",-;
		mes "[�����[]";
		mes "�o���������炢����ł����ǁB";
		mes "^0000cd�l�͒�Œj^000000�Ȃ�ł��B";
		next;
		emotion 23,"";
		menu "��H�j�H",-;
		mes "[�����[]";
		mes "�͂��c�c";
		mes "����ɂ͐[���킯������܂��āc�c";
		mes "�D���ł���ȕ��𒅂Ă���̂ł�";
		mes "�Ȃ���ł��B";
		next;
		mes "[�����[]";
		mes "�o�͂��̑O�̎�����";
		mes "���S���Ă��܂�";
		mes "��������Ȏd���͂������Ȃ���";
		mes "�铦�����Ă��܂����̂ł��B";
		next;
		emotion 54;
		mes "[�����[]";
		mes "�d���Ȃ����{�̃��C�h����";
		mes "�A�������̂ł����A";
		mes "�_��̖���������";
		mes "^0000cd����Ɏd��������l��A��Ă����^000000";
		mes "�ڂ��҂�ƌ������̂ł��B";
		next;
		mes "[�����[]";
		mes "�����łȂ��ƁA";
		mes "�_���ɖ��L����Ă���";
		mes "^0000cd�_��s���s�ɂ�锅��^000000��";
		mes "�Ƒ�������Ȃ���΂Ȃ�Ȃ��ƁB";
		next;
		mes "[�����[]";
		mes "�����Ŗl�������";
		mes "�����Ƃ������̂ł����A";
		mes "�j�̏]�m�͑����̂�";
		mes "�_�����ƌ����܂����B";
		next;
		mes "[�����[]";
		mes "���������Ƃ����Ă�������̂�";
		mes "�L�b�`����`���Ƒ|�������邽�߂�";
		mes "^0000cd���C�h�̐l�肪�K�v^000000";
		mes "�ƌ����܂����B";
		next;
		mes "[�����[]";
		mes "�K���Ƀ��C�h�̎d��������l��";
		mes "�T���܂����B";
		next;
		mes "[�����[]";
		mes "�ł����{�ł̏j���͐l��s���������̂�";
		mes "���C�h�̎d�����o�������";
		mes "���ɉ��{�Ɍق��Ă���";
		mes "�o�̑���ɂȂ��Ă����悤��";
		mes "�����͂��܂���ł����B";
		next;
		mes "[�����[]";
		mes "�����ĕ�Ƒ��k���A";
		mes "�o�Ɗ�������������Ȃ��l��";
		mes "���������";
		mes "^0000cd�o�̂ӂ�����ē�����^000000�ɂȂ�܂����B";
		mes "�L�b�`���̎d���΂��肾�����̂�";
		mes "�l�ڂɕt����������܂��񂵁B";
		next;
		menu "�C�t���Ȃ������c�c",-;
		mes "[�����[]";
		mes "�l��^0000cd�o�͑o�q�ł�������^000000�Ȃ̂ŁB";
		mes "�N���C�Â��܂���ł����B";
		mes "�`���җl�������ł��傤�H";
		next;
		menu "�����Q���ɂȂ�ƌ����΁c�c",-;
		emotion 20;
		mes "[�����[]";
		mes "����͂Ƃ�����c�c";
		mes "�������ł��ˁB";
		mes "^0000cd���܂�ď��߂č��ꂽ�̂��U��^000000";
		mes "���Ȃ�āB";
		next;
		mes "[�����[]";
		mes "�ǂ����΂��茩�Ă����l��";
		mes "����Ɍ��������ڐ��������Ă��";
		mes "�v���Ă��܂������A";
		mes "�����ł��Ȃ��悤�ł��ˁB";
		next;
		switch(select("���͖Ӗڂ��Ă��Ƃ���","�j�ł���������Ȃ�")) {
		case 1:
			mes "[�����[]";
			mes "���[��A�܂���܂����B";
			next;
			break;
		case 2:
			mes "[�����[]";
			mes "���񂤂�A�j���m�ł������ł���ˁB";
			mes "�l�������v���܂��B";
			mes "�������A�l�ȊO�ł��肢���܂��I";
			next;
			break;
		}
		menu "�����Q���ɑS���`���邵���Ȃ���",-;
		emotion 23;
		mes "[�����[]";
		mes "����I�@�_���ł���I";
		mes "�m���Ă�͖̂`���җl�����ł�����I";
		mes "�����̂��΂�Ă��܂���";
		mes "^0000cd���낢��ƃ}�Y��^000000�̂ł��B";
		mes "�l�ɂ͔������������܂���B";
		next;
		mes "[�����[]";
		mes "�o�ɂ͉��Ƃ��A���Ă���悤��";
		mes "�A�������Ă��܂����A";
		mes "�Ȃ��Ȃ��A�����t���Ȃ��悤�ł��B";
		mes "�j�����I���܂ł����ł�";
		mes "�閧�ɂ��ĖႦ�܂��񂩁H";
		next;
		menu "�����Q�������܂����ɂȂ�",-;
		mes "[�����[]";
		mes "����͖{���ɐ\����Ȃ��v���܂��B";
		mes "�ł������̎d���ɂ�";
		mes "�Ƒ��̐��v���������Ă���̂ł��B";
		next;
		mes "[�����[]";
		mes "�^�_�ł�������ȕ��𒅂āA";
		mes "����Ȏd���܂ł��Ă���̂ł��B";
		mes "���������Ǝv���܂��񂩁c�c�H";
		next;
		menu "�Ԏ���Ⴆ�Ȃ������Ɠ`���鎖�ɂ���",-;
		mes "[�����[]";
		mes "�{���ł����H";
		mes "���ꂶ��A�Ƃ肠����";
		mes "�v���[���g�͎󂯎���Ă�����";
		mes "�j���Ō�̓��ɂ��Ԃ����܂��B";
		next;
		mes "[�����[]";
		mes "�󂯎��Ȃ���";
		mes "�܂��`���җl��ǂ��Ԃ�����";
		mes "�Ȃ肻���ł�����B";
		mes "�����ł��ˁA";
		mes "�l���|������ς��Ă������";
		mes "�o���Ȃ��悤�ɒ��ӂ��܂��B";
		next;
		menu "����",-;
		mes "[�����[]";
		mes "���肪�Ƃ��������܂��B";
		mes "����ł͂��肢���܂��B";
		delitem 6927,1;
		delitem 748,1;
		set EP16_4QUE,17;
		delquest 14490;
		setquest 14491;
		close;
	case 17:
		mes "[�����[]";
		mes "�����Q���l�ɂ�";
		mes "�`���Ă��������܂������H";
		mes "�͂��c�c";
		mes "���܂ő����̂ł��傤���B";
		next;
		mes "[�����[]";
		mes "�������̎�";
		mes "�l���铦�����悤���ȁc�c";
		close;
	case 18:
		mes "[�����[]";
		mes "���q�l�ɂ͓`���Ă��������܂������H";
		mes "�������߂Ă����������";
		mes "������ł����c�c";
		close;
	default:
		mes "[���C�h]";
		mes "�t�t�t�`����";
		mes "���|���A���|���`��";
		mes "�߂�ǂ������ˁ`��";
		close;
	}
}

prt_cas.gat,339,212,5	script	�Â���������#ep16wig	111,7,7,{
	if(EP16_4QUE == 5) {
		if(!checkquest(14481)) {
			mes "[�|�������킵]";
			mes "���A�L�������ꏊ�ɂ�";
			mes "����Ăъo�܂����̂͐l�Ԃ��H";
			mes "�[��������Ăъo�܂����߂�";
			mes "�|���ŏ����ׂ��B";
			next;
			mes "[�|�������킵]";
			mes "��͂��̂��킵�ɕ��󂳂ꂵ";
			mes "�|���̐_�Ȃ�B";
			mes "��ɍēx�����̖���������炷���߁A";
			mes "���̏ꏊ�𐴑|����B";
			next;
			mes "[�|�������킵]";
			mes "���̏ꏊ�ɋY��鉘����";
			mes "^0000cd�J�r�̌Q��^000000�Ȃ�B";
			mes "���̓����Ɛ_���Ȃ鐅�ɂ�";
			mes "���|���Ȃ���邾�낤�B";
			next;
			mes "[�|�������킵]";
			mes "�܂���^0000cd�J�r�̕�1�Ɛ���1��^000000��";
			mes "���߂�ׂ��B";
			setquest 14481;
			close;
		}
		if(countitem(7001) < 1 || countitem(523) < 1) {
			mes "[�|�������킵]";
			mes "���A�l�Ԃ�B";
			mes "�����͓O�ꂵ�čs���ׂ��B";
			mes "�܂���^0000cd�J�r�̕�1�Ɛ���1��^000000��";
			mes "���߂�ׂ��B";
			next;
			mes "[�|�������킵]";
			mes "���߂镨�W�܂�΁A";
			mes "���|�̎��i�����҂ƔF�߂�B";
			mes "���A�l�Ԃ�B";
			mes "�����͓O�ꂵ�čs���ׂ��B";
			close;
		}
		mes "[�|�������킵]";
		mes "�J�r�̕��Ɛ����������̂�A";
		mes "�J�r�̌Q�������������B";
		next;
		mes "[�|�������킵]";
		mes "�J�r�̕����J�r�̌Q���ɂӂ肩���A";
		mes "���킵���񂵂Ȃ���";
		mes "�����t����ׂ��B";
		next;
		mes "[�|�������킵]";
		mes "���̌�A�������ӂ肩���A";
		mes "���킵�ł��˂�悤��";
		mes "������ׂ��B";
		next;
		mes "[�|�������킵]";
		mes "�����Ď��̂悤�ɐ��|�s���ׂ��B";
		next;
		mes "[�|�������킵]";
		mes "�@�ׂ�1��͂����A";
		mes "3�񋭂��@���ׂ��B";
		mes "�����ƃJ�r�̕���";
		mes "������悤�ɂ���B";
		next;
		mes "[�|�������킵]";
		mes "����10�񉟂����݁A";
		mes "5�񎞌v�񂵂ɋ���������ׂ��B";
		next;
		progressbar 3;
		misceffect 78;
		mes "[�|�������킵]";
		mes "���S�����B";
		mes "�܂�Ɍ��鐴�|�������B";
		mes "�|�������킵���A";
		mes "��_�̓܂�Ȃ��B";
		next;
		mes "[�|�������킵]";
		mes "��̐����ׂ���";
		mes "�����Ƃ���������B";
		mes "���A�l�Ԃ�B";
		mes "�V����ł������B";
		misceffect 66,"";
		delitem 6928,1;
		delitem 7001,1;
		delitem 523,1;
		delquest 14481;
		delquest 73062;
		setquest 73063;
		set EP16_4QUE,6;
		close;
	}
	if(EP16_4QUE >= 6) {
		mes "[�Y��ɂȂ�����]";
		mes "�Y��ɂȂ����ǂ������";
		mes "�ꏏ�ɑ|��������";
		mes "�ނ����Ƃ����|�������킵��";
		mes "�v���o���B";
		close;
	}
	end;
OnTouch:
	if(EP16_4QUE == 5) {
		if(!checkquest(14481)) {
			misceffect 58;
			mes "[�|�������킵]";
			mes "���A�L�������ꏊ�ɂ�";
			mes "����Ăъo�܂����̂͐l�Ԃ��H";
			mes "�[��������Ăъo�܂����߂�";
			mes "�|���ŏ����ׂ��B";
			next;
			mes "[�|�������킵]";
			mes "��͂��̂��킵�ɕ��󂳂ꂵ";
			mes "�|���̐_�Ȃ�B";
			mes "��ɍēx�����̖���������炷���߁A";
			mes "���̏ꏊ�𐴑|����B";
			next;
			mes "[�|�������킵]";
			mes "���̏ꏊ�ɋY��鉘����";
			mes "^0000cd�J�r�̌Q��^000000�Ȃ�B";
			mes "���̓����Ɛ_���Ȃ鐅�ɂ�";
			mes "���|���Ȃ���邾�낤�B";
			next;
			mes "[�|�������킵]";
			mes "�܂���^0000cd�J�r�̕�1�Ɛ���1��^000000��";
			mes "���߂�ׂ��B";
			setquest 14481;
			close;
		}
	}
	end;
}

prt_cas.gat,339,198,5	script	�ׂƂׂƂ�����#ep16wig	111,7,7,{
	if(EP16_4QUE == 6) {
		if(!checkquest(14480)) {
			mes "[�|�������킵]";
			mes "���[��I�@�悭�Q���I";
			mes "�N������^0000cd�ׂƂׂƂ���������^000000��";
			mes "�l���ē������̂����H";
			next;
			mes "[�|�������킵]";
			mes "�n�߂܂��āI";
			mes "�l�͂��̂��킵�ɏZ��ł���";
			mes "�|���̗d�����I";
			mes "�l�ƈꏏ�ɑ|�������Ă����l��";
			mes "�҂��Ă����񂾁I";
			next;
			mes "[�|�������킵]";
			mes "����ƋN���鎖���ł�����I";
			mes "���ꂶ��l�ƈꏏ��";
			mes "�y�����|�������悤�I";
			next;
			mes "[�|�������킵]";
			mes "������͖l�̓��ӕ��삳�I";
			mes "�������͂肫�����Ⴄ��I";
			next;
			mes "[�|�������킵]";
			mes "���̖�����Ȃ�c�c";
			mes "^0000cd�I�����W�ƃA���R�[��������������^000000��";
			mes "���ʂ������I";
			mes "�܂���^0000cd�I�����W1�ƃA���R�[��1��^000000��";
			mes "�������悤�I";
			setquest 14480;
			close;
		}
		if(countitem(582) < 1 || countitem(970) < 1) {
			mes "[�|�������킵]";
			mes "�܂��|���ɕK�v�Ȃ��̂�";
			mes "�����ĂȂ���I";
			mes "�܂���^0000cd�I�����W1�ƃA���R�[��1��^000000��";
			mes "�������悤�I";
			next;
			mes "[�|�������킵]";
			mes "�ł���Ȃ�l���������������ǂ��A";
			mes "�ق�B�l���Ă��킵�ł��傤�H";
			mes "�����炨�肢�ˁB";
			close;
		}
		mes "[�|�������킵]";
		mes "�ǂ����I�����W�ƃA���R�[����";
		mes "�����ł����悤���ˁI";
		next;
		mes "[�|�������킵]";
		mes "�܂��͂��̔�����������";
		mes "�I�����W�̔�𔍂����I";
		mes "�����Ĕ�̓A���R�[����";
		mes "�Ђ��Ēu���񂾁I";
		mes "�I�����W�̎��͔������������������ˁI";
		next;
		mes "[�|�������킵]";
		mes "�����A�������낻��";
		mes "�A���R�[���ɃI�����W�̔��";
		mes "�������n�����Ƃ͂����I";
		mes "�悭�U���č����Ă݂悤�I";
		next;
		mes "[�|�������킵]";
		mes "�����Ă��̃A���R�[����������";
		mes "������ɐU�肩����񂾁I";
		mes "�p�b�p�b�ƂˁB";
		next;
		mes "[�|�������킵]";
		mes "�ŏ��͂��[�����킵��";
		mes "�񂵂Ȃ��炱����񂾁B";
		mes "�������ˁB";
		mes "���񂾂񋭂�������񂾁B";
		next;
		mes "[�|�������킵]";
		mes "�A���R�[����������";
		mes "������x�p�b�p�b�ƐU�肩���Ă���";
		mes "�r���ɂ��Ȃ����x�ł�����񂾁B";
		next;
		while(1) {
			progressbar 3;
			if(rand(5) != 0)	// �b��
				break;
			mes "[�|�������킵]";
			mes "���[��A������Ƃ�����̂�";
			mes "�シ�����݂������B";
			mes "�A���R�[����������";
			mes "���������U�肩���悤�B";
			next;
			mes "[�|�������킵]";
			mes "������ɃA���R�[����";
			mes "���ݍ��ނ悤�ɍŏ��͎キ";
			mes "�����Ă��񂾂񋭂��������Ă����񂾁B";
			next;
			mes "[�|�������킵]";
			mes "�ŏ��͂��[�����킵��";
			mes "�񂵂Ȃ��炱����񂾁B";
			mes "�������ˁB";
			mes "���񂾂񋭂�������񂾁B";
			next;
			mes "[�|�������킵]";
			mes "�A���R�[����������";
			mes "������x�p�b�p�b�ƐU�肩���Ă���";
			mes "�r���ɂ��Ȃ����x�ł�����񂾁B";
			next;
			continue;
		}
		misceffect 78;
		mes "[�|�������킵]";
		mes "���킟�I�@�{�����Y��ɂȂ�����I";
		mes "����ɑu�₩�ȃI�����W�̍��肪";
		mes "������ɏ[�����Ă��I";
		next;
		mes "[�|�������킵]";
		mes "���ꂶ�ᖼ�c�ɂ�������";
		mes "����Ŗl�̖�ڂ͏I��肳�B";
		mes "�|�����I������ɑ҂^��������ˁB";
		next;
		mes "[�|�������킵]";
		mes "�Z���Ԃ��������ǁA";
		mes "���킵�̗d���Ƃ��Ă͏[���ł�����I";
		mes "���[���A���x�͖l���N�݂�����";
		mes "�l�Ԃɐ��܂ꂽ���c�c�ȁc�c���c�c";
		misceffect 66,"";
		delitem 6928,1;
		delitem 582,1;
		delitem 970,1;
		delquest 14480;
		delquest 73063;
		setquest 73064;
		set EP16_4QUE,7;
		close;
	}
	if(EP16_4QUE >= 7) {
		mes "[�Y��ɂȂ�����]";
		mes "�Y��ɂȂ����ǂ������";
		mes "�ꏏ�ɑ|��������";
		mes "�D���������|�������킵��";
		mes "�v���o���B";
		close;
	}
	end;
OnTouch:
	if(EP16_4QUE == 6) {
		if(!checkquest(14480)) {
			misceffect 58;
			mes "[�|�������킵]";
			mes "���[��I�@�悭�Q���I";
			mes "�N������^0000cd�ׂƂׂƂ���������^000000��";
			mes "�l���ē������̂����H";
			next;
			mes "[�|�������킵]";
			mes "�n�߂܂��āI";
			mes "�l�͂��̂��킵�ɏZ��ł���";
			mes "�|���̗d�����I";
			mes "�l�ƈꏏ�ɑ|�������Ă����l��";
			mes "�҂��Ă����񂾁I";
			next;
			mes "[�|�������킵]";
			mes "����ƋN���鎖���ł�����I";
			mes "���ꂶ��l�ƈꏏ��";
			mes "�y�����|�������悤�I";
			next;
			mes "[�|�������킵]";
			mes "������͖l�̓��ӕ��삳�I";
			mes "�������͂肫�����Ⴄ��I";
			next;
			mes "[�|�������킵]";
			mes "���̖�����Ȃ�c�c";
			mes "^0000cd�I�����W�ƃA���R�[��������������^000000��";
			mes "���ʂ������I";
			mes "�܂���^0000cd�I�����W1�ƃA���R�[��1��^000000��";
			mes "�������悤�I";
			setquest 14480;
			close;
		}
	}
	end;
}

prt_cas.gat,309,215,5	script	�^�����ȏ�#ep16wig	111,{
	if(EP16_4QUE == 7) {
		if(!checkquest(14482)) {
			mes "[�|�������킵]";
			mes "���Ȃ��ł����I";
			mes "�����̑|���S���́I";
			mes "�����ɂ��ڂɂ�����܂��I";
			mes "�����̓|�������킵�ɕ��󂳂ꂽ";
			mes "�|���S�������ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�����̎w���ɐ���������";
			mes "�����΂ǂ�ȂɃL�c�C����ł�";
			mes "���j���鎖���ł���ł���܂��I";
			mes "�S�z���p�ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�{���̖ڕW���m�F�����ł���܂��I";
			mes "���̏�ɂ��т����";
			mes "�������̂ł���܂��I";
			mes "�މ��͍���";
			mes "�F�����Ȃ��̂ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "��͍��𖄂߂邽�߂�";
			mes "�⋋�i���K�v�ł���܂��I";
			mes "�ڕW�r�ł̂��߁A";
			mes "^0000cd���ꂢ�ȍ�1�ƃ�����1��^000000��";
			mes "�K�v�ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�|�����{�͕⋋�i�����낢����A";
			mes "���s����ł���܂��I";
			mes "�⋋�i�{���𗊂񂾂ł���܂��I";
			setquest 14482;
			close;
		}
		if(countitem(7043) < 1 || countitem(568) < 1) {
			mes "[�|�������킵]";
			mes "�⋋�i��";
			mes "�܂��������Ă��Ȃ��̂ł���܂��I";
			mes "�ڕW�r�ł̂��߁A";
			mes "^0000cd���ꂢ�ȍ�1�ƃ�����1��^000000��";
			mes "�K�v�ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�|�����{�͕⋋�i�����낢����A";
			mes "���s����ł���܂��I";
			mes "�⋋�i�̏����𗊂񂾂ł���܂��I";
			close;
		}
		mes "[�|�������킵]";
		mes "�⋋�i�̏����A�悵�I";
		mes "����ł͐��|���J�n����ł���܂��I";
		next;
		mes "[�|�������킵]";
		mes "����������łԂ��ł���܂��I";
		mes "�������`�͏��ɐU��T���ł���܂��I";
		mes "���ꂢ�ȍ��͂��̏��";
		mes "�U��|����ł���܂��I";
		mes "������p�������Ȃ�ł���܂��I";
		next;
		mes "[�|�������킵]";
		mes "�����Ď�����͋�������";
		mes "���������ł���܂��I";
		mes "���|���͎��̂悤��";
		mes "������̂ł���܂��I";
		next;
		mes "[�|�������킵]";
		mes "�|���͍�����E�ւ���̂�";
		mes "��΂ł���܂��I";
		mes "�r���_�ɂȂ邭�炢��";
		mes "����������̂��R�c�ł���܂��I";
		next;
		while(1) {
			progressbar 3;
			if(rand(5) != 0)	// �b��
				break;
			mes "[�|�������킵]";
			mes "�܂��܂��ł���܂��I";
			mes "���̂悤�ȓ����ł͍������̂�";
			mes "�c�łł��Ȃ��̂ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�|���͍�����E�ւ���̂�";
			mes "��΂ł���܂��I";
			mes "�r���_�ɂȂ邭�炢��";
			mes "����������̂��R�c�ł���܂��I";
			next;
			continue;
		}
		misceffect 78;
		mes "[�|�������킵]";
		mes "��낵���I";
		mes "�ō��ł���܂��I";
		mes "�������̟̂r�łɐ��������ł���܂��I";
		next;
		mes "[�|�������킵]";
		mes "���������Ȃ��Ă�";
		mes "�������v�ł���܂��I";
		mes "���Ȃ��͗��h�Ȑ��|���ł���܂��I";
		next;
		mes "[�|�������킵]";
		mes "����Ŏ�������ڂ��ʂ������̂�";
		mes "�����ł���ł���܂��I";
		mes "����ɂĉ��U�I�@�ł���܂��I";
		misceffect 66,"";
		delitem 6928,1;
		delitem 7043,1;
		delitem 568,1;
		delquest 14482;
		delquest 14479;
		delquest 73064;
		setquest 14483;
		set EP16_4QUE,8;
		close;
	}
	if(EP16_4QUE >= 8) {
		mes "[�P����]";
		mes "�P���������Ă����";
		mes "�R�l�̂悤�ȃ|�������킵��";
		mes "�v���o���B";
		mes "���C�h�ɑ|��������m�点�悤�B";
		close;
	}
	end;
OnTouch:
	if(EP16_4QUE == 7) {
		if(!checkquest(14482)) {
			misceffect 58;
			mes "[�|�������킵]";
			mes "���Ȃ��ł����I";
			mes "�����̑|���S���́I";
			mes "�����ɂ��ڂɂ�����܂��I";
			mes "�����̓|�������킵�ɕ��󂳂ꂽ";
			mes "�|���S�������ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�����̎w���ɐ���������";
			mes "�����΂ǂ�ȂɃL�c�C����ł�";
			mes "���j���鎖���ł���ł���܂��I";
			mes "�S�z���p�ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�{���̖ڕW���m�F�����ł���܂��I";
			mes "���̏�ɂ��т����";
			mes "�������̂ł���܂��I";
			mes "�މ��͍���";
			mes "�F�����Ȃ��̂ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "��͍��𖄂߂邽�߂�";
			mes "�⋋�i���K�v�ł���܂��I";
			mes "�ڕW�r�ł̂��߁A";
			mes "^0000cd���ꂢ�ȍ�1�ƃ�����1��^000000��";
			mes "�K�v�ł���܂��I";
			next;
			mes "[�|�������킵]";
			mes "�|�����{�͕⋋�i�����낢����A";
			mes "���s����ł���܂��I";
			mes "�⋋�i�{���𗊂񂾂ł���܂��I";
			setquest 14482;
			close;
		}
	}
	end;
}

prontera.gat,52,88,5	script	�Ƌ�z�B��#ep16wig	52,{
	switch(EP16_4QUE) {
	case 9:
		mes "[�Ƌ�z�B��]";
		mes "�ӂ��A�������ǂ����������I";
		mes "���[�āA�[�т͉����ȁ`�B";
		mes "�m���������X�[�v�������悤�ȁc�c";
		next;
		menu "�����܂���",-;
		emotion 28;
		mes "[�Ƌ�z�B��]";
		mes "�����ƁI";
		mes "�����͂����X���܂��ł���B";
		mes "�}���̌��łȂ����";
		mes "�����܂����Ė���Ă��ǂ��ł����H";
		next;
		mes "[�Ƌ�z�B��]";
		mes "�������ǂ������Ĕ��Ă��ł��B";
		mes "�����������ɂ�";
		mes "�n�[�u�̖����J���r�ł�";
		mes "�H�������ȁc�c";
		next;
		menu "�E�B�O�i�[�Ƃ̉Ƌ�ɂ���",-;
		mes "[�Ƌ�z�B��]";
		mes "�͂��A�ǂ����܂����H";
		mes "���������ĉ����Ƌ�ɖ��ł��H";
		mes "�󂯎��m�F�͂��܂������c�c";
		next;
		mes "[�Ƌ�z�B��]";
		mes "���������Ēǉ��̒����ł����H";
		mes "�E�B�O�i�[�Ƃ͂����ӂ���Ȃ̂�";
		mes "���Ƃ��������̂ł���";
		mes "���̉Ƌ�͓����ł���";
		mes "�����ɂ͔z�B�ł��Ȃ���ł���B";
		emotion 54;
		next;
		menu "�������܂���ł����H",-;
		mes "[�Ƌ�z�B��]";
		mes "�Ƌ�z�B���ɂ͓��ɂ́c�c";
		mes "����A������Ƒ҂Ă�B";
		mes "�m���c�c";
		next;
		mes "[�Ƌ�z�B��]";
		mes "�x�b�h�߂��̃e�[�u���̏�ɂ�����";
		mes "^0000cd�����Ȕ�^000000�ł����ˁH";
		mes "���ɔh��ȑ����͂Ȃ����B";
		next;
		menu "���Ԃ�A�����ł�",-;
		mes "[�Ƌ�z�B��]";
		mes "�v���o���܂����B";
		mes "����C�͂Ȃ��̂őf�p�ȕ��͋C�ł���";
		mes "����͋����̍�i�ł��傤�B";
		mes "�g��ꂽ�؍ނ������Ȃ��̂ł������A";
		mes "�����C�i������������̂ł����B";
		next;
		mes "[�Ƌ�z�B��]";
		mes "����[�A����͂����|�p�i�̈�ł���B";
		mes "�Ƌ����舵���Č��\�o���܂���";
		mes "����قǂ̕��͂�������";
		mes "���������Ȃ��ł��B";
		next;
		menu "�z�B����A���͂���܂������H",-;
		emotion 6;
		mes "[�Ƌ�z�B��]";
		mes "����Ⴛ���ł��傤�B";
		mes "��������ɕ�������ł��c�c�E";
		next;
		emotion 23;
		mes "[�Ƌ�z�B��]";
		mes "�c�c���������Ď����^���Ă܂�?!";
		mes "�׎Ԃɂ͂���ȕ���";
		mes "����܂���ł�����I";
		next;
		menu "�^���Ă���킯�ł͂���܂���",-;
		emotion 7;
		mes "[�Ƌ�z�B��]";
		mes "�܂��A���̂�����̎��ł�����";
		mes "���������Ȃ�΂Ƃ肠����";
		mes "���̂悤�ȉ��̎҂��^���̂ł��傤�B";
		mes "�������Ȃ������×~�ŕs�������ƁB";
		mes "�Ό�����Ȃ����B";
		next;
		emotion 7;
		mes "[�Ƌ�z�B��]";
		mes "�͂��A";
		mes "�����������̂���łȂ��Ă�";
		mes "�󂯓���鑤�����";
		mes "�����͕������Ȃ���ł���B";
		next;
		menu "���Ȃ������ł͂Ȃ��݂�Ȃɕ����Ă���",-;
		emotion 32;
		mes "[�Ƌ�z�B��]";
		mes "�ӂ��c�c";
		mes "���񂽂����̂�����̎g�����Ď����B";
		mes "�����ł��ˁB����Ȃ�c�c";
		mes "(�M������������)";
		mes "�����A�������肷���āc�c";
		mes "�߂܂����c�c";
		next;
		menu "�H�ו��͂���H",-;
		mes "[�Ƌ�z�B��]";
		mes "����Ȃ��̂�(�M����������)";
		mes "���̋C���������(�O����������)";
		mes "�Ƃł�(�M����������)";
		mes "�c�c�S�z���B";
		mes "���ꂶ��u�n�[�u�̖����J���r�v���B";
		next;
		menu "�J���r�͂��܂��ł����",-;
		mes "[�Ƌ�z�B��]";
		mes "�����A�ō��ɂ��܂��I";
		mes "^0000cd�n�[�u�̖����J���r1��^000000��";
		mes "���ł��܂��傤�I";
		emotion 29;
		delquest 14484;
		setquest 14485;
		set EP16_4QUE,10;
		close;
	case 10:
		if(countitem(12044) < 1) {
			mes "[�Ƌ�z�B��]";
			mes "�����Ă��܂������H";
			mes "�i�M���������������j";
			mes "�����|�ꂻ���ł��c�c";
			next;
			mes "[�Ƌ�z�B��]";
			mes "�ł��J���r�̓��������܂���ˁB";
			mes "^0000cd�n�[�u�̖����J���r1��^000000�ł���B";
			next;
			emotion 32;
			mes "[�Ƌ�z�B��]";
			mes "���y�R�ňӎ��s���ɂȂ�O��";
			mes "�����Ă��Ă��������B";
			mes "�i�M�������������j";
			close;
		}
		mes "[�Ƌ�z�B��]";
		mes "����������ł����B";
		mes "�i�M���������j";
		mes "���������ē|���O�ɗ����̂�";
		mes "�]�����܂���B";
		next;
		emotion 18;
		mes "[�Ƌ�z�B��]";
		mes "�ǂ�ǂ�A����͂��������I";
		mes "�����Ă����ĖႢ�܂��傤�I";
		mes "�Ȃ�ċv���Ԃ�Ȃ񂾂�I";
		next;
		mes "[�Ƌ�z�B��]";
		mes "10�N�O�ɐe���ƐH�ׂ�";
		mes "�J���r���v���o���c�c";
		mes "�e�����c�c�I";
		next;
		menu "���̌�",-;
		emotion 6;
		mes "[�Ƌ�z�B��]";
		mes "�����A���̔��Ȃ�i���������j";
		mes "�邩��o��Ƃ��Ɂi���������j";
		mes "�x�����ɉ׎ԁi���������j�c�c";
		next;
		mes "[�Ƌ�z�B��]";
		mes "���ق��فI";
		mes "�Ӂ[�A�A�ɓ����l�܂����B";
		mes "�܂��A�x�����ɉ׎Ԃ�";
		mes "�m�F���Ė������";
		mes "�x�����ɕ����Ă݂Ă���B";
		next;
		mes "[�Ƌ�z�B��]";
		mes "�����A�������B";
		mes "�Ƃ���Łi���������j";
		next;
		mes "[�Ƌ�z�B��]";
		mes "��ɏo���肵�Ă��邤����";
		mes "�����ɋ��񂾂̂����A";
		mes "�E�B�O�i�[�Ƃ̒����Ɋւ���";
		mes "�ςȉ\�������Ă���炵���B";
		next;
		menu "�\�H",-;
		emotion 20;
		mes "[�Ƌ�z�B��]";
		mes "�΂̖����Ƃ���ɉ��͗����ʁA";
		mes "�Ƃ���������Ȃ����B";
		mes "���ƂȂ��A���ȕ��͋C��";
		mes "�������������ł��������ƁB";
		next;
		mes "[�Ƌ�z�B��]";
		mes "���̎҂ł��鎄��";
		mes "����Șb�𕷂����Ƃ�������";
		mes "�閧�ɂ��Ă����B";
		next;
		menu "�J�g�����̎��쎩�����ƁH",-;
		mes "[�Ƌ�z�B��]";
		mes "������\�b����B";
		mes "^0000cd�C�ɂȂ�Ȃ�m�F���Ă݂�Ƃ����B^000000";
		mes "�Ƃɂ����A���̔���";
		mes "������������o��܂ł�";
		mes "�����ƃe�[�u���̏�ɂ�������B";
		delitem 12044,1;
		delquest 14485;
		setquest 14486;
		set EP16_4QUE,11;
		next;
		mes "�]���C�h���z�B�l��";
		mes "�@�J�g�������^���Ă���悤���B";
		mes "�@��x�����Q���ɕ񍐂��悤�]";
		next;
		mes "�]�����Q���̂Ƃ���Ɍ����������ȁH�]";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�����Q���ɉ�Ɍ��������]";
		close2;
		warp "prt_cas_q.gat",90,15;
		end;
	case 11:
		mes "[�Ƌ�z�B��]";
		mes "�����Y�ꕨ�ł����H";
		mes "��̌x�����ɂ�";
		mes "���������Ă݂܂������H";
		next;
		mes "[�Ƌ�z�B��]";
		mes "����Ƃ��܂��J���r��";
		mes "���炦���ł����ˁH";
		mes "����͔����������B";
		next;
		if(select("������Ȃ�","������") == 1) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]�����Q���ɉ�Ɍ��������]";
		close2;
		warp "prt_cas_q.gat",90,15;
		end;
	default:
		mes "[�Ƌ�z�B��]";
		mes "�ӂ��A����ō����̎d���͏I��肾�I";
		mes "�����̏��������̂����ɂ��Ă������B";
		next;
		mes "[�Ƌ�z�B��]";
		mes "���ƁA������������";
		mes "�Ȃɂ��H�ׂ�Ƃ��邩�ȁB";
		close;
	}
}

prt_cas_q.gat,150,122,4	script	�����鏗��#ep16wig	71,{
	switch(rand(2)) {
	case 0:
		emotion 14;
		mes "[�����鏗��]";
		mes "�����Q���l�͂����o�܂���";
		mes "�Ȃ�̂ł����H";
		mes "�����A�҂��������ł��I";
		next;
		mes "[����l�ȏ���]";
		mes "����23�Ԗځc�c";
		next;
		mes "[��r�ȏ���]";
		mes "�������ɂ͂���ł��邩����H";
		next;
		mes "[�[���ȏ���]";
		mes "23�ԖڂȂ獡������";
		mes "�����������܂����B";
		close;
	case 1:
		mes "[�����鏗��]";
		mes "�������͂���������̂́c�c";
		mes "���܂ő҂Ă΂����̂�����B";
		next;
		mes "[����l�ȏ���]";
		mes "�Ƃ肠�����e�B�[�^�C���͂������H";
		next;
		mes "[��r�ȏ���]";
		mes "�����x�݂܂����H";
		next;
		mes "[�[���ȏ���]";
		mes "������ƁA�����牽���������܂���H";
		close;
	}
}

prt_cas_q.gat,148,122,4	script	��r�ȏ���#ep16wig	68,{
	switch(rand(2)) {
	case 0:
		emotion 6,;
		mes "[��r�ȏ���]";
		mes "�����Q���l�݂͂�Ȃ̂��̂�I";
		mes "�N���̓Ƃ��߂ɂȂ���";
		mes "�����Q���l�Ȃ�Č������Ȃ��́I";
		next;
		mes "[����l�ȏ���]";
		mes "������I�@�݂�Ȃ̂��̂�I";
		next;
		mes "[�����鏗��]";
		mes "�����I�@�����I";
		next;
		mes "[�[���ȏ���]";
		mes "����A���͂����͎v���܂��񂯂ǁH";
		close;
	case 1:
		mes "[��r�ȏ���]";
		mes "�����Q���l��Ƃ��߂���̂�";
		mes "�V�������Ă����������܂���I";
		next;
		mes "[����l�ȏ���]";
		mes "���������Ȃ���I";
		next;
		mes "[�����鏗��]";
		mes "�����ɂȂ�Ȃ����B";
		mes "���ꂪ���Ȃ玄�͎��������܂���B";
		next;
		mes "[�[���ȏ���]";
		mes "�V���������Ȃ�";
		mes "�����񂶂�Ȃ��āH";
		close;
	}
}

prt_cas_q.gat,148,117,7	script	����l�ȏ���#ep16wig	91,{
	switch(rand(2)) {
	case 0:
		mes "[����l�ȏ���]";
		mes "�����Q���l�݂͂�Ȃ�";
		mes "�����ɂ��Ă����̂�����A";
		mes "���������t�F�A��";
		mes "�����삯�͂��Ȃ���";
		mes "�������ł��傤�I";
		mes "�����A����Ȃ����I";
		next;
		mes "[��r�ȏ���]";
		mes "����Ŏ��񂷂�悤�Ȃ�";
		mes "���߂���������肵�Ȃ��̂ł́H";
		next;
		mes "[�����鏗��]";
		mes "�����Q���l�͂Ȃ�";
		mes "��l��I��ł�";
		mes "��������Ȃ��̂�����c�c";
		next;
		mes "[�[���ȏ���]";
		mes "�Ƃ���Ń����Q���l��";
		mes "������������́H";
		close;
	case 1:
		emotion 7;
		mes "[����l�ȏ���]";
		mes "���������ǂȂ��H";
		mes "����A�J�g�����l�ɛZ�𔄂낤��";
		mes "������Ă����̂́I";
		mes "�����삯�͂��Ȃ��񑩂ł��傤�I";
		next;
		mes "[��r�ȏ���]";
		mes "�����Ⴀ��܂���I";
		mes "����ȖڂŌ��Ȃ��ł��������ȁI";
		next;
		mes "[�����鏗��]";
		mes "�܂��I�@���������N������ȁI";
		next;
		mes "[�[���ȏ���]";
		mes "�J�g�����l���D��������̂�";
		mes "�t���������̂���B";
		close;
	}
}

prt_cas_q.gat,150,117,7	script	�[���ȏ���#ep16wig	90,{
	switch(rand(2)) {
	case 0:
		mes "[�[���ȏ���]";
		mes "�����̂��Ȃ��I";
		mes "���߂ė����Ȃ炿����Ƃ�";
		mes "����̕��͋C��ǂ݂Ȃ�����I";
		next;
		mes "[����l�ȏ���]";
		mes "������I";
		mes "���f����I";
		next;
		mes "[�����鏗��]";
		mes "�ŏ���3������";
		mes "�������猩�邾���Ƃ���";
		mes "���[����m��܂���́H";
		next;
		mes "[��r�ȏ���]";
		mes "�����ŗ�𐮗����Ă����l��";
		mes "�ǂ��ɍs�����̂�����ˁB";
		close;
	case 1:
		emotion 7;
		mes "[�[���ȏ���]";
		mes "������ƁI�@�����Ȃ��ł�I";
		mes "���Ԃ����Ȃ����I";
		next;
		mes "[����l�ȏ���]";
		mes "����A";
		mes "���߂Ă̐l�͎��Ȑ\�������B";
		next;
		mes "[�����鏗��]";
		mes "��ɕ��Ԃ̂�";
		mes "��{���̊�{�ł����B";
		next;
		mes "[��r�ȏ���]";
		mes "�F����B";
		mes "���D�����̂ˁB";
		close;
	}
}

prt_cas_q.gat,146,121,4	script	�c�Ɏ҂̒j��#ep16wig	59,{
	emotion 28;
	mes "[�c�Ɏ҂̒j��]";
	mes "�����̏��������͕|���ł��c�c";
	mes "�\���͓f�����A��͗������c�c";
	next;
	switch(select("�����A������H","����΂�")) {
	case 1:
		emotion 7;
		mes "[�c�Ɏ҂̒j��]";
		mes "�����������͂�����Ă܂���";
		mes "�A��ɋA��܂����B";
		mes "���Ȃ��Ƃ������Q���l�ɉ�܂ł́I";
		next;
		emotion 14;
		mes "[�c�Ɏ҂̒j��]";
		mes "�{���̃����Q���l������܂ł�";
		mes "�A��܂���I";
		mes "�����I�@�A��܂���I";
		mes "���̂��߂ɓc�ɂ���";
		mes "�o�Ă����Ɓc�c";
		close;
	case 2:
		emotion 14;
		mes "[�c�Ɏ҂̒j��]";
		mes "�����ł��I";
		mes "���ׂĂ̓����Q���l��";
		mes "������邽��!!";
		mes "�����̕|���Ȃ��";
		mes "�Ȃ�ڂł��Ȃ��ł��I";
		close;
	}
}

prt_cas_q.gat,153,123,3	script	���{�x����#ep16wig01	105,{
	switch(rand(3)) {
	case 0:
		mes "[���{�x����]";
		mes "�����ɂȂ�΂킩��Ǝv���܂����A";
		mes "���̉Ɩ�ɂ͂�������";
		mes "���{�x�������ڗ��悤��";
		mes "�z������Ă��܂���B";
		next;
		mes "[���{�x����]";
		mes "�E�B�O�i�[�Ƃ̕����ɂ�";
		mes "�N������l���₦�܂���̂�";
		mes "���}�A��z���ꂽ�̂ł��B";
		close;
	case 1:
		emotion 25;
		mes "[���{�x����]";
		mes "������̕��I";
		mes "�����Ȃ��ł��������I";
		mes "�������̔ԍ�����";
		mes "�����т��������I";
		next;
		mes "[���{�x����]";
		mes "��������������œ|�ꂽ����";
		mes "�a�@�ɔ�������܂����I";
		mes "���̂��N�����Ȃ����߂�";
		mes "�����͂����肢���܂��I";
		close;
	case 2:
		emotion 54;
		mes "[���{�x����]";
		mes "�����������̂ł��B";
		mes "�����̗͂�����قǋ����Ƃ�";
		mes "�v���܂���ł����B";
		next;
		mes "[���{�x����]";
		mes "��������̏ꏊ�ł�";
		mes "���Ζ��ł������A";
		mes "�Ȃ���y�������߂��̂�";
		mes "����Ɖ���܂����B";
		mes "�Y��ȏ����������ƕ�����";
		mes "�u�肵���̂��^�̐s���ł����B";
		close;
	}
}

prt_cas_q.gat,153,116,1	script	���{�x����#ep16wig02	105,{
	switch(rand(3)) {
	case 0:
		emotion 7;
		mes "[���{�x����]";
		mes "����H�@������Ƃ����̌N�I";
		mes "���̑O�A�����ɐN�������҂��ȁI";
		mes "�҂āI";
		next;
		mes "[���{�x����]";
		mes "���[���A�܂�������ꂽ�B";
		mes "�Ȃ�ē��������B";
		mes "���͂���ȂƂ����";
		mes "���ĂȂ����낤�ȁB";
		close;
	case 1:
		emotion 28;
		mes "[���{�x����]";
		mes "�ŏ��ɉ��{�x�����ɂȂ�������";
		mes "�������炵�܂������A";
		mes "���̎d���͗񐮗��W�Ȃ̂�";
		mes "���{�x���Ȃ̂�����킩��܂���B";
		next;
		emotion 6;
		mes "[���{�x����]";
		mes "������ƁI";
		mes "�����ƕ���ł��������I";
		mes "�ʘH�͒ʂ��悤�ɁI";
		mes "�������������Ȃ�����";
		mes "���ɕ���ł��������I";
		close;
	case 2:
		emotion 36;
		mes "[���{�x����]";
		mes "�����I�@�Â��ɂ��Ă��������I";
		mes "���邳���ă����Q���l��";
		mes "���x�݂ɂȂ�Ȃ��Ƃ̂��Ƃł��I";
		next;
		mes "[���{�x����]";
		mes "����͑S�ă����Q���l�̂��߂ł��I";
		mes "�����Q���l���Q�s���ɂȂ�����";
		mes "�t�@���̊F������߂����ł��傤�I";
		close;
	}
}

prt_cas_q.gat,95,11,4	script(HIDDEN)	��r�ȏ���#ep16wig01	68,{
	mes "[��r�ȏ���]";
	mes "�����Q���l�͎���";
	mes "�ꏏ�ɂȂ�̂�c�c!!";
	close;
OnStart:
	initnpctimer;
	hideoffnpc "��r�ȏ���#ep16wig01";
	unittalk "��r�ȏ��� : �L���[�I�@�����Q���l!!�@�����Q���l!!�@�����Ă܂��I�@�����������āI�@�L���[!!";
	emotion 30,"��r�ȏ���#ep16wig01";
	end;
OnTimer22000:
	unittalk getnpcid(0,"�����Q���E�E�B�O�i�[#ep16wig"),"�����Q���E�E�B�O�i�[ : �����A���Ȃ��͂��̑O�́c�c�Ȃɂ���p�ł����H";
	end;
OnTimer24000:
	unittalk "��r�ȏ��� : �����Q���l�I�@���ƈꏏ�ɂȂ�܂��傤�I�@�i����!!";
	misceffect 343,"��r�ȏ���#ep16wig01";
	end;
OnTimer26000:
	unittalk getnpcid(0,"�����Q���E�E�B�O�i�[#ep16wig"),"�����Q���E�E�B�O�i�[ : ���[��A����͍���܂��ˁB";
	end;
OnTimer28000:
	hideoffnpc "���{�x����#ep16wig03";
	hideoffnpc "���{�x����#ep16wig04";
	unittalk getnpcid(0,"���{�x����#ep16wig03"),"���{�x���� : �s�[�b�I�@�܂��������I�@�߂܂���I";
	end;
OnTimer30000:
	unittalk getnpcid(0,"���{�x����#ep16wig04"),"���{�x���� : ���񖈉�A���������ǂ���������Ă���񂾁I";
	end;
OnTimer32000:
	unittalk getnpcid(0,"���{�x����#ep16wig03"),"���{�x���� : �܂ݏo���I";
	end;
OnTimer34000:
	unittalk "��r�ȏ��� : �����񃆃��Q���l�I�@�܂����܂��I";
	end;
OnTimer36000:
	hideonnpc "��r�ȏ���#ep16wig01";
	hideonnpc "���{�x����#ep16wig03";
	hideonnpc "���{�x����#ep16wig04";
	end;
OnTimer200000:
	stopnpctimer;
	end;
}

prt_cas_q.gat,94,12,4	script(HIDDEN)	���{�x����#ep16wig03	105,{}

prt_cas_q.gat,95,12,4	script(HIDDEN)	���{�x����#ep16wig04	105,{}

prt_cas_q.gat,98,23,1	script(HIDDEN)	�c�Ɏ҂̒j��#ep16wig01	59,{
	mes "[�c�Ɏ҂̒j��]";
	mes "�����Q���l�ƈ�����ł����c�c";
	mes "�������I";
	close;
OnStart:
	initnpctimer;
	hideoffnpc "�c�Ɏ҂̒j��#ep16wig01";
	unittalk "�c�Ɏ҂̒j�� : �����Q�c�c�����[��!!�@����!!";
	end;
OnTimer22000:
	unittalk "�c�Ɏ҂̒j�� : �Ȃ�ł���ȂƂ���o���!?";
	end;
OnTimer24000:
	unittalk "�c�Ɏ҂̒j�� : ���̏��I�@�ςȏꏊ�������₪���āI";
	end;
OnTimer26000:
	unittalk "�c�Ɏ҂̒j�� : �������������I";
	unittalk getnpcid(0,"�����Q���E�E�B�O�i�[#ep16wig"),"�����Q���E�E�B�O�i�[ : �j���̃t�@���̕��Ȃ̂͂킩��܂����A���ɉ�̂ɂ��̂悤�ȃp�t�H�[�}���X�͕K�v����܂����B�ł��A�������ł��ˁB";
	end;
OnTimer28000:
	unittalk "�c�Ɏ҂̒j�� : ���������Q�����c�c�����I�@�����I�@�����Q���l�I�@����I";
	end;
OnTimer31000:
	hideoffnpc "���{�x����#ep16wig05";
	hideoffnpc "���{�x����#ep16wig06";
	unittalk getnpcid(0,"���{�x����#ep16wig05"),"���{�x���� : �Ȃɂ��Ƃł����I";
	end;
OnTimer33000:
	unittalk getnpcid(0,"���{�x����#ep16wig06"),"���{�x���� : ���H�@�Ȃ�ł���ȂƂ��납��l���c�c�Ƃ肠�����m�ہI";
	end;
OnTimer35000:
	unittalk getnpcid(0,"���{�x����#ep16wig05"),"���{�x���� : �܂��������̒��ɂ͕ςȐl�������I";
	end;
OnTimer37000:
	unittalk getnpcid(0,"���{�x����#ep16wig06"),"���{�x���� : �܂ݏo���I";
	end;
OnTimer39000:
	unittalk "�c�Ɏ҂̒j�� : �������I �����Q���l��";
	end;
OnTimer41000:
	unittalk getnpcid(0,"�����Q���E�E�B�O�i�[#ep16wig"),"�����Q���E�E�B�O�i�[ : �Ώ��͂��Ƃ��c��Ȃ��悤���������₷�񂾂�`";
	end;
OnTimer43000:
	hideonnpc "�c�Ɏ҂̒j��#ep16wig01";
	hideonnpc "���{�x����#ep16wig05";
	hideonnpc "���{�x����#ep16wig06";
	end;
OnTimer200000:
	stopnpctimer;
	end;
}

prt_cas_q.gat,98,20,7	script(HIDDEN)	���{�x����#ep16wig05	105,{}

prt_cas_q.gat,96,22,7	script(HIDDEN)	���{�x����#ep16wig06	105,{}

comodo.gat,36,210,5	script(CLOAKED)	�E�B�O�i�[�Ƃ̎g���̎�#ep16wig	99,{
	mes "[�E�B�O�i�[�Ƃ̎g���̎�]";
	mes "�����Q���l�̂���ꏊ��";
	mes "�߂��܂����H";
	mes "���ē��������܂���B";
	next;
	if(select("������Ȃ�","������")==1) {
		mes "[�E�B�O�i�[�Ƃ̎g���̎�]";
		mes "�킩��܂����B";
		close;
	}
	mes "[�E�B�O�i�[�Ƃ̎g���̎�]";
	mes "���ē��������܂��B";
	close2;
	warp "prt_cas_q.gat",90,15;
	end;
}

comodo.gat,36,210,0	script	#wig_warp	139,10,10,{
OnTouch:
	if(EP16_4QUE >= 12)
		cloakoffnpc "�E�B�O�i�[�Ƃ̎g���̎�#ep16wig";
	end;
}

prt_cas.gat,107,225,5	script	�A�C�U�b�N�E�E�B�O�i�[#ep16wig01	10126,3,3,{
	cutin "16isa.bmp",1;
	mes "[�A�C�U�b�N]";
	mes "���͂͂́I";
	mes "���̕\�������Ȃ������̂�";
	mes "�c�O�ł��ˁI";
	mes "�������̂悤�ȏꂪ�����";
	mes "���Ў������������������B";
	next;
	cutin "16isa.bmp",255;
	mes "[�C�U�x��]";
	mes "����A�A�C�U�b�N�l��";
	mes "�������Z������";
	mes "���������Ă�";
	mes "���������邱�Ƃ�";
	mes "�ł��܂���ł��傤�B";
	next;
	mes "[�x�A�g���X]";
	mes "�����ł���I";
	mes "���̃v�����e���ŁA��ԖZ��������";
	mes "�O�{�̎w�ɓ���ł��傤�B";
	next;
	mes "[�\�t�B�A]";
	mes "�u���C�A����";
	mes "�A�C�U�b�N�l�ƈꏏ�B";
	mes "�A���Ă���̂�";
	mes "�����[��ł��́B";
	mes "���炵���ł���B";
	next;
	mes "[�u���C�A��]";
	mes "����A����́c�c";
	next;
	cutin "16isa.bmp",1;
	mes "[�A�C�U�b�N]";
	mes "�����ƁI�@����͂����";
	mes "�s�{�ӂȂ���";
	mes "�\�t�B�A�l�̊y�������Ԃ�";
	mes "�D���Ă��܂��Ă܂������I";
	mes "�ǂ������������������B";
	next;
	mes "[�A�C�U�b�N]";
	mes "�ł����������΂炭�����A";
	mes "�u���C�A���l�����݂����������܂����H";
	mes "���̏d�v�ȈČ����I�������A";
	mes "�����\�t�B�A�l�̂��߂�";
	mes "�S�͂�s�����悤�A";
	mes "�u���C�A���l�ɂ��肢���܂��傤�I";
	next;
	cutin "16isa.bmp",255;
	mes "[�\�t�B�A]";
	mes "����A���̖񑩁A";
	mes "����Ă��������܂����I";
	next;
	cutin "16isa.bmp",1;
	mes "[�A�C�U�b�N]";
	mes "���̃A�C�U�b�N�E�E�B�O�i�[��";
	mes "���Ɍ����āB";
	next;
	mes "[�C�U�x��]";
	mes "���̎��́A���̏��҂�";
	mes "���󂯂ɂȂ��Ă��������ˁB";
	mes "�y���݂ɂ��Ă��܂���B";
	cutin "16isa.bmp",255;
	close;
OnTouch:
	unittalk "�A�C�U�b�N : ���͂͂́I�@���̕\�������Ȃ������͎̂c�O�ł��ˁI",1;
	end;
}

prt_cas.gat,105,221,1	script	�C�U�x��#ep16wig	90,{
	mes "[�C�U�x��]";
	mes "���͏j������D���ł��I";
	mes "���ɉ��{�̏j���͉؂₩��";
	mes "����т₩�Łc�c�I";
	close;
}

prt_cas.gat,105,224,4	script	�x�A�g���X#ep16wig	91,{
	mes "[�x�A�g���X]";
	mes "���̂悤�ȏj�����J������";
	mes "�����͂܂����̏�����";
	mes "�s���`�F�b�N���܂��́B";
	next;
	mes "[�x�A�g���X]";
	mes "����┯�^�A�h���X�̐F�B";
	mes "��΂̑傫����J�b�g�̌`�B";
	mes "���ꂱ���ҏb�������炬��ƂˁB";
	close;
}

prt_cas.gat,107,222,1	script	�\�t�B�A#ep16wig	71,{
	mes "[�\�t�B�A]";
	mes "�v���Ԃ�̉��{�͂����ł���ˁB";
	mes "����������������ς��B";
	mes "�ł��c�c";
	next;
	mes "[�\�t�B�A]";
	mes "�݂Ȃ���A�Y��ɒ������Ă���";
	mes "�ƂĂ��P���Ă��܂��́B";
	mes "�@";
	mes "���͂����F������������c�c";
	next;
	mes "[�u���C�A��]";
	mes "����Ȃ��ƂȂ��I";
	mes "�N������Y�킾��I";
	mes "������l�̖ڂɂ�";
	mes "�N�����f��Ȃ��񂾁B";
	next;
	mes "[�\�t�B�A]";
	mes "����A����肾���Ɓc�c";
	close;
}

prt_cas.gat,108,223,3	script	�u���C�A��#ep16wig	995,{
	mes "[�u���C�A��]";
	mes "�����͂����Ȃ�����Ȃ��ł����B";
	mes "�ƂĂ��s���ɂȂ�񂾁B";
	next;
	mes "[�\�t�B�A]";
	mes "����I�@����������������";
	mes "���b���������ł���B";
	mes "���Ȃ����m�荇���̕���";
	mes "�y����ł�����Ⴂ�ȁB";
	next;
	mes "[�u���C�A��]";
	mes "�c�c�͂��A";
	mes "�l�̒m�荇����";
	mes "����d���̘b�������Ȃ��̂���B";
	mes "����ȏꏊ�ł܂�";
	mes "�������Ȃ��̂ɁB";
	next;
	mes "[�\�t�B�A]";
	mes "���ꂶ�ᎄ��";
	mes "���Ă�������Ⴂ�ȁB";
	next;
	mes "[�u���C�A��]";
	mes "�c�c������������";
	mes "�@";
	mes "�����������Ȃ́c�c";
	next;
	mes "[�\�t�B�A]";
	mes "�܂��I";
	mes "�킪�܂܂ˁB";
	mes "���ɂ����Ȃ狖���܂����ǁI";
	close;
}

prt_cas.gat,84,225,4	script	�����B�G���E�E�B�O�i�[#ep16wig01	10132,{
	mes "[�����B�G��]";
	mes "�}�N�V�[�~���A���l�A";
	mes "���@����낵�イ�������܂����H";
	mes "���H���t�l�̘b��";
	mes "�䂪���q�A�A�C�U�b�N����";
	mes "�x�X�����Ă��܂��B";
	next;
	mes "[�}�N�V�[�~���A��]";
	mes "���������܂ŁB";
	mes "�ǂ�����x�䂪�Ƃ�";
	mes "�K�₵�Ă��������B";
	mes "���҂����Ă��܂���B";
	close;
}

prt_cas.gat,85,225,4	script	�J�^���i�E�E�B�O�i�[#ep16wig01	71,{
	mes "[�J�^���i]";
	mes "�v���Ԃ�̉��{�ł��B";
	mes "�F�X�ƕς�����C�����܂��B";
	mes "���܂ɂ͖K�ꂽ���̂ł����c�c";
	next;
	mes "[�����B�G��]";
	mes "���҂��󂯂��";
	mes "�ǂ��ł͂Ȃ����B";
	mes "�K��͂���Ȃɓ���Ȃ���H";
	next;
	mes "[�J�^���i]";
	mes "�c�c���������b�ł͂Ȃ��̂ł��B";
	close;
}

prt_cas_q.gat,88,184,0	script	#ep16lug004	139,14,14,{
OnTouch:
	if(EP16_6QUE == 3) {
		cloakoffnpc "�}�C�A�[�E���x���u���O#ep16lug";
	} else if(EP16_6QUE > 7) {
		cloakonnpc "�w�����g�E���x���u���O#ep16lug";
		cloakonnpc "�}�C�A�[�E���x���u���O#ep16lug";
		cloakonnpc "�J���x����#ep16lug";
	}
	end;
}

prt_cas_q.gat,90,186,5	script	�}�N�V�[�~���A��#ep16lug	10133,{
	if(EP16_1QUE < 2) {
		end;
	}
	switch(EP16_6QUE) {
	case 0:
		mes "[�}�N�V�[�~���A��]";
		mes "�悤�����A�`���җl�B";
		mes "^0000cd���x���u���O^000000�Ƃ�";
		mes "���z�������������h�ł��B";
		mes "����^0000cd�}�N�V�[�~���A��^000000�Ɛ\���܂��B";
		next;
		menu "�����A�Ɏf���܂���",-;
		mes "[�}�N�V�[�~���A��]";
		mes "����͂킴�킴���肪�Ƃ��������܂��B";
		mes "�䂪���x���u���O�Ƃ�";
		mes "�������Ɩ�̈�ɂ��āA";
		mes "�×��A���[���~�b�h�K�b�c�����̂���";
		mes "�͂𒍂��ł���܂��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "����̉��ʌp���ɂ�";
		mes "�䂪�Ɩ�̌�p�ҁA";
		mes "^0000cd�w�����g�E���x���u���O^000000��";
		mes "���ʌp�����Ƃ��ĎQ�����܂��̂�";
		mes "�����X�A�����m�肨�������������";
		mes "�K���ł��B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "���߂܂��āB�Љ�ɂ���������";
		mes "^0000cd�w�����g�E���x���u���O^000000�Ɛ\���܂��B";
		next;
		menu "���A����",-;
		mes "[�w�����g]";
		mes strcharinfo(0)+"�a�B";
		mes "���������N�����Ɋ��􂵂�";
		mes "�`���҂ɂ���ł��A��ό��h�ł��B";
		next;
		cutin "16hel.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "������낵�����";
		mes "�������ȊO�̃��x���u���O�Ƃ̎҂ɂ�";
		mes "����Ă��������܂��ł��傤���B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�{���ł���Ύ������ē�����̂�";
		mes "��낵�����Ƃ͎v���܂����A";
		mes "���ʌp���̋V���̏�����";
		mes "����܂��āc�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes strcharinfo(0)+"�l";
		mes "�ł�����A";
		mes "�����R�ɂ��Ă���������";
		mes "��肠��܂���B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�c�c���ЁA�䂪��A";
		mes "^0000cd���H���t�E���x���u���O^000000�ɂ�";
		mes "����Ă���Ă��������B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�����ł��ȁB";
		mes "���j�̃��H���t�́A";
		mes "�����x���̔C�ŕs�݂̑���";
		mes "�w�����g�ɑ���A���̉Ƃ�";
		mes "�a�����Ă��܂��̂ŁA";
		mes "�F�X�b�𕷂��Ă��������Ɨǂ����ƁB";
		cutin "16hel.bmp",255;
		setquest 14495;
		set EP16_6QUE,1;
		close;
	case 1:
		mes "[�}�N�V�[�~���A��]";
		mes "������낵�����";
		mes "�������ȊO�̃��x���u���O�Ƃ̎҂ɂ�";
		mes "����Ă��������܂��ł��傤���B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�{���ł���Ύ������ē�����̂�";
		mes "��낵�����Ƃ͎v���܂����A";
		mes "���ʌp���̋V���̏�����";
		mes "����܂��āc�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes strcharinfo(0)+"�l";
		mes "�ł�����A";
		mes "�����R�ɂ��Ă���������";
		mes "��肠��܂���B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���j�̃��H���t�́A";
		mes "�����x���̔C�ŕs�݂̑���";
		mes "�w�����g�ɑ���A���̉Ƃ�";
		mes "�a�����Ă��܂��̂ŁA";
		mes "�F�X�b�𕷂��Ă��������Ɨǂ����ƁB";
		close;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		mes "[�}�N�V�[�~���A��]";
		mes "�䂪���x���u���O�Ƃ́A";
		mes "�����̉p�Y���B���w�����̎q���Ƃ���";
		mes "���[���~�b�h�K�b�c�����̌����Ɣ��W��";
		mes "�v�������Ǝ������Ă���܂��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "����䂦�A�q�ǂ������ɂ�";
		mes "����ɂ͋C����������ł�����";
		mes "��@�𖳎�������A";
		mes "�킪�܂܂��������Ƃ�����܂��āc�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���x���u���O�Ƃ̏K�킵����";
		mes "����������Ă���悤�ŐS�z�ł��B";
		mes "�͂��c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes strcharinfo(0)+"�l��";
		mes "�����s�����̂ł���΁A";
		mes "�\���󂠂�܂���B";
		mes "�ǂ������������������B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�ނ�́A";
		mes "�����A���̃��x���u���O�Ƃ�";
		mes "��\�ƂȂ�҂Ȃ̂ł����c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "��p�҂̒��j�͖�������ŉ߂����A";
		mes "���j�͂��Ƃ����낤��";
		mes "�ƕ������낻���ɂ����Ƃ��J���Ɓc�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�O�j�͉ɂ�����ΉƏo���A";
		mes "���H�n�ɂ���Z���Ă���l�q�Łc�c";
		mes "�Ď��͂��Ă��܂����A";
		mes "���̖ڂ��͂��Ȃ���������悤�ŁB";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�s�K���̍K�����A";
		mes "�����q�̃A�O�l�X������";
		mes "�ǂ��q�Ɉ���Ă���āA";
		mes "���������͈��S���Ă���܂��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "������";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�΂��Ƃ��";
		mes "�ǂ����G�k�������Ȃ�悤�ŁB";
		mes "���炵�܂����B";
		mes "�ǂ����s����Z���V���ڂ�̋Y����";
		mes "���������Ă���Ă��������B";
		close;
	case 8:
	case 9:
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�q�ǂ������ɂ�";
		mes "�D���ɂ��������܂����B";
		mes "�����ꎩ�������ŋC�Â��邾�낤�ƁB";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���ʂɊւ��Ă��A";
		mes "�w�����g���I�΂��\����";
		mes "�Ȃ��ɓ������Ǝv���A";
		mes "�D���ɂ����Ă����̂ł��B";
		mes "�푈�ɂ����͔��΂��܂������B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�������A�����Ȃ��";
		mes "������@��";
		mes "���ꂼ��̈ʒu��";
		mes "�Ƃ𗧂Ē����@��ɂ������Ǝv���܂��B";
		mes "�댯�͋@��Ȃ�A�Ƃ������܂�����ˁB";
		close;
	case 10:
		mes "[�}�N�V�[�~���A��]";
		mes "�w�����g����Ă��Ă��������B";
		mes "^0000cd�V���o���c�o���h�̍����t�߁A";
		mes "�������⏊^000000�ɂ���͂��ł��B";
		mes "���n�܂Ŏg���̎҂Ɉē������܂��傤�B";
		mes "�����͂�낵���ł����H";
		next;
		if(select("�����Ă�������","�҂��Ă�������")==2) {
			mes "[�}�N�V�[�~���A��]";
			mes "�������o������A";
			mes "���ɐ��������Ă��������B";
			close;
		}
		mes "[�}�N�V�[�~���A��]";
		mes "�萔�����������܂����A";
		mes "��낵�����肢���܂��B";
		close2;
		warp "yuno_fild01.gat",242,165;
		end;
	case 11:
		cutin "16wol_nor.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�����A�ǂ��ł������B";
		mes "���̗l�q�ł��ƁA";
		mes "�s���Ă��Ă����������悤�ł��ˁB";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�ł����c�c";
		mes "�w�����g�����܂���ˁc�c";
		mes "��͂肱���ɂ͗��Ȃ��ƁH";
		next;
		mes "�]�w�����g�̈ӎv��";
		mes "�@��p�҂Ɋւ���b��";
		mes "�@�}�N�V�[�~���A����";
		mes "�@���H���t�ɓ`�����]";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�w�����g���o�čs�����ƕ��������A";
		mes "�Ȃ�ƂȂ��������Ƃ͎v���܂������A";
		mes "���x���u���O�ƌ�p�҂̐Ȃ܂�";
		mes "�������Ă��܂��Ƃ́c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�ł����A�w�����g�̈ӎv�𑸏d���A";
		mes "�󂯓���܂��傤�B";
		mes "���@���݂āA���\�������Ǝv���܂��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�����ă��H���t�A";
		mes "���ꂩ��͂��O�����x���u���O�Ƃ�";
		mes "������̂��B";
		mes "�c�c�d�ׂɂȂ邩�������";
		mes "�s�͂��Ă���B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c";
		next;
		cutin "16wol_nor.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "���̂����ŁA�q�ǂ�������";
		mes "���܂�^���Ă��܂����ߋ����������̂�";
		mes "�Ȃ�ׂ��D���ɂ����Ă��܂������A";
		mes "����Ƃ킩�����C�����܂��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�V���������";
		mes "�V��������ɔC����ׂ����ƁB";
		mes "��������͎q�ǂ������̎��";
		mes "���x���u���O�Ƃ�";
		mes "�����Ă��炢�܂��傤�B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c���܂ŁA";
		mes "�Z�⑼�̎҂ɂ�";
		mes "���̂�����";
		mes "���v���Ă��܂��Ă��܂����B";
		next;
		mes "[���H���t]";
		mes "�����̉e����";
		mes "�嗤�̋��X�܂ŗ^����ɂ�";
		mes "�푈���ǂ����@������͂��ł��B";
		next;
		mes "[���H���t]";
		mes "�}�C�A�[�̌��t�ʂ�A";
		mes "���@��T���Ă݂܂��B";
		mes "�����ĕK�������܂��B";
		next;
		mes "[���H���t]";
		mes "������낵����΁A";
		mes "^0000cd�}�C�A�[�ɂ����̈ӎu��";
		mes "�`���Ă��������܂��񂩁B^000000";
		next;
		mes "[���H���t]";
		mes "�푈�͂�����߁A";
		mes "���悢���@�T���Ă���ƁB";
		mes "�����āA�܂��ȑO�̂悤��";
		mes "�Ƃɂ�����o���ė~�����ƁB";
		next;
		menu "�킩��܂���",-;
		mes "[���H���t]";
		mes "��낵�����肢���܂��B";
		delquest 14505;
		setquest 14506;
		set EP16_6QUE,12;
		next;
		cutin "16wol_nor.bmp",255;
		mes "�]�}�C�A�[��T���ɍs���܂����H�]";
		next;
		if(select("�T���ɍs��","�T���ɍs���Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���Ɍ��������]";
		close2;
		warp "prontera.gat",262,67;
		end;
	case 12:
		mes "[�}�N�V�[�~���A��]";
		mes "�}�C�A�[�Ƀw�����g�̘b��";
		mes "�`���Ă��������B";
		mes "�v�����e���̂ǂ����ɂ���͂��ł��B";
		next;
		mes "�]�}�C�A�[��T���ɍs���܂����H�]";
		next;
		if(select("�T���ɍs��","�T���ɍs���Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���Ɍ��������]";
		close2;
		warp "prontera.gat",262,67;
		end;
	case 13:
		mes "[�}�N�V�[�~���A��]";
		mes "��������Ⴂ�܂��A�`���җl�B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�}�C�A�[��";
		mes "�b�͓`���Ă��������܂������H";
		mes "�}�C�A�[�͂Ȃɂ������Ă��܂������H";
		next;
		cutin "16wol_nor.bmp",255;
		mes "�]���Ȃ��́A�}�C�A�[�̌��t��";
		mes "�@�}�N�V�[�~���A����";
		mes "�@�񍐂����]";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�����ł����B";
		mes "�푈��������߂ėǂ������B";
		mes "����M�����Ă���Ɓc�c";
		mes "�c�c�G�ɉ񂵂���ʓ|�Ȃ̂�";
		mes "���݂��l�ł����B�ӂӁB";
		next;
		mes "[���H���t]";
		mes "�������Ƃ��͎菕��";
		mes "�c�c�Ƃ�������";
		mes "���������Ƃɖ߂��Ă���";
		mes "�~�����̂ł����ˁB";
		next;
		mes "[���H���t]";
		mes "�܂��A�ȑO����";
		mes "�֌W�����P���ꂽ�悤�ŁA";
		mes "���҂��܂���B";
		next;
		mes "[���H���t]";
		mes "�ЂƂ܂���";
		mes "�j����������������";
		mes "�߂��Ă��邩�ȁB";
		next;
		mes "[���H���t]";
		mes "����܂ł�";
		mes "���}�̏��������Ȃ��Ă�";
		mes "�����܂���ˁB";
		next;
		cutin "16wol_nor.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�悩�����ł��B";
		mes "����Ɓc�c";
		mes "����ƁA�Ƒ����J��";
		mes "���߂����悤�ł��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���Ȃ��l�̂������ł��B";
		mes "���ꂩ��͂��ꂼ��̈ʒu��";
		mes "�Ɩ�Ɖ����̂��߂�";
		mes "�w�͂�ɂ��܂Ȃ��ł��傤�B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "���x���u���O�Ƃ̊�@���~���Ă�������";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "���ӂ̈�Ƃ��Ă�";
		mes "���Ȃ���������܂��񂪁c�c";
		next;
		mes "[���H���t]";
		mes "��������ǂ����󂯎���Ă��������B";
		next;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		cutin "16wol_nor.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "���x���u���O�Ƃ̏������K�v�ł�����";
		mes "���ł����炵�Ă��������B";
		mes "�䂪���x���u���O�Ƃ̔���";
		mes "���ł��J���Ă���܂��B";
		delquest 14507;
		setquest 201885;
		set EP16_6QUE,14;
		getitem 6919,30;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		close;
	case 14:
		mes "[�}�N�V�[�~���A��]";
		mes strcharinfo(0)+"�l�ɂ�";
		mes "�{���Ɋ��ӂ��Ă���܂��B";
		mes "���Ȃ��̂������ŁA";
		mes "���x���u���O�Ƃ�";
		mes "��������߂�����܂��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�䂪���x���u���O�Ƃ́A";
		mes "���܂Ō݂��ɐM���邱�Ƃ��ł����A";
		mes "�n�����������Ă��܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�ł����������v�ł��B";
		mes "���肪�Ƃ��������܂��B";
		close;
	}
}

prt_cas_q.gat,90,184,7	script	�w�����g�E���x���u���O#ep16lug	10127,{
	switch(EP16_6QUE) {
	case 0:
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�ǂ����A";
		mes "�w�����g�E���x���u���O�Ɛ\���܂��B";
		next;
		mes "[�w�����g]";
		mes "�Ƃ̂��ƂȂ玄�����A";
		mes "^0000cd������ɂ��鎄�̑c����";
		mes "^0000cd�����Ă��������B^000000";
		mes "�����͂܂Ƃ��Șb��������ł��傤�B";
		close2;
		cutin "16hel.bmp",255;
		end;
	case 1:
	case 2:
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "���̒�A^0000cd���H���t�E���x���u���O^000000�ɂ�";
		mes "����ɂȂ�܂������H";
		next;
		mes "[�w�����g]";
		mes "�������ɂ������Ă���ԁA";
		mes "��ɂ̓��x���u���O�Ƃ̑�����";
		mes "�C���Ă��܂��̂ŁA";
		mes "�F�X�����Ă��������Ɨǂ����ƁB";
		close2;
		cutin "16hel.bmp",255;
		end;
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�v���Ԃ�ɉƂɖ߂�܂����B";
		mes "�Ƒ��̊������܂������A";
		mes "�䂪�ƂƂ������̂͗ǂ��ł��ˁB";
		next;
		mes "[�w�����g]";
		mes "�c�c�������A�����̎���";
		mes "�����X�^�[�̊댯�ɎN����Ă���";
		mes "���̒��Ԃ̂��Ƃ��l����ƁA";
		mes "�S�͂Ђǂ��d���Ȃ�܂��B";
		next;
		mes "[�w�����g]";
		mes "�ꍏ�������j�����I����";
		mes "���ɖ߂肽���ł��ˁB";
		mes "�����͎��ɂ͏��������ł��B";
		close2;
		cutin "16hel.bmp",255;
		end;
	}
}

prt_cas_q.gat,86,180,7	script	�J���x����#ep16lug	962,{
	if(EP16_6QUE < 8) {
		mes "[�J���x����]";
		mes "����ɂ��́B";
		mes "���̓w�����g�l�̕t���l";
		mes "^0000cd�J���x����^000000�Ɛ\���܂��B";
		next;
		mes "[�J���x����]";
		mes "�����߂��̐���";
		mes "�w�����g�l�̂����b�����Ă����������A";
		mes "���܂Ƀv�����e���ɗ����";
		mes "�ǂ����Ȃ��߂܂���B";
		next;
		mes "[�J���x����]";
		mes "���{�̋M���≤���̊F�l��";
		mes "�v���b�V���[�������܂����c�c";
		next;
		mes "[�J���x����]";
		mes "�w�����g�l���A";
		mes "�����ł͉����̈���Ƃ���";
		mes "�߂�����Ă��āc�c";
		mes "�����ƈႤ�p��";
		mes "�Ȃ񂾂����������܂��B";
		next;
		mes "[�J���x����]";
		mes "���ł͈ꕺ�m�ɂ��A���g���ɂ�";
		mes "�����u�ĂȂ��ڂ��Ă���������ŁA";
		mes "�F�A�w�����g�l���D���Ȃ�ł��B";
		next;
		mes "[�J���x����]";
		mes "���������X�^�[�̏P����";
		mes "���e�������āc�c�w�����g�l��";
		mes "��������Ă����������̂ł��B";
		next;
		mes "[�J���x����]";
		mes "���̉��ɕ񂢂邽�߂ɁA";
		mes "�����b�������Ă��������Ă���܂��B";
		next;
		mes "[�J���x����]";
		mes "�����������ł�";
		mes "�w�����g�l��������������O��";
		mes "���ݕ����^�Ԃ��炢����";
		mes "��邱�Ƃ�����܂���B";
		next;
		mes "[�J���x����]";
		mes "�j���������I����Ăق����ł��ˁc�c";
		next;
		mes "[�J���x����]";
		mes "�����A�����ăw�����g�l��";
		mes "�����ɂȂ��Ăق����Ȃ��A�Ƃ��ł�";
		mes "�Ȃ��̂ł���B";
		mes "�����A�Ȃ񂾂������͋����Łc�c";
		close;
	}
}

prt_cas_q.gat,92,182,7	script(CLOAKED)	�}�C�A�[�E���x���u���O#ep16lug	10129,{
	cutin "16mye_nor.bmp",1;
	mes "[�}�C�A�[]";
	mes "�v���Ԃ�̉䂪�Ƃ͈��炬�܂��ˁB";
	mes "�����������ł����B";
	next;
	mes "[�}�C�A�[]";
	mes "�������Ȃ��Ă����͂Ȃ����낤����";
	mes "�S�z�͂��Ă��Ȃ������̂ł����A";
	mes "�c���������΂Ȃ̂�";
	mes "�����C������ŁB";
	mes "�܂��A�F���C�����ň��S���܂�����B";
	next;
	mes "[�}�C�A�[]";
	mes "�₵���C�������͂��܂����ˁB";
	mes "�͂́c�c�B�Ƃ��o�čs������O�A";
	mes "����������ł͂Ȃ��̂ł����B";
	close2;
	cutin "16mye_nor.bmp",255;
	end;
}

prt_cas_q.gat,96,186,3	script	���H���t�E���x���u���O#ep16lug	10128,{
	switch(EP16_6QUE) {
	case 0:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "���x���u���O�Ƃɂ��K�₢������";
		mes "���肪�Ƃ��������܂��B";
		mes "���x���u���O�Ƃ̒��ł���A";
		mes "���̑c����";
		mes "^0000cd�}�N�V�[�~���A��^000000�ɂ�";
		mes "����Ă��������܂������H";
		next;
		mes "[���H���t]";
		mes "�܂��ł�����A����";
		mes "����Ă������������ł��B";
		mes "�c���͖`���җl�Ƙb���邱�Ƃ�";
		mes "�ƂĂ��y���݂ɂ��Ă���܂��B";
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	case 1:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "���x���u���O�Ƃɂ��K�₢������";
		mes "���肪�Ƃ��������܂��B";
		mes "���̓��x���u���O�Ƃ̎��j�A";
		mes "^0000cd���H���t�E���x���u���O^000000�Ɛ\���܂��B";
		next;
		mes "[���H���t]";
		mes "��X���x���u���O�Ƃ́A�����̉p�Y";
		mes "���B���w�����E���x���u���O��";
		mes "�ӎu���p���A";
		mes "���_�Ɛ��`�Ɠ`���̎��̂��߁A";
		mes "簐i���Ă���܂��B";
		next;
		mes "[���H���t]";
		mes "���[���~�b�h�K�b�c�����ȗ��A";
		mes "�䂪�Ɩ�̑����̎҂�����";
		mes "���̂��߂ɐs�͂��Ă������j��";
		mes "���͂ƂĂ��ւ炵���v���܂���B";
		next;
		mes "[���H���t]";
		mes "�����č��A���̌Z��";
		mes "^0000cd�w�����g�E���x���u���O^000000��";
		mes "���ʌp���̌��Ƃ���";
		mes "�F�Ɋ��҂���Ă���܂��B";
		mes "�Z�ɂ͂���ɂȂ�܂������H";
		next;
		switch(select("�͂�","������")) {
		case 1:
			mes "[���H���t]";
			mes "���\�Ȃ��Ƃł��B";
			mes "�����ƌZ�́A���̍��̉��ɂȂ��l��";
			mes "�����������������Ƃł��傤�B";
			break;
		case 2:
			mes "[���H���t]";
			mes "�ӂӁA�Ƃڂ���̂�";
			mes "���ȕ��ł��ˁB";
			mes "�����قǃ��x���u���O�Ƃ̓����";
			mes "���Ɉ��A���Ă���̂�";
			mes "���Ă��܂���B";
			next;
			mes "[���H���t]";
			mes "�Z�͂�����";
			mes "���̍��̉��ɂȂ��ł��傤�B";
			break;
		}
		next;
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�`���җl�A�����ɂ��ڂɂ�����܂��B";
		mes "�킽�����A";
		mes "^0000cd�A�O�l�X�E���x���u���O^000000�Ɛ\���܂��B";
		mes "�Z��̒��ł͈�Ԗ��ŁA";
		mes "�����ɂȂ�܂��B";
		next;
		mes "[�A�O�l�X]";
		mes "�b�͕ς��܂����A�`���җl��";
		mes "�j���̃p�[�g�i�[�͂����܂�ł��́H";
		mes "���͂킽�����A�܂��p�[�g�i�[��";
		mes "���܂��Ă���܂���́c�c";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�A�O�l�X�A����";
		mes "���̂悤�Șb�������ł͂Ȃ��̂��B";
		mes "�������x���u���O�Ƃɂ��Ă�";
		mes "�������c�c";
		next;
		cloakoffnpc "�}�C�A�[�E���x���u���O#ep16lug";
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "���ꂶ����������삳���";
		mes "���Ƌ��ɎQ��܂��񂩁H";
		next;
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�������I�@�}�C�A�[�Z�I";
		next;
		mes "[�A�O�l�X]";
		mes "�A���Ă����̂ˁI";
		mes "��������Ȃ����I";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�����A���傤�ǂ����Ƃ���ɁB";
		mes "�ނ͉䂪��A�O�j��";
		mes "^0000cd�}�C�A�[�E���x���u���O^000000�Ɛ\���܂��B";
		next;
		mes "[���H���t]";
		mes "�����ԉƂ𗣂�Ă��܂�����";
		mes "����ƋA���Ă����悤�ł��B";
		mes "�c�c�A���Ă����񂾂�ȁH";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�������炢�́B";
		mes "�v�����e���̘H�n���ɂ܂�";
		mes "^0000cd�푈�ɋ��������Z�Ƌ��ɑ��������Z��";
		mes "^0000cd���ʌp���̂��߂Ɏ��g��^000000����";
		mes "�b���`����Ă��ĂˁB";
		next;
		mes "[�}�C�A�[]";
		mes "������A���Ă����̂��B";
		mes "���i�͖ڂ����킹�Ȃ��Z�킪";
		mes "�����Ȃ蒇�ǂ����������B";
		mes "����������Ȃ��킯�ɂ�";
		mes "�����Ȃ����낤�H";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c���t��T�߁B";
		mes "^0000cd�Ƃ��o�ĕs�ǂƂ��ł���^000000�Ƃ��Ă�";
		mes "���̏ꏊ�܂Ŕ��������H�n��";
		mes "���߂�K�v�͂Ȃ��B";
		mes "�������O�̍s����m��Ȃ��Ƃł�";
		mes "�v���Ă����̂��H";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�ւ��`�H�@����{�C�Ō����Ă�H";
		mes "�������܂₨�O�����肱��";
		mes "�Ď����������̂́A";
		mes "���H�n�̎q�ǂ��ł��m���Ă邺�B";
		next;
		mes "[�}�C�A�[]";
		mes "�����̍��M�ȌZ�ɂ́A";
		mes "���̌��t������";
		mes "�������Ɗ�����悤�����ǁA";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "���Z�Ǝ��g���";
		mes "^0000cd�w�����g�Z�����ɂȂ��^000000�A";
		mes "^0000cd����ȊO�A������^000000";
		mes "^0000cd���H�n�Ɠ����ɂȂ�^000000���낤����A";
		mes "�����畷���Ȃꂽ�����ǂ��񂶂�Ȃ��H";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "����A�����̌Z�l�����ɂ�";
		mes "�����A�푈�œ��������";
		mes "�����鉹�����������Ȃ����`�B";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c���ق���B";
		mes "����ɂ��O�Ă΂��͂�߂�񂾁B";
		mes "�����ǂ���l���낤�B";
		mes "���̂悤�ȕi�̂Ȃ�";
		mes "���t�����͂�߂�񂾁B";
		next;
		cutin "16agn_ang.bmp",2;
		mes "[�A�O�l�X]";
		mes "������߂Ă�I";
		mes "�Ȃ�ŃP���J�΂��肷���!?";
		next;
		mes "[�A�O�l�X]";
		mes "����ɍ����͏j������Ȃ������́H";
		mes "���������`���җl��";
		mes "���炵�Ă����������̂ɁI";
		mes "�����������ĂȂ�Ǝv���Ă邩����I";
		mes "�C�i�̌��Ђ��Ȃ���!!";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�����A�������ˁB";
		mes "�ǂ���珵���ꂴ��q����������";
		mes "�������狎������悳�������B";
		mes "�A�O�l�X�A�܂���łȁB";
		next;
		cloakonnpc "�}�C�A�[�E���x���u���O#ep16lug";
		cutin "16agn_ang.bmp",2;
		mes "[�A�O�l�X]";
		mes "�c�c";
		next;
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�c�c�����A���炵�܂���B";
		mes "���������ĎQ��܂��c�c�B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c���ꂵ���Ƃ�������������Ă��܂�";
		mes "�\���󂠂�܂���B";
		mes "�}�C�A�[�͉Ƃ��璷������Ă����̂�";
		mes "��V��Y��Ă���悤�ł��B";
		next;
		mes "[���H���t]";
		mes "��ł��l�тɍs���悤�b���Ă����܂��B";
		mes "���Ƃ��Ƃ��̂悤�Ȑ��i�ł�";
		mes "�Ȃ��̂ł����c�c�ǂ������e�͂��B";
		next;
		menu "�͂�",-;
		mes "[���H���t]";
		mes "���������Ă���������Ə�����܂��B";
		mes "�Ƃ���ł����Ԃ�����悤�ł�����A";
		mes "����܂�Ă��������Ă�";
		mes "��낵���ł��傤���B";
		next;
		menu "�Ȃ�ł��傤",-;
		mes "[���H���t]";
		mes "�E�B�O�i�[�ƂɖK�₢�������A";
		mes "^0000cd�A�C�U�b�N�E�E�B�O�i�[�l^000000���";
		mes "����i����";
		mes "�󂯎���Ă������������̂ł��B";
		next;
		mes "[���H���t]";
		mes "�{���Ȃ�A�����s���\��ł�����";
		mes "�}�C�A�[�̂��Ƃ�";
		mes "�c���ɓ`���Ă����K�v��";
		mes "����悤�ł��B";
		mes "������A�ł��邾�������B";
		next;
		if(select("�����ł���","�Ȃ��H")==2) {
			cutin "16wol_ang.bmp",2;
			mes "[���H���t]";
			mes "�c�c���ӂ͂���܂����B";
			mes "�킪�����Ɋ�����������R��";
			mes "�䂪�Ƃ̖��ɓD��h��悤��";
			mes "���̂ł�����ˁB";
			mes "�c���͂��̉Ƃ̓���B";
			mes "�񍐂͓��R�ł��傤�H";
			next;
		}
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�`���җl�́A�j����";
		mes "���҂���邾���̐M���ɒl������B";
		mes "�A�C�U�b�N�l��";
		mes "�������Ă��炦��ł��傤�B";
		next;
		menu "�킩��܂���",-;
		mes "[���H���t]";
		mes "���肪�Ƃ��������܂��B";
		mes "�A�C�U�b�N�E�E�B�O�i�[�l��";
		mes "�E�B�O�i�[�Ƃ��؍݂��Ă���";
		mes "�����ɂ���������悤�ł��B";
		mes "��낵�����肢���܂��B";
		next;
		delquest 14495;
		setquest 14496;
		delquest 73055;
		delquest 7682;
		setquest 7685;
		set EP16_6QUE,2;
		if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
			mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
			mes "�@�x���̂Ƃ���ɖ߂낤�]";
		} else {
			mes "�]^0000cd���x���u���O�ƂƂ̈��A���ς܂����B^000000";
			mes "�@���̉��Ƃɂ����A�ɍs�����]";
		}
		next;
		mes "�]�܂��A���H���t����";
		mes "�@^0000FF���x���u���O�Ƃ��J�N�G�X�g^000000";
		mes "�@���󒍂����B���̃N�G�X�g��";
		mes "�@�i�s����̂��悢���낤�]";
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	case 2:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�A�C�U�b�N�l���";
		mes "�i�����󂯎���Ă��Ă��������B";
		mes "��낵�����肢���܂��B";
		next;
		mes "[���H���t]";
		mes "�E�B�O�i�[�Ƃ��؍݂���Ă���̂�";
		mes "^0000cd�L���ɏo�ē�A��������̕���^000000�ł��B";
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	case 3:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�`���җl�A";
		mes "���肢���Ă����i�́c�c";
		mes "�����A����ł��ˁB";
		next;
		cutin "16wol_nor.bmp",255;
		mes "�]�A�C�U�b�N�E�E�B�O�i�[����";
		mes "�@�a�������i����";
		mes "�@���H���t�ɓn�����]";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "����A����́c�c";
		mes "���Ɍ����������Ă���悤�ł��ˁB";
		mes "^0000cd�p�X���[�h�̐���^000000����͂��邱�Ƃ�";
		mes "�J���悤�ł��B";
		next;
		mes "[���H���t]";
		mes "�c�c�ӂނӂށA";
		mes "�ǂ����^0000cd�����Ɛ�^000000��������";
		mes "�E�B�O�i�[�Ƃ̃E�B�b�g��";
		mes "�܂܂ꂽ���̂ł��ˁB";
		next;
		mes "[���H���t]";
		mes "�Ƃ���Ɓc�c�Ȃ�قǁB";
		mes "�����^0000cd�����䗦^000000�������ł��B";
		mes "��ԍŏ��̕����́u^0000cd1^000000�v�B";
		mes "�`���җl�A";
		mes "�����͂��킩��ł����H";
		next;
		menu "���[�Ɓc�c",-;
		input '@str$;
		cutin "16wol_nor.bmp",255;
		if('@str$ == "1618") {
			mes "�]���Ȃ���";
			mes "�@�u^0000cd1618^000000�v�Ɠ��͂����B";
			mes "�@�J�`���Ə����ȉ���";
			mes "�@��l�̊Ԃɋ����]";
			next;
			cutin "16wol_nor.bmp",2;
			mes "[���H���t]";
			mes "�����A�J���܂����ˁI";
			mes "�������`���җl�B";
			mes "�����ł���������悤���B";
			next;
			mes "[���H���t]";
			mes "�����Ē��ɂ���̂́c�c";
			mes "������ł��B";
		} else {
			mes "�]���Ȃ���";
			mes "�@�u^0000cd"+ '@str$ +"^000000�v�Ɠ��͂����B";
			mes "�@���͂Ȃ�̔����������Ȃ��]";
			next;
			cutin "16wol_nor.bmp",2;
			mes "[���H���t]";
			mes "�ӂӁA�`���җl�ɂ�";
			mes "�킩��Ȃ����Ƃ�����悤���B";
			mes "���̃p�X���[�h�̓����́u^0000cd1618^000000�v�ł���B";
			mes "�@";
			mes "�]���H���t����������͂����";
			mes "�@�����ȉ�����l�̊Ԃɋ������]";
			next;
			mes "[���H���t]";
			mes "�����A�J���܂����B";
			mes "�����Ē��ɂ���̂́c�c";
			mes "������ł��B";
			next;
		}
		mes "�]���H���t�͏��r�����o��";
		mes "�@�ǂ�������悤�A";
		mes "�@���������ʒu�֌f�����]";
		next;
		mes "[���H���t]";
		mes "���̏����ȕr�ɋl�܂������̂́A";
		mes "���ꂩ��̐퓬��";
		mes "�푈�̐}��ς��Ă��܂��ł��傤�B";
		mes "�܂�����i�ł����B";
		next;
		mes "[���H���t]";
		mes "�`���җl�ɂ��肢���Đ����ł����ˁB";
		mes "��V�͕K����A���C�ɏ������̂�";
		mes "���������Ă��������܂��B";
		next;
		menu "��낵��",-,"�����܂��Ȃ�",-;
		mes "[���H���t]";
		mes "����Ɓc�c";
		mes "�A�C�U�b�N�l�͂Ȃɂ�";
		mes "����������Ă��܂������H";
		next;
		menu "�`����`����",-;
		cutin "16wol_ang.bmp",2;
		mes "�]���Ȃ���";
		mes "�@�A�C�U�b�N�̓`����";
		mes "�@���H���t�ɓ`�����]";
		next;
		mes "[���H���t]";
		mes "�Z����Ɋւ���\�c�c�ł����B";
		next;
		mes "[���H���t]";
		mes "�c�c";
		mes "�}�C�A�[��������������R�Ƃ����A";
		mes "��̂Ȃɂ��c�c";
		mes "����͊m�F����K�v������܂��ˁB";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c���́A";
		mes "�`���җl�c�c";
		next;
		menu "�͂�",-;
		mes "[���H���t]";
		mes "������x�A���肢�����Ă�";
		mes "��낵���ł��傤���B";
		mes "���̉\�ɂ���";
		mes "���ׂĂ������������̂ł��B";
		next;
		mes "[���H���t]";
		mes "���낢��ȏꏊ��K���`���җl�Ȃ�";
		mes "�����̏��𓾂邱�Ƃ�";
		mes "�ł���ł��傤���A";
		mes "�Ȃɂ�莄���M���ł�����ł��̂ŁB";
		next;
		mes "[���H���t]";
		mes "�����ł����d�����R�ς݂Ȃ̂ɁA";
		mes "�����A���Ă��邵�c�c�B";
		mes "���Z�����Ȃ�";
		mes "�f���Ă��������Ă����v�ł��B";
		next;
		if(select("�킩��܂���","���ł�") == 2) {
			mes "[���H���t]";
			mes "�����ł����B";
			mes "�c�c�����A�f���Ă��������ėǂ���";
			mes "�������͎̂��ł��B";
			mes "�����͌����܂���B";
			next;
			mes "[���H���t]";
			mes "�c�c�ł����A����";
			mes "�������󂯂ł���悤�ł�����";
			mes "���ɋ����Ă��������B";
			close2;
			cutin "16wol_nor.bmp",255;
			end;
		}
		mes "[���H���t]";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		mes "�\�b�Ȃ�c�c";
		mes "�܂��͎q�ǂ��𒲂ׂ�Ɨǂ��ł��傤�B";
		mes "^0000cd�v�����e���̋󂫒n^000000�Ȃǂ�";
		mes "�悭�V��ł���悤�ł��̂�";
		mes "����Ă݂Ă��������B";
		next;
		if(countitem(6930) > 0)
			delitem 6930,1;
		delquest 14497;
		setquest 14498;
		set EP16_6QUE,4;
		cutin "16wol_nor.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "�i�v�����e���̋󂫒n���c�c";
		mes "�@�������v�����e���̓쓌�̕�";
		mes "�@���������ȁH�j";
		next;
		if(select("�ړ�����","�ړ����Ȃ�") == 2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���̋󂫒n��";
		mes "�@���������]";
		close2;
		warp "prontera.gat",262,67;
		end;
	case 4:
	case 5:
	case 6:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�v�����e���ł����₩��Ă���";
		mes "���x���u���O�Ƃ̉\�́A";
		mes "�ǂ̂悤�Ȃ��̂ł������H";
		next;
		mes "[���H���t]";
		mes "�\�b�Ȃ�c�c";
		mes "�܂��͎q�ǂ��𒲂ׂ�Ɨǂ��ł��傤�B";
		mes "^0000cd�v�����e���̋󂫒n^000000�Ȃǂ�";
		mes "�悭�V��ł���悤�ł��̂�";
		mes "����Ă݂Ă��������B";
		next;
		cutin "16wol_nor.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "�i�v�����e���̋󂫒n���c�c";
		mes "�@�������v�����e���̓쓌�̕�";
		mes "�@���������ȁH�j";
		next;
		if(select("�ړ�����","�ړ����Ȃ�") == 2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e���̋󂫒n��";
		mes "�@���������]";
		close2;
		warp "prontera.gat",262,67;
		end;
	case 7:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "���A��Ȃ����B";
		mes "�ǂ���炨���̂悤�ł��ˁB";
		mes "���x���u���O�Ƃ̉\�ɂ���";
		mes "���ׂĂ��������܂������H";
		next;
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�\�b�ł����āH";
		mes "����͂ǂ̂悤�Ȃ��b�ł��́H";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�c�c�����A";
		mes "��قǂ��O�ɕ������\���ȁA���H���t�B";
		mes "�v�����e���ł����₩��Ă���Ƃ����B";
		next;
		cutin "16hel.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "���������ׂɂȂ�ꂽ�̂ł����H";
		mes strcharinfo(0)+"�l�B";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�ւ��A��������������ȁB";
		cloakoffnpc "�}�C�A�[�E���x���u���O#";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�}�C�A�[�B";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "�Ȃ񂾁H";
		mes "���́A���ɉ�ɂ����񂾁B";
		mes "���܂�������Ƃ�����";
		mes "������ʖڂƂ͌���Ȃ���ȁB";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c";
		mes "�@";
		mes "�]���H���t�͂��ߑ���";
		mes "�@������]";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�`���җl�B";
		mes "�����̕񍐂����Ă��������܂����H";
		next;
		if(select("�킩��܂���","�����Řb�����Ă��H")==2) {
			cutin "16hel.bmp",0;
			mes "[�w�����g]";
			mes "��肠��܂���B";
			mes "���x���u���O�Ƃ̘b�ł�����A";
			mes "�݂ȕ����K�v������܂��B";
			next;
		}
		cutin "16wol_nor.bmp",255;
		mes "�]���Ȃ��͎q�ǂ��B�̘b��";
		mes "�@���e�������a�炰�ē`�����]";
		next;
		cutin "16agn_ang.bmp",2;
		mes "[�A�O�l�X]";
		mes "�܂��A�푈�Ȃ�āI";
		mes "����Ȃ��Ƃ�����";
		mes "�N����т܂��́H";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c�Ȃ�قǁA";
		mes "�����̉\�b�ɂ��Ă�";
		mes "���ӂ���������قǂɋ�̓I�ł��ˁB";
		next;
		mes "[���H���t]";
		mes "�������A";
		mes "�\�𗬂����̂�";
		mes "�ǂ����A���x���u���O�Ƃ�";
		mes "�ǂ��m���Ă���҂̂悤���B";
		next;
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "���H���t�Z�I";
		mes "���������܂��́H";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�������A���O��";
		mes "�^���Ă͂��Ȃ���B";
		mes "�A�O�l�X�B";
		mes "���O������Ȃ��Ƃ�����Ƃ͎v��Ȃ��B";
		next;
		mes "[���H���t]";
		mes "�������c�c";
		mes "�@";
		mes "�]���H���t�͐Â���";
		mes "�@�}�C�A�[�Ɏ������������]";
		next;
		mes "[���H���t]";
		mes "�c�c^0000cd�}�C�A�[�H";
		mes "�ǂ��܂Ń��x���u���O�̖���";
		mes "�D��h��������Ȃ񂾁H^000000";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�������ˁc�c";
		mes "�K�v�ȕ������A���ȁH";
		next;
		emotion 23,"�}�N�V�[�~���A��#ep16lug";
		emotion 23,"���H���t�E���x���u���O#ep16lug";
		emotion 23,"�A�O�l�X�E���x���u���O#ep16lug";
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�}�C�A�[�A�{���ɂ��O���H";
		next;
		cutin "16agn_ang.bmp",2;
		mes "[�A�O�l�X]";
		mes "�}�C�A�[�Z!?";
		next;
		cutin "16agn_ang.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�}�C�A�[�c�c�{���Ȃ̂��c�c�H";
		mes "���O�����̉\�b���c�c";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�`���s�����W�߂�";
		mes "�{�X�ɂł��Ȃ������肩�H";
		mes "���������y���������̂��낤�ȁB";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "���̃`���s������炩�������Ƃ�";
		mes "�悤�₭�ڂ̓�����ɂ����̂��낤�H";
		mes "�㗬�Љ�̐l�Ԃ�����";
		mes "�e���͂������Ă���ƁA";
		mes "�����瓪������������Ƃ�����";
		mes "���Ⴂ���Ă�킯�͂Ȃ���ȁB";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c�ǂ��܂ł����肾�B";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�������ˁc�c";
		mes "�����̗F�B�ɗ��񂾂̂����邵�A";
		mes "���l���Ԃ������ȁB";
		mes "�����A������񗠘H�n�̒��Ԃ��ȁB";
		next;
		mes "[�}�C�A�[]";
		mes "�����������K�v���Ƃ�������A";
		mes "�݂�ȓ�Ԏ���";
		mes "�����M���o���Ă��ꂽ��B";
		next;
		mes "[�}�C�A�[]";
		mes "�ʂ����Ă��O�������Ȃ��҂܂�";
		mes "����ɂł��邩�����̂��ˁI";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c���O�������l���ĉ\���c�c";
		mes "����Ȃ��Ƃ����Ă���̂���";
		mes "���ɂ͂킩���B";
		next;
		mes "[���H���t]";
		mes "�c�c����A�����Ă���B";
		mes "���O�̂��̏���������S��";
		mes "���̌v���";
		mes "�S�ĂԂ��󂷂���Ȃ̂��낤�I";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "�v��H�@�Ȃ�̂��Ƃ��H";
		mes "���������Đ푈�v�悩�H";
		mes "�ߖ����l�X����ɕ������邱�Ƃ��H";
		mes "���O�̖�]�𐬏A���邽�߂�!?";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c���O�͂܂��܂��q�ǂ����B";
		mes "�Z����Ǝ����ǂ�Ȏv����";
		mes "���̌v������s���Ă���̂�";
		mes "�S���킩���Ă��Ȃ��I";
		next;
		mes "[���H���t]";
		mes "^0000cd14�N�O^000000�A�ō��̉ƕ���搂�ꂽ";
		mes "��X�������ł��Ȃ�����";
		mes "���̖��͊����A���O�́A";
		mes "���O�͊o���Ă��Ȃ��̂�!?";
		next;
		mes "[���H���t]";
		mes "^0000cd����̉ƕ��Ƃ������O^000000�������B";
		mes "�Ȃ̂ɂ��O�̓`���s���ǂ���";
		mes "�{�X�C���Ōv���䖳���ɂ��Ă���I";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "�������ĉƂ����Ē�������嗤���H";
		mes "���̌�Ɏc����̂͂Ȃ񂾁H�@���Q��?!";
		next;
		mes "[�}�C�A�[]";
		mes "���O���m���Ă��邾�낤�I";
		mes "����͐V���ȋ�ɂ��ĂԂ��������āB";
		mes "�e���������R�Ɉ���������";
		mes "�Ɩ�Ǝc���Ă������Y��";
		mes "�s���R�͂��Ȃ������B";
		next;
		mes "[�}�C�A�[]";
		mes "�����^0000cd�݂��Ɏx�������Z��^000000��������B";
		mes "�v���o���A���̎��̉��B���B";
		mes "�ł��ȁA���̐��̒��ɂ�";
		mes "����̂悤�ɉ^���ǂ��l��";
		mes "����Ȃɑ����Ȃ���!!";
		next;
		mes "[�}�C�A�[]";
		mes "�e�����Ȃ��Đg�������Ȃ��A";
		mes "�������ꏊ����Ȃ��A";
		mes "�Q�������𖞂������@�Ȃ�ĂȂ��l�X��";
		mes "���Ă��!!";
		next;
		mes "[�}�C�A�[]";
		mes "�w�����g�Z����Ƃ��O��";
		mes "���������E�Ȃ�āA";
		mes "^0000cd�����̌b�܂ꂽ�l�Ԃ̂���^000000��";
		mes "���E�Ȃ񂾂�I";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "���O�͗��z���摖�肷�����I";
		mes "�傫�ȖڕW�̂��߂ɂ�";
		mes "���ɂ͋]���ɂ��ڂ��҂�K�v������I";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "�ڕW�̂��߂̋]��?!";
		mes "�����m��Ȃ��Ƃł��v�����̂��H";
		mes "���O���Ȃ�����Ȃɖ�N�ɂȂ���";
		mes "�w�����g�Z����������Ă���̂��I";
		next;
		mes "[�}�C�A�[]";
		mes "�w�����g�Z����";
		mes "���ʌp���Ҍ��ɂȂ�������";
		mes "�����ǂ��ł������Ǝv������B";
		mes "�w�����g�Z����͑��l����";
		mes "�D����M���𓾂邱�ƂȂ��";
		mes "�C�ɂ����Ȃ��l������B";
		next;
		mes "[�}�C�A�[]";
		mes "�w�����g�Z���񂪖��������̂�";
		mes "�����̖�����Ƃ��Č���邮�炢���B";
		mes "�ł��ȁA���O����]�̂��߂�";
		mes "�Z����Ǝ��g��ł����";
		mes "�b���ς�����B";
		next;
		mes "[�}�C�A�[]";
		mes "����ʂł͒��̂悢�Z���";
		mes "���������Ă��邩���m��Ȃ�����";
		mes "���O���푈�𗘗p����";
		mes "�ׂ������ł邱�Ƃ��炢";
		mes "�������Ă邳�B";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "����Ƀw�����g�Z�����";
		mes "�؋�̉��Ɏd���ďグ�A";
		mes "^0000cd�����I�ɉƂƉ����̌��͂�";
		mes "���̎�ɂ���^000000�̂��ړI���낤�B�Ⴄ���H";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "���x���u���O�Ƃɍ������c���Ă���H";
		mes "�ƕ��H�@���_�H�@����Ȃ��́A";
		mes "���������ł��o��΂����̃S�~���I";
		mes "�������Ό��Ƌ��ɑ��̉Ɩ���";
		mes "�䂪�Ƃ͔p��Ă��Ă���I";
		next;
		mes "[���H���t]";
		mes "�����ȁA�����B�E�B�O�i�[�Ƃ��B";
		mes "�ޓ����������Ă�";
		mes "�ޓ��̍��͂̑O�ɒN������";
		mes "���̓��𐂂��̂��I";
		next;
		mes "[���H���t]";
		mes "���ꂪ�N�ł����Ă��A���I";
		mes "�����]��ł���̂͂���ȗ͂��B";
		mes "���͂Ȗ����^0000cd�����I�ȗ͂��K�v�Ȃ̂��I^000000";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "����Ȃ��́A���O�̂킪�܂܂��낤���I";
		mes "�w�����g�Z���񂪉��ɂȂ�Ȃ�����";
		mes "�Ƃ��̂��Ƃ͍l���Ă����̂��H";
		next;
		mes "[�}�C�A�[]";
		mes "���x���u���O�Ƃ̎��j�̈ʒu�ł�";
		mes "��肽������Ȃ�Ė�������ȁH";
		mes "���̖�]�A����������߂��邩�H";
		next;
		mes "[�}�C�A�[]";
		mes "���F�A�l�Ԃ̒Z���l���Ȃ񂾂�c�c";
		mes "�l�𓮂����̂͗͂���Ȃ��A�S����B";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�c�c�S�H";
		mes "^0000cd������^000000�ɂ��ʂ������H";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "�c�c�Ⴄ�p�x����";
		mes "�߂Â��ׂ��������񂾁B";
		next;
		cutin "16wol_ang.bmp",2;
		mes "[���H���t]";
		mes "�Ӂc�c�꒚�O�Ɍ������ł���Ƃ́B";
		mes "��������������";
		mes "�q�ǂ�����Ȃ����Ă��Ƃ��B";
		mes "�����Y���͂����܂łɂ��Ă�����B";
		next;
		mes "[���H���t]";
		mes "���̊��E�܂̏����؂��O�ɂȁB";
		next;
		cutin "16mye_ang.bmp",1;
		mes "[�}�C�A�[]";
		mes "���O���������Ȃ����";
		mes "�������ĉ������Ȃ����B";
		mes "���H�n��^0000cd�K���̃W���i�_��^000000�Ƃ���";
		mes "���������낤�B";
		next;
		mes "[�}�C�A�[]";
		mes "�������O�̓E�B�O�i�[��";
		mes "�V���ƂƂ������ڂ�";
		mes "�E�����������Ă����I";
		next;
		mes "[�}�C�A�[]";
		mes "�Ƒ��̐M�����������Ȃ��҂�";
		mes "�����Ƒ����̖��̐M����";
		mes "������킯���Ȃ����낤�H";
		mes "����Ɏq�ǂ������͂����O���O�����B";
		next;
		cutin "16mye_ang.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c��l�Ƃ�";
		next;
		cutin "16agn_ang.bmp",2;
		mes "[�A�O�l�X]";
		mes "�݂�Ȃ�����߂ăb!!!!";
		mes "���ł݂�ȑ����́H";
		mes "�킽�����B�A";
		mes "�����K���ɂȂ肽�����������ł��傤�H";
		next;
		mes "[�A�O�l�X]";
		mes "������݂�Ȏ����̓��������悤�ƁI";
		mes "�w�����g�Z�͐��ŁA";
		mes "���H���t�Z�͏����ŁA";
		mes "�}�C�A�[�Z�͗��H�n�ŁB";
		next;
		mes "[�A�O�l�X]";
		mes "����ŗǂ��ł͂���܂���́H";
		mes "�����Ƒ傫�Ȃ��̂��ĂȂɁH";
		mes "����!?�@���Q!?�@�푈!?";
		mes "�����̋����ꏊ�ł̑����ł����A";
		mes "��؂Ȃ��̂��Ȃ��Ȃ��Ă����̂ɁA";
		mes "������傫�Ȑ푈�ɂȂ�́H";
		next;
		mes "[�A�O�l�X]";
		mes "�킽�����������{���ɖ]�ނ��̂��ĉ��H";
		mes "����čK����������̂Ȃ�A";
		mes "��������������m��Ȃ���B";
		mes "�ł���������Ȃ��ł��傤�H";
		mes "�킽�������������[�������܂�����c�c";
		next;
		mes "[�A�O�l�X]";
		mes "�����ł��傤??";
		mes "�c�c�w�����g�Z�A���H���t�Z�A";
		mes "�}�C�A�[�Z�c�c";
		next;
		cutin "16agn_ang.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�Ƃ肠�����݂�Ȃ����܂ł��B";
		mes "�吺���o���̂������܂łɂ��悤�B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�A�O�l�X���������B";
		mes "��l�Ƃ�������߂Ă����Ȃ����B";
		next;
		cutin "16mye_nor.bmp",1;
		mes "[�}�C�A�[]";
		mes "�c�c���͏����Ȃ��͂������Ă��炤��B";
		next;
		cloakonnpc "�}�C�A�[�E���x���u���O#";
		cutin "16agn_ang.bmp",2;
		mes "[�A�O�l�X]";
		mes "�}�C�A�[�Z�I�@�ǂ��ɍs����!?";
		mes "�c�c�܂��ǂ����ɍs���Ă��܂��́H";
		next;
		cutin "16agn_ang.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�����A�l���͂܂Ƃ߂��邩�H";
		mes "���̓A�O�l�X�ɓ��ӂ����B";
		mes "�������͒����ԁA�����������B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�����ȗ͂͂����Ƒ傫�ȗ͂��A";
		mes "���Q�͍X�ɕ��Q���Ăэ��ނƂ���������";
		mes "�������͊o���Ă����K�v������B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�Ȃ�������������l�̑��q��";
		mes "�`�������������ɒ��ق��Ă������c�c";
		mes "���邩�H";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���Q�����Ă������ς��Ȃ����炾�B";
		mes "���Q�Ƃ͖\�͂ŌȂ̐S�����܂����A";
		mes "�U��̈Ԉ��𓾂Ă����";
		mes "�߂��Ȃ����炾�c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c���񂾂��̂͋A��Ȃ��c�c";
		mes "���O�B�̗��e��";
		mes "����Ȃ��Ƃ͖]��ł��Ȃ����낤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���܂ł͂��O�B���ꂼ��̍D����";
		mes "�����Ă��������񂾂��́A";
		mes "�A�O�l�X�̈ӌ��𑸏d���A";
		mes "�F�ɏ]���Ă��炨���B";
		mes "�c�c��͂�푈�͔��������̂��B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�c�c�c�c";
		mes "�c�c�����������ɓ������Ă��܂��B";
		next;
		cloakonnpc "�w�����g�E���x���u���O#ep16lug";
		cutin "16hel.bmp",255;
		mes "[�J���x����]";
		mes "�w�����g�l�I�@���҂����������I";
		next;
		cloakonnpc "�J���x����#ep16lug";
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c�c�c";
		next;
		cutin "16wol_nor.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "���͕��O�҂ł����A";
		mes "�����̐l�͐푈������Ă��܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�������q�ǂ��B�����B";
		mes "�N���Ă��Ȃ������ł����A";
		mes "�s���Ƌ��|�����������Ƃ�";
		mes "�悭����܂���B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�`���җl�ɂ͕s�{�ӂȂ���";
		mes "�X����ʂ����������Ă��܂�";
		mes "�\���󂠂�܂���B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�c�����܂����̂͏��m�̏��";
		mes "������A���肢�����Ă�";
		mes "��낵���ł��傤���B";
		next;
		cutin "16wol_nor.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "��肩�������D�ł��B";
		mes "����`�����܂���B";
		next;
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "���x�����肪�Ƃ��������܂��B";
		mes "���̌��ɂ��āA";
		mes "^0000cd�A�C�U�b�N�l�ɂ��\�ɂ���";
		mes "�m�点��K�v������܂��B^000000";
		mes "���X���҂����������B";
		next;
		cutin "16wol_nor.bmp",255;
		mes "�]���H���t�͂���������";
		mes "�@�ڂɂ��~�܂�ʑ�����";
		mes "�@�莆�������グ�A���������]";
		next;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "���̏��ނ��A�C�U�b�N�l��";
		mes "���n�����������B";
		mes "���x���\���󂠂�܂��񂪁A";
		mes "��낵�����肢���܂��B";
		delquest 14501;
		setquest 14502;
		set EP16_6QUE,8;
		getitem 6931,1;
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	case 8:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�A�C�U�b�N�l��";
		mes "�莆�͓͂��Ă��������܂������H";
		next;
		mes "[���H���t]";
		mes "����ł͖`���җl�A";
		mes "��낵�����肢���܂��B";
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	case 9:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�`���җl�A�����l�ł����B";
		mes "�c�c�A�C�U�b�N�l��";
		mes "�C�����Q����Ă��܂������H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�S�ė������Ă����";
		mes "����������Ă��܂����B";
		mes "�܂��A���H���t�l���V�������i��";
		mes "�����Ă������鎖��";
		mes "�M���Ă���A�Ƃ��B";
		next;
		mes "[���H���t]";
		mes "����͗ǂ������B���̈Ӑ}��";
		mes "����ł����������悤�ł��ˁB";
		mes "�A�C�U�b�N�l�����]�����Ȃ����߂ɁA";
		mes "���̐V�������Ƃ̒���ɂ�";
		mes "�}���˂΂Ȃ�܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ƃւ̔M�ӂ͕ς��Ȃ��̂ł��ˁB";
		next;
		mes "[���H���t]";
		mes "�͂͂́c�c";
		mes "�ǂ���玄�̐��ɍ����悤�ł��āB";
		mes "�y�����Ǝv���܂����A�Ȃɂ��";
		mes "���x���u���O�̖��ł͂Ȃ��A";
		mes "�����g�̎��͂������鎖��";
		mes "�ł��܂�����ˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ƃ���ő��̕���";
		mes "����������Ȃ��悤�ł��ˁB";
		mes "�}�C�A�[�l��w�����g�l�܂Łc�c";
		next;
		cutin "16wol_nor.bmp",255;
		mes "[�}�N�V�[�~���A��]";
		mes "�w�����g�͉����b����";
		mes "���ɖ߂�܂����B";
		mes "�}�C�A�[���܂��Ƃ��o�܂����B";
		mes "�A�O�l�X�̌��t��";
		mes "�������������̂ł��傤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "��낵����΁c�c";
		mes "^0000cd�\�ɂȂ��Ă��郌�x���u���O�Ƃ�";
		mes "�������������^000000�̂ł����A";
		mes "��낵���ł��傤���H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��A���v�ł��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���̂Ƃ���A�\�̓��e��";
		mes "������x�́u�����v�ł��B";
		mes "�푈���N����Ƃ��������ȊO�́B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�����̘̂b�����܂��傤�B";
		mes "���̑��q�v�w�A�q�ǂ��B�̐e��";
		mes "�A�O�l�X�����܂�Ă���";
		mes "�׍��ɂ�����Ƃ����o�J���X��";
		mes "�s���܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�ł����A������";
		mes "�����X�^�[�̏P�����������̂ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�o�J���X�Ȃ�ό��n�ɍs�����̂ł́H";
		mes "���̂悤�ȏꏊ�ł�";
		mes "�����X�^�[�����ꂽ�̂ł����H";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�×{�̂��߂�";
		mes "�����l���Ɨ��ꂽ�ꏊ�������̂ł��B";
		mes "�Ƃ͂����A��r�I�Ɉ��S�ȏꏊ�ł����B";
		mes "�������A�Ȃ���";
		mes "�����X�^�[���Q����Ȃ���";
		mes "�P���Ă����̂������ł��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���m�Ȍ����͖����ɂ킩��܂��񂪁A";
		mes "�����ɑς���ꂸ";
		mes "�߂��܂ŗ��Ă��܂����̂ł́A��";
		mes "�v���܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "������������ł��ˁc�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�����m�点�𕷂��ċ}���Ō��������ɂ�";
		mes "���ɒn�悪��������A";
		mes "��������֎~�ƂȂ��Ă��܂����B";
		mes "���q�v�w�͂��̒n���";
		mes "���c����Ă����͂��Ȃ̂Ɂc�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�������͊Ǘ��ǂ�";
		mes "��������֎~���̑{����";
		mes "�肢�o�܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�������ޓ��́A�O�����痈��������";
		mes "�c�c�����������������m��";
		mes "�����B�̍��֓���鎖��";
		mes "�O�ꂵ�ċ��ۂ��܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�c�c�����͂��܂��B";
		mes "�����̕��͐��͂Ȃ�";
		mes "�M���֌W���Ȃ��ȏ�A";
		mes "���������ۂ���̂�";
		mes "���������f�ł��傤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�Ȃ�Ƃ���������֎~���ɓ��邽��";
		mes "���@��T���܂������A";
		mes "���̎��_��";
		mes "���Ȃ�̎��Ԃ��o���Ă��܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���ǂȂ�Ƃ�����";
		mes "���̒n�̗b�����ٗp���A";
		mes "��������֎~���֕������܂������c�c";
		mes "���q�v�w�͊��ɑ��₦����ł����c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���q�v�w�͔�������鏭���O�܂�";
		mes "�����Ă����悤�ł��B";
		mes "�Ō�܂Ő킢�A�퓬�̖��A";
		mes "�ꂵ�݂̒��ő��₦���Ǝv���Ɓc�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�c�c";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�q�ǂ��B�ɂ͑��q�v�w�̏ڍׂ�";
		mes "�ł��邾�������܂������A";
		mes "������������Ă��܂�������";
		mes "���킴��𓾂܂���ł����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�e��S���������B�A";
		mes "���q�v�w������������";
		mes "��������";
		mes "�ꏏ�ɕ�炷�悤�ɂȂ�܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���̓��x���u���O�Ƃ̖���";
		mes "���������l�ԂɂȂ�悤�A";
		mes "�q�ǂ����������������炵�܂����B";
		mes "�c�c�ł����q�ǂ��B�ɕK�v�������̂́A";
		mes "�������^�ł͂Ȃ�";
		mes "�g�����ӂꂠ���������̂ł��B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "���͂���Ȃ��Ƃɂ��C�t�����A";
		mes "���������[�������悤";
		mes "�q�ǂ������ɋ������܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�q�ǂ��B�ɂ͐h�����X�������̂ł��傤�B";
		mes "�����������A�q�ǂ��B��";
		mes "���R���邩�̂悤��";
		mes "�F�ŉƏo�����܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�q�ǂ��B�͍��ł��Əo�̘b��";
		mes "���܂肵������܂���B";
		mes "�ł������̎��Ɍ��ĕ��������̂�";
		mes "�����̉e����^�����悤�ł��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c���Ƃ��΁c�c�H";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�w�����g�͎��Ȓb�B�̓��X�𑗂�A";
		mes "�@���n���ƍ����̐��Ɍ����܂����B";
		mes "���H���t�͂����Ȃ�";
		mes "����������ƌ����o���܂����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "����܂ŉ䂪�Ƃɂ�";
		mes "���l�͂��܂���ł����B";
		mes "����̗_�ꂪ����";
		mes "���x���u���O�̖��̂��Ƃ�";
		mes "�����͋�����Ȃ��Ƙb���Ă��A";
		mes "�������������܂���ł����B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�}�C�A�[�͉Əo����߂��Ďb���̊Ԃ�";
		mes "�Ƃł����Ƃ��Ă��܂������A";
		mes "���̌チ�����c���ďo�čs���܂����B";
		mes "�A�O�l�X�����͉Əo�O�ƕς�炸�A";
		mes "���̌���߂����Ă��܂����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂼ�ꂪ���߂Ă������Ƃ�";
		mes "����Ȏ���������̂ł��ˁB";
		mes "�\�ł͂��̕�����";
		mes "����܂���ł������B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�����ł��ˁB";
		mes "�\�̌���";
		mes "�}�C�A�[���ӔC������";
		mes "�����Ă��܂����̂ŁA";
		mes "���̓��Ɏ��܂�ł��傤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�Ƃ���Ŗ`���җl�A";
		mes "����܂�Ă��������܂����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ȃ�ł��傤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "^0000cd�w�����g��";
		mes "�������킸�ɋ������̂��C�ɂȂ�܂��B^000000";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�܂��{�a�ɂ��ė~���������̂ł����A";
		mes "����ɂ��Ȃ��Ȃ��Ă��܂����̂�";
		mes "���������Ă܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����ł́A�w�����g�l��";
		mes "�����ւ��A�ꂵ�܂��傤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�����ł��ˁB���炭�A";
		mes "^0000cd�V���o���c�o���h�Ƃ̍����t�߂ɂ���";
		mes "�������⏊^000000�ɂ���ł��傤�B";
		next;
		mes "[�}�N�V�[�~���A��]";
		mes "�������o������A";
		mes "���ɐ��������Ă��������B";
		mes "���n�܂Ŏg���̎҂Ɉē������܂��傤�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��A����ł́B";
		delquest 14503;
		setquest 14504;
		set EP16_6QUE,10;
		close;
	case 10:
	case 11:
	case 12:
	case 13:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�c�����ɂ�";
		mes "�Z��F�����ǂ������̂ł��B";
		mes "�w�����g�Z����ƃ}�C�A�[���B";
		next;
		mes "[���H���t]";
		mes "�A�O�l�X�͖����q��";
		mes "��������l�̖��������̂ŁA";
		mes "�݂�ȉ�����܂����B";
		next;
		mes "[���H���t]";
		mes "�����炱���Ȃ��Ă��܂����̂��c�c";
		mes "���܂ɍl���܂��B";
		next;
		mes "[���H���t]";
		mes "��l�ɂȂ�ɂ��";
		mes "���ꂼ��]�ނ��̂��Ⴂ�A";
		mes "�������Ǝv�����̂�������c�c";
		mes "����ȂƂ���ł��傤�B";
		mes "���ƂȂ�����܂��B";
		next;
		mes "[���H���t]";
		mes "�}�C�A�[���Ƃ��o�čs���Ă��܂�������";
		mes "��͂�V���b�N�ł����ˁB";
		mes "��ԋ߂��Ƒ���������������";
		mes "�o�čs���Ă��܂����̂ł�����B";
		next;
		mes "[���H���t]";
		mes "���̎�����ł��ˁB����";
		mes "�������ł��邱�Ƃ�T���n�߂��̂́B";
		mes "�������u���Ă��ڂ�ɂȂ�̂�";
		mes "���ł�������B";
		next;
		mes "[���H���t]";
		mes "�l�Ԃ͉�������Ȃ����̂������";
		mes "�{�\�I�ɂ����";
		mes "���߂悤�Ƃ���c�c";
		mes "����ȂƂ���ł��傤���B";
		next;
		mes "[���H���t]";
		mes "���͂��ꂩ����O�ɐi��ł����܂��B";
		mes "�������߂���̂�������ׂɁB";
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	case 14:
		cutin "16wol_nor.bmp",2;
		mes "[���H���t]";
		mes "�`���җl�̂�������";
		mes "�������Z��̒���";
		mes "�����̂̂悤�ɋ߂��Ȃ����C�����܂��B";
		mes "���܂ł͂��݂��ɏ��邱�Ƃ��o�����A";
		mes "�Ӓn�𒣂��Ă��܂����B";
		next;
		mes "[���H���t]";
		mes "�Z��Ƃ݂͌��ɂԂ���A�������A";
		mes "�������Ă䂭���̂Ȃ̂ł��傤�B";
		mes "���܂�ɂ������ԗ���Ă����̂�";
		mes "������O�̎�����";
		mes "�Y��Ă��܂��Ă����悤�ł��B";
		next;
		mes "[���H���t]";
		mes "���ꂩ��͑c��������";
		mes "���x���u���O�Ƃ𗧂Ē����Ă݂܂��B";
		mes "�`���җl��";
		mes "���܂ɂ͂��炵�Ă��������ˁB";
		mes "���ł����}���܂���B";
		close2;
		cutin "16wol_nor.bmp",255;
		end;
	}
	end;
}

prt_cas_q.gat,96,184,1	script	�A�O�l�X�E���x���u���O#ep16lug	10130,{
	switch(EP16_6QUE) {
	case 0:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "����A�ǂ̂悤�Ȃ��p���ł��傤���H";
		mes "�������l�ɂ���ɂȂ���ł��傤���B";
		next;
		mes "[�A�O�l�X]";
		mes "����ł�����A������ł��B";
		mes "�ǂ����A�y�������Ԃ�";
		mes "���߂������������ˁB";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 1:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "���Z�l�����ɂ͂���ɂȂ�܂������H";
		mes "�܂��Ȃ烔�H���t�Z�l�Ƃ��Ђ��b���B";
		next;
		mes "[�A�O�l�X]";
		mes "�ŋ߂͂������l�Ɠ�l��";
		mes "���x���u���O�Ƃ̑�����";
		mes "�c�����Ă���܂��̂ŁA";
		mes "�����[���b��������Ǝv���܂��B";
		next;
		mes "[�A�O�l�X]";
		mes "�c�c���̂������A";
		mes "�킽�����Ƃ��b���Ă������鎞�Ԃ�";
		mes "���܂�Ȃ��̂ł����ǂ��c�c";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 2:
	case 3:
	case 4:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�j���͂����n�܂��Ă��܂����̂�";
		mes "�ꏏ�ɍs������";
		mes "�܂����܂��Ă���܂���́I";
		next;
		mes "[�A�O�l�X]";
		mes "�{���̓��H���t���Z�l��";
		mes "���ꏏ����͂��ł����̂ɁA";
		mes "���Z������";
		mes "�_���ɂȂ��Ă��܂��܂�����B";
		next;
		mes "[�A�O�l�X]";
		mes "�}�C�A�[�Z��";
		mes "�ꏏ�ɍs���Ă������邻���ł����A";
		mes "���܂��o�čs���Ă��܂���";
		mes "�ƂĂ��S�z�ł��́c�c";
		next;
		mes "[�A�O�l�X]";
		mes "�킽�������]��ł���̂�";
		mes "�ق�̏����ȍK���ł��̂ɁB";
		mes "�c�����͂��Z�l�����݂�Ȓ��ǂ��A";
		mes "�킽�����ƗV��ł��������܂�����B";
		mes "�{����������ǂ�ł���������";
		mes "�ƂĂ��y���������c�c";
		next;
		mes "[�A�O�l�X]";
		mes "�킽�����͍��ł�";
		mes "���Z�l���Ɠǂ񂾖{����D���ł��́B";
		mes "�{����o�����q�l�A���P�l�A";
		mes "�����ē����₽������̐l�X��";
		mes "�킽�����̑�؂Ȃ��F�B�ł��̂�B";
		next;
		mes "[�A�O�l�X]";
		mes "���P�l�ɐ����𗧂Ă�R�m�̕����";
		mes "�ǂ݂܂�����B";
		mes "���̂��b�ł��P�l���R�m��";
		mes "�Y��ȃn���J�`��n���V�[����";
		mes "����܂����́B";
		next;
		mes "[�A�O�l�X]";
		mes "���̃V�[�����ƂĂ��f�G�ŁA";
		mes "�킽���������������";
		mes "�n���J�`�����������悤��";
		mes "�Ȃ�܂����̂�B";
		next;
		mes "[�A�O�l�X]";
		mes "�����̋R�m�l������Ă��������";
		mes "���ł��n���J�`����n����悤�ɁB";
		mes "����ǁA�c�O�Ȃ��Ƃ�";
		mes "�܂��R�m�l�ɂ���ł��Ă��܂���́B";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 5:
	case 6:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�`���җl�������ɂȂ�܂�����?!";
		mes "�}�C�A�[�Z�ƈꏏ�ɂ��炵�����I";
		next;
		mes "[�A�O�l�X]";
		mes "�f�G�ȕ��c�c��̂ǂȂ�������B";
		mes "�����ɋ����Ă��܂�ꂽ�̂�";
		mes "���b���ł��܂���ł�����c�c";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 7:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�`���җl�H�@�`���җl�H";
		mes "���H���t���Z�l��";
		mes "�`���җl��T���Ă���܂�����B";
		mes "����ɂȂ�񑩂�";
		mes "����Ă����̂ł��ˁB";
		next;
		mes "[�A�O�l�X]";
		mes "�����A���H���t���Z�l��";
		mes "���҂����Ă���܂���B";
		mes "���炵�ė~�����ƌ����Ă��܂�����B";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 8:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "�܂����������I";
		mes "���Z�l��������A�{����";
		mes "�܂��܂��q�ǂ��ł��̂ˁB";
		next;
		mes "[�A�O�l�X]";
		mes "�v�����e���̍L��ŗV��ł���";
		mes "�������Ȏq�ǂ��B�ɕ����Ă�";
		mes "����������ł��̂ɁI";
		next;
		mes "[�A�O�l�X]";
		mes "�l�I�ȗ~�]�ɖڂ�������";
		mes "�^�ӂ����ɂ߂��Ȃ��悤�ł́c�c";
		mes "�킽���������āA���Q��������";
		mes "�v������������܂������A";
		mes "����ŉ���������ł�";
		mes "����܂��񂩂�B";
		next;
		mes "[�A�O�l�X]";
		mes "�����s���݂̂Ȃ���";
		mes "���X�K���ɑ���ɂ͂ǂ�����΂������A";
		mes "�����ł��l�����Ȃ�";
		mes "���̂悤�Ȍ��_�Ȃ��";
		mes "�ŏ�����o��͂�������܂����B";
		next;
		mes "[�A�O�l�X]";
		mes "�c�c���͏���";
		mes "�l�������߂Ă�����悤�ł����A";
		mes "�킽����������邱�Ƃɂ��܂��c�c";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		cutin "16agn_nor.bmp",2;
		mes "[�A�O�l�X]";
		mes "���Z�l���Ƃ͂���ɂȂ�܂������H";
		next;
		mes "[�A�O�l�X]";
		mes "�v���Ԃ�ɉ䂪�ƂɊ��C���߂���";
		mes "�������v���܂��́B";
		mes "���Ƃ����ꏊ�����ꗣ��ł��A";
		mes "����A���Z�l���͂��݂���";
		mes "�n�������邱�Ƃ͖���������";
		mes "�ق��Ƃ��Ă���܂���B";
		close2;
		cutin "16agn_nor.bmp",255;
		end;
	case 14:
		if(checkquest(14509)) {
			if(checkquest(14509)&2) {
				cutin "16agn_ang.bmp",2;
				mes "[�A�O�l�X]";
				mes "�`���җl�I�@��ςł���I";
				mes "�����܂̌��ʂ�";
				mes "�؂�Ă��܂��܂����́I";
				next;
				mes "[�A�O�l�X]";
				mes "�������Ă���Ԃɂ�";
				mes "���ꍏ�ƃJ�r�����̃h���X��";
				mes "�I��ł����܂���I";
				mes "����^0000cd������^000000��p�ӂ��Ȃ��ƁI";
				next;
				if(select("�����܂������ė���","���͖Z����")==2) {
					cutin "16agn_nor.bmp",2;
					mes "[�A�O�l�X]";
					mes "�����ł����c�c";
					mes "�d������܂����B";
					mes "�����c�c";
					mes "�ǂ�����΂�����ł��́c�c�B";
					close2;
					cutin "16agn_nor.bmp",255;
					end;
				}
				cutin "16agn_nor.bmp",2;
				mes "[�A�O�l�X]";
				mes "�����c�c�`���җl��";
				mes "�{���ɂ��D�����̂ł��ˁB";
				mes "��������̗D������";
				mes "�Â������Ă��������܂���B";
				next;
				mes "[�A�O�l�X]";
				mes "����ł�^0000cd�����܂�2��^000000";
				mes "�����ė��Ă������������ł���B";
				mes "���ꂪ�����ƈ��S���ăh���X��";
				mes "���܂����Ƃ��ł��܂����B";
				next;
				mes "[�A�O�l�X]";
				mes "����ł͂��肢�������܂���B";
				mes "���C�����āI";
				delquest 14509;
				setquest 14508;
				close2;
				cutin "16agn_nor.bmp",255;
				end;
			} else {
				cutin "16agn_nor.bmp",2;
				mes "[�A�O�l�X]";
				mes "�`���җl�A���Ă����������̂ł��ˁI";
				mes "�������l�ł��������������܂�";
				mes "�O���O�����C���z������Ă��܂���I";
				next;
				mes "[�A�O�l�X]";
				mes "�������ʂ������Ȃ��Ă��܂�����";
				mes "�܂������ė��Ă��������܂����H";
				mes "���̎��͂܂����炵�Ă�����";
				mes "�������ł���B";
				close2;
				cutin "16agn_nor.bmp",255;
				end;
			}
		}
		if(!checkquest(14508)) {
			cutin "16agn_ang.bmp",2;
			mes "[�A�O�l�X]";
			mes "�`���җl!!";
			mes "�ǂ��Ƃ���ɂ�������Ⴂ�܂����I";
			mes "��ςł��́I";
			next;
			cutin "16agn_nor.bmp",255;
			mes "["+strcharinfo(0)+"]";
			mes "�����ł����H";
			mes "������N����!?";
			mes "����Ƃ��Z�팖�܂̑����ł�";
			mes "����܂�����!?";
			next;
			cutin "16agn_ang.bmp",2;
			mes "[�A�O�l�X]";
			mes "������!!�@���̂悤��";
			mes "�����Ȏ��ł͂���܂���́I";
			mes "�`���җl�̏������K�v�ł��́I";
			next;
			cutin "16agn_ang.bmp",255;
			mes "["+strcharinfo(0)+"]";
			mes "!!";
			mes "�����傫�Ȑ퓬������̂ł��ˁI";
			mes "����ł͏��������Ă��܂��̂�";
			mes "���X���҂����������B";
			next;
			cutin "16agn_nor.bmp",2;
			mes "[�A�O�l�X]";
			mes "�͂��H";
			next;
			cutin "16agn_nor.bmp",255;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c�͂��H";
			next;
			cutin "16agn_nor.bmp",2;
			mes "[�A�O�l�X]";
			mes "�Ȃ��퓬�̏������Ȃ����܂��́H";
			next;
			cutin "16agn_nor.bmp",255;
			mes "["+strcharinfo(0)+"]";
			mes "��ς��Ƃ��b�ɂȂ����̂Łc�c";
			mes "�퓬�ł͂Ȃ��̂ł����H";
			next;
			cutin "16agn_nor.bmp",2;
			mes "[�A�O�l�X]";
			mes "�c�c�����Ɓc�c�S�z���B";
			mes "�l��������ۂɂ����ςȂ��Ƃ�";
			mes "�퓬�����ł͂���܂��񂱂Ƃ�B";
			next;
			cutin "16agn_nor.bmp",255;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c�ł͈�̉����H";
			next;
			cutin "16agn_nor.bmp",2;
			mes "[�A�O�l�X]";
			mes "���͏j���ɒ��Ă������߂�";
			mes "�h���X���N���[�[�b�g��";
			mes "���܂��Ă�����ł��́B";
			next;
			cutin "16agn_ang.bmp",2;
			mes "[�A�O�l�X]";
			mes "�ł��A�C�Â��Ă��܂��܂����́B";
			mes "���̃N���[�[�b�g�ɂ�^ff0000������^000000��";
			mes "�u���Ė���������ł��́I";
			next;
			mes "[�A�O�l�X]";
			mes "���̂܂܂ł͂��������p�ӂ���";
			mes "�h���X���J�r���炯��";
			mes "�Ȃ��Ă��܂��܂��́B";
			mes "����Ȃ��ƂɂȂ�����";
			mes "�j���ɎQ�����邱�Ƃ�";
			mes "�ł��Ȃ��Ȃ��Ă��܂��܂���B";
			next;
			cutin "16agn_nor.bmp",2;
			mes "[�A�O�l�X]";
			mes "�����Ŗ`���җl�ɂ��肢��";
			mes "�������܂��́B";
			next;
			if(select("�����܂������ė���΂�����ł��ˁH","�}�p���v���o���܂���")==2) {
				cutin "16agn_nor.bmp",2;
				mes "[�A�O�l�X]";
				mes "�����ł����c�c";
				mes "�d������܂����B";
				mes "�b�𕷂��Ă���������";
				mes "���肪�Ƃ��������܂��B";
				close2;
				cutin "16agn_nor.bmp",255;
				end;
			}
			cutin "16agn_nor.bmp",2;
			mes "[�A�O�l�X]";
			mes "�܂��I";
			mes "���������O�ɂ��肢�̓��e��";
			mes "���ĂĂ��܂��Ȃ�āA";
			mes "�������͖`���җl�ł��́I";
			mes "�������ł���I";
			next;
			mes "[�A�O�l�X]";
			mes "����ł�^0000cd�����܂�2��^000000";
			mes "�����ė��Ă������������ł���B";
			mes "���ꂪ�����ƈ��S���ăh���X��";
			mes "���܂����Ƃ��ł��܂����B";
			next;
			mes "[�A�O�l�X]";
			mes "���肢�𕷂��Ă����";
			mes "���肪�Ƃ��������܂��B";
			mes "�ł́A��낵�����肢�������܂���I";
			setquest 14508;
			close2;
			cutin "16agn_nor.bmp",255;
			end;
		} else {
			cutin "16agn_nor.bmp",2;
			if(countitem(6921) < 2) {
				mes "[�A�O�l�X]";
				mes "^0000cd�����܂�2��^000000";
				mes "�����ė��Ă������������ł���B";
				mes "���ꂪ�����ƈ��S���ăh���X��";
				mes "���܂����Ƃ��ł��܂����B";
				next;
				mes "[�A�O�l�X]";
				mes "����ł͂��肢�������܂���B";
				mes "���C�����āI";
				close2;
				cutin "16agn_nor.bmp",255;
				end;
			}
			mes "[�A�O�l�X]";
			mes "�����I";
			mes "�����Ă��Ă�����������ł��ˁB";
			mes "���肪�Ƃ��������܂��I";
			mes "����ς�`���җl�͂������ł���I";
			next;
			mes "[�A�O�l�X]";
			mes "����ň��S���ăh���X��";
			mes "�N���[�[�b�g�ɂ��܂����Ƃ�";
			mes "�ł��܂���I";
			mes "���肪�Ƃ��������܂��I";
			next;
			mes "[�A�O�l�X]";
			mes "�`���җl�A";
			mes "����͂킽�����̊��ӂ̈�ł��B";
			mes "�ǂ������󂯂Ƃ肭�������ˁB";
			next;
			if(checkitemblank() == 0) {	// ������
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			mes "[�A�O�l�X]";
			mes "����Ɓc�c�����悯��΁A";
			mes "�܂��������ʂ������Ȃ�����";
			mes "���肢���Ă���낵���ł��傤���H";
			mes "�����͎��C�������ď����܂�";
			mes "�����ɑʖڂɂȂ��Ă��܂��܂��́B";
			delitem 6921,2;
			delquest 14508;
			setquest 14509;
			getitem 6919,2;
			close2;
			cutin "16agn_nor.bmp",255;
			end;
		}
	}
}

prontera.gat,267,67,3	script	�q�ǂ�#ep16lug01	975,{
	switch(EP16_6QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
		mes "[�G����]";
		mes "���A���ɗp���H";
		mes "���͎��i�Ȃ��҂Ƙb�����͎����ʁB";
		mes "�������邪�悢�B";
		close;
	case 4:
		mes "[�G����]";
		mes "�c�c�����͕����₽���ȁB";
		mes "�c�c���ɕ��L���������Ă���c�c";
		mes "�������ǂ����ő����̍��Ղ�";
		mes "�@����������̂��c�c";
		next;
		emotion 40,"�q�ǂ�#ep16lug02";
		mes "[�W��]";
		mes "�����Ƃ��߂�B";
		mes "���̓����l���B";
		next;
		mes "[�G����]";
		mes "�c�c�������c�c";
		mes "������܂������̈���c�c";
		next;
		emotion 6,"�q�ǂ�#ep16lug03";
		mes "[�w���I�b�g]";
		mes "�c�c��l�Ƃ���߂Ȃ�B";
		mes "�b�𕷂��Ă���Ɠ����ɂ��Ȃ�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���̂��A";
		mes "������ƕ����������Ƃ�����񂾂��ǁB";
		mes "�����ʔ����\�b���Ă���H";
		next;
		mes "[�G����]";
		mes "�c�c�ӂ��A�˗����B";
		next;
		mes "[�W��]";
		mes "�ʔ����b�H";
		next;
		mes "[�w���I�b�g]";
		mes "���I�@���邠��I";
		next;
		mes "[�G����]";
		mes "���̈˗��A�󂯂悤�B";
		mes "�������߂���̂Ƃ͉����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�푈�̘b�Ƃ��A���Ƃ̘b�Ƃ����ȁH";
		mes "�\�ɂȂ��Ă���݂��������ǁA";
		mes "�����ɗ��ē����󂢂���";
		mes "�ڂ����͒m��Ȃ��񂾁B";
		next;
		mes "[�W��]";
		mes "���A�l�m���Ă܂��B";
		mes "���Ă������A�݂�Ȓm���Ă܂��B";
		next;
		mes "[�w���I�b�g]";
		mes "�����I�@�����b���I";
		next;
		mes "[�G����]";
		mes "����b�Ȃ�m���Ă���B";
		mes "�����A�������̘b�𕷂��ɒl���邩";
		mes "��͂��̎��i��₤�Ă���̂��B";
		mes "�m�M�Ƃ����Ȃ̎��i���ȁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����H�@�����A�����K�v�Ȃ́H";
		mes "�c�c���Ƃ��H";
		next;
		mes "[�W��]";
		mes "���c�c�ӂ��A���肪���������ł��ˁB";
		mes "�l�����������Ƃ��Œނ낤�Ƃ́B";
		next;
		mes "[�w���I�b�g]";
		mes "���ꂳ�񂪒m��Ȃ��l����";
		mes "����������_��������";
		mes "�����Ă��񂾂�I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���Ⴀ�A���������炢���́H";
		next;
		mes "[�G����]";
		mes "���ɕK�v�Ȃ��̂͑㉿�ł͂Ȃ��B";
		mes "���̘b�𕷂����i��";
		mes "���ɂ���̂����d�v���B";
		next;
		mes "[�w���I�b�g]";
		mes "�������H�@�Ȃɂ���H";
		mes "�G�������Ă��܂ɓ����������ˁB";
		next;
		mes "[�W��]";
		mes "�l�Ƃ��Ă͑㉿�������ɂ��܂��ˁB";
		mes "���𕷂������̂�";
		mes "��ɘb���Ă݂Ă���������B";
		mes "�܂��͒񎦁A�����Č��ł���H";
		next;
		emotion 4,"";
		mes "["+strcharinfo(0)+"]";
		mes "�i�q�ǂ����Ǝv���Ė��f�������ǁA";
		mes "�Ȃ��Ȃ������ȁc�c�B�j";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�㉿�͉��ƂȂ��킩�����B";
		mes "�ł����i�H�@�����̉\�b�𕷂��̂�";
		mes "���i���K�v�Ȃ́H";
		next;
		mes "[�G����]";
		mes "����͉\�b�ɂ��̂��B";
		mes "�S�Ă̕����͂��̐g��";
		mes "�댯���h���Ă��邩��ȁB";
		next;
		mes "[�w���I�b�g]";
		mes "���̘b���Ă���ȂɊ댯�H";
		mes "�W���͒m���Ă��H";
		mes "���͂��񂺂����Ȃ����ǁB";
		next;
		mes "[�W��]";
		mes "�G�����̘b�ł���H";
		mes "�����Ă鎖��7���͉R���A";
		mes "�G�����̋�z���E�̐ݒ�ł��c�c";
		mes "�G�����̌��t���S�Đ^���Ȃ�";
		mes "���̐��͂���12��͖łтĂ܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����Ȃ񂾁B";
		mes "���Ⴀ�ǂ�����΂��̎��i��";
		mes "�F�߂Ă��炦��̂��ȁH";
		mes "���Ƒ㉿�́H";
		next;
		emotion 18,"�q�ǂ�#ep16lug02";
		mes "[�W��]";
		mes "����Ɩ{�_�ɂ��ǂ蒅���܂����ˁB";
		mes "�l�͂Ƃ肠�����������́I";
		next;
		emotion 18,"�q�ǂ�#ep16lug03";
		mes "[�w���I�b�g]";
		mes "���I�@���͂��ꂢ�Ȃ��́`�I";
		next;
		emotion 0,"�q�ǂ�#ep16lug01";
		mes "[�G����]";
		mes "���i�̏ؖ��I";
		mes "���i�̏ؖ����K�v�Ȃ̂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����ȁA3�l�����p�ӂł��Ȃ���B";
		mes "�������̎���͈�Ȃ񂾂���A";
		mes "����������ɂ��Ă���Ȃ����ȁH";
		next;
		mes "[�W��]";
		mes "���[��A�����������";
		mes "���_�ł��܂���ˁB";
		mes "�d������܂���B";
		mes "�����̓W�����P���ŏ������l��";
		mes "���肢�ɂ��܂��傤�B";
		next;
		mes "[�w���I�b�g]";
		mes "�킩������I";
		next;
		mes "[�G����]";
		mes "��̓p�[���o���B";
		next;
		mes "[�W��]";
		mes "���ꂶ�Ⴂ���܂���B";
		mes "�W���`���P�`���c�c";
		next;
		mes "[�W��]";
		mes "�|���I";
		emotion 12,"�q�ǂ�#ep16lug02";
		mes "[�w���I�b�g]";
		mes "�|���I";
		emotion 11,"�q�ǂ�#ep16lug03";
		mes "[�G����]";
		mes "�O�[���I";
		emotion 11,"�q�ǂ�#ep16lug01";
		next;
		mes "[�W��]";
		mes "������[�I";
		emotion 18,"�q�ǂ�#ep16lug02";
		mes "[�w���I�b�g]";
		mes "���[�I";
		emotion 23,"�q�ǂ�#ep16lug03";
		mes "[�G����]";
		mes "�܁A�������c�c�B";
		emotion 28,"�q�ǂ�#ep16lug01";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���܂��������H";
		mes "�N�͉����K�v���ȁH";
		next;
		mes "[�W��]";
		mes "���j���I";
		mes "���[���~�b�h�K�b�c�̗��j��";
		mes "�ԗ����ꂽ�{����I";
		mes "���{�}���قɂ��邻�������ǁA";
		mes "��x���������Ƃ��Ȃ��񂾁B";
		next;
		mes "[�W��]";
		mes "����ɂ�";
		mes "���{�ɏo����ł���l�����Ȃ����A";
		mes "���X�ł͂������ĂȂ�����";
		mes "�������������񂾁B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c���߂ƁH";
		next;
		mes "[�W��]";
		mes "�S���ɂł��Ԃ����܂ꂽ����ł����H";
		mes "�݂��o���ł��肢���܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�킩�����B";
		mes "���ꂶ�Ⴀ�s���Ă����B";
		next;
		mes "[�W��]";
		mes "�o���邾���������肢���܂��ˁB";
		set EP16_6QUE,5;
		delquest 14498;
		setquest 14499;
		next;
		mes "�]�v�����e�������{��";
		mes "�@�}���قɈړ����܂����H�]";
		next;
		switch(select("�ړ�����","�ړ����Ȃ�")) {
		case 1:
			mes "�]���Ȃ��̓v�����e�������{��";
			mes "�@�}���قɌ��������]";
			close2;
			warp "prt_cas.gat",343,63;
			end;
		case 2:
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		end;
	case 5:
		mes "[�W��]";
		mes "���{�}���ق�";
		mes "^0000cd���[���~�b�h�K�b�c�̗��j^000000��";
		mes "�؂�ė��Ă��������B";
		next;
		mes "�]�v�����e�������{��";
		mes "�@�}���قɈړ����܂����H�]";
		next;
		if(select("�ړ�����","�ړ����Ȃ�") == 2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�������{��";
		mes "�@�}���قɌ��������]";
		close2;
		warp "prt_cas.gat",343,63;
		end;
	case 6:
		mes "["+strcharinfo(0)+"]";
		mes "����ł������ȁH";
		next;
		emotion 18,"�q�ǂ�#ep16lug02";
		mes "[�W��]";
		mes "���肪�Ƃ��������܂��B";
		mes "����ł���Ɠǂނ��Ƃ��ł��܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂶ�Ⴑ������";
		mes "�񑩂�����Ă��炤��B";
		next;
		mes "[�G����]";
		mes "�c�c�푈�A���ƁA";
		mes "�w�����g�E���x���u���O�B";
		mes "���̎҂����ɂȂ�΁A";
		mes "�嗤�͌��̉Q�Ɉ��ݍ��܂�邾�낤�B";
		next;
		mes "[�G����]";
		mes "�Èł��嗤�𑽂��s�����A";
		mes "�͂Ȃ��҂����̋�ɂ�";
		mes "�嗤���ɍL���邾�낤�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂪ�\�b�H";
		mes "�ł����e���悭����Ȃ��ȁB";
		mes "�킩��l����H";
		next;
		mes "[�W��]";
		mes "�l���������܂��傤�B";
		mes "�w�����g�E���x���u���O�����ɂȂ��";
		mes "�푈���N����Ƃ������ł���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ꂾ�Ƃ�����Ɗȗ��������ˁH";
		mes "�ǉ��Ő����𗊂�ł��������ȁH";
		next;
		mes "[�w���I�b�g]";
		mes "�͂��I�@�������܂��I";
		mes "�����ƂˁA�\�b�̓��e�́c�c";
		next;
		mes "[�w���I�b�g]";
		mes "�w�����g�E���x���u���O��";
		mes "���ɂȂ�΁c�c���A�������B";
		mes "���x���u���O�Ƃ̉\�͒m���Ă�H";
		mes "^0000cd4�Z��̐e������^000000���Ęb�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����A���߂ĕ����ˁB";
		next;
		mes "[�w���I�b�g]";
		mes "����������̉\�b�Ȃ̂���";
		mes "�m��܂��񂯂ǁA";
		mes "�Ȃ񂩎E���ꂽ�炵���́I";
		next;
		mes "[�w���I�b�g]";
		mes "�����Ɨׂ̍��ɂ����āH";
		mes "�E����āH";
		mes "������w�����g�E���x���u���O��";
		mes "�V���b�N���󂯂āA";
		mes "����f�r���Ă�����āB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���ɂ����͖̂{�������ǂˁB";
		mes "���͉��{�ɂ��邻������B";
		next;
		mes "[�w���I�b�g]";
		mes "���ʂ������傤�H����ˁB";
		mes "�\�ɂȂ��Ă���b������Ȃ́B";
		next;
		mes "[�w���I�b�g]";
		mes "^0000cd�w�����g�����ɂȂ��^000000�A";
		mes "���ƕꂪ�E���ꂽ���ɕ��Q����";
		mes "^0000cd�嗤�𓝈ꂷ�邽�߂̐푈^000000��";
		mes "�N�����񂾂��āB";
		next;
		mes "[�w���I�b�g]";
		mes "�����烌�x���u���O�Ƃ�^0000cd���j^000000��";
		mes "�푈�ɕK�v�Ȃ������W�߂邽�߂�";
		mes "^0000cd����^000000�����Ă���񂾂��āB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���\�ڂ����񂾁H";
		next;
		mes "[�w���I�b�g]";
		mes "����Ȃ̒N�ł��m���Ă��I";
		mes "��l���������Ƃ΂���b���Ă邩��B";
		next;
		mes "[�W��]";
		mes "�l�̐e�͐S�z���Ă��܂��B";
		mes "�w�����g�����ɂȂ邱�Ƃ�";
		mes "�푈���N���鎖���B";
		mes "�{���݂͂�ȕs���Ȃ�ł��B";
		mes "�푈�Ȃ�čD���Ȑl�͂��܂����B";
		next;
		emotion 0,"�q�ǂ�#ep16lug01";
		mes "[�G����]";
		mes "�ӂ��c�c";
		mes "���̂����킵����m��ʂƂ́c�c";
		next;
		emotion 54,"�q�ǂ�#ep16lug02";
		mes "[�W��]";
		mes "���A�����͂Ȃ��ŁB";
		next;
		emotion 28,"�q�ǂ�#ep16lug03";
		mes "[�w���I�b�g]";
		mes "�����푈�͌����B";
		mes "���킢���́c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�Ƃɂ����A���肪�Ƃ��B";
		mes "�ǂ��b�𕷂�����B";
		next;
		mes "[�w���I�b�g]";
		mes "����I�@�܂��ˁI";
		next;
		mes "[�W��]";
		mes "�{�A���肪�Ƃ��������܂����B";
		next;
		mes "[�G����]";
		mes "�c�c�j�̕ʂ�Ɍ�����͂���ʁc�c";
		delitem 6926,1;
		delquest 14500;
		setquest 14501;
		set EP16_6QUE,7;
		next;
		mes "�]�߂��ă��H���t�ɉ\�̓��e��";
		mes "�@�`���悤�B";
		mes "�@�v�����e�����{�ɖ߂�܂����H�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
		mes "[�G����]";
		mes "���A���i���ؖ������҂�B";
		mes "��̌_��̗a����l�ƂȂ�̂��H";
		next;
		mes "[�G����]";
		mes "���ނׂ����Č����Ăъo�܂��V���I";
		mes "�ŖS�͈Í��̈ӎu�Ȃ�āc�c";
		next;
		mes "[�W��]";
		mes "�܂��n�܂����B";
		next;
		mes "[�w���I�b�g]";
		mes "�����I";
		mes "�����͎��������Ȃ�Ƃ����邩��I";
		next;
		mes "�]�߂��ă��H���t�ɉ\�̓��e��";
		mes "�@�`���悤�B";
		mes "�@�v�����e�����{�ɖ߂�܂����H�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	case 12:
		mes "["+strcharinfo(0)+"]";
		mes "����ɂ��́`�B";
		next;
		mes "[�W��]";
		mes "����H�`���҂��񂾁B";
		mes "���傤�ǂ����Ƃ���ɁI";
		mes "�{�S���ǂ݂܂����A���肪�Ƃ��I";
		mes "�Ԃ��܂��ˁI";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "������ƕ����������Ƃ������āc�c";
		mes "���x���u���O�ƂɊւ���";
		mes "�\�b�Ȃ񂾂��ǁB";
		next;
		mes "[�G����]";
		mes "���̉Ɩ�ɂ܂��V�����b�͂Ȃ��B";
		mes "�����b�����߂邱�Ƃ͎�����c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����A�V�����\�b����Ȃ��āA";
		mes "���̘b�������l��m���Ă��邩";
		mes "���������񂾁B";
		next;
		mes "[�W��]";
		mes "�ǂ����Ăł����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�\���L�߂��l���N�Ȃ̂��A";
		mes "�T���Ă���񂾁B";
		next;
		mes "[�w���I�b�g]";
		mes "�����H";
		mes "�T������߂܂���́H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����A���̐l�̂��������񂩂�";
		mes "�`���𗊂܂ꂽ�񂾁B";
		next;
		mes "[�w���I�b�g]";
		mes "���H";
		mes "�Ƒ��Ȃ̂ɉ�Ȃ���ł����H";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���[��A�Ƒ������ǂˁB";
		mes "�������ˁB������Ɖ�Ȃ������ˁB";
		next;
		mes "[�W��]";
		mes "�ւ�Ȃ́B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "����A�ς��ˁB";
		mes "�ł��Ƒ����m�ł���̂�����āA";
		mes "���̐l�ɗ��ޕK�v�����鎞������񂾁B";
		next;
		mes "[�G����]";
		mes "�������c�c";
		mes "�Ȃ�΍��x�͍X�Ȃ鎑�i�̏ؖ����Ёc�c";
		next;
		mes "[�w���I�b�g]";
		mes "���I�@���傤�Ǘ�����I";
		mes "�W���i�_�����ɂ������I";
		mes "���q�l����I";
		next;
		cloakoffnpc "���}�Ȓj#ep16lug02";
		mes "[�}�C�A�[]";
		mes "!!!?";
		mes "�`���җl�A�ǂ����Ă����ɁH";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�\��H���ĒT������ł������A";
		mes "�����ŉ��Ƃ͎v���܂���ł����B";
		next;
		mes "[�}�C�A�[]";
		mes "���ɉ�ɁH";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��B";
		mes "�}�C�A�[�l�ɓ`���������ĎQ��܂����B";
		next;
		emotion 1,"�q�ǂ�#ep16lug01";
		mes "[�G����]";
		mes "�}�C�A�[?";
		next;
		emotion 1,"�q�ǂ�#ep16lug02";
		mes "[�W��]";
		mes "�}�C�A�[?";
		next;
		emotion 1,"�q�ǂ�#ep16lug03";
		mes "[�w���I�b�g]";
		mes "�}�C�A�[���Ă���H";
		mes "^0000cd�W���i�_�����ɂ�����񂪃}�C�A�[^000000�H";
		mes "�W���i�_���H�@�}�C�A�[�H";
		mes "�������ɂ̓W���i�_�����Č�������ˁH";
		next;
		mes "[�}�C�A�[]";
		mes "�c�c���̎q�����ɂ�";
		mes "�ȑO�ɂ���܂����ˁB";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��A���킢���ł���B";
		mes "���������܂ŏ�����J���܂������B";
		next;
		mes "[�w���I�b�g]";
		mes "�W���i�_���H�@�}�C�A�[�H";
		mes "�c�c�}�C�A�[�H�@�W���i�_���H";
		mes "�ǂ����Ȃ́H";
		next;
		mes "[�}�C�A�[]";
		mes "�����A�`���җl�Ǝ���";
		mes "�厖�Șb������񂾁B";
		mes "�������������ǂ��ł���邩���H";
		mes "��������͂����Ă����Ɗ������ȁB";
		next;
		mes "[�G����]";
		mes "�J�������͂ӂ�����ʁB";
		next;
		mes "[�W��]";
		mes "�厖�Șb�Ȃ�l�������܂��I";
		next;
		mes "[�w���I�b�g]";
		mes "������ƁI";
		mes "�厖�Șb���Č����Ă�ł���I";
		mes "�͂��I�@���ǂ��ŁI";
		next;
		mes "[�}�C�A�[]";
		mes "�݂�ȗǂ��q���ˁB";
		mes "�b���I�������";
		mes "�Â��L�����f�B�������悤�B";
		next;
		mes "[�G����]";
		mes "���̎��ɂ͕����痧������ʁB";
		next;
		mes "[�W��]";
		mes "�ǂ����[�B";
		next;
		mes "[�w���I�b�g]";
		mes "����[�I�@�ӂӂӁA�����������Ȃ��[�I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c���킢�����̂ł��ˁB";
		mes "�������B";
		next;
		mes "[�}�C�A�[]";
		mes "�����ł��B";
		mes "���̎q�B�̂悤�ɁA";
		mes "���������K�v������l��";
		mes "�����ɂ͑吨���܂��B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�ȒP�ł͂Ȃ��ł�����";
		mes "�厖�Ȃ��Ƃł��ˁB";
		next;
		mes "[�}�C�A�[]";
		mes "���͎����ł��邱�Ƃ�";
		mes "���Ă��邾���ł���B";
		mes "�Ƃ���œ`���ƌ����̂́c�c�H";
		next;
		mes "�]�}�C�A�[��";
		mes "�@�w�����g�̌�p�҂̐ȏ��n��";
		mes "�@��l�̌Z�̐푈�����Ɋւ���b��";
		mes "�@�`�����]";
		next;
		mes "[�}�C�A�[]";
		mes "����͂悩�����B";
		mes "��͂�Z����B�͐������I����";
		mes "���Ă��ꂽ�̂ł��ˁB";
		next;
		mes "[�}�C�A�[]";
		mes "�����^0000cd���H���t�Z����";
		mes "�����]�������̂����^000000�ł��B";
		mes "�{�C�œ������ƂɂȂ��";
		mes "���Ȃ�ʓ|�ł�����B";
		next;
		mes "[�}�C�A�[]";
		mes "���H���t�Z����͈�x���ƌ����o����";
		mes "�~�܂�Ȃ���ł���B";
		mes "�܂��A�����������ł�����܂����B";
		next;
		mes "[�}�C�A�[]";
		mes "�͂́B�M�����Ȃ���������܂��񂪁A";
		mes "�����Ƒ��̒���";
		mes "��ԐM����u���Ă���l�Ȃ�ł���B";
		next;
		mes "[�}�C�A�[]";
		mes "�����A���������Ζ`���җl�ɂ�";
		mes "�X���Ƃ���������Ă��܂��܂����ˁB";
		mes "�ق�Ƃ��ɂ��݂܂���B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�����̌Z��Q���J�������̂ł���ˁB";
		next;
		mes "[�}�C�A�[]";
		mes "���������Ă���������Ə�����܂��B";
		next;
		mes "[�}�C�A�[]";
		mes "���ꂩ��͂��傭���傭�A��܂���B";
		mes "�Ƃ͋������Ƃ΂���v���Ă܂������A";
		mes "�ǂ���炻���ł��Ȃ��悤�ł����ˁB";
		mes "���ɉ����ł��邱�Ƃ�����Ȃ�";
		mes "���͂������Ǝv���܂��B";
		next;
		mes "[�}�C�A�[]";
		mes "�j�����I�������";
		mes "�����ɂł��܂��A���";
		mes "�`���Ă���������Ə�����܂��B";
		next;
		mes "[�}�C�A�[]";
		mes "�����A�������B";
		mes "�A�O�l�X���j���Ɉꏏ�ɍs���Ȃ���";
		mes "�\����Ȃ��Ɠ`���Ă��������܂����B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�͂��A�`���܂��B";
		next;
		mes "[�}�C�A�[]";
		mes "�`���җl�������������K�v�Ȏ���";
		mes "���Ɍ����Ă��������ˁB";
		mes "�ł�����菕�͂��܂��B";
		mes "����ł́I";
		delquest 14506;
		setquest 14507;
		set EP16_6QUE,13;
		next;
		mes "�]�}�C�A�[�̈ӎu��`����";
		mes "�@�}�N�V�[�~���A���̌��֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	case 13:
		mes "[�G����]";
		mes "�푈�̊�@���������B";
		mes "�ł��甇���o�闐���̉p�Y�̒a����";
		mes "�㐢�̗��j�ɂ̂��c�c";
		next;
		mes "[�W��]";
		mes "�܂����I�@�܂��n�܂����I";
		next;
		mes "[�w���I�b�g]";
		mes "�����I";
		mes "�����͎��������Ȃ�Ƃ����邩��I";
		next;
		mes "�]�}�C�A�[�̈ӎu��`����";
		mes "�@�}�N�V�[�~���A���̌��֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	case 14:
		mes "[�G����]";
		mes "�푈�̊�@���������B";
		mes "�ł��甇���o�闐���̉p�Y�̒a����";
		mes "�㐢�̗��j�ɂ̂��c�c";
		next;
		mes "[�W��]";
		mes "�܂����I�@�܂��n�܂����I";
		next;
		mes "[�w���I�b�g]";
		mes "�����I";
		mes "�����͎��������Ȃ�Ƃ����邩��I";
		close;
	default:
		mes "�]�q�ǂ��������V��ł���]";
		close;
	}
}

prontera.gat,270,68,1	script	�q�ǂ�#ep16lug02	706,5,5,{
	mes "�]�q�ǂ��������V��ł���]";
	close;
OnTouch:
	if(EP16_6QUE > 12) {
		cloakoffnpc "���}�Ȓj#ep16lug02";
	}
	end;
}

prontera.gat,268,69,5	script	�q�ǂ�#ep16lug03	703,{
	mes "�]�q�ǂ��������V��ł���]";
	close;
}

prontera.gat,270,72,3	script(CLOAKED)	���}�Ȓj#ep16lug02	86,{
	if(EP16_6QUE > 12) {
		mes "[�}�C�A�[]";
		mes "�킴�킴�������܂�";
		mes "���肪�Ƃ��������܂����B";
		mes "�`���җl�̂�������";
		mes "���B�Z��̕ǂ͔����Ȃ����C�����܂��B";
		next;
		mes "[�}�C�A�[]";
		mes "�݂��ɑ����A�����A����āc�c";
		mes "��������Ȃ��͖̂]��ł��܂���B";
		mes "��͂�Ƒ��ł�����A";
		mes "�F�̎��͐S�����؂Ɏv���Ă��܂��B";
		next;
		mes "�]�}�C�A�[�̈ӎu��`����";
		mes "�@�}�N�V�[�~���A���̌��֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	}
	end;
}

yuno_fild01.gat,239,173,7	script	���������#ep16lug01	734,{}
yuno_fild01.gat,241,173,7	script	���������#ep16lug02	469,{}
yuno_fild01.gat,243,173,1	script	���������#ep16lug03	469,{}
yuno_fild01.gat,245,173,1	script	���������#ep16lug04	734,{}
yuno_fild01.gat,239,171,7	script	���������#ep16lug05	875,{}
yuno_fild01.gat,241,171,7	script	���������#ep16lug06	735,{}
yuno_fild01.gat,243,171,1	script	���������#ep16lug07	735,{}
yuno_fild01.gat,245,171,1	script	���������#ep16lug08	875,{}

yuno_fild01.gat,242,175,5	script	�w�����g�E���x���u���O#ep16lug02	10127,{
	switch(EP16_6QUE) {
	case 10:
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�`���җl�H";
		mes "�ǂ����Ă����ɂցH";
		mes "�c�c�����͊댯�ł��B";
		next;
		cutin "16hel.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "���v�ł��B";
		mes "�����X�^�[�Ƃ̓����ɂ͊���Ă��܂��B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�`���җl��";
		mes "�p�Y��搂���قǂ̐�m�ł��邱�Ƃ�";
		mes "���O���Ă���܂����B";
		mes "��������e�͂��������B";
		mes "�Ƃ���ŁA�Ȃ������Ɂc�c�H";
		next;
		cutin "16hel.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "�w�����g�l��A��߂��ɗ��܂����B";
		mes "�}�N�V�[�l���S�z���Ă���܂����B";
		mes "���͉Ƃɂ���ق��������ƁB";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�c�c�����������Ă����������̂�";
		mes "�\���󂠂�܂��񂪁A���͖߂�܂���B";
		mes "��������ׂ��ꏊ�͂����ł��B";
		mes "�c���ɂ͂����`���Ă��������B";
		next;
		cutin "16hel.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "�ł����A�݂Ȃ���S�z���Ă��܂���B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�c�c���͎��́A�c������莀�񂾗��e��";
		mes "�����Ȃ������l�X��";
		mes "�������Ƃ��ł��܂���ł����B";
		next;
		mes "[�w�����g]";
		mes "���̎����ӂ����̂ł��B";
		mes "�S�Ă̐l�������ɏ]���悤�A";
		mes "�傫�ȗ͂���ɓ���悤�ƁB";
		mes "���̈�S�Ŏ��g��b���܂����B";
		next;
		mes "[�w�����g]";
		mes "�c�c�����Ă������A";
		mes "�嗤�S�Ă𓝈ꂷ�邱�Ƃ�";
		mes "�K�v���ƍl����悤�ɂȂ�܂����B";
		mes "���͂ɂ�铝��c�c�푈���K�v���ƁB";
		next;
		mes "[�w�����g]";
		mes "�ł����A�}�C�A�[�ƃA�O�l�X�̌��t��";
		mes "�悤�₭�C�Â����̂ł��B";
		mes "�������߂铹�͂܂��A";
		mes "�N���̔߂��݂Ƒ�����";
		mes "�n�܂�ɂȂ邩������Ȃ��ƁB";
		next;
		mes "[�w�����g]";
		mes "�܂𗬂��A�߂��݂ɕ��A";
		mes "�����݂������̂�";
		mes "�������܂ꂽ�߂̂Ȃ��s�����ƁB";
		mes "���ꂱ���A���̎��̕����A";
		mes "�������̂悤�Ȑl�Ԃ��B";
		next;
		mes "[�w�����g]";
		mes "�푈�ł����炷�͂Ȃ�";
		mes "���̈Ӗ����Ȃ��ƁA";
		mes "���͂悤�₭�C�Â��܂����B";
		next;
		mes "[�w�����g]";
		mes "�����炱���A���A�������̂ł��B";
		mes "�����̐l�X����邽�߂ɂ͗͂��K�v���B";
		mes "���͂��̗͂�l�X�ׂ̈Ɏg�������B";
		mes "�푈�̂��߂ł͂Ȃ��A";
		mes "�l�X����邽�߂ɗ͂��g�������̂ł��B";
		next;
		mes "[�w�����g]";
		mes "�����玄�͂����Ɏc��܂��B";
		mes "�����Ƃ���܂ő����^��ł��������A";
		mes "�\���󂠂�܂��񂪁A";
		mes "�c���ɂ͂����`���Ă����������";
		mes "�������ł��B";
		next;
		mes "[�w�����g]";
		mes "���ʌp���̎��ȂǉƂ̎��ɂ��ẮA";
		mes "�ǂ��ɂ��Ă��Ƒ��ł��̂ŁA";
		mes "���ɂł��鎖������΋��͂��܂��B";
		next;
		mes "[�w�����g]";
		mes "�ł����A�ŏI�I�Ɍ��f������̂�";
		mes "���H���t�ł��B";
		mes "^0000cd���x���u���O�Ƃ̌�p�҂̐Ȃ�";
		mes "���H���t�ɂ䂾�˂�^000000�Ɠ`���Ă��������B";
		next;
		mes "[�w�����g]";
		mes "���ꂩ�烔�H���t�ɂ�";
		mes "�����̗͂��K�v�ƂȂ�ł��傤�B";
		mes "���͂��������A";
		mes "�����ă��H���t�ׂ̈ɂ�";
		mes "�s�͂��܂��傤�B";
		next;
		mes "[�w�����g]";
		mes "��������΁A";
		mes "���H���t���푈�Ɏ������邱�ƂȂ��A";
		mes "�}�C�A�[���A�O�l�X��";
		mes "�푈�ɋ��������X���߂��������ł���B";
		mes "�������Z��ŋ��͂��A";
		mes "�x�������������邱�Ƃł��傤�B";
		next;
		cutin "16hel.bmp",255;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�킩��܂����B";
		mes "�}�N�V�[�l�ɂ��`�����܂��B";
		next;
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "���肪�Ƃ��������܂��B";
		mes "���肢�������܂��B";
		delquest 14504;
		setquest 14505;
		set EP16_6QUE,11;
		next;
		cutin "16hel.bmp",255;
		mes "�]�w�����g�̈ӎu��`����";
		mes "�@�}�N�V�[�~���A���̌��֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	case 11:
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "��������ׂ��ꏊ�͂����ł��B";
		mes "^0000cd���x���u���O�Ƃ̌�p�҂̐Ȃ�";
		mes "���H���t�ɂ䂾�˂�^000000�Ɠ`���Ă��������B";
		next;
		mes "[�w�����g]";
		mes "��������΁A";
		mes "���H���t���푈�Ɏ������邱�ƂȂ��A";
		mes "�}�C�A�[���A�O�l�X��";
		mes "�푈�ɋ��������X���߂��������ł���B";
		mes "�������Z��ŋ��͂��A";
		mes "�x�������������邱�Ƃł��傤�B";
		next;
		cutin "16hel.bmp",255;
		mes "�]�w�����g�̈ӎu��`����";
		mes "�@�}�N�V�[�~���A���̌��֖߂낤�]";
		next;
		if(select("�߂�","�߂�Ȃ�")==2) {
			mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]���Ȃ��̓v�����e�����{��";
		mes "�@���������]";
		close2;
		warp "prt_cas_q.gat",84,188;
		end;
	default:
		cutin "16hel.bmp",0;
		mes "[�w�����g]";
		mes "�n�肪����c�c�P�����߂������B";
		mes "�S���퓬������ӂ�ȁI";
		close2;
		cutin "16hel.bmp",255;
		end;
	}
}

yuno_fild01.gat,244,176,3	script	�J���x����#ep16lug02	962,{
	switch(EP16_6QUE) {
	case 10:
		mes "[�J���x����]";
		mes "�w�����g�l��";
		mes "�푈�͂Ȃ���Ȃ��ƌ��߂������ł��B";
		mes "�{���ɂ悩�����ł��B";
		mes "�w�����g�l�̈ӎv�͑��d���܂����A";
		mes "�푈�͗ǂ����̂ł͂���܂��񂩂�B";
		next;
		mes "[�J���x����]";
		mes "���ꂩ��͂����Ńw�����g�l�������A";
		mes "�l�X�̈��S�ƕ��a����邽�߁A";
		mes "�F�Ɛs�͂������Ǝv���܂��B";
		close;
	case 11:
		mes "[�J���x����]";
		mes "����Ɛ��ɋA���Ă���܂����B";
		mes "�������ׂ��������邱�̏ꏊ�ցB";
		next;
		mes "[�J���x����]";
		mes "�w�����g�l��";
		mes "�푈�͂Ȃ���Ȃ��ƌ��߂������ł��B";
		mes "�{���ɂ悩�����ł��B";
		mes "�w�����g�l�̈ӎv�͑��d���܂����A";
		mes "�푈�͗ǂ����̂ł͂���܂��񂩂�B";
		next;
		mes "[�J���x����]";
		mes "���ꂩ��͂����Ńw�����g�l�������A";
		mes "�l�X�̈��S�ƕ��a����邽�߁A";
		mes "�F�Ɛs�͂������Ǝv���܂��B";
		close;
	default:
		mes "[�J���x����]";
		mes "�w�����g�l��";
		mes "�����ݕ��̏��������Ȃ��ẮB";
		close;
	}
}

prt_cas.gat,85,223,1	script	�}�N�V�[�~���A��#ep16wig01	10133,{
	mes "[�}�N�V�[�~���A��]";
	mes "�ŋ߁A�䂪�Ƃ̃��H���t��";
	mes "�E�B�O�i�[�l�̂����b�ɂȂ��Ă����";
	mes "�����Ă��܂���B";
	next;
	mes "[�����B�G��]";
	mes "����Ȃ��Ƃ́I";
	mes "�䂪�Ƃ̃A�C�U�b�N�̂ق����A";
	mes "���x���u���O�Ƃ̑�������";
	mes "�󂯌p�������H���t�l����";
	mes "�F�X�Ɗw��ł���ƕ����܂����B";
	mes "�͂͂́I";
	next;
	mes "[�J�^���i]";
	mes "�ǂ����A�C�U�b�N��";
	mes "��낵�����肢�������܂��B";
	close;
}

prt_cas.gat,104,231,3	script	�j����̂��q�l#ep16wig01	817,{
	mes "[�j����̂��q�l]";
	mes "�j���ɗ���̂�";
	mes "�����y�����ł��I";
	mes "�����̕����ɐG�ꍇ��";
	mes "�@��ł�����ˁI";
	mes "�������������������Ƃ����܂ŁI";
	close;
}

prt_cas.gat,103,232,3	script	�j����̂��q�l#ep16wig0	824,{
	mes "[�j����̂��q�l]";
	mes "�ӂ��c�c�j���͔��܂��B";
	mes "�܂����̔��������ĂȂ��̂ɁB";
	mes "�{���ɐl�������ł��ˁB";
	close;
}

prt_cas.gat,81,235,3	script	�j����̂��q�l#ep16wig02	478,{
	mes "[�j����̂��q�l]";
	mes "���[���~�b�h�K�b�c�����̏��";
	mes "�傫���؂₩�ł��ˁB";
	mes "�ٍ��̏���������܂��B";
	mes "�����܂ŗ���̂͑�ςł�����";
	mes "���Ă悩�����ł���B";
	close;
}

prt_cas.gat,79,219,7	script	�j����̂��q�l#ep16wig03	583,{
	mes "[�j����̂��q�l]";
	mes "�������I�@�`���җl����Ȃ��ł����I";
	mes "�|�[�g�}�����ɂ����Ă��������ˁI";
	mes "�݂�Ȋ��}���܂���I";
	close;
}

prt_cas.gat,88,246,7	script	�j����̂��q�l#ep16wig04	839,{
	mes "[�j����̂��q�l]";
	mes "�����̊y�c�̉��t��";
	mes "�S�ɋ����܂��ˁB";
	mes "�������痈���b�オ����܂��B";
	close;
}

prt_cas.gat,114,226,5	script	�j����̂��q�l#ep16wig05	537,{
	mes "[�j����̂��q�l]";
	mes "�����̉Ԃ��Ă݂��";
	mes "���̂悤�Ɍ���̂ł����H";
	mes "�s�v�c�ł��ˁB";
	close;
}

prt_cas.gat,87,231,5	script	�j����̂��q�l#ep16wig06	778,{
	mes "[�j����̂��q�l]";
	mes "�́A��x����";
	mes "���{�ɗ������Ƃ�����܂����c�c";
	mes "�����Ԃ�ƕς��܂����ˁB";
	mes "����ɑ傫���D��ɂȂ�܂����B";
	next;
	mes "[�j����̂��q�l]";
	mes "���́A��������ʂ̏�Ԃ��Ȃ��";
	mes "�����Ă��M�����܂����B";
	close;
}

prt_cas.gat,86,251,5	script	�j����̂��q�l#ep16wig07	967,{
	mes "[�j����̂��q�l]";
	mes "�����͐l�������ł��ˁB";
	mes "���܂�ɑ����Ă߂܂������܂��B";
	mes "�ł������������C�͂����ł��ˁB";
	close;
}

prt_cas_q.gat,81,131,0	script	#ep16_1�Q�I���O	139,5,5,{
	end;
OnTouch:
	if(EP16_1QUE >= 2 && EP16_2QUE == 0) {
		mes "[�}�[�e�B��]";
		mes "�����I�@�~�܂�Ȃ����I";
		unittalk getnpcid(0,"�Q�I���O�Ǝ��R�m#ep16_1_m"),"�Q�I���O�Ǝ��R�m : �����I�@�~�܂�Ȃ����I",1;
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_m";
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�}�[�e�B��]";
		mes "���ܗl�ɋ߂Â��҂ɂ�";
		mes "��ɐg�̌������󂯂Ă��������I";
		mes "�܂��͐g�����ؖ��ł�����̂�";
		mes "�����i�����ׂ�";
		mes "���̃e�[�u���̏�ɏ悹��B";
		next;
		mes "[�}�[�e�B��]";
		mes "���ꂪ�ł�����A";
		mes "�ǂɎ�����c�c";
		next;
		mes "[�W�F���[�h]";
		mes "�}�[�e�B���I�@��߂�I";
		mes "������K�˂ė��邨�q�l��";
		mes "����ȑԓx���Ƃ�Ȃ�";
		mes "���������낤!?";
		emotion 23,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�}�[�e�B��]";
		mes "�ӂ�A���ܗl�̈��S�̂��߂��B";
		next;
		mes "[�W�F���[�h]";
		mes "�m���ɉ��ܗl�̈��S�����̂�";
		mes "���̎d�����B";
		mes "�����A����͂��q�l��";
		mes "����ȑԓx���Ƃ�����A";
		mes "�ǂ��o���Ƃ������Ƃł͂Ȃ����B";
		emotion 7,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�}�[�e�B��]";
		mes "����ȊÂ��l����";
		mes "���ܗl������킯�Ȃ����낤�I";
		next;
		mes "[�W�F���[�h]";
		mes "�c�c�m���ɍ��A���̏��";
		mes "���ʌp���ŎE���Ƃ��Ă���B";
		mes "�����A����ȏ󋵂ł�";
		mes "�������ɏo���邱�Ƃ�";
		mes "�����Ă���񂾁B";
		next;
		mes "[�}�[�e�B��]";
		mes "����ɉ��ܗl��";
		mes "�Q�I���O�Ƃ́c�c";
		emotion 9,"�Q�I���O�Ǝ��R�m#ep16_1_m";
		next;
		mes "[����]";
		mes "�Ȃɂ𑛂��ł���������́H";
		cutin "ep16gao_1.bmp",2;
		next;
		cutin "ep16gao_1.bmp",255;
		mes "[�W�F���[�h]";
		mes "�͂��I�@���ܗl�I";
		mes "�\���󂲂����܂���B";
		mes "���q�l����������Ⴂ�܂����B";
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		setquest 11400;
		set EP16_2QUE,1;
		close;
	}
	end;
}

prt_cas_q.gat,93,129,3	script	����#ep16_1	10121,{
	switch(EP16_2QUE) {
	case 0:
		mes "[�}�[�e�B��]";
		mes "�����I�@�~�܂�Ȃ����I";
		unittalk getnpcid(0,"�Q�I���O�Ǝ��R�m#ep16_1_m"),"�Q�I���O�Ǝ��R�m : �����I�@�~�܂�Ȃ����I",1;
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_m";
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�}�[�e�B��]";
		mes "���ܗl�ɋ߂Â��҂ɂ�";
		mes "��ɐg�̌������󂯂Ă��������I";
		mes "�܂��͐g�����ؖ��ł�����̂�";
		mes "�����i�����ׂ�";
		mes "���̃e�[�u���̏�ɏ悹��B";
		next;
		mes "[�}�[�e�B��]";
		mes "���ꂪ�ł�����A";
		mes "�ǂɎ�����c�c";
		next;
		mes "[�W�F���[�h]";
		mes "�}�[�e�B���I�@��߂�I";
		mes "������K�˂ė��邨�q�l��";
		mes "����ȑԓx���Ƃ�Ȃ�";
		mes "���������낤!?";
		emotion 23,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�}�[�e�B��]";
		mes "�ӂ�A���ܗl�̈��S�̂��߂��B";
		next;
		mes "[�W�F���[�h]";
		mes "�m���ɉ��ܗl�̈��S�����̂�";
		mes "���̎d�����B";
		mes "�����A����͂��q�l��";
		mes "����ȑԓx���Ƃ�����A";
		mes "�ǂ��o���Ƃ������Ƃł͂Ȃ����B";
		emotion 7,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�}�[�e�B��]";
		mes "����ȊÂ��l����";
		mes "���ܗl������킯�Ȃ����낤�I";
		next;
		mes "[�W�F���[�h]";
		mes "�c�c�m���ɍ��A���̏��";
		mes "���ʌp���ŎE���Ƃ��Ă���B";
		mes "�����A����ȏ󋵂ł�";
		mes "�������ɏo���邱�Ƃ�";
		mes "�����Ă���񂾁B";
		next;
		mes "[�}�[�e�B��]";
		mes "����ɉ��ܗl��";
		mes "�Q�I���O�Ƃ́c�c";
		emotion 9,"�Q�I���O�Ǝ��R�m#ep16_1_m";
		next;
		mes "[����]";
		mes "�Ȃɂ𑛂��ł���������́H";
		cutin "ep16gao_1.bmp",2;
		next;
		cutin "ep16gao_1.bmp",255;
		mes "[�W�F���[�h]";
		mes "�͂��I�@���ܗl�I";
		mes "�\���󂲂����܂���B";
		mes "���q�l����������Ⴂ�܂����B";
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		setquest 11400;
		set EP16_2QUE,1;
		close;
	case 1:
		mes "[�L���T����]";
		mes "�悤������������Ⴂ�܂����B";
		mes "�킽�����͂��̍��̉��܁A";
		mes "�L���T�����E�Q�I���O�B";
		cutin "ep16gao_2.bmp",2;
		next;
		menu "�����A�Ɏf���܂���",-;
		mes "[�L���T����]";
		mes "�R�m�����̖���A";
		mes "���l�т��܂���B";
		mes "�j���̊J�ÂɁA���ʌp���Ƒ�����";
		mes "�F���q���ɂȂ��Ă���悤�ł��B";
		mes "�ǂ����A���������������܂��B";
		emotion 17,"����#ep16_1";
		cutin "ep16gao_1.bmp",2;
		next;
		menu "���ʌp���ɂ��ĕ���",-;
		cutin "ep16gao_1.bmp",2;
		mes "[�L���T����]";
		mes "�����A�����ł�����ˁB";
		mes "�����A���������N������";
		mes "����ȍv�������ꂽ���Ȃ���";
		mes "���ʌp���̋V������������";
		mes "���肢���܂������́B";
		next;
		mes "[�L���T����]";
		mes "�e�Ɩ�ɘb��";
		mes "���������������Ƃł��傤�B";
		mes "�킽�����̓Q�I���O�Ƃɂ���";
		mes "������΂�낵��������B";
		next;
		mes "[�L���T����]";
		mes "�Q�I���O�Ƃ�";
		mes "�����̉p�Y�g���X�^��1���̎q���ŁA";
		mes "��X�����̉��ƋR�m�����𐢂ɏo����";
		mes "�����Ƃł��B";
		next;
		mes "[�L���T����]";
		mes "�ȑO�s��ꂽ";
		mes "^0000ff���������I�o�̐R����^000000�ɂ��A";
		mes "�Q�I���O�Ƃ����";
		mes "^0000ff��l���q�ł���G�����X�g^000000��";
		mes "���Ƃ��đI�΂�Ă��܂�����B";
		next;
		mes "[�L���T����]";
		mes "���́A�Ⴂ�܂�����ǁc�c";
		next;
		menu "�Ⴄ�Ƃ́H",-;
		mes "[�L���T����]";
		mes "�c�c���炠��A";
		mes "�킽�����Ƃ������Ƃ�";
		mes "���������Ă��܂��܂�����ˁB";
		next;
		mes "[�L���T����]";
		mes "����ɂ��Ă�";
		mes "���b���ł��܂���́B";
		mes "�����Ȃ��������Ƃɂ��Ă��������ȁB";
		cutin "ep16gao_3.bmp",2;
		next;
		mes "[�L���T����]";
		mes "�����A����̉��ʌp����";
		mes "^0000ff�Q�I���O�Ƃ͗����^000000���܂����";
		mes "�������Ă���������΁B";
		cutin "ep16gao_1.bmp",2;
		next;
		mes "[�L���T����]";
		mes "���āA���낻�뎞�Ԃ̂悤�ł���B";
		mes "���������́A";
		mes "�W�F���[�h�ƃ}�[�e�B����";
		mes "�����܂��傤�B";
		next;
		mes "[�L���T����]";
		mes "����ƁA�����j����ɂ�";
		mes "������o���ɂȂ��܂����H";
		mes "�����̗����≉�t��";
		mes "�p�ӂ����܂����́B";
		mes "�V���܂ł̊ԁA�y����ł��������";
		mes "���ꂵ���ł���B";
		cutin "ep16gao_2.bmp",2;
		next;
		mes "[�L���T����]";
		mes "����ł͂킽������";
		mes "����������܂��̂ł���ŁB";
		cutin "ep16gao_1.bmp",2;
		next;
		delquest 11400;
		setquest 11401;
		delquest 73056;
		set EP16_2QUE,2;
		if((checkquest(7683)&0x8) && !checkquest(73051) && !checkquest(73053) && !checkquest(73052) && !checkquest(73054) && !checkquest(73055) && !checkquest(73056)) {
			mes "�]^0000cd�����Ƃ��ׂĂɈ��A�������B^000000";
			mes "�@�x���̂Ƃ���ɖ߂낤�]";
		} else {
			mes "�]^0000cd�Q�I���O�ƂƂ̈��A���ς܂����B^000000";
			mes "�@���̉��Ƃɂ����A�ɍs�����]";
		}
		next;
		mes "�]���̎��A�L���T������";
		mes "�@�b�������Ă����]";
		next;
		cutin "ep16gao_1.bmp",2;
		mes "[�L���T����]";
		mes "���������A�j�����ɂ�";
		mes "�Q�I���O�Ƃ̎҂�����܂��B";
		mes "�G�����X�g�����邩������܂���B";
		mes "��낵����΁A";
		mes "����ɂȂ��Ă��������B";
		next;
		mes "�]^0000cd�G�����X�g���q�ƃQ�I���O�ƃN�G�X�g^000000��";
		mes "�@�󒍂����]";
		close2;
		cutin "ep16gao_1.bmp",255;
		end;
	case 2:
		cutin "ep16gao_1.bmp",2;
		mes "[�L���T����]";
		mes "���₪����悤�ł�����";
		mes "�����ɂ���W�F���[�h�ƃ}�[�e�B����";
		mes "�����܂��傤�B";
		next;
		mes "[�L���T����]";
		mes "����ł͂킽������";
		mes "����������܂��̂ł���ŁB";
		mes "�܂����ł����炵�Ă��������ȁB";
		close2;
		cutin "ep16gao_1.bmp",255;
		end;
	case 3:
	case 4:
	case 5:
		switch(rand(3)) {
		case 0:
			mes "[�L���T����]";
			mes "�����N����̒Q�菑�H";
			cutin "ep16gao_1.bmp",2;
			next;
			mes "[�L���T����]";
			mes "�c�c";
			next;
			mes "[�L���T����]";
			mes "�����Ɏg�҂��o���܂��傤�B";
			mes "�}���ŏ���������K�v��";
			mes "���肻���ł���ˁB";
			close2;
			cutin "ep16gao_1.bmp",255;
			end;
		case 1:
			mes "[�L���T����]";
			mes "�܂��킽�����̃h���X��";
			mes "�����\���ł��́c�c�H";
			mes "�����Ⴄ�h���X�𒅂Ă�";
			mes "�]���Ă��܂��قǂ̃h���X��";
			mes "�ǂ�����ƌ����́c�c";
			cutin "ep16gao_3.bmp",2;
			next;
			mes "[�L���T����]";
			mes "�s���ł���ˁB";
			emotion 6;
			cutin "ep16gao_1.bmp",2;
			close2;
			cutin "ep16gao_1.bmp",255;
			end;
		case 2:
			mes "[�L���T����]";
			mes "�����c��Ŏg�p����";
			mes "�ō����C���N��c�c�H";
			mes "�g�p�҂͂ǂȂ�������B";
			cutin "ep16gao_1.bmp",2;
			next;
			mes "[�L���T����]";
			mes "�c�c�j���̋L�^���Ȃ��B";
			mes "�L�^���s�����L�̔��i�ł��Ȃ����_��";
			mes "�s���ł���ˁB";
			emotion 6;
			close2;
			cutin "ep16gao_1.bmp",255;
			end;
		}
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[�L���T����]";
		mes "�G�����X�g�̂��Ƃł��́H";
		mes "�����ł���ˁc�c";
		cutin "ep16gao_1.bmp",2;
		next;
		mes "[�L���T����]";
		mes "������������`���Ă���܂��B";
		mes "���A���Y�ꂸ���Ă��܂����A";
		mes "�^�ʖڂȂ̂ł��傤�ˁB";
		cutin "ep16gao_2.bmp",2;
		next;
		mes "[�L���T����]";
		mes "���������΁c�c";
		mes "�j�����͂��܂��Ă���";
		mes "�d���������Ăǂ�����";
		mes "�s���Ă��܂����悤�ł���ˁB";
		mes "�܂�������Ă��Ȃ���B";
		cutin "ep16gao_1.bmp",2;
		close2;
		cutin "ep16gao_1.bmp",255;
		end;
	case 14:
		mes "[�L���T����]";
		mes "�G�����X�g�ɂ�";
		mes "�o��܂������H";
		cutin "ep16gao_1.bmp",2;
		next;
		switch(select("�o���","�o��Ă��Ȃ�")) {
		case 1:
			mes "[�L���T����]";
			mes "�����ł����c�c�B";
			next;
			mes "[�L���T����]";
			mes "�c�c���̎q�͉���";
			mes "�b���Ă͂���܂���";
			mes "�����������Ă�����";
			mes "�킽�����͐M���Ă���܂��B";
			next;
			mes "[�L���T����]";
			mes "�ǂ����킽�����ƈꏏ��";
			mes "���̎q�̐�����";
			mes "������Ă����Ă��������ȁB";
			cutin "ep16gao_2.bmp",2;
			close2;
			cutin "ep16gao_2.bmp",255;
			end;
		case 2:
			mes "[�L���T����]";
			mes "�����ł����c�c�B";
			mes "����قǂ܂�";
			mes "���̕����ɂ���܂����̂Ɂc�c";
			cutin "ep16gao_1.bmp",2;
			next;
			mes "[�L���T����]";
			mes "�Ɩ�̑�\�����̂悤��";
			mes "��������Ă΂���ł�";
			mes "����܂���B";
			next;
			menu "�G�����X�g�̉\�ɂ��ĕ���",-;
			mes "[�L���T����]";
			mes "�c�c���̘b��";
			mes "�������ɂȂ�Ȃ��ł��������ȁB";
			cutin "ep16gao_3.bmp",2;
			next;
			mes "[�L���T����]";
			mes "����́A�Q�I���O�Ƃ�";
			mes "���獎�����ׂ����ł���B";
			close2;
			cutin "ep16gao_3.bmp",255;
			end;
		}
	}
	end;
}

prt_cas_q.gat,87,132,3	script	�Q�I���O�Ǝ��R�m#ep16_1_m	733,{
	switch(EP16_2QUE) {
	case 2:
		mes "[�}�[�e�B��]";
		mes "���͂�邱�Ƃ�����B";
		mes "�p������Ȃ�W�F���[�h��";
		mes "�b���Ă���B";
		close;
	case 3:
		mes "[�}�[�e�B��]";
		mes "�܂��Ȃɂ�����̂��H";
		close;
	case 4:
		mes "[�}�[�e�B��]";
		mes "���R�͒m��Ȃ����A";
		mes "�X�J�[���b�g�l�ƃ��f�B�I���l��";
		mes "�̂��璇�������B";
		next;
		mes "[�}�[�e�B��]";
		mes "�N�����߂��񂾂��A";
		mes "���ܗl�̂��߂ɂ�";
		mes "�����ݍ���Ȃ��ł��炢�������̂����A";
		mes "�c�c����b���B";
		next;
		mes "[�}�[�e�B��]";
		mes "�����Ȃ̂ɂ�";
		mes "���R�͂Ȃ��̂�������Ȃ��B";
		mes "��������A���i�Ȑl������B";
		close;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�}�[�e�B��]";
		mes "�����悤�ł�����̂��H";
		close;
	case 13:
		mes "[�}�[�e�B��]";
		mes "�G�����X�g�l�Ȃ�j����̂ق���";
		mes "������ꂽ�B";
		mes "�܂����������邩��";
		mes "���̒m��Ƃ���ł͂Ȃ����ȁB";
		close;
	case 14:
		mes "[�}�[�e�B��]";
		mes "���ܗl�A";
		mes "�������킵���c�c";
		close;
	default:
		mes "[�}�[�e�B��]";
		mes "�������H";
		mes "���ܗl�Ɏ���̂Ȃ��悤�ɂȁB";
		close;
	}
}

prt_cas_q.gat,85,127,3	script	�Q�I���O�Ǝ��R�m#ep16_1_g	65,{
	switch(EP16_2QUE) {
	case 2:
		mes "[�W�F���[�h]";
		mes "���q�l�A";
		mes "��قǂ͎��炢�����܂����B";
		next;
		mes "[�}�[�e�B��]";
		mes "�����i�ɕs�R�ȕ���";
		mes "����܂���ł����̂ŁA";
		mes "���Ԃ��������܂��B";
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		mes "[�W�F���[�h]";
		mes "�}�[�e�B���I";
		mes "�������Ă���̂��Ǝv������A";
		mes "����ɉו������Ȃǂ��Ă����̂��I";
		next;
		mes "[�}�[�e�B��]";
		mes "���ꂾ���吨�̐l�Ԃ�";
		mes "�o���肵�Ă���񂾁B";
		mes "�p�S����ɂ��������Ƃ͂Ȃ����낤�H";
		next;
		mes "[�W�F���[�h]";
		mes "�܂������c�c";
		mes "�@";
		mes "���q�l�A";
		mes "�d�ˏd�ˁA���炢�����܂����B";
		next;
		switch(select("������","�{���ł���")) {
		case 1:
			mes "[�W�F���[�h]";
			mes "�c�c���肪�Ƃ��������܂��B";
			mes "�ق�A�}�[�e�B��";
			mes "���O������������I";
			break;
		case 2:
			mes "[�W�F���[�h]";
			mes "�{���ɐ\���󂠂�܂���I";
			mes "���̂悤�Ȃ��Ƃ�";
			mes "�����N����Ȃ��悤�ɂ��܂��̂ŁI";
			mes "�ق�A�}�[�e�B��";
			mes "���O������������I";
			break;
		}
		next;
		mes "�]�}�[�e�B���ƌĂ΂��";
		mes "�@���R�m�́A�s�������ȕ\����B������";
		mes "�@�������������������]";
		next;
		mes "[�W�F���[�h]";
		mes "����I";
		next;
		mes "[�}�[�e�B��]";
		mes "�c�c���̎��̂悤�Ȃ��Ƃ�";
		mes "������Ƃ��B";
		emotion 0,"�Q�I���O�Ǝ��R�m#ep16_1_g";
		next;
		menu "���̎��H",-;
		mes "[�W�F���[�h]";
		mes "���A�������A���q�l�I";
		mes "�����j����ɂ͌������܂������H";
		mes "��낵����΁A���ɂ���";
		mes "�Q�I���O�Ƃ̕��X�ɂ�";
		mes "����ɂȂ��Ă��������B";
		next;
		mes "[�W�F���[�h]";
		mes "���ܗl�̎o�N�ł���";
		mes "�X�J�[���b�g�E�U�n�[�l��";
		mes "������ɂ����������Ă܂���B";
		next;
		mes "[�W�F���[�h]";
		mes "�Q�I���O�Ƃ̐l�Ԃł͂Ȃ��ł���";
		mes "���ܗl�Ɋւ��Ă�";
		mes "�m��Ȃ����Ƃ��Ȃ����ł��B";
		delquest 11401;
		setquest 11402;
		set EP16_2QUE,3;
		close;
	case 3:
		mes "[�W�F���[�h]";
		mes "�����j����ɂ͌������܂������H";
		mes "��낵����΁A���ɂ���";
		mes "�Q�I���O�Ƃ̕��X�ɂ�";
		mes "����ɂȂ��Ă��������B";
		next;
		mes "[�W�F���[�h]";
		mes "���ܗl�̎o�N�ł���";
		mes "�X�J�[���b�g�E�U�n�[�l��";
		mes "������ɂ����������Ă܂���B";
		next;
		mes "[�W�F���[�h]";
		mes "�Q�I���O�Ƃ̐l�Ԃł͂Ȃ��ł���";
		mes "���ܗl�Ɋւ��Ă�";
		mes "�m��Ȃ����Ƃ��Ȃ����ł��B";
		close;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�W�F���[�h]";
		mes "�X�J�[���b�g�l�Ɖ��ܗl��";
		mes "���Ȃ��΂�����Ă��邻���ł����A";
		mes "�����ڂ͂ƂĂ����Ⴂ���ł��̂�";
		mes "���ܗl�ƍ�������悤�ɂ�";
		mes "�����܂���B";
		next;
		mes "[�W�F���[�h]";
		mes "���ܗl�����g��";
		mes "���Ȃ��΂�������Ă܂���";
		mes "����Ȃɂ����������ł��B";
		mes "���ۂ����Ⴍ������̂�";
		mes "����l�̉Ɩ�̓����������ł���B";
		close;
	case 13:
		mes "[�W�F���[�h]";
		mes "��l�ō�����S���̂�";
		mes "��ς��Ƃ����̂ɁA";
		mes "�j���ɉ��ʌp�������܂Łc�c";
		mes "���������Ԃ́A";
		mes "���x�݂ɂȂ鎞�Ԃ��Ȃ��悤�ł��B";
		next;
		mes "[�W�F���[�h]";
		mes "���ܗl���G�����X�g�l��";
		mes "���h�����Ƃ��������܂����B";
		mes "���������y�ɂȂ��ė~�����ł��B";
		close;
	case 14:
		mes "[�W�F���[�h]";
		mes "���ʌp�����I���΁A";
		mes "���ܗl�͐V�������ɍ�����C����";
		mes "�X�J�[���b�g�l�̏��";
		mes "���߂�ɂȂ邩������܂���B";
		next;
		mes "[�W�F���[�h]";
		mes "�ꐶ�������Ɏd����ƌ��߂�";
		mes "���ܗl�Ɏd���ė������Ƃ��Ă�";
		mes "�c�c�����S�z�ł��B";
		close;
	default:
		mes "[�W�F���[�h]";
		mes "���ܗl�̌�O�ł��B";
		mes "�ǂ����A����̂Ȃ��悤";
		mes "���C�����Ă��������B";
		close;
	}
}

prt_cas.gat,73,244,5	script	�X�J�[���b�g�E�U�n�[#ep16_1	71,{
	switch(EP16_2QUE) {
	case 3:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��A�܂��܂�";
		mes "�`���l���A��M���̎���";
		mes "�Ȃɂ����p�ł����H";
		emotion 18;
		next;
		switch(select("�Q�I���O�Ƃɂ��ĕ���","���A������","�Ȃ�ł�����܂���")) {
		case 1:
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "�͂��c�c";
			mes "���Ȃ��ł��́H";
			next;
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "�b�������Ă������";
			mes "�݁[��ȁA���𑵂���";
			mes "�u�Q�I���O�ƃQ�I���O�Ɓv��";
			mes "�Q�I���O�Ƃ̂��Ƃ΂���B";
			emotion 6;
			next;
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "�����g�ɋ����������Ă�";
			mes "���������Ȃ��̂�����H";
			next;
			switch(select("�c�c","��������܂���","��������܂�")) {
			case 1:
				mes "[�X�J�[���b�g�E�U�n�[]";
				mes "���炠��I";
				mes "�Q�ĂȂ��ł��������ȁB";
				mes "�ق�̏�k�ł�����B";
				mes "���ӂӁB";
				emotion 18;
				next;
				break;
			case 2:
				mes "[�X�J�[���b�g�E�U�n�[]";
				mes "���炠��I";
				mes "�ƂĂ������Ȃ����ł��̂ˁB";
				mes "�܂��A�ق�̏�k�ł������́B";
				mes "�C�ɂȂ���Ȃ��łˁB���ӂӁB";
				emotion 18;
				next;
				break;
			case 3:
				mes "[�X�J�[���b�g�E�U�n�[]";
				mes "���炠��I";
				mes "������������A���ӂӁB";
				mes "����Ƃ����̔N���";
				mes "�������Ȃ��̂�����ˁB";
				next;
				mes "[�X�J�[���b�g�E�U�n�[]";
				mes "�܂��A�ق�̏�k�ł����́B";
				mes "�C�ɂȂ���Ȃ��ŁB";
				emotion 18;
				next;
				break;
			}
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "�F�������m�̒ʂ�A";
			mes "�Q�I���O�Ƃ̑c���";
			mes "���[���~�b�h�K�b�c������";
			mes "���������p�Y�Ȃ̂ł���I";
			next;
			mes "[���f�B�I���E�Q�I���O]";
			mes "�c�c�����̉p�Y�ł���";
			mes "�g���X�^��1���̎q���B";
			mes "����Șb�͊X�ɂ���";
			mes "�q���ł���m���Ă���ق�";
			mes "�L���Șb�Ȃ񂾂��ȁH";
			mes "�U�n�[�v�l�B";
			next;
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "���炠��܂��܂��I";
			mes "���f�B�I���E�Q�I���O�l�I";
			mes "���̂̒��q���F�����Ȃ���";
			mes "�f���Ă���܂������A";
			mes "�����C�����łȂɂ��ł���B";
			emotion 6;
			next;
			mes "[���f�B�I���E�Q�I���O]";
			mes "�͂͂́B";
			mes "�Q�I���O�Ƃ̐l�Ԃł��Ȃ�";
			mes "�U�n�[�Ƃ̏������A";
			mes "�䂪�Q�I���O�Ɩ�ɂ��āA";
			mes "���������Șb�����ɂ���Ȃ���";
			mes "�S�z�ŋx��ł����܂��񂩂�ȁB";
			delquest 11402;
			setquest 11403;
			set EP16_2QUE,4;
			close;
		case 2:
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "���炠��I";
			mes "���Ȃ��̂悤�Ȗ`���҂�";
			mes "���A����Ă��܂��܂�����I";
			mes "�Ⴄ���E�ɐ����Ă�҂ł�����";
			mes "�ƂĂ��V�N�ł���ˁB";
			close;
		case 3:
			mes "[�X�J�[���b�g�E�U�n�[]";
			mes "�����ł��́H";
			mes "�ɂ��₩�ȏj���ɕ�����āA";
			mes "�v�킸���������Ă��܂�ꂽ�̂�����B";
			mes "���ӂӁB";
			close;
		}
		end;
	case 4:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��A�܂��܂��B";
		mes "���f�B�I���E�Q�I���O�l�I";
		mes "���̂̒��q�����܂�";
		mes "�悭�Ȃ��ƕ����܂������A";
		mes "�x�܂Ȃ��đ��v�ł��́H";
		emotion 6;
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "���Ȃ��ł��Ƃ��B";
		mes "�Q�I���O�Ƃ̐l�Ԃł��Ȃ�";
		mes "�U�n�[�Ƃ̏������A";
		mes "�䂪�Q�I���O�Ɩ�ɂ��āA";
		mes "���������Șb�𗬂��Ă��܂�Ȃ���";
		mes "�S�z�ŋx��ł����܂��񂩂�ȁB";
		close;
	case 5:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�ӂ�A���Ȗꂳ�񂾂�I";
		mes "�������Ⴂ������";
		mes "���������΂���I";
		emotion 6;
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "����I�@���قققفB";
		mes "�`���җl�������������̂ˁB";
		mes "�Q�I���O�Ƃ͉��ʌp�����I��莟��A";
		mes "������n���A���{���o�ĐÂ���";
		mes "�߂����Ƃ����b�����Ă��܂����̂�B";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�����L���T�����ɂ�";
		mes "����ȏ�͔߂����";
		mes "�~��������܂��񂩂�B";
		mes "����̌���ɂ�";
		mes "�^�����Ă��܂���B";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�ł����A�̐S�̓����҂ł���";
		mes "�G�����X�g���q��";
		mes "������T���Ă�������܂���́B";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���̏f��ł��鎄���A";
		mes "�����������q���Ԃ߂邽�߂�";
		mes "�������痈���Ƃ����̂ɁI";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�a�ň��ނ�\�������扤��";
		mes "�����������ł����A";
		mes "���ɂ͖Z�����Ƃ������R��";
		mes "�j����ɒǂ��o����";
		mes "�����q�̎p�͌����Ȃ��܂܁c�c";
		emotion 28;
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�����j�����";
		mes "�G�����X�g���q�ɉ������A";
		mes "������Ɋ���o���悤��";
		mes "�`���Ă��������ȁB";
		mes "�K���ł����B";
		set EP16_2QUE,6;
		delquest 11404;
		setquest 11405;
		close;
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�����҂ł���";
		mes "�G�����X�g���q��";
		mes "������T���Ă�������܂���́B";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���̏f��ł��鎄���A";
		mes "�����������q���Ԃ߂邽�߂�";
		mes "�������痈���Ƃ����̂ɁI";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�a�ň��ނ�\�������扤��";
		mes "�����������ł����A";
		mes "���ɂ͖Z�����Ƃ������R��";
		mes "�j����ɒǂ��o����";
		mes "�����q�̎p�͌����Ȃ��܂܁c�c";
		emotion 28;
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�����j�����";
		mes "�G�����X�g���q�ɉ������A";
		mes "������Ɋ���o���悤��";
		mes "�`���Ă��������ȁB";
		mes "�K���ł����B";
		close;
	case 13:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��B";
		mes "�G�����X�g���q��";
		mes "��͂茩����Ȃ�����";
		mes "�݂����ł���ˁH";
		mes "�L���T�����ɕ������ق���";
		mes "��낵��������B";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�c�c";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���Ȃ��̕\�������΂킩��܂��B";
		mes "���̎q�̉\��";
		mes "�����Ă��܂����̂ł��ˁB";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�C���̗ǂ��b�ł͂Ȃ�������";
		mes "�v���܂����ǁA";
		mes "���܂�C�ɂ��Ȃ��ł��������ȁB";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�G�����X�g���q��";
		mes "���̂悤�ȉ\�b�ɑς���ꂸ�A";
		mes "�B��Ă��܂����̂�������Ȃ���ˁB";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�c�c�܂��A";
		mes "���̎q�ɂ��܂�";
		mes "�x�����K�v�Ȃ̂ł��傤�B";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�`���җl���A�G�����X�g���q��";
		mes "�T���̂͂��x�݂ɂȂ��āA";
		mes "�j�����y����ł��������ȁB";
		next;
		if(checkitemblank() == 0) {	// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���������̊y�����j����";
		mes "���̂܂܏I����Ă��܂��Ă�";
		mes "�c�O�ł͂���܂��񂩁B";
		set EP16_2QUE,14;
		delquest 11412;
		setquest 201890;
		getitem 6919,25;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		close;
	case 14:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��A�܂��܂��I";
		mes "�y����ł�������Ⴂ�܂����H";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���������Ԃ�����Ȃ�";
		mes "���E�`�ł��������Ă��������ȁB";
		mes "���f�B�I���l�̏�����";
		mes "�O���Ă��܂��܂�����B";
		close;
	default:
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��A�܂��܂�";
		mes "�G�����X�g���q�͂ǂ�������H";
		mes "�p�������܂����B";
		emotion 18;
		close;
	}
	end;
}

prt_cas.gat,82,240,3	script	���f�B�I���E�Q�I���O#ep16_1	923,{
	switch(EP16_2QUE) {
	case 4:
		mes "[���f�B�I���E�Q�I���O]";
		mes "�������Q�I���O�Ƃ�";
		mes "�����Ƃ̈�ł͂���A";
		mes "���A�ł������̉���r�o���Ă���";
		mes "���ƒ��̖��ƂƂ����܂��B";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "���ۂɃ��[���~�b�h�K�b�c������";
		mes "���S�ł���v�����e����";
		mes "�{���n��u���Ă���I";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "�����ł���g���X�^��3����";
		mes "�ˑR�̕a�ɂ����ނ���͂��܂�A";
		mes "�����ĉ��q�����ɑ�����";
		mes "�s�^�Ȏ������������̂ɂ�";
		mes "������炸�I";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "�G�����X�g�E�Q�I���O���q��";
		mes "��̉��ʌp���ŗL�͌���";
		mes "�I�o���ꂽ���Ƃ�";
		mes "�Q�I���O�Ƃ̗͂�";
		mes "�\���Ă���Ƃ����܂��ȁI";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��A�܂��܂��B";
		mes "�Q�I���O�Ƃ̃G�����X�g���q�́A";
		mes "���ʌp�������ނ���܂������H";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "���c�c!?";
		unittalk getnpcid(0,"���f�B�I���E�Q�I���O#ep16_1"),"���f�B�I���E�Q�I���O : ��!?",1;
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�ł�����A";
		mes "�G�����X�g���q��";
		mes "���ʌp���������ۂȂ������́B";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "����ȁc�c";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "����ȁc�c���肦�Ȃ�!!";
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "���炠��A�܂��܂��B";
		mes "���ƒ��̖��Ɨl�́A";
		mes "���~�ɂ������āA�×{�Ȃ����Ă΂����";
		mes "����ȑ傫���j���[�X��";
		mes "�����̂悤�ł���˂��H";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "���A���肦�Ȃ���������!!";
		mes "�G�����X�g�́A�����͂ǂ���������!!";
		unittalk getnpcid(0,"���f�B�I���E�Q�I���O#ep16_1"),"���f�B�I���E�Q�I���O : ���킠��������!!�@�G�����X�g�͂ǂ���������!!",1;
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�����Ƃ́c�c";
		mes "���q�ɑ΂��Ď���ł͂Ȃ��āH";
		mes "����Ƃ����Ƃ̏o��";
		mes "���t�Â������m��Ȃ��̂�����B";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "���肦�Ȃ�����������!!";
		unittalk getnpcid(0,"���f�B�I���E�Q�I���O#ep16_1"),"���f�B�I���E�Q�I���O : ���肦�Ȃ�����������!!",1;
		set EP16_2QUE,5;
		delquest 11403;
		setquest 11404;
		close;
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[���f�B�I���E�Q�I���O]";
		mes "���A���肦�Ȃ���������!!";
		mes "���ʌp������������߂��ȂǁI";
		mes "�G�����X�g�́A�����͂ǂ���������!!";
		unittalk getnpcid(0,"���f�B�I���E�Q�I���O#ep16_1"),"���f�B�I���E�Q�I���O : ���킠��������!!�@�G�����X�g�͂ǂ���������!!",1;
		next;
		mes "[�X�J�[���b�g�E�U�n�[]";
		mes "�����Ƃ́c�c";
		mes "���q�ɑ΂��Ď���ł͂Ȃ��āH";
		mes "����Ƃ����Ƃ̏o��";
		mes "���t�Â������m��Ȃ��̂�����B";
		next;
		mes "[���f�B�I���E�Q�I���O]";
		mes "���肦�Ȃ�����������!!";
		unittalk getnpcid(0,"���f�B�I���E�Q�I���O#ep16_1"),"���f�B�I���E�Q�I���O : ���肦�Ȃ�����������!!",1;
		close;
	default:
		mes "[���f�B�I���E�Q�I���O]";
		mes "�ǂ��̃y�R�y�R�̍��Ƃ�";
		mes "�������z���";
		mes "�o���肳���邩��";
		mes "�����̕i�i��������̂��I";
		close;
	}
}

prt_cas.gat,76,258,0	script	#ep16_1�\�b1	139,3,3,{
OnTouch:
	if(EP16_2QUE == 6) {
		mes "[�\���Ă��鐺]";
		mes "�˂��A�����܂����H";
		mes "�g���X�^��3���É���";
		mes "�����Ŕ������ꂽ��ł����āI";
		mes "���킢��˂��c�c";
		next;
		mes "[�\���Ă��鐺]";
		mes "�������`�I";
		mes "�{����!?";
		next;
		mes "[�\���Ă��鐺]";
		mes "�É��͕a�̂��߂�";
		mes "�B�����ꂽ�̂ł͂Ȃ��āH";
		next;
		mes "[�\���Ă��鐺]";
		mes "�^�C�~���O�悭";
		mes "���������N�̌����d�Ȃ���";
		mes "�V��������̂��߂ɂ�";
		mes "�ނ��ꂽ�̂ł́H";
		next;
		mes "[�\���Ă��鐺]";
		mes "�킽���������������Ă��܂���B";
		next;
		mes "[�\���Ă��鐺]";
		mes "����A�ł�";
		mes "�M���ł������H";
		mes "�����ɂ��Ă��傤�����ˁB";
		set EP16_2QUE,7;
		delquest 11405;
		setquest 11406;
		close;
	}
	end;
}

prt_cas.gat,84,232,0	script	#ep16_1�\�b2	139,3,3,{
OnTouch:
	if(EP16_2QUE == 7) {
		mes "[�\���Ă��鐺]";
		mes "�c�c����ŉ��q������";
		mes "���ǓŎE���Ɓc�c";
		next;
		mes "[�\���Ă��鐺]";
		mes "����Ȃ��Ƃ��c�c";
		mes "���������ΑO���";
		mes "���ʌp���̎����c�c";
		set EP16_2QUE,8;
		delquest 11406;
		setquest 11407;
		close;
	}
	end;
}

prt_cas.gat,110,242,0	script	#ep16_1�\�b3	139,3,3,{
OnTouch:
	if(EP16_2QUE == 8) {
		mes "[�\���Ă��鐺]";
		mes "�ӂ�I";
		mes "�G�����X�g�̏��m��";
		mes "����ɉ��ʂ�";
		mes "���߂₪���āI";
		next;
		mes "[�\���Ă��鐺]";
		mes "�����́A";
		mes "�g���X�^��3���É���";
		mes "�Ō�̎��q�ł�";
		mes "���邾�낤�ɁI";
		next;
		mes "[�\���Ă��鐺]";
		mes "����";
		mes "�����傫���ł���I";
		next;
		mes "[�\���Ă��鐺]";
		mes "����`";
		mes "�����Ă�������H";
		mes "�Ȃɂ��Ԉ���Ă邩�H";
		next;
		mes "[�\���Ă��鐺]";
		mes "����ȏd�v�Ȃ��Ƃ�";
		mes "�ǂ����Ď��������";
		mes "���߂Ă��܂����񂾁I";
		next;
		mes "[�\���Ă��鐺]";
		mes "�Ɩ�̂��Ƃ�";
		mes "�l���Ă��Ȃ��̂��A�܂������I";
		set EP16_2QUE,9;
		delquest 11407;
		setquest 11408;
		close;
	}
	end;
}

prt_cas.gat,111,218,0	script	#ep16_1�\�b4	139,3,3,{
OnTouch:
	if(EP16_2QUE == 9) {
		mes "[�\���Ă��鐺]";
		mes "����ȎO���Ɩ�o�̂��";
		mes "�ꏏ�ɂ������ʂ��c�c";
		next;
		mes "[�\���Ă��鐺]";
		mes "�͂͂́c�c";
		mes "�Ђǂ����������Ȃ�";
		next;
		mes "[�\���Ă��鐺]";
		mes "�܂��A�ł�";
		mes "���̗��S����";
		mes "�O���̉Ƃ̌��҂�";
		mes "�l�������񂾂낤�H";
		next;
		mes "[�\���Ă��鐺]";
		mes "�������A����ŐS��a���";
		mes "���ʌp���������ނ���Ȃ��";
		mes "�{���]�|����Ȃ����B";
		next;
		mes "[�\���Ă��鐺]";
		mes "�����Ƃ���ɂ���";
		mes "�����ɂЂƂ�����������Ă�炵�����B";
		next;
		mes "[�\���Ă��鐺]";
		mes "�Ȃ�ď�Ȃ��I";
		set EP16_2QUE,10;
		delquest 11408;
		setquest 11409;
		close;
	}
	end;
}

prt_cas.gat,92,224,0	script	#ep16_1�\�b5	139,3,3,{
OnTouch:
	if(EP16_2QUE == 10) {
		mes "[�\���Ă��鐺]";
		mes "���炻�ꂶ�Ⴀ";
		mes "���A���{�̎d���͂��ׂ�";
		mes "���ܗl���s����";
		mes "��������̂ł����H";
		next;
		mes "[�\���Ă��鐺]";
		mes "�����݂����ł���B";
		mes "�É��͂��a�C��";
		mes "�����Ɠ����Ȃ��炵���ł����A";
		mes "���q�l�����͂ق�A�˂��H";
		next;
		mes "[�\���Ă��鐺]";
		mes "���ܗl�A�Ȃ�Ă����킢�����c�c";
		next;
		mes "[�\���Ă��鐺]";
		mes "�����Ȃ�܂ł�";
		mes "�����ƕ\�Ɏp����������";
		mes "�Ȃ�Ȃ������̂Ɂc�c";
		mes "��ςȂ��Ƃł���B";
		set EP16_2QUE,11;
		delquest 11409;
		setquest 11410;
		close;
	}
	end;
}

prt_cas.gat,77,223,0	script	#ep16_1�\�b6	139,3,3,{
OnTouch:
	if(EP16_2QUE == 11) {
		mes "[�\���Ă��鐺]";
		mes "����Ȃ��Ƃ�";
		mes "���ʂ���߂Ă��܂��Ƃ�";
		mes "�o�J�ȓz�c�c";
		next;
		mes "[�\���Ă��鐺]";
		mes "���Ȃ炻��Ȍ��́A";
		mes "��Ύ藣���Ȃ��̂ɁI";
		next;
		mes "[�\���Ă��鐺]";
		mes "���������A";
		mes "���͂��Ă̂͒N�ł�";
		mes "�ȒP�Ɉ������̂���Ȃ����B";
		next;
		mes "[�\���Ă��鐺]";
		mes "�Ȃ񂾂�!?";
		mes "���͂���ȑz����";
		mes "�����Ⴂ���Ȃ����Ă̂��I";
		next;
		mes "[�\���Ă��鐺]";
		mes "����ɉ��ʂɂ���";
		mes "�􂢂����Ă���炵��";
		mes "����Ȃ����B";
		mes "���͌����ˁB";
		next;
		mes "[�\���Ă��鐺]";
		mes "�c�c����͉Ɩ�̂ق���";
		mes "���Ă�����̂���Ȃ��������H";
		next;
		mes "[�\���Ă��鐺]";
		mes "����A�킩��Ȃ���`";
		mes "�ǂ���ɂ���s�g����Ȃ����B";
		set EP16_2QUE,12;
		delquest 11410;
		setquest 11411;
		close;
	}
	end;
}

prt_cas.gat,66,217,0	script	#ep16_1�\�b7	139,3,3,{
	if(EP16_2QUE == 12) {
		mes "[�\���Ă��鐺]";
		mes "�c�c";
		mes "�ɉh���ɂ߂��Q�I���O�Ƃ�";
		mes "�G�����X�g���q�������o���Ȃ�āB";
		mes "��͂�Q�I���O�Ƃ�";
		mes "����Ă邢��񂾂�c�c";
		next;
		mes "[�\���Ă��鐺]";
		mes "��߂�I";
		mes "�N���ɕ����ꂽ��";
		mes "��ςȂ��ƂɂȂ邼�I";
		cloakoffnpc "��̒j#ep16_1";
		next;
		mes "[��̒j]";
		mes "�ӂӂӁA";
		mes "�G�����X�g���q�͂�ق�";
		mes "�Ђǂ��l���̂悤���ˁB";
		next;
		mes "�]�j�͉e�ɉB��Ċ炪";
		mes "�@�悭�킩��Ȃ��]";
		next;
		menu "���Ȃ��́H",-;
		mes "[��̒j]";
		mes "�l�̂��Ƃ͂����B";
		mes "���Ȃ��͖`���҂���ˁB";
		next;
		mes "[��̒j]";
		mes "�`���҂����͂��΂炵���B";
		mes "�S���瓲��邵���h����B";
		mes "���R�ŁA�����̐��`���т��邩��B";
		next;
		mes "[��̒j]";
		mes "�`���҂���B";
		mes "�悩�����炠�鉤���̘b��";
		mes "�����Ă���Ȃ����ȁH";
		next;
		menu "�����̘b�H",-;
		mes "[��̒j]";
		mes "�́A�Ɩ傪��������";
		mes "�ƂĂ�^4d4dff���̗ǂ���l�̉��q^000000��";
		mes "������������B";
		mes "����łˁA";
		mes "����Ȗ񑩂����Ă����������B";
		next;
		mes "[��̒j]";
		mes "^4d4dff��l�ŉ���ڎw����^000000�A�ƂˁB";
		next;
		mes "[��̒j]";
		mes "�ǂ��炩�����ɂȂ�����";
		mes "���ɂȂ�Ȃ���������";
		mes "�K�����̕��S�ɂȂ萷�肽�Ă�B";
		next;
		mes "[��̒j]";
		mes "�����āA�ǂ��炩��";
		mes "�����O���悤�Ȃ��Ƃ������";
		mes "�K�����̎�ŎE���ƁB";
		mes "���̉����̌��̂��߂ɂˁB";
		next;
		mes "[��̒j]";
		mes "�c�c";
		mes "���̓�l�͏����������B";
		mes "����1�����Ȃ�������������";
		mes "�M���Ă����B";
		mes "����ڎw���ΕK��";
		mes "�F���K���ɂł���Ǝv���Ă����B";
		next;
		mes "[��̒j]";
		mes "�ނ�͌��ɂ́A";
		mes "�X�����̂悤�Ȃ��̂�";
		mes "�Q����Ȃ����Ƃ�m��Ȃ������B";
		mes "��ʂ̒��������Ղ�A";
		mes "�����̂��̂������Ă��܂�";
		mes "���Ƃ�����̂�m��Ȃ������B";
		next;
		mes "[��̒j]";
		mes "�c�c";
		mes "�ߌ���������񂾁B";
		mes "��l�̉��q�̉Ɩ傪�A";
		mes "������l�̉��q���A";
		mes "�ÎE���悤�ƁA�����炵���B";
		mes "���ʂ�_���ĂˁB";
		next;
		menu "����",-;
		mes "[��̒j]";
		mes "�����m�������q�́A";
		mes "�ÎE���Ƃ߂悤�ƁA";
		mes "�ň��̑I�����Ƃ��Ă��܂����I";
		next;
		mes "[��̒j]";
		mes "�����ƁA���̉��q�́A";
		mes "�����v���Ă����񂾁B";
		mes "���������Ȃ��Ȃ�΁A";
		mes "�����̉Ɩ傩�牤�ʂ͂łȂ��B";
		mes "������A�ÎE���Ƃ߂���A�Ɓc�c";
		next;
		mes "[��̒j]";
		mes "�����āA���̉��q��";
		mes "���疽��f���Ă��܂����B";
		next;
		menu "���A����ȁI",-;
		mes "[��̒j]";
		mes "�߂����b�ł͂Ȃ���B";
		mes "�{��̘b����B";
		mes "���q�̎��E��h���Ȃ�����";
		mes "������l�̉��q�̕s�b��Ȃ��ɂˁB";
		next;
		menu "�����c�������q�͂ǂ��Ȃ����́H",-;
		mes "[��̒j]";
		mes "��Ȃ����q�̕��́c�c";
		mes "���ʂ���߂��������B";
		mes "��]���ĂˁB";
		mes "�����̕s�b��Ȃ��A";
		mes "�Ɩ�̔w�����~�̉����ɁB";
		next;
		menu "����ŁH",-;
		mes "[��̒j]";
		mes "����ŁA���B";
		mes "�܂��A���̉��q�ɂ͊��҂��Ȃ���";
		mes "�����Ăق����B";
		next;
		mes "[��̒j]";
		mes "���̉��q�́A�Ɩ���������A";
		mes "���̍��𐳂����������Ƃł���";
		mes "���̑f��������҂����ꂽ��";
		mes "���̉�����肽���ƍl���Ă���B";
		next;
		mes "[��̒j]";
		mes "���x�����A����";
		mes "����������Ȃ����߂ɁB";
		mes "���ꂪ���񂾉��q�Ƃ�";
		mes "�񑩂��Ǝv���Ă���炵���B";
		next;
		switch(select("�Ȃ�ق�","�N�Ȃ�ł����A�G�����X�g")) {
		case 1:
			mes "[��̒j]";
			mes "�c�c";
			mes "�����Ă���Ă��肪�Ƃ��B";
			mes "����ł͎��炷��B";
			next;
			mes "[�\���Ă��鐺]";
			mes "�c�c�q�\�q�\�B";
			mes "�������Řb���Ă����̂�";
			mes "�G�����X�g���q�ł͂Ȃ����H";
			next;
			mes "[�\���Ă��鐺]";
			mes "�c�c�{�����B";
			mes "�`���҂Ɖ���b���Ă����񂾁H";
			delquest 11411;
			setquest 11412;
			set EP16_2QUE,13;
			close2;
			cloakonnpc "��̒j#ep16_1";
			end;
		case 2:
			mes "[�G�����X�g]";
			mes "�ӂӂӁA";
			mes "�l�̊���o�����Ă��ꂽ�񂾂ˁA";
			mes strcharinfo(0)+"�B";
			mes "���v���Ԃ�B";
			next;
			menu "���ʂ���߂�́H",-;
			mes "[�G�����X�g]";
			mes "��������B";
			mes "�l�͑�؂Ȃ��̂���肽���B";
			mes "����́A�A�����Z���񂪎�肽�������A";
			mes "�{���̌��B";
			mes "�o���^�[�Ƃ�Q�I���O�ƂȂ�";
			mes "�Ɩ�͊֌W�Ȃ��񂾁B";
			next;
			mes "[�G�����X�g]";
			mes "�Z���񂪎���Ă��ꂽ���̖��A";
			mes "�L�p�Ɏg�������B";
			mes "���̍��̌��������Ȃ��悤��";
			mes "^4d4dff��^000000���P�������邽�߂ɁB";
			next;
			mes "[�G�����X�g]";
			mes "�c�c";
			mes "�����ƁA";
			mes "�l�������Ȃ��Ă����悤���ˁB";
			mes "���܂�ڗ��������Ȃ��B";
			mes "����ł͎��炷���B";
			mes "�l���������Ƃ͓����ɂ��Ă����āB";
			set EP16_2QUE,13;
			delquest 11411;
			setquest 11412;
			close2;
			cloakonnpc "��̒j#ep16_1";
			end;
		}
	}
	end;
}

prt_cas.gat,66,220,3	script(CLOAKED)	��̒j#ep16_1	985,{}

prt_cas.gat,78,250,5	script	���������l#ep16_1	46,{
	if(EP16_7QUE == 1) {
		mes "[���������l]";
		mes "�}���Ő~�[�ɍs���Ă���I";
		mes "���������\��鐡�O�Ȃ񂾁B";
		close;
	}
	if(EP16_7QUE == 22) {
		mes "[���������l]";
		mes "���͖{���ɖZ�����񂾁I";
		mes "���܂�̖Z�����ɉ�����";
		mes "�����̐l�����������������A";
		mes "�����l�̊�����������c�c";
		next;
		mes "[���������l]";
		mes "�Ȃ�ł���ȊԈႢ��";
		mes "���Ă��܂����񂾁c�c";
		mes "���̗�������";
		mes "���ɂȂ�قǓ{��ꂽ��c�c";
		mes "�ӂӂӁB";
		emotion 19;
		close;
	}
	mes "[���������l]";
	mes "�ڂ����قǖZ�����Ƃ������A";
	mes "���A���܂�ɖZ������";
	mes "�{���ɖڂ�����Ă���񂾁I";
	close;
OnTouch:
	if(EP16_7QUE == 0 && EP16_1QUE >= 3) {
		mes "[���������l]";
		mes "����ȏ��ɋ����̂��I";
		mes "�������Ă����񂾁H";
		emotion 0;
		next;
		mes "[���������l]";
		mes "�}���Ő~�[�ɍs���Ă���I";
		mes "���������\��鐡�O�Ȃ񂾁B";
		setquest 11394;
		set EP16_7QUE,1;
		close;
	}
	end;
}

prt_cas.gat,309,200,5	script	����������#ep16_1	10122,{
	switch(EP16_7QUE) {
	case 0:
		mes "[������]";
		mes "���[�[�[!!";
		mes "��̂��ɂȂ�����";
		mes "���ɂ̗����l���K����";
		mes "�����ł����[���I";
		emotion 6;
		cutin "ep16cook_king_1.bmp",2;
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 1:
		mes "[������]";
		mes "���[�[�[!!";
		mes "��̂��ɂȂ�����";
		mes "���ɂ̗����l���K����";
		mes "�����ł����[���I";
		emotion 6;
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "�������I";
		mes "���̂��那�`�A�j�������ɁI";
		mes "�s���͂Ȃ����ǂ����I";
		mes "�s���͂Ȃ����ǂ����I";
		mes "���M�����邩��2������������ǂ��I";
		next;
		mes "[������]";
		mes "�����ƁI";
		mes "�����ƁI";
		mes "������!!";
		mes "������!!!!";
		mes "���q�l������";
		mes "���������Ȃ���΁I";
		next;
		mes "[������]";
		mes "�ꐶ���̑�d����";
		mes "���r���[�ɏI��点�邱�Ƃ�";
		mes "�o���܂���I";
		mes "���Ȃ��Ƃ����f���炵���I";
		mes "����A�X�[�p�[�E���g���f���炵���I";
		next;
		mes "[������]";
		mes "���`�E���g���X�[�p�[";
		mes "�~���R�H�[�i���������j��";
		mes "�t�@���^�X�e�B�b�N��";
		mes "���[�}���^�C���x����Ȃ���";
		mes "�������邱�Ƃ͂ł��܂���I";
		emotion 6;
		next;
		cutin "ep16cook_king_1.bmp",255;
		mes "[�������K�������l]";
		mes "�������A�񍐂��܂��I";
		next;
		mes "[�������K�������l]";
		mes "���ɂ̗����l���K���̕���";
		mes "��������Ⴂ�܂����I";
		next;
		mes "[������]";
		mes "���[�A�x���ł��I";
		mes "������͐��Ȃ�ł���I";
		mes "�����č��͌���̍Œ��ł��I";
		mes "�|�[�V�����A�Ń��x���ł���I";
		mes "1��1�b�������ɂȂ�̂�";
		mes "�x��Ă���Ȃ��!!";
		emotion 6;
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "���i�Ȃ��";
		mes "���������Y�@�ɂ̂��Ƃ�";
		mes "�u�g�������ċ��Ă��o���Y�v�Ȃ�";
		mes "��ςȔ����󂯂Ă��炢�܂���";
		mes "�����͓��ʂȓ��Ȃ̂�";
		mes "����ɂ��Ă����܂��I";
		next;
		switch(select("���A�����l����Ȃ��ł�","�󋵂ɂ��ĕ���","�g�������ċ��Ă��o���������ł�")) {
		case 1:
			mes "[������]";
			mes "�R�������Ⴂ�I";
			mes "���ɂ͂킩��܂��I";
			mes "���Ȃ��͐��r�̗����l�ł��I";
			break;
		case 2:
			mes "[������]";
			mes "���͂���Ȃ���";
			mes "�ǂ��ł������ł��I";
			mes "������͂��̕ӂɂ���";
			mes "�����Ƒf���炵��";
			mes "�j�������邽�߂�";
			mes "�撣��܂���!!";
			break;
		case 3:
			mes "[������]";
			mes "�킩��܂����B";
			mes "������Ƒ����J���Ă��������B";
			mes "���̑傫�ȋ��Ńu�X�b���ƂˁA";
			mes "���`�ƁA����Ɖ��A";
			mes "�ǂ������o���������c�c";
			mes "���ăo�J!!";
			next;
			mes "[������]";
			mes "�{�C�ɂ�����Ė{���ɂ��o�J��I";
			mes "�W���[�N�Ɍ��܂��Ă�ł���I";
			mes "�����w�Z�ŏK��Ȃ�������!?";
			mes "�����l�W���[�N�I";
			mes "�����A���Ԃ��Ȃ��́I";
			break;
		}
		next;
		mes "[������]";
		mes "�������̊��̑O�̋󂢂Ă���";
		mes "�ꏊ�ɍs���Ă�����";
		mes "�����̏��������ĉ������I";
		next;
		mes "[������]";
		mes "���܂������Ă���";
		mes "�O���t�H�����Ɂc�c";
		mes "�\�[�X�c�c���H";
		mes "�\�[�X���c�c����!?";
		emotion 0;
		next;
		mes "[������]";
		mes "����ȁc�c�I";
		mes "�\�[�X���Ȃ��Ȃ��Ă��܂��I";
		mes "���̃\�[�X���Ȃ����";
		mes "�����ł��܂��[��!!";
		next;
		mes "[������]";
		mes "���ɂ̗����l���K���I";
		mes "�����\�[�X�̒B�l�A";
		mes "�I���G���^���I�C�V�X�^�[�l����";
		mes "�\�[�X��������ė��ĉ������I";
		emotion 26;
		next;
		mes "[������]";
		mes "�}���ŁI�@�����I";
		mes "�}���ŉ������I";
		set EP16_7QUE,2;
		delquest 11394;
		setquest 11395;
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
		mes "[������]";
		mes "�\�[�X�͂܂��ł�����������!!";
		mes "�����\�[�X�̒B�l�A";
		mes "�I���G���^���I�C�V�X�^�[�l����";
		mes "�\�[�X��������ė��ĉ������I";
		emotion 26;
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "�}���ŁI�@�����I";
		mes "�}���ŉ������I";
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 12:
		mes "[������]";
		mes "�������I";
		mes "��͂�B�l�̘r�I";
		mes "�����ł��I";
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "����ł͂�������";
		mes "����������Ă݂܂��I";
		mes "�����󂢂Ă���ꏊ�ɍs����";
		mes "���������ĉ������I";
		set EP16_7QUE,13;
		delquest 11397;
		setquest 11398;
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 13:
		mes "[������]";
		mes "����ł͂�������";
		mes "����������Ă݂܂��I";
		mes "�����󂢂Ă���ꏊ�ɍs����";
		mes "���������ĉ������I";
		cutin "ep16cook_king_1.bmp",2;
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 14:
		mes "[������]";
		mes "���āA�����H����";
		mes "�����čs���Ί����ł��I";
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "�������Ă��܂���!!";
		mes "����������������";
		mes "�H���ɑ���Ȃ����I";
		next;
		mes "[������]";
		mes "�����������Ȃ����M��";
		mes "���΂₭��[����̂�";
		mes "���������l�̔\�͂ł�!!";
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 15:
	case 16:
	case 17:
	case 18:
	case 19:
	case 20:
		mes "[������]";
		mes "�͂������������I";
		mes "�����̐S�́I";
		mes "���ܗl�̐S�I";
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "���̍���R�₵��!!";
		mes "�ō��̗�����!!";
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 21:
		mes "[������]";
		mes "���Ⴀ��������!!";
		mes "�\���󂠂�܂���ł����I";
		emotion 17;
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "�V�������邱�ƂɂȂ���";
		mes "���K�������l�Ǝv�����݁c�c";
		mes "����ȕ������ǂ��납";
		mes "���g���܂Łc�c";
		next;
		mes "[������]";
		mes "�`���җl��A��ė����҂�";
		mes "�������Ă����܂����̂�";
		mes "�ǂ��������ĉ������I";
		mes "�g�������ă^���̐��荇�킹�̌Y�I";
		next;
		mes "[������]";
		mes "�ł����`���җl�̗����̍˔\��";
		mes "�{�����Ǝv���܂�!!";
		mes "�O���t�H���Ă��I";
		mes "�������������ł��I";
		next;
		if(checkitemblank() < 1) {
			cutin "ep16cook_king_2.bmp",255;
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		mes "[������]";
		mes "�܂��`���җl��";
		mes "�������ł������";
		mes "�y���݂ɂ��Ă��܂��I";
		cutin "ep16cook_king_2.bmp",2;
		set EP16_7QUE,22;
		delquest 11420;
		setquest 201895;
		getitem 6919,25;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 0,100000,0;
		getexp 0,100000,0;
		getexp 0,100000,0;
		close2;
		cutin "ep16cook_king_2.bmp",255;
		end;
	case 22:
		cutin "ep16cook_king_1.bmp",2;
		mes "[������]";
		mes "�܂��`���җl��";
		mes "�������ł������";
		mes "�y���݂ɂ��Ă��܂��I";
		close2;
		cutin "ep16cook_king_2.bmp",255;
		end;
	}
}

prt_cas.gat,313,199,0	script	#ep16_�r��	139,4,4,{
OnTouch:
	switch(EP16_7QUE) {
	case 0:
		mes "[������]";
		mes "�����I";
		mes "�ז��Ȃ̂ŉ������ĂȂ����I";
		cutin "ep16cook_king_1.bmp",2;
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	case 13:
		mes "[������]";
		mes "�����A�ł́I";
		mes "�����̃��C�������́c�c";
		mes "�J���b�Ƃ�����Œ��͂����Ƃ�B";
		mes "�����\�[�X�ł�������";
		mes "�O���t�H���̊ۏĂ��ł��I";
		cutin "ep16cook_king_1.bmp",2;
		next;
		mes "[������]";
		mes "�j���ɏo����闿�������ɁI";
		mes "�S�Ă̎M���������łȂ����";
		mes "�����Ȃ����Ƃ�Y��Ȃ��悤�ɁI";
		next;
		mes "[������]";
		mes "����ł͎��̍��菇������";
		mes "�����悤�ɂ��ĉ������I";
		next;
		mes "[������]";
		mes "�O���t�H���̂��ɂ����`";
		unittalk getnpcid(0,"�����l#ep16_1"),"�����l : �O���t�H���̂��ɂ����`",1;
		unittalk getnpcid(0,"�����l#ep16_2"),"�����l : �O���t�H���̂��ɂ����`",1;
		unittalk getnpcid(0,"�����l#ep16_3"),"�����l : �O���t�H���̂��ɂ����`",1;
		unittalk getnpcid(0,"�����l#ep16_4"),"�����l : �O���t�H���̂��ɂ����`",1;
		unittalk getnpcid(0,"�����l#ep16_5"),"�����l : �O���t�H���̂��ɂ����`",1;
		unittalk getnpcid(0,"�����l#ep16_6"),"�����l : �O���t�H���̂��ɂ����`",1;
		next;
		mes "[������]";
		mes "���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I";
		unittalk getnpcid(0,"�����l#ep16_1"),"�����l : ���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I",1;
		unittalk getnpcid(0,"�����l#ep16_2"),"�����l : ���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I",1;
		unittalk getnpcid(0,"�����l#ep16_3"),"�����l : ���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I",1;
		unittalk getnpcid(0,"�����l#ep16_4"),"�����l : ���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I",1;
		unittalk getnpcid(0,"�����l#ep16_5"),"�����l : ���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I",1;
		unittalk getnpcid(0,"�����l#ep16_6"),"�����l : ���Ԃ����Ⴄ�I���Ԃ��Ⴄ�`�`���I",1;
		next;
		mes "[������]";
		mes "�z�b�g�I";
		unittalk getnpcid(0,"�����l#ep16_1"),"�����l : �z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_2"),"�����l : �z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_3"),"�����l : �z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_4"),"�����l : �z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_5"),"�����l : �z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_6"),"�����l : �z�b�g�I",1;
		next;
		mes "[������]";
		mes "�O���t�H���C�Y�x���[�z�b�g�I";
		unittalk getnpcid(0,"�����l#ep16_1"),"�����l : �O���t�H���C�Y�x���[�z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_2"),"�����l : �O���t�H���C�Y�x���[�z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_3"),"�����l : �O���t�H���C�Y�x���[�z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_4"),"�����l : �O���t�H���C�Y�x���[�z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_5"),"�����l : �O���t�H���C�Y�x���[�z�b�g�I",1;
		unittalk getnpcid(0,"�����l#ep16_6"),"�����l : �O���t�H���C�Y�x���[�z�b�g�I",1;
		next;
		mes "[������]";
		mes "�ӂӂӂӁI";
		mes "�ƂĂ��f���炵��";
		mes "�O���t�H���Ă�DX��";
		mes "���ɏĂ��܂���!!";
		unittalk getnpcid(0,"�����l#ep16_1"),"�����l : ����J�l�ł����I",1;
		unittalk getnpcid(0,"�����l#ep16_2"),"�����l : ����J�l�ł����I",1;
		unittalk getnpcid(0,"�����l#ep16_3"),"�����l : ����J�l�ł����I",1;
		unittalk getnpcid(0,"�����l#ep16_4"),"�����l : ����J�l�ł����I",1;
		unittalk getnpcid(0,"�����l#ep16_5"),"�����l : ����J�l�ł����I",1;
		unittalk getnpcid(0,"�����l#ep16_6"),"�����l : ����J�l�ł����I",1;
		next;
		mes "[������]";
		mes "����ł����H����";
		mes "�����čs���Ί����ł��I";
		next;
		mes "[������]";
		mes "�������Ă��܂���!!";
		mes "����������������";
		mes "�H���ɑ���Ȃ����I";
		next;
		mes "[������]";
		mes "�����������Ȃ����M��";
		mes "���΂₭��[����̂�";
		mes "���������l�̔\�͂ł�!!";
		set EP16_7QUE,14;
		delquest 11398;
		setquest 11399;
		close2;
		cutin "ep16cook_king_1.bmp",255;
		end;
	}
	end;
}

prt_cas.gat,319,211,3	script	�����\�[�X����̒B�l#ep16_1	749,{
	switch(EP16_7QUE) {
	case 0:
	case 1:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "���ށc�c���̐H�~�����閡�I";
		mes "���m�Ȕz���Ƃ����̂�";
		mes "���ł��������c�c";
		close;
	case 2:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "���������\�[�X������B�l�A";
		mes "����̓I���G���^���I�C�V�X�^�[��";
		mes "���Ƃ������񂾂��I";
		next;
		menu "���������\�[�X���Ȃ��ƌ����Ă܂���",-;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�Ȃɂ��`�`�I";
		mes "�\�[�X���Ȃ��Ȃ��Ă��܂������ƁH";
		emotion 0;
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�����͑�ς����I";
		mes "���̗������̐��i�c�c";
		mes "�x��Ă��܂����牽������邩�c�c";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "��T�A���M��������";
		mes "�������܂܃c���c�����΂ɂ��ꂽ";
		mes "�M�􂢂������ƕ��������I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "���ށc�c";
		mes "�}���Ń\�[�X�����������悤�B";
		mes "�N�I";
		mes "������`���Ă���Ȃ����H";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "��قǁA��q�̓z��";
		mes "�\�[�X�Ɋ�����";
		mes "���K�����ł��Ă��܂�";
		mes "�㖱���ɉ^�΂�Ă��܂����B";
		emotion 28;
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "����A���肪�ق����񂾂��I";
		mes "���������";
		mes "�ō��̃\�[�X�����񂾁I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		switch(rand(4)) {
		case 0:
			mes "����ł͂܂��A����₩��";
			mes "�����o����ޗ���";
			mes "�����ė��Ă���B";
			set EP16_7QUE,4;
			delquest 11395;
			setquest 11396;
			setquest 11428;
			break;
		case 1:
			mes "����ł̓O�j���O�j������";
			mes "�H���𐶂����ޗ���";
			mes "�����ė��Ă���B";
			set EP16_7QUE,4;
			delquest 11395;
			setquest 11396;
			setquest 11429;
			break;
		case 2:
			mes "����ł͉ؗ�Ɍ���ޗ���";
			mes "�����ė��Ă���B";
			set EP16_7QUE,4;
			delquest 11395;
			setquest 11396;
			setquest 11430;
			break;
		case 3:
			mes "����ł͂��炩������";
			mes "�o���Ă����ޗ���";
			mes "�����ė��Ă���B";
			set EP16_7QUE,4;
			delquest 11395;
			setquest 11396;
			setquest 11431;
			break;
		}
		close;
	case 3:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�����c�c";
		mes "�\�[�X�ɂƂ��čޗ��Ƃ�";
		mes "���̂悤�ȕ��Ȃ񂾁B";
		mes "�܂���������A";
		mes "�����Ń\�[�X�I������B";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�ł͍ŏ������蒼���Ă݂悤�I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		switch(rand(4)) {
		case 0:
			mes "����ł͂܂��A����₩��";
			mes "�����o����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11428;
			break;
		case 1:
			mes "����ł̓O�j���O�j������";
			mes "�H���𐶂����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11429;
			break;
		case 2:
			mes "����ł͉ؗ�Ɍ���ޗ���";
			mes "�����ė��Ă���B";
			setquest 11430;
			break;
		case 3:
			mes "����ł͂��炩������";
			mes "�o���Ă����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11431;
			break;
		}
		set EP16_7QUE,4;
		close;
	case 4:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�}���ōޗ��������ė��Ă���I";
		close;
	case 5:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "���ށA�f���炵���I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		switch(rand(4)) {
		case 0:
			mes "���͂���₩�Ȗ����o����";
			mes "�ޗ��������ė��Ă���B";
			setquest 11428;
			break;
		case 1:
			mes "���̓O�j���O�j������";
			mes "�H���𐶂����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11429;
			break;
		case 2:
			mes "���͉ؗ�Ɍ���ޗ���";
			mes "�����ė��Ă���B";
			setquest 11430;
			break;
		case 3:
			mes "���͂��炩������";
			mes "�o���Ă����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11431;
			break;
		}
		set EP16_7QUE,6;
		close;
	case 6:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�}���ōޗ��������ė��Ă���I";
		close;
	case 7:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "���ށA�f���炵���I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		switch(rand(4)) {
		case 0:
			mes "���͂���₩�Ȗ����o����";
			mes "�ޗ��������ė��Ă���B";
			setquest 11428;
			break;
		case 1:
			mes "���̓O�j���O�j������";
			mes "�H���𐶂����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11429;
			break;
		case 2:
			mes "���͉ؗ�Ɍ���ޗ���";
			mes "�����ė��Ă���B";
			setquest 11430;
			break;
		case 3:
			mes "���͂��炩������";
			mes "�o���Ă����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11431;
			break;
		}
		set EP16_7QUE,8;
		close;
	case 8:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�}���ōޗ��������ė��Ă���I";
		close;
	case 9:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "���ށA�f���炵���I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		switch(rand(4)) {
		case 0:
			mes "���͂���₩�Ȗ����o����";
			mes "�ޗ��������ė��Ă���B";
			setquest 11428;
			break;
		case 1:
			mes "���̓O�j���O�j������";
			mes "�H���𐶂����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11429;
			break;
		case 2:
			mes "���͉ؗ�Ɍ���ޗ���";
			mes "�����ė��Ă���B";
			setquest 11430;
			break;
		case 3:
			mes "���͂��炩������";
			mes "�o���Ă����ޗ���";
			mes "�����ė��Ă���B";
			setquest 11431;
			break;
		}
		set EP16_7QUE,10;
		close;
	case 10:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�}���ōޗ��������ė��Ă���I";
		close;
	case 11:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�����A���΂炵���I";
		mes "�����Ŋ����ȃ\�[�X���o�����I";
		mes "�����������Ɏ����čs���Ȃ����I";
		next;
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "����ɂ��Ă�";
		mes "�N�ɂ̓\�[�X������˔\������B";
		mes "���ƈꏏ�Ƀ\�[�X����";
		mes "����ł݂�̂͂ǂ����H";
		set EP16_7QUE,12;
		delquest 11396;
		setquest 11397;
		close;
	default:
		mes "[�I���G���^���I�C�V�X�^�[]";
		mes "�N�ɂ̓\�[�X������˔\������B";
		mes "���ƈꏏ�Ƀ\�[�X����";
		mes "����ł݂�̂͂ǂ����H";
		close;
	}
}

prt_cas.gat,303,216,5	script	���J�[�W���[�X#ep16_1	10043,{
	switch(EP16_7QUE) {
	case 4:
	case 6:
	case 8:
	case 10:
		if(checkquest(11428)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�����I�@���ꂾ�I";
			mes "�����������Ɏ����ė��Ă���I";
			emotion 0,"�����\�[�X����̒B�l#ep16_1";
			set EP16_7QUE,EP16_7QUE+1;
			delquest 11428;
			close;
		}
		if(checkquest(11429) || checkquest(11430) || checkquest(11431)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�Ђ�������������������!!";
			mes "�\�[�X�����S�Ƀ_���ɂ����܂���!!";
			next;
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�������̃\�[�X�͎g���Ȃ��I";
			mes "�ŏ�����V�������Ȃ����Ȃ���!!";
			set EP16_7QUE,3;
			if(checkquest(11429))
				delquest 11429;
			if(checkquest(11430))
				delquest 11430;
			if(checkquest(11431))
				delquest 11431;
			close;
		}
		break;
	}
	mes "�]�݂��݂��������J�[��";
	mes "�@���肨�낵�č�����W���[�X�B";
	mes "�@�u�₩�Ȗ�������]";
	close;
}

prt_cas.gat,308,204,5	script	�|�����[���[ #ep16_1	10042,{
	switch(EP16_7QUE) {
	case 4:
	case 6:
	case 8:
	case 10:
		if(checkquest(11429)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�����I�@���ꂾ�I";
			mes "�����������Ɏ����ė��Ă���I";
			emotion 0,"�����\�[�X����̒B�l#ep16_1";
			set EP16_7QUE,EP16_7QUE+1;
			delquest 11429;
			close;
		}
		if(checkquest(11428) || checkquest(11430) || checkquest(11431)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�Ђ�������������������!!";
			mes "�\�[�X�����S�Ƀ_���ɂ����܂���!!";
			next;
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�������̃\�[�X�͎g���Ȃ��I";
			mes "�ŏ�����V�������Ȃ����Ȃ���!!";
			set EP16_7QUE,3;
			if(checkquest(11428))
				delquest 11428;
			if(checkquest(11430))
				delquest 11430;
			if(checkquest(11431))
				delquest 11431;
			close;
		}
		break;
	}
	mes "�]���炩���|�����ō�����[���[�B";
	mes "�@�O�j���O�j������H����";
	mes "�@�������Ă���c�c�]";
	close;
}

prt_cas.gat,338,206,5	script	���鑐#ep16_1	10046,{
	switch(EP16_7QUE) {
	case 4:
	case 6:
	case 8:
	case 10:
		if(checkquest(11430)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�����I�@���ꂾ�I";
			mes "�����������Ɏ����ė��Ă���I";
			emotion 0,"�����\�[�X����̒B�l#ep16_1";
			set EP16_7QUE,EP16_7QUE+1;
			delquest 11430;
			close;
		}
		if(checkquest(11428) || checkquest(11429) || checkquest(11431)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�Ђ�������������������!!";
			mes "�\�[�X�����S�Ƀ_���ɂ����܂���!!";
			next;
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�������̃\�[�X�͎g���Ȃ��I";
			mes "�ŏ�����V�������Ȃ����Ȃ���!!";
			set EP16_7QUE,3;
			if(checkquest(11428))
				delquest 11428;
			if(checkquest(11429))
				delquest 11429;
			if(checkquest(11431))
				delquest 11431;
			close;
		}
		break;
	}
	mes "�]�s�J�s�J�ƌ��鑐��";
	mes "�@���肨�낵�č�������B";
	mes "�@�����ɉؗ킳���v���X���Ă����]";
	close;
}

prt_cas.gat,330,211,5	script	�~�m�^�E���X�o�^�[#ep16	10044,{
	switch(EP16_7QUE) {
	case 4:
	case 6:
	case 8:
	case 10:
		if(checkquest(11431)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�����I�@���ꂾ�I";
			mes "�����������Ɏ����ė��Ă���I";
			emotion 0,"�����\�[�X����̒B�l#ep16_1";
			set EP16_7QUE,EP16_7QUE+1;
			delquest 11431;
			close;
		}
		if(checkquest(11428) || checkquest(11429) || checkquest(11430)) {
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�Ђ�������������������!!";
			mes "�\�[�X�����S�Ƀ_���ɂ����܂���!!";
			next;
			mes "[�I���G���^���I�C�V�X�^�[]";
			mes "�������̃\�[�X�͎g���Ȃ��I";
			mes "�ŏ�����V�������Ȃ����Ȃ���!!";
			set EP16_7QUE,3;
			if(checkquest(11428))
				delquest 11428;
			if(checkquest(11429))
				delquest 11429;
			if(checkquest(11430))
				delquest 11430;
			close;
		}
		break;
	}
	mes "�]�~�m�^�E���X��";
	mes "�@�����ō�����o�^�[�B";
	mes "�@�ӊO�ɂƂĂ����炩��";
	mes "�@��������]";
	close;
}

prt_cas.gat,315,204,1	script	�����l#ep16_1	886,{
	mes "[�����l]";
	mes "���̗����ɊԈႢ�͂Ȃ��I";
	close;
}

prt_cas.gat,313,204,3	script	�����l#ep16_2	886,{
	mes "[�����l]";
	mes "���̗������ƈꏏ��";
	mes "����������Ȃ��";
	mes "���̂悤�ł��I";
	close;
}

prt_cas.gat,313,202,3	script	�����l#ep16_3	886,{
	mes "[�����l]";
	mes "��������!!";
	close;
}

prt_cas.gat,313,200,3	script	�����l#ep16_4	886,{
	mes "[�����l]";
	mes "���͂ǂ������Ƃ����΁c�c";
	mes "�������͉��h�ł��I";
	close;
}

prt_cas.gat,313,196,3	script	�����l#ep16_5	886,{
	mes "[�����l]";
	mes "�`���[�j���O�̏I����";
	mes "�����Ȃ�B";
	mes "�����̏I���́A";
	mes "���ǌ��ޗ��̂��̂܂܂�";
	mes "�����y���ނ��Ɓc�c";
	close;
}

prt_cas.gat,313,194,3	script	�����l#ep16_6	886,{
	mes "[�����l]";
	mes "�������Ɓ`�����������`��";
	unittalk "�����l : �������Ɓ`�����������`��",1;
	close;
}

prt_cas.gat,302,205,5	script	�M��#ep16_1	883,{
	switch(EP16_7QUE) {
	case 20:
		if(countitem(6935) < 3) {
			mes "[�M��]";
			mes "�@���Ă��c�c�@���Ă��c�c";
			mes "�I��肪�Ȃ��I";
			next;
			mes "[�M��]";
			mes "�����ǂ��ꂪ�M�􂢂̏h���I";
			next;
			mes "[�M��]";
			mes "���ꂪ���̏h���Ȃ�";
			mes "�󂯓���悤!!";
			next;
			mes "[�M��]";
			mes "�����M�����ɁI";
			mes "�M�������ƁI";
			next;
			mes "[�M��]";
			mes "���͑ς��܂��I";
			mes "���̏h����!!!!";
			close;
		}
		mes "[�M��]";
		mes "�ӂӂӁc�c";
		mes "�M�̒ǉ������H";
		mes "���̎�ɂ������";
		mes "�ǂ�ȎM�ł��s�J�s�J���B";
		next;
		mes "[�M��]";
		mes "�c�c����������";
		mes "��قǂ��痿�������T���Ă������B";
		mes "����������";
		mes "���ł����������̂����H";
		set EP16_7QUE,21;
		delitem 6935,3;
		delquest 11419;
		setquest 11420;
		close;
	case 21:
		mes "[�M��]";
		mes "�c�c����������";
		mes "��قǂ��痿�������T���Ă������B";
		mes "����������";
		mes "���ł����������̂����H";
		close;
	case 22:
		if(checkquest(11427)) {
			if(checkquest(11427) & 0x2) {	// TODO
				mes "[�M��]";
				mes "������";
				delquest 11427;
				close;
			}
			mes "[�M��]";
			mes "������Ɩ������ĂȂ������H";
			mes "�����͏����x���";
			mes "�����܂�����̂��������Ɓc�c";
			close;
		}
		if(checkquest(11426)) {
			if(countitem(6935) < 2) {
				mes "[�M��]";
				mes "�@���Ă��c�c�@���Ă��c�c";
				mes "�I��肪�Ȃ��I";
				next;
				mes "[�M��]";
				mes "�����ǂ��ꂪ�M�􂢂̏h���I";
				next;
				mes "[�M��]";
				mes "���ꂪ���̏h���Ȃ�";
				mes "�󂯓���悤!!";
				next;
				mes "[�M��]";
				mes "�����M�����ɁI";
				mes "�M�������ƁI";
				next;
				mes "[�M��]";
				mes "���͑ς��܂��I";
				mes "���̏h����!!!!";
				close;
			}
			if(checkitemblank() < 1) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			mes "[�M��]";
			mes "�ӂӂӁc�c";
			mes "�M�̒ǉ������H";
			mes "���̎�ɂ������";
			mes "�ǂ�ȎM�ł��s�J�s�J���B";
			delitem 6935,2;
			delquest 11426;
			setquest 11427;
			getitem 6919,1;
			close;
		}
		mes "[�M��]";
		mes "���������Ď�`����";
		mes "���Ă��ꂽ��ł����H";
		mes "�M���Y��ɂ����";
		mes "�S���L���C�ɂȂ�";
		mes "�C������l�Ȃ�ł��H";
		next;
		mes "[�M��]";
		mes "�܂�����ȋC����";
		mes "�Ȃ�̂́A���ʂ̂��Ƃł��I";
		mes "�Ƃ����킯��";
		mes "�M��2�������ė��Ă��������I";
		next;
		mes "[�M��]";
		mes "�厖�ȎM�Ȃ̂ŋC��t���ĉ������I";
		setquest 11426;
		close;
	default:
		mes "[�M��]";
		mes "�����c�c";
		mes "���܂�A���̍���̎��]�I";
		unittalk "�M�� : ���܂�A���̍���̎��]�I",1;
		next;
		mes "[�M��]";
		mes "�N���[��!!";
		mes "�N���[���𑁂�!!";
		unittalk "�M�� : �N���[���𑁂�!!",1;
		close;
	}
}

prt_cas.gat,358,124,0	script	�O���t�H���Ă�#ep16_1	10131,{
	if(EP16_7QUE == 14) {
		mes "�]���Ȃ��̓O���t�H���Ă���";
		mes "�@�e�[�u���ɒu�����]";
		next;
		mes "[�^�}����]";
		mes "�c�c�͂��A";
		mes "�H�ׂ��Ȃ��̂��c�O�ł��B";
		mes "����Ȃɂ����ɂ�����";
		mes "���Ă���̂ɁB";
		unittalk getnpcid(0,"�^�}����#ep16_1"),"�^�}���� : �c�c�͂�",1;
		cutin "tama_cook_4.bmp",2;
		set EP16_7QUE,15;
		delquest 11399;
		setquest 11413;
		close2;
		cutin "tama_cook_4.bmp",255;
		end;
	}
	mes "�]������������";
	mes "�@�O���t�H���Ă�������]";
	close;
}

prt_cas.gat,361,142,5	script	�^�}����#ep16_1	10124,{
	switch(EP16_7QUE) {
	case 15:
		mes "[�^�}����]";
		mes "�c�c�͂��A";
		mes "��̉��Ȃ񂾁c�c";
		emotion 32;
		unittalk "�^�}���� : �c�c�͂�",1;
		cutin "tama_cook_4.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�����I";
		mes strcharinfo(0) +"�l";
		mes "�ł͂���܂��񂩁H";
		emotion 0;
		cutin "tama_cook_2.bmp",2;
		next;
		mes "[�^�}����]";
		mes "����̏j���ɂ�";
		mes "���������N�����ɍv������";
		mes "�`���҂������W�܂�ƕ����Ă����̂ŁA";
		mes "�\�ɕ������Ȃ��ɂ�";
		mes "���̂ł͂Ǝv���Ă��܂����B";
		cutin "tama_cook_1.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�j���͊y����Łc�c";
		next;
		mes "[�^�}����]";
		mes "�c�c���āA���̎p��";
		emotion 23;
		cutin "tama_cook_2.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�܂����I";
		mes strcharinfo(0) +"�l��";
		mes "����܂�����!?";
		next;
		mes "[�^�}����]";
		mes "���́A���Ԃ̃e���[���A����";
		mes "�H�ו�������Ȃ��ƌ����̂�";
		mes "���ӂ����낤�낵�Ă�����A";
		mes "�ˑR�A���������T���Ă���ƌ�����";
		mes "�A��Ă����܂��āc�c";
		cutin "tama_cook_1.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�f�낤�Ƃ�����";
		mes "�������܂܃W���[�X�ɂ���";
		mes "�V���}�A�C�X�e�B�[�Ȃ��";
		mes "�^�}�����A�C�X�e�B�[�ɂ���";
		mes "�`���[�`���[�z�����납�I";
		mes "�Ɨ������ɋ�������āc�c";
		cutin "tama_cook_4.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�j���̏������Z��������";
		mes "��������@����Ƃ�Ȃ��܂܁A";
		mes "���ǂ͂���ȕ��Ɂc�c";
		emotion 28;
		next;
		mes "[�^�}����]";
		mes "�݂Ȃ���ƂĂ��Z�������ŁA";
		mes "�����o���̂��E�тȂ����c�c";
		cutin "tama_cook_1.bmp",2;
		next;
		mes "[�^�}����]";
		mes "���͂����_���݂����ł��c�c";
		next;
		mes "[�^�}����]";
		mes "�����j����Ńe���[���A����";
		mes "����������`���Ă��������B";
		mes "�^�}�����͂����߂�Ȃ��Ɓc�c";
		set EP16_7QUE,16;
		delquest 11413;
		setquest 11414;
		close2;
		cutin "tama_cook_1.bmp",255;
		end;
	case 16:
	case 17:
	case 18:
		mes "[�^�}����]";
		mes "���͂����_���݂����ł��c�c";
		cutin "tama_cook_4.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�����j����Ńe���[���A����";
		mes "����������`���Ă��������B";
		mes "�^�}�����͂����߂�Ȃ��Ɓc�c";
		close2;
		cutin "tama_cook_4.bmp",255;
		end;
	case 19:
		mes "[�^�}����]";
		mes "�c�c�ӂ��A";
		mes "�Ȃ�ē������ȁu�撣��v";
		mes "�Ȃ񂾁c�c�B";
		mes "����ς肩�炩�������Ƃ�";
		mes "�}�[�N�͍��Ɏ����Ă܂��ˁB";
		cutin "tama_cook_1.bmp",2;
		next;
		mes "[�^�}����]";
		mes "�d������܂���B";
		mes "�d���𑱂��܂����c�c�B";
		mes "�͂��c�c";
		next;
		mes "[�^�}����]";
		mes "���́A�g�p�ς݂̎M���W�߂�";
		mes "�~�[�Ɏ����čs���悤��";
		mes "�����Ă����ł��B";
		next;
		mes "[�^�}����]";
		mes "�����肪�󂢂Ă���̂ł�����A";
		mes strcharinfo(0)+"�l��";
		mes "�ꏏ�ɂ��M���W�߂Ă��炦�܂��񂩁H";
		mes "��l�ł���";
		mes "�����Ƃ����I���Ǝv���܂��B";
		next;
		mes "[�^�}����]";
		mes "��낵�����肢���܂��B";
		mes "�����I��点�Ĕ�����������";
		mes "�ꏏ�ɐH�ׂ܂��傤�I";
		cutin "tama_cook_3.bmp",2;
		set EP16_7QUE,20;
		delquest 11417;
		setquest 11419;
		close2;
		cutin "tama_cook_3.bmp",255;
		end;
	case 20:
		mes "[�^�}����]";
		mes "��낵�����肢���܂��B";
		mes "�����I��点�Ĕ�����������";
		mes "�ꏏ�ɐH�ׂ܂��傤�I";
		cutin "tama_cook_3.bmp",2;
		close2;
		cutin "tama_cook_3.bmp",255;
		end;
	case 21:
		mes "[�^�}����]";
		mes "���ɂ��ׂ��d�����c�c";
		mes "�ǂ����Ă���Ȃ��ƂɁc�c";
		cutin "tama_cook_1.bmp",2;
		close2;
		cutin "tama_cook_1.bmp",255;
		end;
	case 22:
		mes "[�^�}����]";
		mes "�ӂ��c�c�I";
		mes strcharinfo(0)+"�l�B";
		mes "���肪�Ƃ��������܂��B";
		mes "���A�l�Ŏv������葁��";
		mes "�d�����Еt���܂����B";
		cutin "tama_cook_3.bmp",2;
		next;
		mes "[�^�}����]";
		mes "����ɂ��Ă��A";
		mes "����Ɖ��������";
		mes "���҂��Ă����̂Ɂc�c";
		next;
		mes "[�^�}����]";
		mes "�������ɕ񍐂��悤�Ƃ����u�ԁA";
		mes "���x�̓}�[�N�ɕ߂܂��Ă��܂�";
		mes "���̎d���ɖ߂��Ă��܂��܂����c�c";
		cutin "tama_cook_1.bmp",2;
		next;
		mes "[�^�}����]";
		mes "���߂��̐S�Ƃ����܂����A";
		mes "�����͒��߂ē����܂��c�c";
		mes "�����ƃe���[���A���B��";
		mes "�o�����������A";
		mes "���̉^���͌��߂���";
		mes "�����̂ł��傤�c�c";
		emotion 32;
		cutin "tama_cook_3.bmp",2;
		close2;
		cutin "tama_cook_3.bmp",255;
		end;
	default:
		mes "[�^�}����]";
		mes "���M�𗎂Ƃ��Ă��܂����c�c";
		unittalk "�^�}���� : �c�c�͂�",1;
		emotion 32;
		cutin "tama_cook_4.bmp",2;
		close2;
		cutin "tama_cook_4.bmp",255;
		end;
	}
}

prt_cas.gat,111,235,3	script	�e���[���A��#ep16_1	628,{
	switch(EP16_7QUE) {
	case 16:
		if(ECL_1QUE < 6) {
			mes "[�e���[���A��]";
			mes "���O�������ɏ��҂��ꂽ";
			mes "�`���҂���H";
			mes "�������B";
			cutin "bu_du1.bmp",2;
			next;
			mes "[�e���[���A��]";
			mes "���O�́c�c";
			mes strcharinfo(0)+"���I";
			mes "��낵���ȁI";
		} else {
			mes "[�e���[���A��]";
			mes "�����c�c!?";
			mes strcharinfo(0) +"!!";
			mes "������A��!!";
			mes "�v���Ԃ肾�Ȃ��I";
			emotion 18;
			cutin "bu_du1.bmp",2;
		}
		next;
		mes "[�e���[���A��]";
		mes "����ɂ��Ă�";
		mes "�������j�����ȁI";
		mes "�������������񂾂��I";
		mes strcharinfo(0)+"���A";
		mes "�O���t�H���Ă��͐H�ׂ����H";
		next;
		menu "�^�}��������̓`����`����",-;
		mes "[�e���[���A��]";
		mes "�ւ��I";
		mes "������߂��Ă��Ȃ������̂��B";
		mes "����悭���Ȃ��Ȃ邩��A";
		mes "�܂����q�ɂȂ��Ă�̂��Ǝv���āA";
		mes "�S�z�͂��ĂȂ��������ǂȁI";
		emotion 23;
		cutin "bu_du5.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "���������΁c�c";
		mes "�}�[�N�������œ����Ă�񂾁I";
		cutin "bu_du3.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "�}�[�N�͌Z����ɗ��܂�āA";
		mes "������蓭������Ă�";
		mes "�炵�����ǂȁB";
		cutin "bu_du2.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "���������΁c�c";
		mes "�������}�[�N�Ɖ�����̂�";
		mes "�ǂ����������ȁH";
		cutin "bu_du3.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "�}�M�[�I";
		mes "�������A�}�[�N�Ƃǂ��ŉ������";
		mes "�o���Ă邩�[�H";
		set EP16_7QUE,17;
		delquest 11414;
		setquest 11415;
		close2;
		cutin "bu_du3.bmp",255;
		end;
	case 17:
		mes "[�e���[���A��]";
		mes "���������΁c�c";
		mes "�}�[�N�������œ����Ă�񂾁I";
		cutin "bu_du3.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "�}�[�N�͌Z����ɗ��܂�āA";
		mes "������蓭������Ă�";
		mes "�炵�����ǂȁB";
		cutin "bu_du2.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "���������΁c�c";
		mes "�������}�[�N�Ɖ�����̂�";
		mes "�ǂ����������ȁH";
		cutin "bu_du3.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "�}�M�[�I";
		mes "�������A�}�[�N�Ƃǂ��ŉ������";
		mes "�o���Ă邩�[�H";
		close2;
		cutin "bu_du3.bmp",255;
		end;
	case 18:
		mes "[�e���[���A��]";
		mes "���������H";
		mes "�}�[�N�͊K�i�̏�ɂ���炵���B";
		mes "��ɍs���Ă��΁A";
		mes "�����Ɗ�ԂƎv�����B";
		cutin "bu_du2.bmp",2;
		close2;
		cutin "bu_du2.bmp",255;
		end;
	case 19:
	case 20:
	case 21:
		mes "[�e���[���A��]";
		mes "�������A�}�h���h���ȁI";
		mes "�p�Y�̂��߂ɏj���ɂ܂ŗ���";
		mes "�d������������񂾂���ȁB";
		mes "��͂͂͂͂͂͂͂��I";
		cutin "bu_du2.bmp",2;
		close2;
		cutin "bu_du2.bmp",255;
		end;
	default:
		if(ECL_1QUE < 6) {
			mes "[�e���[���A��]";
			mes "���O�������ɏ��҂��ꂽ";
			mes "�`���҂���H";
			mes "�������B";
			cutin "bu_du1.bmp",2;
			next;
			mes "[�e���[���A��]";
			mes "���O�́c�c";
			mes strcharinfo(0)+ "���I";
			mes "��낵���ȁI";
			next;
			mes "[�e���[���A��]";
			mes "����ɂ��Ă�";
			mes "�������j�����ȁI";
			mes "�������������񂾂��I";
			mes strcharinfo(0)+ "���A";
			mes "�O���t�H���Ă��͐H�ׂ����H";
			next;
			mes "[�e���[���A��]";
			mes "���̃��U�Ƃ炵���{�����I";
			mes "�O���t�H��������Ȃɂ�";
			mes "���������Ƃ͎v��Ȃ������I";
			mes "�܂��H�ׂĂȂ��Ȃ�A";
			mes "�H�ׂ��ق����������I";
			cutin "bu_du2.bmp",2;
			close2;
			cutin "bu_du2.bmp",255;
			end;
		}
		mes "[�e���[���A��]";
		mes "�����c�c!?";
		mes strcharinfo(0)+ "!!";
		mes "������A��!!";
		mes "�v���Ԃ肾�Ȃ��I";
		emotion 18;
		cutin "bu_du1.bmp",2;
		next;
		mes "[�e���[���A��]";
		mes "����ɂ��Ă�";
		mes "�������j�����ȁI";
		mes "�������������񂾂��I";
		mes strcharinfo(0)+ "���A";
		mes "�O���t�H���Ă��͐H�ׂ����H";
		next;
		mes "[�e���[���A��]";
		mes "���̃��U�Ƃ炵���{�����I";
		mes "�O���t�H��������Ȃɂ�";
		mes "���������Ƃ͎v��Ȃ������I";
		mes "�܂��H�ׂĂȂ��Ȃ�A";
		mes "�H�ׂ��ق����������I";
		cutin "bu_du2.bmp",2;
		close2;
		cutin "bu_du2.bmp",255;
		end;
	}
}

prt_cas.gat,111,234,3	script	�}�M�X�e�B��#ep16_1	612,{
	switch(EP16_7QUE) {
	case 17:
		mes "[�}�M�X�e�B��]";
		mes "���c�c";
		mes "�}�[�N����Ȃ�c�c";
		cutin "bu_maggi1.bmp",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "������̊K�i�̏�ŉ�܂�����B";
		mes "�Z�������������̂ŁA";
		mes "���܂�b�����Ƃ�";
		mes "�o���܂���ł������ǁc�c";
		cutin "bu_maggi3.bmp",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "�}�[�N����̕��̗�����";
		mes "�c���Ă������Ǝv���̂ł���";
		mes "�e���[���Ђ��[����";
		mes "�H�ׂĂ��܂��̂ŁA";
		mes "���������Ă��܂��c�c";
		emotion 16;
		cutin "bu_maggi2.bmp",2;
		set EP16_7QUE,18;
		delquest 11415;
		setquest 11416;
		close2;
		cutin "bu_maggi2.bmp",255;
		end;
	case 18:
		mes "[�}�M�X�e�B��]";
		mes "���c�c";
		mes "�}�[�N����Ȃ�c�c";
		cutin "bu_maggi1.bmp",2;
		next;
		mes "[�}�M�X�e�B��]";
		mes "������̊K�i�̏�ŉ�܂�����B";
		mes "�Z�������������̂ŁA";
		mes "���܂�b�����Ƃ�";
		mes "�o���܂���ł������ǁc�c";
		cutin "bu_maggi3.bmp",2;
		close2;
		cutin "bu_maggi3.bmp",255;
		end;
	case 19:
	case 20:
	case 21:
		mes "[�}�M�X�e�B��]";
		mes "�c�c�O���t�H���Ă���";
		mes "�������ł��c�c";
		mes "�e���[�͔�����������";
		mes "���������ŐH�ׂĂ��܂������ǁB";
		cutin "bu_maggi2.bmp",2;
		close2;
		cutin "bu_maggi2.bmp",255;
		end;
	default:
		mes "[�}�M�X�e�B��]";
		mes "���c�c����ɂ��́B";
		cutin "bu_maggi2.bmp",2;
		close2;
		cutin "bu_maggi2.bmp",255;
		end;
	}
}

prt_cas.gat,82,268,5	script	�}�[�N�C�V��#ep16_1	10123,{
	switch(EP16_7QUE) {
	case 18:
		mes "[�}�[�N�C�V��]";
		mes "����ɂ��́B";
		mes strcharinfo(0)+"�l�B";
		mes "�j���͊y����ł��܂����H";
		mes "�����K�v�Ȃ��̂͂���܂����H";
		unittalk "�}�[�N�C�V�� : �j���͊y����ł��܂����H",1;
		emotion 2;
		cutin "mark_wt_4.bmp",0;
		next;
		menu "�^�}�����̂��Ƃ�b��",-;
		mes "[�}�[�N�C�V��]";
		mes "�^�}�������H";
		mes "�c�c�����ł����B";
		mes "���������Ă���̂�";
		mes "���炩���Ă����̂ɁI";
		emotion 6;
		cutin "mark_wt_2.bmp",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�t�t�t�t�t�t�B";
		mes strcharinfo(0)+"�l�B";
		mes "�^�}�����ɂǂ����A";
		mes "�撣��Ɠ`���Ă��������B";
		cutin "mark_wt_4.bmp",0;
		set EP16_7QUE,19;
		delquest 11416;
		setquest 11417;
		close2;
		cutin "mark_wt_4.bmp",255;
		end;
	case 19:
		mes "[�}�[�N�C�V��]";
		mes strcharinfo(0)+"�l�B";
		mes "�^�}�����ɂǂ���";
		mes "�撣��Ƃ��`�����������B";
		cutin "mark_wt_1.bmp",0;
		next;
		mes "[�}�[�N�C�V��]";
		mes "�j���������甲��������Ȃ�";
		mes "�����Ō��������̂ł����c�c";
		mes "������Ɠ�����Ȃ̂�";
		mes "�t�t�t�A�c�O�ł��B";
		close2;
		cutin "mark_wt_1.bmp",255;
		end;
	default:
		mes "[�}�[�N�C�V��]";
		mes "����ɂ��́B";
		mes "�j���͊y����ł��܂����H";
		mes "�����K�v�Ȃ��̂͂���܂����H";
		unittalk "�}�[�N�C�V�� : �j���͊y����ł��܂����H",1;
		emotion 2;
		cutin "mark_wt_4.bmp",0;
		close2;
		cutin "mark_wt_4.bmp",255;
		end;
	}
}

prt_cas.gat,341,79,2	script	�A���v�I�J�[�g#ep16_1	615,{
	mes "[�A���v�I�J�[�g]";
	mes "!!!!";
	mes "���̖{�͂��̓`���́c�c";
	unittalk "�A���v�I�J�[�g : !!!!",1;
	cutin "bu_alp4.bmp",2;
	next;
	mes "[�A���v�I�J�[�g]";
	mes "���{�̏j�����Ƃ�����";
	mes "�����Ă����񂾂��c�c";
	mes "�c�c���āc�c�悩�����c�c";
	close2;
	cutin "bu_alp4.bmp",255;
	end;
}

prt_cas.gat,373,57,8	script	�I���o�[#ep16_1	626,{
	mes "[�I���o�[]";
	mes "�킟�I�@������I";
	mes "������I�@������I";
	mes "�S�������I";
	unittalk "�I���o�[ : ����ς�A���{���ˁI",1;
	cutin "bu_oliver4.bmp",0;
	next;
	mes "[�I���o�[]";
	mes "���A���̖{�͖l��";
	mes "�����Ă��Ȃ������I";
	next;
	mes "[�I���o�[]";
	mes "����ς艤�{�͐����Ȃ��c�c";
	close2;
	cutin "bu_oliver4.bmp",255;
	end;
}

prt_cas.gat,76,236,3	script	�o�[�b�g#ep16_1	883,{
	mes "[�o�[�b�g]";
	mes "�܂��������Ȃ���΂Ȃ�Ȃ����̂�";
	mes "�R�̂悤�Ɏc���Ă���Ƃ����̂�";
	mes "����ȏj���ɘA��Ă����Ă͍���I";
	next;
	mes "[�o�[�b�g]";
	mes "�e�I���͏�肭�o���Ă���̂��c�c";
	mes "�s���ł����Ȃ��B";
	close;
}

prt_cas.gat,97,248,5	script	���{���t��#orint	741,{
	mes "[���{���t�ƃI�����g]";
	mes "�Ɩ����̎���͋֎~�ł��B";
	mes "���t�Ƃ̎���";
	mes "�Ȃɂ���p�ł��傤���B";
	next;
	if(select("��Ȃ��肢���܂�","�Θb���I����") == 2) {
		mes "�]���Ȃ���";
		mes "�@���t�̎ז��ɂȂ������Ƃ�";
		mes "�@�ꌾ�l�т�";
		mes "�@�ނ��痣�ꂽ�]";
		close;
	}
	misceffect 969,"���{���t��#3";
	mes "[���{���t�ƃI�����g]";
	switch(rand(14)) {
	case 0:  set '@title$,"<I miss you>";			set '@no$,"04";		break;
	case 1:  set '@title$,"<Marschmallow Waltz>";	set '@no$,"145";	break;
	case 2:  set '@title$,"<Splendide Dreams>";		set '@no$,"128";	break;
	case 3:  set '@title$,"<Jittering Nightmare>";	set '@no$,"160";	break;
	case 4:  set '@title$,"<Alpen Rose>";			set '@no$,"109";	break;
	case 5:  set '@title$,"<Tales of East>";		set '@no$,"115";	break;
	case 6:  set '@title$,"<Theme of Alberta>";		set '@no$,"15";		break;
	case 7:  set '@title$,"<Yuna Song>";			set '@no$,"33";		break;
	case 8:  set '@title$,"<Eclage>";				set '@no$,"155";	break;
	case 9:  set '@title$,"<Dazzling Snow>";		set '@no$,"137";	break;
	case 10: set '@title$,"<Dream of Whale>";		set '@no$,"117";	break;
	case 11: set '@title$,"<One Step Closer>";		set '@no$,"30";		break;
	case 12: set '@title$,"<Not so Far away>";		set '@no$,"74";		break;
	default:
		mes "�������Ă����Ȃł͂���܂��񂪁A";
		mes "����͎��̂��C�ɓ����";
		mes "�����Ă��������̂͂������ł��傤�B";
		next;
		mes "[���{���t�ƃI�����g]";
		mes "���铇��\������";
		mes "<Good Morning>��";
		mes "���t�����Ă��������܂��B";
		musiceffect "111";
		unittalk getnpcid(0,"�j����̋M��#4"),"�j����̋M�� : ���A���̋Ȃ͍ō���!!�̂ɗ͂��݂Ȃ���I",1;
		unittalk getnpcid(0,"�j����q#5"),"�j����q : �v�����e�����Ƃ̔ɉh���j���Ȃ��A�ԈႢ�Ȃ��I",1;
		unittalk getnpcid(0,"�j����q#6"),"�j����q : �����×{���̃g���X�^��3���l�������Εa�����邾�낤!!",1;
		close;
	}
	mes '@title$+ "��";
	mes "���t�����Ă��������܂��B";
	musiceffect '@no$;
	close;
}

prt_cas.gat,95,248,5	script	���{���t��#occi	485,{
	emotion 2;
	mes "[���{���t�ƃI�b�N�V�[]";
	mes "���ƃI�����g�͂����Ɛ̂���";
	mes "���������f�G�ȏꏊ��";
	mes "���t����̂����������́B";
	mes "�ˁA�I�����g�H";
	next;
	emotion 9,"���{���t��#orint";
	mes "[���{���t�ƃI�����g]";
	mes "�Ɩ����Ɏ���͋֎~���B";
	next;
	emotion 32;
	mes "[���{���t�ƃI�b�N�V�[]";
	mes "������I�@�^�ʖڂȂ񂾂���B";
	mes "�ł��A������������";
	mes "���͓I�Ȃ̂�ˁ�";
	close;
}

prt_cas.gat,93,248,5	script	���{���t��#3	485,{
	emotion 18;
	mes "[���{���t�ƃG���[]";
	mes "�h�E�B�b�g�A���āB";
	mes "���̐l�����A�������Y��c�c";
	next;
	emotion 33,"���{���t��#4";
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�m���ɔ��������w�l�B���B";
	mes "�c�c�ł��A�������т₩�ȕ��i��";
	mes "�N����Ԏ������Ǝv����B";
	next;
	mes "[���{���t�ƃG���[]";
	mes "���c�c�H";
	next;
	emotion 40;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�G���[�A�N�͔������B";
	mes "�N�̗x��͂��ꂱ��";
	mes "�厩�R�ɏ���قǂɔ������B";
	next;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�N���Ԃ��h���X��g�ɂ܂Ƃ���";
	mes "��ւ̃o�������N���";
	mes "�N�����h���X��g�ɂ܂Ƃ���";
	mes "�������������₩���B";
	next;
	mes "[���{���t�ƃG���[]";
	mes "���c�c���́c�c";
	mes "���A���肪�Ƃ��c�c";
	next;
	emotion 2,"���{���t��#occi";
	mes "[���{���t�ƃI�b�N�V�[]";
	mes "���͂͂́I";
	mes "�G���[�������^���ԁI";
	mes "�Ƃ���Ńh�E�B�b�g�A";
	mes "���̃h���X�𒅂�̂�";
	mes "����������ǂ��Ȃ́`�H";
	next;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�I�b�N�V�[�c�c";
	mes "������N�B���o�q�Ƃ͂���";
	mes "���Ɍ����������Ȃ��Ƃł�";
	mes "�v���Ă���̂����H";
	next;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�����͂������";
	mes "�g�̂��Ȃ���x��̃N�Z�A";
	mes "�ċz��ۓ��̃��Y���Ɏ���܂�";
	mes "�܂������̕ʕ�����Ȃ����B";
	emotion 32,"���{���t��#4";
	close;
}

prt_cas.gat,91,248,5	script	���{���t��#4	479,{
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�I�����g�Ə��߂ĉ��������";
	mes "�֗~�I�ŁA���ׂĂ̂��Ƃɑ΂���";
	mes "���֐S�Ȃ܂�Ȃ��j����";
	mes "�v�������̂�����ǁA";
	mes "���̌�ɑf���炵���W���͂�";
	mes "�����Ă���ƋC�Â����񂾁B";
	next;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "��ɓw�͂�ӂ炸�A";
	mes "�x�X�g�ȏ�Ԃ�ۂ��Ă��邩�炱��";
	mes "���̂悤�Ȑ�����a����̂��낤�B";
	next;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "���͂��ڂ݂��ɖv�����邩��";
	mes "����ɂ���Č�����������Ƃ�";
	mes "��������ǂˁB";
	next;
	mes "[���{���t�ƃh�E�B�b�g]";
	mes "�Ƃɂ����A������������ȏꏊ��";
	mes "���t���邱�Ƃ��ł����̂�";
	mes "�I�����g�̂������Ǝv���Ă���B";
	mes "�N�����������Ȃ�����Ȃ�";
	mes "�I�����g�ɗ���ł݂�Ƃ����B";
	close;
}

prt_cas.gat,113,243,3	script	�j����̋M��#1	90,{
	mes "[�j����̋M��]";
	mes "���͉����D���Ȃ́B";
	mes "�����n�鉹�y�A�l�X���b�����A";
	mes "���ق��^�Ԏ��]�����B";
	mes "���̌��i�����邽�߂�";
	mes "�M���ɐ��܂ꂽ�悤�Ȃ��̂�B";
	close;
}

prt_cas.gat,70,239,5	script	�j����̋M��#2	86,{
	mes "[�j����̋M��]";
	mes "���̎���͕ʂɋ��邪�A";
	mes "�����M�����B";
	mes "���̋@��ɗǂ������";
	mes "������悤�ɂ��Ȃ��ẮB";
	close;
}

prt_cas.gat,73,232,5	script	�j����̋M��#3	967,{
	mes "[�j����̋M��]";
	mes "�N�͉��͍D�������H";
	mes "�c�c�l�͌������B";
	mes "���e�ɘA��Ă���ꂽ����";
	mes "�����ƂɋA���ĐQ������B";
	close;
}

prt_cas.gat,72,227,5	script	�j����q#1	766,{
	mes "[�j����q]";
	mes "�v�����e���ő傫�ȏj����";
	mes "�J�����ƌ����Ă̂��B";
	mes "�͂�΂�A�}�c���痈���񂶂�B";
	close;
}

prt_cas.gat,71,227,5	script	�j����q#2	763,{
	mes "[�j����q]";
	mes "���ꂿ���A�͂��Ⴌ�߂���";
	mes "�|��Ȃ��łˁB";
	close;
}

prt_cas.gat,111,228,3	script	�j����q#3	421,{
	mes "[�j����q]";
	mes "���[���~�b�h�K�b�c������";
	mes "�����������Ă���M��������";
	mes "�ꓯ�ɏW�܂邱�̋@���";
	mes "�������L�̎肪";
	mes "�����Ƃ���͂����Ȃ��ɂ�I";
	next;
	mes "[�j����q]";
	mes "���̐g���Ɠ������炢";
	mes "�����_�񏑂�";
	mes "��ɓ����̂ɂ�I";
	close;
}

prt_cas.gat,98,248,5	script	�L#ep16bgm	876,{
	mes "�]�L�͉��t�Ƃ̑��ɂ�����";
	mes "�@�܂ǂ��ł���B";
	mes "�@���Ȃ��ɂ͋������Ȃ��������]";
	close;
}

prt_cas.gat,98,231,5	script	�i�ߊ��A�W�t#ep16	459,{
	cutin "ep13_captin_edq.bmp",2;
	mes "[�i�ߊ��A�W�t]";
	mes "�悤�₭�A�b�V���E�o�L���[���ł�";
	mes "�c�����I����ċA���Ă����Ǝv������";
	mes "���x�͉���ɏo�Ȃ�������Ƃ́B";
	next;
	mes "[�i�ߊ��A�W�t]";
	mes "�܂������c�c";
	mes "���͉ƂŒ��Q�ł��������񂾂��ȁB";
	next;
	cutin "ep13_captin_edq.bmp",255;
	mes "[�Q�d�A�r�_��]";
	mes "�C�����͂킩��܂����A";
	mes "�������̌��J��J���ׂ̐Ȃł��B";
	mes "�Ί�͕����Ȃ��悤�ɂ��Ă��������ˁB";
	next;
	mes "[�������C�O���h]";
	mes "�Z�M�`�A";
	mes "�����C�������ŋꂵ���񂾂��A";
	mes "���͋q���ŐQ�Ă���_�����H";
	next;
	cutin "ep13_captin_edq.bmp",2;
	mes "[�i�ߊ��A�W�t]";
	mes "���߂�c�c";
	mes "�܁A�ǂ����������Ȃ��Ȃ�";
	mes "����t�y���ނƂ��悤�B";
	close2;
	cutin "ep13_captin_edq.bmp",255;
	end;
}

prt_cas.gat,100,231,3	script	�������Q�d�A�r�_��#ep16	755,{
	mes "[�Q�d�A�r�_��]";
	mes "�����ԁA��̎푰���x��������";
	mes "�ْ��̒����߂����Ă����̂�";
	mes "�����������ꏊ�ɗ���ƁA";
	mes "�܂�Ŗ��̒��ɋ���悤�ł��B";
	mes "���ꂪ���a�Ƃ������̂Ȃ̂ł��傤���H";
	close;
}

prt_cas.gat,97,229,7	script	�������C�O���h#ep16	751,{
	mes "[�������C�O���h]";
	mes "�܂������c�c";
	mes "�{���ɉ������̂��߂��ƌ����Ȃ�";
	mes "�������x�܂���ׂ����Ǝv��Ȃ����H";
	next;
	mes "[�������C�O���h]";
	mes "����ȉ�������ł�̂�";
	mes "�����m��Ȃ��A���������B";
	mes "�܁A�����̂��Ƃ����ǂȁB";
	close;
}

prt_cas.gat,165,245,0	script	�����c�������[�X��#ep16	748,{
	emotion 28;
	mes "[�����[�X��]";
	mes "�A���Ɏ�ɓ��ꂽ�I";
	mes "�N�����t���Ă��Ȃ�";
	mes "�C�`�S�̃P�[�L�I";
	next;
	mes "[�����[�X��]";
	mes "�������̃L�����v�ł�";
	mes "�P�[�L�����炷�邽�߂�";
	mes "�ǂ�قǂ̖W�Q�H������Ă������c�c";
	mes "�����A�܂��o�������B";
	next;
	mes "[�����[�X��]";
	mes "�C�`�S�I�@�C�`�S�I";
	mes "���̃C�`�S�̃P�[�L��";
	mes "���̂��̂ł��I";
	mes "�N�ɂ��n���܂���I";
	close;
}

prt_cas.gat,99,247,3	script	�j����̋M��#4	573,{
	mes "[�j����̋M��]";
	mes "���̊y�c�͎��ɑf���炵���B";
	mes "���̗��{�ɂ���x���҂���";
	mes "�p�[�e�B�[���J���Ă݂悤�B";
	close;
}

prt_cas.gat,89,250,5	script	�j����q#5	895,{
	mes "[�j����q]";
	mes "���͊y�c�̃I�����g�l��";
	mes "�Â�����̃t�@���ł��B";
	mes "���̕��̉��t�𖈓x�������߂�";
	mes "�ǂ�قǂ̎��ԂƂ��������������B";
	next;
	mes "[�j����q]";
	mes "���̏j���̏��ҏ��";
	mes "�ǂꂾ����J���Ď�ɓ��ꂽ�̂�";
	mes "�m���Ă��܂����H";
	mes "���ʌ��肾�����̂ŁA";
	mes "�{���ɋ�J���܂����I";
	close;
}

prt_cas.gat,89,244,7	script	�j����q#6	642,{
	mes "[�j����q]";
	mes "���̊y�c�ɂ���o�q�̎o����";
	mes "���i�����Ⴄ����ǁA";
	mes "�݂��̐^��������̂�";
	mes "�{���ɏ��Ȃ񂾁B";
	next;
	mes "[�j����q]";
	mes "��l�ň�l��������Ƃ���";
	mes "�{���ɕ��g�����悤��";
	mes "���o���Ă��܂��񂾂�B";
	close;
}

prt_cas.gat,152,163,0	script	way_to_qroom_L_qroom_L_	45,1,1,{
OnTouch:
	if(EP16_1QUE < 1) {
		unittalk getnpcid(0,"�������R�m#02"),"�������R�m : ���̐�͋M�o���؍݂��闣�{�ł��B�O���̕��͏o����ł��܂���B",1;
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,"�������R�m#02"),"�������R�m : ���҂��󂯂����́A�t���l�̈ē������҂����������B",1;
		end;
	}
	warp "prt_cas_q.gat",150,8;
	end;
}


prt_cas.gat,9,23,4	script	���}���Ǘ���#ep16jp	105,{
	mes "[���}���Ǘ���]";
	mes "�����͊��ӂ������܂��A�`���җl�B";
	mes "���̕������o����ꍇ��";
	mes "�킽�����߂ɂ��\���t�����������B";
	mes "���ē��������܂��B";
	next;
	if(select("���̏�ɗ��܂�","�u�v�����e���̊X�v�֖߂�") == 1) {
		mes "[���}���Ǘ���]";
		mes "���m�������܂����B";
		mes "��������܂�����";
		mes "���������|�����������I";
		close;
	}
	mes "[���}���Ǘ���]";
	mes "���m�������܂����B";
	mes "�ł́u�v�����e���̊X�v�ւ�";
	mes "���ē��������܂��B";
	close2;
	warp "prontera.gat",117,72;
	end;
}

prt_cas.gat,15,33,4	script	���n���g�ƌP����#ep16jp	47,{
	if(EP16_5QUE < 3) {
		mes "[���n���g�ƌP����]";
		mes "�䂪��u�|�[�E���n���g�v�l�ɂ�";
		mes "��������ɂȂ��܂������H";
		next;
		mes "[���n���g�ƌP����]";
		mes "��͑����̐퓬�o��������";
		mes "�`���҂�T���Ă����܂��B";
		mes "���������͂���������Ȃ�";
		mes "���n���g�Ƃ̕�����";
		mes "�K�˂Ă��������B";
		close;
	}
	if(EP16_5QUE < 4) {
		mes "[���n���g�ƌP����]";
		mes "�悤���������ł��������܂����B";
		mes "�������b�͏����Ă���܂��B";
		delquest 5403;
		while(1) {
			next;
			mes "[���n���g�ƌP����]";
			mes "�l�X�Ȑ퓬�f�[�^�𓾂邽��";
			mes "�`���җl�ɂ͊e�n�ɂ���";
			mes "^0000ff����^000000�Ɛ���Ă��������܂��B";
			next;
			mes "[���n���g�ƌP����]";
			mes "�������҂�ł��|���A";
			mes "�����ɋM�d�ȃf�[�^��";
			mes "�񋟂��Ă����������łɂ�";
			mes "^0000ff���ƍv���̏�^000000�������グ�܂��B";
			next;
			mes "[���n���g�ƌP����]";
			mes "^0000ff��^000000�ׂ͗́u^0000ff�f�B����^000000�v�ɂ�";
			mes "���ƌ�p�B�̕i�Ƃ�";
			mes "^0000ff��������^000000���ł��܂��̂ŁA";
			mes "���Ђ����p���������B";
			next;
			mes "[���n���g�ƌP����]";
			mes "���݃��n���g�ƂŒ�������";
			mes "���҂͎��̒ʂ�ł��B";
			next;
			mes "�y�����Ώہz";
			mes "== ^32cd32�T���̋L��^000000 ==";
			mes "�E^0000ff�咷�V�A�C�����@1��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�@";
			mes "== ^32cd32�t�F�C�X���[���̑�^000000 ==";
			mes "�E^0000ff�_�[�N�t�F�C�X���[���@2��^000000";
			mes "���ƍv���̏؁@10��";
			mes "�E^0000ff�����t�F�C�X���[���@1��^000000";
			mes "���ƍv���̏؁@30��";
			mes "�����ꂩ�̑����ŒB���ƂȂ�܂�";
			mes "�@";
			mes "== ^32cd32�Q�t�F�����@���^000000 ==";
			mes "�E^0000ff�u���[�g�E�n�[�@1��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�E^0000ff�t�F�������@1��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�@";
			mes "== ^32cd32���_�̓�^000000 ==";
			mes "�E^0000ff���_�̋��e�@1��^000000";
			mes "���ƍv���̏؁@8��";
			mes "�@";
			mes "== ^32cd32�t�F�������ƃT��^000000 ==";
			mes "�E^0000ff�T���̌��e�@1��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�@";
			mes "== ^32cd32��s�D�P��^000000 ==";
			mes "�E^0000ff�{��̑D���y�����b�N�@1��^000000";
			mes "���ƍv���̏؁@10��";
			mes "�E^0000ff�\�������D���y�����b�N�@1��^000000";
			mes "���ƍv���̏؁@20��";
			mes "�@";
			mes "== ^32cd32�􂢂̌��m^000000 ==";
			mes "�E^0000ff�􂢂̍����@1��^000000";
			mes "���ƍv���̏؁@3��";
			mes "�@";
			mes "== ^32cd32�r�I�X�̓�^000000 ==";
			mes "�E^0000ff���_�A���N�@1��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�@";
			mes "== ^32cd32�����X�̓��A^000000 ==";
			mes "�E^0000ff�����X�E�l�N���}���T�[�@1��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�@";
			mes "== ^32cd32���_�a^000000 ==";
			mes "�E^0000ff�u���i���l�A�@1��^000000";
			mes "���ƍv���̏؁@10��";
			mes "�E^0000ff���X�y���X�R�[���@1��^000000";
			mes "���ƍv���̏؁@10��";
			mes "�E^0000ff��]�̐_�����N�@1��^000000";
			mes "���ƍv���̏؁@20��";
			mes "�@";
			mes "== ^32cd32�N�U���ꂽ�v�����e��^000000 ==";
			mes "�E^0000ff�s���̌R�c���m���@500��^000000";
			mes "���ƍv���̏؁@5��";
			mes "�E^0000ff�s���̌R�c���m���@1000��^000000";
			mes "���ƍv���̏؁@5��";
			mes "���e500�C�����Ɠ����ɐi�s�\�ł�";
			mes "�@";
			mes "== ^32cd32�v�����e���n���č�^000000 ==";
			mes "�E^0000ff�t���[�Y���E���t�A�^�t�B�[�@�e50��^000000";
			mes "���ƍv���̏؁@30��";
			mes "�E^0000ff�t���[�Y���E���t�A�^�t�B�[�@�e100��^000000";
			mes "���ƍv���̏؁@30��";
			mes "���e50�C�����Ɠ����ɐi�s�\�ł�";
			next;
			mes "[���n���g�ƌP����]";
			mes "���͂��Ă��������ۂ̒��ӓ_�ł����A";
			mes "���n���g�Ƃ̉ƌP�Ƃ���";
			mes "�P����ɂ͏\���ȋx����";
			mes "���������鎖�Ƃ��Ă��܂��B";
			next;
			mes "^FF0000[INFORMATION]";
			mes "^FF0000�����N�G�X�g�͕񍐌�A";
			mes "^FF0000��莞�Ԃ͎��̕񍐂��ł��܂���B";
			mes "^FF0000�܂��A�N�G�X�g�̎󒍂�";
			mes "^FF0000�񍐎��Ɏ����I�ɍs���܂��B^000000";
			next;
			mes "[���n���g�ƌP����]";
			mes "�����͈ȏ�ł��B";
			mes "��낵���ł����H";
			next;
			if(select("������","�͂�") == 1) {
				mes "[���n���g�ƌP����]";
				mes "����ł͂�����x";
				mes "�������������܂��B";
				continue;
			}
			break;
		}
		for('@qid=97600; '@qid <= 97622; '@qid++) {
			setquest '@qid;
		}
		//setquest 73126;
		//compquest 73126;
		set EP16_5QUE,4;
		mes "[���n���g�ƌP����]";
		mes "����ł͂����^���B";
		mes "���A������҂����Ă��܂��B";
		close;
	}
	mes "[���n���g�ƌP����]";
	mes "���A��Ȃ����܂��A";
	mes strcharinfo(0)+ "�l�B";
	mes "�{���͂ǂ�����܂������H";
	next;
	switch(select("�P���̕񍐂�����","�P���̐���","�����󋵂̊m�F","�P���̎�","�P���̎��","��߂�")) {
	case 1:
		setarray '@reward,5,10,30,30,30,30,30,5,5,8,5,10,20,3,5,5,10,10,20,5,5,30,30;
		setarray '@timeque,73100,73101,73102,73102,73102,73102,73102,73107,73108,73109,73110,73111,73112,73113,73114,73115,73116,73117,73118,73119,73120,73121,73122;
		set '@amount,0;
		for('@i=0; '@i <= getarraysize('@reward); '@i++) {
			if(checkquest('@timeque['@i]) & 0x2) {
				delquest '@timeque['@i];
			}
			if(checkquest('@timeque['@i]))
				continue;
			set '@quest_id,97600+'@i;
			if(checkquest('@quest_id) & 0x4) {
				delquest '@quest_id;
				setquest '@timeque['@i];
				setquest '@quest_id;
				set '@amount,'@amount+'@reward['@i];
			}
		}
		if('@amount > 0) {
			getitem 6919,'@amount;
			mes "[���n���g�ƌP����]";
			mes "�M�d�Ȑ퓬�f�[�^��";
			mes "���肪�Ƃ��������܂��B";
			mes "�|�[�l����w����тɂȂ�ł��傤�B";
			close;
		}
		mes "[���n���g�ƌP����]";
		mes "����c�c�H";
		mes "�񍐉\�ȉۑ肪�Ȃ��悤�ł��B";
		mes "������x���m�F���������B";
		close;
	case 2:
		mes "[���n���g�ƌP����]";
		mes "�l�X�Ȑ퓬�f�[�^�𓾂邽��";
		mes "�`���җl�ɂ͊e�n�ɂ���";
		mes "^0000ff����^000000�Ɛ���Ă��������܂��B";
		next;
		mes "[���n���g�ƌP����]";
		mes "�������҂�ł��|���A";
		mes "�����ɋM�d�ȃf�[�^��";
		mes "�񋟂��Ă����������łɂ�";
		mes "^0000ff���ƍv���̏�^000000�������グ�܂��B";
		next;
		mes "[���n���g�ƌP����]";
		mes "^0000ff��^000000�ׂ͗́u^0000ff�f�B����^000000�v�ɂ�";
		mes "���ƌ�p�B�̕i�Ƃ�";
		mes "^0000ff��������^000000���ł��܂��̂ŁA";
		mes "���Ђ����p���������B";
		next;
		mes "[���n���g�ƌP����]";
		mes "���݃��n���g�ƂŒ�������";
		mes "���҂͎��̒ʂ�ł��B";
		next;
		mes "�y�����Ώہz";
		mes "== ^32cd32�T���̋L��^000000 ==";
		mes "�E^0000ff�咷�V�A�C�����@1��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�@";
		mes "== ^32cd32�t�F�C�X���[���̑�^000000 ==";
		mes "�E^0000ff�_�[�N�t�F�C�X���[���@2��^000000";
		mes "���ƍv���̏؁@10��";
		mes "�E^0000ff�����t�F�C�X���[���@1��^000000";
		mes "���ƍv���̏؁@30��";
		mes "�����ꂩ�̑����ŒB���ƂȂ�܂�";
		mes "�@";
		mes "== ^32cd32�Q�t�F�����@���^000000 ==";
		mes "�E^0000ff�u���[�g�E�n�[�@1��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�E^0000ff�t�F�������@1��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�@";
		mes "== ^32cd32���_�̓�^000000 ==";
		mes "�E^0000ff���_�̋��e�@1��^000000";
		mes "���ƍv���̏؁@8��";
		mes "�@";
		mes "== ^32cd32�t�F�������ƃT��^000000 ==";
		mes "�E^0000ff�T���̌��e�@1��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�@";
		mes "== ^32cd32��s�D�P��^000000 ==";
		mes "�E^0000ff�{��̑D���y�����b�N�@1��^000000";
		mes "���ƍv���̏؁@10��";
		mes "�E^0000ff�\�������D���y�����b�N�@1��^000000";
		mes "���ƍv���̏؁@20��";
		mes "�@";
		mes "== ^32cd32�􂢂̌��m^000000 ==";
		mes "�E^0000ff�􂢂̍����@1��^000000";
		mes "���ƍv���̏؁@3��";
		mes "�@";
		mes "== ^32cd32�r�I�X�̓�^000000 ==";
		mes "�E^0000ff���_�A���N�@1��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�@";
		mes "== ^32cd32�����X�̓��A^000000 ==";
		mes "�E^0000ff�����X�E�l�N���}���T�[�@1��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�@";
		mes "== ^32cd32���_�a^000000 ==";
		mes "�E^0000ff�u���i���l�A�@1��^000000";
		mes "���ƍv���̏؁@10��";
		mes "�E^0000ff���X�y���X�R�[���@1��^000000";
		mes "���ƍv���̏؁@10��";
		mes "�E^0000ff��]�̐_�����N�@1��^000000";
		mes "���ƍv���̏؁@20��";
		mes "�@";
		mes "== ^32cd32�N�U���ꂽ�v�����e��^000000 ==";
		mes "�E^0000ff�s���̌R�c���m���@500��^000000";
		mes "���ƍv���̏؁@5��";
		mes "�E^0000ff�s���̌R�c���m���@1000��^000000";
		mes "���ƍv���̏؁@5��";
		mes "���e500�C�����Ɠ����ɐi�s�\�ł�";
		mes "�@";
		mes "== ^32cd32�v�����e���n���č�^000000 ==";
		mes "�E^0000ff�t���[�Y���E���t�A�^�t�B�[�@�e50��^000000";
		mes "���ƍv���̏؁@30��";
		mes "�E^0000ff�t���[�Y���E���t�A�^�t�B�[�@�e100��^000000";
		mes "���ƍv���̏؁@30��";
		mes "���e50�C�����Ɠ����ɐi�s�\�ł�";
		next;
		mes "[���n���g�ƌP����]";
		mes "���͂��Ă��������ۂ̒��ӓ_�ł����A";
		mes "���n���g�Ƃ̉ƌP�Ƃ���";
		mes "�P����ɂ͏\���ȋx����";
		mes "���������鎖�Ƃ��Ă��܂��B";
		next;
		mes "^FF0000[INFORMATION]";
		mes "^FF0000�����N�G�X�g�͕񍐌�A";
		mes "^FF0000��莞�Ԃ͎��̕񍐂��ł��܂���B";
		mes "^FF0000�܂��A�N�G�X�g�̎󒍂�";
		mes "^FF0000�񍐎��Ɏ����I�ɍs���܂��B^000000";
		next;
		mes "[���n���g�ƌP����]";
		mes "�����͈ȏ�ł��B";
		close;
	case 3:
		for('@qid=0; '@qid <= 22; '@qid++) {
			if(checkquest(73100+'@qid) && !(checkquest(73100+'@qid) & 0x2))
				set '@data$['@qid],"^888888�񍐃N�[���^�C����^000000";
			else if(checkquest(97600+'@qid) & 0x4)
				set '@data$['@qid],"^ff0000�����ς�^000000";
			else if(checkquest(97600+'@qid))
				set '@data$['@qid],"^0000ff���풆^000000";
			else
				set '@data$['@qid],"^888888����^000000";
		}
		mes "[���n���g�ƌP����]";
		mes strcharinfo(0)+ "�l��";
		mes "�B���󋵂͎��̒ʂ�ł��B";
		next;
		mes "�y^ff0000�����Ώ�^000000�z";
		mes "== ^32cd32�T���̋L��^000000 ==";
		mes "�E^0000ff�咷�V�A�C����^000000";
		mes '@data$[0];
		mes "�@";
		mes "== ^32cd32�t�F�C�X���[���̑�^000000 ==";
		mes "�E^0000ff�_�[�N�t�F�C�X���[��^000000";
		mes '@data$[1];
		mes "�E^0000ff�����t�F�C�X���[��^000000";
		mes '@data$[2];
		mes "�@";
		mes "== ^32cd32�Q�t�F�����@���^000000 ==";
		mes "�E^0000ff�u���[�g�E�n�[^000000";
		mes '@data$[7];
		mes "�E^0000ff�t�F������^000000";
		mes '@data$[8];
		mes "�@";
		mes "== ^32cd32���_�̓�^000000 ==";
		mes "�E^0000ff���_�̋��e^000000";
		mes '@data$[9];
		mes "�@";
		mes "== ^32cd32�t�F�������ƃT��^000000 ==";
		mes "�E^0000ff�T���̌��e^000000";
		mes '@data$[10];
		mes "�@";
		mes "== ^32cd32��s�D�P��^000000 ==";
		mes "�E^0000ff�{��̑D���y�����b�N^000000";
		mes '@data$[11];
		mes "�E^0000ff�\�������D���y�����b�N^000000";
		mes '@data$[12];
		mes "�@";
		mes "== ^32cd32�􂢂̌��m^000000 ==";
		mes "�E^0000ff�􂢂̍���^000000";
		mes '@data$[13];
		mes "�@";
		mes "== ^32cd32�r�I�X�̓�^000000 ==";
		mes "�E^0000ff���_�A���N^000000";
		mes '@data$[14];
		mes "�@";
		mes "== ^32cd32�����X�̓��A^000000 ==";
		mes "�E^0000ff�����X�E�l�N���}���T�[^000000";
		mes '@data$[15];
		mes "�@";
		mes "== ^32cd32���_�a^000000 ==";
		mes "�E^0000ff�u���i���l�A^000000";
		mes '@data$[16];
		mes "�E^0000ff���X�y���X�R�[��^000000";
		mes '@data$[17];
		mes "�E^0000ff��]�̐_�����N^000000";
		mes '@data$[18];
		mes "�@";
		mes "== ^32cd32�N�U���ꂽ�v�����e��^000000 ==";
		mes "�E^0000ff�s���̌R�c���m��^000000";
		mes "�@�i�e500�C�����j";
		mes '@data$[19];
		mes "�E^0000ff�s���̌R�c���m��^000000";
		mes "�@�i�e1000�C�����j";
		mes '@data$[20];
		mes "�@";
		mes "== ^32cd32�v�����e���n���č�^000000 ==";
		mes "�E^0000ff�t���[�Y���E���t�A�^�t�B�[^000000";
		mes "�@�i�e50�C�����j";
		mes '@data$[21];
		mes "�E^0000ff�t���[�Y���E���t�A�^�t�B�[^000000";
		mes "�@�i�e100�C�����j";
		mes '@data$[22];
		close;
	case 4:
		for('@qid=97600; '@qid <= 97622; '@qid++) {
			if(!checkquest('@qid))
				break;
			if('@qid == 97622) {
				mes "[���n���g�ƌP����]";
				mes strcharinfo(0)+ "�l�͊���";
				mes "�S�Ă̌P�����󒍂��Ă���܂��B";
				next;
				mes "[���n���g�ƌP����]";
				mes "^ff0000���񍐂����������P����^000000";
				mes "^ff0000���̕��ŕ񍐂Ɠ����Ɏ󒍂̎葱����^000000";
				mes "^ff0000��点�Ă��������܂��B^000000";
				mes "���̂��߁A�󒍂̎葱���͕s�v�ł��B";
				next;
				mes "[���n���g�ƌP����]";
				mes "�u^0000ff�P���̎�^000000�v��";
				mes "���������P����";
				mes "�ēx�󒍂����ۂɂ����p���������B";
				close;
			}
		}
		mes "[���n���g�ƌP����]";
		mes "�ǂ̌P�����󒍂���܂����H";
		next;
		setarray '@menu$,"�S�Ă̓����N�G�X�g���󒍂���",
						(!checkquest(97600)? "^0000ff":"^888888")+ "�咷�V�A�C����^000000",
						(!checkquest(97601)? "^0000ff":"^888888")+ "�_�[�N�t�F�C�X���[��^000000",
						(!checkquest(97602)? "^0000ff":"^888888")+ "�����t�F�C�X���[��^000000",
						(!checkquest(97607)? "^0000ff":"^888888")+ "�u���[�g�E�n�[^000000",
						(!checkquest(97608)? "^0000ff":"^888888")+ "�t�F������^000000",
						(!checkquest(97609)? "^0000ff":"^888888")+ "���_�̋��e^000000",
						(!checkquest(97610)? "^0000ff":"^888888")+ "�T���̌��e^000000",
						(!checkquest(97611)? "^0000ff":"^888888")+ "�{��̑D���y�����b�N^000000",
						(!checkquest(97612)? "^0000ff":"^888888")+ "�\�������D���y�����b�N^000000",
						(!checkquest(97613)? "^0000ff":"^888888")+ "�􂢂̍���^000000",
						(!checkquest(97614)? "^0000ff":"^888888")+ "���_�A���N^000000",
						(!checkquest(97615)? "^0000ff":"^888888")+ "�����X�E�l�N���}���T�[^000000",
						(!checkquest(97616)? "^0000ff":"^888888")+ "�u���i���l�A^000000",
						(!checkquest(97617)? "^0000ff":"^888888")+ "���X�y���X�R�[��^000000",
						(!checkquest(97618)? "^0000ff":"^888888")+ "��]�̐_�����N^000000",
						(!checkquest(97619)? "^0000ff":"^888888")+ "�s���̌R�c���m��(500��)^000000",
						(!checkquest(97620)? "^0000ff":"^888888")+ "�s���̌R�c���m��(1000��)^000000",
						(!checkquest(97621)? "^0000ff":"^888888")+ "�t���[�Y���E���t�A�^�t�B�[(�e50��)^000000",
						(!checkquest(97622)? "^0000ff":"^888888")+ "�t���[�Y���E���t�A�^�t�B�[(�e100��)^000000",
						"��߂�";
		set '@i,select(printarray('@menu$))-2;
		if('@i == -1) {	// �S�Ă̓����N�G�X�g���󒍂���
			for('@qid=97600; '@qid <= 97622; '@qid++) {
				if(!checkquest('@qid))
					setquest '@qid;
			}
			mes "[���n���g�ƌP����]";
			mes "�P���̎󒍂�";
			mes "�����������܂����B";
			close;
		}
		if('@i == getarraysize('@menu$) - 2) {
			mes "[���n���g�ƌP����]";
			mes "�����ł����B";
			mes "�C���ς������܂����Ă��������B";
			close;
		}
		set '@qid,97600+'@i;
		if('@qid > 97602)
			set '@qid,'@qid+5;
		if(checkquest('@qid)) {
			mes "[���n���g�ƌP����]";
			mes "���̌P���͊���";
			mes "�󒍂Ȃ����Ă��܂��B";
			close;
		}
		if('@qid == 97602) {
			setquest 97602;
			setquest 97603;
			setquest 97604;
			setquest 97605;
			setquest 97606;
		} else {
			setquest '@qid;
		}
		mes "[���n���g�ƌP����]";
		mes "�P���̎󒍂�";
		mes "�����������܂����B";
		close;
	case 5:
		mes "[���n���g�ƌP����]";
		mes "�ǂ̌P����������܂����H";
		next;
		setarray '@menu$,"�S�Ă̓����N�G�X�g��������",
						(checkquest(97600)? "^0000ff":"^888888")+ "�咷�V�A�C����^000000",
						(checkquest(97601)? "^0000ff":"^888888")+ "�_�[�N�t�F�C�X���[��^000000",
						(checkquest(97602)? "^0000ff":"^888888")+ "�����t�F�C�X���[��^000000",
						(checkquest(97607)? "^0000ff":"^888888")+ "�u���[�g�E�n�[^000000",
						(checkquest(97608)? "^0000ff":"^888888")+ "�t�F������^000000",
						(checkquest(97609)? "^0000ff":"^888888")+ "���_�̋��e^000000",
						(checkquest(97610)? "^0000ff":"^888888")+ "�T���̌��e^000000",
						(checkquest(97611)? "^0000ff":"^888888")+ "�{��̑D���y�����b�N^000000",
						(checkquest(97612)? "^0000ff":"^888888")+ "�\�������D���y�����b�N^000000",
						(checkquest(97613)? "^0000ff":"^888888")+ "�􂢂̍���^000000",
						(checkquest(97614)? "^0000ff":"^888888")+ "���_�A���N^000000",
						(checkquest(97615)? "^0000ff":"^888888")+ "�����X�E�l�N���}���T�[^000000",
						(checkquest(97616)? "^0000ff":"^888888")+ "�u���i���l�A^000000",
						(checkquest(97617)? "^0000ff":"^888888")+ "���X�y���X�R�[��^000000",
						(checkquest(97618)? "^0000ff":"^888888")+ "��]�̐_�����N^000000",
						(checkquest(97619)? "^0000ff":"^888888")+ "�s���̌R�c���m��(500��)^000000",
						(checkquest(97620)? "^0000ff":"^888888")+ "�s���̌R�c���m��(1000��)^000000",
						(checkquest(97621)? "^0000ff":"^888888")+ "�t���[�Y���E���t�A�^�t�B�[(�e50��)^000000",
						(checkquest(97622)? "^0000ff":"^888888")+ "�t���[�Y���E���t�A�^�t�B�[(�e100��)^000000",
						"��߂�";
		set '@i,select(printarray('@menu$))-2;
		if(select("������","�͂�") == 1) {
			mes "[���n���g�ƌP����]";
			mes "�����ł����B";
			mes "�C���ς������܂����Ă��������B";
			close;
		}
		if('@i == -1) {	// �S�Ă̓����N�G�X�g��������
			for('@qid=0; '@qid <= 22; '@qid++) delquest 97600+'@qid;
			mes "[���n���g�ƌP����]";
			mes "�P���̎������";
			mes "�����������܂����B";
			close;
		}
		if('@i == getarraysize('@menu$) - 2) {
			mes "[���n���g�ƌP����]";
			mes "�����ł����B";
			mes "�C���ς������܂����Ă��������B";
			close;
		}
		set '@qid,97600+'@i;
		if('@qid > 97602)
			set '@qid,'@qid+5;
		if(!checkquest('@qid)) {
			mes "[���n���g�ƌP����]";
			mes "���̌P����";
			mes "�󒍂��Ă���܂���B";
			close;
		}
		if('@qid == 97602) {
			delquest 97602;
			delquest 97603;
			delquest 97604;
			delquest 97605;
			delquest 97606;
		} else {
			delquest '@qid;
		}
		mes "[���n���g�ƌP����]";
		mes "�P���̎������";
		mes "�����������܂����B";
		close;
	case 6:
		mes "[���n���g�ƌP����]";
		mes "�����ł����B";
		mes "�C���ς������܂����Ă��������B";
		close;
	}
}

//============================================================
// �j�[���G���`�����gNPC
//------------------------------------------------------------
prt_cas.gat,18,33,4	script	�f�B����#ep16jp	734,{
	mes "[�f�B����]";
	mes "�悤�������z�����������܂����A";
	mes strcharinfo(0)+ "�l�B";
	mes "�{���͂ǂ̂悤�Ȃ��p���ł����H";
	next;
	switch(select("�j�[���G���`�����g","�G���`�����g�ɂ���","���ƍv���̏؂Ō���","�؂̌������C���i�b�v������","��������")) {
	case 1:
		mes "[�f�B����]";
		mes "�j�[���G���`�����g��";
		mes "[^0000ff�����΂̏�[0]^000000]";
		mes "[^0000ff�h���̏�[0]^000000]�A";
		mes "[^0000ff�鉺���̒n�}[0]^000000]�A";
		mes "[^0000ff�P������[0]^000000]�A";
		mes "[^0000ff�����΂̌C[1]^000000]�A";
		mes "[^0000ff�я�̈Ê�[0]^000000]�A";
		mes "[^0000ff�_����̎��[0]^000000]�A";
		mes "[^0000ff�j�[���N���C���A[1]^000000]�A";
		mes "[^0000ff�j�[���O���C��[1]^000000]�A";
		mes "[^0000ff�j�[���W���}�_�n��[1]^000000]�A";
		mes "[^0000ff�j�[���V�[�t�{�E[1]^000000]�A";
		mes "[^0000ff�j�[���n���^�[�{�E[1]^000000]�A";
		mes "[^0000ff�j�[���N���X�{�E[1]^000000]�A";
		mes "[^0000ff�j�[���E�B�U�[�h�X�^�b�t[1]^000000]�A";
		mes "[^0000ff�j�[���A�[�N�����h[1]^000000]�A";
		mes "[^0000ff�j�[���z�[���[�X�e�b�L[1]^000000]�A";
		mes "[^0000ff�j�[���f�B�o�C���N���X[1]^000000]�A";
		mes "[^0000ff�j�[���M���`��[1]^000000]�A";
		mes "[^0000ff�j�[���o�X�^�[[1]^000000]�A";
		mes "[^0000ff�j�[�������藠��[1]^000000]�A";
		mes "[^0000ff�j�[�����C�t��[1]^000000]�A";
		mes "[^0000ff�����΂̃}���g[1]^000000]��";
		mes "���p���\�ł��B";
		next;
		set '@i,select(
			(getequipid(3))? getequipname(3): "����-�������Ă��Ȃ�",
			(getequipid(4))? getequipname(4): "�E��-�������Ă��Ȃ�",
			(getequipid(5))? getequipname(5): "���ɂ����镨-�������Ă��Ȃ�",
			(getequipid(6))? getequipname(6): "�C-�������Ă��Ȃ�",
			(getequipid(7))? getequipname(7): "�A�N�Z�T���[[1]-�������Ă��Ȃ�",
			(getequipid(8))? getequipname(8): "�A�N�Z�T���[[2]-�������Ă��Ȃ�"
				)+2;
		if(getequipisequiped('@i)==0) {
			mes "[�f�B����]";
			mes "�G���`�����g���s���ꍇ�́A";
			mes "�Ώۂ̃A�C�e����";
			mes "�������Ă����Ă��������B";
			mes "���萔�����������܂����A";
			mes "��낵�����肢���܂��B";
			close;
		}
		switch(getequipid('@i)) {
		case 28920:		// �����΂̏�[0]
			set '@type,0;
			break;
		case 28497:		// �鉺���̒n�}[0]
		case 28498:		// �P������[0]
		case 28499:		// �h���̏�[0]
		case 28524:		// �я�̈Ê�[0]
		case 28525:		// �_����̎��[0]
			set '@type,1;
			break;
		case 21031:		// �j�[���N���C���A[1]
		case 36008:		// �j�[���O���C��[1]
		case 38026:		// �j�[���W���}�_�n��[1]
		case 18153:		// �j�[���V�[�t�{�E[1]
		case 18154:		// �j�[���n���^�[�{�E[1]
		case 18155:		// �j�[���N���X�{�E[1]
		case 2042:		// �j�[���E�B�U�[�h�X�^�b�t[1]
		case 2043:		// �j�[���A�[�N�����h[1]
		case 2044:		// �j�[���z�[���[�X�e�b�L[1]
		case 2045:		// �j�[���f�B�o�C���N���X[1]
		case 38121:		// �j�[���M���`��[1]
		case 38122:		// �j�[���o�X�^�[[1]
		case 13339:		// �j�[�������藠��[1]
		case 28235:		// �j�[�����C�t��[1]
			set '@type,2;
			break;
		case 20942:		// �����΂̃}���g[1]
		case 22142:		// �����΂̌C[1]
			set '@type,3;
			break;
		default:
			mes "[�f�B����]";
			mes "�G���`�����g���s���ꍇ�́A";
			mes "�Ώۂ̃A�C�e����";
			mes "�������Ă����Ă��������B";
			mes "�j�[���͑@�ׂȂ̂ŁA";
			mes "���̕��ɂ̓G���`�����g��";
			mes "�ł��܂���c�c�B";
			close;
		}
		set '@card[1],getequipcardid('@i,1);
		set '@card[2],getequipcardid('@i,2);
		set '@card[3],getequipcardid('@i,3);
		if('@card[3] == 0)
			set '@pos,3;
		else if('@card[2] == 0)
			set '@pos,2;
		else if('@card[1] == 0)
			set '@pos,1;
		else {
			mes "[�f�B����]";
			mes "���Ɍ��E�܂�";
			mes "��������Ă���悤�ł��ˁB";
			mes "�\���󂠂�܂��񂪁A";
			mes "�j�[���G���`�����g��";
			mes "^0000ff�ő�O��^000000�܂ł����ł��܂���B";
			close;
		}
		mes "[�f�B����]";
		mes "�G���`�����g����j�[���̎�ނ�";
		mes "���I�т��������B";
		next;
		setarray '@menu$,"�����̃j�[��","�i���̃j�[��","���̃j�[��","���̃j�[��","���_�̃j�[��","���̃j�[��","��߂�";
		for('@j=1; '@j <= 3; '@j++) {
			if('@card['@j] >= 29249 && '@card['@j] <= 29252) {
				set '@menu$[0],"^888888�y�G���`�����g�ρz"+'@menu$[0]+"^000000";
				set '@flag[0],1;
			}
			if('@card['@j] >= 29253 && '@card['@j] <= 29259) {
				set '@menu$[1],"^888888�y�G���`�����g�ρz"+'@menu$[1]+"^000000";
				set '@flag[1],1;
			}
			if('@card['@j] >= 29260 && '@card['@j] <= 29269 || '@card['@j] == 29510) {
				set '@menu$[2],"^888888�y�G���`�����g�ρz"+'@menu$[2]+"^000000";
				set '@flag[2],1;
			}
			if('@card['@j] >= 29270 && '@card['@j] <= 29275) {
				set '@menu$[3],"^888888�y�G���`�����g�ρz"+'@menu$[3]+"^000000";
				set '@flag[3],1;
			}
			if('@card['@j] >= 29276 && '@card['@j] <= 29278 || '@card['@j] >= 29382 && '@card['@j] <= 29384) {
				set '@menu$[4],"^888888�y�G���`�����g�ρz"+'@menu$[4]+"^000000";
				set '@flag[4],1;
			}
			if('@card['@j] >= 29279 && '@card['@j] <= 29282 || '@card['@j] >= 29385 && '@card['@j] <= 29386) {
				set '@menu$[5],"^888888�y�G���`�����g�ρz"+'@menu$[5]+"^000000";
				set '@flag[5],1;
			}
		}
		switch('@type) {
		case 1:		// �A�N�Z�T���[
			set '@menu$[1],"";
			set '@menu$[2],"";
			break;
		case 2:		// ����
			set '@menu$[5],"";
			break;
		case 3:		// ���ɂ�������́E�C
			set '@menu$[2],"";
			break;
		}
		set '@j,select(printarray('@menu$)) - 1;
		if('@flag['@j] > 0) {
			mes "[�f�B����]";
			mes "������ނ̃G���`�����g��";
			mes "�s�������o���܂���B";
			close;
		}
		if('@j > 5) {
			mes "[�f�B����]";
			mes "�����p���肪�Ƃ��������܂����B";
			mes "�܂��̂��z����";
			mes "���҂����Ă���܂��B";
			close;
		}
		mes "[�f�B����]";
		mes "�ǂ̃j�[����";
		mes "�G���`�����g�������܂����H";
		next;
		switch('@j) {
		case 0:		// �����̃j�[��
			setarray '@gain,29249,29250,29251,29252;
			set '@n,select("�����̃j�[��(�̗�) -> 100","�����̃j�[��(���_) -> 100","�����̃j�[��(����) -> 100","�����̃j�[��(�m��) -> 100","��߂�") - 1;
			if('@n >= getarraysize('@gain)) {
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			set '@nameid,'@gain['@n];
			set '@amount,100;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "�G���`�����g����j�[����";
			mes "^0000ff"+ getitemname('@nameid) +"^000000��";
			mes "��낵���ł����H";
			break;
		case 1:		// �i���̃j�[��
			setarray '@gain,29253,29254,29255,29256,29257,29258,29259;
			set '@n,select("�i���̃j�[��(��) -> 100","�i���̃j�[��(��) -> 100","�i���̃j�[��(��) -> 100","�i���̃j�[��(�n) -> 100","�i���̃j�[��(��) -> 100","�i���̃j�[��(�O) -> 100","�i���̃j�[��(��) -> 100","��߂�") - 1;
			if('@n >= getarraysize('@gain)) {
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			set '@nameid,'@gain['@n];
			set '@amount,100;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "�G���`�����g����j�[����";
			mes "^0000ff"+ getitemname('@nameid) +"^000000��";
			mes "��낵���ł����H";
			break;
		case 2:		// ���̃j�[��
			setarray '@gain,29260,29261,29262,29263,29264,29265,29266,29267,29268,29269,29510;
			set '@n,select("���̃j�[��(���`) -> 100","���̃j�[��(�s���`) -> 100","���̃j�[��(�����`) -> 100","���̃j�[��(�A���`) -> 100","���̃j�[��(�����`) -> 100","���̃j�[��(���L�`) -> 100","���̃j�[��(�����`) -> 100","���̃j�[��(�l�Ԍ`) -> 250","���̃j�[��(�V�g�`) -> 100","���̃j�[��(���`) -> 100","���̃j�[��(�v���C���[) -> 250","��߂�") - 1;
			if('@n >= getarraysize('@gain)) {
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			set '@nameid,'@gain['@n];
			if('@nameid == 29267 || '@nameid == 29510)
				set '@amount,250;
			else
				set '@amount,100;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "�G���`�����g����j�[����";
			mes "^0000ff"+ getitemname('@nameid) +"^000000��";
			mes "��낵���ł����H";
			break;
		case 3:		// ���̃j�[��
			setarray '@gain,29270,29271,29272,29273,29274,29275;
			set '@n,select("���̃j�[��(�r��) -> 100","���̃j�[��(�v��) -> 100","���̃j�[��(�̗�) -> 100","���̃j�[��(�m��) -> 100","���̃j�[��(�W��) -> 100","���̃j�[��(�K�^) -> 100","��߂�") - 1;
			if('@n >= getarraysize('@gain)) {
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			set '@nameid,'@gain['@n];
			set '@amount,100;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "�G���`�����g����j�[����";
			mes "^0000ff"+ getitemname('@nameid) +"^000000��";
			mes "��낵���ł����H";
			break;
		case 4:		// ���_�̃j�[��
			setarray '@gain,29276,29277,29278;
			set '@n,select("���_�̃j�[��(�v��) -> 300","���_�̃j�[��(�W��) -> 300","���_�̃j�[��(�n��) -> 300","��߂�") - 1;
			if('@n >= getarraysize('@gain)) {
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			set '@nameid,'@gain['@n];
			set '@amount,300;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "�G���`�����g����j�[����";
			mes "^0000ff"+ getitemname('@nameid) +"^000000��";
			mes "��낵���ł����H";
			break;
		case 5:		// ���̃j�[��
			setarray '@gain,29279,29280,29281,29282;
			set '@n,select("���̃j�[��(�r��) -> 200","���̃j�[��(�m��) -> 200","���̃j�[��(�̗�) -> 200","���̃j�[��(���h) -> 200","��߂�") - 1;
			if('@n >= getarraysize('@gain)) {
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			set '@nameid,'@gain['@n];
			set '@amount,200;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "�G���`�����g����j�[����";
			mes "^0000ff"+ getitemname('@nameid) +"^000000��";
			mes "��낵���ł����H";
			break;
		default:
			mes "[�f�B����]";
			mes "�킩��܂����B";
			mes "�K�v�ɂȂ�����܂����Ă��������B";
			close;
		}
		next;
		if(select("������","�͂�") == 1) {
			mes "[�f�B����]";
			mes "�����p���肪�Ƃ��������܂����B";
			mes "�܂��̂��z����";
			mes "���҂����Ă���܂��B";
			close;
		}
		delitem 6919,'@amount;
		setequipcardid '@i,'@pos,'@nameid,0x6;
		misceffect 182,"";
		misceffect 548,"";
		misceffect 338,"";
		emotion 15;
		mes "[�f�B����]";
		mes "�����p���肪�Ƃ��������܂����B";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂��B";
		close;
	case 2:
		mes "[�f�B����]";
		mes "�j�[���G���`�����g��";
		mes "[^0000ff�����΂̏�[0]^000000]";
		mes "[^0000ff�h���̏�[0]^000000]�A";
		mes "[^0000ff�鉺���̒n�}[0]^000000]�A";
		mes "[^0000ff�P������[0]^000000]�A";
		mes "[^0000ff�����΂̌C[1]^000000]�A";
		mes "[^0000ff�я�̈Ê�[0]^000000]�A";
		mes "[^0000ff�_����̎��[0]^000000]�A";
		mes "[^0000ff�j�[���N���C���A[1]^000000]�A";
		mes "[^0000ff�j�[���O���C��[1]^000000]�A";
		mes "[^0000ff�j�[���W���}�_�n��[1]^000000]�A";
		mes "[^0000ff�j�[���V�[�t�{�E[1]^000000]�A";
		mes "[^0000ff�j�[���n���^�[�{�E[1]^000000]�A";
		mes "[^0000ff�j�[���N���X�{�E[1]^000000]�A";
		mes "[^0000ff�j�[���E�B�U�[�h�X�^�b�t[1]^000000]�A";
		mes "[^0000ff�j�[���A�[�N�����h[1]^000000]�A";
		mes "[^0000ff�j�[���z�[���[�X�e�b�L[1]^000000]�A";
		mes "[^0000ff�j�[���f�B�o�C���N���X[1]^000000]�A";
		mes "[^0000ff�j�[���M���`��[1]^000000]�A";
		mes "[^0000ff�j�[���o�X�^�[[1]^000000]�A";
		mes "[^0000ff�j�[�������藠��[1]^000000]�A";
		mes "[^0000ff�j�[�����C�t��[1]^000000]�A";
		mes "[^0000ff�����΂̃}���g[1]^000000]��";
		mes "�G���`�����g���\�ł��B";
		next;
		mes "[�f�B����]";
		mes "�܂��A�G���`�����g�̍ۂɂ�";
		mes "�j�[���̎�ނɉ����āA";
		mes "^0000ff���ƍv���̏�^000000���K�v�ɂȂ�܂��B";
		next;
		while(1) {
			switch(select("�G���`�����g�̒��ӎ���","�G���`�����g�̎��","��������")) {
			case 1:
				mes "[�f�B����]";
				mes "�G���`�����g�̒��ӎ����ɂ���";
				mes "���`���������܂��B";
				next;
				mes "[�f�B����]";
				mes "�G���`�����g���s����";
				mes "�����̐��B�l��^ff0000���Z�b�g^000000����܂��B";
				mes "���B������ۂ�";
				mes "�S�ẴG���`�����g���ς܂�����Ԃ�";
				mes "�s�������������߂��܂��B";
				next;
				mes "[�f�B����]";
				mes "�G���`�����g����A�C�e����";
				mes "�����_���I�v�V������";
				mes "�t�^����Ă����ꍇ�A";
				mes "^ff0000���̌��ʂ͈����p�����^000000�̂�";
				mes "�����S���������B";
				next;
				mes "[�f�B����]";
				mes "�G���`�����g�͊�]����A�C�e����";
				mes "^ff0000�����������^000000�ł����Ȃ��Ă��������B";
				next;
				mes "[�f�B����]";
				mes "�G���`�����g��^ff0000100%�������܂�^000000�B";
				mes "�������A��x�s�����G���`�����g��";
				mes "^ff0000���Z�b�g�͏o���܂���B^000000";
				next;
				mes "[�f�B����]";
				mes "�S�ẴG���`�����g��";
				mes "^ff0000�_�[�N�n���h[1]��";
				mes "^ff0000���ɑ�������^000000����";
				mes "�͂���������A";
				mes "�B���ꂽ�\�͂��������܂��B";
				next;
				mes "[�f�B����]";
				mes "�������A^0000ff������ނ̃G���`�����g��";
				mes "^0000ff�����t�^�����Ƃ��Ă�";
				mes "^0000ff�Z�b�g���ʂ�1�������������܂���^000000�B";
				mes "�Ⴆ�΁A�����j�[��������1�A";
				mes "�A�N�Z�T���[��1�t�^���Ă�";
				mes "��������Z�b�g���ʂ�1�񕪂݂̂ł��B";
				next;
				mes "[�f�B����]";
				mes "�Ō�ɁA1�̃A�C�e����";
				mes "�j�[���͍ő�3�܂�";
				mes "�t�^�ł��܂����A";
				mes "�����n��̃j�[����2�ȏ�";
				mes "�G���`�����g���邱�Ƃ��ł��܂���B";
				next;
				mes "[�f�B����]";
				mes "�Ⴆ�΁A���̃j�[��(�r��)��";
				mes "�t�^�����ꍇ�A";
				mes "���̎��̃j�[���͕t�^�ł��܂���B";
				next;
				continue;
			case 2:
				mes "[�f�B����]";
				mes "�j�[���͑傫��������";
				mes "�ȉ��A6�̃^�C�v������܂��B";
				next;
				mes "[�f�B����]";
				mes "�����̃j�[��";
				mes "�i���̃j�[��";
				mes "���̃j�[��";
				mes "���̃j�[��";
				mes "���_�̃j�[��";
				mes "���̃j�[��";
				next;
				mes "[�f�B����]";
				mes "�����͑S�ăG���`�����g�\�ȕ��ʂ�";
				mes "�G���`�����g�\�ȉ񐔂�";
				mes "���߂��Ă��܂��B";
				mes "�ǂ�ɂ��Ċm�F���܂����H";
				mes "�]^ff0000�ꕔ�A�m�F��";
				mes "�@^ff0000��ʂ̃X�N���[�����K�v�ł�^000000�]";
				next;
				while(1) {
					switch(select("�����̃j�[���@�c�@HP��SP�̑���","�i���̃j�[���@�c�@�����ϐ��̑���","���̃j�[���@�c�@�푰�ϐ��̑���","���̃j�[���@�c�@�X�e�[�^�X�̏㏸","���_�̃j�[���@�c�@�����Ɖ���Ɠ��쑬�x�̏㏸","���̃j�[���@�c�@�U���Ɩh��̏㏸","��������")) {
					case 1:
						switch(select("�����̃j�[��(�̗�) -> 100","�����̃j�[��(���_) -> 100","�����̃j�[��(����) -> 100","�����̃j�[��(�m��) -> 100","�߂�")) {
						case 1:
							mes "[�����̃j�[��(�̗�)]";
							mes "MaxHP + 200";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��6�ȏ�̎��A�ǉ���";
							mes "MaxHP + 300";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��8�ȏ�̎��A�ǉ���";
							mes "MaxHP + 500";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "MaxHP + 5000";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 2:
							mes "[�����̃j�[��(���_)]";
							mes "MaxSP + 10";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��6�ȏ�̎��A�ǉ���";
							mes "MaxSP + 20";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��8�ȏ�̎��A�ǉ���";
							mes "MaxSP + 50";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "MaxSP + 100";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 3:
							mes "[�����̃j�[��(����)]";
							mes "5�b����HP + 50";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��6�ȏ�̎��A�ǉ���";
							mes "5�b����HP + 50";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��8�ȏ�̎��A�ǉ���";
							mes "5�b����HP + 150";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "5�b����HP + 1000";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 4:
							mes "[�����̃j�[��(�m��)]";
							mes "5�b����SP + 1";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��6�ȏ�̎��A�ǉ���";
							mes "5�b����SP + 1";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��8�ȏ�̎��A�ǉ���";
							mes "5�b����SP + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "5�b����SP + 25";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 5:
							continue;
						}
						break;
					case 2:
						switch(select("�i���̃j�[��(��) -> 100","�i���̃j�[��(��) -> 100","�i���̃j�[��(��) -> 100","�i���̃j�[��(�n) -> 100","�i���̃j�[��(��) -> 100","�i���̃j�[��(�O) -> 100","�i���̃j�[��(��) -> 100","�߂�")) {
						case 1:
							mes "[�i���̃j�[��(��)]";
							mes "�Α����U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�Α����U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 2:
							mes "[�i���̃j�[��(��)]";
							mes "�������U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�������U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 3:
							mes "[�i���̃j�[��(��)]";
							mes "�������U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�������U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 4:
							mes "[�i���̃j�[��(�n)]";
							mes "�n�����U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�n�����U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 5:
							mes "[�i���̃j�[��(��)]";
							mes "�ő����U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�ő����U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 6:
							mes "[�i���̃j�[��(�O)]";
							mes "�O�����U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�O�����U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 7:
							mes "[�i���̃j�[��(��)]";
							mes "�ő����U����";
							mes "�󂯂�_���[�W - 20%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�ő����U����";
							mes "�󂯂�_���[�W - 15%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 8:
							continue;
						}
						break;
					case 3:
						switch(select("���̃j�[��(���`) -> 100","���̃j�[��(�s���`) -> 100","���̃j�[��(�����`) -> 100","���̃j�[��(�A���`) -> 100","���̃j�[��(�����`) -> 100","���̃j�[��(���L�`) -> 100","���̃j�[��(�����`) -> 100","���̃j�[��(�l�Ԍ`) -> 250","���̃j�[��(�V�g�`) -> 100","���̃j�[��(���`) -> 100","���̃j�[��(�v���C���[) -> 250","�߂�")) {
						case 1:
							mes "[���̃j�[��(���`)]";
							mes "���`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "���`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 2:
							mes "[���̃j�[��(�s���`)]";
							mes "�s���`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�s���`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 3:
							mes "[���̃j�[��(�����`)]";
							mes "�����`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�����`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 4:
							mes "[���̃j�[��(�A���`)]";
							mes "�A���`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�A���`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 5:
							mes "[���̃j�[��(�����`)]";
							mes "�����`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�����`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 6:
							mes "[���̃j�[��(���L�`)]";
							mes "���L�`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "���L�`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 7:
							mes "[���̃j�[��(�����`)]";
							mes "�����`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�����`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 8:
							mes "[���̃j�[��(�l�Ԍ`)]";
							mes "�l�Ԍ`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�l�Ԍ`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 9:
							mes "[���̃j�[��(�V�g�`)]";
							mes "�V�g�`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�V�g�`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 10:
							mes "[���̃j�[��(���`)]";
							mes "���`�����X�^�[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "���`�����X�^�[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 11:
							mes "[���̃j�[��(�v���C���[)]";
							mes "�v���C���[����";
							mes "�󂯂�_���[�W - 30%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�v���C���[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�h�����`�v���C���[����";
							mes "�󂯂�_���[�W - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 12:
							continue;
						}
						break;
					case 4:
						switch(select("���̃j�[��(�r��) -> 100","���̃j�[��(�v��) -> 100","���̃j�[��(�̗�) -> 100","���̃j�[��(�m��) -> 100","���̃j�[��(�W��) -> 100","���̃j�[��(�K�^) -> 100","�߂�")) {
						case 1:
							mes "[���̃j�[��(�r��)]";
							mes "Str + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Str + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Str + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Str + 5";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 2:
							mes "[���̃j�[��(�v��)]";
							mes "Agi + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Agi + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Agi + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Agi + 5";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 3:
							mes "[���̃j�[��(�̗�)]";
							mes "Vit + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Vit + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Vit + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Vit + 5";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 4:
							mes "[���̃j�[��(�m��)]";
							mes "Int + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Int + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Int + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Int + 5";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 5:
							mes "[���̃j�[��(�W��)]";
							mes "Dex + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Dex + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Dex + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Dex + 5";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 6:
							mes "[���̃j�[��(�K�^)]";
							mes "Luk + 3";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Luk + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Luk + 2";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Luk + 5";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 7:
							continue;
						}
						break;
					case 5:
						switch(select("���_�̃j�[��(�v��) -> 300","���_�̃j�[��(�W��) -> 300","���_�̃j�[��(�n��) -> 300","���_�̃j�[��(����) -> --","���_�̃j�[��(���) -> --","���_�̃j�[��(�K�^) -> --","�߂�")) {
						case 1:
							mes "[���_�̃j�[��(�v��)]";
							mes "�U�����x + 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "�U�����x + 3%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "�U�����x + 2%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Aspd + 1";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 2:
							mes "[���_�̃j�[��(�W��)]";
							mes "�r������ - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "�r������ - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "�r������ - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�r������ - 10%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 3:
							mes "[���_�̃j�[��(�n��)]";
							mes "�X�L���f�B���C - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "�X�L���f�B���C - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "�X�L���f�B���C - 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�X�L���f�B���C - 10%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�j�[���N���C���A[1]�A";
							mes "�j�[���O���C��[1]�A";
							mes "�j�[���W���}�_�n��[1]�A";
							mes "�j�[���V�[�t�{�E[1]�A";
							mes "�j�[���n���^�[�{�E[1]�A";
							mes "�j�[���N���X�{�E[1]�A";
							mes "�j�[���E�B�U�[�h�X�^�b�t[1]�A";
							mes "�j�[���A�[�N�����h[1]�A";
							mes "�j�[���z�[���[�X�e�b�L[1]�A";
							mes "�j�[���f�B�o�C���N���X[1]�A";
							mes "�j�[���M���`��[1]�A";
							mes "�j�[���o�X�^�[[1]�A";
							mes "�j�[�������藠��[1]�A";
							mes "�j�[�����C�t��[1]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 4:
							mes "[�f�B����]";
							mes "���݂܂���B";
							mes "^FF0000���_�̃j�[��(����)^000000�ɂ��Ă�";
							mes "���͂悭�m��Ȃ���ł��B";
							mes "�ڂ�������^0000FF���u^000000�Ƃ���";
							mes "�j�[���������Ԃ��m���Ă��܂��B";
							next;
							mes "[�f�B����]";
							mes "�ŋ߉���Ă��Ȃ��ł����A";
							mes "�V���o���c�o���h���a����";
							mes "�����l������悤�ł��B";
							mes "�o�������A�����Ă݂Ă��������B";
							break;
						case 5:
							mes "[�f�B����]";
							mes "���݂܂���B";
							mes "^FF0000���_�̃j�[��(���)^000000�ɂ��Ă�";
							mes "���͂悭�m��Ȃ���ł��B";
							mes "�ڂ�������^0000FF���u^000000�Ƃ���";
							mes "�j�[���������Ԃ��m���Ă��܂��B";
							next;
							mes "[�f�B����]";
							mes "�ŋ߉���Ă��Ȃ��ł����A";
							mes "�V���o���c�o���h���a����";
							mes "�����l������悤�ł��B";
							mes "�o�������A�����Ă݂Ă��������B";
							break;
						case 6:
							mes "[�f�B����]";
							mes "���݂܂���B";
							mes "^FF0000���_�̃j�[��(�K�^)^000000�ɂ��Ă�";
							mes "���͂悭�m��Ȃ���ł��B";
							mes "�ڂ�������^0000FF���u^000000�Ƃ���";
							mes "�j�[���������Ԃ��m���Ă��܂��B";
							next;
							mes "[�f�B����]";
							mes "�ŋ߉���Ă��Ȃ��ł����A";
							mes "�V���o���c�o���h���a����";
							mes "�����l������悤�ł��B";
							mes "�o�������A�����Ă݂Ă��������B";
							break;
						case 7:
							continue;
						}
						break;
					case 6:
						switch(select("���̃j�[��(�r��) -> 200","���̃j�[��(�m��) -> 200","���̃j�[��(�̗�) -> 200","���̃j�[��(���h) -> 200","���̃j�[��(�Z�I) -> --","���̃j�[��(�K�^) -> --","�߂�")) {
						case 1:
							mes "[���̃j�[��(�r��)]";
							mes "�����U����";
							mes "�^����_���[�W + 3%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "�����U����";
							mes "�^����_���[�W + 1%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "�����U����";
							mes "�^����_���[�W + 1%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "�����U����";
							mes "�^����_���[�W + 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 2:
							mes "[���̃j�[��(�m��)]";
							mes "���@�U����";
							mes "�^����_���[�W + 3%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "���@�U����";
							mes "�^����_���[�W + 1%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "���@�U����";
							mes "�^����_���[�W + 1%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "���@�U����";
							mes "�^����_���[�W + 5%";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 3:
							mes "[���̃j�[��(�̗�)]";
							mes "Def + 10";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Def + 15";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Def + 25";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Def + 500";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 4:
							mes "[���̃j�[��(���h)]";
							mes "Mdef + 4";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��7�ȏ�̎��A�ǉ���";
							mes "Mdef + 6";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "���B�l��9�ȏ�̎��A�ǉ���";
							mes "Mdef + 10";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "[�_�[�N�n���h]��";
							mes "���ɑ������A�ǉ���";
							mes "Mdef + 20";
							mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
							mes "�����΂̏�[0]�A";
							mes "�h���̏�[0]�A";
							mes "�鉺���̒n�}[0]�A";
							mes "�P������[0]�A";
							mes "�����΂̌C[1]�A";
							mes "�я�̈Ê�[0]�A";
							mes "�_����̎��[0]�A";
							mes "�����΂̃}���g[1]��";
							mes "^ff00001��^000000���p�\";
							break;
						case 5:
							mes "[�f�B����]";
							mes "���݂܂���B";
							mes "^FF0000���̃j�[��(�Z�I)^000000�ɂ��Ă�";
							mes "���͂悭�m��Ȃ���ł��B";
							mes "�ڂ�������^0000FF���u^000000�Ƃ���";
							mes "�j�[���������Ԃ��m���Ă��܂��B";
							next;
							mes "[�f�B����]";
							mes "�ŋ߉���Ă��Ȃ��ł����A";
							mes "�V���o���c�o���h���a����";
							mes "�����l������悤�ł��B";
							mes "�o�������A�����Ă݂Ă��������B";
							break;
						case 6:
							mes "[�f�B����]";
							mes "���݂܂���B";
							mes "^FF0000���̃j�[��(�K�^)^000000�ɂ��Ă�";
							mes "���͂悭�m��Ȃ���ł��B";
							mes "�ڂ�������^0000FF���u^000000�Ƃ���";
							mes "�j�[���������Ԃ��m���Ă��܂��B";
							next;
							mes "[�f�B����]";
							mes "�ŋ߉���Ă��Ȃ��ł����A";
							mes "�V���o���c�o���h���a����";
							mes "�����l������悤�ł��B";
							mes "�o�������A�����Ă݂Ă��������B";
							break;
						case 7:
							continue;
						}
						break;
					case 7:
						emotion 15;
						mes "[�f�B����]";
						mes "�����p���肪�Ƃ��������܂����B";
						mes "�܂��̂��z����";
						mes "���҂����Ă���܂��B";
						close;
					}
					next;
					continue;
				}
			case 3:
				emotion 15;
				mes "[�f�B����]";
				mes "�����p���肪�Ƃ��������܂����B";
				mes "�܂��̂��z����";
				mes "���҂����Ă���܂��B";
				close;
			}
		}
	case 3:
		mes "[�f�B����]";
		mes "���ƍv���̏؂�";
		mes "��������]�����̂ł��ˁB";
		mes "�ǂ���������]�ł����H";
		next;
		setarray '@menu$,"�����΂̏�[0] -> 50","�h���̏�[0] -> 500","�鉺���̒n�}[0] -> 500","�P������[0] -> 500","^888888�y�I��s�z�h���S���z�[��^000000 -> 500","^888888�y�I��s�z�R�[���I�u�l���V�X^000000 -> 500","���Ƃ̐��� -> 5","��߂�";
		if(Job == Job_RuneKnight || Job == Job_DragonKnight)
			set '@menu$[4],"�h���S���z�[�� -> 500";
		if(Job == Job_RoyalGuard || Job == Job_ImperialGuard)
			set '@menu$[5],"�R�[���I�u�l���V�X -> 500";
		set '@i,select(printarray('@menu$)) - 1;
		switch('@i) {
		case 0:		// �����΂̏�
			set '@gain,28920;
			set '@amount,50;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "��������]����i����";
			mes "�����΂̏�[0]��";
			mes "��낵���ł����H";
			break;
		case 1:		// �h���̏�[0]
			set '@gain,28499;
			set '@amount,500;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "��������]����i����";
			mes "�h���̏�[0]��";
			mes "��낵���ł����H";
			break;
		case 2:		// �鉺���̒n�}[0]
			set '@gain,28497;
			set '@amount,500;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "��������]����i����";
			mes "�鉺���̒n�}[0]��";
			mes "��낵���ł����H";
			break;
		case 3:		// �P������[0]
			set '@gain,28498;
			set '@amount,500;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "��������]����i����";
			mes "�P������[0]��";
			mes "��낵���ł����H";
			break;
		case 4:		// �h���S���z�[��
			if(Job == Job_RuneKnight || Job == Job_DragonKnight) {
				set '@gain,23219;
				set '@amount,500;
				if(countitem(6919) < '@amount) {
					mes "[�f�B����]";
					mes "�������̉��ƍv���̏؂�";
					mes "����Ȃ��悤�ł��B";
					mes "�K�v�������m���߂̏�A";
					mes "������x�����������������B";
					close;
				}
				mes "[�f�B����]";
				mes "��������]����i����";
				mes "�h���S���z�[����";
				mes "��낵���ł����H";
			} else {
				mes "[�f�B����]";
				mes "�\���󂲂����܂���B";
				mes "�����]�̃A�C�e����";
				mes "���[���i�C�g�̕��̂�";
				mes "�g�p�ł���A�C�e���̂��߁A";
				mes "�������󂯕t���Ă���܂���B";
				close;
			}
			break;
		case 5:		// �R�[���I�u�l���V�X
			if(Job == Job_RoyalGuard || Job == Job_ImperialGuard) {
				set '@gain,23220;
				set '@amount,500;
				if(countitem(6919) < '@amount) {
					mes "[�f�B����]";
					mes "�������̉��ƍv���̏؂�";
					mes "����Ȃ��悤�ł��B";
					mes "�K�v�������m���߂̏�A";
					mes "������x�����������������B";
					close;
				}
				mes "[�f�B����]";
				mes "��������]����i����";
				mes "�R�[���I�u�l���V�X��";
				mes "��낵���ł����H";
			} else {
				mes "[�f�B����]";
				mes "�\���󂲂����܂���B";
				mes "�����]�̃A�C�e����";
				mes "���C�����K�[�h�̕��̂�";
				mes "�g�p�ł���A�C�e���̂��߁A";
				mes "�������󂯕t���Ă���܂���B";
				close;
			} 
			break;
		case 6:		// ���Ƃ̐���
			set '@gain,22901;
			mes "[�f�B����]";
			mes "���Ƃ̐����ł��ˁB";
			mes "��������������]�ł����H";
			mes "��x�ɍő�100�܂�";
			mes "���������󂯂������܂��B";
			next;
			input '@num;
			if('@num <= 0) {
				mes "[�f�B����]";
				mes "�����������܂�܂�����";
				mes "������x�����������������B";
				close;
			}
			if('@num > 100) {
				mes "[�f�B����]";
				mes "�\���󂲂����܂���B";
				mes "��x�Ɍ����ł���̂�";
				mes "100�܂łł��B";
				mes "�����������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			set '@amount,5 * '@num;
			if(countitem(6919) < '@amount) {
				mes "[�f�B����]";
				mes "�������̉��ƍv���̏؂�";
				mes "����Ȃ��悤�ł��B";
				mes "�K�v�������m���߂̏�A";
				mes "������x�����������������B";
				close;
			}
			mes "[�f�B����]";
			mes "��������]����i����";
			mes "���Ƃ̐�����";
			mes "��낵���ł����H";
			mes "(������ : "+'@num+"��)";
			next;
			if(select("������","�͂�") == 1) {
				mes "[�f�B����]";
				mes "�i�������܂�܂�����";
				mes "������x�����������������B";
				close;
			}
			if(checkitemblank() == 0) {
				mes "[�f�B����]";
				mes "�A�C�e���̎�ސ���";
				mes "��������悤�ł��B";
				mes "�ו������炵�Ă��������܂����B";
				close;
			}
			if(checkweight('@gain,'@num) == 0) {
				mes "[�f�B����]";
				mes "�������Ă���A�C�e����";
				mes "�d������悤�ł��B";
				mes "�ו����y�����Ă��������܂����B";
				close;
			}
			delitem 6919,'@amount;
			getitem '@gain,'@num;
			emotion 15;
			mes "[�f�B����]";
			mes "�����p���肪�Ƃ��������܂����B";
			mes "�܂��̂��z����";
			mes "���҂����Ă���܂��B";
			close;
		default:
			mes "[�f�B����]";
			mes "�����p���肪�Ƃ��������܂����B";
			mes "�܂��̂��z����";
			mes "���҂����Ă���܂��B";
			close;
		}
		next;
		if(select("������","�͂�") == 1) {
			mes "[�f�B����]";
			mes "�i�������܂�܂�����";
			mes "������x�����������������B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[�f�B����]";
			mes "�A�C�e���̎�ސ���";
			mes "��������悤�ł��B";
			mes "�ו������炵�Ă��������܂����B";
			close;
		}
		if(checkweight('@gain,1) == 0) {
			mes "[�f�B����]";
			mes "�������Ă���A�C�e����";
			mes "�d������悤�ł��B";
			mes "�ו����y�����Ă��������܂����B";
			close;
		}
		delitem 6919,'@amount;
		getitem '@gain,1;
		emotion 15;
		mes "[�f�B����]";
		mes "�����p���肪�Ƃ��������܂����B";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂��B";
		close;
	case 4:
		mes "[�f�B����]";
		mes "���ƍv���̏؂ł�";
		mes "�������C���i�b�v�̊m�F�ł��ˁB";
		mes "�ǂ���������ɂȂ�܂����H";
		next;
		while(1) {
			switch(select("�����΂̏�[0] -> 50","�h���̏�[0] -> 500","�鉺���̒n�}[0] -> 500","�P������[0] -> 500","�h���S���z�[�� -> 500","�R�[���I�u�l���V�X -> 500","���Ƃ̐��� -> 5","��������")) {
			case 1:
				mes "[�����΂̏�[0]]";
				mes "BaseLv150�ȏ�̎��A�ǉ���";
				mes "Def + 100";
				mes "��������������������������";
				mes "[�����΂̏�]��";
				mes "���B�l��3�オ��x�ɒǉ���";
				mes "Def + 20";
				mes "��������������������������";
				mes "[�h���̏�]��";
				mes "���ɑ������A�ǉ���";
				mes "���S��� + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777��^000000";
				mes "�h�� : ^77777750^000000";
				mes "�d�� : ^777777100^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777�S�Ă̐E��^000000";
				break;
			case 2:
				mes "[�h���̏�[0]]";
				mes "���ׂẴX�e�[�^�X + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 2%";
				mes "��������������������������";
				mes "BaseLv150�ȏ�̎��A�ǉ���";
				mes "���ׂẴX�e�[�^�X + 1";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 2%";
				mes "��������������������������";
				mes "[�����΂̏�]��";
				mes "���ɑ������A�ǉ���";
				mes "���S��� + 10";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�A�N�Z�T���[^000000";
				mes "�h�� : ^7777770^000000";
				mes "�d�� : ^77777710^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777�S�Ă̐E��^000000";
				break;
			case 3:
				mes "[�鉺���̒n�}[0]]";
				mes "�����U����";
				mes "�^����_���[�W + 2%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�U�����x + 3%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�A�N�Z�T���[^000000";
				mes "�h�� : ^7777770^000000";
				mes "�d�� : ^77777710^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777�S�Ă̐E��^000000";
				break;
			case 4:
				mes "[�P������[0]]";
				mes "���@�U����";
				mes "�^����_���[�W + 2%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�r������ - 5%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�A�N�Z�T���[^000000";
				mes "�h�� : ^7777770^000000";
				mes "�d�� : ^77777710^000000";
				mes "�v�����x�� : ^777777100^000000";
				mes "���� : ^777777�S�Ă̐E��^000000";
				break;
			case 5:
				mes "[�h���S���z�[��]";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^ff0000���h���S���z�[����^000000";
				mes "^ff0000���[���i�C�g�̕��̂�^000000";
				mes "^ff0000�����\�ł��B^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "[�h���S���z�[��]�g�p���A";
				mes "[�h���S��";
				mes "�g���[�j���O]Lv5��";
				mes "�K�����Ă���ꍇ�A";
				mes "�h���S����";
				mes "�R�悷�邱�Ƃ��ł���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�Ďg�p�ҋ@����20�b";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^FF0000[�h���S���z�[��]��";
				mes "�U���E�V�U���̍ԓ��E";
				mes "�^�[�{�g���b�N�ł�";
				mes "�g�p�ł��܂���^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^FF0000[�h���S���z�[��]��";
				mes "NPC���p�E�q�ɂւ̈ړ��̂�";
				mes "�\�ł�^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�d�� : ^7777770^000000";
				break;
			case 6:
				mes "[�R�[���I�u�l���V�X]";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^ff0000���R�[���I�u�l���V�X��^000000";
				mes "^ff0000���C�����K�[�h�̕��̂�^000000";
				mes "^ff0000�����\�ł��B^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "���C�����K�[�h��";
				mes "[�R�[���I�u�l���V�X]�g�p��";
				mes "[�R���C��]Lv5��";
				mes "�K�����Ă���ꍇ�A";
				mes "�O���t�H����";
				mes "�R�悷�邱�Ƃ��ł���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�Ďg�p�ҋ@����20�b";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^FF0000[�R�[���I�u�l���V�X]��";
				mes "�U���E�V�U���̍ԓ��E";
				mes "�^�[�{�g���b�N�ł�";
				mes "�g�p�ł��܂���^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^FF0000[�R�[���I�u�l���V�X]��";
				mes "NPC���p�E�q�ɂւ̈ړ��̂�";
				mes "�\�ł�^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�d�� : ^7777770^000000";
				break;
			case 7:
				mes "[���Ƃ̐���]";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "^ff0000�����Ƃ̐����͎g�p�����^000000";
				mes "^ff0000�����_���ŃA�C�e����1��^000000";
				mes "^ff0000����ł��܂��B^000000";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�m��l���m���Ă���";
				mes "���̔��Ƃ�������B";
				mes "�����ǒ��g��";
				mes "�m���ɈႤ�悤���B";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�d�� : ^77777720^000000";
				break;
			case 8:
				mes "[�f�B����]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
			next;
			continue;
		}
		close;
	case 5:
		mes "[�f�B����]";
		mes "�����p���肪�Ƃ��������܂����B";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂��B";
		close;
	}
}

prt_cas.gat,21,33,4	script	�j�������̏���#ep16jp	893,{
	mes "[�j�������̏���]";
	mes "������ł́A�����p�t�̃��[�u��";
	mes "����߂�����A�G���`�����g��";
	mes "�s�������ł��܂��B";
	next;
	setarray '@menu$,"�����p�t�̃��[�u�̌���","�����p�t�̃��[�u�̎���߂�","���z�҂̃��[�u�G���`�����g","�����p�t�̃��[�u�ɂ��ĕ���","���z�҂̃��[�u�ɂ��ĕ���","��߂�";
	if(countitem(6941) == 0)
		set '@menu$[0],"^888888"+'@menu$[0]+"^000000";
	if(getequiprefinerycnt(2) < 9 || getequipid(2) != 15193)
		set '@menu$[1],"^888888"+'@menu$[1]+"^000000";
	if(getequiprefinerycnt(2) < 9 || getequipid(2) != 15194 || getequipcardid(2,3) == 4876)
		set '@menu$[2],"^888888"+'@menu$[2]+"^000000";
	switch(select(printarray('@menu$))) {
	case 1:		// TODO
		mes "[�j�������̏���]";
		mes "�j�������l�͖��𑽂͂��܂�";
		mes "�A�C�e�����W�߂Ă����܂��B";
		next;
		mes "[�j�������̏���]";
		mes "����ɂ��ƁA�ߋ���";
		mes "���@���L���[�̗͂̔j�ЂƌĂ΂��";
		mes "����Ȗ��͂�����";
		mes "��΂������������ł��B";
		next;
		if(countitem(6941) == 0) {
			mes "[�j�������̏���]";
			mes "�������̂悤�ȃA�C�e����";
			mes "���肵���玄�̂Ƃ���܂�";
			mes "�����Ă��Ă��������B";
			mes "����͒e�݂܂���B";
			close;
		}
		mes "[�j�������̏���]";
		mes "�����A�����";
		mes "���@���L���[�̗͂̔j��!!";
		next;
		mes "[�j�������̏���]";
		mes "�����1�����Ē�����Ȃ�";
		mes "����Ƃ��Ĉ̑�ȃ}�W�V����";
		mes "�j�������l�̈��p����";
		mes "���[�u���ꒅ���n�����܂��傤�B";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�j�������̏���]";
			mes "�c�O�ł��c�c�B";
			mes "�C���ς�����痈�Ă��������B";
			mes "���ł����҂����Ă��܂��B";
			close;
		}
		if(checkitemblank() == 0) {
			mes "[�j�������̏���]";
			mes "�A�C�e���̎�ސ��������ł��B";
			mes "�ו������炵�Ă��������B";
			close;
		}
		delitem 6941,1;
		getitem 15193,1;
		emotion 15;
		mes "[�j�������̏���]";
		mes "���肪�Ƃ��������܂��B";
		mes "����Ńj�������l��";
		mes "����тɂȂ�܂��B";
		close;
	case 2:		// TODO
		mes "[�j�������̏���]";
		mes "�����p�t�̃��[�u��";
		mes "�ꌩ�Âڂ������[�u�ł����A";
		mes "���̐̂͂ƂĂ����͂�";
		mes "���͂�����Ă�����";
		mes "�����`�����Ă��܂��B";
		next;
		mes "[�j�������̏���]";
		mes "����߂����Ƃ�";
		mes "����ꂽ�͂����߂��܂����A";
		mes "���̂��߂ɂ̓��[�u�����Ԉړ���";
		mes "�ς������x��";
		mes "�b����K�v������܂��B";
		next;
		if(getequiprefinerycnt(2) < 9 || getequipid(2) != 15193) {
			mes "[�j�������̏���]";
			mes "�����p�t�̃��[�u��";
			mes "+9�ȏ�ɒb������";
			mes "�����Ă��Ă��������B";
			close;
		}
		if(select("����߂�","��߂Ă���") == 2) {
			mes "[�j�������̏���]";
			mes "�����ł����B";
			close;
		}
		delequip 2;
		getitem 15194,1;
		emotion 21;
		misceffect 676,"";
		mes "[�j�������̏���]";
		mes "�ǂ����A���󂯎�艺�����B";
		close;
	case 3:		// TODO
		mes "[�j�������̏���]";
		mes "���z�҂̃��[�u��";
		mes "����ȗ͂������Ă��܂����A";
		mes "�G�N���[�W���ŉ����";
		mes "��V���g���΂���Ȃ�͂�";
		mes "�����o���邩������܂���B";
		next;
		mes "[�j�������̏���]";
		mes "�͂������o�����߂ɂ�";
		mes "���O�ɒ��z�҂̃��[�u��";
		mes "������x�b���Ă����K�v������܂��B";
		next;
		if(getequiprefinerycnt(2) < 9 || getequipid(2) != 15194) {
			mes "[�j�������̏���]";
			mes "���z�҂̃��[�u��";
			mes "+9�ȏ�ɒb������";
			mes "�����Ă��Ă��������B";
			close;
		}
		// �G���`�����g�ς�(��)
		if(getequipcardid(2,3) == 4876) {
			mes "[�j�������̏���]";
			mes "����H";
			mes "���̒��z�҂̃��[�u��";
			mes "���łɃG���`�����g����Ă��܂��B";
			close;
		}
		mes "[�j�������̏���]";
		mes "�G���`�����g���܂����H";
		next;
		if(select("�G���`�����g������","��߂Ă���") == 2) {
			mes "[�j�������̏���]";
			mes "�����ł����B";
			close;
		}
		set '@refine,getequiprefinerycnt(2);
		set '@card[0],getequipcardid(2,0);
		set '@card[1],getequipcardid(2,1);
		set '@card[2],getequipcardid(2,2);
		set '@card[3],4876;		// �\����������
		delequip 2;
		getitem2 15194,1,1,'@refine,0,'@card[0],'@card[1],'@card[2],'@card[3];
		mes "[�j�������̏���]";
		mes "�G���`�����g�͏I�����܂����B";
		mes "�ǂ����A���󂯎�艺�����B";
		close;
	case 4:
		mes "[�j�������̏���]";
		mes "������ł́A";
		mes "���@���L���[�̗͂̔j�Ђ�";
		mes "1�����Ă���������";
		mes "����Ɏ����p�t�̃��[�u��";
		mes "1���n�����Ă��܂��B";
		next;
		mes "[�j�������̏���]";
		mes "�����p�t�̃��[�u�̐��\��";
		mes "�ȉ��̒ʂ�ł��B";
		next;
		mes "[�����p�t�̃��[�u]";
		mes "Matk + 30";
		mes "��������������������������";
		mes "�r������ - 5%";
		mes "��������������������������";
		mes "���@�U���������A";
		mes "���m����10�b�ԁA";
		mes "[�����p�t�̃��[�u]��";
		mes "���B�l��1�オ��x�ɒǉ���";
		mes "Int + 3";
		mes "��������������������������";
		mes "[�͂̎���u�[�c]�A";
		mes "[�r�q�̎���u�[�c]�A";
		mes "[�̗͂̎���u�[�c]�A";
		mes "[�m�͂̎���u�[�c]�A";
		mes "[�Z�I�̎���u�[�c]�A";
		mes "[�K�^�̎���u�[�c]��";
		mes "�����ꂩ�Ƌ��ɑ������A";
		mes "�ǉ���";
		mes "MaxHP + 20%";
		mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
		mes "�n�� : ^777777�Z^000000";
		mes "�h�� : ^77777735^000000";
		mes "�d�� : ^77777780^000000";
		mes "�v�����x�� : ^777777100^000000";
		mes "���� : ^777777�m�[�r�X�n�������S�Ă̐E��^000000";
		next;
		mes "[�j�������̏���]";
		mes "�܂��A���B�l��+9�ȏ��";
		mes "�����p�t�̃��[�u�������ė��Ē������";
		mes "����ꂽ�͂����߂���";
		mes "���z�҂̃��[�u�ɂ��č����グ�邱�Ƃ�";
		mes "�\�ł��B";
		close;
	case 5:
		mes "[�j�������̏���]";
		mes "������ł́A���B�l��+9�ȏ��";
		mes "�����p�t�̃��[�u�̎���߂��A";
		mes "����ꂽ�͂����߂���";
		mes "���z�҂̃��[�u�ɂ��č����グ�邱�Ƃ�";
		mes "�\�ł��B";
		next;
		mes "[�j�������̏���]";
		mes "���z�҂̃��[�u�̐��\��";
		mes "�ȉ��̒ʂ�ł��B";
		next;
		mes "[���z�҂̃��[�u]";
		mes "Matk + 60";
		mes "��������������������������";
		mes "�r������ - 5%";
		mes "��������������������������";
		mes "�r�������f����Ȃ�";
		mes "��������������������������";
		mes "[���z�҂̃��[�u]��";
		mes "���B�l��1�オ��x�ɒǉ���";
		mes "Int + 3";
		mes "�O�������@�U����";
		mes "�^����_���[�W + 2%";
		mes "��������������������������";
		mes "[�j�[�Y�w�b�O�̉e�J�[�h]��";
		mes "���ɑ������A�ǉ���";
		mes "��΂ɓ�����ԂɂȂ�Ȃ�";
		mes "���@�U����";
		mes "�����X�^�[��|�������A";
		mes "HP + 200 ,SP + 20";
		mes "��������������������������";
		mes "[�͂̎���u�[�c]�A";
		mes "[�r�q�̎���u�[�c]�A";
		mes "[�̗͂̎���u�[�c]�A";
		mes "[�m�͂̎���u�[�c]�A";
		mes "[�Z�I�̎���u�[�c]�A";
		mes "[�K�^�̎���u�[�c]��";
		mes "�����ꂩ�Ƌ��ɑ������A";
		mes "�ǉ���";
		mes "MaxHP + 20%";
		mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
		mes "�n�� : ^777777�Z^000000";
		mes "�h�� : ^77777735^000000";
		mes "�d�� : ^77777780^000000";
		mes "�v�����x�� : ^777777100^000000";
		mes "���� : ^777777�m�[�r�X�n�������S�Ă̐E��^000000";
		next;
		mes "[�j�������̏���]";
		mes "�܂��A���z�҂̃��[�u��";
		mes "���B�l��+9�ȏ�ɂ����";
		mes "���ʂȃG���`�����g��";
		mes "���z�҂̃��[�u��";
		mes "�{���č����グ�܂��B";
		next;
		mes "[�j�������̏���]";
		mes "�Ȃ�ƁI";
		mes "���B�l��J�[�h�͂��̂܂܂�";
		mes "�\���������͂Ƃ����\�͂�";
		mes "���z�҂̃��[�u�̑�4�X���b�g��";
		mes "�G���`�����g�ł���̂ł��B";
		next;
		mes "[�j�������̏���]";
		mes "^ff0000�������A���łɑ�4�X���b�g��";
		mes "^ff0000�G���`�����g�ς݂̏ꍇ�A";
		mes "^ff0000�G���`�����g���㏑������܂��B^000000";
		next;
		mes "[�j�������̏���]";
		mes "�\���������͂̔\�͂�";
		mes "�ȉ��̒ʂ�ł��B";
		next;
		mes "[�\����������]";
		mes "���@�U���������A";
		mes "���m����10�b�ԁA";
		mes "[�\����������]����";
		mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
		mes "[�\����������]�������A";
		mes "Int + 200";
		mes "1�b����SP - 200";
		mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
		mes "[�J���f���C�̎�]�A";
		mes "[���t�B�l�V�[���h]��";
		mes "���ɑ������A";
		mes "[�R���b�g]��";
		mes "�Ďg�p�ҋ@���Ԍ������ʂ�";
		mes "�������Ȃ�";
		mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
		mes "[������_���q�o���J�[�h]";
		mes "�Ƌ��ɑ������A";
		mes "[������_���q�o���J�[�h]";
		mes "�̌��ʂ��������Ȃ�";
		next;
		mes "[�j�������̏���]";
		mes "�ƂĂ����͓I���Ǝv���܂��̂�";
		mes "�����p�t�̃��[�u���������Ȃ�";
		mes "���ЁA�G���`�����g�Ȃǂ�";
		mes "���˗����������B";
		close;
	case 6:
		mes "[�j�������̏���]";
		mes "�C���ς�����痈�Ă��������B";
		mes "���ł����҂����Ă��܂��B";
		close;
	}
}

//============================================================
// �p���t���J�[�h����NPC
//------------------------------------------------------------
prt_cas.gat,27,16,4	script	�����X�^�[������#ep16jp	866,{
	if(!(checkquest(73130) & 0x8)) {
		mes "[�����X�^�[������]";
		mes "����^0000ff�p���t�������X�^�[^000000�ƌĂ΂��";
		mes "^0000ff�󏭎�^000000�̌��������Ă���҂ł��B";
		next;
		mes "[�����X�^�[������]";
		mes "�p���t�������X�^�[��";
		mes "�ʏ�̃����X�^�[��";
		mes "�F��傫�����قȂ�A";
		mes "���͂ȗ͂������Ă��܂��B";
		next;
		mes "[�����X�^�[������]";
		mes "�������ł̓X�P���g����";
		mes "�A�[�`���[�X�P���g���Ȃǂ�";
		mes "�󏭎킪�m�F����Ă���A";
		mes "������ʏ�̂���ɔ�ׂ�";
		mes "���������X�^�[�ł����B";
		next;
		mes "[�����X�^�[������]";
		mes "�p���t�������X�^�[��";
		mes "���̗͂����łȂ��A";
		mes "^0000ff�J�[�h����苭�͂�^000000";
		mes "^0000ff���ʂ����Ƃ����܂��B^000000";
		next;
		mes "[�����X�^�[������]";
		mes "�������A�p���t�������X�^�[��";
		mes "�󏭎�̂��ߖő���";
		mes "�o����Ƃ��o���܂���B";
		mes "���̂��߃J�[�h�̓����";
		mes "������ɂ߂܂��B";
		next;
		mes "[�����X�^�[������]";
		mes "�������A���͒��N�̌����̖��A";
		mes "���Ƀp���t�������X�^�[��";
		mes "�J�[�h����肾�����Ƃ�";
		mes "���������̂ł��B";
		next;
		mes "[�����X�^�[������]";
		mes "�p���t�������X�^�[�̃J�[�h��";
		mes "^0000ff�ʏ�̃����X�^�[�̃J�[�h��^000000";
		mes "^0000ff�������d�ˁA���[���̗͂�^000000";
		mes "^0000ff���k���邱�Ƃɂ���Đ����ł��܂��B^000000";
		next;
		mes "[�����X�^�[������]";
		mes "���������������";
		mes "���̂Ƃ���ɃJ�[�h��";
		mes "�u^0000ff���[�����@�̕�^000000�v��";
		mes "�����Ă��Ă��������B";
		mes "�Ⴆ�����ς݂ł�";
		mes "���k���Ă����܂���B";
		setquest 73130;
		compquest 73130;
		close;
	}
	mes "[�����X�^�[������]";
	mes "�悤������������Ⴂ�܂����B";
	mes "�{���͂ǂ̂悤�Ȃ��p���ł����H";
	next;
	switch(select("�p���t���J�[�h�̐���","�����ς݂̃J�[�h�̃A�b�v�O���[�h","�p���t���J�[�h�̐��\������","��߂�")) {
	case 1:
		mes "[�����X�^�[������]";
		mes "�ǂ̃����X�^�[��";
		mes "�J�[�h�̐���������]�ł����H";
		next;
		switch(select("�p���t��A�X�P���g��","�p���t���X�P���g��","�p���t��S�X�P���g��","�p���t���A���_���C�X","��߂�")) {
		case 1:	// �p���t��A�X�P���g���J�[�h
			set '@gain,27037;
			setarray '@nameid,4094,6920;
			setarray '@amount,4,5;
			break;
		case 2:	// �p���t���X�P���g���J�[�h
			set '@gain,27036;
			setarray '@nameid,4025,6920;
			setarray '@amount,7,5;
			break;
		case 3:	// �p���t��S�X�P���g���J�[�h
			set '@gain,27038;
			setarray '@nameid,4086,6920;
			setarray '@amount,5,5;
			break;
		case 4:	// �p���t���A���_���C�X�J�[�h
			set '@gain,27039;
			setarray '@nameid,4601,6920;
			setarray '@amount,2,20;
			break;
		case 5:
			mes "[�����X�^�[������]";
			mes "�킩��܂����B";
			mes "�K�v�ɂȂ�����܂����Ă��������B";
			close;
		}
		mes "[�����X�^�[������]";
		mes "^0000ff" +getitemname('@gain)+ "^000000";
		mes "�ł��ˁB";
		mes getitemname('@nameid[0])+ " " +'@amount[0]+ "��";
		mes getitemname('@nameid[1])+ " " +'@amount[1]+ "��";
		mes "�ł���肵�܂��傤�B";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�����X�^�[������]";
			mes "�킩��܂����B";
			mes "�K�v�ɂȂ�����܂����Ă��������B";
			close;
		}
		if(countitem('@nameid[0]) < '@amount[0] || countitem('@nameid[1]) < '@amount[1]) {
			mes "[�����X�^�[������]";
			mes "�ނނ�";
			mes "�ޗ�������Ȃ��悤�ł��ˁB";
			mes "������x���m�F���������܂����H";
			close;
		}
		if(checkitemblank() == 0) {
			// ������
			mes "�]�ו�������ȏ㎝�Ă܂���";
			mes "�@�ו���1�ȏ�̋󂫂�";
			mes "�@����Ă��������]";
			close;
		}
		delitem '@nameid[0],'@amount[0];
		delitem '@nameid[1],'@amount[1];
		getitem '@gain,1;
		misceffect 102,"";
		misceffect 107,"";
		misceffect 135,"";
		mes "[�����X�^�[������]";
		mes "�ӂ��A�����ɂł����悤�ł��B";
		mes "�厖�ɂ��Ă��������ˁB";
		close;
	case 2:
		mes "[�����X�^�[������]";
		mes "���ɑ����ɑ�������Ă���";
		mes "�J�[�h�̃A�b�v�O���[�h��";
		mes "����]�ł��ˁB";
		mes "�����̐��B�l�A���̑����ς݂̃J�[�h�A";
		mes "�G���`�����g�A�����_���I�v�V������";
		mes "�ێ������܂܃A�b�v�O���[�h�ł��܂��B";
		next;
		mes "[�����X�^�[������]";
		mes "�A�b�v�O���[�h�ɕK�v��";
		mes "���ƂȂ�J�[�h�̖����́A";
		mes "�ʏ�̃p���t���J�[�h�����̎�����";
		mes "1�������Ȃ��Ȃ�܂��B";
		mes "�����ς݂̃J�[�h��1�����̍ޗ��Ƃ���";
		mes "�g�p�ł��邩��ł��B";
		next;
		mes "[�����X�^�[������]";
		mes "�A�b�v�O���[�h�̍ۂ̒��ӓ_�ł����A";
		mes "�܂��A�ΏۂƂȂ�J�[�h���������ꂽ";
		mes "������g�ɕt���Ă��������B";
		mes "�܂��A����J�[�h��";
		mes "�A�b�v�O���[�h�̏ꍇ�͕K��^0000ff�E��^000000��";
		mes "��������悤�ɂ��Ă��������B";
		next;
		mes "[�����X�^�[������]";
		mes "^0000ff1�̑����ɓ����J�[�h������^000000";
		mes "^0000ff��������Ă���ꍇ�A^000000";
		mes "^0000ff�Ⴂ�X���b�g�ԍ��̃J�[�h������^000000";
		mes "^0000ff�A�b�v�O���[�h���s���܂��B^000000";
		mes "^0000ff�X���b�g�̍��̕��ɂ���J�[�h��^000000";
		mes "^0000ff�D��I�ɑΏۂɂȂ�A�Ƃ������Ƃł��B^000000";
		next;
		mes "[�����X�^�[������]";
		mes "�ǂ̃����X�^�[�̃J�[�h�ւ�";
		mes "�A�b�v�O���[�h������]�ł����H";
		next;
		switch(select("�p���t��A�X�P���g��","�p���t���X�P���g��","�p���t��S�X�P���g��","�p���t���A���_���C�X","��߂�")) {
		case 1:	// �p���t��A�X�P���g���J�[�h
			set '@pos,4;
			set '@gain,27037;
			setarray '@nameid,4094,6920;
			setarray '@amount,3,5;
			break;
		case 2:	// �p���t���X�P���g���J�[�h
			set '@pos,4;
			set '@gain,27036;
			setarray '@nameid,4025,6920;
			setarray '@amount,6,5;
			break;
		case 3:	// �p���t��S�X�P���g���J�[�h
			set '@pos,4;
			set '@gain,27038;
			setarray '@nameid,4086,6920;
			setarray '@amount,4,5;
			break;
		case 4:	// �p���t���A���_���C�X�J�[�h
			set '@pos,2;
			set '@gain,27039;
			setarray '@nameid,4601,6920;
			setarray '@amount,1,20;
			break;
		case 5:
			mes "[�����X�^�[������]";
			mes "�킩��܂����B";
			mes "�K�v�ɂȂ�����܂����Ă��������B";
			close;
		}
		mes "[�����X�^�[������]";
		mes "�����ɑ�������Ă���";
		mes "^ff0000" +getitemname('@nameid[0])+ "^000000��";
		mes "^0000ff" +getitemname('@gain)+ "^000000";
		mes "�ɃA�b�v�O���[�h����̂ł��ˁB";
		mes getitemname('@nameid[0])+ " " +'@amount[0]+ "��";
		mes getitemname('@nameid[1])+ " " +'@amount[1]+ "�� ���K�v�ł��B";
		next;
		if(select("������","�͂�") == 1) {
			mes "[�����X�^�[������]";
			mes "�킩��܂����B";
			mes "�K�v�ɂȂ�����܂����Ă��������B";
			close;
		}
		if(getequipisequiped('@pos)==0) {
			mes "[�����X�^�[������]";
			mes "�ނނ�";
			mes "�J�[�h�ɑΉ��������ʂ�";
			mes "������������Ă��Ȃ��悤�ł��B";
			mes "������x���m�F���������܂����H";
			close;
		}
		for(set '@i,0; '@i < 4; set '@i,'@i+1) {
			if(getequipcardid('@pos,'@i) == '@nameid[0])
				break;
		}
		if('@i == 4) {
			mes "[�����X�^�[������]";
			mes "�ނނ�";
			mes "���̑����ɂ�";
			mes "^0000ff���ƂȂ�J�[�h^000000��";
			mes "��������Ă��Ȃ��悤�ł��B";
			mes "������x���m�F���������܂����H";
			close;
		}
		// ������
		if(countitem('@nameid[0]) < '@amount[0] || countitem('@nameid[1]) < '@amount[1]) {
			mes "[�����X�^�[������]";
			mes "�ނނ�";
			mes "�ޗ�������Ȃ��悤�ł��ˁB";
			mes "������x���m�F���������܂����H";
			close;
		}
		delitem '@nameid[0],'@amount[0];
		delitem '@nameid[1],'@amount[1];
		setequipcardid '@pos,'@i,'@gain,0x2;
		misceffect 102,"";
		misceffect 107,"";
		misceffect 135,"";
		mes "[�����X�^�[������]";
		mes "�ӂ��A�����ɂł����悤�ł��B";
		mes "�厖�ɂ��Ă��������ˁB";
		close;
	case 3:
		mes "[�����X�^�[������]";
		mes "�ǂ̃p���t���J�[�h��";
		mes "�����ɂȂ�܂����H";
		while(1) {
			next;
			switch(select("�p���t��A�X�P���g���J�[�h","�p���t���X�P���g���J�[�h","�p���t��S�X�P���g���J�[�h","�p���t���A���_���C�X�J�[�h","��������")) {
			case 1:
				mes "[�p���t��A�X�P���g���J�[�h]";
				mes "�����������U����";
				mes "�^����_���[�W + 5%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "BaseLv��20�オ��x�ɒǉ���";
				mes "�����������U����";
				mes "�^����_���[�W + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�J�[�h^000000";
				mes "���� : ^777777����^000000";
				mes "�d�� : ^7777771^000000";
				continue;
			case 2:
				mes "[�p���t���X�P���g���J�[�h]";
				mes "Atk + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�����U���������A";
				mes "���m���œG��";
				mes "�X�^����Ԃɂ���";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "BaseLv��20�オ��x�ɒǉ���";
				mes "Atk + 3";
				mes "�G���X�^����Ԃɂ���";
				mes "�m�����㏸";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�J�[�h^000000";
				mes "���� : ^777777����^000000";
				mes "�d�� : ^7777771^000000";
				continue;
			case 3:
				mes "[�p���t��S�X�P���g���J�[�h]";
				mes "Cri + 5";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "BaseLv��20�オ��x�ɒǉ���";
				mes "Atk + 5 , Cri + 1";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�J�[�h^000000";
				mes "���� : ^777777����^000000";
				mes "�d�� : ^7777771^000000";
				continue;
			case 4:
				mes "[�p���t���A���_���C�X�J�[�h]";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 12%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "BaseLv��20�オ��x�ɒǉ���";
				mes "�����E���@�U����";
				mes "�^����_���[�W + 1%";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "2�b����HP - 666 , SP - 66";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�����������A";
				mes "HP - 6666 , SP - 666";
				mes "�\�\�\�\�\�\�\�\�\�\�\�\�\";
				mes "�n�� : ^777777�J�[�h^000000";
				mes "���� : ^777777�Z^000000";
				mes "�d�� : ^7777771^000000";
				continue;
			case 5:
				mes "[�����X�^�[������]";
				mes "�킩��܂����B";
				mes "�K�v�ɂȂ�����܂����Ă��������B";
				close;
			}
		}	// end while
	case 4:
		mes "[�����X�^�[������]";
		mes "�킩��܂����B";
		mes "�K�v�ɂȂ�����܂����Ă��������B";
		close;
	}
}

prt_cas.gat,27,24,3	script(CLOAKED)	�}�W�V�����E�j������#ep16_wiz02	735,{}

prt_cas.gat,27,27,3	script	�O���n��#ep16jp	86,{
	if(EP16_1QUE < 1) {
		mes "[�O���n��]";
		mes "�`���Ҋ��}����";
		mes "�e�X�ɋ���^0000ff�����}�g^000000�ɂ����";
		mes "�����ꂽ���ւ̃T�[�r�X��";
		mes "�s�������ł��B";
		next;
		mes "[�O���n��]";
		mes "���������N�̉����Ɠ�����";
		mes "�v�������p�Y�̕���";
		mes "�����}�g�ɐ\���o�Ă����������";
		mes "�j����^4d4dff�M�o�Ƃ��Ă�����^000000";
		mes "�������܂��B";
		close;
	}
	if(!(checkquest(73131) & 0x8)) {
		mes "[�O���n��]";
		mes strcharinfo(0)+ "�l�B";
		mes "���҂����Ă���܂����B";
		next;
		mes "[�O���n��]";
		mes "�`���Ҋ��}���ł�";
		mes "�����ł̐����ɕs�ւ��Ȃ��悤";
		mes "���̎��Â�q�ɂ̊Ǘ��Ȃǂ�";
		mes "�����b�������Ă��������܂��̂ŁA";
		mes "���Ȃ�Ƃ��\���t�����������B";
		close2;
		setquest 73131;
		compquest 73131;
		end;
	}
	mes "[�O���n��]";
	mes "�悤�������z�����������܂����A";
	mes strcharinfo(0)+ "�l�B";
	mes "�{���͂������������܂��傤�H";
	next;
	setarray '@menu$,"�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X -> 50zeny","���̎��� -> 5000zeny","�]���T�[�r�X -> ����","�J�[�g�T�[�r�X -> 800zeny","�I��";
	if(EP16_1QUE < 18)
		set '@menu$[3],"^888888�]���T�[�r�X -> ����^000000";
	set '@i,select(printarray('@menu$));
	switch('@i) {
	case 1:
		savepoint "prt_cas.gat",9,15;
		mes "[�O���n��]";
		mes "�ۑ�����܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		close;
	case 2:
		if(Zeny < 50) {
			mes "[�O���n��]";
			mes "����������܂���B";
			close;
		}
		mes "[�O���n��]";
		mes "�q�ɂ��J���܂��B";
		set Zeny,Zeny-50;
		openstorage;
		close;
	case 3:
		mes "[�O���n��]";
		mes "���̎��Âɂ�";
		mes "^0000ff5000 Zeny^000000������܂���";
		mes "��낵���ł����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�O���n��]";
			mes "�����p���肪�Ƃ��������܂����B";
			mes "�܂��̂��z����";
			mes "���҂����Ă���܂��B";
			close;
		}
		if(Zeny < 5000) {
			mes "[�O���n��]";
			mes "����������܂���B";
			close;
		}
		npcskillsupport 28,9999;
		percentheal 100,100;
		set Zeny,Zeny -5000;
		mes "[�O���n��]";
		mes "���̎��Â��������܂����B";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂��B";
		close;
	case 4:
		if(EP16_1QUE < 18) {
			mes "[�O���n��]";
			mes "�]���T�[�r�X�ɂ͋{��}�W�V������";
			mes "�Ăяo���������K�v�ł��B";
			mes "�������l�����܂�����";
			mes "�ēx�����������������B";
			close;
		}
		mes "[�O���n��]";
		mes "�{��}�W�V�����A�j�������l��";
		mes "���Ăт���̂ŁA";
		mes "���X���҂����������B";
		next;
		cloakoffnpc "�}�W�V�����E�j������#ep16_wiz02";
		mes "[�j������]";
		mes "�V�ˁI�@�{��}�W�V����";
		mes "�j�������Q��I";
		mes "���Ăяo�����肪�Ƃ��������܂��B";
		mes "����Ȃɂ����ɉ����������ł��ˁI";
		mes "�@";
		mes "�����A����ł͂ǂ��֍s���܂����H";
		next;
		setarray '@menu$,"���̒ʘH","[MD] �󒆗v��","[MD] �ߋ��̋V���̊�","�N�U���ꂽ�v�����e��","�N�U���ꂽ�v�����e��(���n)","�v�����e���n���č�","[�f�C���[] �^�}�����Ƃ��M","[�f�C���[] �A�O�l�X�̃h���X","��������";
		if(EP16_7QUE < 22)
			set '@menu$[6],"^888888[�f�C���[] �^�}�����Ƃ��M^000000";
		if(EP16_6QUE < 14)
			set '@menu$[7],"^888888[�f�C���[] �A�O�l�X�̃h���X^000000";
		set '@i,select(printarray('@menu$)) - 1;
		switch('@i) {
		case 0:
			set '@map$,"dali.gat";
			set '@x,109;
			set '@y,86;
			break;
		case 1:
			set '@map$,"prt_q.gat";
			set '@x,250;
			set '@y,67;
			break;
		case 2:
			set '@map$,"prt_lib_q.gat";
			set '@x,89;
			set '@y,80;
			break;
		case 3:
			set '@map$,"prt_q_jp.gat";
			set '@x,153;
			set '@y,324;
			break;
		case 4:
			set '@map$,"prt_q.gat";
			set '@x,156;
			set '@y,328;
			break;
		case 5:
			set '@map$,"prt_pri00.gat";
			set '@x,51;
			set '@y,120;
			break;
		case 6:
			if(EP16_7QUE < 22) {
				mes "[�j������]";
				mes "�̑�ȃ}�W�V�����̎��ł�";
				mes "^0000ff�˗����󂯂鎑�i���Ȃ�^000000���ɂ�";
				mes "�ē����Ă������܂���c�c�B";
				close2;
				cloakonnpc "�}�W�V�����E�j������#ep16_wiz02";
				end;
			}
			set '@map$,"prt_cas_q.gat";
			set '@x,302;
			set '@y,202;
			break;
		case 7:
			if(EP16_6QUE < 14) {
				mes "[�j������]";
				mes "�̑�ȃ}�W�V�����̎��ł�";
				mes "^0000ff�˗����󂯂鎑�i���Ȃ�^000000���ɂ�";
				mes "�ē����Ă������܂���c�c�B";
				close2;
				cloakonnpc "�}�W�V�����E�j������#ep16_wiz02";
				end;
			}
			set '@map$,"prt_cas_q.gat";
			set '@x,79;
			set '@y,189;
			break;
		default:
			mes "[�O���n��]";
			mes "�����p���肪�Ƃ��������܂����B";
			mes "�܂��̂��z����";
			mes "���҂����Ă���܂��B";
			close2;
			cloakonnpc "�}�W�V�����E�j������#ep16_wiz02";
			end;
		}
		mes "[�j������]";
		mes "���ꂶ��ڂ��҂��ā`";
		mes "�͂��I";
		close2;
		cloakonnpc "�}�W�V�����E�j������#ep16_wiz02";
		warp '@map$,'@x,'@y;
		end;
	case 5:
		mes "[�O���n��]";
		mes "���q�l�A��ϐ\���󂲂����܂��񂪁A";
		mes "�J�[�g�T�[�r�X�́A���l��";
		mes "���̏�ʐE�y�уX�[�p�[�m�[�r�X";
		mes "��p�̃T�[�r�X�ƂȂ��Ă���܂��B";
		close;
	case 6:
		mes "[�O���n��]";
		mes "�����p���肪�Ƃ��������܂����B";
		mes "�܂��̂��z����";
		mes "���҂����Ă���܂��B";
		close;
	}
}

prt_lib_q.gat,110,58,4	script	����#EP161DBOOK	844,{
	mes "�]���e�̔����ȏオ";
	mes "�@�����h��Ԃ��ꂽ����������]";
	next;
	if(select("�ǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q�ҁF������(���l�ԍ�: 243AD265)";
	mes "�@��L�̃����X�^�[�ɂ��";
	mes "�@^2EA4FF�����d�A";
	mes "�@���́A�\��^000000�����Ɋւ���";
	mes "�@�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo���A��Q�҂�";
	mes "�@�q���ی������邱�Ƃ������A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 267BD184)";
	mes "�@��L�̃����X�^�[�ɂ��";
	mes "�@^2EA4FF�������\^000000�����Ɋւ���";
	mes "�@�������������A";
	mes "�@�����N���Z�C�_�[�������ɂā]";
	next;
	mes "�]�p���f�B���������́A";
	mes "�@�N���Z�C�_�[���������Ăяo���A";
	mes "�@�q���ی������邱�Ƃ�";
	mes "�@������A��Q�҂�";
	mes "�@�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 265CM154)";
	mes "�@��L�����X�^�[�ɂ��";
	mes "�@^2EA4FF���\��^000000 ��Q�����Ɋւ��ā]";
	mes "�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo����";
	mes "�@�q���ی������邱�Ƃ�m�点����A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 243DV17)";
	mes "�@��L�����X�^�[�ɂ��";
	mes "�@^2EA4FF���R�ɑ΂����^000000�����Ɋւ���";
	mes "�@�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo����";
	mes "�@�q���ی������邱�Ƃ�m�点����A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 95EB72)";
	mes "�@��L�����X�^�[�ɂ��";
	mes "�@^2EA4FF�함�j���A�X�N�U^000000�����Ɋւ���";
	mes "�@�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo����";
	mes "�@�q���ی������邱�Ƃ�m�点����A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 117FM188)";
	mes "�@��L�����X�^�[�ɂ��";
	mes "�@^2EA4FF�q�X�e���[����^000000�����Ɋւ���";
	mes "�@�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo����";
	mes "�@�q���ی������邱�Ƃ�m�点����A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 103GD214)";
	mes "�@��L�����X�^�[�ɂ��";
	mes "�@^2EA4FF�함�j���A�X�N�U^000000�����Ɋւ���";
	mes "�@�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo����";
	mes "�@�q���ی������邱�Ƃ�m�点����A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]��Q�ҋ��q����";
	mes "�@���Q��: ������";
	mes "�@(���l�ԍ�: 55HK115)";
	mes "�@��L�����X�^�[�ɂ��";
	mes "�@^2EA4FF�o���U���A���\^000000�����Ɋւ���";
	mes "�@�������������]";
	next;
	mes "�]�����N���Z�C�_�[�������ɂ�";
	mes "�@�p���f�B���������́A";
	mes "�@�N���Z�C�_�[��������";
	mes "�@�Ăяo����";
	mes "�@�q���ی���m�点����A";
	mes "�@��Q�҂�R�₵�����A";
	mes "�@���L�̂悤�ɒq�����]";
	next;
	mes "�]����̌��t�ȊO��";
	mes "�@���ׂč����h���Ă���";
	mes "�@�ǂނ��Ƃ��o���Ȃ��]";
	next;
	if(select("�����ēǂ�","�ǂ܂Ȃ�")==2) {
		mes "�]�ǂނ̂���߂��]";
		close;
	}
	mes "�]����ȏ�͂Ȃ��]";
	close;
}

prt_lib_q.gat,88,54,0	script	#effect1	139,4,4,{
OnTouch:
	if(EP16_1QUE < 20) {
		misceffect 522,"";
		soundeffect "rsx_0806_die.wav",0,0;
		unittalk getcharid(3),strcharinfo(0)+" : ������I",1;
	}
	end;
}

prt_lib_q.gat,88,74,0	script	#effect2	139,4,4,{
OnTouch:
	if(EP16_1QUE < 20) {
		misceffect 522,"";
		soundeffect "rsx_0806_die.wav",0,0;
		unittalk getcharid(3),strcharinfo(0)+" : �h��Ă���!!",1;
	}
	end;
}

prt_lib_q.gat,91,85,3	script	�}�W�V�����E�j������#ep16_lib_q	735,{
	switch(EP16_1QUE) {
	case 19:
		mes "[�j������]";
		mes "�����͏o���܂������H";
		mes "�������o������";
		mes "�h����ԂɐG��Ă��������ˁB";
		close;
	case 20:
		mes "[�j������]";
		mes "��Ȃ��Ƃ���ł����ˁI";
		mes "�q���q�����܂�����I";
		mes "���~���̐S���͂����炪";
		mes "����ł����悤�ł��ˁB";
		mes "�Ƃ���ł�����";
		mes "�N��������ł����H";
		next;
		menu "������v�����e�����P������Ă���炵��!!",-;
		mes "[�j������]";
		mes "�v�����e�����P���H";
		mes "����Ȕn���ȁB";
		mes "����ȗ��j��";
		mes "���������Ƃ�����܂����`�B";
		next;
		menu "�󒆗v�ǁA�A���f�b�h�R�c��!!",-;
		mes "[�j������]";
		mes "�󒆗v�ǁA�A���f�b�h�R�c�c�c�H";
		mes "�܂��܂�����Ȃ��Ƃ��B";
		mes "�c�c";
		next;
		mes "[�j������]";
		mes "�ł��A�܂��Ă��������B";
		mes "���~���̐S����_���Ă����̂�";
		mes "�܂��ɃA���f�b�h�R�c�B";
		mes "�܂����A�{���Ɂc!?";
		mes "�@";
		mes "�]�j�������̊炪���߂�]";
		next;
		mes "�]�ߋ��̃v�����e����";
		mes "�@�P�����󂯂Ă���!!�]";
		musiceffect "166";
		next;
		menu "�s���Ă݂悤!!",-;
		mes "[�j������]";
		mes "����ς�I";
		mes "���������Ǝv���Ă܂����I";
		mes "�����s���܂��傤�I";
		mes "�쐼�̕��p����O�ɏo����͂��ł��B";
		delquest 7701;
		setquest 7702;
		set EP16_1QUE,21;
		close;
	case 21:
	case 22:
	case 23:
		mes "[�j������]";
		mes "�����O�ɏo�Ă݂܂��傤�I";
		mes "�쐼�̕��p����O�ɏo����͂��ł��B";
		close;
	case 24:
		if(checkquest(7705) && checkquest(7705) & 0x4) {
			mes "[�j������]";
			mes "�͂��I�@�t���[�h���q�l����";
			mes "���a���肵����V�ł��I";
			mes "���d�������l�ł����I";
			next;
			if(checkitemblank() < 1) {
				mes "�]�ו�������ȏ㎝�Ă܂���";
				mes "�@�ו���1�ȏ�̋󂫂�";
				mes "�@����Ă��������]";
				close;
			}
			delquest 7705;
			getitem 6919,10;
			mes "[�j������]";
			mes "���������撣��߂�������";
			mes "����܂���B";
			mes "�{���ɑ�ςł����c�c�B";
			close;
		}
		mes "[�j������]";
		mes "�ӂӂӁA���͂��񂾂�";
		mes "�������D���ɂȂ�n�߂Ă��܂��B";
		mes "���ɉ������p�ł����H";
		next;
		if(select("�V���̕����Ɍq��","�A��")==2) {
			mes "[�j������]";
			mes "�肢�������܂��傤�I";
			close2;
			warp "prt_lib.gat",89,43;
			end;
		}
		if(checkquest(7706)) {
			if(checkquest(7706) & 0x2) {
				delquest 7706;
			} else {
				mes "[�j������]";
				mes "����͂�����Ɩ����ł��B";
				mes "����������V�˃}�W�V�����ƌ�����";
				mes "�����l�ԂȂ�Ō��E�c�c";
				next;
				mes "[�j������]";
				mes "���d�����̐ڑ��Ƃ����̂�";
				mes "�ƂĂ�������Ȃ̂ł��B";
				mes "�\���󂠂�܂���B";
				next;
				mes "[�j������]";
				mes "���ӂŖ\�����Ă��閂�͂�";
				mes "������x���肵����";
				mes "���̎�����č����グ�܂��ˁB";
				close;
			}
		}
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�j������]";
			mes "����H�@���Ȃ����̃p�[�e�B�[��";
			mes "���[�_�[����Ȃ��ł��ˁH";
			mes "�p�[�e�B�[���[�_�[��";
			mes "�����Ă��炦�܂����H";
			close;
		}
		mes "[�j������]";
		mes "���ꂶ��V���̕�����";
		mes "�������������N���Ă����̂�";
		mes "���ɍs���܂��傤�I";
		next;
		mes "[�j������]";
		mes "��x�˂���������Ԃ�";
		mes "�ēx�����I�Ɍq����̂�";
		mes "���͂�����ێ����鎖��";
		mes "�W�����Ȃ���΂����܂���I";
		next;
		mes "[�j������]";
		mes "���͈ꏏ�ɂ͂����܂���";
		mes "�K�������ċA���ė��ĉ������B";
		next;
		if(select("�������q���Ă��炤","�s���Ȃ�")==2) {
			mes "[�j������]";
			mes "�͂͂́c�c";
			mes "���܂�x��Ȃ��ł��������ˁB";
			close;
		}
		mes "[�j������]";
		mes "���̒n��ɍs����Q�[�g��";
		mes "����������܂����I";
		mes "�����A���ꂵ�ĉ������I";
		close2;
		mdcreate "ritual_room";
		end;
	}
}

prt_lib_q.gat,88,90,1	script	�h�����#evt_gate02	10042,{
	if(checkquest(7706)) {
		mes "[�j������]";
		mes "����͂�����Ɩ����ł��B";
		mes "����������V�˃}�W�V�����ƌ�����";
		mes "�����l�ԂȂ�Ō��E�c�c";
		next;
		mes "[�j������]";
		mes "���d�����̐ڑ��Ƃ����̂�";
		mes "�ƂĂ�������Ȃ̂ł��B";
		mes "�\���󂠂�܂���B";
		next;
		mes "[�j������]";
		mes "���ӂŖ\�����Ă��閂�͂�";
		mes "������x���肵����";
		mes "���̎�����č����グ�܂��ˁB";
		close;
	}
	if(EP16_1QUE == 19) {
		mes "�]�ߋ��̃��~���̐S��������";
		mes "�@�p���̋V���̏ꏊ�ֈړ����\�ł��]";
		next;
		if(select("����","��߂�")==2) {
			mes "�]���͂�߂Ă������]";
			close;
		}
		mes "�]��ɐi�񂾁]";
		close2;
		warp "mir_q.gat",101,10;
		end;
	}
	if(EP16_1QUE >= 24) {
		mes "�]���ă��~���̐S����������";
		mes "�@�ߋ��̋V���̊Ԃֈړ����\�ł��]";
		next;
		if(select("����","��߂�")==2) {
			mes "[�j������]";
			mes "����͂�����Ԃ�������";
			mes "�����I�Ɍq�������̂ɂ����܂���B";
			mes "����������V�˃}�W�V����������";
			mes "�\�Ȃ��ƂȂ�ł���I";
			close;
		}
		if(getonlinepartymember() < 1) {
			mes "�]^4d4dff���̃C�x���g��";
			mes "�@�������A���_���W�����Ői�s���܂��B";
			mes "�@�p�[�e�B�[������������A";
			mes "�@������x�����ĉ������]^000000";
			close;
		}
		switch(mdenter("ritual_room")) {
		case 0:	// �G���[�Ȃ�
			announce "�������A���_���W����[ritual_room] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99;
			setquest 7705;
			setquest 7706;
			donpcevent getmdnpcname("Mir_Contorl")+"::OnStart";
			close;
		case 1:	// �p�[�e�B�[������
			mes "�]�������A���_���W������";
			mes "�@���������p�[�e�B�[�̃����o�[�̂݁A";
			mes "�@�������A���_���W�����ɓ���܂��]";
			close;
		case 2:	// �_���W�������쐬
			mes "[�j������]";
			mes "����ς苭���I�Ɍq���̂�";
			mes "�����Ȃ̂��ȁH";
			mes "�����҂��ĉ������B";
			close;
		default:	// ���̑��G���[
			close;
		}
	}
	mes "�]��Ԃ��h�炢�ł���]";
	close;
}

mir_q.gat,101,90,3	script	�r�W���E#01	10143,{
	if(EP16_1QUE == 19) {
		cutin "bijou_01.bmp",2;
		mes "[�r�W���E]";
		mes "�l�Ԃ��c�c";
		mes "���E�𒣂�������";
		mes "�O����͓���Ȃ��͂������c�c";
		mes "�ǂ�����Ē��ɓ����Ă����H";
		mes "�M�l�����~���̐S�����ړI���H";
		next;
		mes "�]���܂������ӂ�������B";
		mes "�@�����āA���낵���قǂ�";
		mes "�@���͂�������c�c";
		next;
		menu "�N�H",-;
		mes "[�r�W���E]";
		mes "���B";
		mes "�����N���ƁH";
		mes "^ff0000�v�����e�����A���f�b�h�R�c��";
		mes "^ff0000���W�A�j��^000000����Ă����";
		mes "���Ă��Ȃ������̂��H";
		next;
		menu "�v�����e�����A���f�b�h�R�c�ɏP��!?",-;
		mes "[�r�W���E]";
		mes "�������炩���Ă���̂��H";
		mes "�C�t���Ȃ��킯���Ȃ����낤�B";
		mes "��ɕ����Ԉ̑��";
		mes "^0000ff�󒆗v��^000000�ɁB";
		mes "^0000ff�󒆗v�ǂɂ����";
		mes "^0000ff�v�����e���͂��܂��ŖڑO���B^000000";
		next;
		menu "�󒆗v��!?",-;
		mes "[�r�W���E]";
		mes "�c�c";
		mes "���O�͉����Ⴄ�ȁB";
		mes "���̐��E�̐l�ԂƈႤ�悤���B";
		next;
		mes "[�r�W���E]";
		mes "�c�c";
		mes "���~���̐S������ɓ���Ă���";
		mes "���O���E�����Ǝv�������ǁA";
		mes "�C���ς�����B";
		next;
		mes "�]�r�W���E����";
		mes "�@���܂����E�ӂ��������]";
		next;
		mes "[�r�W���E]";
		mes "���A���O���E���B";
		next;
		mes "[�r�W���E]";
		mes "�q�������Y�l�̏j�����󂯂�";
		mes "�s���̌R�c��I";
		mes "���A���̖`���҂�H�炦!!";
		next;
		menu "�키�I",-,"�����悤�I",-;
		mes "[�j������]";
		mes "������!!";
		next;
		mes "[�j������]";
		mes "����͂�΂��ł�!!";
		mes "�����܂��傤!!";
		mes "�P�ނ��܂��傤!!";
		mes "�l�ɘb�������Ă�������!!";
		cutin "bijou_01.bmp",255;
		cloakoffnpc "�}�W�V�����E�j������#01";
		close;
	}
}

mir_q.gat,105,80,3	script(CLOAKED)	�}�W�V�����E�j������#01	735,{
	if(EP16_1QUE == 19) {
		mes "[�j������]";
		mes "����ȏケ���ɗ��܂�̂͊댯�ł��I";
		mes "�{���ɎE����Ă��܂��܂���I";
		next;
		mes "[�j������]";
		mes "�E�o���܂��傤�I";
		close2;
		set EP16_1QUE,20;
		setquest 7701;
		delquest 7700;
		warp "prt_lib_q.gat",88,83;
		end;
	}
	cloakonnpc;
	end;
}
mir_q.gat,92,96,3	script	�p���t���X�P���g��#01	3446,{}
mir_q.gat,91,91,3	script	�p���t���X�P���g��#02	3446,{}
mir_q.gat,96,85,3	script	�p���t���X�P���g��#03	3446,{}
mir_q.gat,101,82,3	script	�p���t���X�P���g��#04	3446,{}
mir_q.gat,111,96,3	script	�p���t���X�P���g��#05	3446,{}
mir_q.gat,112,91,3	script	�p���t���X�P���g��#06	3446,{}
mir_q.gat,107,85,3	script	�p���t���X�P���g��#07	3446,{}

prt_q.gat,157,334,3	script	�j������#ep16_pprt01	735,{
	if(EP16_1QUE == 21) {
		mes "[�j������]";
		mes "������A";
		mes "�{���Ƀv�����e�����P������Ă���!!";
		mes "�ȁA�쐼�̕��ɁA";
		mes "�v�ǂ��U�߂Ă��Ă܂�!!";
		next;
		mes "[�j������]";
		mes "�ǂ����܂����H";
		mes "���̂܂ܒ������܂����H";
		mes "�����Ɛ퓬�ɂȂ�܂���B";
		mes "����Ƃ��A�߂��ĕ񍐂��܂����H";
		next;
		menu "��������߂��H",-;
		mes "[�j������]";
		mes "�͂��A�C���Ă��������I";
		mes "���Ԉړ��͓��ӂł��B";
		mes "�G�N���[�W���ɗ��w��������ł��B";
		next;
		mes "[�j������]";
		mes "����ƔL�̎�E�������";
		mes "�����邱�Ƃ��K���܂����B";
		mes "���Ȃ��Ă������̋��ԂɊւ���";
		mes "�l�Ԃ̒��ł͈�ԏڂ�����";
		mes "�������Ă��܂��I";
		next;
		mes "[�j������]";
		mes "�����̋��ԏ�ɂ���ꏊ�Ȃ�";
		mes "���̏ꏊ�ɖ߂邭�炢�͊ȒP�ł��B";
		next;
		mes "[�j������]";
		mes "�������͂��̎��Ԃɑ����Ă���";
		mes "���݂ł͂Ȃ��ł�����A";
		mes "�����ė�����͏o�čs������";
		mes "�S���{�ȒP�ł��B";
		next;
		mes "[�j������]";
		mes "����łǂ����܂��H";
		next;
		menu "�󋵐������I",-;
		mes "[�j������]";
		mes "�킩��܂����B";
		mes "�������̏󋵂�";
		mes "������Ɛ������܂��傤�B";
		next;
		mes "[�j������]";
		mes "�V���̊Ԃɂ��������́A";
		mes "^4d4dff�v�����e�����P�������A���f�b�h�R�c^000000��";
		mes "�ꖡ��^4d4dff�D�� ^000000���ꂽ�B";
		mes "�����Ă��܂����H";
		next;
		menu "�����Ă���",-;
		mes "[�j������]";
		mes "���������낵�������̂悤�ł��B";
		mes "�ِ��E�ł�����ȉЁX����";
		mes "���͂����҂͌������Ƃ�";
		mes "�Ȃ������ł��I";
		next;
		mes "[�j������]";
		mes "���������΁A";
		mes "�q�������Y�l�Ƃ������Ă܂����ˁI";
		mes "�ޏ��̖��O�͒m���Ă��܂��I";
		next;
		mes "[�j������]";
		mes "�������A�͂邩�́A";
		mes "�O���X�g�w�C������P����";
		mes "�p�Ђɂ����Ƃ���";
		mes "�Â�12���@���L���[�̈�l�ł��I";
		next;
		mes "[�j������]";
		mes "���������������I";
		mes "�������������܂���I";
		next;
		mes "[�j������]";
		mes "����ɂ�����";
		mes "�v�����e��������ȑ�P����";
		mes "�󂯂��̂ɗ��j��";
		mes "�c����Ă��Ȃ��Ȃ�āB";
		next;
		menu "�Ӑ}�I�ɉB���ꂽ�悤��",-;
		mes "[�j������]";
		mes "�����ł��ˁB";
		mes "��󂪓��܂ꂽ�̂��B�����߁H";
		mes "����Ƃ����̗��R�H";
		mes "�z������ł��܂���B";
		next;
		mes "[�j������]";
		mes "�c�c�u^4d4dff�^����m���^000000�v�B";
		mes "���Ƃ̋L���̊ԂŌ���";
		mes "�����̕��󂳂ꂽ�����ɂ������c�c";
		next;
		menu "�u�^����m��ҁv���ǂ������́H",-;
		mes "[�j������]";
		mes "���󂳂ꂽ���j��m��ҁA";
		mes "���ꂱ�����u�^����m��ҁv�B";
		mes "�����";
		mes strcharinfo(0)+"�l";
		mes "�ł���I";
		next;
		mes "[�j������]";
		mes "���͎�鎖���D������";
		mes "�o���Ȃ���������";
		mes "���Ȃ��Ƃ��^����m�邱�Ƃ�";
		mes "�ł��܂����B";
		next;
		mes "[�j������]";
		mes "���ꂩ�牤�ƂƉߋ��̔閧����������A";
		mes "�����Ă����p�Y����";
		mes "���܂��Ă������ƂɂȂ�ł��傤�B";
		next;
		mes "[�j������]";
		mes "�ӂӂӁc�c";
		mes "���̒��S�ɂ�";
		mes strcharinfo(0)+"�l��";
		mes "�����ɂȂ�܂���B";
		setquest 7703;
		delquest 7702;
		set EP16_1QUE,22;
		next;
		mes "[�j������]";
		mes "���ꂩ��ǂ����܂��H";
		mes "���̎��Ԃɖ߂�܂����H";
		mes "����Ƃ��A�����𒲍����܂����H";
		next;
		if(select("�߂�","��������")==2) {
			mes "[�j������]";
			mes "�킩��܂����B";
			mes "�߂肽���Ȃ�����";
			mes "�b�������Ă��������B";
			close;
		}
		mes "[�j������]";
		mes "����ł͖߂�܂��傤���B";
		mes "�������̔C����";
		mes "�����ň�i���ł��ˁI";
		next;
		mes "[�j������]";
		mes "�ł͍s���܂��傤�B";
		mes "���X�������̎��Ԃł��Ȃ��ꏊ��";
		mes "�������Ă��ǂ����Ȃ�";
		mes "�ЂƂ�����܂���B";
		next;
		mes "[�j������]";
		mes "����ł͍s���܂���B";
		mes "�R�c�c";
		if(!sleep2(2000)) end;
		mes "�Q�c�c";
		if(!sleep2(1000)) end;
		mes "�P�I";
		close2;
		warp "prt_lib.gat",88,80;
		end;
	}
	mes "[�j������]";
	mes "�͂͂́I";
	mes "�����͂����Ă��{����";
	mes "�c�c���ł��ˁB";
	next;
	if(select("���̎���ɖ߂낤","������ė���")==2) {
		mes "[�j������]";
		mes "�����Ă�����Ⴂ�I";
		close;
	}
	mes "[�j������]";
	mes "�������܂��傤�I";
	next;
	mes "[�j������]";
	mes "����ł͍s���܂���B";
	close2;
	warp "prt_lib.gat",89,43;
	end;
}

//============================================================
// �N�����ꂽ�v�����e��NPC
//------------------------------------------------------------
prt_q.gat,156,324,6	script	�x�������V���s�[�Q��#01	10134,{
	if(!(checkquest(5448) & 0x8)) {
		mes "[�x�������V���s�[�Q��]";
		mes "�����I";
		mes "�Ԋu���J���Ă��邼�I";
		mes "�����Ɛ��񂷂�񂾁I";
		next;
		mes "[�x�������V���s�[�Q��]";
		mes "�����������̂͌���ɂ�����I";
		mes "�y���̎҂͎��Â��I��莟��";
		mes "������֖߂�񂾁I";
		next;
		mes "[�x�������V���s�[�Q��]";
		mes "����H";
		mes "�`���҂��Ȃ�����ȂƂ���ɁH";
		mes "�댯�����瑁�������̒���";
		mes "����Ȃ����I";
		next;
		menu "�b�𕷂�",-;
		mes "[�x�������V���s�[�Q��]";
		mes "���A�X�̓A���f�b�h��";
		mes "�N�U���󂯂Ă��܂��B";
		mes "�z��͊X�̓쓌�ɒ�������";
		mes "����ȗv�ǂ̒�����";
		mes "���X�Ɖ����񂹂Ă���̂ł��B";
		next;
		mes "[�x�������V���s�[�Q��]";
		mes "��X�͊X�����Ȃ���";
		mes "����������A���f�b�h��";
		mes "���ƂȂ�v�Ǔ��ɂ�";
		mes "����h�����Ă��܂����c�c";
		mes "���̂Ƃ���z��̐�����";
		mes "������l�q�͂���܂���B";
		next;
		menu "���͂�\���o��",-;
		if(BaseLevel < 100) {
			mes "[�x�������V���s�[�Q��]";
			mes "�\���o�͂��肪�����̂ł����A";
			mes "�G�̗͂͋��͂ł��B";
			mes "���Ȃ��Ƃ�";
			mes "^ff0000BaseLv100�ȏ�^000000�łȂ���";
			mes "�����ł��ł��Ȃ��ł��傤�B";
			close;
		}
		mes "[�x�������V���s�[�Q��]";
		mes "�����ł����B";
		mes "���͏����ł������̐�͂��ق����B";
		mes "����Ƃ��M���̐\���o��";
		mes "�󂯂����Ă��炢�܂��傤�B";
		mes "�M���̗E�C�Ɋ��ӂ��܂��B";
		setquest 5448;
		compquest 5448;
	} else {
		mes "[�x�������V���s�[�Q��]";
		mes "�悭���Ă���܂����B";
		mes "�z��͈ˑR�Ƃ���";
		mes "�X���Ɉ��Ԃ��Ă��܂��B";
	}
	next;
	switch(select("�X�̃A���f�b�h��r�ł���","����v�ǂɏ�荞��","���������Ȃ���")) {
	case 1:
		mes "[�x�������V���s�[�Q��]";
		mes "�ł͋M���͊X��p�j����";
		mes "�A���f�b�h�̟r�ł�";
		mes "�w�߂Ă��������B";
		mes "�`���҂̋M���͑g�D�I�Ȗh����";
		mes "�V���ɓO���������ǂ��ł��傤�B";
		next;
		if(select("�o������","���������Ȃ���")==2) {
			mes "[�x�������V���s�[�Q��]";
			mes "�z��͔��Ɋ댯�ł��B";
			mes "���S�̏����𐮂��Ă���";
			mes "����ł��������B";
			close;
		}
		mes "[�x�������V���s�[�Q��]";
		mes "���ꂮ����C�����āB";
		mes "�����c�邱�Ƃ�";
		mes "�ŗD��ɍl���Ă��������B";
		close2;
		warp "prt_q_jp.gat",153,324;
		end;
	case 2:
		mes "[�x�������V���s�[�Q��]";
		mes "�v�ǂ͊X�̓쓌�ɒ������Ă��܂��B";
		mes "�߂��ɑҋ@���Ă��镺�m��";
		mes "�v�ǂւ̐N���o�H��";
		mes "�ē����Ă����ł��傤�B";
		mes "����������A���f�b�h�̑匳��";
		mes "�@���Ă��������B";
		next;
		mes "[�x�������V���s�[�Q��]";
		mes "�悯��Ηv�Ǖt�߂܂�";
		mes "���m�ɑ��点�܂����A";
		mes "�ǂ����܂����H";
		next;
		if(select("�����Ă��炤","�����ŕ����čs��")==2) {
			mes "[�x�������V���s�[�Q��]";
			mes "�����ł����B";
			mes "�����̃A���f�b�h�ɂ�";
			mes "���ӂ��Ă��������B";
			viewpoint 1,259,57,1,0xFF0000;
			close;
		}
		mes "[�x�������V���s�[�Q��]";
		mes "���ꂮ����C�����āB";
		mes "�����c�邱�Ƃ�";
		mes "�ŗD��ɍl���Ă��������B";
		close2;
		warp "prt_q.gat",249,64;
		end;
	case 3:
		mes "[�x�������V���s�[�Q��]";
		mes "�z��͔��Ɋ댯�ł��B";
		mes "���S�̏����𐮂��Ă���";
		mes "����ł��������B";
		close;
	}
}

prt_q.gat,165,326,6	script	���m#EP162PS01	105,{
	emotion 6;
	mes "[���m]";
	mes "�������c�c�A���f�b�h�ǂ��߁I";
	close;
}

prt_q.gat,167,324,6	script	���m#EP162PS02	105,{
	emotion 28;
	mes "[���m]";
	mes "�����܂ňꏏ�ɐ���Ă����Ԃ��c�c�I";
	mes "�������c�c";
	close;
}

prt_q.gat,165,322,6	script	���m#EP162PS03	105,{
	mes "[���m]";
	mes "���肢�ł�����";
	mes "�����͂��Ȃ��ł��������B";
	close;
}

prt_q.gat,167,320,6	script	���m#EP162PS04	105,{
	emotion 53;
	mes "[���m]";
	mes "�����ė�������";
	mes "��̂Ȃ񂾂����̂ł��傤�H";
	mes "�A���f�b�h��";
	mes "�֌W������̂ł��傤���H";
	close;
}

prt_q.gat,165,318,6	script	���m#EP162PS05	105,{
	emotion 36;
	mes "[���m]";
	mes "�����͎��炵�܂��I";
	close;
}

prt_q.gat,146,326,2	script	���m#EP162PS06	105,{
	emotion 57;
	mes "[���m]";
	mes "�|���Ă��|���Ă�";
	mes "���肪�����Ȃ�āc�c�B";
	close;
}

prt_q.gat,144,324,2	script	���m#EP162PS07	105,{
	mes "[���m]";
	mes "�s���̕��͋����ł��ˁB";
	mes "�C�����Ă��������B";
	close;
}

prt_q.gat,146,322,2	script	���m#EP162PS08	105,{
	emotion 19;
	mes "[���m]";
	mes "�����A�A���f�b�h�ǂ��߁c�c�I";
	close;
}

prt_q.gat,144,320,2	script	���m#EP162PS09	105,{
	mes "[���m]";
	mes "�ςȉȊw�҂�";
	mes "�󂩂痎���ė������̂�";
	mes "�������邽�߂�";
	mes "���m�����Ă��܂������A";
	mes "���������Ȃ��ł��ˁc�c�B";
	close;
}

prt_q.gat,146,318,2	script	���m#EP162PS10	105,{
	mes "[���m]";
	mes "���m�͑��v�ł��傤���B";
	mes "�ϐl�Ȃ�����";
	mes "�N���~�߂��܂���ł������B";
	close;
}

prt_q.gat,149,316,4	script	���m#EP162PS11	105,{
	emotion 11;
	mes "[���m]";
	mes "�v�����e���͉�X�����܂��I";
	close;
}

prt_q.gat,151,314,4	script	���m#EP162PS12	105,{
	emotion 54;
	mes "[���m]";
	mes "�Ƒ����������S�z�ł��B";
	close;
}

prt_q.gat,153,316,4	script	���m#EP162PS13	105,{
	emotion 55;
	mes "[���m]";
	mes "�ǂ���炱���ɂ�";
	mes "�A���f�b�h�����܂藈�ĂȂ��悤�ł��B";
	close;
}

prt_q.gat,158,316,4	script	���m#EP162PS14	105,{
	mes "[���m]";
	mes "���̒��Ԃ����m�ɂ��Ă����܂����B";
	mes "�S�z�ł��B";
	mes "���������ĂȂ��Ⴂ���̂ł����c�c�B";
	close;
}

prt_q.gat,160,314,4	script	���m#EP162PS15	105,{
	emotion 54;
	mes "[���m]";
	mes "��͂͂́I";
	mes "�{���Ȃ獡�������f�[�g�������̂ɁI";
	mes "�͂͂͂́I";
	close;
}

prt_q.gat,162,316,4	script	���m#EP162PS16	105,{
	emotion 19;
	mes "[���m]";
	mes "���������I�@�S���������ė����I";
	close;
}

prt_q.gat,160,327,5	script	������#EP161PS17	105,{
	emotion 36;
	mes "[���m]";
	mes "�����c�c�܂��킦��I";
	close;
}

prt_q.gat,159,328,6	script	�q����#EP162PS18	641,{
	misceffect 320,"������#EP161PS17";
	mes "[���m]";
	mes "�܂����Â��I����Ă܂���I";
	close;
}

-	script	���S�����Z��#base	-1,{
	mes "�]���ɑ��₦�Ă���]";
	close;
OnTouch:
	set '@dummy,getmapxy('@map$,'@x,'@y,1);
	if(strnpcinfo(2) == "EP161DIE06")
		set '@message$,"�J�G���c�c�^�C�c�c";
	else if(strnpcinfo(2) == "EP161DIE07")
		set '@message$,"�q�������Y�c�c�^���j�c�c";
	else if(strnpcinfo(2) == "EP161DIE08")
		set '@message$,"�j�N�C�c�c�j�N�C�c�c";
	else if(strnpcinfo(2) == "EP161DIE09")
		set '@message$,"�O�H�H�H�I";
	else if(strnpcinfo(2) == "EP161DIE10")
		set '@message$,"�f�[�g���c�c�f�L�Y�j�c�c";
	else if(strnpcinfo(2) == "EP161DIE11")
		set '@message$,"�J�G���^�C�c�c";
	else if(strnpcinfo(2) == "EP161DIE12")
		set '@message$,"�_�C�W���E�u�_�c�c";
	else if(strnpcinfo(2) == "EP161DIE13")
		set '@message$,"���E�X�O�c�c���X���K�c�c";
	else if(strnpcinfo(2) == "EP161DIE14")
		set '@message$,"���^�V�m�C�k�K�c�c";
	else if(strnpcinfo(2) == "EP161DIE15")
		set '@message$,"�T�C�S�j�c�c�^�x�^�J�b�^�c�c";
	else if(strnpcinfo(2) == "EP161DIE16")
		set '@message$,"�R�E�E���m�I�}�����K�c�c";
	else if(strnpcinfo(2) == "EP161DIE17")
		set '@message$,"�n�n�n�n�n�n�c�c";
	else if(strnpcinfo(2) == "EP161DIE18")
		set '@message$,"�j���Q�c�c�H�C�V�c�c�H";
	else if(strnpcinfo(2) == "EP161DIE19")
		set '@message$,"�^�c�c�^�X�P�e�c�c";
	else if(strnpcinfo(2) == "EP161DIE20")
		set '@message$,"�c�J���^�c�c";
	else
		set '@message$,"�O�I�H�H�H�c�c";
	unittalk "���S�����Z�� : "+ '@message$,1;
	unittalk getcharid(3),strcharinfo(0)+" : ?",1;
	if(!sleep2(1000)) end;
	initnpctimer;
	misceffect 772;
	monster '@map$,'@x,'@y,"�]���r",1015,1;
	monster '@map$,'@x,'@y,"�A�N���E�X",1194,1;
	monster '@map$,'@x,'@y,"�n���^�[�t���C",1035,1;
	hideonnpc;
	end;
OnTimer300000:
	hideoffnpc;
	end;
}

prt_q.gat,213,90,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE01	457,2,2
prt_q.gat,214,85,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE02	887,2,2
prt_q.gat,222,87,8	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE03	849,2,2
prt_q.gat,149,188,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE04	887,2,2
prt_q.gat,188,207,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE05	849,2,2
prt_q.gat,109,94,8	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE06	457,2,2
prt_q.gat,88,279,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE07	887,2,2
prt_q.gat,89,207,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE08	849,2,2
prt_q.gat,265,300,8	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE09	457,2,2
prt_q.gat,88,350,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE10	887,2,2
prt_q.gat,156,275,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE11	457,2,2
prt_q.gat,104,114,8	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE12	849,2,2
prt_q.gat,108,318,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE13	887,2,2
prt_q.gat,238,129,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE14	849,2,2
prt_q.gat,200,139,8	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE15	849,2,2
prt_q.gat,74,227,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE16	457,2,2
prt_q.gat,220,350,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE17	849,2,2
prt_q.gat,45,146,8	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE18	849,2,2
prt_q.gat,227,219,2	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE19	457,2,2
prt_q.gat,146,252,6	duplicate(���S�����Z��#base)	���S�����Z��#EP161DIE20	887,2,2

prt_q.gat,47,339,5	script	���m#EP161ETC01	105,{
	emotion 19;
	mes "[���m]";
	mes "������";
	mes "�v�����e����2���̋R�m�c�ł��B";
	close;
}

prt_q.gat,52,344,5	script	���m#EP161ETC02	105,{
	emotion 19;
	mes "[���m]";
	mes "������";
	mes "�v�����e����2���̋R�m�c�ł��B";
	close;
}

prt_q.gat,249,74,2	script	�v�����e�����m#a2	105,{
	mes "[���m]";
	mes "�����X�^�[�̐N�U�͈ꎞ�I��";
	mes "���É����Ă���悤�ł��B";
	next;
	mes "[���m]";
	mes "���̉Ƒ��A���̗F�B�c�c�B";
	mes "�ނ��T�Ŏ�肽�����ǁA";
	mes "����������Əd�v�Ȏ���";
	mes "�����ɂ͂���܂��B";
	next;
	mes "[���m]";
	mes "�|���Ă��|���Ă��A";
	mes "�����X�^�[�̐i�R�͎~�܂�Ȃ��B";
	mes "�v�ǂƂ��������𕕂��Ȃ��Ắc�c�B";
	close;

}

prt_q.gat,252,73,4	script	�v�����e�����m#a3	105,{
	mes "[���m]";
	mes "����������l�݂͂�ȁc�c";
	mes "�c�c������Ɂc�c!!";
	next;
	mes "�]���m�͂���������";
	mes "�@�ق��Ă��܂����]";
	close;
}

prt_q.gat,235,63,2	script	�v�����e�����m#a4	105,5,5,{
	end;
OnTouchNPC:
	unittalk "���m : �����͒ʂ���I";
	misceffect 438;
	warp "prt_q.gat",-1,-1;
	end;
}

prt_q.gat,236,81,1	script	�v�����e�����m#a5	105,10,10,{
	end;
OnTouchNPC:
	unittalk "���m : �A���f�b�h�߁I";
	misceffect 438;
	warp "prt_q.gat",-1,-1;
	end;
}

prt_q.gat,267,82,8	script	�v�����e�����m#a6	105,5,5,{
	end;
OnTouchNPC:
	unittalk "���m : ���炦�I";
	misceffect 438;
	warp "prt_q.gat",-1,-1;
	end;
}

prt_q.gat,256,71,0	script	�v�����e�����m#ep16jp	105,{
	mes "[�v�����e�����m]";
	mes "�����͂��肪�Ƃ��������܂��B";
	mes "�@";
	mes "�V���s�[�Q��������";
	mes "���܂Ŗ߂��܂����H";
	next;
	if(select("�����Ă��炤","��߂�")==2) {
		mes "[�v�����e�����m]";
		mes "�����ł����B";
		mes "��������܂�����";
		mes "���������|�����������B";
		close;
	}
	mes "[�v�����e�����m]";
	mes "���m�������܂����B";
	mes "�V���s�[�Q�������̌���";
	mes "���ē��������܂��B";
	close2;
	warp "prt_q.gat",156,328;
	end;
}

prt_q.gat,249,71,4	script	�Ȋw�҃T�E�X#a1	573,{
	mes "[�Ȋw�҃T�E�X]";
	mes "���̓v�����e���Ŏq��������";
	mes "�Ȋw�������Ă���҂��B";
	mes "�l�I�Ȍ��������Ă���B";
	next;
	mes "[�Ȋw�҃T�E�X]";
	mes "���X���}�ɕ�炵�Ă������c�c";
	mes "�܂����v�����e��������Ȏ��Ԃ�";
	mes "�ׂ��������Ƃ́c�c�B";
	close;
}

prt_q_jp.gat,156,324,6	script	�x�������V���s�[�Q��#02	10134,{
	mes "[�x�������V���s�[�Q��]";
	mes "�����A�����ł������B";
	mes "�����x�݂܂����H";
	next;
	if(select("�����x��","�܂�������")==2) {
		mes "[�x�������V���s�[�Q��]";
		mes "�����ł����B";
		mes "���ꂮ���������";
		mes "���Ȃ��ł��������B";
		close;
	}
	mes "[�x�������V���s�[�Q��]";
	mes "�킩��܂����B";
	mes "�ł͂�����ցB";
	close2;
	warp "prt_q.gat",156,328;
	end;
}

//============================================================
// �v�����e���n���č�NPC
//------------------------------------------------------------
prt_prison.gat,159,206,0	script	jump_A1		45,1,1,{
OnTouch:
	if(readparam(0) > 200)
		showmessage "�ړ����x���グ�Ȃ���΁A��щz����ꂻ���ɂȂ��B","";
	else
		warp "prt_prison.gat",159,195;
	end;
}

prt_prison.gat,159,198,0	script	jump_A2		45,1,1,{
OnTouch:
	if(readparam(0) > 200)
		showmessage "�ړ����x���グ�Ȃ���΁A��щz����ꂻ���ɂȂ��B","";
	else
		warp "prt_prison.gat",159,208;
	end;
}

prt_prison.gat,87,254,0		warp	secret_A1		1,1,prt_prison.gat,88,207
prt_prison.gat,85,202,0		script	jump_A_02		45,1,1,{
OnTouch:
	if(readparam(0) > 200)
		showmessage "�ړ����x���グ�Ȃ���΁A��щz����ꂻ���ɂȂ��B","";
	else
		warp "prt_prison.gat",90,254;
	end;
}

prt_prison.gat,115,78,0		script	jump_B2	45,1,1,{
OnTouch:
	if(readparam(0) > 200)
		showmessage "�ړ����x���グ�Ȃ���΁A��щz����ꂻ���ɂȂ��B","";
	else
		warp "prt_prison.gat",115,87;
	end;
}

prt_prison.gat,115,85,0		script	jump_B1	45,1,1,{
OnTouch:
	if(readparam(0) > 200)
		showmessage "�ړ����x���グ�Ȃ���΁A��щz����ꂻ���ɂȂ��B","";
	else
		warp "prt_prison.gat",115,76;
	end;
}

prt_prison.gat,267,143,0	warp	secret_D1	1,1,prt_prison.gat,238,90
prt_prison.gat,248,90,0		warp	secret_D2	1,1,prt_prison.gat,265,143

prt_prison.gat,265,154,4	script	���l 265CM154#EP161C	10135,{
	switch(rand(3)) {
	case 0:
		mes "[���l 265CM154]";
		mes "�l�Ԃ���͉�����햡��";
		mes "�m��Ȃ���H";
		mes "�|������̂Ɠ������炢��";
		mes "�����̂����Ȃ�y������B";
		next;
		emotion 12;
		mes "[���l 265CM154]";
		mes "�����̂��|����";
		mes "���x�݁`���x�݁`��";
		close;
	case 1:
		mes "[���l 265CM154]";
		mes "���`���A";
		mes "�����A�����`�I";
		mes "�B�̊O��";
		mes "���|�����悤��`�I";
		next;
		mes "[���l 265CM154]";
		mes "����ɒN���|�����Ă�����";
		mes "�����̂Ɂ`";
		close;
	case 2:
		mes "[���l 265CM154]";
		mes "�����I�@�l�Ԃ���I";
		mes "�č�������邾��";
		mes "����Ă��܂�������";
		mes "���悢��|�������鎞��";
		mes "�Ȃ����݂�������B";
		next;
		emotion 12;
		mes "[���l 265CM154]";
		mes "�������C�����悭";
		mes "�|���`�|���`��";
		mes "�������͟B�̒������`��";
		close;
	}
}

prt_prison.gat,95,72,6	script	���l 95EB72#EP161E	736,{
	switch(rand(2)) {
	case 0:
		emotion 43;
		mes "[���l 95EB72]";
		mes "�������A���̏L���́c�c";
		mes "�����l�ԁc�c";
		mes "�l�Ԃ̓������B";
		next;
		emotion 29;
		mes "[���l 95EB72]";
		mes "�N�N�N�A���̈Â��n���č���";
		mes "�l�Ԃ̓�����k���̂�";
		mes "�ǂ�قǋv�������B";
		mes "�l�ԁA�߂��܂ŗ��Ă݂�c�c";
		mes "���S����B�v���Ԃ�Ɍ���";
		mes "�l�Ԃ�����A���ʂɎE���͂��Ȃ��B";
		next;
		if(select("�߂Â�","�߂Â��Ȃ�") == 2) {
			unittalk "�]�r�N�r�N�]",1;
			mes "[���l 95EB72]";
			mes "���͂͂͂́c�c!!";
			mes "�@";
			mes "�]�B�̒��̎��l��";
			mes "�@�������т��т����Ă���悤�Ɍ������]";
			close;
		}
		emotion 4;
		mes "[���l 95EB72]";
		mes "���͂͂͂́c�c!!";
		mes "�E���Ȑl�Ԃ��ȁB";
		mes "�������̎����R������";
		mes "�M�l�̎���͂˂Ă�����";
		mes "�ǂ�������肾�H";
		mes "�����͊č������H";
		next;
		unittalk "�]�r�N�r�N�]",1;
		mes "[���l 95EB72]";
		mes "�|����̐l�Ԃɂ����";
		mes "���̂悤�ȈÂ��������ꏊ��";
		mes "�S������Ă��邪�c�c";
		mes "�N�N�N�A������������";
		mes "�E�o�����łɂ́A";
		mes "�l�ԁA���O������������I";
		next;
		mes "�]�B�̒��̎��l��";
		mes "�@�������т��т����Ă���悤�Ɍ�����]";
		next;
		menu "�c�c",-;
		mes "[���l 95EB72]";
		mes "���͂͂͂́c�c!!";
		mes "�����т��т����Ă���悤��";
		mes "������̂��I";
		mes "�������A����́A�����I";
		mes "���Ґk���Ƃ�������B";
		next;
		mes "[���l 95EB72]";
		mes "�͂��߂Č����񂾂낤�H";
		mes "�B�̊O�ɂ��邭���ɖ��m���ȁB";
		mes "�������l�Ԃ��B";
		mes "���͂͂͂́c�c!!";
		close;
	case 1:
		misceffect 197;
		mes "[���l 95EB72]";
		mes "�������c�czZz�c�c";
		mes "�ނɂ�ނɂ�c�czZz�c�c";
		mes "�������c�czZz�c�c";
		next;
		mes "�]�ǂ���炱�̎��l��";
		mes "�@�Q�Ă���悤���]";
		close;
	}
}

prt_prison.gat,117,188,4	script	���l 117FM188#EP161F	10136,{
	switch(rand(3)) {
	case 0:
		mes "[���l 117FM188]";
		mes "�č��ł����K�Ȋ���";
		mes "�ƂĂ��d�v�Ȃ񂾂��B";
		mes "�N���č���";
		mes "�s�����ƂɂȂ�����";
		mes "���ꂾ���͊o���Ă����񂾁B";
		close;
	case 1:
		mes "[���l 117FM188]";
		mes "�����ށc�c";
		mes "��C�������Ă���B";
		mes "����͑�ϕs�������c�c";
		close;
	case 2:
		mes "[���l 117FM188]";
		mes "�����A�����̐l�ԁB";
		mes "�C�ɂȂ邱�Ƃ�����I";
		mes "�l�Ԃ̎��l������";
		mes "�݂�Ȃ���Ȍ���������";
		mes "��炷�̂��H";
		next;
		mes "[���l 117FM188]";
		mes "��������l���Ƃ��Ă�";
		mes "����Ȃɉ����������ꏊ��";
		mes "�����߂�Ƃ́c�c";
		mes "�����A���ׂĂ̂��Ƃɑ΂���";
		mes "�C�ɓ���Ȃ��I";
		next;
		emotion 6;
		mes "[���l 117FM188]";
		mes "�������Ɋč��̊Ǘ��l��";
		mes "�Ă�ł��Ȃ����B";
		mes "����������Ă��I";
		next;
		if(select("�����ł�","���ł�") == 1) {
			mes "[���l 117FM188]";
			mes "�Ȃ񂾂ƁH";
			mes "�@";
			mes "�c�c�������A�N��";
			mes "�����̊Ǘ��l�ɉ�錠����";
			mes "�����Ȃ��̂��B";
			mes "�m��Ȃ������ȁB";
			next;
		} else {
			mes "[���l 117FM188]";
			mes "�Ȃ񂾂ƁH";
			mes "�l�ԑ��Ƃ͋C�������Ȃ��̂��ȁB";
			mes "����̕����Ȃ炱�̒��x�̂���";
			mes "���ŕ����������̂����c�c";
			next;
		}
		mes "[���l 117FM188]";
		mes "���킪���ډ�ɍs�����Ƃ�";
		mes "�o���Ȃ����A";
		mes "�N���Ǘ��l�Ɖ���Ƃ�";
		mes "�s�\�Ȃ̂�����";
		mes "��Ă������Ȃ���΁B";
		next;
		mes "�]���l�͎����̎v�l��";
		mes "�@�v�����Ă���悤���]";
		close;
	}
}

prt_prison.gat,103,214,4	script	���l 103GD214#EP161G	737,{
	switch(rand(2)) {
	case 0:
		mes "[���l 103GD214]";
		mes "�N�N�N�c�c�N�b�t�c�c";
		mes "�l�Ԃ��������ɋ���������";
		mes "���̈Â��n��";
		mes "�䂪�g�𔛂�t�����Ƃ���ŁA";
		mes "�ӎu���}���ł���Ȃǂ�";
		mes "�v��Ȃ����Ƃ��B";
		next;
		mes "[���l 103GD214]";
		mes "���̈Èł̒n�őދ��ɂ��O���A";
		mes "�i����������߂����ʁA";
		mes "���̒��̈ł͂��̒n��";
		mes "������ς��Ă��܂����c�c";
		next;
		emotion 56;
		misceffect 772;
		mes "[���l 103GD214]";
		mes "�n�n�n�n�n�I";
		mes "�F�߂����͂Ȃ����A";
		mes "���̎x�z���ɂ���ł�";
		mes "�\�ꂾ�����Ƃ��Ă���c�c�I";
		mes "�N�ɂ��̈ł���߂�����̂��I";
		close;
	case 1:
		emotion 56;
		mes "[���l 103GD214]";
		mes "�N�N�N�c�c�N�b�t�c�c";
		mes "�N�n�n�n�n�c�c�N�b�c�c!!";
		mes "�@";
		mes "�]�B�̒��̎��l�͂ЂƂ�A";
		mes "�@�ꂵ��ł�����";
		mes "�@�΂��Ă�������J��Ԃ��Ă���]";
		close;
	}
}

prt_prison.gat,243,17,4	script	���l 243DV17#EP161D	909,{
	emotion 29;
	mes "[���l 243DV17]";
	mes "�N�N�N�B";
	mes "�[���s�[��1���ꂽ��";
	mes "�s����������";
	mes "�����Ă�邼�B";
	next;
	switch(select("�č�����","A���","B���","C���","D���","E���","F���","G���","H���","���d�ɒf��")) {
	default:
		mes "[���l 243DV17]";
		mes "�Ȃ񂾁H";
		mes "�|�����ɂ͖����Ȍ|�����Ă��H";
		mes "���������B�������s���B";
		close;
	}
	close;
}

prt_prison.gat,55,115,2	script	���l 55HK115#EP161H	10138,{
	switch(rand(3)) {
	case 0:
		mes "[���l 55HK115]";
		mes "����ȏꏊ�ł͖�����";
		mes "�p�̎������ł��Ȃ��B";
		mes "�����c�c";
		mes "�p�𖁂��ɂӂ��킵�����̂��K�v���B";
		close;
	case 1:
		mes "[���l 55HK115]";
		mes "�����A�x�z�l�`�I";
		mes "�x�z�l�͂��Ȃ��̂��H";
		next;
		mes "�]���̒��̎��l�͂�����";
		mes "�@�z�e������������";
		mes "�@���Ⴂ���Ă���̂��낤���H";
		mes "�@�x�z�l��T���Ă���c�c";
		mes "�@�Ƃ肠�����X���[���悤�]";
		close;
	case 2:
		mes "[���l 55HK115]";
		mes "�ō��ɔ������Ə̎^���ꂽ";
		mes "�ڂ��̊p��";
		mes "����ȏ㑹�Ȃ���ɂ́c�c";
		next;
		mes "[���l 55HK115]";
		mes "�c�c��������������Ă���";
		mes "�����푰�̔炪�ǂ������Ȃ񂾂�ȁB";
		close;
	}
}

prt_prison.gat,243,265,6	script	���l 243AD265#EP161A	969,{
	switch(rand(4)) {
	case 0:
		mes "[���l 243AD265]";
		mes "���������Ď��R�ɂȂ���";
		mes "���E�����͍�";
		mes "�ǂ��ɂ���̂��c�c";
		next;
		emotion 56;
		mes "�]�B�̒��̎��l��";
		mes "�@�{���{���ɋ����������L���A";
		mes "�@�Ȃ̌������̋���";
		mes "�@���x���@�����Ă����]";
		close;
	case 1:
		emotion 56;
		mes "[���l 243AD265]";
		mes "�N��!?�@�����ĂԂ̂�!!";
		mes "���ɊC�𗷂������Ԃ����Ȃ̂��I";
		mes "�����Ȃ̂��I";
		next;
		mes "[���l 243AD265]";
		mes "�Ȃ������ɂȂ��ČĂԂ̂�";
		mes "���͂����֍s���Ȃ��Ƃ����̂�!!";
		mes "�@";
		mes "�]�č��̒��ɂ�����l��";
		mes "�@��������ł���]";
		close;
	case 2:
		mes "[���l 243AD265]";
		mes "�C�͉����A�l���������납��";
		mes "�ǂꂾ���̎��Ԃ��o�߂������낤�c�c";
		next;
		mes "[���l 243AD265]";
		mes "�������A���͖Y��Ȃ��̂��B";
		mes "�C�ŋ��ɐ��������Ԃ����̂��Ƃ�";
		mes "��΂Ɂc�c";
		mes "���ɍ��񂾋L����";
		mes "���x�ł����̌���";
		mes "�v���N�������c�c";
		next;
		emotion 56;
		mes "�]�B�̒��̎��l��";
		mes "�@�Ȃ̌��ō��̋���";
		mes "�@�p���p���ƒ@���Ă���]";
		close;
	case 3:
		emotion 52;
		mes "[���l 243AD265]";
		mes "�c�c����";
		mes "�v���Ԃ�ɉ�l�Ԃ��B";
		mes "�����������̂��ȁB";
		next;
		if(select("���A����","���̂܂܋���") == 2) {
			mes "[���l 243AD265]";
			mes "�c�c�܂��A";
			mes "����ɂ���ʂ̂��d�����Ȃ��B";
			mes "�����l�������̂�";
			mes "�����̂̂��Ƃ��B";
			close;
		}
		mes "[���l 243AD265]";
		mes "�͂͂́c�c���肪�Ƃ��B";
		close;
	}
}

prt_prison.gat,267,184,8	script	���l 267BD184#EP161B	10137,{
	switch(rand(3)) {
	case 0:
		emotion 38;
		mes "[���l 267BD184]";
		mes "�قق��c�c�H";
		mes "���O�̖ڂ͂Ȃ��Ȃ�";
		mes "�������F�����Ă���ȁB";
		mes "���̍D�݂��B";
		next;
		mes "[���l 267BD184]";
		mes "���͑��k�����c�c";
		mes "���̖ڂ��ЂƂ���";
		mes "���ɂ���Ȃ����H";
		mes "�厖�ɕۊǂ���B";
		next;
		menu "����͂������",-,"���ł�",-;
		emotion 28;
		mes "[���l 267BD184]";
		mes "���H";
		mes "�{���ɗ~���������̂����c�c";
		mes "������Y��Ƀs�J�s�J����ڂ�";
		mes "�ӂ��������Ă���̂�";
		mes "���邱�Ƃ��ł��Ȃ��Ƃ͂ȁB";
		next;
		emotion 32;
		mes "[���l 267BD184]";
		mes "�v�����Ȃ��B";
		mes "���߂�Ƃ��悤�B";
		mes "���̑���A";
		mes "��ɗ��Ă�����B";
		close;
	case 1:
		mes "�]�B�̒��̎��l��";
		mes "�@�ƂĂ����₩�ȕ\������Ă���B";
		mes "�@�b��������ꂽ��A";
		mes "�@������������Ă��܂�������";
		mes "�@���͋C���]";
		next;
		if(select("�ǂ����Ă����ɁH","��������") == 1) {
			mes "[���l 267BD184]";
			mes "�c�c���̂́A";
			mes "���ɘb���������̂��H";
			mes "�ӂӁB";
			next;
			mes "[���l 267BD184]";
			mes "���O�̖ڂ͂Ȃ��Ȃ��ɍD�݂��B";
			mes "�����Ă����悤���B";
			mes "�c�c�������\���B";
			next;
			mes "[���l 267BD184]";
			mes "�����A�������\�I";
			mes "�{���ɂ��肦�Ȃ��ȁI";
			mes "���O�̖ڂɂ͎���";
			mes "�������\�ȂǂƂ���";
			mes "�����ɖ�����������";
			mes "�N�����悤�Ȋ�Ɍ����邩�H";
			next;
			emotion 38;
			mes "[���l 267BD184]";
			mes "���͂����Y��Ȗڂ�������";
			mes "�����ɋ������������������B";
			mes "����Ȃ̂ɁA���̏����Ȉ���";
			mes "�������Ƃ́B";
			next;
			mes "[���l 267BD184]";
			mes "�܂������l�Ԃɂ�";
			mes "���������̂��ˁB";
			next;
		}
		mes "["+strcharinfo(0)+"]";
		mes "�i������������͊댯���B";
		mes "�����������痣��悤�j";
		mes "�@";
		mes "�]���Ȃ��͂��̟B�ɔw���������]";
		close;
	case 2:
		mes "[���l 267BD184]";
		mes "�c�c����B";
		mes "���ɂ͎��Ԃ������Ղ�Ƃ��邪�A";
		mes "���O�Ƃ͂܂��V��ł������Ȃ��ȁB";
		next;
		if(select("�Ȃ��H","�������ł�") == 2) {
			emotion 6;
			mes "[���l 267BD184]";
			mes "�ł́A���}�ɗ�������Ƃ����B";
			close;
		}
		mes "[���l 267BD184]";
		mes "�ӂӁB";
		mes "�܂����D�݂̖ڂł͂Ȃ�����ˁB";
		mes "���ɉ���܂ł�";
		mes "�Y��ɖ����Ă��ꂽ�܂��B";
		close;
	}
}
