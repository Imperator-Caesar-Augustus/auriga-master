//==============================================================================
// Geffen Magic Tournament Memorial Dungeon Script
//==============================================================================

//==========================================
// ���̒ʘH
//------------------------------------------
dali.gat,98,141,3	script	�����̋��Ԍ����w��#a1	903,{
	if(BaseLevel <= 89) {
		mes "[�����̋��Ԍ����w��]";
		mes "�Q�t�F�����@���ւ̎Q���҂�";
		mes "���ґ������B";
		mes "�N�̎��͂ł͂܂����������낤�B";
		next;
		mes "�]���̐�ɐi�ނɂ�^ff0000BaseLv90�ȏ�^000000��";
		mes "�@�K�v�ł��]";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�����̋��Ԍ����w��]";
		mes "�����̋��Ԃ͔��ɕs�����";
		mes "��l�ł�������Ȃ��̂��B";
		mes "�p�[�e�B�[���[�_�[�ȊO��";
		mes "�i���͐������Ă��邩��A";
		mes "���肽�����^ff0000�p�[�e�B�[���[�_�[��";
		mes "�Ȃ��Ă��玄�ɘb�������Ă���Ȃ����B^000000";
		close;
	}
	if(getonlinepartymember() >= 2) {
		mes "[�����̋��Ԍ����w��]";
		mes "�����̋��Ԃ͔��ɕs�����";
		mes "��l�ł�������Ȃ��̂��B";
		mes "���܂Ȃ��������o�[��";
		mes "��l�ɍi���Ă���Ȃ����B";
		close;
	}
	if(checkquest(9315)) {
		if(checkquest(9309)) {	// �s��
			delquest 9309;
			delquest 9310;
			delquest 9311;
			delquest 9312;
			delquest 9313;
			delquest 9314;
			mes "[�����̋��Ԍ����w��]";
			mes "���Ԃ���A���Ă������I";
			mes "����ŉ����������̂��H";
			next;
			mes "�]���Ԃł̏o�����ɂ���";
			mes "�@�m���Ă�����e��b�����]";
			next;
			mes "[�����̋��Ԍ����w��]";
			mes "�ӂށc�c";
			mes "�������������B";
			mes "������񂪑���Ȃ���";
			mes "���ɏ���������B";
			next;
			mes "[�����̋��Ԍ����w��]";
			mes "�����܂��܂�����Ȃ��I";
			mes "�܂����������ė~�����̂��B";
			mes "���ԂŃQ�t�F�����@���ɂ���";
			mes "���ׂĂ���Ȃ����H";
			mes "�҂��Ă����B";
			delquest 9315;
			close;
		}
		if(checkquest(9308)) {	// �D��
			delquest 9308;
			delquest 9310;
			delquest 9311;
			delquest 9312;
			delquest 9313;
			delquest 9314;
			mes "[�����̋��Ԍ����w��]";
			mes "�����ɋA���Ă������I";
			mes "�����A�ǂ�Ȃ��Ƃ��������̂��H";
			next;
			mes "�]���Ȃ��͋��Ԃł̏o������";
			mes "�@�b���Ă������]";
			next;
			mes "[�����̋��Ԍ����w��]";
			mes "�������I";
			mes "�������������I";
			mes "���肪�Ƃ��A���肪�Ƃ�!!";
			next;
			mes "[�����̋��Ԍ����w��]";
			mes "�����܂��܂�����Ȃ��I";
			mes "�܂����������ė~�����̂��B";
			mes "���ԂŃQ�t�F�����@���ɂ���";
			mes "���ׂĂ���Ȃ����H";
			mes "�҂��Ă����B";
			delquest 9315;
			close;
		}
		mes "[�����̋��Ԍ����w��]";
		mes "���Ԃ���A���Ă������I";
		mes "����ŉ����������̂��H";
		next;
		mes "�]���Ԃł̏o�����ɂ���";
		mes "�@�m���Ă�����e��b�����]";
		next;
		mes "[�����̋��Ԍ����w��]";
		mes "���ނށc�c";
		mes "�V�������Ƃ͉����Ȃ����c�c�B";
		mes "����J��������B";
		mes "�����撣���Ă���B";
		next;
		mes "[�����̋��Ԍ����w��]";
		mes "��͂�܂��܂�����Ȃ��I";
		mes "�܂����������ė~�����̂��B";
		mes "�Q�t�F�����@���ɂ���";
		mes "���ׂĂ���Ȃ����H";
		mes "�҂��Ă����";
		delquest 9315;
		close;
	}
	if(checkquest(9316)) {
		if(checkquest(9316) & 0x2 == 0 || checkquest(118924) & 0x2 == 0) {
			mes "[�����̋��Ԍ����w��]";
			mes "�܂����ׂĂ��Ă����̂��H";
			mes "��H�@�������c�c";
			mes "�O��̒T������[���Ȏ��Ԃ�";
			mes "�o�߂��Ă��Ȃ��悤���ȁB";
			next;
			mes "[�����̋��Ԍ����w��]";
			mes "�����̋��Ԃ͔��ɕs����Ȃ񂾁B";
			mes "���ꂵ�Ă���1��ڂ�";
			mes "^ff0000�ߑO5���ȍ~^000000�ɗ��Ă���B";
			mes "�A���A�Ō�̓�������Ă���";
			mes "^ff00002����^000000�o�߂��Ȃ���";
			mes "���ɂ͓���Ȃ����B";
			close;
		}
		mes "[�����̋��Ԍ����w��]";
		mes "�܂����Ă����ƐM���Ă�����B";
		mes "���肪�Ƃ��I";
		next;
		mes "[�����̋��Ԍ����w��]";
		mes "�����ړ��@��ʂ���";
		mes "���Ԃ̒��ɓ���A";
		mes "�Q�t�F�����@���ɎQ������";
		mes "�́A���݂��Ă������E��";
		mes "�p�Y�̍��Ղ�";
		mes "���ɒm�点�Ă���Ȃ����H";
		next;
		mes "[�����̋��Ԍ����w��]";
		mes "�����A���Ԃ͔��ɕs�����";
		mes "�����̐l�͓���Ȃ��̂��B";
		mes "��������l�ł�������Ȃ�";
		mes "�Ƃ����_�𒍈ӂ��ė~�����B";
		mes "���ꂶ����邩���H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�����̋��Ԍ����w��]";
			mes "���������A�C���ς������";
			mes "���ЂƂ����ׂĂ���B";
			close;
		}
		mdcreate "Magic Tournament";
		mes "[�����̋��Ԍ����w��]";
		mes "�����ړ��@�̋N���ɐ��������B";
		mes "�N�����Ԃ��߂���O��";
		mes "���߂ɏo�����Ă���B";
		close;
	}
	mes "[�����̋��Ԍ����w��]";
	mes "�N�͉����́A";
	mes "�Q�t�F���Ŗ��@��";
	mes "�s���Ă������Ƃ�m���Ă��邩�H";
	next;
	mes "[�����̋��Ԍ����w��]";
	mes "���͂��̐^�����m�肽����";
	mes "���\�N�Ԍ����𑱂����̂��B";
	mes "�����Ă��̋��Ԃ�";
	mes "���Ɍ������̂��I";
	next;
	mes "[�����̋��Ԍ����w��]";
	mes "���������ł͋��Ԃɓ��邱�Ƃ�";
	mes "�ł��Ȃ������̂��B";
	mes "�������ł����Ō����΂���";
	mes "���Ă����̂����A";
	mes "�����ɌN�����ꂽ�̂��B";
	next;
	mes "[�����̋��Ԍ����w��]";
	mes "�����܂ł��ǂ蒅����";
	mes "�N�Ȃ�\�񕪂ɂ��̋��Ԃɓ���A";
	mes "�Q�t�F�����@���ɂ��Ă�";
	mes "���ׂ��邾�낤�B";
	next;
	mes "[�����̋��Ԍ����w��]";
	mes "�����ړ��@��ʂ���";
	mes "���Ԃ̒��ɓ���A";
	mes "�Q�t�F�����@���ɎQ������";
	mes "�́A���݂��Ă������E��";
	mes "�p�Y�̍��Ղ�";
	mes "���ɒm�点�Ă���Ȃ����H";
	next;
	mes "[�����̋��Ԍ����w��]";
	mes "�����A���Ԃ͔��ɕs�����";
	mes "�����̐l�͓���Ȃ��̂��B";
	mes "��������l�ł�������Ȃ�";
	mes "�Ƃ����_�𒍈ӂ��ė~�����B";
	mes "���ꂶ����邩���H";
	next;
	if(select("�͂�","������") == 2) {
		mes "[�����̋��Ԍ����w��]";
		mes "���������A�C���ς������";
		mes "���ЂƂ����ׂĂ���B";
		close;
	}
	mdcreate "Magic Tournament";
	mes "[�����̋��Ԍ����w��]";
	mes "�����ړ��@�̋N���ɐ��������B";
	mes "�N�����Ԃ��߂���O��";
	mes "���߂ɏo�����Ă���B";
	close;
OnInit:
	waitingroom "�Q�t�F�����@���", 20;
	end;
}

dali.gat,100,147,3	script	�����ړ��@#a1	10007,{
	if(checkquest(9316)) {
		if(checkquest(9316) & 0x2 == 0 || checkquest(118924) & 0x2 == 0) {
			mes "�]�����̋��Ԃ����Ă���B";
			mes "�@���ꂵ�Ă���1��ڂ�^ff0000�ߑO5���ȍ~^000000��";
			mes "�@�ēx�A����ł��邾�낤�B";
			mes "�@�A���A�Ō�̓�������Ă���";
			mes "�@^ff00002����^000000�o�߂��Ȃ���";
			mes "�@���ɂ͓���Ȃ��悤���]";
			close;
		}
		if(checkquest(9285)) delquest 9285;
		if(checkquest(9290)) delquest 9290;
		if(checkquest(9287)) delquest 9287;
		if(checkquest(9291)) delquest 9291;
		if(checkquest(9289)) delquest 9289;
		if(checkquest(9292)) delquest 9292;

		if(checkquest(9286)) delquest 9286;
		if(checkquest(9288)) delquest 9288;
		if(checkquest(9308)) delquest 9308;
		if(checkquest(9309)) delquest 9309;
		delquest 9310;
		delquest 9311;
		delquest 9312;
		delquest 9313;
		delquest 9314;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "[�����̋��Ԍ����w��]";
		mes "�����̋��Ԃ͔��ɕs�����";
		mes "��l�ł�������Ȃ��̂��B";
		mes "�p�[�e�B�[���[�_�[�ȊO��";
		mes "�i���͐������Ă��邩��A";
		mes "���肽�����^ff0000�p�[�e�B�[���[�_�[��";
		mes "�Ȃ��Ă��玄�ɘb�������Ă���Ȃ����B^000000";
		close;
	}
	if(getonlinepartymember() >= 2) {
		mes "[�����̋��Ԍ����w��]";
		mes "�����̋��Ԃ͔��ɕs�����";
		mes "��l�ł�������Ȃ��̂��B";
		mes "���܂Ȃ��������o�[��";
		mes "��l�ɍi���Ă���Ȃ����B";
		close;
	}
	mes "�]�����ړ��@������B";
	mes "�@�Q�t�F�����@���ɍs���܂����H�]";
	next;
	if(select("�s��","�s���Ȃ�") == 2) {
		mes "�]���Ȃ��͎����ړ��@���痣�ꂽ�]";
		close;
	}
	if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
		mes "�]�����̋��Ԃ��s����Ȃ���";
		mes "�@�p�[�e�B�[���[�_�[��l����";
		mes "�@���邱�Ƃ��ł��Ȃ��]";
		close;
	}
	switch(mdenter("Magic Tournament")) {
	case 0:		// �G���[�Ȃ�
		announce "�������A���_���W����[Magic Tournament] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99;
		donpcevent getmdnpcname("#�������A���J�n")+ "::OnStart";
		setquest 9316;
		setquest 118924;
		setquest 9315;
		end;
	case 1:		// �p�[�e�B�[������
		mes "�]�����̋��Ԃ��s����Ȃ���";
		mes "�@�p�[�e�B�[���[�_�[��l����";
		mes "�@���邱�Ƃ��ł��Ȃ��]";
		close;
	case 2:		// �_���W�������쐬
		mes "�]�p�[�e�B�[���[�_�[���_���W������";
		mes "�@�������Ă��܂���]";
		close;
	default:		// ���̑��G���[
		close;
	}
}

dali.gat,92,147,3	script	�Q�t�F���R�C��������#1	893,{
	mes "[�Q�t�F���R�C��������]";
	mes "����ɂ��́B";
	mes "���͌����̂���`����";
	mes "�Q�t�F�����@���R�C����";
	mes "�W�߂Ă��܂��B";
	mes "����͐F�X�p�ӂ��Ă��܂��̂�";
	mes "��x�����ɂȂ��Ă��������B";
	while(1) {
		next;
		switch(select("��","�A�N�Z�T���[","�Z","���Օi","�o���l","��b���I������")) {
		case 1:
			mes "[�Q�t�F���R�C��������]";
			mes "����2��ނ��p�ӂ���Ă��܂��B";
			mes "�ǂ�������ɂȂ�܂����B";
			while(1) {
				next;
				switch(select("�}�W�b�N���t���N�^�[ <^006400�R�C��^000000 900��>","��S�Ȏ��T������ <^006400�R�C��^000000 900��>","�ȑO�̃��X�g�ɖ߂�")) {
				case 1:
					mes "�]<ITEM>�}�W�b�N���t���N�^�[[1]<INFO>2185</INFO></ITEM>�]";
					mes "-��L�A�C�e�������N���b�N����";
					mes "���ʂ����m�F��������-";
					set '@gain,2185;
					set '@cost,900;
					break;
				case 2:
					mes "�]<ITEM>��S�Ȏ��T������[1]<INFO>2186</INFO></ITEM>�]";
					mes "-��L�A�C�e�������N���b�N����";
					mes "���ʂ����m�F��������-";
					set '@gain,2186;
					set '@cost,900;
					break;
				case 3:
					set '@gain,0;
					break;
				}
				if('@gain == 0) {
					break;
				}
				next;
				mes "[�Q�t�F���R�C��������]";
				mes getitemname('@gain)+ "��";
				mes "�Q�t�F�����@���R�C��" +'@cost+ "����";
				mes "�����\�ł��B";
				mes "�����Ȃ����܂����H";
				next;
				if(select("�������Ȃ�","��������") == 1) {
					mes "[�Q�t�F���R�C��������]";
					mes "���̕i���������ɂȂ��Ă��������B";
					continue;
				}
				if(countitem(6671) < '@cost) {
					break;
				}
				delitem 6671,'@cost;
				getitem '@gain,1;
				mes "[�Q�t�F���R�C��������]";
				mes "^006400�Q�t�F�����@���R�C��^000000 " +'@cost+ "����";
				mes "^006400" +getitemname('@gain)+ "^000000 1��";
				mes "�������܂��B";
				mes "���ɂ����p���͂���܂����H";
				continue;
			}
			if('@gain == 0) {
				continue;
			}
			break;
		case 2:
			mes "[�Q�t�F���R�C��������]";
			mes "�A�N�Z�T���[��2��ނ�";
			mes "�p�ӂ���Ă��܂��B";
			while(1) {
				next;
				switch(select("�g�̋��������O <^006400�R�C��^000000 1800��>","���͑��������O <^006400�R�C��^000000 1800��>","�ȑO�̃��X�g�ɖ߂�")) {
				case 1:
					mes "�]<ITEM>�g�̋��������O[1]<INFO>2963</INFO></ITEM>�]";
					mes "-��L�A�C�e�������N���b�N����";
					mes "���ʂ����m�F��������-";
					set '@gain,2963;
					set '@cost,1800;
					break;
				case 2:
					mes "�]<ITEM>���͑��������O[1]<INFO>2964</INFO></ITEM>�]";
					mes "-��L�A�C�e�������N���b�N����";
					mes "���ʂ����m�F��������-";
					set '@gain,2964;
					set '@cost,1800;
					break;
				case 3:
					set '@gain,0;
					break;
				}
				if('@gain == 0) {
					break;
				}
				next;
				mes "[�Q�t�F���R�C��������]";
				mes getitemname('@gain)+ "��";
				mes "�Q�t�F�����@���R�C��" +'@cost+ "����";
				mes "�����\�ł��B";
				mes "�����Ȃ����܂����H";
				next;
				if(select("�������Ȃ�","��������") == 1) {
					mes "[�Q�t�F���R�C��������]";
					mes "���̕i���������ɂȂ��Ă��������B";
					continue;
				}
				if(countitem(6671) < '@cost) {
					break;
				}
				delitem 6671,'@cost;
				getitem '@gain,1;
				mes "[�Q�t�F���R�C��������]";
				mes "^006400�Q�t�F�����@���R�C��^000000 " +'@cost+ "����";
				mes "^006400" +getitemname('@gain)+ "^000000 1��";
				mes "�������܂��B";
				mes "���ɂ����p���͂���܂����H";
				continue;
			}
			if('@gain == 0) {
				continue;
			}
			break;
		case 3:
			mes "[�Q�t�F���R�C��������]";
			mes "�Z��2��ނ�";
			mes "�p�ӂ���Ă��܂��B";
			while(1) {
				next;
				switch(select("�A���e�B�}�W�b�N�X�[�c <^006400�R�C��^000000 1350��>","�Q�t�F���}�W�b�N���[�u <^006400�R�C��^000000 1350��>","�ȑO�̃��X�g�ɖ߂�")) {
				case 1:
					mes "�]<ITEM>�A���e�B�}�W�b�N�X�[�c[1]<INFO>15073</INFO></ITEM>�]";
					mes "-��L�A�C�e�������N���b�N����";
					mes "���ʂ����m�F��������-";
					set '@gain,15073;
					set '@cost,1350;
					break;
				case 2:
					mes "�]<ITEM>�Q�t�F���}�W�b�N���[�u[1]<INFO>15074</INFO></ITEM>�]";
					mes "-��L�A�C�e�������N���b�N����";
					mes "���ʂ����m�F��������-";
					set '@gain,15074;
					set '@cost,1350;
					break;
				case 3:
					set '@gain,0;
					break;
				}
				if('@gain == 0) {
					break;
				}
				next;
				mes "[�Q�t�F���R�C��������]";
				mes getitemname('@gain)+ "��";
				mes "�Q�t�F�����@���R�C��" +'@cost+ "����";
				mes "�����\�ł��B";
				mes "�����Ȃ����܂����H";
				next;
				if(select("�������Ȃ�","��������") == 1) {
					mes "[�Q�t�F���R�C��������]";
					mes "���̕i���������ɂȂ��Ă��������B";
					continue;
				}
				if(countitem(6671) < '@cost) {
					break;
				}
				delitem 6671,'@cost;
				getitem '@gain,1;
				mes "[�Q�t�F���R�C��������]";
				mes "^006400�Q�t�F�����@���R�C��^000000 " +'@cost+ "����";
				mes "^006400" +getitemname('@gain)+ "^000000 1��";
				mes "�������܂��B";
				mes "���ɂ����p���͂���܂����H";
				continue;
			}
			if('@gain == 0) {
				continue;
			}
			break;
		case 4:
			mes "[�Q�t�F���R�C��������]";
			mes "���Օi��1��ނ�";
			mes "�p�ӂ���Ă��܂��B";
			next;
			if(select("�t�F�������̎��� <^006400�R�C��^000000 20��>","�ȑO�̃��X�g�ɖ߂�") == 2) {
				continue;
			}
			mes "�]�t�F�������̎����]";
			mes "�]<ITEM>�t�F�������̎���<INFO>22511</INFO></ITEM>�]";
			mes "-��L�A�C�e�������N���b�N����";
			mes "���ʂ����m�F��������-";
			next;
			mes "[�Q�t�F���R�C��������]";
			mes "�t�F�������̎�����";
			mes "�Q�t�F�����@���R�C��20����";
			mes "�����\�ł��B";
			mes "��x��50�܂Ō����o���܂��B";
			mes "���������Ȃ����܂����H";
			mes "0����͂���ƃL�����Z���o���܂��B";
			next;
			input '@num;
			if('@num == 0) {
				mes "[�Q�t�F���R�C��������]";
				mes "�L�����Z�����܂����B";
				mes "�܂��̂����p�����҂����Ă��܂��B";
				close;
			}
			if('@num < 0 || '@num > 50) {
				mes "[�Q�t�F���R�C��������]";
				mes "������������͂��Ă��������B";
				mes "��x�Ɍ����ł���̂�";
				mes "50�܂łƂȂ�܂��B";
				close;
			}
			set '@cost,20 * '@num;
			mes "[�Q�t�F���R�C��������]";
			mes "�t�F�������̎���";
			mes "^0000ff" +'@num+ "��^000000��";
			mes "�R�C��" +'@cost+ "����";
			mes "�������܂��B";
			mes "��낵���ł����H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[�Q�t�F���R�C��������]";
				mes "�L�����Z�����܂����B";
				close;
			}
			if(countitem(6671) < '@cost) {
				break;
			}
			delitem 6671,'@value;
			getitem 22511,'@num;
			mes "[�Q�t�F���R�C��������]";
			mes "�͂��A�ǂ����B";
			mes "���肪�Ƃ��������܂����B";
			close;
		case 5:
			mes "[�Q�t�F���R�C��������]";
			mes "�o���l��^FF000023���Ԃ�1��^000000";
			mes "^FF0000BaseLv90�ȏ�̕��̂�";
			mes "�������邱�Ƃ��ł��܂��B";
			next;
			mes "[�Q�t�F���R�C��������]";
			mes "�Ȃ��A�Q�t�F�����@���R�C��";
			mes "1���ɂ�";
			mes "BaseExp100,000�A�܂���";
			mes "JobExp�@50,000�A���炦�܂��B";
			mes "�����P�ʂ�5���A10���A15���ł��B";
			mes "�ǂ���̌o���l������]�ł����H";
			next;
			while(1) {
				switch(select("BaseExp��Ⴄ","JobExp��Ⴄ","�ȑO�̃��X�g�ɖ߂�")) {
				case 1:
					set '@exptype$,"BaseExp";
					break;
				case 2:
					set '@exptype$,"JobExp";
					break;
				case 3:
					set '@exptype$,"";
					break;
				}
				if(BaseLevel <= 89) {
					mes "[�Q�t�F���R�C��������]";
					mes "����H";
					mes "���Ȃ��͑Ώ�BaseLv�̕��ł�";
					mes "����܂���ˁH";
					mes "�o���l�ɂ��܂��Ă�";
					mes "^FF0000BaseLv90�ȏ�̕��̂�";
					mes "�������邱�Ƃ��ł��܂��B";
					continue;
				}
				if('@exptype$ == "") {
					break;
				}
				mes "[�Q�t�F���R�C��������]";
				mes '@exptype$+ "���~�����̂ł��ˁB";
				mes "�@";
				mes "�������p���܂����H";
				next;
				switch(select("5��","10��","15��")) {
				case 1: set '@cost,5; break;
				case 2: set '@cost,10; break;
				case 3: set '@cost,15; break;
				}
				if('@exptype$ == "BaseExp") {
					set '@exp,100000 * '@cost;
				}
				else {
					set '@exp,50000 * '@cost;
				}
				mes "[�Q�t�F���R�C��������]";
				mes "�Q�t�F�����@���R�C���A" +'@cost+ "����";
				mes '@exptype$+ "��";
				mes '@exp+ "�A����ł��܂��ˁB";
				mes "����ŗǂ��ł����H";
				next;
				if(select("�͂�","������") == 2) {
					continue;
				}
				if(checkquest(114730)) {
					if(checkquest(114730) & 0x2 == 0) {
						mes "[�Q�t�F���R�C��������]";
						mes "����H�@�O��̌�������A";
						mes "23���Ԍo�߂��Ă��Ȃ��悤�ł��ˁB";
						mes "�o���l��^FF000023���Ԃ�1��^000000����";
						mes "�������邱�Ƃ��ł��܂��̂�";
						mes "���΂炭�o���Ă��炨�z���������B";
						continue;
					}
				}
				if(countitem(6671) < '@cost) {
					break;
				}
				if(checkquest(114730))
					delquest 114730;
				setquest 114730;
				mes "[�Q�t�F���R�C��������]";
				mes "�͂��A�ǂ����B";
				delitem 6671,'@cost;
				for(set '@i,0; '@i<'@cost; set '@i,'@i+1) {
					if('@exptype$ == "BaseExp") {
						getexp 100000,0;
					}
					else {
						getexp 0,50000;
					}
				}
				close;
			}
			if('@exptype$ == "") {
				continue;
			}
			break;
		case 6:
			mes "[�Q�t�F���R�C��������]";
			mes "�܂��̂��z�������܂����Ă��܂��B";
			close;
		}
		break;
	}
	mes "[�Q�t�F���R�C��������]";
	mes "^006400�Q�t�F�����@���R�C��^000000 " +'@cost+ "����";
	mes "�������Ă��Ȃ�����";
	mes "�����ł��܂���ł����B";
	next;
	mes "[�Q�t�F���R�C��������]";
	mes "^006400�Q�t�F�����@���R�C��^000000��";
	mes "�Q�t�F�����@���ɎQ����";
	mes "�ǂ����т��c���Ɗl���ł��܂��B";
	close;
OnInit:
	waitingroom "�R�C������", 0;
	end;
}

//==========================================
// �J�n �` ��t
//------------------------------------------
function	script	#���@���i�s�x	{
	set '@target,getarg(0);
	switch('@target) {
	case 1:		// �A���q
		set '@quest1,115550;
		set '@quest2,115551;
		set '@quest3,115552;
		break;
	case 2:		// �f�B�I�E�A�l���X
		set '@quest1,115553;
		set '@quest2,115554;
		set '@quest3,115555;
		break;
	case 3:		// �r���[�E�R�X�����[�X
		set '@quest1,115556;
		set '@quest2,115557;
		set '@quest3,115558;
		break;
	case 4:		// �q�s�A�E�X�j�L
		set '@quest1,115559;
		set '@quest2,115560;
		set '@quest3,115561;
		break;
	case 5:		// �u���b�N�E�J�l�C���[
		set '@quest1,115562;
		set '@quest2,115563;
		set '@quest3,115564;
		break;
	case 6:		// �t�F����
		set '@quest1,115565;
		set '@quest2,115566;
		set '@quest3,115567;
		break;
	case 7:		// �I���h��
		set '@quest1,115568;
		set '@quest2,115569;
		set '@quest3,115570;
		break;
	case 8:		// �u���[�g�E�n�[
		set '@quest1,115571;
		set '@quest2,115572;
		set '@quest3,115573;
		break;
	case 9:		// ����
		set '@quest1,115574;
		set '@quest2,115575;
		set '@quest3,115576;
		break;
	case 10:	// �C�t�H�h�X
		set '@quest1,115577;
		set '@quest2,115578;
		set '@quest3,115579;
		break;
	case 11:	// ���`�F�j�G
		set '@quest1,115580;
		set '@quest2,115581;
		set '@quest3,115582;
		break;
	case 12:	// �����q��
		set '@quest1,115583;
		set '@quest2,115584;
		set '@quest3,115585;
		break;
	case 13:	// �W���[
		set '@quest1,115586;
		set '@quest2,115587;
		set '@quest3,115588;
		break;
	case 14:	// �f�B���C
		set '@quest1,115589;
		set '@quest2,115590;
		set '@quest3,115591;
		break;
	case 15:	// �t�F�C�E�J�i�r�A��
		set '@quest1,115592;
		set '@quest2,115593;
		set '@quest3,115594;
		break;
	}

	set '@q1,checkquest('@quest1);
	set '@q2,checkquest('@quest2);
	set '@q3,checkquest('@quest3);

	if('@q1 != 0) set '@check,'@check | 0x1;
	if('@q2 != 0) set '@check,'@check | 0x2;
	if('@q3 != 0) set '@check,'@check | 0x4;

	return '@check;
}

1@gef.gat,119,199,0	script	#�������A���J�n	139,5,5,{
OnStart:
	donpcevent getmdnpcname("#�C�x���g�Ǘ�")+ "::OnStart";

	for(set '@i,1;'@i<=10;set '@i,'@i+1) {
		donpcevent getmdnpcname("#���@���ԉ�_"+ '@i)+ "::OnStart";
		donpcevent getmdnpcname("#���@���ԉ�_b"+ '@i)+ "::OnStart";
	}
	donpcevent getmdnpcname("�j�`����#a7")+ "::OnStart";

	donpcevent getmdnpcname("#����NPC����")+ "::OnStart";
	end;
OnTouch:
	hideonnpc;
	initnpctimer;
	set .Name$,strcharinfo(0);
	mapannounce getmdmapname("1@gef.gat"),"�Q�t�F������ : ���ɁI�@�҂��ɑ҂����Q�t�F�����@���Ԃ��Ȃ��J�n����܂��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	viewpoint 1, 122, 58, 1, 0x000000;
	hideonnpc getmdnpcname("#�������A���J�n");
	misceffect 1, getmdnpcname("#�������A���J�n");
	end;
OnTimer3000:
	mapannounce getmdmapname("1@gef.gat"),"�Q�t�F������ : �Q�t�F���s���̊F�l�Ɩ`���҂̊F����̕����Ă̂��Q�������҂����Ă���܂��I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer6000:
	mapannounce getmdmapname("1@gef.gat"),"�Q�t�F������ : �Q�t�F�����@���ւ̎Q��������]�̕��̓Q�t�F��6�������ɂ��镬����ɂ��W�܂肭�������I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
OnTimer20000:
	stopnpctimer;
	mapannounce getmdmapname("1@gef.gat"),"�Q�t�F������ : �Q�t�F�����@���ւ̎Q��������]�̕��̓Q�t�F��6�������ɂ��镬����ɂ��W�܂肭�������I", 0x1, 0x00ebff, 0x190, 12, 0, 0;
	end;
}

1@gef.gat,119,199,0	script	#�C�x���g�Ǘ�	139,{
	end;
OnStart:
	hideonnpc getmdnpcname("#�C�x���g1�J�n2");
	hideonnpc getmdnpcname("#�C�x���g�ԊO1");
	hideonnpc getmdnpcname("�P�C�I�X#1");
	hideonnpc getmdnpcname("�Q�t�F���s��#1");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
	hideonnpc getmdnpcname("�Q�t�F���s��#3");
	hideonnpc getmdnpcname("�Q�t�F���s��#11");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#22");
	hideonnpc getmdnpcname("�Q�t�F���s��#33");
	hideonnpc getmdnpcname("�J�v���̏���#1");
	hideonnpc getmdnpcname("�P�C�I�X#2");
	hideonnpc getmdnpcname("�P�C�I�X#3");
	hideonnpc getmdnpcname("�A�C���X#1");

	hideonnpc getmdnpcname("#�C�x���g2�J�n2");
	hideonnpc getmdnpcname("#�C�x���g�ԊO2");
	hideonnpc getmdnpcname("���L#1");
	hideonnpc getmdnpcname("�q�s�A�E�X�j�L#1");
	hideonnpc getmdnpcname("�Q�t�F�������#2");
	hideonnpc getmdnpcname("�Q�t�F�������#3");
	hideonnpc getmdnpcname("�Q�t�F�������#22");
	hideonnpc getmdnpcname("�q�s�A�E�X�j�L#11");
	hideonnpc getmdnpcname("�Q�t�F�������#33");
	hideonnpc getmdnpcname("���@�A�J�f�~�[�w��#1");
	hideonnpc getmdnpcname("���@�A�J�f�~�[�w��#2");
	hideonnpc getmdnpcname("�t�F������#1");
	hideonnpc getmdnpcname("���L#2");
	hideonnpc getmdnpcname("���L#3");

	hideonnpc getmdnpcname("#�C�x���g3�J�n2");
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#2");
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#1");
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#3");
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#11");
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#22");
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#33");
	hideonnpc getmdnpcname("#�C�x���g�ԊO3");
	hideonnpc getmdnpcname("���f�B�A#1");
	hideonnpc getmdnpcname("�Q�t�F���Z��#1");
	hideonnpc getmdnpcname("�Q�t�F���Z��#2");
	hideonnpc getmdnpcname("�Q�t�F���Z��#3");
	end;
}

1@gef.gat,121,58,0	script	#���@����t1	139,15,15,{
	end;
OnTouch:
	hideonnpc;
	unittalk getcharid(3),strcharinfo(0)+" : ���@����t��������B�Q���\�����݂����悤�B";
	if(checkquest(9285)) {
		delquest 9285;
		setquest 9290;		// �r���[�E�R�X�����[�X�Ƒΐ�
	}
	if(checkquest(9287)) {
		delquest 9287;
		setquest 9291;		// �q�s�A�E�X�j�L�Ƒΐ�
	}
	if(checkquest(9289)) {
		delquest 9289;
		setquest 9292;		// �u���b�N�E�J�l�C���[�Ƒΐ�
	}
	delquest 9293;
	delquest 9294;
	hideonnpc getmdnpcname("#�C�x���g1�J�n1");
	hideonnpc getmdnpcname("#�C�x���g2�J�n1");
	hideonnpc getmdnpcname("#�C�x���g3�J�n1");
	donpcevent getmdnpcname("#�C�x���g�Ǘ�")+ "::OnStart";
	end;
}

1@gef.gat,122,58,4	script	���@����t��#1	937,{
	if(checkquest(9308)) {
		mes "[���@����t��]";
		mes "���@���ŗD������Ƃ́I";
		mes "���΂炵���I";
		next;
		mes "[���@����t��]";
		mes "�T�C���̈ꖇ�ł�";
		mes "�Ⴂ�������炢�ł��B";
		mes "�D�����߂łƂ��������܂��I";
		close;
	}
	if(checkquest(9309)) {
		mes "[���@����t��]";
		mes "����̖��@���ł�";
		mes "�t�F�������l���D�����܂����I";
		next;
		mes "[���@����t��]";
		mes "���@���̎���������";
		mes "�����t�@���ɂȂ��Ă��܂��܂����I";
		close;
	}
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	if(checkquest(9294)) {
		mes "[���@����t��]";
		mes "���@���Ԃ��Ȃ��n�܂�܂��I";
		mes "6�������̓�������";
		mes "���ɎQ�����邱�Ƃ��ł��܂��B";
		next;
		mes "[���@����t��]";
		mes "����ł͂����^���I";
		close;
	}
	if(checkquest(9293) & 0x4) {
		mes "[���@����t��]";
		mes "�������i�A���߂łƂ��������܂��B";
		next;
		mes "[���@����t��]";
		mes "����ł͓o�^�葱����i�߂܂��ˁB";
		mes "�����͖��Ȃ����i�c�c�B";
		mes "�E�Ɓc�c�A�����c�c�B";
		mes "���O�������Ă��������B";
		next;
		menu "�����",-;
		mes "[���@����t��]";
		mes strcharinfo(0)+ "�l�A�ł��ˁB";
		mes "�o�^���܂����B";
		mes "����œo�^�����ł��I";
		next;
		mes "[���@����t��]";
		mes "���@����1�񏟗����邲�Ƃ�";
		mes "�Q�t�F�����@���R�C�������炦�܂��B";
		mes "����o���Ȃ��Ȃ��Ă��܂�ʂ悤";
		mes "�Q�t�F�����@���R�C����";
		mes "�������ɂ͂����ӂ��������I";
		next;
		mes "[���@����t��]";
		mes "���@���͊Ԃ��Ȃ��n�܂�܂��I";
		mes "6�������̓�������";
		mes "���ɎQ�����邱�Ƃ��ł��܂��B";
		next;
		mes "[���@����t��]";
		mes "����ł͂����^���I";
		delquest 9293;
		setquest 9294;
		viewpoint 1, 120, 34, 2, 0x000000;
		hideoffnpc getmdnpcname("#������");
		close;
	}
	if(checkquest(9293)) {
		mes "[���@����t��]";
		mes "���@���Q��������";
		mes "�Ē��킵�܂����H";
		mes "60�b�ȓ��Ɂu�f�U�[�g�E���t�v��";
		mes "�|���΍��i�ƂȂ�܂��B";
		next;
		mes "[���@����t��]";
		mes "�������s�����ꍇ��";
		mes "�������s�ƂȂ�܂����A";
		mes "���ł��Ē��킪�\�ł��B";
		mes "����ł͎������J�n���܂����H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���@����t��]";
			mes "���@���ɎQ�����邱�Ƃ�";
			mes "��ϖ��_�Ȃ��Ƃł��B";
			mes "�C���ς������";
			mes "�܂����炵�Ă��������B";
			close;
		}
		mes "[���@����t��]";
		mes "����΂��Ď��������i��";
		mes "���@���ɎQ���ł����";
		mes "�����ł��ˁB";
		mes "����ł́I�@�J�n�I";
		close2;
		hideoffnpc getmdnpcname("#���@����t2");
		initnpctimer getmdnpcname("#���@����t2");
		unittalk "���@����t�� : �������Ԃ�60�b�ł��I�@����΂��Ă��������I";
		monster getmdmapname("1@gef.gat"),120,62,"�f�U�[�g�E���t",1106,1,getmdnpcname("#���@����t2")+"::OnKilled";
		hideonnpc;
		end;
	}
	mes "[���@����t��]";
	mes "����ɂ��́I";
	mes "�Q�t�F�����@���ɂ悤�����I";
	mes "���p���͂Ȃ�ł��傤���H";
	while(1) {
		next;
		switch(select("�Q�t�F�����@���Q����t:�Q�t�F�����@���ɂ���:�Q�t�F�����@���o���V:��b����߂�")) {
		case 1:
			mes "[���@����t��]";
			mes "���@���̑I��o�^��";
			mes "�ʓr�̎Q����͂���܂���B";
			mes "���A���͂��������Ă��炢�܂��B";
			mes "���̂��߂ɊȒP�Ȏ�����";
			mes "�󂯂Ă��������܂��B";
			next;
			mes "[���@����t��]";
			mes "�����͂������ĊȒP�B";
			mes "�u�f�U�[�g�E���t�v����C";
			mes "�������܂��̂�";
			mes "60�b�ȓ��ɓ|���΍��i�ł��B";
			next;
			mes "[���@����t��]";
			mes "�������s�����ꍇ��";
			mes "�������s�ƂȂ�܂����A";
			mes "���ł��Ē��킪�\�ł��B";
			mes "����ł͎������J�n���܂����H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[���@����t��]";
				mes "���@���ɎQ�����邱�Ƃ�";
				mes "��ϖ��_�Ȃ��Ƃł��B";
				mes "�C���ς������";
				mes "�܂����炵�Ă��������B";
				break;
			}
			mes "[���@����t��]";
			mes "����΂��Ď��������i��";
			mes "���@���ɎQ���ł����";
			mes "�����ł��ˁB";
			mes "����ł́I�@�J�n�I";
			close2;
			hideoffnpc getmdnpcname("#���@����t2");
			initnpctimer getmdnpcname("#���@����t2");
			unittalk "���@����t�� : �������Ԃ�60�b�ł��I�@����΂��Ă��������I";
			setquest 9293;
			monster getmdmapname("1@gef.gat"),120,62,"�f�U�[�g�E���t",1106,1,getmdnpcname("#���@����t2")+"::OnKilled";
			hideonnpc;
			end;
		case 2:
			mes "[���@����t��]";
			mes "�Q�t�F�����@����";
			mes "3�N���ɊJ�����";
			mes "���@�Ղ̒��ł�";
			mes "�������ɍō���̍s���ł��B";
			next;
			mes "[���@����t��]";
			mes "�ȑO�͖��@������";
			mes "���ʂ𔭕\�����W������A";
			mes "�������@��b������";
			mes "�s���ł������A���Ԃ��o�ɂ��";
			mes "���݂̂��Ղ̂悤��";
			mes "�s���ɂȂ�܂����B";
			next;
			mes "[���@����t��]";
			mes "���@�Ղ̉؂ł���";
			mes "���@���ł��̂ŁA";
			mes "���E���̃}�W�V�������W�܂�܂��B";
			mes "���ɂ͑����Ȏ��͎҂�����̂�";
			mes "���Ƀ��x���̍������ƂȂ�܂��B";
			break;
		case 3:
			mes "[���@����t��]";
			mes "�Q�t�F�����@���ɂ�";
			mes "�悢���т��グ���";
			mes "�Q�t�F�����@���R�C����";
			mes "�󂯎�邱�Ƃ��ł��܂��B";
			next;
			mes "[���@����t��]";
			mes "�R�C���͖��@���ɎQ���������݂̂�";
			mes "���z�肵�Ă�����̂ŁA";
			mes "������W�߂Ă���l����R���܂��B";
			break;
		case 4:
			mes "[���@����t��]";
			mes "����ł̓Q�t�F�����@����";
			mes "�S�s���܂Ŋy����ł��������B";
			close;
		}
		next;
		mes "[���@����t��]";
		mes "���ɂ��p���͂���܂����H";
	}
	end;
}

1@gef.gat,120,46,0	script(HIDDEN)	#���@����t2	139,{
	end;
OnKilled:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@����t��#1");
	hideonnpc;
	end;
OnTimer60000:
	stopnpctimer;
	killmonster getmdmapname("1@gef.gat"),getmdnpcname("���@����t��#1")+"::OnKilled";
	hideoffnpc getmdnpcname("���@����t��#1");
	unittalk getnpcid(0,getmdnpcname("���@����t��#1")),"���@����t�� : ���s���Ă��܂��܂����ˁB�܂��̒�������҂����Ă��܂�";
	hideonnpc;
	end;
}

1@gef.gat,120,34,0	script(HIDDEN)	#������	45,2,2,{
	end;
OnTouch:
	hideonnpc;
	set .Progress,0;
	warp getmdmapname("1@ge_st.gat"),104,50;
	end;
}

1@gef.gat,119,213,0	script(HIDDEN)	#���o��	45,2,2,{
	mes "�]�������玟���̋��Ԃ�";
	mes "�@�ړ����邱�Ƃ��ł���悤�ł��B";
	mes "�@���@�����I������";
	mes "�@�����̋��ԁA���̒ʘH��";
	mes "�@�߂�܂����H�]";
	next;
	if(select("��������������Ă݂�","�����̋��Ԃɖ߂�") == 1) {
		mes "�]���Ȃ��͂��̏�𗣂ꂽ�]";
		close;
	}
	warp "dali.gat",94,144;
	end;
}

//==========================================
// ���@���i�s�W
//------------------------------------------
// �u���@���i�s�W#1�v���u�A�J�f�~�[�}�X�^�[#�v�������́u#�������A�i�E���X_timer�v���Ăяo���A���g���n�C�h�I���B
// �i�X�L�b�v�j�u�A�J�f�~�[�}�X�^�[#�v���u#�������A�i�E���X_timer�v���Ăяo���B
// �u#�������A�i�E���X_timer�v��monster�𔭐�������B�i�t�F�������̂݌�����A�i�E���X_timer�j
// OnKilled�C�x���g�Łu#�ΐ푊��Ǘ��v���Ăяo��
// �u#�ΐ푊��Ǘ��v���u�ΐ푊��̃C�x���g�v���Ăяo���B
// �u�ΐ푊��̃C�x���g�v���u���@���i�s�W#1�v���n�C�h�I�t�B�i�t�F�������̂ݖ��@���i�s�W#2�j
//------------------------------------------
1@ge_st.gat,107,57,4	script	���@���i�s�W#1	899,{
	set '@Skip,0;
	if(.Progress == 0) {
		set '@prog,callfunc("#���@���i�s�x",1);
		if('@prog > 0) {
			mes "[���@���i�s�W]";
			mes "�������1�������J�n�v���܂��B";
			mes "�I��Љ�Ȃǂ�������";
			mes "�����Ɏ������J�n�ł��܂���";
			mes "�������v���܂����H";
			next;
			if(select("�����ɑ�1�������n�߂�","��b�𕷂�") == 1) {
				set '@Skip,1;
				close2;
			}
		}
		hideoffnpc getmdnpcname("�A�J�f�~�[�}�X�^�[#1");
		if('@Skip == 0) {
			cutin "acamaster_a.bmp", 2;
			mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
			mes "���f�B�[�X�A���h�W�F���g�������I";
			mes "�������j�Ɠ`�������Â�";
			mes "�Q�t�F�����@����";
			mes "�悤������������Ⴂ�܂����I";
			next;
			mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
			mes "3�N���ɊJ�����";
			mes "�ō��̃C�x���g!!";
			mes "�Q�t�F�����@���!!";
			next;
			mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
			mes "�Q�t�F�����@����A�g��B�g��";
			mes "������ė\�I���i�߂��";
			mes "������A�g��B�g��";
			mes "�ŏI�����ғ��m�̑Ό��ƂȂ�܂��I";
			next;
			mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
			mes "����A�g�̎i���S������";
			mes "�Q�t�F���A�J�f�~�[�}�X�^�[!!";
			mes "�A�[�N���C�W�A�U���W�o���E�w�����[�h";
			mes "�Ɛ\���܂��I";
			next;
			mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
			mes "�{���͂��̉h�_����i�����";
			mes "�C���ꂽ���ƂɊ��ӂ������܂��I";
			mes "���낻��J�n�̎��Ԃ������Ă��܂����I";
			next;
			mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
			mes "�S�z���c�c�Q�z�Q�z�I";
			close2;
			cutin "acamaster_a.bmp", 255;
		}
		hideonnpc getmdnpcname("���@���i�s�W#1");
		set .MobName$,"�A���q";
		set .MobNum,2549;
		delquest 9294;
		setquest 9295;
		set .Progress,1;
		if('@Skip == 0) {
			set .Sleep,0;
			donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnStart";
			end;
		}
		set .Sleep,5000;
		hideoffnpc getmdnpcname(.MobName$+ "#1");
		warp getmdmapname("1@ge_st.gat"),104,50;
		donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
		end;
	}
	set '@Game1,.Progress;
	set .Progress,.Progress+1;
	if(.Progress <= 10) {
		set '@Game1$,"��" +'@Game1+ "����";
		set '@Game2$,"��" +.Progress+ "����";
	} else if(.Progress == 11) {
		set '@Game1$,"��" +'@Game1+ "����";
		set '@Game2$,"���X����";
	} else if(.Progress == 12) {
		set '@Game1$,"���X����";
		set '@Game2$,"������";
	} else if(.Progress == 13) {
		set '@Game1$,"������";
		set '@Game2$,"����";
	}
	mes "[���@���i�s�W]";
	mes '@Game1$+ "�������c��܂�����!!";
	mes "���߂łƂ��������܂��I";
	next;
	if(.Progress == 3) {
    	set .flag3,3;
    	if(checkquest(9290)) set .flag3,1;
    	if(checkquest(9291)) set .flag3,2;
    }
	if(.Progress == 12) {
	    set .flag12,rand(1,2);
	}
	set '@Sel1$,"";
	switch(.Progress) {
	case 2: if(callfunc("#���@���i�s�x",2)) set '@Sel1$,"-"; break;
	case 3: if(.flag3 == 1 && callfunc("#���@���i�s�x",3)) set '@Sel1$,"-";
			if(.flag3 == 2 && callfunc("#���@���i�s�x",4)) set '@Sel1$,"-";
			if(.flag3 == 3 && callfunc("#���@���i�s�x",5)) set '@Sel1$,"-";
			break;
	case 4: if(callfunc("#���@���i�s�x",6)) set '@Sel1$,"-"; break;
	case 5: if(callfunc("#���@���i�s�x",7)) set '@Sel1$,"-"; break;
	case 6: if(callfunc("#���@���i�s�x",8)) set '@Sel1$,"-"; break;
	case 7: if(callfunc("#���@���i�s�x",9)) set '@Sel1$,"-"; break;
	case 8: if(callfunc("#���@���i�s�x",10)) set '@Sel1$,"-"; break;
	case 9: if(callfunc("#���@���i�s�x",11)) set '@Sel1$,"-"; break;
	case 10:if(callfunc("#���@���i�s�x",12)) set '@Sel1$,"-"; break;
	case 11:if(callfunc("#���@���i�s�x",13)) set '@Sel1$,"-"; break;
	case 12:if(.flag12 == 1 && callfunc("#���@���i�s�x",14)) set '@Sel1$,"-";
			if(.flag12 == 2 && callfunc("#���@���i�s�x",15)) set '@Sel1$,"-";
			break;
	case 13: if(checkquest(115595) & 0x8) set '@Sel1$,"-"; break;
	}
	if('@Sel1$ == "-")
		set '@Sel1$,"������" +'@Game2$+ "���n�߂�";
	set '@Sel2$,'@Game2$+ "���n�߂�";
	switch(select('@Sel1$,'@Sel2$,"��b���I������","�����Ŏ�������������")) {
	case 1:
		set '@Skip,1;
	case 2:
		if(.Progress <= 12) {
			mes "[���@���i�s�W]";
			mes "�����ɏ��������I��ɂ�";
			mes "�����蓖�ĂƂ���";
			mes "^006400�Q�t�F�����@���R�C��^000000��";
			mes "���n�����Ă��܂��B";
			next;
			if(checkitemblank() == 0) {
				mes "[���@���i�s�W]";
				mes "����c�c";
				mes "�ו��������ēn���܂���ˁB";
				mes "��ސ������炵�Ă��Ă��炦�܂����H";
				close;
			}
			mes "[���@���i�s�W]";
			mes "����ł͎���A�g" +'@Game2$+ "��";
			mes "�n�߂����Ǝv���܂��I";
		} else {
			if(checkitemblank() == 0) {
				mes "[���@���i�s�W]";
				mes "����c�c";
				mes "�ו��������ēn���܂���ˁB";
				mes "��ސ������炵�Ă��Ă��炦�܂����H";
				close;
			}
			mes "[���@���i�s�W]";
			mes "����ł͍Ō�̎����c�c";
			mes "�����킾���ł��ˁB";
			mes "�����^���I";
		}
		close2;
		callsub CoinExp,'@Game1;
		hideonnpc getmdnpcname("���@���i�s�W#1");
		hideonnpc getmdnpcname("���@����Ô�#1");
		switch(.Progress) {
		case 2:
			set .MobName$,"�f�B�I�E�A�l���X";
			set .MobNum,2550;
			delquest 9295;
			setquest 9296;
			break;
		case 3:
			if(.flag3 == 1) {
				set .MobName$,"�r���[�E�R�X�����[�X";
				set .MobNum,2553;
				delquest 9296;
				setquest 9297;
			}
			if(.flag3 == 2) {
				set .MobName$,"�q�s�A�E�X�j�L";
				set .MobNum,2552;
				delquest 9296;
				setquest 9297;
			}
			if(.flag3 == 3) {
				set .MobName$,"�u���b�N�E�J�l�C���[";
				set .MobNum,2551;
				delquest 9296;
				setquest 9297;
			}
			break;
		case 4:
			set .MobName$,"�t�F����";
			set .MobNum,2554;
			delquest 9297;
			setquest 9298;
			break;
		case 5:
			set .MobName$,"�I���h��";
			set .MobNum,2555;
			delquest 9298;
			setquest 9299;
			break;
		case 6:
			set .MobName$,"�u���[�g�E�n�[";
			set .MobNum,2556;
			delquest 9299;
			setquest 9300;
			break;
		case 7:
			set .MobName$,"����";
			set .MobNum,2557;
			delquest 9300;
			setquest 9301;
			break;
		case 8:
			set .MobName$,"�C�t�H�h�X";
			set .MobNum,2558;
			delquest 9301;
			setquest 9302;
			break;
		case 9:
			set .MobName$,"���`�F�j�G";
			set .MobNum,2559;
			delquest 9302;
			setquest 9303;
			break;
		case 10:
			set .MobName$,"�����q��";
			set .MobNum,2560;
			delquest 9303;
			setquest 9304;
			break;
		case 11:
			set .MobName$,"�W���[";
			set .MobNum,2561;
			delquest 9304;
			setquest 9305;
			break;
		case 12:
			if(.flag12 == 1) {
				set .MobName$,"�f�B���C";
				set .MobNum,2562;
				delquest 9305;
				setquest 9306;
			}
			if(.flag12 == 2) {
				set .MobName$,"�t�F�C�E�J�i�r�A��";
				set .MobNum,2563;
				delquest 9305;
				setquest 9306;
			}
			break;
		case 13:
			set .MobName$,"�t�F������";
			set .MobNum,2564;
			delquest 9306;
			setquest 9307;
			break;
		}
		if('@Skip == 0 && .Progress != 13)
			set .Sleep,27000 + 5000;
		if('@Skip == 0 && .Progress == 13)
			set .Sleep,31000 + 5000;
		if('@Skip == 1)
			set .Sleep,5000;
		if(.Progress != 3 && .Progress != 13)
			hideoffnpc getmdnpcname(.MobName$+ "#1");
		if(.Progress == 3)
			hideoffnpc getmdnpcname(.MobName$+ "#n1");
		if(.Progress == 13)
			hideoffnpc getmdnpcname(.MobName$+ "#13");
		warp getmdmapname("1@ge_st.gat"),104,50;
		if('@Skip == 0) {
			if(.Progress != 3 && .Progress != 12)
				donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#" +.Progress)+"::OnStart";
			if(.Progress == 3)
				donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#" +.Progress+.flag3)+"::OnStart";
			if(.Progress == 12)
				donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#" +.Progress+.flag12)+"::OnStart";
			end;
		}
		if(.Progress != 13)
			donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
		if(.Progress == 13)
			donpcevent getmdnpcname("#������A�i�E���X_timer")+"::OnStart";
		end;
	case 3:
		mes "[���@���i�s�W]";
		mes "�������������܂�����";
		mes "�b�������Ă��������B";
		close;
	case 4:
		mes "[���@���i�s�W]";
		mes "�����I";
		mes "�����Ŏ�������������̂ł����H";
		mes "�������Ă������蓖�Ă�";
		mes "^006400�Q�t�F�����@���R�C��^000000��";
		mes "������Ƃ��n�����܂����c�c�B";
		next;
		mes "[���@���i�s�W]";
		mes "�{���Ɋ������܂����H";
		next;
		if(select("�����蓖�Ă�������Ċ�������","��������̂���߂�") == 2) {
			mes "[���@���i�s�W]";
			mes "����ς�������Ȃ��̂ł��ˁB";
			mes "�킩��܂����B";
			close;
		}
		mes "[���@���i�s�W]";
		mes "�킩��܂����B";
		mes "��������������葱�����s���܂��B";
		mes "���̑O�ɁA";
		mes "^006400�Q�t�F�����@���R�C��^000000�����n�����܂��B";
		next;
		if(checkitemblank() == 0) {
			mes "[���@���i�s�W]";
			mes "����c�c";
			mes "�ו��������ēn���܂���ˁB";
			mes "��ސ������炵�Ă��Ă��炦�܂����H";
			close;
		}
		mes "[���@���i�s�W]";
		mes "�ł́A�����ł͎��̎����̕���";
		mes "�ז��ɂȂ�܂��̂�";
		mes "�o���Ɉړ����܂��B";
		close2;
		callsub CoinExp,'@Game1;
		hideoffnpc getmdnpcname("#���@���I��1");
		end;
	}
CoinExp:
	switch(getarg(0)) {
	case 1:
	case 2:
		getitem 6671, 5;
		return;
	case 3:
		getitem 6671, 5;
		set '@Exp,200000;
		set '@Job,100000;
		break;
	case 4:
	case 5:
		getitem 6671, 5;
		return;
	case 6:
		getitem 6671, 15;
		set '@Exp,400000;
		set '@Job,200000;
		break;
	case 7:
	case 8:
		getitem 6671, 5;
		return;
	case 9:
		getitem 6671, 20;
		set '@Exp,600000;
		set '@Job,300000;
		break;
	case 10:
		getitem 6671, 5;
		return;
	case 11:
		getitem 6671, 10;
		return;
	case 12:
		getitem 6671, 10;
		set '@Exp,1000000;
		set '@Job,500000;
		break;
	}
	getexp '@Exp,0,0;
	getexp '@Exp,0,0;
	getexp '@Exp,0,0;
	getexp '@Exp,0,0;
	getexp '@Exp,0,0;
	getexp 0,'@Job,0;
	getexp 0,'@Job,0;
	getexp 0,'@Job,0;
	getexp 0,'@Job,0;
	getexp 0,'@Job,0;
	return;
}

1@ge_st.gat,107,57,4	script(HIDDEN)	���@���i�s�W#2	899,{
	mes "[���@���i�s�W]";
	mes "���@���ł̗D��!!";
	mes "�{���ɂ��߂łƂ��������܂��I";
	next;
	if(select("�����蓖�Ă�������Ď�����ꂩ��ł�","��b���I������") == 2) {
		mes "[���@���i�s�W]";
		mes "�D�����߂łƂ��������܂��I";
		close;
	}
	mes "[���@���i�s�W]";
	mes "���A���Ŏi��𖱂߂�";
	mes "�Q�t�F���A�J�f�~�[�}�X�^�[���񂩂�";
	mes "���b���������Ƃ����邻���ł��B";
	next;
	cutin "acamaster_a.bmp", 2;
	mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
	mes "���߂łƂ��������܂��I";
	mes "�Q�t�F���ō��̂��ՁA";
	mes "���@���ōō��̎�����������";
	mes "���Ȃ��Ɍh�ӂ�\���܂��B";
	next;
	mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
	mes "���Ȃ��̖�����";
	mes "�L�����E�ɍ������Ƃł��傤�B";
	mes "�����đ����̐l�X��";
	mes "�����̌�����ɂ��Ē��炭";
	mes "���p�����Ƃł��傤�B";
	next;
	mes "[�Q�t�F���A�J�f�~�[�}�X�^�[]";
	mes "������x�A�D�����߂łƂ��������܂��I";
	mes "�Q�t�F���A�J�f�~�[�}�X�^�[�ł���";
	mes "�����̎i��Ƃ���";
	mes "���ӂ������܂��B";
	mes "�c��̃Q�t�F���Ղ�S�s���܂�";
	mes "���y���݂�������!!";
	cutin "acamaster_a.bmp", 255;
	if(checkquest(9290)) delquest 9290;
	if(checkquest(9291)) delquest 9291;
	if(checkquest(9292)) delquest 9292;
	setquest 9308;
	close2;
	delquest 9307;
	getitem 6671, 15;
	getexp 2000000,0,0;
	getexp 2000000,0,0;
	getexp 2000000,0,0;
	getexp 2000000,0,0;
	getexp 2000000,0,0;
	getexp 0,1000000,0;
	getexp 0,1000000,0;
	getexp 0,1000000,0;
	getexp 0,1000000,0;
	getexp 0,1000000,0;
	donpcevent getmdnpcname("#���@���I��1")+"::OnStart";
	end;
}

//==========================================
// �������A�i�E���X_timer
//------------------------------------------
1@ge_st.gat,92,51,0		script	#�������A�i�E���X_timer	139,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �������Ԃ�3���I�@�������ԓ��ɏ��������Ȃ��ꍇ��", 0x9, 0xffff00, 0x0190, 14, 0, 0;
	end;
OnTimer3000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R������Ō��肳��܂��I�@����ł͎����c�c", 0x1, 0xffff00, 0x190, 14, 0, 0;
	end;
OnTimer5000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �n��!!!!", 0x1, 0xffff00, 0x190, 18, 0, 0;
	if(.Progress != 3 && .Progress != 13)
		hideonnpc getmdnpcname(.MobName$+ "#1");
	if(.Progress == 3)
		hideonnpc getmdnpcname(.MobName$+ "#n1");
	if(.Progress == 13)
		hideonnpc getmdnpcname(.MobName$+ "#13");
	monster getmdmapname("1@ge_st.gat"),114,50,.MobName$,.MobNum,1,getmdnpcname("#�ΐ푊��Ǘ�")+ "::OnKilled";
	if(.Progress == 12 && .flag12 == 2) {
		hideoffnpc getmdnpcname("#�A���t�H������");
		monster getmdmapname("1@ge_st.gat"),111,49,"�A���t�H��",2565,1,getmdnpcname("#�A���t�H������")+ "::OnKilled";
	}
	end;
OnTimer6000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����A�������n�܂�܂����I�@�ǂ̂悤�Ȍ��ʂɂȂ�̂������猩���̂ł��I";
	end;
OnTimer65000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : �c�莞��2���ƂȂ�܂����I�@���M�����킢�ł��I", 0x9, 0xffff00;
	end;
OnTimer95000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : �c�莞��1��30�b�I�@������؂�܂����I", 0x9, 0xffff00;
	end;
OnTimer125000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : �c�莞�Ԃ���1���ɂȂ�܂����I", 0x9, 0xffff00;
	end;
OnTimer155000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : �c��30�b!!�@���̂܂ܔ���܂Ŏ����z���ɂȂ�̂�!!", 0x9, 0xffff00;
	end;
OnTimer165000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : ����20�b!!�@�ٔ����Ă܂���܂����I", 0x9, 0xffff00;
	end;
OnTimer175000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 10!!", 0x9, 0xffff00;
	end;
OnTimer176000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 9!!", 0x9, 0xffff00;
	end;
OnTimer177000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 8!!", 0x9, 0xffff00;
	end;
OnTimer178000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 7!!", 0x9, 0xffff00;
	end;
OnTimer179000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 6!!", 0x9, 0xffff00;
	end;
OnTimer180000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 5!!", 0x9, 0xffff00;
	end;
OnTimer181000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 4!!", 0x9, 0xffff00;
	end;
OnTimer182000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 3!!", 0x9, 0xffff00;
	end;
OnTimer183000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 2!!!!", 0x9, 0xffff00;
	end;
OnTimer184000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : 1!!!!!!", 0x9, 0xffff00;
	end;
OnTimer185000:
	killmonster getmdmapname("1@ge_st.gat"),getmdnpcname("#�ΐ푊��Ǘ�")+ "::OnKilled";
	if(.Progress == 12 && .flag12 == 2)
		killmonster getmdmapname("1@ge_st.gat"),getmdnpcname("#�A���t�H������")+ "::OnKilled";
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : ����`���`!!�@���Ԑ؂�̂��߁A�R������Ɏ����z����܂��I", 0x9, 0xffff00, 0x0190, 18, 0, 0;
	end;
OnTimer190000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : ���ݐR�����蒆�ł��̂ł��΂炭���҂���������!!", 0x9, 0xffff00;
	end;
OnTimer195000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[  : ���[���ƁI�@�ǂ����R�����肪�o���悤�ł�!!�@���ʂ͂�����!!", 0x9, 0xffff00;
	end;
OnTimer198000:
	set '@Lose,rand(75,89);
	set '@Win,'@Lose + rand(1,5);
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �ŏ��̐R���̔���́c�c" +'@Lose+ " : " +'@Win+ "!!";
	end;
OnTimer200000:
	set '@Lose,rand(74,88);
	set '@Win,'@Lose + rand(1,5);
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă̐R���̔���́c�c" +'@Win+ " : " +'@Lose+ "!!";
	end;
OnTimer202000:
	set '@Lose,rand(70,84);
	set '@Win,'@Lose + rand(1,5);
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �Ō�̐R������́c�c" +'@Win+ " : " +'@Lose+ "!!";
	end;
OnTimer204000:
	if(.Progress == 1)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1�ŏ����҂͉��ʂ̃m�[�r�X�I�@�A���q!!";
	if(.Progress == 2)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@A�g��2�����̏����҂́I�@�S�����͑喂�@�g���I�@�f�B�I�E�A�l���X�B";
	if(.Progress == 3 && .flag3 == 1)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋��!!�@2��1��A�g��3�����̏����҂́I�@�r���������D���I�@�r���[�E�R�X�����[�X!!";
	if(.Progress == 3 && .flag3 == 2)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋��!!�@2��1��A�g��3�����̏����҂́I�@�Z�M�g�؂荞�ݑ����I�@�q�s�A�E�X�j�L!!!";
	if(.Progress == 3 && .flag3 == 3)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R���̔��茋�ʁA2��1��A�g��3�����̏����҂�!!�@�u���O��Zeny������Zeny�A����Zeny�͉���Zeny�v�M���h�̃}�X�^�[!!�@�u���b�N�E�J�l�C���[!!!";
	if(.Progress == 4)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��4�����̏����҂́I�@�킵�̃v�����e��!!�@�t�F����!!";
	if(.Progress == 5)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��5�����̏����҂�!!�@�w�͔h�퓬�}�X�^�[!!�@�I���h��!!!";
	if(.Progress == 6)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��6�����̏����҂́I�@���h��ꂽ������!!�@�u���[�g�E�n�[!!!";
	if(.Progress == 7)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��7�����̏����҂́I�@�����̉�I�@����!!";
	if(.Progress == 8)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��8�����̏����҂�!!�@�S�ǂ̖h��I�@�C�t�H�h�X!!";
	if(.Progress == 9)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��9�����̏����҂�!!�@���̃��f�B�[!!�@���`�F�j�G!!";
	if(.Progress == 10)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g��10�����̏����҂�!!�@���𓱂��x���I�@�����q��!!";
	if(.Progress == 11)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g���X�����̏����҂�!!�@����퓬�̒B�l!!�@�W���[!!!";
	if(.Progress == 12 && .flag12 == 1)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g�Ō�̎����A�������̏����҂�!!�@���̃}�G�X�g��!!�@�f�B���C!!!";
	if(.Progress == 12 && .flag12 == 2)
		unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1��A�g�Ō�̎����A�������̏����҂�!!�@�A���f�o�����̘B���p�t�I�@�t�F�C�E�J�i�r�A��!!!";
	end;
OnTimer206000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �s�k���Ă��܂����I��ɂ͗�܂��̔�������肢�v���܂��I";
	if(.Progress != 3) set '@str$,"#1";
	if(.Progress == 3) set '@str$,"#n1";
	set .Sleep,0;
	hideoffnpc getmdnpcname(.MobName$+'@str$);
	setnpctimer 100000,getmdnpcname(.MobName$+'@str$);
	startnpctimer getmdnpcname(.MobName$+'@str$);
	end;
OnTimer208000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �܂��A�s�k�����I��͎����i�s�̂��߁A�����I�Ɏ�����ꂩ��ړ����Ă��������܂��̂ł��������������I";
	end;
}

1@ge_st.gat,92,51,0		script	#������A�i�E���X_timer	139,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ������͐�������5���ƂȂ��Ă���܂��I�@�������ԓ��ɏ��������Ȃ��ꍇ�́I", 0x9, 0xffff00, 0x0190, 14, 0, 0;
	end;
OnTimer3000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R������Ō��肳��܂��I�@����ł͎����c�c", 0x1, 0xffff00, 0x190, 14, 0, 0;
	end;
OnTimer5000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �n��!!!!", 0x1, 0xffff00, 0x190, 18, 0, 0;
	hideonnpc getmdnpcname(.MobName$+ "#13");
	monster getmdmapname("1@ge_st.gat"),114,50,.MobName$,.MobNum,1,getmdnpcname("#�ΐ푊��Ǘ�")+ "::OnKilled";
	end;
OnTimer6000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���Ɍ����킪�n�܂�܂���!!�@��Ɋ������鎎���ł��I", 0x9, 0xffff00;
	end;
OnTimer65000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c�莞��4���I�@�܂��܂����ʂ͂킩��܂���!!", 0x9, 0xffff00;
	end;
OnTimer125000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c��3����؂�܂����I�@���҂͂ǂ���ɂȂ�̂�!!", 0x9, 0xffff00;
	end;
OnTimer185000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c�莞��2���I�@�����A�ǂ��Ȃ�I", 0x9, 0xffff00;
	end;
OnTimer215000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 1��30�b�ł��I�@�c�莞�Ԃ킸���ɂȂ��ė��܂����I", 0x9, 0xffff00;
	end;
OnTimer245000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c�莞��1���I�@���������܂���I", 0x9, 0xffff00;
	end;
OnTimer275000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c�莞��30�b!!�@�����ɂӂ��킵���킢�ł��I", 0x9, 0xffff00;
	end;
OnTimer285000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c�莞��20�b�I�@�ٔ����Ă܂���܂����I", 0x9, 0xffff00;
	end;
OnTimer295000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �c�莞��10�b�I�@�����A�ǂ��炪��������ɂ���̂��I", 0x9, 0xffff00;
	end;
OnTimer296000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 9�b�I", 0x9, 0xffff00;
	end;
OnTimer297000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 8�b�I", 0x9, 0xffff00;
	end;
OnTimer298000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 7�b�I", 0x9, 0xffff00;
	end;
OnTimer299000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 6�b�I", 0x9, 0xffff00;
	end;
OnTimer300000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 5�b�I", 0x9, 0xffff00;
	end;
OnTimer301000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 4�b�I", 0x9, 0xffff00;
	end;
OnTimer302000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 3�b�I", 0x9, 0xffff00;
	end;
OnTimer303000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 2�b�I", 0x9, 0xffff00;
	end;
OnTimer304000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 1�b�I", 0x9, 0xffff00;
	end;
OnTimer305000:
	killmonster getmdmapname("1@ge_st.gat"),getmdnpcname("#�ΐ푊��Ǘ�")+ "::OnKilled";
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����I��!!�@���Ɏ��ԓ��ɂ͌��������܂���ł����I", 0x9, 0xffff00, 0x0190, 18, 0, 0;
	end;
OnTimer307000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł͐R���̕��X�ɔ�������肢���܂��傤�I", 0x9, 0xffff00;
	end;
OnTimer309000:
	mapannounce getmdmapname("1@ge_st.gat"),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���茋�ʂ��o�܂����I�@���Q�t�F�����@���̗D���҂�!!", 0x9, 0xffff00;
	end;
OnTimer311000:
	set '@Lose,rand(75,89);
	set '@Win,'@Lose + rand(1,5);
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �ŏ��̐R���̔���́c�c" +'@Lose+ " : " +'@Win+ "!!";
	end;
OnTimer313000:
	set '@Lose,rand(74,88);
	set '@Win,'@Lose + rand(1,5);
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă̐R���̔���́c�c" +'@Win+ " : " +'@Lose+ "!!";
	end;
OnTimer315000:
	set '@Lose,rand(70,84);
	set '@Win,'@Lose + rand(1,5);
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �Ō�̐R������́c�c" +'@Win+ " : " +'@Lose+ "!!";
	end;
OnTimer317000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �R�����茋�ʁI�@2��1�ŃQ�t�F�����@������̗D���҂�!!�@�������̖����m!!�@�t�F�����X�E�t�F������!!!!";
	end;
OnTimer319000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �s�k���Ă��܂����I��ɂ͗�܂��̔�������肢�v���܂��I";
	end;
OnTimer321000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �܂��A�s�k�����I��͎����i�s�̂��߁A�����I�Ɏ�����ꂩ��ړ����Ă��������܂��̂ł��������������I";
	set .Sleep,0;
	hideoffnpc getmdnpcname(.MobName$+"#13");
	setnpctimer 100000,getmdnpcname(.MobName$+"#13");
	startnpctimer getmdnpcname(.MobName$+"#13");
	end;
}

//==========================================
// ���^�c���̑�
//------------------------------------------
1@ge_st.gat,109,49,0	script	#�ΐ푊��Ǘ�	139,{
	end;
OnKilled:
	if(.Progress != 13)
		stopnpctimer getmdnpcname("#�������A�i�E���X_timer");
	if(.Progress == 13)
		stopnpctimer getmdnpcname("#������A�i�E���X_timer");
	switch(.Progress) {
	case 1:
		set '@value,1;
		set '@quest1,115550;
		set '@quest2,115551;
		set '@quest3,115552;
		break;
	case 2:
		set '@value,2;
		set '@quest1,115553;
		set '@quest2,115554;
		set '@quest3,115555;
		break;
	case 3:
    	if(.flag3 == 1) {
			set '@value,3;
			set '@quest1,115556;
			set '@quest2,115557;
			set '@quest3,115558;
		}
    	if(.flag3 == 2) {
			set '@value,4;
			set '@quest1,115559;
			set '@quest2,115560;
			set '@quest3,115561;
		}
    	if(.flag3 == 3) {
			set '@value,5;
			set '@quest1,115562;
			set '@quest2,115563;
			set '@quest3,115564;
		}
		break;
	case 4:
		set '@value,6;
		set '@quest1,115565;
		set '@quest2,115566;
		set '@quest3,115567;
		break;
	case 5:
		set '@value,7;
		set '@quest1,115568;
		set '@quest2,115569;
		set '@quest3,115570;
		break;
	case 6:
		set '@value,8;
		set '@quest1,115571;
		set '@quest2,115572;
		set '@quest3,115573;
		break;
	case 7:
		set '@value,9;
		set '@quest1,115574;
		set '@quest2,115575;
		set '@quest3,115576;
		break;
	case 8:
		set '@value,10;
		set '@quest1,115577;
		set '@quest2,115578;
		set '@quest3,115579;
		break;
	case 9:
		set '@value,11;
		set '@quest1,115580;
		set '@quest2,115581;
		set '@quest3,115582;
		break;
	case 10:
		set '@value,12;
		set '@quest1,115583;
		set '@quest2,115584;
		set '@quest3,115585;
		break;
	case 11:
		set '@value,13;
		set '@quest1,115586;
		set '@quest2,115587;
		set '@quest3,115588;
		break;
	case 12:
		if(.flag12 == 1) {
			set '@value,14;
			set '@quest1,115587;
			set '@quest2,115588;
			set '@quest3,115589;
		}
		if(.flag12 == 2) {
			set '@value,15;
			set '@quest1,115590;
			set '@quest2,115591;
			set '@quest3,115592;
		}
		break;
	case 13:
		if(!checkquest(115595)) {
			setquest 115595;
			compquest 115595;
		}
		break;
	}
	set '@prog,callfunc("#���@���i�s�x",'@value);
	if('@prog >= 7)
		set '@quest,0;
	else
		set '@quest,'@prog+1;
	if('@quest | 0x1) {
		setquest '@quest1;
		compquest '@quest1;
	} else if(checkquest('@quest1)) {
		setquest '@quest1;
		delquest '@quest1;
	}
	if('@quest | 0x2) {
		setquest '@quest2;
		compquest '@quest2;
	} else if(checkquest('@quest2)) {
		setquest '@quest2;
		delquest '@quest2;
	}
	if('@quest | 0x4) {
		setquest '@quest3;
		compquest '@quest3;
	} else if(checkquest('@quest3)) {
		setquest '@quest3;
		delquest '@quest3;
	}
	set .Sleep,0;
	if(.Progress != 3 && .Progress != 13)
		donpcevent getmdnpcname(.MobName$+ "#1")+"::OnStart";
	if(.Progress == 3)
		donpcevent getmdnpcname(.MobName$+ "#n1")+"::OnStart";
	if(.Progress == 13) {
		donpcevent getmdnpcname(.MobName$+ "#13")+"::OnStart";
	}
	end;
}

1@ge_st.gat,109,49,0	script(HIDDEN)	#���@���I��1	139,21,12,{
	end;
OnTouch:
	switch(.Progress) {
	case 1:		// �A���q
		delquest 9295;
		setquest 9309;
		break;
	case 2:		// �f�B�I�E�A�l���X
		delquest 9296;
		setquest 9309;
		break;
	case 3:
		if(.flag3 == 1) {		// �r���[�E�R�X�����[�X
			delquest 9290;
			delquest 9297;
			setquest 9309;
		}
		if(.flag3 == 2) {		// �q�s�A�E�X�j�L
			delquest 9291;
			delquest 9297;
			setquest 9309;
		}
		if(.flag3 == 3) {		// �u���b�N�E�J�l�C���[
			delquest 9292;
			delquest 9297;
			setquest 9309;
		}
		break;
	case 4:		// �t�F����
		delquest 9298;
		setquest 9309;
		break;
	case 5:		// �I���h��
		delquest 9299;
		setquest 9309;
		break;
	case 6:		// �u���[�g�E�n�[
		delquest 9300;
		setquest 9309;
		break;
	case 7:		// ����
		delquest 9301;
		setquest 9309;
		break;
	case 8:		// �C�t�H�h�X
		delquest 9302;
		setquest 9309;
		break;
	case 9:		// ���`�F�j�G
		delquest 9303;
		setquest 9309;
		break;
	case 10:		// �����q��
		delquest 9304;
		setquest 9309;
		break;
	case 11:		// �W���[
		delquest 9305;
		setquest 9309;
		break;
	case 12:
		if(.flag12 == 1) {		// �f�B���C
			delquest 9306;
			setquest 9309;
		}
		if(.flag12 == 2) {		// �t�F�C�E�J�i�r�A��
			delquest 9306;
			setquest 9309;
		}
		break;
	case 13:		// �t�F������
		delquest 9307;
		setquest 9309;
		break;
	}
	goto OnStart;
	end;
OnStart:
	hideoffnpc getmdnpcname("�A�C���X#a1");
	hideoffnpc getmdnpcname("�P�C�I�X#a1");
	hideoffnpc getmdnpcname("���f�B�A#a1");
	hideoffnpc getmdnpcname("�t�F������#a1");
	hideoffnpc getmdnpcname("���L#a1");
	hideoffnpc getmdnpcname("#���o��");
	hideonnpc getmdnpcname("�ē��v��#5");
	hideoffnpc getmdnpcname("�ē��v��#6");
	mapwarp getmdmapname("1@ge_st.gat"), getmdmapname("1@gef.gat"), 120, 104;
	end;
}

1@ge_st.gat,109,49,0	script(HIDDEN)	#���@���D��1	139,{
	end;
OnStart:
	hideonnpc getmdnpcname("�t�F������#13");
	hideoffnpc getmdnpcname("���@���i�s�W#2");
	hideoffnpc getmdnpcname("�A���q#q1");
	hideoffnpc getmdnpcname("�f�B�I�E�A�l���X#q1");
	hideoffnpc getmdnpcname("�t�F����#q1");
	hideoffnpc getmdnpcname("�I���h��#q1");
	hideoffnpc getmdnpcname("�u���[�g�E�n�[#q1");
	hideoffnpc getmdnpcname("����#q1");
	hideoffnpc getmdnpcname("�C�t�H�h�X#q1");
	hideoffnpc getmdnpcname("���`�F�j�G#q1");
	hideoffnpc getmdnpcname("�����q��#q1");
	hideoffnpc getmdnpcname("�W���[#q1");
	hideoffnpc getmdnpcname("�f�B���C#q1");
	hideoffnpc getmdnpcname("�t�F�C�E�J�i�r�A��#q1");
	hideoffnpc getmdnpcname("�t�F������#q1");
	mapwarp getmdmapname("1@ge_st.gat"), getmdmapname("1@ge_st.gat"), 109, 50;
	end;
}

1@ge_st.gat,109,51,4	script(HIDDEN)	���@����Ô�#1	475,{
	mes "[���@����Ô�]";
	mes "�����܂ŏ����c�����I���";
	mes "��U���Â��󂯂邱�Ƃ��ł��܂��B";
	mes "���Â��󂯂܂����H";
	next;
	if(select("���Â��󂯂�","��b���I������") == 2) {
		mes "[���@����Ô�]";
		mes "�D���ł���Ƃ����ł��ˁB";
		close;
	}
	mes "[���@����Ô�]";
	mes "���Â��������܂����B";
	mes "���̎������撣���Ă��������I";
	percentheal 100,100;
	close2;
	hideonnpc;
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���A���q�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#1	10006,{
	end;
OnStart:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�!!�@�Q�t�F��!!�@���@!!�@����!!�@��������!!";
	initnpctimer;
	end;
OnTimer1500:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����������!!�@��!!";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��������������!!�@�q�A�E�B�S�[!!";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �������I�@�n�܂�n�܂�I";
	misceffect 89, getmdnpcname("#���@���ԉ�_11");
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �ǂ�ǂ�I�@�N�������ȁH";
	misceffect 89, getmdnpcname("#���@���ԉ�_13");
	end;
OnTimer4000:
	hideoffnpc getmdnpcname("�A���q#1");
	end;
OnTimer6000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g��1�������J�n�������܂��I";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a2")),"���@�A�J�f�~�[�w�� : �C���b�z�[!!";
	misceffect 30, getmdnpcname("#���@���ԉ�_11");
	misceffect 89, getmdnpcname("#���@���ԉ�_12");
	misceffect 30, getmdnpcname("#���@���ԉ�_13");
	misceffect 89, getmdnpcname("#���@���ԉ�_14");
	end;
OnTimer8000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���񂪖��@���Q���̓�̑I��I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �����I�@�����I�@�����I";
	end;
OnTimer9000:
	misceffect 92, getmdnpcname("#���@���ԉ�_11");
	misceffect 30, getmdnpcname("#���@���ԉ�_12");
	misceffect 92, getmdnpcname("#���@���ԉ�_13");
	misceffect 30, getmdnpcname("#���@���ԉ�_14");
	end;
OnTimer10000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���O�����m���Ă��Ȃ������̗���ҁI�@" +.Name$+ "!!";
	end;
OnTimer12000:
	misceffect 89, getmdnpcname("#���@���ԉ�_17");
	misceffect 92, getmdnpcname("#���@���ԉ�_12");
	misceffect 89, getmdnpcname("#���@���ԉ�_19");
	misceffect 92, getmdnpcname("#���@���ԉ�_14");
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �������Q�����H�@�C��������I";
	end;
OnTimer15000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����đ����!!";
	misceffect 30, getmdnpcname("#���@���ԉ�_17");
	misceffect 89, getmdnpcname("#���@���ԉ�_18");
	misceffect 30, getmdnpcname("#���@���ԉ�_19");
	misceffect 89, getmdnpcname("#���@���ԉ�_20");
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ���������`!!";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a1")),"�A���x���^�ϗ��q : ���҂��Ă邼!!";
	end;
OnTimer17000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���Ƃ̌䑂�i���Q�t�F�����@���ɒ���I�@�C�͎ア�����C�͏\���I";
	end;
OnTimer18000:
	misceffect 92, getmdnpcname("#���@���ԉ�_17");
	misceffect 30, getmdnpcname("#���@���ԉ�_18");
	misceffect 92, getmdnpcname("#���@���ԉ�_19");
	misceffect 30, getmdnpcname("#���@���ԉ�_20");
	end;
OnTimer19000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �c������ҁA���ʂ̃m�[�r�X�I�@�A���q�I";
	end;
OnTimer21000:
	misceffect 92, getmdnpcname("#���@���ԉ�_18");
	end;
OnTimer21500:
	misceffect 92, getmdnpcname("#���@���ԉ�_20");
	end;
OnTimer22000:
	unittalk getnpcid(0,getmdnpcname("�A���q#1")),"�A���q : ���v�c�c�B";
	end;
OnTimer24000:
	unittalk getnpcid(0,getmdnpcname("�A���q#1")),"�A���q : �l�ɂ͕��l�ƕ�l�ɂ���������ꂪ����B";
	end;
OnTimer26000:
	unittalk getnpcid(0,getmdnpcname("�A���q#1")),"�A���q : ���B�]�t�j���̉H����Ə��_�̉��ʁB";
	end;
OnTimer28000:
	unittalk getnpcid(0,getmdnpcname("�A���q#1")),"�A���q : ���������A����t����΂�܂��B";
	end;
OnTimer30000:
	unittalk getnpcid(0,getmdnpcname("�A���q#1")),"�A���q : ��A��낵�����˂����Ђ܂Ђ�c�c�I";
	end;
OnTimer32000:
	unittalk getnpcid(0,getmdnpcname("�A���q#1")),"�A���q : ���A���񂶂�����c�c�B";
	end;
OnTimer34000:
	misceffect 89, getmdnpcname("#���@���ԉ�_11");
	misceffect 89, getmdnpcname("#���@���ԉ�_13");
	end;
OnTimer35000:
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a5")),"���@�A�J�f�~�[�w�� : �ǂ���������΂�[!!";
	end;
OnTimer37000:
	misceffect 30, getmdnpcname("#���@���ԉ�_11");
	misceffect 89, getmdnpcname("#���@���ԉ�_12");
	misceffect 30, getmdnpcname("#���@���ԉ�_13");
	misceffect 89, getmdnpcname("#���@���ԉ�_14");
	end;
OnTimer38000:
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a2")),"���@�A�J�f�~�[�w�� : �h�L�h�L����I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �����������݂��ĂˁI";
	end;
OnTimer39000:
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
OnTimer40000:
	misceffect 92, getmdnpcname("#���@���ԉ�_11");
	misceffect 30, getmdnpcname("#���@���ԉ�_12");
	misceffect 92, getmdnpcname("#���@���ԉ�_13");
	misceffect 30, getmdnpcname("#���@���ԉ�_14");
	end;
OnTimer43000:
	stopnpctimer;
	misceffect 92, getmdnpcname("#���@���ԉ�_12");
	misceffect 92, getmdnpcname("#���@���ԉ�_14");
	end;
OnWin1:
	if(.Progress <= 10) {
		set '@Game$,"��" +.Progress+ "����";
	} else if(.Progress == 11) {
		set '@Game$,"���X����";
	} else if(.Progress == 12) {
		set '@Game$,"������";
	} else if(.Progress == 13) {
		set '@Game$,"����";
	}
	if(.Progress <= 11)
		unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : A�g��" +'@Game$+ "���I�����܂����I�@���������I��͏����蓖�Ă𖈎������ƂɎ󂯎�邱�Ƃ��o���܂��B";
	if(.Progress == 12)
		unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : A�g�Ō�̎����I�@���������I�����܂����I�@���������I��͏����蓖�Ă𖈎������ƂɎ󂯎�邱�Ƃ��o���܂��B";
	end;
OnWin2:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �܂��A���̎����̏��������鎞�Ԃ��^�����܂��I";
	end;
OnWin3:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���@���i�s�W�ɏ���������m�点�Ă���������Ύ��̎������J�n�������܂��B";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�A���q#1	670,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�A���q : �����c�c���s�ł��c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�A���q : �l�Ƃ͎������Ⴄ���Ƃ�Ɋ����܂����c�c�B";
	end;
OnTimer5000:
	unittalk "�A���q : �l�̎����͂����ŏI���ł����c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�A���q : ���̎���������΂��Ă��������I";
	end;
OnTimer9000:
	unittalk "�A���q : ���A�������Ă��܂��I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	hideonnpc;
	end;
OnTimer12000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�A���q : �������ɁA�l�̘r���Ⴑ�ꂪ���E���c�c�B";
	end;
OnTimer104000:
	unittalk "�A���q : �܂��܂��o���s����Ɋ����鎎���ł����B";
	end;
OnTimer106000:
	unittalk "�A���q : �ł��A���A�ŏ������M�������C�����܂��I";
	end;
OnTimer108000:
	unittalk "�A���q : ���̎������A����t����΂�܂��I";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���f�B�I�E�A�l���X�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#2	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�!!�@A�g��2�����A�J�n�ƎQ��܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���Q���ɂ��āA��1�����������c������̒���ҁI";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �ǂ��܂ŏ����i�߂�̂�!!�@" +.Name$;
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : ����オ���Ă�ȁ`�I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������́I";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �ǂ������������悤���ȁI";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �A�J�f�~�[�ł����ڂ������҂̐������I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a2")),"�t�F�C�����ϗ��q : �Ƃ���Ńt�F�C��������͒N���o�Ȃ��̂��H";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �S�����͑喂�@�g���I�@�f�B�I�E�A�l���X�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�f�B�I�E�A�l���X#1")),"�f�B�I�E�A�l���X : �l�͂˂��c�c";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�f�B�I�E�A�l���X#1")),"�f�B�I�E�A�l���X : ���ʂȂ��Ƃ��Ă���܂�D������Ȃ��񂾁B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�f�B�I�E�A�l���X#1")),"�f�B�I�E�A�l���X : �Ƃ��ƂƁA�n�߂悤����Ȃ����B";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�f�B�I�E�A�l���X#1")),"�f�B�I�E�A�l���X : �܂��A���ʂ͂������łɌ��܂��Ă�񂾂��ǂˁB";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�f�B�I�E�A�l���X#1")),"�f�B�I�E�A�l���X : �����I��点�ă}�C�n�j�[�Ɏv����������̂����B";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�f�B�I�E�A�l���X#1")),"�f�B�I�E�A�l���X : �܂��A�����̌��ʂ��A�������łɌ��܂��Ă�񂾂��ǂ˂��I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a1")),"���@�A�J�f�~�[�w�� : �ǂ������撣���āI";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �n�܂�!!";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�f�B�I�E�A�l���X#1	669,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�f�B�I�E�A�l���X : �c�c���A�ŋߔ������������̕��킪";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�f�B�I�E�A�l���X : �l�̎�ɓ����łȂ��������炾�I";
	end;
OnTimer5000:
	unittalk "�f�B�I�E�A�l���X : ����A�������͖̂l�̎��͂���Ȃ��I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�f�B�I�E�A�l���X : ���̕��킪�����񂾁I";
	end;
OnTimer9000:
	unittalk "�f�B�I�E�A�l���X : ���Ă��ƂŁA�N�͉^���ǂ������悤���˂��B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�f�B�I�E�A�l���X : �܂������c�c�������̖l���N�̈��^�ɂ͏��ĂȂ������悤����B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�f�B�I�E�A�l���X : ���������ȁ[�H";
	end;
OnTimer104000:
	unittalk "�f�B�I�E�A�l���X : �N�ɉؗ�ɏ����Ď��̎����ɍs���͂��������̂ɁB";
	end;
OnTimer106000:
	unittalk "�f�B�I�E�A�l���X : �܂��A���܂ɂ����������Ƃ��Ȃ��Ƃ˂��B";
	end;
OnTimer108000:
	unittalk "�f�B�I�E�A�l���X : ���ꂶ��A����ꂳ�܁I";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���r���[�E�R�X�����[�X�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#31	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@��3�������I�@�n�߂����Ă��������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �Ȃ��������Ɋ������܂��I�@����ȑ̎���w�������s�K�ȑI��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��J�����͂��łɗD���ҁI�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : ���Q���N���撣��˂��I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �ւ��A�Ȃ��Ȃ���邶��Ȃ��B";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����đ���́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ���҂̐V�l����o��ˁI";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ̂��炢�̋������ȁH";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����̔������r������Ȃ�������I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �r���������D���I�@�r���[�E�R�X�����[�X�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#n1")),"�r���[�E�R�X�����[�X : ���̃J�v���̋r�����c�c�B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#n1")),"�r���[�E�R�X�����[�X : ����̒��ł����Ȃ荂�]���������񂾁I";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#n1")),"�r���[�E�R�X�����[�X : �Ȃ����O�ɂ͂��̗ǂ����킩��Ȃ��񂾁I";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#n1")),"�r���[�E�R�X�����[�X : ���̎����ŁA���O�ɋr�����̗ǂ����v���m�点�Ă�邺�I";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#n1")),"�r���[�E�R�X�����[�X : �����Ă��O����������A���D��̒��Ԃɂ��Ă��I";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#n1")),"�r���[�E�R�X�����[�X : ���񂶂�s����!!";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �V�Q�҂��I�������悤���ȁI";
	unittalk getnpcid(0,getmdnpcname("�R���h�ϗ��q#a1")),"�R���h�ϗ��q : �����ɕ�����񂶂�Ȃ���I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �����I�@���͂������������邼�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ����ȁH�ǂ����������ȁ`�B";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�r���[�E�R�X�����[�X#n1	682,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�r���[�E�R�X�����[�X : �N�N�N�N�c�c�o�J�߁B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�r���[�E�R�X�����[�X : ���̂���͋r���������D��ł��Ŏ�B";
	end;
OnTimer5000:
	unittalk "�r���[�E�R�X�����[�X : ���A��O�̓��D����o�[�����O���c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�r���[�E�R�X�����[�X : ���H�@�������炨���܂��H";
	end;
OnTimer9000:
	unittalk "�r���[�E�R�X�����[�X : �`�L�V���[�b!!";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�r���[�E�R�X�����[�X : �K�N�b�c�c�B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���[���ƁI�@B�g�̎�����񂪓����Ă��܂����I";
	end;
OnTimer16000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �t�F�������Ƃ����I�肪�j�|�̐����ŘA�����Ă��邻���ł��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�r���[�E�R�X�����[�X : �����B";
	end;
OnTimer104000:
	unittalk "�r���[�E�R�X�����[�X : ��������ϋq�̋r�������Ȃ������畉���Ă����c�c�B";
	end;
OnTimer106000:
	unittalk "�r���[�E�R�X�����[�X : �܂������A�r�������Ă�͍߂���ȁB";
	end;
OnTimer108000:
	unittalk "�r���[�E�R�X�����[�X : ����������܂Ŗ{�C�ɂ������܂��񂾂����B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���q�s�A�E�X�j�L�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#32	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@��3�������I�@�n�߂����Ă��������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �Ȃ��������Ɋ������܂��I�@����ȑ̎���w�������s�K�ȑI��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��J�����͂��łɗD���ҁI�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : ���Q���N���撣��˂��I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �ւ��A�Ȃ��Ȃ���邶��Ȃ��B";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ���҂̐V�l����o��ˁI";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ̂��炢�̋������ȁH";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���p�̕��A�n���h�����Ŗ҈Ђ��ӂ邤�I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �Z�M�g�؂荞�ݑ���!!�@�q�s�A�E�X�j�L�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#n1")),"�q�s�A�E�X�j�L : �҂��Ă����F�B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#n1")),"�q�s�A�E�X�j�L : ���̏u�Ԃ��ȁI";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#n1")),"�q�s�A�E�X�j�L : ��������[����ˁ[���I";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#n1")),"�q�s�A�E�X�j�L : �����ĉƂɋA�鏀������񂾂ȁI";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#n1")),"�q�s�A�E�X�j�L : ���ƁA���̂��萻�蕀�u�n���h�����v��";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#n1")),"�q�s�A�E�X�j�L : �{�R�{�R�ɂ��Ă��!!";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �V�Q�҂��I�������悤���ȁI";
	unittalk getnpcid(0,getmdnpcname("�R���h�ϗ��q#a1")),"�R���h�ϗ��q : �����ɕ�����񂶂�Ȃ���I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �����I�@���͂������������邼�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ����ȁH�ǂ����������ȁ`�B";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�q�s�A�E�X�j�L#n1	681,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�q�s�A�E�X�j�L : !?";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�q�s�A�E�X�j�L : ���̉������������Ɓc�c�B";
	end;
OnTimer5000:
	unittalk "�q�s�A�E�X�j�L : �n���h�����c�c���܂˃F�c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�q�s�A�E�X�j�L : ���B�l������Ȃ������悤���c�c�B";
	end;
OnTimer9000:
	unittalk "�q�s�A�E�X�j�L : �N�\�b�c�c�I���f�I�R�����P�`��񂶂�c�c�Ȃ������c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�q�s�A�E�X�j�L : �K�N�b�c�c�B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���[���ƁI�@B�g�̎�����񂪓����Ă��܂����I";
	end;
OnTimer16000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �t�F�������Ƃ����I�肪�j�|�̐����ŘA�����Ă��邻���ł��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�q�s�A�E�X�j�L : ���ɕ�����̂͂���Ӗ��d���˃F�B";
	end;
OnTimer104000:
	unittalk "�q�s�A�E�X�j�L : ���̂��萻�̎蕀�u�n���h�����v�B";
	end;
OnTimer106000:
	unittalk "�q�s�A�E�X�j�L : ���̕K�E�Z�ł���}�L�V�}�C�Y�p���[�B";
	end;
OnTimer108000:
	unittalk "�q�s�A�E�X�j�L : ���ꂪ�y�􂵂��܂����񂾂����B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���u���b�N�E�J�l�C���[�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#33	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@��3�������I�@�n�߂����Ă��������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �Ȃ��������Ɋ������܂��I�@����ȑ̎���w�������s�K�ȑI��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��J�����͂��łɗD���ҁI�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : ���Q���N���撣��˂��I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �ւ��A�Ȃ��Ȃ���邶��Ȃ��B";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ���҂̐V�l����o��ˁI";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ̂��炢�̋������ȁH";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �O���猩�Ă��D�_�A������݂Ă��h���{�E�I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �u���O��Zeny������Zeny�A����Zeny�͉���Zeny�v�M���h�̃}�X�^�[!!�@�u���b�N�E�J�l�C���[�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#n1")),"�u���b�N�E�J�l�C���[ : �����ŉ������100��Zeny�ˁI";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#n1")),"�u���b�N�E�J�l�C���[ : �ŏ��ɂ����Ă������ǁA�������ʂɂ��񂽂Ɛ킢�����킯����Ȃ�����B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#n1")),"�u���b�N�E�J�l�C���[ : ������Ƌ��ڂ̃��m���炦���疞�������B";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#n1")),"�u���b�N�E�J�l�C���[ : ���Ă��ƂŁA���ڂ̃��m�������o���Ȃ����I";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#n1")),"�u���b�N�E�J�l�C���[ : ����Řb���ςނ񂾂���ȒP�ł���!?";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#n1")),"�u���b�N�E�J�l�C���[ : Zeny������ΐ��Ȃ��ł��ނ񂾂���A����ς�Zeny���ō���ˁI";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �V�Q�҂��I�������悤���ȁI";
	unittalk getnpcid(0,getmdnpcname("�R���h�ϗ��q#a1")),"�R���h�ϗ��q : �����ɕ�����񂶂�Ȃ���I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �����I�@���͂������������邼�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ����ȁH�ǂ����������ȁ`�B";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�u���b�N�E�J�l�C���[#n1	671,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�u���b�N�E�J�l�C���[ : ���񂽁A�����͎�������Ă������̂�����Ȃ���!?";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�u���b�N�E�J�l�C���[ : ���̊����Ȃ�ǂ����AZeny�̈������ǂ�Ԃ芨��Ȃ�ł���!?";
	end;
OnTimer5000:
	unittalk "�u���b�N�E�J�l�C���[ : ���������AZeny�Ɛl�̈����ɂ��ĕ׋����Ȃ������!?";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�u���b�N�E�J�l�C���[ : ����Ȃ񂶂�AZeny�����܂ł����Ă����܂�Ȃ����B";
	end;
OnTimer9000:
	unittalk "�u���b�N�E�J�l�C���[ : �������ł������̔���グ�ɂ������̂�I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�u���b�N�E�J�l�C���[ : ������Ƃ͍l���Ă�ˁB";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���[���ƁI�@B�g�̎�����񂪓����Ă��܂����I";
	end;
OnTimer16000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �t�F�������Ƃ����I�肪�j�|�̐����ŘA�����Ă��邻���ł��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�u���b�N�E�J�l�C���[ : ���񂽂ɋ����Ă�����B";
	end;
OnTimer104000:
	unittalk "�u���b�N�E�J�l�C���[ : Zeny�͗��؂�Ȃ��B���񂽂�Zeny�𒙂߂āA�����Ȃ�Ȃ����B";
	end;
OnTimer106000:
	unittalk "�u���b�N�E�J�l�C���[ : �ǎ��@�����Ă�̂��������̖ڕW�ŁA�{����zeny�҂��ɖZ�����񂾂��ǁA�Ȃ񂾂����炠�������ق��Ă�������B";
	end;
OnTimer108000:
	unittalk "�u���b�N�E�J�l�C���[ : ���̂���肠�񂽂͌ǎ��@�����܂ł̓^�_���������ǂˁ�";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���t�F�����i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#4	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@��4�������I�@�n�߂����Ă��������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���Q���ŘA��!!�@�l�C���o�Ă�����?!";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����̗E�ҁI�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : ����΂�`�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �����Ȃ��Ȃ����ȁI�@�C�ɓ��������I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����܂��A���ŏ����������ė�������́I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �ʔ����킢�ɂȂ肻���ˁI";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����ϋq����̐l�C�㏸���I�@�������Y�X��������ҁI";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �킵�̃v�����e��!!�@�t�F�����I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�t�F����#1")),"�t�F���� : �ʓ|�����ǁA�ق������̂𔃂��̂ɖ��@���R�C���𔄂��������K�v�łˁB";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�t�F����#1")),"�t�F���� : ����Ȃ킯������A�������ƏI��点�悤���B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�t�F����#1")),"�t�F���� : �����A���܂Ȃ��B�I���Ƃ������Ƃ��c�c�B";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�t�F����#1")),"�t�F���� : ���܂�ɑ����I��点��ƃI���̃t�@�����߂��ށB";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�t�F����#1")),"�t�F���� : �قǂقǂɎ��Ԃ������Ă�邩�B";
	end;
	unittalk getnpcid(0,getmdnpcname("�t�F����#1")),"�t�F���� : ���̕������݂��A�K������H";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �����I�@�v�����e���o�g�̑I�肩�I";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a2")),"�v�����e���ϗ��q : �������������邼���I";
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a4")),"���@�A�J�f�~�[�w�� : �V�Q�I���������Ȃ�`�I";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �撣��`�I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : ���Ҕ����A�S�z�������ĂƂ����ȁB";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�t�F����#1	672,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�t�F���� : ����ȂƂ���ŕ�����Ƃ͂ȁc�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�t�F���� : �ł��I���́A�����Ȓj�ǂ��̂悤�ɉ����������肵�Ȃ��B";
	end;
OnTimer5000:
	unittalk "�t�F���� : ��������p�́A�������Ȃ�����ȁB";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�t�F���� : �������ɐg�ウ����I�����D���ȃt�@�������邾�낤���c�c�B";
	end;
OnTimer9000:
	unittalk "�t�F���� : �����Ō�����ׂ�����Ȃ����ȁB";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�t�F���� : ���ꂶ��A�����B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�t�F���� : �t�t�c�c�B";
	end;
OnTimer104000:
	unittalk "�t�F���� : �������́A�I���̃t�@���ȊO�ɂ��I���̔����������\���鎞�Ԃ�����Ă��B";
	end;
OnTimer106000:
	unittalk "�t�F���� : ���[�āA���̎����ɔ����Đg�����Ȃ݂𐮂��Ȃ��ƂȁB";
	end;
OnTimer108000:
	unittalk "�t�F���� : ���̃I���̔��������򉻂�����A�t�@�������z�����ȁB";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���I���h���i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#5	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@��5�������J�n�������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���������Ƃ͌Ă΂��Ȃ��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���ڂ̃��[�L�[�I�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : ���������`�I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : ���������΍���̑��x�������ˁI";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a1")),"�A���x���^�ϗ��q : �Ȃ��Ȃ��ʔ����I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��V�������D�������@�g���I�@���������͂̓J�i���̂��́I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �w�͔h�퓬�}�X�^�[!!�@�I���h��!!!";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�I���h��#1")),"�I���h�� : ���́A�I���h���Ɛ\���܂��B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�I���h��#1")),"�I���h�� : ���Ȃ��Ɛ킦��̂��y���݂ɂ��Ă��܂����B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�I���h��#1")),"�I���h�� : ����A���̎��Ɛ��X���X�c�c";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�I���h��#1")),"�I���h�� : ���׍H�Ȃ��ŁA�荇�킹�����肢���܂��I";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�I���h��#1")),"�I���h�� : �ӂ��B���Ƃ������Ƃ������A�ْ����Ă���悤�ł��c�c�B";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�I���h��#1")),"�I���h�� : �������������Ȃ���΁c�c�B";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �C���b�z�[�I�@�t�@�C�g�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �Ȃ��Ȃ������ΐ�J�[�h�ˁI�@�y���݁I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a2")),"�v�����e���ϗ��q : ���������`�I�@�撣��`�I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a2")),"�t�F�C�����ϗ��q : ���������𗊂ނ��I";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�I���h��#1	673,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�I���h�� : ���肪�Ƃ��������܂����B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�I���h�� : ����̎����́A�ƂĂ��L�Ӌ`�Ȃ��̂ł����B";
	end;
OnTimer5000:
	unittalk "�I���h�� : �c�O�Ȃ��玄�ɏ����̏��_�͔��΂܂Ȃ������悤�ł����c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�I���h�� : ���̎��������Ȃ������ƐM���āc�c";
	end;
OnTimer9000:
	unittalk "�I���h�� : �ϗ��Ȃ���q�������Ă��������܂��B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�I���h�� : ���̎���������΂��Ă��������B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�I���h�� : �c�c���΂ł��B";
	end;
OnTimer104000:
	unittalk "�I���h�� : ���Ȃ蔒�M�����킢�����\�����Ă��������܂����B";
	end;
OnTimer106000:
	unittalk "�I���h�� : �����܂Ŗ{�C�ŗ͂��o���������͋v���Ԃ�ł��B";
	end;
OnTimer108000:
	unittalk "�I���h�� : �܂��@�����܂�����荇�킹�����肢���܂��B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���u���[�g�E�n�[�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#6	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g�I�@��6�������J�n�����Ă��������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���Q���ɂ�������炸�A���@���̋��������X�R�U�炷!!";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���ړx�i���o�[�����̃X�[�p�[���[�L�[�I�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �h�L�h�L�����`�B";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a1")),"�A���x���^�ϗ��q : �������I���x�̎����������������I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �撣��[�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : �ڂ������Ȃ���I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���킢���O���ɘf�킳���ȁI�@�c�E��������Ȃ��I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���h��ꂽ������!!�@�u���[�g�E�n�[�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�u���[�g�E�n�[#1")),"�u���[�g�E�n�[ : �{�N�̓L�~�̌����݂����񂾁I";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�u���[�g�E�n�[#1")),"�u���[�g�E�n�[ : �c�c����H";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�u���[�g�E�n�[#1")),"�u���[�g�E�n�[ : �Ȃ񂾂��v���|�[�Y�̌��t�݂������ˁI";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�u���[�g�E�n�[#1")),"�u���[�g�E�n�[ : ���͖̂��_�A��k����I";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�u���[�g�E�n�[#1")),"�u���[�g�E�n�[ : �ł��A�{�N�̂��܂�̋����ɖ{���ɂقꂿ�Ⴞ�߂�����ˁ[�I";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�u���[�g�E�n�[#1")),"�u���[�g�E�n�[ : �{�N�͂��Z����񂪈�ԍD�������I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a2")),"�t�F�C�����ϗ��q : �V�Q�҂��Ȃ��Ȃ��撣���Ă�ȁI";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : ���̂܂ܗD������������肵��?!";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a2")),"���@�A�J�f�~�[�w�� : ���������킢���ȁ`�B";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �����I�肪�W�܂����ȁI";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�u���[�g�E�n�[#1	674,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�u���[�g�E�n�[ : ������ƁI";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�u���[�g�E�n�[ : ������������񂶂�Ȃ����ƁA�q���q���������c�c�I";
	end;
OnTimer5000:
	unittalk "�u���[�g�E�n�[ : ���Z�����ɁA�q���̂���a�����j�������Ă�������̂ɁI";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�u���[�g�E�n�[ : ���A�ŁA�����ɏW���ł��Ȃ����c�c�B";
	end;
OnTimer9000:
	unittalk "�u���[�g�E�n�[ : �c�c�n�b�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�u���[�g�E�n�[ : ���A���[���Ɓc�c����A�{�N�͂���Ł[�I";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����ƁI�@������B�g�̎������񂪓����Ă��܂����I";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����̑I�肪�������Ă��܂����A���̒��ł��t�F�������Ƃ����I�肪";
	end;
OnTimer18000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : 6�A����B�������ō��̃_�[�N�z�[�X�Ƃ��Ė����グ�Ă��܂��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�u���[�g�E�n�[ : ���[��A������ƕ�����Ȃ��������ȁ[�H";
	end;
OnTimer104000:
	unittalk "�u���[�g�E�n�[ : �L�~�����������A�S���Ƃ����ق��������Ǝv����[�I";
	end;
OnTimer106000:
	unittalk "�u���[�g�E�n�[ : ����Ȃ񂶂�A�����Ɍ�������Ȃ��Ȃ��ă{�N�����̂��߂Ȃ����[�B";
	end;
OnTimer108000:
	unittalk "�u���[�g�E�n�[ : ���[�āA�{�N�͎��̑ΐ푊��̌��t�^�ł��\�z���悤���Ȃ��B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j�������i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#7	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g�I�@��7�������n�߂����Ƃ������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �j�|�̐����I�@�N���~�߂�����̂��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̂܂ܗD���܂Ŕ�����?!�@������" +.Name$+ "!!";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ���x�̎��������҂ł��������I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a1")),"�A���x���^�ϗ��q : 1�N�O����\�񂵂��b�オ��������I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����ȋ����Œ���҂��Ȃ��|���I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �M�����������҂����I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����̉�I�@�����I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("����#1")),"���� : �ӂ��[���c�c�B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("����#1")),"���� : �����B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("����#1")),"���� : ����Ȃ��܂܂��Ƃ݂����Ȏ����A�����y�����̂��ˁB";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("����#1")),"���� : ����q�����킢����Ȃ����A�S�R�����C���o�Ȃ����c�c�B";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("����#1")),"���� : ���l�̃^�[�Q�b�g�����������ȁB";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("����#1")),"���� : ����Ȃ킯���A���O�͓K���ɑ��肵�Ă��B";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a1")),"�A���x���^�ϗ��q : ���̖`���҂Ȃ��Ȃ����ȁc�c�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : ���낻��n�܂邩!!";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	����#1	675,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "���� : �t���b�c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "���� : ���l�ɑ�����E���Ȃ��悤�Ɏ��������Ƃ��A�߂�ǂ����[�ȁc�c�I";
	end;
OnTimer5000:
	unittalk "���� : ���A�ŁA���̏����E�����d�����B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "���� : ���ʂ������邩�̕����A�V���v������B";
	end;
OnTimer9000:
	unittalk "���� : �܂������A����͐F�X���Ăˁ[���B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "���� : �c�c�d���˂��A�����̎d���͂����܂ł��ȁB";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "���� : �܂��B����q���������łȂ���΁A����Ȃɂ��ʂ邢�̂���B";
	end;
OnTimer104000:
	unittalk "���� : ��x�P�`�����ƁA���O���E���Ă��Ӗ����˂��B";
	end;
OnTimer106000:
	unittalk "���� : �{���̃^�[�Q�b�g���A���O�̂����Ŕԋ��킹���������܂������B";
	end;
OnTimer108000:
	unittalk "���� : ����͌������Ă�邪�A���͂Ȃ��Ǝv���B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���C�t�H�h�X�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#8	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g��8�������n�߂����Ă��������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �������ɍ����̃_�[�N�z�[�X�I�@���̎��͂͐܂莆���I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��ѓ��胋�[���~�b�h�K�b�c�̎��͎ҁI�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : ����ȂɊ��҂����̏��߂āI";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �����I��΂��肾��I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a1")),"�t�F�C�����ϗ��q : �ŋ��͂��ꂩ����I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �|�S�̂悤�Ȗh��ő���̍U�����Ȃ�̂��́I";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �{���ɖڂ������Ȃ���!!";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �M�������S�I�@�S�ǂ̖h��I�@�C�t�H�h�X�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�C�t�H�h�X#1")),"�C�t�H�h�X : ���Ɛ������͑�T�A���̂��Ƃ�Y����Ȃ��Ȃ�炵���I";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�C�t�H�h�X#1")),"�C�t�H�h�X : �c�c�Ȃ����W���[�̂�͖Y��Ă����ǂȁI";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�C�t�H�h�X#1")),"�C�t�H�h�X : �ȁA�����ĂȂ����I";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�C�t�H�h�X#1")),"�C�t�H�h�X : ���A����͊��Ȃ񂾂���ȁI";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�C�t�H�h�X#1")),"�C�t�H�h�X : �����[�c�c��낵���ȁ[���I";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�C�t�H�h�X#1")),"�C�t�H�h�X : ���ꂶ��n�߂邼�[��!!";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�R���h�ϗ��q#a1")),"�R���h�ϗ��q : �������΂�����I�@�ʔ����ˁI";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �ǂ��������������I";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�C�t�H�h�X#1	676,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�C�t�H�h�X : ���������������������������I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�C�t�H�h�X : �悭�킩��Ȃ������ɕ����Ă����I";
	end;
OnTimer5000:
	unittalk "�C�t�H�h�X : �Ƃ������Ƃł��O�����̖��s�����ɖ��O�������I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�C�t�H�h�X : �����ăW���[�̎��̖ڕW�́A���O���I";
	end;
OnTimer9000:
	unittalk "�C�t�H�h�X : �o�債�Ă����񂾂Ȃ��I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�C�t�H�h�X : �`�L�V���[�b�I";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�C�t�H�h�X : ���A�������c�c�I�@�����Ɨ��̌��h�X�[�v���A��������񂾂��������ȁI";
	end;
OnTimer104000:
	unittalk "�C�t�H�h�X : ���������������������������I�@���āA���̓W���[�I";
	end;
OnTimer106000:
	unittalk "�C�t�H�h�X : ���O�ɏ����āA���s�������X�V���Ă�邺�I";
	end;
OnTimer108000:
	unittalk "�C�t�H�h�X : �҂��Ă남�������������I";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j�����`�F�j�G�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#9	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g�I�@��9�������n�߂����Ƃ������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �N���~�߂���̂��I�@�_�[�N�z�[�X��ʂ�z�������{���I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̎��͖͂{���I�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : ����`������9�������I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : ��������̂��Y��Ă���I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �������Ă��܂��Ď��Ԃ������Ƃ����Ԃ�I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̗l�ȉ��Ȉ�ʂƁA�Ŏւ̗l�Ȏc�E�Ȉ�ʂ����킹�����E�ҁI";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a2")),"�v�����e���ϗ��q : �����킢�����҂��Ă邼�[�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : ����̑��̑I��͌��������Ėʔ����ȁB";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̃��f�B�[!!�@���`�F�j�G!!";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("���`�F�j�G#1")),"���`�F�j�G : �P�b�c�c�I";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("���`�F�j�G#1")),"���`�F�j�G : �n�܂�܂ł��A�Ȃ��[�񂾂�I";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("���`�F�j�G#1")),"���`�F�j�G : �ǂ����I���[����ŏ���������オ���āA";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("���`�F�j�G#1")),"���`�F�j�G : �r������O����񂾂낤���b!!";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("���`�F�j�G#1")),"���`�F�j�G : �I���b�I�@�R���I";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("���`�F�j�G#1")),"���`�F�j�G : �����������ĂȂ��ł͂��߂�b�I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a1")),"�t�F�C�����ϗ��q : �|�����ȑI��c�c�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �����܂Ŏc�����I��݂͂�Ȃ������I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �����т��o�邭�炢�܂�Ȃ��킢�͂���Ȃ�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �����Ɣh��ɂ���āI";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	���`�F�j�G#1	677,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "���`�F�j�G : ����A���͕����Ă��܂����́H";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "���`�F�j�G : �ςˁc�c�B";
	end;
OnTimer5000:
	unittalk "���`�F�j�G : ������L�����܂���������܂����B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "���`�F�j�G : �ł������ɗ����Ă���Ƃ������Ƃ́A���̒ʂ�Ȃ̂ł��傤�ˁB";
	end;
OnTimer9000:
	unittalk "���`�F�j�G : �O���炿�傭���傭�����ł��́B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "���`�F�j�G : �s�v�c�ł���c�c�B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �������㔼�ɍ��������Ă��܂��I�@������B�g�̑���!!";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̑I��Ƃ͈��|�I�Ȏ��͍��������t���Ă���I�肪���邻���ł��I";
	end;
OnTimer18000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ����̓t�F�����X�E�t�F�������I��Ƃ̂��Ƃł��I�@A�g�̑I��̊F����A�����C�͑����ł������ӂ���K�v�����肻���ł��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "���`�F�j�G : �X�Q�[������˃F�c�c�B�t�ɗ~���s���ɂȂ����܂�������ˁ[���b!!";
	end;
OnTimer104000:
	unittalk "���`�F�j�G : �������A���ꂾ������Ȃ񂴏o�ꂵ�����Ȃ������̂ɂ�!!";
	end;
OnTimer106000:
	unittalk "���`�F�j�G : ���̃N�\�i���A�������o�ꂳ���₪���āc�c�B";
	end;
OnTimer108000:
	unittalk "���`�F�j�G : �I�C�I�@���̎�����������b�I";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j�������q���i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#10	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g�I�@��10�������J�n�������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���Q���ɂ��āA���@���̎��͎҂��������X�Ɠ|���I�I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���͔h�̒���ҁI�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : ��Ɋ�����!!";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �����n�߂āI�@�҂�����Ȃ��I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �������������鎎���΂���I";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �������낻���l�߂��I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���f�̃_���X�I�@�Y�܂����ȃ{�f�B�[���C���I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���𓱂��x���!!�@�����q��!!";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�����q��#1")),"�����q�� : ����ς�ϗ��ȂŌ���̂ƁA���͋C���Ⴄ��ˁI";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�����q��#1")),"�����q�� : ���ꂾ���ŎQ�����Ă悩�������Ȃ��Ă��������������B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�����q��#1")),"�����q�� : �c�c�N�b����Ȃ��A�Ƃ��v���ĂȂ��H";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�����q��#1")),"�����q�� : �܂��A�������";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�����q��#1")),"�����q�� : �Ƃɂ����A���݂��y���݂܂��傤��";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�����q��#1")),"�����q�� : �݂�Ȃ�������낵���ˁ`�B";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ����`!!�@�X�e�L!!";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �������c�c!!";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �ދ����Ȃ���!!";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�����q��#1	678,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�����q�� : ����`��I";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�����q�� : ����ς�A�o���ƔN�̍����o�������ˁc�c�B";
	end;
OnTimer5000:
	unittalk "�����q�� : �ł����������������Ǝv����B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�����q�� : ���ĂȂ������͎̂c�O���������ǁA�y����������B";
	end;
OnTimer9000:
	unittalk "�����q�� : �v�X�ɁA�Ⴂ���̏�M���߂���������";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�����q�� : ���肪�Ɓ�";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�����q�� : ���߂�Ȃ����ˁB";
	end;
OnTimer104000:
	unittalk "�����q�� : ���܂�ɂ��Ȃ��悤�ɋC����������Ȃ񂾂��ǁc�c�B";
	end;
OnTimer106000:
	unittalk "�����q�� : �D���ł�����A�t�x���Q���~���̎��ł��������ˁB";
	end;
OnTimer108000:
	unittalk "�����q�� : �ǂ������牞����낵���ˁ�";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���W���[�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#11	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł�A�g�I�@���X�������J�n�������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����ւ̉��i���I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̐����͒N�ɂ��~�߂��Ȃ��I�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���L#a2")),"���L : ���������c�c�B";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : �ǂꂾ���撣�����񂾂낤�c�c�I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("�A�C���X#a2")),"�A�C���X : �M�������΂���ˁI";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ��̕��ʁI�@���̑O�ɗ��������̂͒N�������c��Ȃ��I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����퓬�̒B�l�I�@�W���[!";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�W���[#1")),"�W���[ : ���̂悤�ȏ��݂��Ă��������A���ӂ��B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�W���[#1")),"�W���[ : �v�������킩�痣��Ă����Ƃ͂����c�c�B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�W���[#1")),"�W���[ : ���Ȃ��ɒx����Ƃ�قǁA�r�͂Ȃ܂��Ă��Ȃ��͂����B";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�W���[#1")),"�W���[ : �S�g�S��������āA�������Ă���Ƃ悢�B";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�W���[#1")),"�W���[ : �َ҂��A�S�g�S��������Ă����肵�悤�B";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�W���[#1")),"�W���[ : �����A�q��ɏ����I";
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#a2")),"�P�C�I�X : �Ȃ��Ȃ����������������ȁI";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : ���x�̎��������҂ł���ȁI";
	unittalk getnpcid(0,getmdnpcname("���f�B�A#a2")),"���f�B�A : �h�L�h�L�����I";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�W���[#1	679,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�W���[ : �َ҂����̑��ɂł����Ƃ��A�ԈႢ�łȂ��������Ƃ��m�M�����B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�W���[ : ���Ȃ��Ƃ������ꂩ��̐������y���݂Ȏ�҂ɏo����̂�����c�c�B";
	end;
OnTimer5000:
	unittalk "�W���[ : ���̎������C�𔲂����ɒ��߂΁A�D�����A���ł͂Ȃ����낤�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�W���[ : ���̗D���ւ̖��͂����ŏ����Ă��܂������c�c�B";
	end;
OnTimer9000:
	unittalk "�W���[ : ���̕��܂łǂ�������΂��Ăق����B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�W���[ : �������F��I";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	stopnpctimer;
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�W���[ : �c�c���Ȃ��̘r�O�͏\���������B";
	end;
OnTimer104000:
	unittalk "�W���[ : ���Ȃ��������������͂���1�A����o���̍����B";
	end;
OnTimer106000:
	unittalk "�W���[ : �c�c�܂��܂��l���͒����B";
	end;
OnTimer108000:
	unittalk "�W���[ : ���ꂩ������i�����B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���f�B���C�i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#121	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@�Ō�̎����I�@���������J�n�������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �D������܂Ŏ~�܂�Ȃ��I�@�����ł͎~�܂�Ȃ��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �~�܂�Ȃ��M�����u�I�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �������I�@�������������I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �����Ƃ����Ԃ��Ȃ��B";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �������̒�q�̑��h���W�߂�A�J�f�~�[�̎�ȋ����ɂ��čō��̖��@�g���I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ������h�L�h�L���Ă�����I";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �ǂ������������悤���Y�ނ�!!";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���̃}�G�X�g���I�@�f�B���C�I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�f�B���C#1")),"�f�B���C : ���̖��́A�f�B���C�B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�f�B���C#1")),"�f�B���C : �N�̂悤�Ȑl������ƂȂ�ƁA�������[�u�𐳂��Ȃ���΂����Ȃ��ˁB";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�f�B���C#1")),"�f�B���C : ����̎������A���l�Ȏp�͌������Ȃ��c�c�B";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�f�B���C#1")),"�f�B���C : ��Ă̐e�ł���A�E���o���̊F�Ƒ����l�A������q�����B";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�f�B���C#1")),"�f�B���C : ���ɂƂ��āA�厖�Ȑl�������W�܂��Ă��ꂽ�̂��B";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�f�B���C#1")),"�f�B���C : �N���������c��Ȃ��悤�A�S�͂������Ă���B";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �����`�I�@�������邺�I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a2")),"�t�F�C�����ϗ��q : ����ŏ��������������킩�I";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a5")),"���@�A�J�f�~�[�w�� : �킠�I�@�����̐搶��!!";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a3")),"���@�A�J�f�~�[�w�� : �搶!!�@�撣���Ă�������!!";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a4")),"���@�A�J�f�~�[�w�� : �������c�c�����搶�݂����ɂȂ�񂾁c�c�B";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : B�g�̗D�����t�F�����������ґ傾���I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ������t�F�������Ɛ키���ƂɂȂ�̂��ȁI";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a2")),"���@�A�J�f�~�[�w�� : ���͐搶��������Ȃ�đz�����o���Ȃ��I";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a5")),"���@�A�J�f�~�[�w�� : �݂�ȁI�搶�ɓ͂����炢�吺�ŉ������悤��I";
	end;
OnTimer27000:
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	end;
OnTimer29000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : �����c�c������̂�Y��Ă��c�c���ق��فB";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a2")),"���@�A�J�f�~�[�w�� : ���`�́I�@�搶!!�@�t�@�C�g!!";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a3")),"���@�A�J�f�~�[�w�� : ���`�́I�@�搶!!�@�t�@�C�g!!";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a4")),"���@�A�J�f�~�[�w�� : ���`�́I�@�搶!!�@�t�@�C�g!!";
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#a5")),"���@�A�J�f�~�[�w�� : ���`�́I�@�搶!!�@�t�@�C�g!!";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�f�B���C#1	680,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�f�B���C : ����̐킢�A�����ƃE���o���̊F�Ƒ����l�c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�f�B���C : ����ɁA�Q�t�F�����@�w�Z�̒�q�̊F�ɂƂ��Ă��[�������͂����B";
	end;
OnTimer5000:
	unittalk "�f�B���C : �����A����������g���ƂĂ��悢�������ł����Ǝv���Ă��邩��ˁB";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�f�B���C : ���̎���������΂��Ăق���";
	end;
OnTimer9000:
	unittalk "�f�B���C : ���̎����ɗՂށA�N���S�ʂ��B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�f�B���C : �t�F�������̎��͕͂����ł͂Ȃ��ƒ�q����`�����������B�������F��B";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����āA���@���A�g�����B�g�̎������S�ďI���������܂����I";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���݂��Ă����̂��^�⎋����Ă����������g���I�肪���邻���ł��I";
	end;
OnTimer18000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���O�̓t�F�����X�E�t�F�������I��I�@���X��B�g1�ʂ���������������ł��I";
	end;
OnTimer20000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : A�g1�ʂƂ̌����킪���Ɋy���݂ł��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�f�B���C : ���Ă����Ƃ͏��Ă����A�h���Ƃ����������ȁc�c�B";
	end;
OnTimer104000:
	unittalk "�f�B���C : �N�̂悤�Ȑl�Ԃ��A���̑��ɋ��Ă���āA�����������B";
	end;
OnTimer106000:
	unittalk "�f�B���C : ���ɂ��܂��܂��Â����������邱�Ƃ��킩�������ȁB";
	end;
OnTimer108000:
	unittalk "�f�B���C : �{���ɂ悢���������肪�Ƃ��B";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���t�F�C�E�J�i�r�A���i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#122	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g�I�@�Ō�̎����I�@���������J�n�������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �D������܂Ŏ~�܂�Ȃ��I�@�����ł͎~�܂�Ȃ��I";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �~�܂�Ȃ��M�����u�I�@" +.Name$+ "�I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �������I�@�������������I";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �����Ă���ɗ����������̂́I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �����Ƃ����Ԃ��Ȃ��B";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �Â��Ȃ�A���f�o��������̓V�˘B���p�t!!";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : ������h�L�h�L���Ă�����I";
	unittalk getnpcid(0,getmdnpcname("�A���x���^�ϗ��q#a2")),"�A���x���^�ϗ��q : �ǂ������������悤���Y�ނ�!!";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �t�F�C�E�J�i�r�A��!!�@�����Ĕޏ��̎��M��!!�@�ˑR�ψً���z�����N���X�̃A���t�H���I";
	end;
OnTimer13000:
	unittalk getnpcid(0,getmdnpcname("�t�F�C�E�J�i�r�A��#1")),"�t�F�C�E�J�i�r�A�� : �ǂ��ł��̎q���o���ƌ��ʓI���ȁc�c�B";
	end;
OnTimer15000:
	unittalk getnpcid(0,getmdnpcname("�t�F�C�E�J�i�r�A��#1")),"�t�F�C�E�J�i�r�A�� : ����ς肠�������s���`�ɂȂ����炪�������B";
	end;
OnTimer17000:
	unittalk getnpcid(0,getmdnpcname("�t�F�C�E�J�i�r�A��#1")),"�t�F�C�E�J�i�r�A�� : ���H";
	end;
OnTimer19000:
	unittalk getnpcid(0,getmdnpcname("�t�F�C�E�J�i�r�A��#1")),"�t�F�C�E�J�i�r�A�� : �����n�܂��Ă�́H";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�t�F�C�E�J�i�r�A��#1")),"�t�F�C�E�J�i�r�A�� : ���߂񂲂߂�A�C�Â��Ȃ������I";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�t�F�C�E�J�i�r�A��#1")),"�t�F�C�E�J�i�r�A�� : �����A�͂��߂�����I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �����`�I�@�������邺�I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a2")),"�t�F�C�����ϗ��q : ����ŏ��������������킩�I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : B�g�̗D�����t�F�����������ґ傾���I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ������t�F�������Ɛ키���ƂɂȂ�̂��ȁI";
	end;
OnTimer27000:
	stopnpctimer;
	donpcevent getmdnpcname("#�������A�i�E���X_timer")+"::OnStart";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a3")),"���@���ϗ��� : �����c�c������̂�Y��Ă��c�c���ق��فB";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �����n�߂āI���������ْ����Ă�����I";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�t�F�C�E�J�i�r�A��#1	665,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(.Sleep >= 27000) {
		if(!sleep2(12000)) end;
		cutin "paycana_a.bmp", 0;
		if(!sleep2(12000)) end;
		cutin "paycana_a.bmp", 255;
		if(!sleep2(8000)) end;
		end;
	}
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	hideonnpc getmdnpcname("#�A���t�H������");
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�t�F�C�E�J�i�r�A�� : �c�c�����������Ȃ��B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin1";
	end;
OnTimer3000:
	unittalk "�t�F�C�E�J�i�r�A�� : ��������������v�f���đ����A0.00001�p�[�Z���g���炢����!?";
	end;
OnTimer5000:
	unittalk "�t�F�C�E�J�i�r�A�� : ���x���J��Ԃ��v�Z���ďo�������ʂȂ̂Ɂ`�c�c�B";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	end;
OnTimer7000:
	unittalk "�t�F�C�E�J�i�r�A�� : ����Ȍ��ʁA���肦�Ȃ���`�c�c�B";
	end;
OnTimer9000:
	unittalk "�t�F�C�E�J�i�r�A�� : �����Ăǂ��v�Z���Ă��A���������D������p�^�[������H";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	end;
OnTimer11000:
	unittalk "�t�F�C�E�J�i�r�A�� : ��΂���������!?";
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �����āA���@���A�g�����B�g�̎������S�ďI���������܂����I";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���݂��Ă����̂��^�⎋����Ă����������g���I�肪���邻���ł��I";
	end;
OnTimer18000:
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : ���O�̓t�F�����X�E�t�F�������I��I�@���X��B�g1�ʂ���������������ł��I";
	end;
OnTimer20000:
	stopnpctimer;
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : A�g1�ʂƂ̌����킪���Ɋy���݂ł��I";
	hideoffnpc getmdnpcname("���@���i�s�W#1");
	hideoffnpc getmdnpcname("���@����Ô�#1");
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�t�F�C�E�J�i�r�A�� : ��[�A�������̌v�Z����������������P�������\�肾�����̂ɁB";
	end;
OnTimer104000:
	unittalk "�t�F�C�E�J�i�r�A�� : �ǂ����Ōv�Z�A�Ԉ�����̂��ȁH";
	end;
OnTimer106000:
	unittalk "�t�F�C�E�J�i�r�A�� : �܁A�D���̕������͊ԈႢ����Ȃ����A�������B";
	end;
OnTimer108000:
	unittalk "�t�F�C�E�J�i�r�A�� : ���̎q���\���A�ڗ������͂������ˁ`�I";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

1@ge_st.gat,115,50,0	script(HIDDEN)	#�A���t�H������	139,{
	end;
OnStart:
	monster getmdmapname("1@ge_st.gat"),108,51,"�A���t�H���E�W���j�A",2566,1,getmdnpcname("#�A���t�H������")+"::OnKilled";
	monster getmdmapname("1@ge_st.gat"),110,51,"�A���t�H���E�W���j�A",2566,1,getmdnpcname("#�A���t�H������")+"::OnKilled";
	monster getmdmapname("1@ge_st.gat"),109,49,"�A���t�H���E�W���j�A",2566,1,getmdnpcname("#�A���t�H������")+"::OnKilled";
	end;
OnKilled:
	set '@Count,getmapmobs(getmdmapname("1@ge_st.gat"),getmdnpcname("#�A���t�H������")+ "::OnKilled");
	if('@Count == 0)
		donpcevent getmdnpcname("#�A���t�H������")+"::OnStart";
	if('flag) end;
	set 'flag,1;
	unittalk "�t�F�C�E�J�i�r�A�� : �������̂��킢���A���t�H�����`�I�@�����Ȃ�����I";
	end;
}

//==========================================
// �A�J�f�~�[�}�X�^�[�i�����J�n�j���t�F�������i�����I���j
//------------------------------------------
1@ge_st.gat,109,57,4	script(HIDDEN)	�A�J�f�~�[�}�X�^�[#13	10006,{
	end;
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����ł́I�@A�g��B�g�̍ŏI�i�o�҂ɂ��I�@�Ō�̎����I�@���E���E����J�n�������܂��I";
	end;
OnTimer3000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �N���\�z���ɂ��Ȃ������E�ҁI";
	end;
OnTimer5000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ������������̃`�P�b�g�����͂ł���������`���ҁI";
	end;
OnTimer7000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ����l�C�ō���́I�@�D�����I";
	end;
OnTimer9000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �Ō�̐��ɗ����́I�@" +.Name$+ "�`!!";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : ���Ɍ�����I";
	end;
OnTimer11000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �΂���́I";
	unittalk getnpcid(0,getmdnpcname("���L#a2")),"���L : �����܂ŏ����i�ނƂ́c�c���������ȁB";
	end;
OnTimer13000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���|�I�Ȏ��͂ő���𑒂��Ă����ŋ��̃E�H�[���b�N!!";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �ǂ����������킩��Ȃ��ȁI";
	unittalk getnpcid(0,getmdnpcname("�x�C���X�ϗ��q#a1")),"�x�C���X�ϗ��q : �ǂ�����I�@�������ĕ@���o�����I";
	end;
OnTimer15000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ������̂����|����A�{���̐����̉��i���I";
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#a2")),"�P�C�I�X : �����킩�I�@�ō��̎��������ꂻ�����I";
	end;
OnTimer17000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : ���[���~�b�h�K�b�c�c�c���␢�E�ŋ������m��Ȃ��I";
	end;
OnTimer19000:
	unittalk "�Q�t�F���A�J�f�~�[�}�X�^�[ : �������̖����m�I�@�t�F�����X�I�@�t�F������!!";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�t�F������#13")),"�t�F������ : �c�c���Ɍ�����ˁB";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a2")),"���@���ϗ��� : �t�F���������������邩�I";
	unittalk getnpcid(0,getmdnpcname("�t�F�C�����ϗ��q#a2")),"�t�F�C�����ϗ��q : ���Q���̃A�C�c����������I���͂������������邺�I";
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�t�F������#13")),"�t�F������ : �����܂ŗ����Ƃ������Ƃ́c�c";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a4")),"���@���ϗ��� : �ǂ�Ȏ����ɂȂ�񂾂낤�A�ڂ������Ȃ���I";
	unittalk getnpcid(0,getmdnpcname("�A�C���X#a2")),"�A�C���X : �Ȃ��Ȃ��ʔ������Ȏ�������Ȃ��I";
	end;
OnTimer25000:
	unittalk getnpcid(0,getmdnpcname("�t�F������#13")),"�t�F������ : �����̎��͂̎����傾�Ƃ����󂯂����B";
	unittalk getnpcid(0,getmdnpcname("�v�����e���ϗ��q#a1")),"�v�����e���ϗ��q : �T�C���~����!!";
	end;
OnTimer27000:
	unittalk getnpcid(0,getmdnpcname("�t�F������#13")),"�t�F������ : ��������΂���́A�ŏ�����S�͂ł����肳���Ē�����B";
	end;
OnTimer29000:
	unittalk getnpcid(0,getmdnpcname("�t�F������#13")),"�t�F������ : �����炠�Ȃ����A�S�͂ł������Ă��Ă��傤�����B";
	unittalk getnpcid(0,getmdnpcname("���f�B�A#a2")),"���f�B�A : �������I�@�ǂ����������Ăق�����I";
	unittalk getnpcid(0,getmdnpcname("���@���ϗ���#a1")),"���@���ϗ��� : �����`�I�@�ō��̎����̊J�n����!!";
	end;
OnTimer31000:
	stopnpctimer;
	donpcevent getmdnpcname("#������A�i�E���X_timer")+"::OnStart";
	end;
}

1@ge_st.gat,114,50,4	script(HIDDEN)	�t�F������#13	664,10,1,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	if(.Sleep >= 31000) {
		if(!sleep2(20000)) end;
		cutin "fenrir_b.bmp", 0;
		if(!sleep2(10000)) end;
		cutin "fenrir_b.bmp", 255;
		if(!sleep2(6000)) end;
		end;
	}
	if(!sleep2(.Sleep)) end;
	end;
OnStart:
	hideoffnpc;
	initnpctimer;
	end;
OnTimer1000:
	unittalk "�t�F������ : �c�c���̊��s��B";
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �Q�t�F�����@���!!�@������̏��s�����܂�܂���!!";
	end;
OnTimer3000:
	unittalk "�t�F������ : ����قǂ̎��͂��������Q���҂�����Ƃ͎v��Ȃ�������B";
	misceffect 90,getmdnpcname("�A���q#q1");
	misceffect 90,getmdnpcname("�I���h��#q1");
	misceffect 90,getmdnpcname("����#q1");
	misceffect 90,getmdnpcname("�C�t�H�h�X#q1");
	end;
OnTimer5000:
	unittalk "�t�F������ : �����܂��܂��A���i����K�v�������ˁc�c�B";
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �F����I�@�D���҂Ə��D���҂ɐɂ��݂̂Ȃ���������肢�v���܂�!!";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin2";
	misceffect 89,getmdnpcname("�A���q#q1");
	misceffect 89,getmdnpcname("�I���h��#q1");
	misceffect 89,getmdnpcname("����#q1");
	misceffect 89,getmdnpcname("�C�t�H�h�X#q1");
	end;
OnTimer7000:
	unittalk "�t�F������ : �Ƃɂ����A���Ȃ��ƌ�����Ő킦�Ă悩������B";
	misceffect 62,getmdnpcname("�A���q#q1");
	misceffect 62,getmdnpcname("�I���h��#q1");
	misceffect 62,getmdnpcname("����#q1");
	misceffect 62,getmdnpcname("�C�t�H�h�X#q1");
	end;
OnTimer9000:
	unittalk "�t�F������ : �Q�t�F�����@���A�D�����߂łƂ��B";
	unittalk getnpcid(0,getmdnpcname("�A�J�f�~�[�}�X�^�[#1")),"�Q�t�F���A�J�f�~�[�}�X�^�[ : �Q�t�F�����@���͂���ɂďI���ƂȂ�܂�!!�@���̑����ӂ���Ă̂��Q�������肢�������܂�!!";
	donpcevent getmdnpcname("�A�J�f�~�[�}�X�^�[#1")+"::OnWin3";
	misceffect 225,getmdnpcname("�A���q#q1");
	misceffect 225,getmdnpcname("�I���h��#q1");
	misceffect 225,getmdnpcname("����#q1");
	misceffect 225,getmdnpcname("�C�t�H�h�X#q1");
	end;
OnTimer11000:
	unittalk "�t�F������ : �ł��c�c���͕K������������A�o�債�ĂĂˁB";
	misceffect 234,getmdnpcname("�A���q#q1");
	misceffect 234,getmdnpcname("�I���h��#q1");
	misceffect 234,getmdnpcname("����#q1");
	misceffect 234,getmdnpcname("�C�t�H�h�X#q1");
	end;
OnTimer13000:
	hideonnpc;
	end;
OnTimer15000:
	stopnpctimer;
	hideoffnpc getmdnpcname("#���@���D��1");
	donpcevent getmdnpcname("#���@���D��1")+"::OnStart";
	end;
OnTimer100000:
	end;
OnTimer102000:
	unittalk "�t�F������ : �����l�B";
	end;
OnTimer104000:
	unittalk "�t�F������ : �����̑ΐ푊�肪���Ȃ��ŁA�{���ɗǂ�������B";
	end;
OnTimer106000:
	unittalk "�t�F������ : �������ŋv���Ԃ�Ɋy�����킦�����́B";
	end;
OnTimer108000:
	unittalk "�t�F������ : �܂������A�荇�킹�����肢�����ˁB";
	end;
OnTimer110000:
	stopnpctimer;
	hideonnpc;
	hideoffnpc getmdnpcname("#���@���I��1");
	end;
}

//==========================================
// ���@���ϗ���
//------------------------------------------
1@ge_st.gat,95,62,6		script	���@���ϗ���#a1	870,{}
1@ge_st.gat,113,62,4	script	���@���ϗ���#a2	868,{}
1@ge_st.gat,99,62,6		script	���@���ϗ���#a3	727,{}
1@ge_st.gat,119,62,4	script	���@���ϗ���#a4	728,{}
1@ge_st.gat,123,62,4	script	���@�A�J�f�~�[�w��#a1	805,{}
1@ge_st.gat,103,62,6	script	���@�A�J�f�~�[�w��#a2	84,{}
1@ge_st.gat,114,62,4	script	���@�A�J�f�~�[�w��#a3	86,{}
1@ge_st.gat,109,62,4	script	���@�A�J�f�~�[�w��#a4	921,{}
1@ge_st.gat,122,62,4	script	���@�A�J�f�~�[�w��#a5	72,{}
1@ge_st.gat,97,62,6		script	�v�����e���ϗ��q#a1	985,{}
1@ge_st.gat,115,62,4	script	�v�����e���ϗ��q#a2	945,{}
1@ge_st.gat,117,62,4	script	�t�F�C�����ϗ��q#a1	803,{}
1@ge_st.gat,101,62,6	script	�t�F�C�����ϗ��q#a2	828,{}
1@ge_st.gat,121,62,4	script	�A���x���^�ϗ��q#a1	712,{}
1@ge_st.gat,105,62,6	script	�A���x���^�ϗ��q#a2	89,{}
1@ge_st.gat,107,62,6	script	�x�C���X�ϗ��q#a1	558,{}
1@ge_st.gat,111,62,4	script	�R���h�ϗ��q#a1	850,{}
1@ge_st.gat,106,62,6	script	���L#a2	512,{}
1@ge_st.gat,108,62,6	script	�P�C�I�X#a2	683,{}
1@ge_st.gat,110,62,4	script	�A�C���X#a2	666,{}
1@ge_st.gat,112,62,4	script	���f�B�A#a2	10010,{}
1@ge_st.gat,93,62,6		script	���@���ϗ���#a5	46,{}
1@ge_st.gat,94,62,6		script	���@���ϗ���#a6	67,{}
1@ge_st.gat,96,62,6		script	���@���ϗ���#a8	47,{}
1@ge_st.gat,98,62,6		script	���@���ϗ���#a10	48,{}
1@ge_st.gat,100,62,6	script	���@���ϗ���#a12	49,{}
1@ge_st.gat,102,62,6	script	���@���ϗ���#a14	66,{}
1@ge_st.gat,104,62,6	script	���@���ϗ���#a16	68,{}
1@ge_st.gat,116,62,4	script	���@���ϗ���#a28	69,{}
1@ge_st.gat,118,62,4	script	���@���ϗ���#a30	70,{}
1@ge_st.gat,120,62,4	script	���@���ϗ���#a32	51,{}
1@ge_st.gat,124,62,4	script	���@���ϗ���#a36	71,{}
1@ge_st.gat,125,62,4	script	���@���ϗ���#a37	52,{}
1@ge_st.gat,87,59,6		script	���@���ϗ���#a198	484,{}
1@ge_st.gat,87,60,6		script	���@���ϗ���#a199	534,{}
1@ge_st.gat,88,61,6		script	���@���ϗ���#a200	540,{}
1@ge_st.gat,89,62,6		script	���@���ϗ���#a201	923,{}
1@ge_st.gat,90,63,6		script	���@���ϗ���#a202	124,{}
1@ge_st.gat,91,63,6		script	���@���ϗ���#a203	838,{}
1@ge_st.gat,92,64,6		script	���@���ϗ���#a38	771,{}
1@ge_st.gat,93,64,6		script	���@���ϗ���#a39	73,{}
1@ge_st.gat,94,64,6		script	���@���ϗ���#a40	74,{}
1@ge_st.gat,95,64,6		script	���@���ϗ���#a41	54,{}
1@ge_st.gat,96,64,6		script	���@���ϗ���#a42	55,{}
1@ge_st.gat,97,64,6		script	���@���ϗ���#a43	56,{}
1@ge_st.gat,98,64,6		script	���@���ϗ���#a44	57,{}
1@ge_st.gat,99,64,6		script	���@���ϗ���#a45	75,{}
1@ge_st.gat,100,64,6	script	���@���ϗ���#a46	76,{}
1@ge_st.gat,101,64,6	script	���@���ϗ���#a47	77,{}
1@ge_st.gat,102,64,6	script	���@���ϗ���#a48	78,{}
1@ge_st.gat,103,64,6	script	���@���ϗ���#a49	58,{}
1@ge_st.gat,104,64,6	script	���@���ϗ���#a50	106,{}
1@ge_st.gat,105,64,6	script	���@���ϗ���#a51	59,{}
1@ge_st.gat,106,64,6	script	���@���ϗ���#a52	60,{}
1@ge_st.gat,107,64,6	script	���@���ϗ���#a53	79,{}
1@ge_st.gat,108,64,6	script	���@���ϗ���#a54	80,{}
1@ge_st.gat,109,64,4	script	���@���ϗ���#a55	947,{}
1@ge_st.gat,110,64,4	script	���@���ϗ���#a56	53,{}
1@ge_st.gat,111,64,4	script	���@���ϗ���#a57	62,{}
1@ge_st.gat,112,64,4	script	���@���ϗ���#a58	107,{}
1@ge_st.gat,113,64,4	script	���@���ϗ���#a59	108,{}
1@ge_st.gat,114,64,4	script	���@���ϗ���#a60	61,{}
1@ge_st.gat,115,64,4	script	���@���ϗ���#a61	804,{}
1@ge_st.gat,116,64,4	script	���@���ϗ���#a62	123,{}
1@ge_st.gat,117,64,4	script	���@���ϗ���#a63	90,{}
1@ge_st.gat,118,64,4	script	���@���ϗ���#a64	91,{}
1@ge_st.gat,119,64,4	script	���@���ϗ���#a65	92,{}
1@ge_st.gat,120,64,4	script	���@���ϗ���#a65	300,{}
1@ge_st.gat,121,64,4	script	���@���ϗ���#a67	920,{}
1@ge_st.gat,122,64,4	script	���@���ϗ���#a68	806,{}
1@ge_st.gat,123,64,4	script	���@���ϗ���#a69	807,{}
1@ge_st.gat,124,64,4	script	���@���ϗ���#a70	808,{}
1@ge_st.gat,125,64,4	script	���@���ϗ���#a71	711,{}
1@ge_st.gat,126,64,4	script	���@���ϗ���#a72	714,{}
1@ge_st.gat,127,63,4	script	���@���ϗ���#a73	724,{}
1@ge_st.gat,128,63,4	script	���@���ϗ���#a74	885,{}
1@ge_st.gat,129,62,4	script	���@���ϗ���#a75	809,{}
1@ge_st.gat,130,61,4	script	���@���ϗ���#a76	810,{}
1@ge_st.gat,130,60,4	script	���@���ϗ���#a77	63,{}
1@ge_st.gat,128,60,4	script	���@���ϗ���#a78	744,{}
1@ge_st.gat,128,59,4	script	���@���ϗ���#a79	953,{}
1@ge_st.gat,128,58,4	script	���@���ϗ���#a80	408,{}
1@ge_st.gat,128,57,4	script	���@���ϗ���#a81	473,{}
1@ge_st.gat,128,56,4	script	���@���ϗ���#a82	64,{}
1@ge_st.gat,128,55,4	script	���@���ϗ���#a83	65,{}
1@ge_st.gat,128,54,4	script	���@���ϗ���#a84	740,{}
1@ge_st.gat,128,53,4	script	���@���ϗ���#a85	473,{}
1@ge_st.gat,128,52,4	script	���@���ϗ���#a86	474,{}
1@ge_st.gat,128,51,4	script	���@���ϗ���#a87	478,{}
1@ge_st.gat,128,45,2	script	���@���ϗ���#a88	741,{}
1@ge_st.gat,128,44,2	script	���@���ϗ���#a89	122,{}
1@ge_st.gat,128,43,2	script	���@���ϗ���#a90	121,{}
1@ge_st.gat,128,42,2	script	���@���ϗ���#a91	879,{}
1@ge_st.gat,128,41,2	script	���@���ϗ���#a92	979,{}
1@ge_st.gat,128,40,2	script	���@���ϗ���#a93	914,{}
1@ge_st.gat,128,39,2	script	���@���ϗ���#a94	813,{}
1@ge_st.gat,128,38,2	script	���@���ϗ���#a95	120,{}
1@ge_st.gat,128,37,2	script	���@���ϗ���#a96	742,{}
1@ge_st.gat,128,33,2	script	���@���ϗ���#a101	816,{}
1@ge_st.gat,127,33,2	script	���@���ϗ���#a102	817,{}
1@ge_st.gat,125,32,2	script	���@���ϗ���#a104	886,{}
1@ge_st.gat,123,32,2	script	���@���ϗ���#a106	745,{}
1@ge_st.gat,121,32,2	script	���@���ϗ���#a108	82,{}
1@ge_st.gat,119,32,2	script	���@���ϗ���#a110	941,{}
1@ge_st.gat,117,32,2	script	���@���ϗ���#a112	83,{}
1@ge_st.gat,115,32,2	script	���@���ϗ���#a114	951,{}
1@ge_st.gat,113,32,2	script	���@���ϗ���#a116	983,{}
1@ge_st.gat,111,32,2	script	���@���ϗ���#a118	846,{}
1@ge_st.gat,109,32,2	script	���@���ϗ���#a120	985,{}
1@ge_st.gat,107,32,8	script	���@���ϗ���#a122	701,{}
1@ge_st.gat,105,32,8	script	���@���ϗ���#a124	987,{}
1@ge_st.gat,103,32,8	script	���@���ϗ���#a126	989,{}
1@ge_st.gat,101,32,8	script	���@���ϗ���#a128	466,{}
1@ge_st.gat,99,32,8	script	���@���ϗ���#a130	892,{}
1@ge_st.gat,97,32,8	script	���@���ϗ���#a132	991,{}
1@ge_st.gat,95,32,8	script	���@���ϗ���#a134	993,{}
1@ge_st.gat,93,32,8	script	���@���ϗ���#a136	748,{}
1@ge_st.gat,92,32,8	script	���@���ϗ���#a137	725,{}
1@ge_st.gat,91,33,8	script	���@���ϗ���#a138	726,{}
1@ge_st.gat,89,38,8	script	���@���ϗ���#a144	542,{}
1@ge_st.gat,89,39,8	script	���@���ϗ���#a145	937,{}
1@ge_st.gat,89,40,8	script	���@���ϗ���#a146	757,{}
1@ge_st.gat,89,41,8	script	���@���ϗ���#a147	758,{}
1@ge_st.gat,89,42,8	script	���@���ϗ���#a148	759,{}
1@ge_st.gat,89,43,8	script	���@���ϗ���#a149	892,{}
1@ge_st.gat,89,44,8	script	���@���ϗ���#a150	760,{}
1@ge_st.gat,89,45,8	script	���@���ϗ���#a151	761,{}
1@ge_st.gat,89,51,6	script	���@���ϗ���#a189	982,{}
1@ge_st.gat,89,52,6	script	���@���ϗ���#a190	919,{}
1@ge_st.gat,89,53,6	script	���@���ϗ���#a191	413,{}
1@ge_st.gat,89,54,6	script	���@���ϗ���#a192	943,{}
1@ge_st.gat,89,55,6	script	���@���ϗ���#a193	538,{}
1@ge_st.gat,89,56,6	script	���@���ϗ���#a194	536,{}
1@ge_st.gat,89,57,6	script	���@���ϗ���#a195	482,{}
1@ge_st.gat,89,58,6	script	���@���ϗ���#a196	95,{}
1@ge_st.gat,89,59,6	script	���@���ϗ���#a197	911,{}
1@ge_st.gat,94,34,8	script	���@���ϗ���#a153	87,{}
1@ge_st.gat,96,34,8	script	���@���ϗ���#a155	704,{}
1@ge_st.gat,98,34,8	script	���@���ϗ���#a157	894,{}
1@ge_st.gat,100,34,8	script	���@���ϗ���#a159	906,{}
1@ge_st.gat,102,34,8	script	���@���ϗ���#a161	476,{}
1@ge_st.gat,104,34,8	script	���@���ϗ���#a163	995,{}
1@ge_st.gat,106,34,8	script	���@���ϗ���#a165	839,{}
1@ge_st.gat,108,34,8	script	���@���ϗ���#a167	717,{}
1@ge_st.gat,110,34,2	script	���@���ϗ���#a169	863,{}
1@ge_st.gat,112,34,2	script	���@���ϗ���#a171	819,{}
1@ge_st.gat,114,34,2	script	���@���ϗ���#a173	821,{}
1@ge_st.gat,116,34,2	script	���@���ϗ���#a175	917,{}
1@ge_st.gat,118,34,2	script	���@���ϗ���#a177	793,{}
1@ge_st.gat,120,34,2	script	���@���ϗ���#a179	823,{}
1@ge_st.gat,122,34,2	script	���@���ϗ���#a181	825,{}
1@ge_st.gat,124,34,2	script	���@���ϗ���#a183	918,{}
1@ge_st.gat,92,59,0		script	#���@���ԉ�_11	139,{}
1@ge_st.gat,100,60,0	script	#���@���ԉ�_12	139,{}
1@ge_st.gat,109,60,0	script	#���@���ԉ�_13	139,{}
1@ge_st.gat,118,60,0	script	#���@���ԉ�_14	139,{}
1@ge_st.gat,126,59,0	script	#���@���ԉ�_15	139,{}
1@ge_st.gat,126,37,0	script	#���@���ԉ�_16	139,{}
1@ge_st.gat,118,36,0	script	#���@���ԉ�_17	139,{}
1@ge_st.gat,109,36,0	script	#���@���ԉ�_18	139,{}
1@ge_st.gat,100,36,0	script	#���@���ԉ�_19	139,{}
1@ge_st.gat,92,37,0		script	#���@���ԉ�_20	139,{}
//1@ge_st.gat,109,49,0	script	#�K���Ǘ�	139,{}

//==========================================
// ����NPC
//------------------------------------------
1@ge_st.gat,88,48,0	script	#����NPC����	139,{
	end;
OnStart:
	set '@rnd,rand(1,100);
	if ('@rnd <= 1 && '@rnd >= 25)
		hideoffnpc getmdnpcname("���@���ϗ���#z1");		//�o����25��
	if ('@rnd <= 26 && '@rnd >= 45)
		hideoffnpc getmdnpcname("���@���ϗ���#z2");		//�o����20��
	if ('@rnd <= 46 && '@rnd >= 58)
		hideoffnpc getmdnpcname("���@���ϗ���#z3");		//�o����13��
	if ('@rnd <= 59 && '@rnd >= 68)
		hideoffnpc getmdnpcname("���@���ϗ���#z4");		//�o����10��
	if ('@rnd <= 69 && '@rnd >= 70)
		hideoffnpc getmdnpcname("���@���ϗ���#z5");		//�o����2��
	//�o�����Ȃ���30��
	end;
}

1@ge_st.gat,88,48,8	script(HIDDEN)	���@���ϗ���#z1	810,{
	if(!checkquest(114700)) {
		setquest 114700;
		compquest 114700;
	}
	mes "[�������j]";
	mes "�������������[�B";
	mes "�����������B";
	mes "���Ȃ�" +strcharinfo(0)+ "�̔{��";
	mes rand(20,99)+ "�{�@����B";
	mes "��������ǂ����I";
	next;
	mes "[�������j]";
	mes "�����A��ׂ��B";
	mes "�@";
	mes "�����A�����撣���B";
	mes "���ނ��B�@���Ⴀ�ȁI";
	close2;
	hideonnpc;
	end;
}

1@ge_st.gat,88,48,8	script(HIDDEN)	���@���ϗ���#z2	72,{
	if(!checkquest(114701)) {
		setquest 114701;
		compquest 114701;
	}
	mes "[�ςȉ̂��̂�����]";
	mes "�����\���O�̂��܂��I";
	mes "�@";
	mes "�t�[�I���[�I�t�[���I";
	mes "�t�[�[�[�I";
	mes "�t�J�q���I";
	mes "���肪�Ƃ��������܂����B";
	close2;
	hideonnpc;
	end;
}

1@ge_st.gat,88,48,8	script(HIDDEN)	���@���ϗ���#z3	61,{
	if(!checkquest(114702)) {
		setquest 114702;
		compquest 114702;
	}
	mes "[�킢�D���̃}�X�^�[]";
	mes "�����͍D���ł����H";
	mes "������̔����ɐ�����悤";
	mes "�撣���Ă��������B";
	close2;
	hideonnpc;
	end;
}

1@ge_st.gat,88,48,8	script(HIDDEN)	���@���ϗ���#z4	553,{
	if(!checkquest(114703)) {
		setquest 114703;
		compquest 114703;
	}
	mes "[�����ȔL]";
	mes "�撣��[�I";
	mes "�����[�I�@�����Ƃ��ɂ�[�I";
	mes "�a������Ԃ��ɂ�[�I";
	mes "�������܂܂ł͏I���Ȃ��ɂ�[�I";
	close2;
	hideonnpc;
	end;
}

1@ge_st.gat,88,48,8	script(HIDDEN)	���@���ϗ���#z5	655,{
	if(!checkquest(114704)) {
		setquest 114704;
		compquest 114704;
	}
	mes "[�R�m]";
	mes "����ɂ��́B";
	mes "���������ȁB";
	mes "�B��Ă�������Ȃ�ł����ǁc�c�B";
	next;
	mes "[�R�m]";
	mes "�����撣���Ă��������ˁB";
	mes "���Ɓc�c";
	mes "���ꂳ��ɓ{��ꂿ�Ⴄ�̂�";
	mes "�����Ŏ�����������";
	mes "�ǂ��������ɂ��Ă��������B";
	close2;
	hideonnpc;
	end;
}

//==========================================
// �D����̏j����
//------------------------------------------
1@ge_st.gat,104,53,6	script(HIDDEN)	�A���q#q1	670,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�A���q : ��A�D�����߂łƂ��������܂��I�@�c�c���A�������Ȃ��I";
		end;
	case 1:
        unittalk "�A���q : �{���ɗD���A���߂łƂ��������܂��I";
		end;
	case 2:
        unittalk "�A���q : �l���A���킭�炢�͏��Ă�悤�ɂ���΂�܂��c�c�I";
		end;
    }
}
1@ge_st.gat,100,49,6	script(HIDDEN)	�f�B�I�E�A�l���X#q1	669,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�f�B�I�E�A�l���X : �l�͂˂��c�c�N�������������Ǝv���Ă���B";
		end;
	case 1:
        unittalk "�f�B�I�E�A�l���X : �l�ɂƂ��č��́A�D�����}�C�n�j�[�Ȃ񂾂�˂��B";
		end;
	case 2:
        unittalk "�f�B�I�E�A�l���X : �ꉞ�A�D�����߂łƂ��͂����Ă�����B";
		end;
	}
}
1@ge_st.gat,102,46,8	script(HIDDEN)	�t�F����#q1	672,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�t�F���� : �t�b�A�r�ł͓G��Ȃ��������A���e��ł̓I�����D�����ȁB";
		end;
	case 1:
        unittalk "�t�F���� : �D���҂Ȃ�A�g�����Ȃ݂��C�ɂ����ق����������H";
		end;
	case 2:
        unittalk "�t�F���� : �t���B�D�����Ă��A���̎q�ɂ��Ă�Ƃ͌���Ȃ������!?";
		end;
	}
}
1@ge_st.gat,104,44,8	script(HIDDEN)	�I���h��#q1	673,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�I���h�� : ���Ȃ��̘r�O�ɂȂ�܂ŁA�ǂ̂��炢�����邾�낤�c�c�B";
		end;
	case 1:
        unittalk "�I���h�� : �c�c���΂ł��I�@�D���҂��A��������Ȃ��Ŏ����������ł��B";
		end;
	case 2:
        unittalk "�I���h�� : ��͂�A�Q�l���œǂނ̂Ǝ���͈Ⴂ�܂��ˁB���߂łƂ��������܂��B";
		end;
	}
}
1@ge_st.gat,112,45,2	script(HIDDEN)	�u���[�g�E�n�[#q1	674,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�u���[�g�E�n�[ : �D���Ƃ��c�c���������Ȃ񂾂���!?�@�����B���A���߂łƂ�����?��";
		end;
	case 1:
        unittalk "�u���[�g�E�n�[ : �{�N���������ǁA�L�~�������񂾂ˁI�@���x����L�~���A���������Ċ�������?�I";
		end;
	case 2:
        unittalk "�u���[�g�E�n�[ : �D�����Ă���������ł���H�@�ł���H�@�����ȁ[�B";
		end;
	}
}
1@ge_st.gat,116,46,2	script(HIDDEN)	����#q1	675,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "���� : �܂��B�c�c�D���Ȃ��A����ł��܂��Ζ��Ӗ��Ȃ��̂��B";
		end;
	case 1:
        unittalk "���� : �c�c�������̏����D�����Ă�����A�ʔ������̂����ꂽ�̂Ɏc�O�������ȁB";
		end;
	case 2:
        unittalk "���� : �D���҂͖ڗ�����ȁB�Q���������Ȃ��悤�ɂ����B";
		end;
	}
}
1@ge_st.gat,115,53,4	script(HIDDEN)	�C�t�H�h�X#q1	676,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�C�t�H�h�X : �����[�I�@�D���Ƃ����邢���I";
		end;
	case 1:
        unittalk "�C�t�H�h�X : �������A�����F�߂����C�o���I�@���߂łƂ����I";
		end;
	case 2:
        unittalk "�C�t�H�h�X : ��������΁A�����D�����ă��e���e�ɈႢ�Ȃ��I";
		end;
	}
}
1@ge_st.gat,116,49,4	script(HIDDEN)	���`�F�j�G#q1	677,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "���`�F�j�G : �D���A���߂łƂ��������܂��B�{���ɐ����ł���c�c�B";
		end;
	case 1:
        unittalk "���`�F�j�G : �D�������H�@����Ȃ���A�������ɂ͊֌W�ˁ[��I";
		end;
	case 2:
        unittalk "���`�F�j�G : ���j���ɕa�@����ɂ��Ă��������܂��傤���H�@���ӂӁA��k�ł���B";
		end;
	}
}
1@ge_st.gat,112,53,4	script(HIDDEN)	�����q��#q1	678,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�����q�� : �N��֌W�Ȃ��A�D���͊��������ˁ�";
		end;
	case 1:
        unittalk "�����q�� : �D���p�[�e�B�[�A���̌���ŊJ�Â��Ăق�����?��";
		end;
	case 2:
        unittalk "�����q�� : ���x�ł��������?��@�D�����߂łƂ��B";
		end;
	}
}
1@ge_st.gat,109,54,4	script(HIDDEN)	�W���[#q1	679,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�W���[ : �Ȃɂ��A���Ȃ��̂悤�Ȃ��̂ɉ�����Ƃ���Ԃ̎��n���B";
		end;
	case 1:
        unittalk "�W���[ : �܂������ɗ��鎞�͘A�����Ă���B�َ҂̍Ȃ̎藿���ł����y�����悤�B";
		end;
	case 2:
        unittalk "�W���[ : �D���A���߂łƂ��B���Ȃ��̘r�O�ł���΁A���R�̌��ʂ��ȁB";
		end;
	}
}
1@ge_st.gat,106,50,4	script(HIDDEN)	�f�B���C#q1	680,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�f�B���C : �C����������A�E���o����A���@�w�Z�ɂ�����o���Ăق������̂��B";
		end;
	case 1:
        unittalk "�f�B���C : ���̑��ŗD�����邱�Ƃ͂ƂĂ����_�Ȃ��Ƃ��B���߂łƂ��B";
		end;
	case 2:
		unittalk "�f�B���C : �E���o���̊F�Ƒ����A��q�̊F���A�N�ɂ��߂łƂ��Ƃ����Ă�����B";
		end;
	}
}
1@ge_st.gat,107,48,8	script(HIDDEN)	�t�F�C�E�J�i�r�A��#q1	665,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�t�F�C�E�J�i�r�A�� : �{���́A�������������ɂ���͂��������̂ɂȂ��B";
		end;
	case 1:
        unittalk "�t�F�C�E�J�i�r�A���F�D�����߂ł�?�c�c�B�ł����́A���������D��������ˁI";
		end;
	case 2:
        unittalk "�t�F�C�E�J�i�r�A�� : �������A�������Ƃ��̎q�ŗD���̕��������ؖ������I";
		end;
	}
}
1@ge_st.gat,112,50,4	script(HIDDEN)	�t�F������#q1	664,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
        unittalk "�t�F������ : ����͊��S�Ɏ��̕�����B�{���ɂ��߂łƂ��B";
		end;
	case 1:
        unittalk "�t�F������ : ���Ȃ��̂悤�Ȑl������ƁA���낢��ȈӖ��ŐS������B";
		end;
	case 2:
        unittalk "�t�F������ : ���̎Q���҂��A���Ȃ��̗D�����j���āA�ꌾ�b������������B";
		end;
	}
}

//==========================================
// ���I����̌���L�����B
//------------------------------------------
1@gef.gat,125,105,4	script(HIDDEN)	�A�C���X#a1	666,{
	if(checkquest(9310) & 0x8) {
		cutin "hero_iris_02.bmp", 2;
		mes "[�A�C���X]";
		mes "���̓r���Ŕ�s�D�Ƀg���u����";
		mes "���������ɂ͖{���A���ĂȂ��Ȃ���";
		mes "�v�����񂾂��ǂˁ`�B";
		mes "�ʔ����������ꂽ����A";
		mes "���ʓI�ɂ͗ǂ������̂����ˁB";
		close2;
		cutin "hero_iris_02.bmp", 255;
		end;
	}
	if(checkquest(9308)) {
		cutin "hero_iris_02.bmp", 2;
		mes "[�A�C���X]";
		mes "�܂����D������Ȃ�āc�c�B";
		mes "�ق�ƁA������������I";
		mes "�ł���������āA";
		mes "������r�𖁂����Ƃ�";
		mes "�ӂ����Ⴞ�߂���!?";
		next;
		mes "[�A�C���X]";
		mes "���āA���ƂŁI";
		mes "�����������������Ă����������I";
		mes "�����ƁA�ǂ��܂ŏ��Ă邩�c�c�B";
		mes "�����炳���₩�Ȃ���A";
		mes "������̂��J�����ĂƂ���B";
		mes "�󂯎���Ă�ˁI";
		set '@item,rand(6,7);
	}
	else if(checkquest(9309)) {
		cutin "hero_iris_02.bmp", 2;
		mes "[�A�C���X]";
		mes "�����A�����l�I";
		mes "����͎c�O��������ˁB";
		mes "���͂������ʂɂȂ�Ƃ����ˁB";
		next;
		mes "[�A�C���X]";
		mes "�Ƃ͂����A����΂��Ă��̂�";
		mes "�������`��������c�c";
		mes "�����������̂���Ȃ�����";
		mes "������v���[���g�I";
		mes "���ꂩ�������΂��ĂˁB";
		set '@item,rand(1,7);
	}
	switch('@item) {
	case 1: getitem 501, 1; break;
	case 2: getitem 502, 1; break;
	case 3: getitem 503, 1; break;
	case 4: getitem 504, 1; break;
	case 5: getitem 505, 1; break;
	case 6: getitem 607, 1; break;
	case 7: getitem 608, 1; break;
	}
	setquest 9310;
	compquest 9310;
	close2;
	cutin "hero_iris_02.bmp", 255;
	end;
}

1@gef.gat,123,108,4	script(HIDDEN)	�P�C�I�X#a1	683,{
	if(checkquest(9311) & 0x8) {
		cutin "hero_chaos_01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "��s�D�ɖ�肪�N���A�h��T����";
		mes "�����A�Q�t�F���ɗ����񂾁B";
		mes "�F�X�����ăt�F�����������ɏo��I";
		mes "���Č��܂������͂ǂ��Ȃ邩��";
		mes "�s���������񂾂��c�c�B";
		mes "����Ӗ��A���ʃI�[���C�������ȁB";
		close2;
		cutin "hero_chaos_01.bmp", 255;
		end;
	}
	if(checkquest(9308)) {
		cutin "hero_chaos_01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�D�����[�I";
		mes "�t�F�������̋�����m���Ă邾����";
		mes "�����A���܂���҂��ĂȂ��������c�c�B";
		mes "���ꂾ���Ƀr�b�N�������I";
		mes "���߂āA���߂łƂ��ȁI";
		next;
		mes "[�P�C�I�X]";
		mes "�{���������ƁA";
		mes "����Ȃɂ��̑���";
		mes "���҂��ĂȂ������񂾂��c�c�B";
		mes "�����Ӗ��ŁA���؂�ꂽ���I";
		mes "���Ă��ƂŁA�����L�]�ȁA";
		mes "���񂽂ɂ��������I";
		set '@item,rand(6,7);
	}
	else if(checkquest(9309)) {
		cutin "hero_chaos_01.bmp", 2;
		mes "[�P�C�I�X]";
		mes "�����������������I";
		mes "�܂��A�ɂ����Ƃ�������邪";
		mes "����ȏ�ɁA���񂽂ɂ�";
		mes "�\�������������ȁI";
		next;
		mes "[�P�C�I�X]";
		mes "���Ă��ƂŁA���B";
		mes "�����������ĂĔM���Ȃ�悤��";
		mes "�����������Ă��ꂽ���炾�I";
		mes "�����������̂���Ȃ����c�c";
		mes "�ǂ����������Ă���B";
		set '@item,rand(1,7);
	}
	switch('@item) {
	case 1: getitem 501, 1; break;
	case 2: getitem 502, 1; break;
	case 3: getitem 503, 1; break;
	case 4: getitem 504, 1; break;
	case 5: getitem 505, 1; break;
	case 6: getitem 607, 1; break;
	case 7: getitem 608, 1; break;
	}
	setquest 9311;
	compquest 9311;
	close2;
	cutin "hero_chaos_01.bmp", 255;
	end;
}

1@gef.gat,117,108,6	script(HIDDEN)	���f�B�A#a1	10010,{
	if(checkquest(9312) & 0x8) {
		cutin "lydia_a.bmp", 2;
		mes "[���f�B�A]";
		mes "���[���A��s�D�ł�����";
		mes "���ڂ̂��̂��Ȃ���";
		mes "���Ă����΂悩�����Ȃ��B";
		mes "����Ȃ񂶂�A���܂ł�";
		mes "���E��̃g���W���[�n���^�[��";
		mes "�Ȃ�₵�Ȃ���B";
		close2;
		cutin "lydia_a.bmp", 255;
		end;
	}
	if(checkquest(9308)) {
		cutin "lydia_a.bmp", 2;
		mes "[���f�B�A]";
		mes "�܂����A�t�F��������|����";
		mes "�D���Ȃ�āA��邶��Ȃ��I";
		mes "�������c�c�S�z���A��T���Ƃ��Ȃ�";
		mes "���M������񂾂��ǂȂ��B";
		mes "�܂��A����͑f���ɂ��߂łƂ�����";
		mes "�����Ă����Ă�����I";
		next;
		mes "[���f�B�A]";
		mes "���͂Ƃ�����A����ꂳ�܁I";
		mes "Zeny����ɓ���`�����X��";
		mes "�܂�܂Ɠ��������ƂƂ��A";
		mes "�Y��邭�炢�A�M���ł������A";
		mes "���̂�����Ă��ƂŁc�c";
		mes "���ꂠ�����I";
		set '@item,rand(6,7);
	}
	else if(checkquest(9309)) {
		cutin "lydia_a.bmp", 2;
		mes "[���f�B�A]";
		mes "���񂽂̎����A";
		mes "��������ϋq�Ȃ���";
		mes "�����Ă��������I";
		next;
		mes "[���f�B�A]";
		mes "�������ʂ͎c�O�������ˁc�c�B";
		mes "�ł��A���񂽂�����΂����񂾂�";
		mes "���܂��A����΂�΂�����I";
		mes "�ق�I�@���ꂠ���邩��I";
		set '@item,rand(1,7);
	}
	switch('@item) {
	case 1: getitem 501, 1; break;
	case 2: getitem 502, 1; break;
	case 3: getitem 503, 1; break;
	case 4: getitem 504, 1; break;
	case 5: getitem 505, 1; break;
	case 6: getitem 607, 1; break;
	case 7: getitem 608, 1; break;
	}
	setquest 9312;
	compquest 9312;
	close2;
	cutin "lydia_a.bmp", 255;
	end;
}

1@gef.gat,115,105,6	script(HIDDEN)	���L#a1	512,{
	if(checkquest(9314) & 0x8) {
		cutin "ep14_roki01.bmp", 2;
		mes "[���L]";
		mes "�������͔�s�D�ŗ������Ă�����";
		mes "��肪�N���āA�����ő��~�߂�";
		mes "�H���Ă����Ԃ��B";
		mes "��s�D���Ȃ���Γ����Ȃ��Ƃ����̂�";
		mes "�s�ւȂ��̂��ȁB";
		close2;
		cutin "ep14_roki01.bmp", 255;
		end;
	}
	if(checkquest(9308)) {
		cutin "ep14_roki01.bmp", 2;
		mes "[���L]";
		mes "�c�c�l�ԂƂ������̂�";
		mes "�ǂ����炻��ȗ͂𔭊��ł���̂��B";
		mes "�c�c�Ȃ��Ȃ������[���B";
		next;
		mes "[���L]";
		mes "�����c�c";
		mes "�t�F�������ɏ��ɂ�";
		mes "�����Șr�O�̂�ł�";
		mes "�G���͂����Ȃ��B";
		mes "�c�c������󂯎��B";
		mes "����͉�������S�ʂ��B";
		set '@item,rand(6,7);
	}
	else if(checkquest(9309)) {
		cutin "ep14_roki01.bmp", 2;
		mes "[���L]";
		mes "���O�̎����A�����Ă�������B";
		mes "�܂��܂��r��肾���c�c";
		mes "����������悤���ȁB";
		next;
		mes "[���L]";
		mes "�c�c�B";
		mes "����͉�������S�ʂ��B";
		mes "�󂯎��B";
		set '@item,rand(1,7);
	}
	switch('@item) {
	case 1: getitem 501, 1; break;
	case 2: getitem 502, 1; break;
	case 3: getitem 503, 1; break;
	case 4: getitem 504, 1; break;
	case 5: getitem 505, 1; break;
	case 6: getitem 607, 1; break;
	case 7: getitem 608, 1; break;
	}
	setquest 9314;
	compquest 9314;
	close2;
	cutin "ep14_roki01.bmp", 255;
	end;
}

1@gef.gat,120,108,4	script(HIDDEN)	�t�F������#a1	664,{
	if(checkquest(9313) & 0x8) {
		cutin "fenrir_a.bmp", 2;
		mes "[�t�F������]";
		mes "�h�T�����łɍ���̑���";
		mes "�Q�����邱�ƂɂȂ����̂�����ǁA";
		mes "���Ƃ��Ă͎Q�����Đ�����������B";
		mes "���A�Ŏ����܂��܂��C�s��";
		mes "�K�v�Ȃ��Ƃ��킩�����̂�����B";
		close2;
		cutin "fenrir_a.bmp", 255;
		end;
	}
	if(checkquest(9308)) {
		cutin "fenrir_a.bmp", 2;
		mes "[�t�F������]";
		mes "����̑��A���������ǁc�c";
		mes "���̕����ˁB";
		mes "�ł��t�ɂ����΁A";
		mes "���Ȃ����̎��͂̎����傪";
		mes "�������Ƃ́A��������B";
		next;
		mes "[�t�F������]";
		mes "���ɉ�Ƃ��͕K��";
		mes "�����Ă݂����B";
		mes "���ꂶ�Ⴀ�܂��A�킦��̂�";
		mes "�y���݂ɂ��Ă���B";
		set '@item,0;
	}
	else if(checkquest(9309)) {
		cutin "fenrir_a.bmp", 2;
		mes "[�t�F������]";
		mes "�����̌��ʂƁA���Ȃ���";
		mes "�������e�ɂ��ă��L����";
		mes "�������b�𕷂�����B";
		mes "���ʂ͎c�O����������";
		mes "�Ƃ肠�������́A";
		mes "�x������ׂ���B";
		next;
		mes "[�t�F������]";
		mes "�����āA�������@����";
		mes "�Q�������I��Ƃ���";
		mes "�S�͂�s���������Ȃ���";
		mes "��������A�����₩������";
		mes "���蕨�𑡂��B";
		mes "���ꂩ�������΂��ĂˁB";
		set '@item,rand(1,7);
	}
	switch('@item) {
	case 0: break;
	case 1: getitem 501, 1; break;
	case 2: getitem 502, 1; break;
	case 3: getitem 503, 1; break;
	case 4: getitem 504, 1; break;
	case 5: getitem 505, 1; break;
	case 6: getitem 607, 1; break;
	case 7: getitem 608, 1; break;
	}
	setquest 9313;
	compquest 9313;
	close2;
	cutin "fenrir_a.bmp", 255;
	end;
}

//==========================================
// ��������ޔy�F�r���[�E�R�X�����[�X
//------------------------------------------
1@gef.gat,166,168,0	script	#�C�x���g1�J�n	139,9,9,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	hideonnpc getmdnpcname("#�C�x���g2�J�n");
	hideonnpc getmdnpcname("#�C�x���g3�J�n");
	hideoffnpc getmdnpcname("�Q�t�F���s��#1");
	hideoffnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
	hideoffnpc getmdnpcname("�Q�t�F���s��#3");
	hideoffnpc getmdnpcname("�J�v���̏���#1");
	setquest 9284;
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 2, 1, 1, 3, 0xFFFFFF;
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#2")),"�r���[�E�R�X�����[�X : ���ꂽ���́A�r���������D��̂��̂��B������Ƃ��񂽂ɕ��������B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#1")),"�Q�t�F���s�� : �Ȃ�ł����Ƌr��������������������Ȃ��񂾁I�@���ꂽ���̊y���݂��Ȃ����낤���I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�J�v���̏���#1")),"�J�v���̏��� : ���c�c�ȁA�Ȃ�ł��������Ȃ�c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#3")),"�Q�t�F���s�� : �c�c�G�������c�c���`�c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�J�v���̏���#1")),"�J�v���̏��� : ���A���������Ă��A���ꂪ�����Łc�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#2")),"�r���[�E�R�X�����[�X : ���������A���������炱������[���I�@�킩���ĂȂ��˂��B";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�Q�t�F���s��#1");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
	hideonnpc getmdnpcname("�Q�t�F���s��#3");
	hideoffnpc getmdnpcname("�Q�t�F���s��#11");
	hideoffnpc getmdnpcname("�r���[�E�R�X�����[�X#22");
	hideoffnpc getmdnpcname("�Q�t�F���s��#33");
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#11")),"�Q�t�F���s�� : ���傤���˂��ȁA���̂�������������苳���Ă���B";
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#22")),"�r���[�E�R�X�����[�X : �l�C���Ȃ��ꏊ�łȁI�@���ӂӁc�c�B";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#33")),"�Q�t�F���s�� : �c�c�����c�c�r�����c�c�̑�c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�J�v���̏���#1")),"�J�v���̏��� : �ǁA�ǂȂ����c�c�����Ă��������܂���!?";
	if(!sleep2(2000)) end;
	hideoffnpc getmdnpcname("#�C�x���g1�J�n2");
	end;
}

1@gef.gat,166,169,0	script	#�C�x���g1�J�n2	139,4,4,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	unittalk getcharid(3),strcharinfo(0)+ " : ��߂�I",1;
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#11")),"�Q�t�F���s�� : �Ȃ񂾂��O�B�܂����A���Ȃ�LOVE��h�̃��c��!?";
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#22")),"�r���[�E�R�X�����[�X : ���ꂽ���͍��A���̃J�v������ƌ����Ȃ񂾂��H";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#33")),"�Q�t�F���s�� : �c�c����c�c�ǂ������Ƃ����Ɓc�c�A�[�N�r�V���b�v�c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�J�v���̏���#1")),"�J�v���̏��� : �����A�����Ă��������I";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+ " : ���A�����܂��I",1;
	hideonnpc getmdnpcname("�Q�t�F���s��#11");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#22");
	hideonnpc getmdnpcname("�Q�t�F���s��#33");
	misceffect 60,"";
	monster getmdmapname("1@gef.gat"),167,169,"�r���[�E�R�X�����[�X",2568,1,getmdnpcname("�J�v���̏���#1")+"::OnKilled";
	monster getmdmapname("1@gef.gat"),168,170,"�{�����Q�t�F���s��",2568,1,getmdnpcname("�J�v���̏���#1")+"::OnKilled";
	monster getmdmapname("1@gef.gat"),166,168,"�{�����Q�t�F���s��",2568,1,getmdnpcname("�J�v���̏���#1")+"::OnKilled";
	end;
}

1@gef.gat,169,167,2	script	�J�v���̏���#1	114,{
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@gef.gat"),getmdnpcname("�J�v���̏���#1")+ "::OnKilled");
	if('count <= 0) {
		hideoffnpc getmdnpcname("�Q�t�F���s��#1");
		hideoffnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
		hideoffnpc getmdnpcname("�Q�t�F���s��#3");
		hideoffnpc getmdnpcname("#�C�x���g�ԊO1");
	}
	end;
}

1@gef.gat,166,167,0	script	#�C�x���g�ԊO1	139,5,5,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	delquest 9284;
	setquest 9285;
	misceffect 220,getmdnpcname("�Q�t�F���s��#1");
	misceffect 220,getmdnpcname("�r���[�E�R�X�����[�X#2");
	misceffect 220,getmdnpcname("�Q�t�F���s��#3");
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#1")),"�Q�t�F���s��: ���������A�r�����p���[�ŁA�{�C���o�����Ă��炤���I";
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#2")),"�r���[�E�R�X�����[�X: �����͘r�Ɋo��������݂������ȁc�c�B";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#3")),"�Q�t�F���s��: �c�c���ꂽ���c�c���܂��c�c�ӂ�ڂ����c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�J�v���̏���#1")),"�J�v���̏���: ��������ŁA�����܂���c�c�B�ł��܂��A���̕�����������߂ĂȂ��悤�ł��c�c�B";
	if(!sleep2(4000)) end;
	unittalk getnpcid(0,getmdnpcname("�A�C���X#1")),"�A�C���X: ���储���Ƒ҂����I";
	if(!sleep2(2000)) end;
	hideoffnpc getmdnpcname("�A�C���X#1");
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�A�C���X#1")),"�A�C���X: ���ꂭ�炢�ɂ��Ă����Ȃ�����I";
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�A�C���X#1")),"�A�C���X: �łȂ��Ƃ��̎��A�A�C���X�������Ȃ����I";
	misceffect 204,getmdnpcname("�A�C���X#1");
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#1")),"�Q�t�F���s��: ���񂽁A�����r��������˂����A����B�𓥂�ł����`�B";
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#2")),"�r���[�E�R�X�����[�X: �����A�����r�����̏����������B";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#3")),"�Q�t�F���s��: �c�c�R���āc�c�B";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�Q�t�F���s��#1");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
	hideonnpc getmdnpcname("�Q�t�F���s��#3");
	hideoffnpc getmdnpcname("�Q�t�F���s��#11");
	hideoffnpc getmdnpcname("�r���[�E�R�X�����[�X#22");
	hideoffnpc getmdnpcname("�Q�t�F���s��#33");
	if(!sleep2(3000)) end;
	mapannounce getmdmapname("1@gef.gat"),"���̔���������������߂ȁI", 0x9, 0x00ebff;
	if(!sleep2(2000)) end;
	hideoffnpc getmdnpcname("�P�C�I�X#1");
	if(!sleep2(2000)) end;
	misceffect 218,getmdnpcname("�P�C�I�X#1");
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#1")),"�P�C�I�X : �A�C���X�Ɏ���o���Ƃ͂ȁI�@����Ȃɂ��񑩂ȓW�J����]�Ȃ̂��B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#1")),"�P�C�I�X : �ŏ��ɒf���Ă������A������͂��ˁ[���H";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�P�C�I�X#1");
	hideoffnpc getmdnpcname("�P�C�I�X#2");
	misceffect 60,getmdnpcname("�Q�t�F���s��#11");
	misceffect 60,getmdnpcname("�r���[�E�R�X�����[�X#22");
	misceffect 60,getmdnpcname("�Q�t�F���s��#33");
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#2")),"�P�C�I�X : �܁A���S���ȁI�@���܂ŒD�����肵�Ȃ������I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#2")),"�P�C�I�X : ���炦�b!!";
	misceffect 16,getmdnpcname("�Q�t�F���s��#11");
	misceffect 16,getmdnpcname("�r���[�E�R�X�����[�X#22");
	misceffect 16,getmdnpcname("�Q�t�F���s��#33");
	hideonnpc getmdnpcname("�Q�t�F���s��#11");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#22");
	hideonnpc getmdnpcname("�Q�t�F���s��#33");
	hideoffnpc getmdnpcname("�Q�t�F���s��#1");
	hideoffnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
	hideoffnpc getmdnpcname("�Q�t�F���s��#3");
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#1")),"�Q�t�F���s�� : �r���������D��̃����c�ɂ����Ĉ���������킯�ɂ́c�c�I";
	unittalk getnpcid(0,getmdnpcname("�r���[�E�R�X�����[�X#2")),"�r���[�E�R�X�����[�X : ����!?";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���s��#3")),"�Q�t�F���s�� : �c�c���̎q�ɂ��c�c�R��ꂽ���Ɓc�c�Ȃ��c�c�̂Ɂc�c�B";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�P�C�I�X#2");
	hideoffnpc getmdnpcname("�P�C�I�X#3");
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�P�C�I�X#3")),"�P�C�I�X : �܂����C�݂������ȁI�@�}�O�i���u���C�N�I";
	misceffect 17,getmdnpcname("�Q�t�F���s��#1");
	misceffect 17,getmdnpcname("�r���[�E�R�X�����[�X#2");
	misceffect 17,getmdnpcname("�Q�t�F���s��#3");
	if(!sleep2(1000)) end;
	misceffect 183,getmdnpcname("�Q�t�F���s��#1");
	misceffect 183,getmdnpcname("�r���[�E�R�X�����[�X#2");
	misceffect 183,getmdnpcname("�Q�t�F���s��#3");
	hideonnpc getmdnpcname("�Q�t�F���s��#1");
	hideonnpc getmdnpcname("�r���[�E�R�X�����[�X#2");
	hideonnpc getmdnpcname("�Q�t�F���s��#3");
	if(!sleep2(2000)) end;
	hideonnpc getmdnpcname("�P�C�I�X#3");
	hideoffnpc getmdnpcname("�P�C�I�X#1");
	if(!sleep2(3000)) end;
	mes "[�A�C���X]";
	mes "���v�H";
	mes "�{���A���������y�͂ǂ��ɂł�";
	mes "����񂾂�ˁB";
	mes "�܂������c�c�B";
	cutin "hero_iris_01.bmp", 2;
	next;
	mes "[�J�v��]";
	mes "�����Ă���������";
	mes "���肪�Ƃ��������܂��B";
	mes "�����Ɓc�c�����O�́c�c�B";
	cutin "hero_iris_02.bmp", 255;
	next;
	mes "[�A�C���X]";
	mes "���́A�A�C���X�B";
	mes "�������̓P�C�I�X�B";
	mes "�P�C�I�X�ƈꏏ�ɖ`�����Ă�񂾂�B";
	cutin "hero_iris_02.bmp", 2;
	next;
	mes "[�A�C���X]";
	mes "�ł�����肠�̐l��";
	mes "��ɋ삯���ĂȂ�������";
	mes "�����P�C�I�X���Ԃɍ���Ȃ����������B";
	mes "����͐悸�A���̐l��";
	mes "�����Ă����ĂˁB";
	next;
	mes "[�J�v��]";
	mes "���A�����ł��ˁB";
	mes "�����Ă΁A�C�����]���āc�c�B";
	mes "���炢�����܂����B";
	mes "�����O�������Ă��������܂����B";
	cutin "hero_iris_02.bmp", 255;
	next;
	menu "�����",-;
	mes "[�J�v��]";
	mes strcharinfo(0)+ "�l";
	mes "���肪�Ƃ��������܂��B";
	mes "���������܂Ŗ����ł����B";
	mes "�{���ɂ��肪�Ƃ��������܂��B";
	next;
	mes "[�A�C���X]";
	mes "����Ȏ��ゾ����";
	mes strcharinfo(0)+ "�݂����Ȑ��`�̖�����";
	mes "�����������Ȃ����A";
	mes "���������o���";
	mes "�厖�ɂ��Ȃ��ƂˁI";
	cutin "hero_iris_02.bmp", 2;
	next;
	mes "[�A�C���X]";
	mes "���������΁c�c";
	mes "���ƃP�C�I�X�̓Q�t�F�����@����";
	mes "�ꏏ�ɗ����Ă钇�Ԃ��������";
	mes "�o�ꂷ�邩�牞���ɗ�������";
	mes strcharinfo(0)+ "���A���̑�������@�����";
	mes "���@���ɏo�ꂷ��݂������ˁI";
	next;
	mes "[�P�C�I�X]";
	mes "�ւ��c�c�������B";
	cutin "hero_iris_01.bmp", 255;
	cutin "hero_chaos_01.bmp", 2;
	next;
	mes "[�P�C�I�X]";
	mes "��������" +strcharinfo(0)+ "��";
	mes "���͂��Ȃ��Ȃ��������Ǝv�����c�c";
	mes "���@���ɂ̓t�F��������";
	mes "�Q�����Ă��邩��";
	mes "�ȒP�ɏ��ĂȂ����낤�B";
	next;
	mes "[�P�C�I�X]";
	mes "���͂��񂽂݂����ȓz�A��������Ȃ��B";
	mes "���@���ł����������݂��Ă����B";
	mes "�����牞�����ĈӖ���";
	mes "�������ʂɋC������Ă���I";
	//sc_start3 EFST_GEFFEN_MAGIC3,1,0,0,0,3600000,1;
	misceffect 220,"";
	next;
	mes "[�P�C�I�X]";
	mes "����ő��肩��󂯂�_���[�W��";
	mes "�y���ł���͂����I";
	mes "���@���Ŗ��ɗ��Ǝv�����B";
	mes "���ꂶ��c�c�A�C���X�I";
	mes "�������͖��@���̗l�q�ł�";
	mes "���ɂ����Ƃ��邩�I�@�����n�܂邺�I";
	next;
	mes "[�A�C���X]";
	mes "�������ˁA�s�������I";
	mes "���������B" +strcharinfo(0)+ "�B";
	mes "���@���ł������т��Ƃ��悤";
	mes "�������Ă邩��A�撣���ĂˁI";
	cutin "hero_chaos_01.bmp", 255;
	cutin "hero_iris_02.bmp", 2;
	close2;
	cutin "hero_iris_02.bmp", 255;
	hideonnpc getmdnpcname("�A�C���X#1");
	hideonnpc getmdnpcname("�P�C�I�X#1");
	hideonnpc getmdnpcname("�J�v���̏���#1");
	cutin "nov_magicsoul01.bmp", 255;
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+ " : �ǂ����s�v�c�Ȋ����̐l�����������B",1;
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+ " : �Y��Ȃ������ɖ��@���̎Q���\�����݂����悤�B",1;
}

1@gef.gat,159,172,6	script	�Q�t�F���s��#1	682,{}
1@gef.gat,160,176,6	script	�r���[�E�R�X�����[�X#2	682,{}
1@gef.gat,164,175,6	script	�Q�t�F���s��#3	682,{}
1@gef.gat,166,168,6	script	�Q�t�F���s��#11	682,{}
1@gef.gat,167,169,6	script	�r���[�E�R�X�����[�X#22	682,{}
1@gef.gat,168,170,6	script	�Q�t�F���s��#33	682,{}
1@gef.gat,173,167,4	script	�P�C�I�X#1	683,{}
1@gef.gat,168,168,4	script	�P�C�I�X#2	683,{}
1@gef.gat,162,174,4	script	�P�C�I�X#3	683,{}
1@gef.gat,170,168,4	script	�A�C���X#1	666,{}

//==========================================
// ��������ޔy�F�q�s�A�E�X�j�L
//------------------------------------------
1@gef.gat,72,169,0	script	#�C�x���g2�J�n	139,9,9,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	hideonnpc getmdnpcname("#�C�x���g1�J�n");
	hideonnpc getmdnpcname("#�C�x���g3�J�n");
	hideoffnpc getmdnpcname("�q�s�A�E�X�j�L#1");
	hideoffnpc getmdnpcname("�Q�t�F�������#2");
	hideoffnpc getmdnpcname("�Q�t�F�������#3");
	hideoffnpc getmdnpcname("���@�A�J�f�~�[�w��#1");
	setquest 9286;
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 2, 1, 1, 3, 0xFFFFFF;
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �����A�����̊w���B";
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#1")),"���@�A�J�f�~�[�w�� : ���A�͂��B���ɂ��p�ł��傤���B";
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : �I���[�ȊO�N������񂾂�I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �Ƃ��ƂƑ����ė�����A3�b���B";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : 3�c�c";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : 2�c�c";
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �c�c�悵�A�����ȁB";
	hideonnpc getmdnpcname("���@�A�J�f�~�[�w��#1");
	hideoffnpc getmdnpcname("���@�A�J�f�~�[�w��#2");
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �����A���O�̃����[�F�B���Љ�ȁI";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#2")),"���@�A�J�f�~�[�w�� : ���H�@���H�@�����[�H�@���A�j�F�B�̂��Ƃł����c�c�H";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : �����A�������I�@�������̌Z�M�g�ɃX�J�E�g���邩��Љ��I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#2")),"���@�A�J�f�~�[�w�� : ���́c�c���A�j�̎q�̗F�B�͂��܂���c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �c�c����H�@�N���X���C�g�Ƃ����邾�낤���B";
	if(!sleep2(5000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#2")),"���@�A�J�f�~�[�w�� : �N�A�N���X���C�g�̒j�̎q������Ȃɒ��́c�c�B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �ׂɒ��ǂ��Ȃ��Ă������񂾂��B�Ȃ��A�ȒP���낤�I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : ����ɏЉ�邾���ł����񂾂��`�B";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �ق�ق�`�A��l���炢���邾��H�@�������ƏЉ��I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#2")),"���@�A�J�f�~�[�w�� : �����ł��I�@���A�N���c�c�����āI";
	if(!sleep2(2000)) end;
	hideoffnpc getmdnpcname("#�C�x���g2�J�n2");
	end;
}

1@gef.gat,72,170,0	script	#�C�x���g2�J�n2	139,3,3,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	unittalk getcharid(3),strcharinfo(0)+ " : ������Ƒ҂āI",1;
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �����ƁA�Ȃ񂾁H�@�I���[�́B";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : �I���[�������̂����Ƀ����[���Љ�Ă����̂���H";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �����Ƃ����A�Z�M�g�ɓ���̂͊ȒP����ˁ[����ȁI";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#2")),"���@�A�J�f�~�[�w�� : ���A�����Ă�������!!";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+ " : ����Ⴋ�w������������߂�Ƃ́c�c�I",1;
	hideonnpc getmdnpcname("�q�s�A�E�X�j�L#1");
	hideonnpc getmdnpcname("�Q�t�F�������#2");
	hideonnpc getmdnpcname("�Q�t�F�������#3");
	misceffect 60,"";
	monster getmdmapname("1@gef.gat"),75,172,"�q�s�A�E�X�j�L",2567,1,getmdnpcname("���@�A�J�f�~�[�w��#2")+"::OnKilled";
	monster getmdmapname("1@gef.gat"),76,170,"�Q�t�F�������",2567,1,getmdnpcname("���@�A�J�f�~�[�w��#2")+"::OnKilled";
	monster getmdmapname("1@gef.gat"),73,173,"�Q�t�F�������",2567,1,getmdnpcname("���@�A�J�f�~�[�w��#2")+"::OnKilled";
	end;
}

1@gef.gat,73,170,1	script	���@�A�J�f�~�[�w��#2	123,{
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@gef.gat"),getmdnpcname("���@�A�J�f�~�[�w��#2")+ "::OnKilled");
	if('count <= 0) {
		hideoffnpc getmdnpcname("�q�s�A�E�X�j�L#1");
		hideoffnpc getmdnpcname("�Q�t�F�������#2");
		hideoffnpc getmdnpcname("�Q�t�F�������#3");
		hideoffnpc getmdnpcname("#�C�x���g�ԊO2");
	}
	end;
}

1@gef.gat,72,168,0	script	#�C�x���g�ԊO2	139,5,5,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	delquest 9286;
	setquest 9287;
	misceffect 220,getmdnpcname("�q�s�A�E�X�j�L#1");
	misceffect 220,getmdnpcname("�Q�t�F�������#2");
	misceffect 220,getmdnpcname("�Q�t�F�������#3");
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �����A�ӊO�Ƃ��΂�����������ȁI";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : ���ꂾ���珗�͍D���˂��I�@���ƂȂ�������I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : ���������킯���I�@���ƂȂ������Ă���񂾂ȁI";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("���@�A�J�f�~�[�w��#2");
	hideoffnpc getmdnpcname("���@�A�J�f�~�[�w��#1");
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("���@�A�J�f�~�[�w��#1")),"���@�A�J�f�~�[�w�� : ���Ⴀ�������I�@�����Ă��������I";
	if(!sleep2(1000)) end;
	hideoffnpc getmdnpcname("�t�F������#1");
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("�t�F������#1")),"�t�F������ : ���҂��Ȃ����I�@����ȏ�̗��\�͌��߂����Ȃ���ˁB";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�t�F������#1")),"�t�F������ : �܂������c�c�B���Ղ肾������āA�H�ڂ��͂���������I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�t�F������#1")),"�t�F������ : ��߂Ȃ��Ȃ玄���ق��Ă͂��Ȃ����B";
	misceffect 204,getmdnpcname("�t�F������#1");
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �Ȃ񂾁A���̏��c�c�H";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : �������͍��A�����Ƙb���Ă�񂾂��H";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : ����Ƃ��A���񂽂������ɂ�����ėL�]�ȃ����[���Љ�Ă����̂��H";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�q�s�A�E�X�j�L#1");
	hideonnpc getmdnpcname("�Q�t�F�������#2");
	hideonnpc getmdnpcname("�Q�t�F�������#3");
	hideoffnpc getmdnpcname("�q�s�A�E�X�j�L#11");
	hideoffnpc getmdnpcname("�Q�t�F�������#22");
	hideoffnpc getmdnpcname("�Q�t�F�������#33");
	if(!sleep2(3000)) end;
	mapannounce getmdmapname("1@gef.gat"),"�����܂ł��B", 0x9, 0x00ebff;
	if(!sleep2(3000)) end;
	hideoffnpc getmdnpcname("���L#1");
	if(!sleep2(1000)) end;
	misceffect 126,getmdnpcname("���L#1");
	if(!sleep2(1000)) end;
	misceffect 121,getmdnpcname("���L#1");
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("���L#1")),"���L : ���O��̂��̎��ɏ��΂����B";
	if(!sleep2(1000)) end;
	misceffect 124,getmdnpcname("���L#1");
	if(!sleep2(1000)) end;
	misceffect 122,getmdnpcname("�Q�t�F�������#33");
	misceffect 143,getmdnpcname("�Q�t�F�������#33");
	misceffect 32,getmdnpcname("�Q�t�F�������#33");
	hideonnpc getmdnpcname("�Q�t�F�������#33");
	hideoffnpc getmdnpcname("�Q�t�F�������#3");
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : ���ցI";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("���L#1");
	hideoffnpc getmdnpcname("���L#2");
	unittalk getnpcid(0,getmdnpcname("���L#2")),"���L : �����ꂽ���t�g���B";
	misceffect 271,getmdnpcname("�q�s�A�E�X�j�L#11");
	misceffect 122,getmdnpcname("�q�s�A�E�X�j�L#11");
	misceffect 143,getmdnpcname("�q�s�A�E�X�j�L#11");
	misceffect 32,getmdnpcname("�q�s�A�E�X�j�L#11");
	hideonnpc getmdnpcname("�q�s�A�E�X�j�L#11");
	hideoffnpc getmdnpcname("�q�s�A�E�X�j�L#1");
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �����Ⴀ�����I";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("���L#2");
	hideoffnpc getmdnpcname("���L#3");
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : �S�~�ȉ��̍s���B";
	misceffect 270,getmdnpcname("�Q�t�F�������#22");
	misceffect 122,getmdnpcname("�Q�t�F�������#22");
	misceffect 143,getmdnpcname("�Q�t�F�������#22");
	misceffect 32,getmdnpcname("�Q�t�F�������#22");
	hideonnpc getmdnpcname("�Q�t�F�������#22");
	hideoffnpc getmdnpcname("�Q�t�F�������#2");
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : ������I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : ����ȏ�A����{�点�����Ȃ����";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : �������ɏ���������I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : �Ёc�c�Ђ���!!";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : ���A�����I�@�����邼�I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �ȁA�Ȃ񂾂�c�c�����I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : 10�b�҂��Ă��B";
	misceffect 121,getmdnpcname("���L#3");
	misceffect 136,getmdnpcname("���L#3");
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : 10�c�c9�c�c";
	misceffect 269,getmdnpcname("���L#3");
	misceffect 126,getmdnpcname("���L#3");
	misceffect 127,getmdnpcname("���L#3");
	misceffect 125,getmdnpcname("���L#3");
	if(!sleep2(1000)) end;
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : 3�c�c2�c�c";
	unittalk getnpcid(0,getmdnpcname("�q�s�A�E�X�j�L#1")),"�q�s�A�E�X�j�L : ����A������Ƒ҂āI�@����9�b����3�b�ɁI";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#2")),"�Q�t�F������� : �Ƃ肠���������邼�I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F�������#3")),"�Q�t�F������� : �����I�@���ڂ��Ă��I";
	if(!sleep2(3000)) end;
	misceffect 104,getmdnpcname("���L#3");
	misceffect 124,getmdnpcname("���L#3");
	unittalk getnpcid(0,getmdnpcname("���L#3")),"���L : 1�c�c";
	hideonnpc getmdnpcname("�q�s�A�E�X�j�L#1");
	hideonnpc getmdnpcname("�Q�t�F�������#2");
	hideonnpc getmdnpcname("�Q�t�F�������#3");
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("���L#3");
	hideoffnpc getmdnpcname("���L#1");
	if(!sleep2(3000)) end;
	mes "[�t�F������]";
	mes "����͂Ȃ��H";
	mes "�܂������c�c�B";
	mes "���������y�͂ǂ��ɂł������ˁB";
	cutin "fenrir_b.bmp", 2;
	next;
	mes "[���@�A�J�f�~�[�w��]";
	mes "�����Ă���������";
	mes "���肪�Ƃ��������܂��B";
	mes "�Ƃ���Łc�c�����O�́c�c�B";
	cutin "fenrir_b.bmp", 255;
	next;
	mes "[�t�F������]";
	mes "���̓t�F�������c�c";
	mes "�t�F�����X�E�t�F�������B";
	mes "�������̔ނ́A���L��B";
	cutin "fenrir_a.bmp", 2;
	next;
	mes "[�t�F������]";
	mes "�ł����������c�c";
	mes "������̕��ɁA���ӂ��ĂˁB";
	mes "���̐l����ɏ����ɓ���Ȃ����";
	mes "��Ȃ��Ƃ��낾�������B";
	next;
	menu "�����",-;
	mes "[���@�A�J�f�~�[�w��]";
	mes strcharinfo(0)+ "�l";
	mes "���肪�Ƃ��������܂��B";
	mes "���������܂ŏ�����܂����B";
	mes "�{���ɂ��肪�Ƃ��������܂��B";
	cutin "fenrir_a.bmp", 255;
	next;
	mes "[�t�F������]";
	mes "���̂������A" +strcharinfo(0)+ "�̂悤��";
	mes "�l�����́A�Ȃ��Ȃ��ł��Ȃ���B";
	mes "���Ȃ��͒N����";
	mes "�E�C������݂����ˁB";
	cutin "fenrir_a.bmp", 2;
	next;
	mes "[�t�F������]";
	mes "���̓Q�t�F�����@����";
	mes "�I��Ƃ��ēo�^����";
	mes "�������r���������̂�B";
	mes "���L�͖ڗ��̂͌����Ȃ̂�";
	mes "�ǂ̂悤�ȑ��Ȃ̂�";
	mes "���������ł������ĕ����Ȃ��āB";
	next;
	mes "[�t�F������]";
	mes "�ǂ����" +strcharinfo(0)+ "��";
	mes "���@���ɎQ������݂����ˁB";
	mes "�������̂��Ȃ��̐g�̂��Ȃ���";
	mes "�����̗l�q���݂Ă����";
	mes "���@���Q���҂Ȃ�";
	mes "�����ɋC�Â��͂���B";
	next;
	mes "[���L]";
	mes "�ւ��B";
	mes "���O�����́A���@���ɎQ������̂��B";
	mes "�Ȃ�A�����炨�O�Ɏ�����Ƃ���";
	mes "�����퓬�̂Ƃ��Ɏg�p���Ă���";
	mes "�X�N���[�����g���Ă�낤�B";
	cutin "fenrir_a.bmp", 255;
	cutin "ep14_roki01.bmp", 2;
	next;
	mes "[���L]";
	mes "���̃X�N���[���̌��ʂ́A";
	mes "���O�̖��@�_���[�W���㏸������";
	mes "���ʂ�����B";
	mes "���̂���肨�O�́A";
	mes "�����܂ŏ����������Ă����B";
	//sc_start3 SC_GEFFEN_MAGIC2,1,0,0,0,3600000,1;
	misceffect 220,"";
	next;
	mes "[���L]";
	mes "�������̂��O�̍s�������Ă���";
	mes "�����A�t�F�������Ƃ��O�̐킢��";
	mes "���Ă݂����Ȃ�����łȁB";
	mes "���A�ő����͑ދ�������";
	mes "���݂������B";
	next;
	mes "[���L]";
	mes "�c�c�t�F�������B";
	mes "���낻�뎞�Ԃ��B";
	mes "�s�����B";
	next;
	mes "[�t�F������]";
	mes "�킩������A���L�B";
	mes "���@�A�J�f�~�[�̊w������B";
	mes "�܂��@���������";
	mes "��܂��傤�B";
	cutin "ep14_roki01.bmp", 255;
	cutin "fenrir_a.bmp", 2;
	next;
	mes "[�t�F������]";
	mes strcharinfo(0)+ "�Ƃ�";
	mes "���@���̌����ŉ�邱�Ƃ�";
	mes "�y���݂ɂ��Ă����ˁB";
	close2;
	cutin "fenrir_a.bmp", 255;
	hideonnpc getmdnpcname("�t�F������#1");
	hideonnpc getmdnpcname("���L#1");
	hideonnpc getmdnpcname("���@�A�J�f�~�[�w��#1");
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+ " : �����s�v�c�Ȋ����̐l�����������c�c���Ƀt�F�������B",1;
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+ " : ����͂����Ɩ��@���̐\�����݂ɍs�����B",1;
	end;
}

1@gef.gat,70,167,1	script	���@�A�J�f�~�[�w��#1	123,{}
1@gef.gat,75,172,4	script	�q�s�A�E�X�j�L#1	681,{}
1@gef.gat,76,170,4	script	�Q�t�F�������#2	681,{}
1@gef.gat,73,173,4	script	�Q�t�F�������#3	681,{}
1@gef.gat,70,171,4	script	�q�s�A�E�X�j�L#11	681,{}
1@gef.gat,68,171,4	script	�Q�t�F�������#22	681,{}
1@gef.gat,70,169,4	script	�Q�t�F�������#33	681,{}
1@gef.gat,68,169,8	script	�t�F������#1	664,{}
1@gef.gat,69,168,8	script	���L#1	512,{}
1@gef.gat,69,170,8	script	���L#2	512,{}
1@gef.gat,67,170,8	script	���L#3	512,{}

//==========================================
// ��������ޔy�F�u���b�N�E�J�l�C���[
//------------------------------------------
1@gef.gat,114,143,0	script	#�C�x���g3�J�n	139,2,2,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	hideonnpc getmdnpcname("#�C�x���g1�J�n");
	hideonnpc getmdnpcname("#�C�x���g2�J�n");
	viewpoint 2, 1, 1, 1, 0xFFFFFF;
	viewpoint 2, 1, 1, 2, 0xFFFFFF;
	viewpoint 2, 1, 1, 3, 0xFFFFFF;
	hideoffnpc getmdnpcname("�Q�t�F���Z��#1");
	setquest 9288;
	if(!sleep2(2000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���Z��#1")),"�Q�t�F���Z�� : �ǁc�c�ǁc�c�D�_!!";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���Z��#1")),"�Q�t�F���Z�� : �l�̂������������I�@�Ԃ��ā`!!";
	if(!sleep2(4000)) end;
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#1");
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : ������[�c�c�΂ꂿ������B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���Z��#1")),"�Q�t�F���Z�� : �N���I�@���̓D�_��߂܂��āI�@�l�̂���������!!";
	if(!sleep2(3000)) end;
	hideoffnpc getmdnpcname("#�C�x���g3�J�n2");
	end;
}

1@gef.gat,109,141,0	script	#�C�x���g3�J�n2	139,5,5,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	unittalk getcharid(3),strcharinfo(0)+" : ����Zeny��Ԃ��I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : ����`���`�̖����o��H�@�|�����瓦�����Ⴈ�`�I";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : �������͂���ŁI�@���Ⴀ�ˁI";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�Q�t�F���Z��#1")),"�Q�t�F���Z�� : �l�̂��������A���Ԃ��Ă��I";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : �߂܂��ĉq���ɓn���Ă��I";
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#1");
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#2");
	end;
}

1@gef.gat,107,126,4	script	�u���b�N�E�J�l�C���[#2	671,3,3,{
	end;
OnTouch:
	if(Zeny >= 10000) {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#2")),"�u���b�N�E�J�l�C���[ : �ӊO�Ƃ�邶��Ȃ��I�@���̈ӋC�ɖƂ��āA����Zeny�̊z��1Zeny�������܂����Ă������I";
		misceffect 18,"";
		set Zeny, Zeny-99;
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �҂āI�@����ł����āA���܂����Ăǂ��������Ƃ��I";
	} else {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#2")),"�u���b�N�E�J�l�C���[ : �Ȃɂ�!?�@Zeny���Ȃ���ɗp�͂Ȃ����!?�@����ł����炢�Ȃ����I";
		misceffect 18,"";
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : !?�@���A����́c�c���āA���������Zeny���΂�܂��ȁI�@������Zeny���Ǝv���čQ�Ă����I";
	}
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#2");
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#3");
	end;
}

1@gef.gat,111,118,4	script	�u���b�N�E�J�l�C���[#3	671,3,3,{
	end;
OnTouch:
	if(Zeny >= 10000) {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#3")),"�u���b�N�E�J�l�C���[ : �ӂӁI�@�ǂ����邩����H�@���Ⴀ�A�������͂���`�I";
		misceffect 18,"";
		set Zeny, Zeny-100;
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �߂܂�����o�債�Ă���!?";
	} else {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#3")),"�u���b�N�E�J�l�C���[ : �N���߂܂����ł����I�@���܂��Zeny���Ȃ������ɁI";
		misceffect 18,"";
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ����A������ƍ��͎莝�����Ȃ��������I";
	}
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#3");
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#11");
	end;
}

1@gef.gat,123,111,4	script	�u���b�N�E�J�l�C���[#11	671,3,3,{
	end;
OnTouch:
	if(Zeny >= 10000) {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#11")),"�u���b�N�E�J�l�C���[ : �ӊO�Ƃ�邶��Ȃ��I�@���̂���΂�ɖƂ��āA�܂�����ł�����I";
		misceffect 18,"";
		set Zeny, Zeny-100;
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ��峂݂����ɂ��傱�܂��Ɓc�c�I�@�҂āI";
	} else {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#11")),"�u���b�N�E�J�l�C���[ : �ӊO�Ƃ���΂�̂ˁI�@���̂���΂�ɁA���������Zeny��������@�g���Ă�ˁB";
		misceffect 18,"";
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ������A����Ȃ��̂�����Ă�����I�@�܂������A��峂݂����ɂ��傱�܂��Ɓc�c�I�@�҂āI";
	}
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#11");
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#22");
	end;
}

1@gef.gat,129,121,4	script	�u���b�N�E�J�l�C���[#22	671,3,3,{
	end;
OnTouch:
	if(Zeny >= 10000) {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#22")),"�u���b�N�E�J�l�C���[ : �Ɓc�c��峁I�@��Ԍ����ȃ����X�^�[�Ȃ̂ɁI�@�Ԏӗ���Zeny���炤���I";
		misceffect 18,"";
		set Zeny, Zeny-150;
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ���c�c����͐\����ȁc�c���āA�Ԏӗ����Ă����������낤�I";
	} else {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#22")),"�u���b�N�E�J�l�C���[ : �Ɓc�c��峁I�@��Ԍ����ȃ����X�^�[�Ȃ̂�I�@���d�u���ɁAZeny�𓐂܂ꂽ�C���ɂ��Ă��I";
		misceffect 18,"";
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ���c�c����͐\����ȁc�c���āA��A��߂�[!?";
	}
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#22");
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#33");
	end;
}

1@gef.gat,114,137,4	script	�u���b�N�E�J�l�C���[#33	671,3,3,{
	end;
OnTouch:
	if(Zeny >= 10000) {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#33")),"�u���b�N�E�J�l�C���[ : �{���ɂ�������ˁI�@�������A����Ȃɑ̗͂Ȃ��񂾂���I";
		misceffect 18,"";
		set Zeny, Zeny-100;
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �����������͂Ȃ��I�@�߂܂����I";
		if(!sleep2(3000)) end;
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#33")),"�u���b�N�E�J�l�C���[ : �c�c�d���Ȃ��B����܂�킢�����Ȃ��񂾂��ǁA���������߂܂�킯�ɂ����Ȃ��̂�I";
	} else {
		unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#33")),"�u���b�N�E�J�l�C���[ : �c�cZeny���Ȃ����񂽂ƁA����܂�킢�����Ȃ��񂾂��ǁc�c�߂܂�킯�ɂ͂����Ȃ����A�d���Ȃ���ˁc�c�B";
		misceffect 18,"";
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : ����������Zeny���Ȃ��Ȃ����Č����Ă邪�c�c���z����Zeny�͎����Ȃ��������I";
		if(!sleep2(3000)) end;
		unittalk getcharid(3),strcharinfo(0)+" : �ł�Zeny���Ȃ��͎̂���������A������˂�������Ɣ߂����Ȃ�񂾂�I ";
	}
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#33");
	monster getmdmapname("1@gef.gat"),114,137,"�u���b�N�E�J�l�C���[",2914,1,getmdnpcname("�Q�t�F���Z��#1")+"::OnKilled";
	end;
}

1@gef.gat,111,146,4	script	�Q�t�F���Z��#1	67,{
	end;
OnKilled:
	hideoffnpc getmdnpcname("�u���b�N�E�J�l�C���[#1");
	hideoffnpc getmdnpcname("#�C�x���g�ԊO3");
	end;
}

1@gef.gat,110,140,0	script	#�C�x���g�ԊO3	139,5,5,{
	end;
OnTouch:
	set '@dummy,attachrid(getcharid(3));
	hideonnpc;
	delquest 9288;
	setquest 9289;
	misceffect 20,getmdnpcname("�u���b�N�E�J�l�C���[#1");
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : ���`�c�c�B�����͎�������Ȃ�����ˁI";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : �����āA���낻�남�d�u���̎��Ԃ��B";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : ���d�u�����A1Zeny�ł������Ⴆ��ق������������A�܂��߂܂�킯�ɂ����Ȃ��̂�B";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : �Ȃɂ�!?";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : �ӂӁI�@�ǂ����������A���Ɗy�����������I�@���Ⴀ�ˁI";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : ����[�I�@����Zeny�Ԃ�!!";
	if(!sleep2(3000)) end;
	unittalk getnpcid(0,getmdnpcname("�u���b�N�E�J�l�C���[#1")),"�u���b�N�E�J�l�C���[ : ���͂́I�@�D�_�ɕԂ����āA�����Șb��I�@�o�C�o�[�C!!";
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�u���b�N�E�J�l�C���[#1");
	if(!sleep2(3000)) end;
	hideonnpc getmdnpcname("�Q�t�F���Z��#1");
	hideoffnpc getmdnpcname("�Q�t�F���Z��#3");
	mes "[�Q�t�F���Z��]";
	mes "�������c�c�l�̂����������c�c";
	mes "����Ȃ��Ƃ��āc�c�B";
	mes "���������A������ɂ�������̂Ɂc�c";
	mes "�������c�c�B";
	next;
	mes "[�Q�t�F���Z��]";
	mes strcharinfo(0)+"�l��";
	mes "�l�̂��߂ɂ��̓D�_��";
	mes "�ǂ������Ă��ꂽ�̂ɁA���ʓI��";
	mes "�������ތ`�ɂȂ��Ă��܂�";
	mes "�{���ɁA���߂�Ȃ����c�c�B";
	next;
	mes "[�Q�t�F���Z��]";
	mes "�����͂Ȃɂ���������";
	mes "�H�ׂ��肹����";
	mes "���������ƂɂȂ肻���ł��c�c�B";
	mes "�͂��c�c�B";
	mes "�������y���݂������̂ɁB";
	mes "�����c�c�B";
	next;
	hideoffnpc getmdnpcname("���f�B�A#1");
	mes "[���f�B�A]";
	mes "�Ђ���ف[���I�@�����͂��������I";
	mes "�Q�t�F���̓D�_����";
	mes "�݂�Ȃ��������Ȃ̂��ȁH";
	mes "�܁A�ǂ��ł��������ǂ�!!";
	mes "�c�c���āB";
	cutin "lydia_a.bmp", 2;
	next;
	mes "[���f�B�A]";
	mes "��H�@���񂽂���";
	mes "�Ȃ�ŋ����Ă�́H";
	mes "�����������́H";
	next;
	mes "�]����܂ł̎����b�����]";
	cutin "lydia_a.bmp", 255;
	next;
	mes "[�Q�t�F���Z��]";
	mes "����Ȃ��ƂȂ炷����";
	mes "�F�l�ƍ������Ă�����";
	mes "�ǂ������ł��c�c�B";
	mes "���A���͋C�ɕ������";
	mes "�ځ[���Ƃ��Ă܂����B";
	next;
	mes "[���f�B�A]";
	mes "(�������A�����������Ԃ�������";
	mes "������Ȃ����z�������Ă���̂�";
	mes "������������A���g�����ɂȂ���";
	mes "���񂾂񂾂��ǁc�c�B";
	mes "�ǂ��l���Ă����̍��z��";
	mes "���̎q�̓��܂ꂽ���z����ˁB)";
	cutin "lydia_a.bmp", 2;
	next;
	mes "[���f�B�A]";
	mes "�c�c�˂��B";
	mes "�������������񂾂��ǂ��B";
	mes "���̓��܂ꂽ���z�ɂ�";
	mes "����������Ă����́H";
	next;
	mes "[�Q�t�F���Z��]";
	mes "100000Zeny�ł��c�c�B";
	cutin "lydia_a.bmp", 255;
	next;
	mes "[�Q�t�F���Z��]";
	mes "�F�l�Ɩ��@�����݂悤����";
	mes "�b�ɂȂ����̂ł����c�c�B";
	mes "�����̂�����͌���������";
	mes "�e�X�g�ň��̐��т��Ƃ�����";
	mes "�O�o���Ă������Ă����c�c";
	next;
	mes "[�Q�t�F���Z��]";
	mes "�K���ɕ׋�������΂��āA";
	mes "����ƊO�o�������炦����ł��B";
	mes "��������Ƃ��o��ۂ�";
	mes "�����オ���̍��z��n����";
	mes "����ōD���ɗV��ł������āc�c�B";
	cutin "lydia_a.bmp", 255;
	next;
	mes "[���f�B�A]";
	mes "�i���z�̒��g�́c�c";
	mes "�����A100000Zeny��������B";
	mes "���z����v���Ă邵�A������";
	mes "���z�̓�������������";
	mes "�Ԃ��ׂ��A����ˁc�c�B";
	mes "����ς�B�j";
	cutin "lydia_a.bmp", 2;
	next;
	mes "[���f�B�A]";
	mes "�����A�Ⴄ�Ǝv���񂾂��ǁc�c";
	mes "���������Ă������";
	mes "���̍��z��������c�c�H";
	next;
	hideonnpc getmdnpcname("�Q�t�F���Z��#3");
	hideoffnpc getmdnpcname("�Q�t�F���Z��#2");
	mes "[�Q�t�F���Z��]";
	mes "�����c�c!?";
	mes "���̃|�����}�[�N�̍��z�c�c�B";
	mes "�͂��I�@����ł��I�@�l�̂ł��I";
	mes "���z�����傤�Ǎ����Ă܂��I";
	mes "���Ԃ��Ă��ꂽ��ł��ˁI";
	mes "���肪�Ƃ��������܂��I";
	cutin "lydia_a.bmp", 255;
	next;
	mes "[���f�B�A]";
	mes "���c�c����A�����";
	mes "�܁A�܂��A���񂽂ɂ����";
	mes "�Ԃ��Ƃ͌����Ăȁc�c�B";
	cutin "lydia_a.bmp", 2;
	next;
	mes "[�Q�t�F���Z��]";
	mes "�{���ɂ��肪�Ƃ��������܂��I";
	mes "������ɏ����Ē�����";
	mes "���̂����͖Y��܂���I";
	mes "�܂����܂��O��";
	mes "�F�l�ƍ������Ȃ���I";
	mes "����ł́A���炵�܂��I";
	cutin "lydia_a.bmp", 255;
	hideonnpc getmdnpcname("�Q�t�F���Z��#2");
	next;
	mes "[���f�B�A]";
	mes "�c�c";
	mes "���[���I�@�����I�@���̔n���I";
	mes "���āA�Ȃɂ�!?�@�Ȃ�ł��񂽂�";
	mes "���̂ق��������ƌ���̂�I";
	cutin "lydia_a.bmp", 2;
	next;
	mes "�]�������D�_�̔�Q��";
	mes "�@���������Ƃ�b�����]";
	cutin "lydia_a.bmp", 255;
	next;
	mes "[���f�B�A]";
	mes "�����牽�H�@Zeny�Ԃ����āH";
	mes "�Ȃ��I�@�����Ă��Ȃ��I";
	mes "�������ėV��ł�킯����Ȃ��I";
	mes "�|�[�V������I�@�H��I�@��ʔ�I";
	mes "���[��Ԏ����ŉ҂��ł�񂾂���I";
	cutin "lydia_a.bmp", 2;
	next;
	mes "[���f�B�A]";
	mes "�����c�c���������ǂ����Ȃ�̂��B";
	mes "��������Zeny�̓v�����e���n�����H��";
	mes "���Ƃ����ƍl����Ƃ��āA";
	mes "�C����蒼���Ė��@���ł�";
	mes "���ɍs�������ȁc�c�B";
	mes "�͂��c�c�B";
	next;
	mes "[���f�B�A]";
	mes "�c�c���������΁B";
	mes "���̑������Ďv�����񂾂���";
	mes "���񂽁A���@����";
	mes "�Q���������Ȃ́H";
	next;
	mes "[���f�B�A]";
	mes "�������c�c�����A���������΁B";
	mes "Zeny�͂Ȃ�����Ԃ��Ȃ�����";
	mes "���@���ɎQ��������Ęb���Ȃ�A";
	mes "�������A������������D�_���瓐�c�c";
	mes "�R�z���c�c�B";
	mes "�D�_�����Ƃ��Ă��������́c�c";
	next;
	mes "[���f�B�A]";
	mes "�U���͂̏オ����ʂ�";
	mes "�X�N���[���A�g���Ă�����B";
	mes "���ɂ͕K�v�Ȃ����̂����A";
	mes "Zeny�ɂȂ肻���ɂ��Ȃ����c�c�B";
	mes "���񂽂���Q�҂݂��������A";
	mes "���߂Ă��̂��炢�͂ˁB";
	//sc_start3 SC_GEFFEN_MAGIC1,1,0,0,0,3600000,1;
	misceffect 220,"";
	next;
	mes "[���f�B�A]";
	mes "�͂��c�c�B";
	mes "���������n�Ȃ��c�c�����B";
	mes "�Ƃققفc�c�B";
	mes "���ꂶ�ᎄ��";
	mes "���@���ł����ɍs������B";
	mes "����ˁB";
	close2;
	cutin "lydia_a.bmp", 255;
	hideonnpc getmdnpcname("���f�B�A#1");
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : ���肪�Ƃ����Č������Ԃ�������Ȃ������ȁB";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : �܂��A�����l����Ȃ��݂������B";
	if(!sleep2(3000)) end;
	unittalk getcharid(3),strcharinfo(0)+" : ����͂����Ɩ��@���̐\�����݂ɍs�����B";
	end;
}

1@gef.gat,108,139,6	script	�u���b�N�E�J�l�C���[#1	671,{}
1@gef.gat,104,141,6	script	���f�B�A#1	10010,{}
1@gef.gat,106,141,4	script	�Q�t�F���Z��#2	67,{}
1@gef.gat,111,146,4	script	�Q�t�F���Z��#3	67,{}

//==========================================
// ���Q����
//------------------------------------------
1@gef.gat,145,125,4	script	�A���q#z1	670,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",1);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"�ς�����h��̑g�ݍ��킹����";
		if('@prog >= 4) set '@str$[3],"���̏��_�̉��ʂ����C�ɓ���Ȃ�";
		if('@prog >= 7) set '@str$[4],"�ǂ����Ă��̑��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�A���q]";
			mes "�D�����Ȃ�āA���������ł��c�c�I";
			mes "���Ȃ��̎��������āA";
			mes "�l�c�c���߂܂����B";
			mes "���Ȃ��̂��Ƃ�ڕW�ɁA";
			mes "����΂�܂��I";
			close;
		}
		if(checkquest(9309)) {
			mes "[�A���q]";
			mes "�c�c�ӂ��B";
			mes "���ʂ͎c�O�ł������ǁc�c";
			mes "���Ȃ��Ƃ��ꏏ�ł���";
			mes "�y���������ł��B";
			mes "���A���́c�c����Ă���āA";
			mes "�{���ɂ��肪�Ƃ��������܂����I";
			close;
		}
		mes "[�A���q]";
		mes "�ځA�l�̓A���q�Ƃ����܂��B";
		mes "�c�c���Ȃ����Q���҂Ȃ�ł����H";
		mes "���A���͖l���Q������\��Ȃ�ł��B";
		mes "�Ƃ͂����A����͂��ꂪ���߂ĂŁc�c";
		mes "����ȏ�ԂŁA�ǂ����т��c���邩";
		mes "�l���g�A�s���ł��c�c�B";
		close;
	case 3:
		mes "[�A���q]";
		mes "���A�����������́c�c�B";
		mes "���Ӓ�̃A�C�e�����Ӓ肵��";
		mes "�C�����𗎂��������c�c";
		mes "���āA���߂��I�@���߂��I";
		next;
		mes "[�A���q]";
		mes "�l�͍��A�m�[�r�X������";
		mes "�A�C�e���Ӓ�̃X�L����";
		mes "�g���Ȃ�����Ȃ����c�c�I";
		mes "�����c�c�g�勾�ŉ䖝���悤�B";
		mes "���āA����H";
		mes "�g�勾���Ăǂ��Ŕ����񂾂낤�H";
		close;
	case 4:
		mes "[�A���q]";
		mes "�ځA�l�̖h��̑g�ݍ��킹";
		mes "�ǂ����ςł��傤���c�c�B";
		mes "�܂��悭�g�ݍ��킹�ɂ���";
		mes "�������Ă��Ȃ��āc�c�B";
		next;
		mes "[�A���q]";
		mes "�l�̖h��́A�قƂ�Ǘ��e��";
		mes "�p�ӂ��Ă��ꂽ��ł��B";
		mes "���̈������ł��B";
		mes "���B�]�t�j���̉H����B";
		mes "�l�́A���̉H�����C�ɓ���ł��B";
		next;
		mes "[�A���q]";
		mes "���̉H����́A��l������܂����B";
		mes "���Ƃ����̂ɖl�c�c";
		mes "�����낭�ɗp�ӂ��Ă��Ȃ��āB";
		next;
		mes "[�A���q]";
		mes "����Ȓ��A��l����̔��H��";
		mes "�鏠�ɂ͓��ʂȈӖ��������āA";
		mes "���悯�̈Ӗ������Ƃ������Ƃ�";
		mes "���ŉ�������Ȃ��悤��";
		mes "���̖h�������܂����B";
		next;
		mes "[�A���q]";
		mes "�����A�����͖����ł��傤����";
		mes "����ł���l�������T�ɂ��āA";
		mes "�l������Ă���Ă���悤��";
		mes "�������S�����ł��B";
		close;
	case 5:
		mes "[�A���q]";
		mes "�͂��I";
		mes "���̏��_�̉��ʂ��l��";
		mes "���C�ɓ���Ȃ�ł��B";
		mes "����͕��l������܂����B";
		next;
		mes "[�A���q]";
		mes "���Ȃ񂾂���A�ՂނȂ�";
		mes "�S�͂������Ē��ނׂ����B";
		mes "������O��͐��̂Ȃ炢�Ȃ̂�����";
		mes "���������藎�_�����A";
		mes "�ǂ�Ȏ�������S�ł���Ɓc�c�B";
		next;
		mes "[�A���q]";
		mes "�����l�炵���A���l�̌��t���Ȃ�";
		mes "�v���܂����c�c�B";
		mes "�Ȃ̂ŁA���̉��ʂ�����";
		mes "���l�̌��t��Y�ꂸ�ɁA";
		mes "�S�͂ł���΂����ł��I";
		close;
	case 6:
		mes "[�A���q]";
		mes "���͖l�A�ƋƂ��p���łق����Ƃ���";
		mes "���e�̔��΂������؂���";
		mes "���̑��ɏo�ꂵ����ł��B";
		mes "���̂����A���̑���";
		mes "�ǂ����т��c���Ȃ��ƁA";
		mes "�ƋƂ��p���񑩂ł����c�c�B";
		next;
		mes "[�A���q]";
		mes "�c�c�Ȃ��ł��傤�A���Ȃ��Ƃ�";
		mes "���߂ĉ�C�����Ȃ��āB";
		mes "������������l�ɂƂ��āA";
		mes "���̑��ŏ��ōŌ�ɂȂ邩����";
		mes "�l������A�N���ɕ����Ăق�����";
		mes "���Ȃ��ɘb���Ă��܂��܂����B";
		next;
		mes "[�A���q]";
		mes "�Ȃ̂ł����A���Ȃ��Ɩl��";
		mes "�키���ƂɂȂ��āA�l����������";
		mes "�l�݂����ȎQ���҂������Ȃ�";
		mes "�����Ă��Ă����������";
		mes "�������������ł��I";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�A���q : �D�������BZeny�v�Z�̑��Ȃ�A�D�����鎩�M����񂾂��ǂȁc�c�B";
			end;
		case 1:
			unittalk "�A���q : �l���D�������l�݂����ɁA���h�ȏ��l�ɂȂ�邩�ȁc�c�B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�A���q : �c�c�ӂ��B�ْ��������ǁA�o�ꂵ�Ă悩�����Ȃ��c�c�B";
		if(Sex == 0)	unittalk "�A���q : �����̌��ʂ͂��߂��������ǁA�y���������Ȃ��c�c�I";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�A���q : ���A�ْ����Ă����c�c�B���A����΂邼�c�c�I�[�c�c�B";
		if(Sex == 0)	unittalk "�A���q : ���������̃Z�|�X������Ă���邩��A�o�^�Ɏ�Ԏ����������Ȃ��c�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "�A���q : ���A�����������͎�̂Ђ��Zeny��Z�}�[�N�������΂����񂾂����c�c�B";
		if(Sex == 0) unittalk "�A���q : �\�ɂ͕����Ă������ǁA�����̐l������񂾂Ȃ��c�c�B";
		end;
	case 2:
		if(Sex == 1) unittalk "�A���q : ���A���킟�c�c�݂�ȁA���������Ȃ��c�c�B";
		if(Sex == 0) unittalk "�A���q : ���[���ƁA����̈������̎Q�l���A�������ǂݒ����Ă��������ȁc�c�B";
		end;
	}
}

1@gef.gat,91,117,6	script	�f�B�I�E�A�l���X#z1	669,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",2);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"�N�̓}�W�V�����Ȃ́H";
		if('@prog >= 4) set '@str$[3],"�ڂ����������ǁA�Ȃɂ��p���ł��H";
		if('@prog >= 7) set '@str$[4],"�ǂ����Ă��̑��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�f�B�I�E�A�l���X]";
			mes "�����̎��A";
			mes "�l�̒��q�͍ň�����������˂��B";
			mes "�s���Ƃ͂����l�ɏ������񂾂���A";
			mes "�D�����炢���Ă����Ȃ��Ƃ˂��B";
			close;
		}
		if(checkquest(9309)) {
			mes "[�f�B�I�E�A�l���X]";
			mes "�����I����Ă��܂����˂��B";
			mes "���Ȃ݂ɖl�͑̒���";
			mes "���܂����������悤���c�c�B";
			mes "�F�ɂ͖ق��Ă������ǁA";
			mes "������班���̒����悭�Ȃ��Ă˂��I";
			mes "����`�Q�����Q�����˂��B";
			close;
		}
		mes "[�f�B�I�E�A�l���X]";
		mes "�l�͂˂��A�f�B�I�E�A�l���X�B";
		mes "���鐒���ȖړI�̂��߂�";
		mes "���̑��ɎQ������񂾂�˂��B";
		mes "�ǂ����N���Q���҂�";
		mes "1�l�݂������˂��B";
		mes "�܂��A��낵�����ނ�B";
		close;
	case 3:
		mes "[�f�B�I�E�A�l���X]";
		mes "�����c�c�}�C�n�j�[�I";
		mes "�N�͂ǂ����Ă���Ȃ�";
		mes "�T�x�[�W�x�x�̂悤��";
		mes "���炵���񂾁I";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "�c�c�B";
		mes "�Ȃ񂾂��H";
		mes "�l�͂˂��A���ܑ厖�ȍl�����Ƃ�";
		mes "���Ă���Œ��Ȃ񂾂�B";
		mes "�ז����Ȃ��ł���邩���H";
		close;
	case 4:
		mes "[�f�B�I�E�A�l���X]";
		mes "���ĕ�����Ȃ������H";
		mes "�܂��A�B�����Ƃł��Ȃ�����˂��B";
		mes "�����Ă������B";
		mes "�l�͐����̃}�W�V��������B";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "�����̗��e���}�W�V�����ł˂��B";
		mes "�l��5�΂̂��납�炸�[���ƁA";
		mes "�}�W�V�����ɂ��Ă̕׋���";
		mes "�������Ă��Ȃ��񂾂�˂��B";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "����Ȃ킯����������N���A";
		mes "�l�ɕ����Ă��C�ɂ��Ȃ�����";
		mes "�����Ǝv���悧�B";
		mes "�l�ɕ�����̂͂���Ӗ��A";
		mes "�d�����Ȃ�����˂��B";
		close;
	case 5:
		mes "[�f�B�I�E�A�l���X]";
		mes "�\�[�T���[�̏����Ȃ񂾂��ǂ˂��B";
		mes "�m���A�Q�t�F�����@�w�Z��";
		mes "�]�E�������󂯂邽�߂�";
		mes "�o�������ۂɁA";
		mes "���������C������񂾂�˂��B";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "���e���炱�̑��ɏo��悤��";
		mes "���߂��āA�o�ꂵ�������";
		mes "�Ȃ��Ȃ��ǂ����āA���Ԃ��Ă��̂�";
		mes "�������Ċ������˂��B";
		mes "�l�̐S�́A���[���~�b�h�K�b�c";
		mes "�����L�����ǂˁB";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "����������A�N��������";
		mes "���l�Ȏ��������Ă�";
		mes "�l�����͌N�ւ̑ԓx��";
		mes "�ς����肵�Ȃ�����˂��B";
		mes "���S����Ƃ�����B";
		close;
	case 6:
		mes "[�f�B�I�E�A�l���X]";
		mes "���������A�l�͂˂��c�c";
		mes "���̑��ŗD�������瓯���w�Z��";
		mes "�}�C�n�j�[�ɑ�X�I�ɍ�������";
		mes "����Ȃ񂾂�˂��B";
		mes "�c�c�B";
		mes "�������������̂����Ċ炾�˂��B";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "�Ȃ񂾂��N�͏��Ζʂ̂͂��Ȃ̂�";
		mes "�O���牽�x������Ă���C������";
		mes "���傤���Ȃ��񂾂�˂��B";
		mes "��������ʂɌN�ɂ͖l��";
		mes "�����������ʂ�";
		mes "�������킹�Ă����悤����Ȃ����B";
		next;
		mes "[�f�B�I�E�A�l���X]";
		mes "�ʂ�1�l�ō������Ă��ǂ��񂾂��ǂˁB";
		mes "�N�������A�N���ɍ�������Ƃ���";
		mes "�Q�l�ɂȂ�񂶂�Ȃ����Ȃ�";
		mes "�v�����񂾂�ˁB";
		mes "�f���āA1�l����S�ׂ��Ƃ�";
		mes "����Ȃ��Ƃ͂Ȃ�����˂��B";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�f�B�I�E�A�l���X : �܂����l�̑ΐ�҂��D�����Ă��܂��Ƃ͂˂��c�c�B";
			end;
		case 1:
			unittalk "�f�B�I�E�A�l���X : �D���̃g���t�B�[���Ȃ��Ȃ�A�l���D������Ӗ��͂Ȃ����������Ȃ񂩂Ȃ��˂��B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�f�B�I�E�A�l���X : �܁A�l������ȑ��ŏ����Ă��܂����瑼�̎Q���҂Ɉ������A�����Ă�����̂��ꋻ���˂��B";
		if(Sex == 0)	unittalk "�f�B�I�E�A�l���X : ��������ɖ{�C���o���Ȃ����A�������̂͂���Ӗ��A���R�̌��ʂ��˂��B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�f�B�I�E�A�l���X : ���ʂ����܂��Ă鎎���Ȃ�āA���K�v�Ȃ��Ǝv�����ǂ˂��B";
		if(Sex == 0) unittalk "�f�B�I�E�A�l���X : �l�̐킢�Ԃ�����āA�t�@�����������獢��˂��c�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "�f�B�I�E�A�l���X : �����j�Ȃ̂ɁA�B���Ȃ��˔\�Ɖ؂₩���B�l�̑��݂͍߂���˂��c�c�B";
		if(Sex == 0) unittalk "�f�B�I�E�A�l���X : �}�C�n�j�[�قǂ���Ȃ����A�����q��������񂾂˂��B";
		end;
	case 2:
		if(Sex == 1) unittalk "�f�B�I�E�A�l���X : �����ɂނ��āA���_���ꂵ�Ă��������˂��B";
		if(Sex == 0) unittalk "�f�B�I�E�A�l���X : ���肪�������Ɛ킢�ɂ�������A��߂Ăق����˂��c�c�B";
		end;
	}
}

1@gef.gat,53,90,6	script	�t�F����#z1	672,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",6);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"���Ă���悤�Ɍ����܂���";
		if('@prog >= 4) set '@str$[3],"���������܂��Ă��܂���";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�t�F����]";
			mes "���񂽂��D�����Ă��ꂽ���A��";
			mes "������������������Ă���ĂȁB";
			mes "���A�ł��܂́A";
			mes "�f�[�g�̖񑩂ő�Z�����B";
			mes "���񂽂��D�����Ă����";
			mes "����Ӗ��A�ǂ������̂����ȁB";
			close;
		}
		if(checkquest(9309)) {
			mes "[�t�F����]";
			mes "�c�c����Ȃ܂����I";
			mes "���̃I����������Ƃ́c�c�B";
			mes "�ł��A�I���̔�������";
			mes "�A�s�[���͂ł����͂������ȁB";
			mes "����ł悵�Ƃ��邩�c�c�B";
			mes "���ꂶ��A�����B";
			close;
		}
		mes "[�t�F����]";
		mes "���̊i�D����@����ɁA";
		mes "���@���ɎQ������݂������ȁB";
		mes "�I���̓t�F�����B";
		mes "�g�ݍ��킹���悶��A";
		mes "�키���ƂɂȂ肻�����ȁB";
		close;
	case 3:
		mes "[�t�F����]";
		mes "�t�t�c�c�B";
		mes "�I�����p�̋��Ŏ����̊i�D��";
		mes "����m�F���Ă�񂾂��c�c�B";
		mes "���Ă����A���̒b��������";
		mes "�o�����X����ꂽ���̂����B";
		next;
		mes "[�t�F����]";
		mes "�j�͂����ɁA�ؓ������ǂ��Ƃ�";
		mes "�b�����������̂��������邪�A";
		mes "����Ȃ��́A�i���Z���X���ˁB";
		mes "�������́A��Ƒ̂̃o�����X��";
		mes "�厖�����Ă����̂ɁB";
		close;
	case 4:
		mes "[�t�F����]";
		mes "�����c�c�B";
		mes "������Ɗ猩�m��̒j����A";
		mes "�I�������Ă邩����āA";
		mes "������ݔ����ŕ��������ꂽ�������B";
		next;
		mes "[�t�F����]";
		mes "�I����2�l�̌Z�M���A";
		mes "���O�������Ɖ҂��Ȃ�����";
		mes "���܂ł����Ă�������";
		mes "�y�ɂȂ�Ȃ�����";
		mes "�����͓���������΂���ŁA";
		mes "�I���̂����ɂ��邩��ȁc�c�B";
		next;
		mes "[�t�F����]";
		mes "�I�����ւ��j�͂���ȓz��΂��肾�B";
		mes "�t�ɏ��̎q�����͂ǂ̎q��";
		mes "�����q�������āA";
		mes "����̎q�����t�������Ƃ�";
		mes "�o���Ȃ��̂��Y�݂����ǂȁI";
		close;
	case 5:
		mes "[�t�F����]";
		mes "���A�悤�B";
		mes "�c�c�ς��ȁA���ΖʂȂ̂�";
		mes "�Ȃ��������m�̒��ȋC�����邺�B";
		mes "�܂��A�ǂ����ŉ�����\����";
		mes "�ۂ߂Ȃ����c�c";
		mes "�C�ɂ��Ă��d���Ȃ����ȁB";
		next;
		mes "[�t�F����]";
		mes "�͂́I";
		mes "���O�ɂ̓I���̂���";
		mes "�Z���X���킩��݂������ȁI!";
		mes "����c�c����Ȃ��O�ɂȂ�b���Ă�";
		mes "���v�������ȁc�c�B";
		next;
		mes "[�t�F����]";
		mes "�I���̎��Zeny�𒙂߂�";
		mes "�V���������i�═��𔃂�����";
		mes "�Ȃ񂾂��A�ǂ������̍l������";
		mes "��������Ȃ��񂾁B";
		next;
		mes "[�t�F����]";
		mes "�ق������̂�����ȏ�A";
		mes "�g��Zeny�̋��z�͌��炷��ȁH";
		mes "�Ⴆ�΁A�H�ׂ���̂�";
		mes "�^���̐��荇�킹����";
		mes "����t���Ă����ɕς���";
		mes "Zeny�������������񂾁B";
		next;
		mes "[�t�F����]";
		mes "����Ǝ��肩��Ȃ�����";
		mes "�P�`���̂Ȃ񂾂̂�";
		mes "����ꂿ�܂��񂾂�Ȃ��c�c�B";
		mes "�g�������Ȃ����猸�炷�̂�";
		mes "�[�������Ȃ����c�c�B";
		close;
	case 6:
		mes "[�t�F����]";
		mes "�o�ꂵ�����R���H";
		mes "���ɏo�ꂵ�����R�̈�Ԃ�";
		mes "���_�A�I���̔������A�s�[��";
		mes "�Ȃ񂾂��c�c����ɉ���";
		mes "��ɓ��ꂽ���@���R�C���𔄂��āA";
		mes "�����������̂�����񂾂�ȁB";
		next;
		mes "[�t�F����]";
		mes "�V�������\���ꂽ�f�U�C����";
		mes "����C�c�c���낢���";
		mes "�ق����񂾂�c�c�I";
		mes "�����ɂ����Ă��܂���";
		mes "�f�U�C���͒j���̂ق���";
		mes "�����������̂������񂾂��c�c�B";
		next;
		mes "[�t�F����]";
		mes "�I���͎c�O�Ȃ��珗������A";
		mes "������Ȃ��ꍇ�������񂾂�B";
		mes "���̎������́A���̖\�͌Z�M�ǂ���";
		mes "�����A�܂����Ȃ邺�c�c�B";
		mes "�܂��A�I���͒j������������";
		mes "���ł悩�������ǂȁB";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�t�F���� : �D�����Ă�����I���͂����ƋP�������낤�ȁB";
			end;
		case 1:
			unittalk "�t�F���� : �܂����A�C�c���D������Ƃ͂ȁc�c�B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�t�F���� : �c�c�����j�̓I���̎ז�������B���ɂȂ邺�c�c�B";
		if(Sex == 0)	unittalk "�t�F���� : ���������̎q���Ԃ߂Ă����������A�ɂ͂Ȃ��������ȁB";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�t�F���� : ���������j�����Ȃ��݂������ȁB�s�����������I";
		if(Sex == 0) unittalk "�t�F���� : �c�c�i���p�͑��̌�̂��y���݂ɂ��Ă������ˁB";
		end;
	case 1:
		if(Sex == 1) unittalk "�t�F���� : ���x�A�t�@���̎q�����Ɠ������ύ��݂ł��H�ׂɍs�����B";
		if(Sex == 0) unittalk "�t�F���� : ���̎q����̔M�������������邺�c�c�B";
		end;
	case 2:
		if(Sex == 1) unittalk "�t�F���� : �����̃I�����A���܂��Ă�ȁI";
		if(Sex == 0) unittalk "�t�F���� : �ւ��B���҂��ĂȂ��������o��҂ɂ��A�����q�͑����񂾂ȁB";
		end;
	}
}

1@gef.gat,85,68,6	script	�I���h��#z1	673,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",7);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"�Ȃɂ��Y��ł��܂��H";
		if('@prog >= 4) set '@str$[3],"���͏C�s���ł����H";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�I���h��]";
			mes "�c�c�ӂ��B";
			mes "���͍��A�җ�Ɋ������Ă��܂��B";
			mes "���Ȃ��̂悤�ɘr�̂���m��";
			mes "���邱�Ƃ�m��A���E�͍L���ȂƁc�c�B";
			mes "���V��ɂ������Ă�����A���Ȃ��ɂ�";
			mes "����ł��Ȃ������ł��傤�ˁB";
			close;
		}
		if(checkquest(9309)) {
			mes "[�I���h��]";
			mes "�c�c��͂�A�w�͂����Ƃ����";
			mes "���܂ꂽ�Ƃ��Ɍ��߂�ꂽ";
			mes "�^���͕ς����Ȃ��̂��c�c�B";
			mes "���A���Ȃ��́c�c�B";
			mes "����A�Ƃ茾�ł��c�c�B";
			mes "���A�����l�ł����B";
			close;
		}
		mes "[�I���h��]";
		mes "���Ȃ����Q�������̂ł����H";
		mes "���̓I���h���B";
		mes "���@���Q���҂�1�l�ł��B";
		mes "�R������Q�t�F�����@����";
		mes "�Q���ł���Ƃ́c�c�B";
		mes "�ƂĂ����h�Ȃ��Ƃł��B";
		close;
	case 3:
		mes "[�I���h��]";
		mes "���͂������z������O��";
		mes "�N�����āA�Q�l����ǂ񂾂�";
		mes "���@�̏C�s�������Ȃ��A";
		mes "���z�����ނ���ɁA";
		mes "�A�Q����Ƃ���������18�N��";
		mes "���������Ȃ��Ă��܂����B";
		next;
		mes "[�I���h��]";
		mes "���V��ł͂��ꂪ";
		mes "������O�������̂ł��B";
		mes "�ł���������̊X�ł́A";
		mes "���Ȃ�x���܂ŊF����";
		mes "�����Ă�����N���Ă���ƕ���";
		mes "�����Ă��܂��c�c�B";
		close;
	case 4:
		mes "[�I���h��]";
		mes "�c�c���Ȃ��͖{���ɂ悭";
		mes "�l���ώ@����Ă���̂ł��ˁB";
		mes "���Ȃ��̋�Ƃ���A";
		mes "�Y��ł���c�c�Ƃ�����";
		mes "�킩��Ȃ����Ƃ������āB";
		next;
		mes "[�I���h��]";
		mes "���Q���\��̕���";
		mes "�ϐ�҂̕�����";
		mes "�b�������邱�Ƃ�����̂ł����A";
		mes "���̂��݂Ȃ���A";
		mes "�����������Ǝv����";
		mes "���������Ă���̂ł��c�c�B";
		next;
		mes "[�I���h��]";
		mes "���͂��̒ʂ�A�̂̐����ׂ�";
		mes "�������ۂ���ۂ�^����̂�";
		mes "�d�����Ȃ��Ƃ͎v���̂ł����c�c�B";
		mes "�������Ԉ����Ə���";
		mes "�C�ɂȂ��Ă��܂��܂��ˁB";
		mes "�̂��b����ׂ��ł��傤���c�c�B";
		close;
	case 5:
		mes "[�I���h��]";
		mes "�������܂ŎQ�l����ǂ�ł��܂�����";
		mes "�x�e���悤�Ǝv���Ă����Ƃ���Ȃ̂�";
		mes "���v�ł���B";
		mes "�Ƃ���Łc�c";
		next;
		mes "[�I���h��]";
		mes "���ʂ��Ƃ����f�����܂����A";
		mes "������ǂ����Łc�c�B";
		mes "���A�����܂���B";
		mes "�悭�l����Ύ��������ɗ����̂�";
		mes "���񂪏��߂Ăł����B";
		mes "�C�ɂ��Ȃ��ł��������B";
		next;
		mes "[�I���h��]";
		mes "���A���ȕ�����������������";
		mes "�Q�l����Ў�ɁA���K���Ă��܂���";
		mes "�c�c�Ȃ��Ȃ����܂������܂���ˁB";
		mes "���Ɏ��͂��܂�v�̂��ǂ��킯�ł͂Ȃ�";
		mes "�J��Ԃ��āA����Ɖ�����̂Łc�c�B";
		next;
		mes "[�I���h��]";
		mes "����Ȏ����A���V��̈ꕔ�̕���";
		mes "�^�̓w�͉Ƃ��ƁA�J�߂����";
		mes "���ɂ͂�������Ⴂ�܂����c�c�B";
		mes "���Ƃ��Ă͓w�͂��Ă���p��";
		mes "�������ɂ��Ȃ��Ȃ���";
		mes "�Ӗ����Ȃ��Ǝv���̂ł����c�c�B";
		close;
	case 6:
		mes "[�I���h��]";
		mes "�Ȃ��������̑��ɏo�ꂵ�悤��";
		mes "�v�����̂��A�ł����B";
		mes "���́c�c";
		mes "���̉Ƃ́A���V��ł�1�`2�𑈂�";
		mes "���͂������Ă���悤�ł��āc�c�B";
		next;
		mes "[�I���h��]";
		mes "�����̂悤�Ȍ��̏��";
		mes "�悢���т��c���A���Ƃ̈Ќ���";
		mes "�����K�v������悤�Ȃ̂ł��B";
		next;
		mes "[�I���h��]";
		mes "�܂��A����ɂȂ��̂́A";
		mes "�j�݂̂ł�����c�c";
		mes "��l���q�Œj�̎���";
		mes "�������ĎQ�����邱�ƂɂȂ����̂ł��B";
		next;
		mes "[�I���h��]";
		mes "�����ɗ��Ă���A�N���Ɍ����Ă���";
		mes "�����������܂����c�c�B";
		mes "�䂪�Ƃ̎�������Ƃ���";
		mes "�킢���������ł����c�c";
		mes "�����U�镑���⌾���ɂ�";
		mes "�C�����Ȃ��Ƃ����܂���B";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�I���h�� : �c�c���̕��ƃt�F����������̎����A���������Ȃ��B";
			end;
		case 1:
			unittalk "�I���h�� : �D���͓����Ă��܂�������ǁA�悢�׋��ɂȂ����B���̌o���𐶂����˂΁B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�I���h�� : �c�c��͂�A�܂������C�s�s���Ȃ̂��H�@����Ƃ���͂萫�ʂ́c�c�B";
		if(Sex == 0)	unittalk "�I���h�� : �ޏ��̂悤�Șr�����̐l�ł������Ă��܂��Ȃ�āc�c��͂�A���E�͍L���B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�I���h�� : �����Ŗ��@�̏C�s�����Ă͖��f���낤�Ȃ��c�c�B";
		if(Sex == 0) unittalk "�I���h�� : ���̂��낤�A�ŋߖ��ɒN���Ɍ����Ă��鎋����������c�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "�I���h�� : �������̎��Ԃ͏C�s�ɗ��ł��邩�痎�������Ȃ��c�c�B�Q�l���ł��ǂ�ł������B";
		if(Sex == 0) unittalk "�I���h�� : �c�c�����������玄���ޏ������̂悤�Ɂc�c���߂��I�@���O������Ǝ�C�ɂȂ��Ăǂ�����񂾁A���I";
		end;
	case 2:
		if(Sex == 1) unittalk "�I���h�� : ���̐l�A���͋C�Ƒ�������@����ɁA���Ȃ�̘r�O���낤�Ȃ��B";
		if(Sex == 0) unittalk "�I���h�� : �Ă�����1�l��2�l���炢���Ǝv�������ǁA�����̎Q���҂�����Ƌ���񂾂ȁc�c�B";
		end;
	}
}

1@gef.gat,111,62,6	script	�u���[�g�E�n�[#z1	674,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",8);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"������Q�t�F���ɏZ��ł�́H";
		if('@prog >= 4) set '@str$[3],"�������������A�������Ă܂���";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�u���[�g�E�n�[]";
			mes "�L�~���D������������́H";
			mes "�����Ȃ񂾁[�A���߂łƂ��I";
			mes "��ł�������œ������悤��";
			mes "�v���Ă��̂Ɂc�c�B";
			mes "�D�������������A";
			mes "�ł��Ȃ�����Ȃ����[�I";
			close;
		}
		if(checkquest(9309)) {
			mes "[�u���[�g�E�n�[]";
			mes "�c�c�����A�ǂ������I";
			mes "���̂������A���Ȃ�N�G�����Ă邩��A";
			mes "���Ȃ����S�z�Łc�c�B";
			mes "�����ɏW������ǂ��낶��";
			mes "�Ȃ�������c�c�B";
			mes "�c�c���A�Ȃ�ł��Ȃ���`�H";
			close;
		}
		mes "[�u���[�g�E�n�[]";
		mes "�ȂɂȂɁ[�H";
		mes "�{�N�ɋ�������̂��ȁH";
		mes "�{�N�̓u���[�g�E�n�[�I";
		mes "���̓��̂������́c�c";
		mes "���H�@�������̖��O�͕����ĂȂ��H";
		mes "�����[���B";
		close;
	case 3:
		mes "[�u���[�g�E�n�[]";
		mes "�{�N�A�Â��̂Ƌ����ꏊ���炢�Ȃ́�";
		mes "�������ƃ_���W����������[���B";
		mes "�Ȃ�ŐQ�Ȃ��ƃ_���Ȃ̂��ȁ[�H";
		mes "�Q�Ă�ԂɏP��ꂽ�炳�A";
		mes "������������܂�Ȃ���ˁ[�B";
		mes "�����v��Ȃ��[�H";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "����ɈÂ��ƁA�ɂ����ɕq���ɂȂ邩��";
		mes "�ނ���悤�Ȍ��̂ɂ�����";
		mes "�C���������Ȃ�����Ƃ����邵�B";
		mes "�_���W�����́A�΂��������B";
		mes "���̐���������Ă���Ȃ����ȁ[�B";
		mes "�L�~�������v���ł���H�@�ł���H";
		close;
	case 4:
		mes "[�u���[�g�E�n�[]";
		mes "���[��˂�I";
		mes "�Q�t�F���ɂ͖��@����";
		mes "�Q�����邽�߂ɗ����񂾂�`�I";
		mes "�{�N�A�A���f�o�������܂�Ȃ񂾁B";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "�ƁE���E��E�ŁI";
		mes "�A���f�o�������ĕ����ƁA";
		mes "����z������`�H";
		mes "�J�v���{�ЁH";
		mes "����Ƃ�����Ƃ��A";
		mes "����ς�B���p�t�M���h�H";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "���c�c�H�@���v���H";
		mes "�c�c�L�~�A����ȂƂ����D���Ȃ́H";
		mes "�c�c�܂��A�������ǁB";
		mes "�{�N�I�ɂ͘B���p�t�M���h��";
		mes "�����߂�����A�@������";
		mes "�s���Ă݂Ăˁ`��";
		close;
	case 5:
		mes "[�u���[�g�E�n�[]";
		mes "��[�I";
		mes "���̂������̗ǂ��A";
		mes "�킩���Ă����񂾂ˁ`��";
		mes "���������Ă��ꂽ��";
		mes "�L�~���͂��߂Ă����[�I";
		mes "�c�c���[��H";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "�����[��H�H�H�H";
		mes "���������Ȃ��c�c�B";
		mes "�{�N�A�L���͎͂��M��";
		mes "����񂾂��ǂȂ��c�c�B";
		mes "�L�~�̊�Ɍ��o��������̂ɁA";
		mes "�Ȃ����v���o���Ȃ��񂾂�ˁB";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "�ł��˂ł��ˁI";
		mes "�{�N�����������ŁA�ΐ킵���l�̒�����";
		mes "���̂����������������ŁA��������";
		mes "�k���オ���ē����Ȃ��Ȃ�l��";
		mes "����炵�����ĕ�������[�B";
		mes "�������č߂���ˁ`��";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "����1�����Ă����ƁI";
		mes "�{�N�����������ɁA���Z����񂩂�";
		mes "�a�����v���[���g�ɂ��Ă�������񂾁B";
		mes "���ւցA�{�N�A���Z�������q�Ȃ́�";
		mes "�����炱�̂������͂Ȃɂ��";
		mes "�厖�ɂ��Ă�񂾁`��";
		close;
	case 6:
		mes "[�u���[�g�E�n�[]";
		mes "�����Ă킭�킭�����ˁI";
		mes "�ϗ��Ȃł悭�킩��Ȃ��킢��";
		mes "�ڂ����炵�Ă݂邭�炢�Ȃ�";
		mes "�Q�����Ėڂ̑O�ŁA����̌���";
		mes "�Ԃ���[�ȕ����y������ˁ�";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "�ȏオ�A�{�N�����̑���";
		mes "�Q�����邱�Ƃɂ����傫�ȗ��R����I";
		mes "�̂��l���ق�A�Q�����Ďa�邱�Ƃ�";
		mes "�Ӌ`������Ƃ������Ă邵�ˁ�";
		mes "���H�@����Ȃ��Ƃ����ĂȂ��H";
		mes "�����A�ׂ����Ȃ��c�c�I";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "�a����Ă����Ύv���o���̂��A";
		mes "���v���Ŗ��q�ɂȂ��Ĉ�T�ԁA";
		mes "�����X�^�[�ƌ��Ō���􂤑���������";
		mes "���̓����v��������`�I";
		mes "���ƂȂ��ẮA�悢�v���o�����ǂˁ�";
		next;
		mes "[�u���[�g�E�n�[]";
		mes "���̈ꌏ�̂������ŁA";
		mes "���̃{�N������悤�Ȃ��̂����B";
		mes "�����{�N���A�N����";
		mes "�^�[�j���O�|�C���g�ɂȂ�ق�";
		mes "�����Ȃ��Ƃ����ȁ`��";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�u���[�g�E�n�[ : ���Z�����ɁA�{�N���D������p���������������ȁc�c�B";
			end;
		case 1:
			unittalk "�u���[�g�E�n�[ : �c�c���̎q���D������Ȃ�ė\�z�O��������B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�u���[�g�E�n�[ : �c�c���������ǁA�������������ŗǂ������B";
		if(Sex == 0)	unittalk "�u���[�g�E�n�[ : �c�c�ӂ��A�����̂ق����U�����������ăr�b�N������B�����瓯���͋��Ȃ񂾂�B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�u���[�g�E�n�[ : �ӂӁA����ς肱�̃{�N�̂����������̃A�N�Z�T���[��h�����ԉ����I";
		if(Sex == 0) unittalk "�u���[�g�E�n�[ : �N������̌��݂ǂ냁�C�N��@�y���݂��Ȃ��I";
		end;
	case 1:
		if(Sex == 1) unittalk "�u���[�g�E�n�[ : ����ς肨�Z�����ȏ�ɁA�����������j���͂��Ȃ��ȁ[�B";
		if(Sex == 0) unittalk "�u���[�g�E�n�[ : �����͋�肾���炠����Ȃ��Ƃ����ȁ[�c�c�B";
		end;
	case 2:
		if(Sex == 1) unittalk "�u���[�g�E�n�[ : �����O�ɁA�������炦���Ă����ق����������Ȃ��B";
		if(Sex == 0) unittalk "�u���[�g�E�n�[ : ��[�A����������Ƃ�����ۂ����ǁA�{�N�Ƌ߂��N��̐l�͋��Ȃ��������ȁH�@�c�O�I";
		end;
	}
}

1@gef.gat,104,42,6	script	����#z1	675,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",9);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"�Ȃ񂾂��y�������ł��ˁc�c�H";
		if('@prog >= 4) set '@str$[3],"���O���Ă΂ꂽ�C�������̂ł����c�c";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[����]";
			mes "�t���B";
			mes "���O�͗D���ł��Ė������낤���c�c�B";
			mes "���l�͂��O�̂��A�ŁA";
			mes "�\�肪�������܂������B";
			mes "�܂��������߂邩�B";
			close;
		}
		if(checkquest(9309)) {
			mes "[����]";
			mes "�c�c�`�b�B";
			mes "�����q�����̎�{�݂�����";
			mes "�킢���Ղ�ŁA�����߂����B";
			mes "�{���̃^�[�Q�b�g��������O�ɁA";
			mes "�|���ꂿ�܂������ȁB";
			mes "���Ԃ̖��ʂ��������c�c�B";
			close;
		}
		mes "[����]";
		mes "�c�c�����B";
		mes "���O�͉��l�������̉�ƒm���āA";
		mes "�b�������Ă�̂��H";
		mes "����A���̕��a�{�P�����ʂ��݂����";
		mes "�m��Ȃ��Řb���������悤���ȁB";
		mes "�Ȃ�A�����b��������ȁB";
		close;
	case 3:
		mes "[����]";
		mes "�c�c���Ƃ������䂪����Ȃ�";
		mes "����𗘗p���ˁ[�ƂȁB";
		mes "���ɂ��������傫�ȑ��B";
		mes "�s���̎��̂Ȃ�Ă��̂��A";
		mes "1��2�����Ă����������Ȃ��B";
		mes "���O�������v������H";
		next;
		mes "[����]";
		mes "�Ⴆ�΁c�c�B";
		mes "���l�̘b�𗧂���������y��";
		mes "���ɕs���̎��̂Łc�c";
		mes "�Ȃ�Ęb��100%�Ȃ��Ƃ�";
		mes "�����؂�Ȃ���Ȃ��H";
		mes "�N�b�N�b�N�b�N�c�c�B";
		close;
	case 4:
		mes "[����]";
		mes "�c�c���O�A���D�����ȁB";
		mes "�b��������ȂƂ������͂������H";
		mes "�c�c�܂��A�����B";
		mes "������Ɩʔ������e�̎莆��";
		mes "�󂯎��������łȁB";
		next;
		mes "[����]";
		mes "�l�̖����Ȃɂ����d���Ƃ�";
		mes "�^�ʖڂ���������Ō�������邪";
		mes "�����������邽�߂ɂ��Ă邱�Ƃ�";
		mes "�I�ɏグ�Ă�ꍇ�������B";
		mes "���ɁA���_�▼���A�ƌn�ɍS��";
		mes "���̂�����A���́c�c�ȁB";
		next;
		mes "[����]";
		mes "����ȓz�炪���Ȃ��Ȃ�Ȃ����炱��";
		mes "���l���A���܂�܂̐H���グ��";
		mes "�Ȃ�ˁ[�񂾂��B";
		mes "�܂������A���̐��̒�";
		mes "���܂��ł��Ă��Ȃ��I";
		mes "�΂������ݏグ�Ă��邺�c�c�B";
		close;
	case 5:
		mes "[����]";
		mes "���������p������ˁ[���B";
		mes "�����m�F���������Ƃ�";
		mes "�������������B";
		mes "�������c�c";
		next;
		mes "[����]";
		mes "�Ȃ���������񂪁A";
		mes "���O�Ƃ͊��m�̒��̋C������ȁB";
		mes "����ȕ��Ɋ������l�Ԃ́A";
		mes "������قǂ������Ȃ��񂾂��c�c�B";
		mes "�����₨�O���c�c�B";
		mes "�t���A�܂������B";
		next;
		mes "[����]";
		mes "�Ƃ���ł��O�A���̂���c�c����";
		mes "�I���h���Ƃ��������";
		mes "���������̂��H";
		mes "���Ƃ����炻��ȏ�A";
		mes "�A�C�c�Ɗւ��Ȃ��ق���";
		mes "�g�̂��߂����B";
		next;
		mes "[����]";
		mes "�ΐ�҂ƒ��ǂ��Ȃ����Ƃ����";
		mes "�Ȃɂ��������Ƃ͂Ȃ����";
		mes "�A�C�c�͂��������A�ޏ�ɂȂ�B";
		mes "�t���b�B";
		mes "�ǂ������Ӗ����͕����Ȃ�B";
		mes "�c�c��Ԃ������邩��ȁB";
		close;
	case 6:
		mes "[����]";
		mes "���l�������ɂ���̂�";
		mes "�M�u�A���h�e�C�N�B";
		mes "�K�v������A���邾�����B";
		mes "�Ƃ͂������̌��ʁc�c";
		mes "���̎q�����X�̐F����������";
		mes "�ϐF�����܂������c�c�B";
		next;
		mes "[����]";
		mes "�t���c�c�B";
		mes "�]�ނ��]�܂Ȃ����A";
		mes "���l�ɂ͐̂���A";
		mes "���ꂵ���Ȃ���������ȁB";
		mes "���ꂩ������̖X�q����������";
		mes "�E�����Ƃ͂Ȃ����낤�B";
		next;
		mes "[����]";
		mes "�c�c���ɂ��Ȃ�������܂����ȁB";
		mes "�d���O�Ɉ���";
		mes "�t�x���Q���~���̎��ɂł�";
		mes "�������܂������c�c�H";
		mes "�c�c��������܂������B";
		mes "��l�ɂ��Ă���B";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "���� : �D���ɂȂɂ����͂͊����Ȃ����c�c������̎����͂Ȃ��Ȃ������������������ȁB";
			end;
		case 1:
			unittalk "���� : �t���A�D�������Ƃ���ŒP�Ȃ鎩�Ȗ����ɂ����Ȃ��B���߂ł����z�炾�B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "���� : �c�c�l���̕��������̓}�V���B";
		if(Sex == 0)	unittalk "���� : �c�c�`�b�B���̏��A�Ȃ��Ȃ��^�������݂������ȁB";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "���� : ���̏��A�l�������ق������S���낤�Ȃ�čl���Ă�Ȃ�Â����c�c�B";
		if(Sex == 0) unittalk "���� : ���̏��c�c����ŁA�΂�Ȃ��Ǝv���Ă���̂��B���߂ł�������ȁB";
		end;
	case 1:
		if(Sex == 1) unittalk "���� : ���͂܂����̎�����Ȃ��ȁc�c�D�@���܂��B";
		if(Sex == 0) unittalk "���� : �������A�q�����X�̐F����������ς�����܂����ȁB�������̐F���牯���ĂȂ����c�c�B";
		end;
	case 2:
		if(Sex == 1) unittalk "���� : �c�c�ǂ����������A���a�{�P�����D�������ʂ����z�΂��肾�ȁB";
		if(Sex == 0) unittalk "���� : �c�c�ǂ̏����A�t�@���R���̏O�݂����Ɍ����������ˁ[�ȁB�����Ɍ����邺�B";
		end;
	}
}

1@gef.gat,115,66,6	script	�C�t�H�h�X#z1	676,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",10);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"���������C�ł���";
		if('@prog >= 4) set '@str$[3],"�������Ȃɂ��Y��ł�c�c�H";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�C�t�H�h�X]";
			mes "�D�����Ă��܂����̂��c�c�B";
			mes "���������̃��C�o�����I";
			mes "���̎��̖ڕW�͂��O���I";
			mes "���O��|���܂ŁA����";
			mes "���E�̉ʂĂ܂ł����Ă����o�傾�I";
			mes "�҂��Ă��I";
			close;
		}
		if(checkquest(9309)) {
			mes "[�C�t�H�h�X]";
			mes "�܂����̕������Ɓc�c!?";
			mes "���������I";
			mes "���ѐ��̗ʂȂ牴�������Ă����͂����I";
			mes "����ɁA���N��S���ŕ�������";
			mes "���^�̏`��10�t���񂾂̂ɁI";
			mes "���A�v���o�����畠�̒��q���c�c�B";
			close;
		}
		mes "[�C�t�H�h�X]";
		mes "�₠�₠�I";
		mes "���񂽂����Q���҂�!?";
		mes "���̖��O�̓C�t�H�h�X�I";
		mes "���[���~�b�h�K�b�c�S���";
		mes "�삯�߂���Q���҂�1�l���I";
		mes "��낵���ȁ[���I";
		close;
	case 3:
		mes "[�C�t�H�h�X]";
		mes "���̑��ɏo��΁A";
		mes "���[���~�b�h�K�b�c�ň�ԋ������";
		mes "�킦��Ǝv���ĎQ�������񂾁I";
		mes "�������܂ł��낢��ȐE�Ƃ�";
		mes "���Ɛ�����񂾂��c�c";
		mes "�܂��܂��������Ȃ����ȁI";
		next;
		mes "[�C�t�H�h�X]";
		mes "�Ȃɂ�肱�̑��ɁA";
		mes "������ƈ����̂������o��񂾁B";
		mes "���͂����Ƃ��̑��Ő킦��܂�";
		mes "�N�ɂ�������I�@�ƁA�S�Ɍ��߂Ă���I";
		mes "�����牴�Ƃ������ĕ����Ă�";
		mes "���܂Ȃ��ł����I";
		close;
	case 4:
		mes "[�C�t�H�h�X]";
		mes "�͂��͂��͂��͂��́I";
		mes "�����猳�C���Ƃ�����";
		mes "�����c��Ȃ����ȁI";
		mes "�Ƃ���Łc�c";
		next;
		mes "[�C�t�H�h�X]";
		mes "���̓t�F�C�������܂�Ȃ񂾂�";
		mes "�`���ɏo�����Ă��傤���Ȃ������I";
		mes "�̂���A�`���̎�L�╨���";
		mes "�ǂނ̂��D������������ȁB";
		mes "�����ĖY������Ȃ��c�c";
		mes "14�΂̒a�����B";
		next;
		mes "[�C�t�H�h�X]";
		mes "���͉Ƃ��яo���āA";
		mes "���[���~�b�h�K�b�c�S�n���";
		mes "�����ĉ��A���ҏC�s�Ƃ���";
		mes "���ɏo���̂��I";
		mes "�����āc�c";
		mes "���݂Ɏ�����ƁB";
		next;
		mes "[�C�t�H�h�X]";
		mes "�I�@�v�������I";
		mes "�D�������łɂ́A";
		mes "���̎��`���o���̂������ȁI";
		mes "�悵�A���x���疳�s������";
		mes "���`���������āA";
		mes "�o�łɔ�����Ƃ��邩�I";
		close;
	case 5:
		mes "[�C�t�H�h�X]";
		mes "�₠�₠�I";
		mes "���x���O�̂��Ƃ𒲂ׂĂ����I";
		mes "�����[�ށB";
		mes "�c�c���s�����ɂ����O���Ȃ��ȁB";
		mes "���Ă��Ƃ͏��ΖʂȂ̂��H";
		next;
		mes "[�C�t�H�h�X]";
		mes "�����[���I";
		mes "���̂����킩��Ȃ��̂����A";
		mes "���O�Ƃ͏��Ζʂ̋C�����Ȃ��ȁI";
		mes "�����A�؂̐��c�c���Ƃ�";
		mes "�C�̂������낤�B";
		next;
		mes "[�C�t�H�h�X]";
		mes "����ɂ��Ă��A���B";
		mes "���ȊO�̃��[���i�C�g�͂��Ă�̂�";
		mes "���́A���͂����ς���ĂȂ���!?";
		mes "�킩���c�c�B";
		mes "�݂�ȁA����ڂ��Ȃ��̂��c�c�B";
		next;
		mes "[�C�t�H�h�X]";
		mes "�͂��A�������I";
		mes "�������܂�ɂ���������";
		mes "�ߊ�肪�������͋C�Ȃ񂾂ȁI";
		mes "����Ȃ�Δ[�����I";
		mes "�v�����Ȃ��A���ȁB";
		mes "�c�c�����߂������ǂȁI";
		close;
	case 6:
		mes "[�C�t�H�h�X]";
		mes "���́A���ҏC�s���ɂ��낢���";
		mes "�E�Ƃ̂�Ɛ�����񂾂��c�c�B";
		mes "����̑��̎Q���ҁA�W���[��";
		mes "���ǁA�����Ƃ��ł��Ȃ������I";
		mes "�͂����肢���āc�c�����͋����I";
		mes "�����B�ꏟ�ĂȂ��������肾���ȁI";
		next;
		mes "[�C�t�H�h�X]";
		mes "����������������ɁA�������r�₦";
		mes "����ƒ͂񂾏��ɂ��΁A";
		mes "�W���[�̂�����̑���";
		mes "�I��Ƃ��ďo�ꂷ��Ɓc�c�I";
		mes "���ꂾ���ɗ��܂炸�A�����̓��A�[�I";
		mes "�c�c�ȁA�����ĂȂ����I";
		next;
		mes "[�C�t�H�h�X]";
		mes "�c�c�Ƃ����킯�ŁA���B";
		mes "���݂Ɏ���킯���ȁA����B";
		mes "�Ƃɂ����A���̖ړI�̓W���[�I";
		mes "�����Ă��łɗD�����āA";
		mes "���̋����𐢊Ԃɒm�炵�߂�I";
		mes "�������낤!?";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�C�t�H�h�X : ���̑ΐ푊�肪�D���Ƃ��A�ǂ�Ȃ��񑩂Ȃ񂾁I";
			end;
		case 1:
			unittalk "�C�t�H�h�X : �܂����̂܂����I�@���̉����D���𓦂��Ȃ�āI";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�C�t�H�h�X : �����[�I�@�W���[�Ɛ키�O�ɕ����Ă��܂����c�c���l�[���I";
		if(Sex == 0)	unittalk "�C�t�H�h�X : �܂��������ɕ�����Ƃ́c�c�ŋ߂̏����͕|���ȁc�c�B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�C�t�H�h�X : ���ށA����肢���Ă�j�͂��Ȃ��ȁI�@���v���I";
		if(Sex == 0) unittalk "�C�t�H�h�X : �ΐ푊��͏�������Ȃ��ق����c�c���₢��A�������I�@�����ؗ�ɏ����āA��������萶����c�c�u�c�u�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "�C�t�H�h�X : �C������̑��ł���邩!!�@�C�b�`�j�[�T���V�[�c�c�I";
		if(Sex == 0) unittalk "�C�t�H�h�X : �ΐ푊�肶��Ȃ����A�f�[�g�̈���c�c�����ށA�܂����������Ďc�O���B";
		end;
	case 2:
		if(Sex == 1) unittalk "�C�t�H�h�X : �W���[�ɉ������A�n���h���b�h�X�s�A�������������Ă�肽���Ƃ��낾�ȁI";
		if(Sex == 0) unittalk "�C�t�H�h�X : �퓬�ł͖��s���ւ鉴�ł��A�Ȃ������e�Ȃ��񂾂�ȁc�c�B";
		end;
	}
}

1@gef.gat,137,53,4	script	���`�F�j�G#z1	677,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",11);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"������吹���ɂ����́H";
		if('@prog >= 4) set '@str$[3],"��������悤";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[���`�F�j�G]";
			mes "���炠��I";
			mes "�D���Ȃ�Đ�����ˁ�";
			mes "�R�C������R�A��ɓ����ł��傤�ˁB";
			mes "�����D���ł��Ă���΁A";
			mes "�����Ɗy�ɓ����c�c���������B";
			mes "������̘b�Ȃ́A���߂�Ȃ�����";
			close;
		}
		if(checkquest(9309)) {
			mes "[���`�F�j�G]";
			mes "�c�c�B";
			mes "�����A����[�H";
			mes "�ǂ����Ȃ����܂����H";
			mes "���A�����I���܂����́H";
			mes "�܂��A���̂܂�!?";
			mes "���A�S�R�L��������܂����c�c�B";
			close;
		}
		mes "[���`�F�j�G]";
		mes "���ӂӁA���Ȃ����Q������܂��́H";
		mes "�\���x��܂����A���̓��`�F�j�G�B";
		mes "���܂�̓��w���Ȃ̂ł����A";
		mes "���̓v�����e���ɏZ��ł���܂��́B";
		mes "����c�c���F��̎��Ԃł���B";
		mes "�܂���قǁA��������悤�B";
		close;
	case 3:
		mes "[���`�F�j�G]";
		mes "��炪��I�[�f�B����c�c";
		mes "���Ȃ��̖����̎��߂ƈ����c�c";
		mes "�c�c�B";
		mes "����A��������悤�B";
		mes "�ǂ����Ȃ����܂����H";
		next;
		mes "[���`�F�j�G]";
		mes "���̋F��̌��t�A���Ȃ񂾂�";
		mes "�D���ł��A�Ԃ₢�Ă��܂��܂��́B";
		mes "����ɂ��Ă��c�c";
		mes "�Ȃ��������̑��Ɂc�c�H";
		mes "����A���߂�Ȃ����ˁB";
		mes "�P�Ȃ�Ƃ茾�ł���B";
		close;
	case 4:
		mes "[���`�F�j�G]";
		mes "��������悤�B";
		mes "����A���b���Ă��܂���ł����H";
		mes "���A6�΂܂ł̓��w���ł������āA";
		mes "7�΂���̓v�����e���̑吹����";
		mes "�����b�ɂȂ��Ă��܂��́B";
		next;
		mes "[���`�F�j�G]";
		mes "�ǂ���̊X���A�ƂĂ��傫��";
		mes "���h�Ȍ����������̂ŁA";
		mes "�U�����y���������ł���B";
		mes "���ɂ���ȗz�C�̓���";
		mes "�吹���ɋ���ق���";
		mes "�ܑ̖����C���ɂȂ�܂���ˁB";
		next;
		mes "[���`�F�j�G]";
		mes "�l�I�Ɍi�ςł�����";
		mes "���w���̕����A�΂�������";
		mes "�D���ł��̂�B";
		mes "���I�������A����";
		mes "���w���ɗ��A��ł�";
		mes "���悤������c�c�B";
		close;
	case 5:
		mes "[���`�F�j�G]";
		mes "�ςł���˂��B";
		mes "�ǂ����ł�������悤��";
		mes "�C�����Ă���������܂���́B";
		mes "������������������O����";
		mes "������Ă�������H";
		mes "���ӂӁc�c�B";
		next;
		mes "[���`�F�j�G]";
		mes "��������A�Ƃ����΁B";
		mes "��i���l�ɂ͂���������Ƃ�";
		mes "����܂�������H";
		mes "���̂��Ƃ��悭�C�ɂ����ĉ�����";
		mes "�ƂĂ��f�G�ȕ��ł��̂�B";
		next;
		mes "[���`�F�j�G]";
		mes "���Ɉ�������A";
		mes "�I�J���g�֘A�Ɋւ��āA";
		mes "���̕��̒m���Ǝ�r�ɂ��Ȃ�����";
		mes "���Ȃ��Ƃ����\�ł��̂�B";
		mes "���x�܂�����A�吹����";
		mes "�V�тɂ��Ă��������܂��B";
		close;
	case 6:
		mes "[���`�F�j�G]";
		mes "���A�{���͂��̑���";
		mes "�����̈ӎv�ŏo���킯�ł�";
		mes "����܂���̂�B";
		mes "���ӂӁA�����܂����H";
		mes "���͑�i���l�ɂ�����";
		mes "�Q�����܂����̂�B";
		next;
		mes "[���`�F�j�G]";
		mes "���̊F����ƌ𗬂��邱�Ƃ�";
		mes "�_�Ɏd������̂́A�΂߂��ƁB";
		mes "�ł����A�Q�����Ă悩������";
		mes "�v���Ă��܂��̂�H";
		mes "�吹���ɋ���Ɩ��ɋL����";
		mes "�r�؂�邱�Ƃ������āc�c�B";
		next;
		mes "[���`�F�j�G]";
		mes "�ł����͂܂������N���Ȃ��̂�";
		mes "���炭�吹���ɖ�肪����̂ł��傤�B";
		mes "���̂��ߎ��A���̑����D�@��";
		mes "��x���ɂłāA�L���r���ɂ���";
		mes "���ׂĂ݂悤���ȂƎv���Ă��܂���B";
		mes "���ӂӁ�";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "���`�F�j�G : �������̕��Ɛ�����͂��Ȃ̂Ɂc�c��͂�L�����Ȃ���c�c�B";
			end;
		case 1:
			unittalk "���`�F�j�G : ���������D�����Ă�����A�吹���̊F����͂Ȃ�Ă������̂�����c�c�B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "���`�F�j�G : �c�c�m��Ȃ��Ԃɕ����Ă�Ȃ�ċC�����悭����܂����B";
		if(Sex == 0)	unittalk "���`�F�j�G : �̐S�ȂƂ���ŋL�����r�؂��Ă��邹���ŁA����������������܂����c�c�B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "���`�F�j�G : ��i���l�A�Ȃ��������̑��ɎQ���������̂�����c�c�B";
		if(Sex == 0) unittalk "���`�F�j�G : ���̑��I�������A���͐V�V�n�ɗ������Ȃ��Ắc�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "���`�F�j�G : �D���ł���΂悢�̂����ǁc�c�ΐ�Ȃ�ď��߂Ă�����A�s������B";
		if(Sex == 0) unittalk "���`�F�j�G : �ǂ����Ȃ�A�������m�̑ΐ�͔���A�����炵�����������e�ɕύX����΂�낵���̂Ɂc�c�B";
		end;
	case 2:
		if(Sex == 1) unittalk "���`�F�j�G : ����́A�L������΂Ȃ���΂悢�̂����ǁc�c�{���ɁA�������̎��ł���B";
		if(Sex == 0) unittalk "���`�F�j�G : �c�c�Q���҂ɏ���������Ƃ��������邱�Ƃɋ����ł���B";
		end;
	}
}

1@gef.gat,158,63,4	script	�����q��#z1	678,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",12);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"���Ԃɂ��킪�c�c";
		if('@prog >= 4) set '@str$[3],"�܂����Ԃɂ��킪�c�c";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�����q��]";
			mes "�܂��܂��܂��܂��܂��I";
			mes "�D������������̂ˁI";
			mes "����������Ȃ��I";
			mes "���Ȃ��ɂ͓��ʂɁA";
			mes "�D�����߂łƂ��̃_���X��";
			mes "�x��Ȃ��Ƃˁ�";
			close;
		}
		if(checkquest(9309)) {
			mes "[�����q��]";
			mes "����`��A������������I";
			mes "�݂�ȁA�����̂ˁB";
			mes "�Ⴓ���铮���ŁA�A�܂����킟�c�c�I";
			mes "�������������Ⴉ������c�c�B";
			mes "������A�܂��������v�c�c��ˁH";
			mes "�c�c30��������A�_��������c�c�B";
			close;
		}
		mes "[�����q��]";
		mes "����`�H�@���o����ɂ��p���H";
		mes "���̓����q����`��";
		mes "�Q���҂Ɍ����Ȃ��Ǝv������";
		mes "����ł��ꉞ�A���ɏo�ꂷ��";
		mes "�Q���҂�1�l�Ȃ́�";
		mes "��낵���˂��`��";
		close;
	case 3:
		mes "[�����q��]";
		mes "���Ƃ����Ă����ɂ�";
		mes "���̂��Ղ�Ƒ卷�Ȃ��̂�`�B";
		mes "�ł�������Ƃ�����";
		mes "�����������A��͔����Ȃ����`�H";
		mes "���S���Ă��傤�����ˁ�";
		next;
		mes "[�����q��]";
		mes "����Ɏ��A�D�����Ă���[����";
		mes "��肽�����̂�����̂�`��";
		mes "������x��̗��K�ȏ�ɍ����";
		mes "�C������Ă���΂������";
		mes "���Ȃ��������ǂ�������";
		mes "���̉�����낵���ˁ`��";
		close;
	case 4:
		mes "[�����q��]";
		mes "!!!!";
		mes "��A�₾�`�������I";
		mes "����͔N�̂�������Ȃ����H";
		mes "������ƍl�����Ƃ��Ă��̂�B";
		mes "�ǂ����̂��炠��";
		mes "���̃N�Z�݂����Ȃ̂�ˁ�";
		next;
		mes "[�����q��]";
		mes "�ŋ߂̎��̔Y�݂Ȃ񂾂��ǁA";
		mes "�_���T�[�u�]�̎q�������Ă��Ă�";
		mes "�ǂ������瑝����̂��A";
		mes "�悢�Ă��v�����Ȃ���";
		mes "�����Ă�̂�`�c�c�B";
		mes "�����A�����Ȃ�����c�c";
		next;
		mes "[�����q��]";
		mes "�_���T�[�ɂȂ��Ă��ꂽ�q�ɂ�";
		mes "�R���h�̖��Y�i�ł���";
		mes "���A�n���`�[�Y�ł�";
		mes "�z��ׂ�������c�c�B";
		mes "�ł��`�[�Y�������Ƃ��߂����B";
		mes "����킠�B";
		close;
	case 5:
		mes "[�����q��]";
		mes "����͎��̃N�Z������";
		mes "�b��������Ȃ��H";
		mes "�����͂܂������Y��ł���̂��A";
		mes "�����Ă�����̂��D������H";
		mes "�Ƃ������ƂŁA������Ƃ܂�";
		mes "���o����A�����Y��ł�̂�`�B";
		next;
		mes "[�����q��]";
		mes "�����A���Ȃ��Ƃ͉��x���A";
		mes "����Ă�C�͂���̂�˂��B";
		mes "�ł��ڂ����v���o���Ȃ��̂�`�B";
		mes "���������Ă�����č΂̂��c�c";
		mes "�c�c�����ƋC�̂����ˁI�@����B";
		next;
		mes "[�����q��]";
		mes "�Ƃ���ŁA���Ȃ��̓R���h����";
		mes "�s�������Ƃ͂���H";
		mes "���̐��܂�̋���";
		mes "�R���h�Ȃ̂�A���ӂӁ�";
		next;
		mes "[�����q��]";
		mes "�����_���T�[�ɂȂ�������������";
		mes "�R���h�̌���Ō����A";
		mes "�_���T�[�̎p���Y����Ȃ��ĂˁB";
		next;
		mes "[�����q��]";
		mes "13�΂���_���T�[�Ƃ��ē���������";
		mes "1�N�O�Ɉ��ނ���܂ł͂���ł�";
		mes "���̌���i���o�[�����_���T�[��";
		mes "�����Ă��قǂɁA�͂܂������";
		mes "���ꂪ�A���̗B��̎����Ȃ́�";
		close;
	case 6:
		mes "[�����q��]";
		mes "���Ԃ��Ďc����˂��B";
		mes "�N�͂Ƃ邵�A�̂͑�l�C������";
		mes "����̃_���T�[�u�]�҂��������B";
		mes "�������ŁA������炾����";
		mes "����̉^�c����������";
		mes "�΂̎ԂȂ́c�c�B";
		next;
		mes "[�����q��]";
		mes "�����Ⴛ��Ȍ��ꂾ����";
		mes "���̖����l�܂����ꏊ����";
		mes "�����Ăق����Ȃ��̂�B";
		mes "�����玄�����̑��ŁA";
		mes "�悢���т�������΁A";
		mes "�����PR���\�ɂȂ�ł����";
		next;
		mes "[�����q��]";
		mes "�킢�ɕs����Ȏ������ǁA";
		mes "�x��ƁA����ւ̏�M������";
		mes "�N�ɂ����������͂Ȃ����";
		mes "���Ȃ������̑��ɏo���ȏ�A";
		mes "�N�ɂ������Ȃ��C����������";
		mes "�Y�ꂿ��_����`��";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�����q�� : �D���҂Ɛ킦�Č��h����`��@�y�Y�b�ɂ��Ȃ�������ˁI";
			end;
		case 1:
			unittalk "�����q�� : ���ӂӁA�܂������̎q���D�������Ⴄ�Ȃ�āc�c�l�͌������ɂ��Ȃ���ˁB";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�����q�� : ����`��A������������I�@����ς�30��ɂȂ�Ɠ������݂�̂�����c�c�₾�킟�c�c�B";
		if(Sex == 0)	unittalk "�����q�� : ���ꂪ�Ⴓ�̍��Ȃ̂�����!?�@���o����A�V���b�N����c�c�B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�����q�� : �����[��A���̔M�C�I�@����ς�����A�_���X�z�[���Ɠ��l�A���[�h�����厖��ˁ�";
		if(Sex == 0) unittalk "�����q�� : �������삳�񂪑������ǁA�_���T�[�u�]�̎q�͋��Ȃ������c�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "�����q�� : ����ς�A���ɎQ�����邱�Ƃ��q���񂭂炢�ɂ́A�����ׂ�������������c�c�B";
		if(Sex == 0) unittalk "�����q�� : ���̎q�����A�_���T�[�̎ێq��K�Ō����Ⴄ��c�c�B���߂˂��B";
		end;
	case 2:
		if(Sex == 1) unittalk "�����q�� : �_���X�̗��K�ȊO�ł���Ȃɂ���΂����̋v���Ԃ肾��`�B";
		if(Sex == 0) unittalk "�����q�� : �_���T�[������Ă���ƁA�ǂ����Ă��̌^�̈ێ�����ςȂ̂�ˁB";
		end;
	}
}

1@gef.gat,178,91,4	script	�W���[#z1	679,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",13);
		set '@str$[0],"����ɂ���";
		if('@prog >= 1) set '@str$[1],"�G�k����";
		if('@prog >= 2) set '@str$[2],"���@�ɏڂ������ł���";
		if('@prog >= 4) set '@str$[3],"�x�e�����̕��͋C�������܂�";
		if('@prog >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�W���[]";
			mes "�Q�t�F�����@���Ƃ����啑��ŁA";
			mes "�D�����Ă��܂��Ƃ́B";
			mes "�r�O�����łȂ��A";
			mes "���_���b���Ă���悤���ȁB";
			mes "�܂������A�������悤���B";
			close;
		}
		if(checkquest(9309)) {
			mes "[�W���[]";
			mes "���ށA�������B";
			mes "���̎Ⴓ�ł��ꂾ��������҂�";
			mes "����Ƃ͂ȁc�c�B";
			mes "����ł����A���̑��ɎQ������";
			mes "���l������Ƃ������̂��B";
			close;
		}
		mes "[�W���[]";
		mes "�َ҂́A�W���[�Ɛ\���B";
		mes "����A���̑��ɏo�ꂷ�錠����";
		mes "�K�^�ɂ����邱�Ƃ��ł���1�l���B";
		mes "�������A�X�J�[�t�����Ă����";
		mes "�M���������ď����ȁc�c�B";
		mes "�����A�O���킯�ɂ́c�c�B";
		close;
	case 3:
		mes "[�W���[]";
		mes "�����ށA�������ɕ����������ȁB";
		mes "�Ƃ͂����A���ԓI�ɂ܂�";
		mes "�Ȃ̍���Ă��ꂽ�ٓ���";
		mes "�H�ׂ�킯�ɂ����ʁc�c�B";
		next;
		mes "[�W���[]";
		mes "���������Ă͖��@�͌��ĂʂƂ�";
		mes "�������Ė��Ȃ��̂��B";
		mes "����ɁA���������Ă��邹����";
		mes "�����������A���̌�m�̂��Ƃ�";
		mes "�܂������v���o���ʁc�c�B";
		mes "���������̂��c�c�B";
		close;
	case 4:
		mes "[�W���[]";
		mes "�ق��c�c�B";
		mes "�Ȃ��Ȃ�����ڂ�����悤���ȁB";
		mes "�����ɂ��A���@�Ɋւ���";
		mes "�����׊w�ɗ�ސg���B";
		next;
		mes "[�W���[]";
		mes "���N�A���@�̌��������Ă���̂���";
		mes "�����҂�����o�����Ȃ����Ƃɂ�";
		mes "���ǁA�G�ɕ`��������������";
		mes "�C�Â��悤�ɂȂ��ĂȁB";
		mes "��͂艽���������ň�x";
		mes "�o�����邱�Ƃ��厖���B";
		next;
		mes "[�W���[]";
		mes "�����������o�܂���25�΂̂Ƃ���";
		mes "�S���E������āA�킢�ɖ�����ꂽ�B";
		mes "���̒��̑���ɁA�C�t�H�h�X�a��";
		mes "�܂܂�Ă����悤�ŁA���������Ă�����";
		mes "������L�����Ȃ��̂���c�c�B";
		mes "�����[�ށA�ǂ��������̂��B";
		close;
	case 5:
		mes "[�W���[]";
		mes "���Ȃ��Ƃ͉��x���荇�킹�����Ă���";
		mes "�C������̂Ɏv���o���ʂƂ́c�c�B";
		mes "��͂�Ȃ��������悤�ɁA";
		mes "���܂ɂ͌����ȊO�ɂ�";
		mes "�ڂ��ނ���ׂ����c�c�B";
		next;
		mes "[�W���[]";
		mes "���܂Ȃ��B";
		mes "�َ҂��x�e�����Ɍ�����Ƃ���";
		mes "�b���������B";
		mes "�Ȃɂ������ăx�e�����Ƃ����̂�";
		mes "�킩��ʂ̂����c�c�B";
		next;
		mes "[�W���[]";
		mes "�َ҂͒��N�A����ɏd�_��������";
		mes "�킢�΂��肵�Ă����������A";
		mes "������܂��A����q�����킢������";
		mes "�s��Ȑ킢�ɂȂ������Ƃ�����B";
		mes "���Ƃ����āA�{���ɖ���D���̂�";
		mes "�i���Z���X�ȍs�ׂƍl����B";
		next;
		mes "[�W���[]";
		mes "���������Ȃ��Ƌ����Ȃ�Ȃ���";
		mes "�����y���H�ɂ��邪�A������";
		mes "�������Ă̂��̂ł���A";
		mes "�َ҂��炷��Ƃ���ȊO�ł�";
		mes "�����͎ア�ƁA�����󂵂�";
		mes "����悤�ɕ�����̂���B";
		next;
		mes "[�W���[]";
		mes "����������Ƃ����������o����";
		mes "���܂َ̐҂̕��͋C��";
		mes "���o���Ă���̂��������B";
		close;
	case 6:
		mes "[�W���[]";
		mes "40�Ƃ����ߖڂ��ނ�������";
		mes "�َ҂͂��܂̍Ȃƌ����A";
		mes "�`���͈�U�A�x�~�����B";
		mes "���ꂩ��2�N�c�c�B";
		mes "�����َ҂�����܂ŒN����";
		mes "����D���Ă����ꍇ�c�c";
		next;
		mes "[�W���[]";
		mes "�����A����ɔY�܂���Ȃ���";
		mes "��炵�Ă�����������Ȃ���";
		mes "���̑��ɁA�Ō�̘r�����ɂ�";
		mes "�o�ꂷ��C�ɂȂ�Ȃ���������";
		mes "����Ȃ��c�c�B";
		next;
		mes "[�W���[]";
		mes "�����v���ƁA�َ҂͖{����";
		mes "���Ă���Ǝv���̂��B";
		mes "�r�����̍Ō�ɂ��̂悤��";
		mes "���ꕑ��Ŏv�������A";
		mes "�N�ɂ��C���˂��邱�ƂȂ�";
		mes "�\��邱�Ƃ��o����̂�����ȁB";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�W���[ : ����A�Q�t�F�����@���Ƃ����啑��ŗD������Ƃ́c�c�������y���݂��ȁB";
			end;
		case 1:
			unittalk "�W���[ : �D����s�c�c�܂��������̌��t�ʂ�̑������ȁB";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�W���[ : ���΂ɁA�ʂ�ܓ��ɐZ�肷�������c�c�D������ł��ʂƂ͂ȁB";
		if(Sex == 0)	unittalk "�W���[ : �c�c���҂ɐ��ʂȂǁA��͂�֌W�Ȃ��̂��ȁB";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�W���[ : �ǂ����Ȃ�j���m�A�͂Ɨ͂��Ԃ������������̂��B";
		if(Sex == 0) unittalk "�W���[ : ���O�A�����̂ق�������Ȃ��\���������B����x�A�Â�������ׂ����ȁB";
		end;
	case 1:
		if(Sex == 1) unittalk "�W���[ : �َ҂̑���͒N�ɂȂ邩�A�y���݂��B";
		if(Sex == 0) unittalk "�W���[ : ���������̂悤�ȑ��ɏo�ꂷ��ȂǁA�ȑO�͍l�����Ȃ��������Ƃ��ȁB";
		end;
	case 2:
		if(Sex == 1) unittalk "�W���[ : �Ȃ͍����ƂŁA�َ҂̖������F���Ă���̂��낤���c�c�B";
		if(Sex == 0) unittalk "�W���[ : �ӂށc�c�����̏o��҂����O�A�����̂��ȁB";
		end;
	}
}

1@gef.gat,113,99,4	script	�f�B���C#z1	680,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",14);
		set '@str$[0],"����ɂ���";
		if(GMT_121COUNT >= 1) set '@str$[1],"�G�k����";
		if(GMT_121COUNT >= 2) set '@str$[2],"�E���o���ɍs�������Ƃ�����̂ł����H";
		if(GMT_121COUNT >= 4) set '@str$[3],"�Ȃ񂾂��\���\�����Ă܂���";
		if(GMT_121COUNT >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�f�B���C]";
			mes "���̃t�F��������ł��������A";
			mes "�D������Ƃ́c�c�B";
			mes "�N�̎��͖͂{���Ɍv��m��Ȃ��̂��ȁB";
			mes "��������͂���w�A";
			mes "�r�ɖ����������悤�Ǝv���B";
			close;
		}
		if(checkquest(9309)) {
			mes "[�f�B���C]";
			mes "�����������Ƃ��Ȃ��قǂɁA";
			mes "�f���炵���킢�������B";
			mes "����̑��̊ϗ��҂ɁA����";
			mes "���b�ɂȂ�����Ă̐e�����Ă���񂾁B";
			mes "���̐l�����̑O�ŁA���̂悤�Ȑ킢��";
			mes "�����Ȃ������ƂɊ��ӂ��ȁB";
			close;
		}
		mes "[�f�B���C]";
		mes "���̖��̓f�B���C�B";
		mes "�ǂ����N���A�Q���҂̂悤���ˁB";
		mes "�������N�͊̂�������Ă���B";
		mes "�G�ƂȂ邩������Ȃ�����";
		mes "�������Đ���������̂�����B";
		mes "�C�ɓ�������B";
		close;
	case 3:
		mes "[�f�B���C]";
		mes "�������A�ŋ߂́c�c";
		mes "�搶�ƌĂ΂�邱�Ƃ���������������";
		mes "���O�����Ă΂�Ă��C�Â��Ȃ��ĂˁB";
		mes "�낤���A�v���Ԃ�ɉ�l��";
		mes "���O���Ă�ł��ꂽ�̂�";
		mes "�C�Â��Ȃ��Ƃ��낾������B";
		next;
		mes "[�f�B���C]";
		mes "���ƁA���������Ⴂ���̂�";
		mes "�����A�w���҂̌�����";
		mes "�b���Ă��܂��c�c�B";
		mes "�����N�ɂ��A���̌�����ԓx��";
		mes "����Ɍ�������\����Ȃ��B";
		close;
	case 4:
		mes "[�f�B���C]";
		mes "����B";
		mes "�E�[�^�����Ƃ������t��";
		mes "�s���Ƃ����̂��ȁH";
		mes "�E���o���ɂ͍s�������Ƃ�";
		mes "����Ƃ�����肠��Ӗ��A";
		mes "���̑��̌̋��łˁB";
		next;
		mes "[�f�B���C]";
		mes "�c�����́A�E���o���ŉ߂�������";
		mes "���Ƃ��Ǝ��̓Q�t�F�����܂�łˁB";
		mes "���܂�̋��̑傫�ȑ��ɁA";
		mes "�E���o���̊F�������q������";
		mes "�������󂯂Ȃ���o��o����Ƃ�";
		mes "���ɂ��v��Ȃ�������B";
		next;
		mes "[�f�B���C]";
		mes "���̕��A�v���b�V���[��";
		mes "�Ȃ��킯�ł͂Ȃ��񂾂��A";
		mes "���ꂷ���������";
		mes "�o���Ȃ��悤�ł͗��΂�";
		mes "�w���҂̖��܂ꂾ����ˁB";
		mes "�����ɂ������肾��B";
		close;
	case 5:
		mes "[�f�B���C]";
		mes "�N�͂�����c�c�B";
		mes "���̎��Ƃɗ������Ƃ͂��邾�낤���B";
		mes "����A���܂Ȃ��B";
		mes "�Ȃ񂾂��N�Ƃ͏��Ζʂ̊�����";
		mes "���Ȃ��������̂łˁB";
		mes "���̊��Ⴂ���낤���c�c�B";
		next;
		mes "[�f�B���C]";
		mes "���ށB�J�n���Ԃ��߂Â��ɂ�A";
		mes "�����A�����肵�Ă���ł��낤";
		mes "�E���o�����Z���Ƒ����l��";
		mes "�ǂ��Ō�����Ă��������Ă���̂�";
		mes "�C�ɂȂ��Ă��������Ȃ��Ăȁc�c�B";
		mes "�܂�Ŏq�����ȁA���́B";
		next;
		mes "[�f�B���C]";
		mes "�E���o�����Z���Ƒ�����";
		mes "�����I�ɂ͈�Ă̐e�łˁB";
		mes "�{���̐e��2�l�Ƃ����E�����񂾁B";
		mes "�o���W�[�W�����v�̎��̂łˁB";
		mes "�ł����̎��̂��Ȃ����";
		mes "���̎��͋��Ȃ��������낤�ˁB";
		close;
	case 6:
		mes "[�f�B���C]";
		mes "�������̑��ɏo���^�̖ړI�B";
		mes "����́A�E���o�����Z����";
		mes "�����l�ɁA���̎����̎��͂�";
		mes "�S�Đɂ��݂Ȃ��o���A";
		mes "���Ē������ƂŊ��ӂ̋C������";
		mes "�`���悤�Ǝv���ĂˁB";
		next;
		mes "[�f�B���C]";
		mes "�E�[�^�����̓o���W�[�W�����v��";
		mes "���������Ă����A��l�ƔF�߂���B";
		mes "�����玄������ɂȂ���Ă݂��񂾁B";
		mes "��Ȃ���悢�^�C�~���O��";
		mes "�悢���Ƃ��v�������ȂƎv����B";
		next;
		mes "[�f�B���C]";
		mes "���ʂ��o����΍ō������A";
		mes "���Ƃ��Ă̓E���o�����Z���݂̂�Ȃ�";
		mes "�����l�������ł��Ȃ���ΈӖ���";
		mes "�Ȃ�����ˁc�c�B";
		mes "���͂Ƃ�����S�g�S���";
		mes "�Ԃ��点�Ă��炤��B";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�f�B���C : ���������@���B�悢�Ӗ��ŁA�D���҂̗\�z�𗠐؂�ꂽ�B";
			end;
		case 1:
			unittalk "�f�B���C : �D���҂ɂ͍��x�A�����̖��@�w�Z�ŗՎ��u�t�����肢���������肾�ȁB";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�f�B���C : ����̗D���҂̎��͂���A�D���͔[�����ȁB";
		if(Sex == 0)	unittalk "�f�B���C : �����������Ƃ��Ȃ��قǂɁA������͑f���炵���킢�������B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�f�B���C : ���̑��ɎQ�������o�����A���Ƃɐ������˂΁B";
		if(Sex == 0)	unittalk "�f�B���C : ����͂�A�����͈�l�̎Q���҂Ƃ��ė��Ă���̂ɁA�����Ƃ̂��Ƃ��l���Ă��܂��B";
		end;
	case 1:
		if(Sex == 1) unittalk "�f�B���C : ���΂ɑ��̊J�n�O�̈��A���A�E�[�^����ł��Ă͂܂������낤�ȁc�c�B";
		if(Sex == 0)	unittalk "�f�B���C : �����A�E�[�^�����A��q�̊F�͂������ɋ���̂��낤���B";
		end;
	case 2:
		if(Sex == 1) unittalk "�f�B���C : �����A�E�[�^�����A��q�̊F�͂ǂ��ɂ���̂��낤�c�c�B";
		if(Sex == 0)	unittalk "�f�B���C : ���������A��q���������Ⴂ�Q���҂�����悤���ȁc�c�B";
		end;
	}
}

1@gef.gat,117,72,6	script	�t�F�C�E�J�i�r�A��#z1	665,5,5,{
	setarray '@str$,"","","","","";
	if(checkquest(9308) || checkquest(9309)) {
		set '@str$[0],"�G�k����";
	} else {
		set '@prog,callfunc("#���@���i�s�x",15);
		set '@str$[0],"����ɂ���";
		if(GMT_122COUNT >= 1) set '@str$[1],"�G�k����";
		if(GMT_122COUNT >= 2) set '@str$[2],"�z�����N���X�łȂɂ��Y��ł�݂�������";
		if(GMT_122COUNT >= 4) set '@str$[3],"�����ɂ����́H";
		if(GMT_122COUNT >= 7) set '@str$[4],"�ǂ����đ��ɁH";
	}
	mes "�]���Q���҂̂悤��";
	mes "�@�b�������Ă݂悤���]";
	next;
	switch(select("��߂�",'@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4])) {
	case 1:
		mes "�]����ς��߂Ă������]";
		close;
	case 2:
		if(checkquest(9308)) {
			mes "[�t�F�C�E�J�i�r�A��]";
			mes "�˂��˂��A�D���҂�";
			mes "�z�����N���X����肽���񂾁I";
			mes "������N�̔��̖тȂ�A";
			mes "�܂̂�����Ȃ�A����Ȃ��H";
			mes "�D���j���ɁA�������ɒ��Ձ[�I";
			close;
		}
		if(checkquest(9309)) {
			mes "[�t�F�C�E�J�i�r�A��]";
			mes "���H";
			mes "����������������!?";
			mes "�R���`�c�c�I";
			mes "������������͂Ȃ��͂�����H";
			mes "���������D������p�^�[������H";
			mes "��΂���������!?";
			close;
		}
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�������ɐ���������Ƃ́I";
		mes "�N�A�Ȃ��Ȃ�����ڂ����`�I";
		mes "�������͍����Ƃ��߂��B���p�t�I";
		mes "�t�F�C�E�J�i�r�A������I";
		mes "�z�����N���X��D�����q�I";
		mes "����낵�����`��";
		close;
	case 3:
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "���̑��I�������c�c";
		mes "���[��A2����ɍu�`���`�B";
		mes "�����Ď��̓����u�`�B";
		mes "���̓����A���̓����u�`���ƁB";
		mes "�����A��ς���`�I";
		mes "����H�@�ǂ��������H";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "���H�@��K�̍u�`����Ȃ���B";
		mes "���������d��Řb���u�`����`�I";
		mes "���������āA�������̍u�`��";
		mes "�\��E���̑�l�C�Ȃ񂾂�`�I";
		mes "�����ł���`�H";
		mes "�����ƖJ�߂Ă�����H";
		close;
	case 4:
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "��[��[�c�c�B";
		mes "�V�����z�����N���X�͂ǂ�Ȏq��";
		mes "���悤���ȁ`�H";
		mes "���H�₨��ɂȂ�悤��";
		mes "�z�����N���X�Ƃ�!?";
		mes "���A���߂��`�B";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�����A����Ă�Œ���";
		mes "���������ς��ς���������";
		mes "�������邱��ɂ͂���";
		mes "���^�Ȃ��Ȃ��Ă�������`�I";
		mes "����A���̃z�����N���X��";
		mes "���Ă��������ƁI";
		close;
	case 5:
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�Ȃ�ƂȂ��N���炠������";
		mes "�z�����N���X�̓���������C���c�c�B";
		mes "���񂭂�c�c�B";
		mes "���[��A�C�̂������Ȃ��B";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�N�Ƃ��A�ǂ����ŉ�����悤�ȁc�c�B";
		mes "���[�����I";
		mes "�S�R�킩��ȁ[���I";
		mes "�ł��z�����N���X�̓����Ȃ�";
		mes "�k�������鎩�M�͂���񂾂�`�I";
		mes "���Ă����̂��B";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�z�����N���X�͍쐬�҂��g��";
		mes "�f�ނɂ���ēƓ��̓���������񂾂�B";
		mes "�܂��A����ō��̃z�����N���X��";
		mes "������������ɂ���������Ȃ��ق�";
		mes "�������ȓ����Ȃ񂾂��ǂˁI";
		mes "������N�ɂ͂킩��Ȃ��͂��B";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�A���f�o�����̘B���p�t�̒��Ԃ�";
		mes "���̓����͂킩��Ȃ��񂾂�ˁ`�B";
		mes "�����������A�������݂����ȓV�˂�";
		mes "�����𓾂��Ȃ��񂾂�ˁB";
		mes "�܂��A�������ɂ͎����̂��̎q��";
		mes "���邩�炢���񂾂��ǂˁ`�I";
		close;
	case 6:
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�����Ŗ��Ł`���B";
		mes "�����������̑��ɏo������߂�";
		mes "���R�͂Ȃ�ł��傤���I";
		mes "30�b�ȓ��ɓ����ĂˁI";
		mes "30�c�c29�c�c28�c�c�B";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�����́A��������������ō������";
		mes "�z�����N���X�̂��̎q�̑f���炵����";
		mes "���̑��ł���I�ڂ��邽�߂ł����I";
		mes "���������������߂č�����q�Ȃ񂾂��";
		mes "�\�͂͂��Ƃ��A�����ڂƂ��ɂ�";
		mes "���������S�����q����`�I";
		next;
		mes "[�t�F�C�E�J�i�r�A��]";
		mes "�N�Ƒ��Ő키���ƂɂȂ邩��";
		mes "�킩��Ȃ��̂��c�O�����ǁc�c�B";
		mes "�����키���ƂɂȂ�����";
		mes "�������̂��̎q�̗ǂ���";
		mes "�Ƃ��߂ł����`�I";
		mes "�ǂ������ˁ`��";
		close;
	}
OnTouch:
	if(checkquest(9308)) {
		switch(rand(2)) {
		case 0:
			unittalk "�t�F�C�E�J�i�r�A�� : ���̐l���D������v�f�Ȃ�āA�ǂ��v�Z���Ă��o�Ȃ������̂ɂȂ��I";
			end;
		case 1:
			unittalk "�t�F�C�E�J�i�r�A�� : �c�c�D���҂̃z�����N���X�A����Ă݂����Ȃ��B";
			end;
		}
	}
	if(checkquest(9309)) {
		if(Sex == 1) unittalk "�t�F�C�E�J�i�r�A�� : �c�c���������I�@����Ȍ��ʁA���肦�Ȃ��̂Ɂ[�I";
		if(Sex == 0)	unittalk "�t�F�C�E�J�i�r�A�� : ���[��A����͂��������Ė��H�@�ł��ɂ��������c�c�B��������������Ȃ�āA���肦�Ȃ��̂ɂȂ��B";
		end;
	}
	switch(rand(3)) {
	case 0:
		if(Sex == 1) unittalk "�t�F�C�E�J�i�r�A�� : �݂�Ȃ����ƁA�`�P�b�g�g���Ă������̗D������Ƃ����ɗ��Ă��ꂽ���ȁ[�B";
		if(Sex == 0)	unittalk "�t�F�C�E�J�i�r�A�� : ���[��A�y�A�̃z�����N���X�Ƃ����A�y���������Ȃ��c�c�B";
		end;
	case 1:
		if(Sex == 1) unittalk "�t�F�C�E�J�i�r�A�� : �D��������A�����������̂�H�ׂ悤���ȁ`�H�@�Ȃɂ���������`�I";
		if(Sex == 0)	unittalk "�t�F�C�E�J�i�r�A�� : ���������D��������A��������̎��i���|�������Ȃ��c�c�B�܂��A�������I";
		end;
	case 2:
		if(Sex == 1) unittalk "�t�F�C�E�J�i�r�A�� : ���̎q�̏o�ԁA�����Ƃ��邩�Ȃ��c�c�B���̎q�̃f�r���[�̓��Ȃ̂ɁA�o�Ԃ��Ȃ�������Ӗ����Ȃ����B";
		if(Sex == 0)	unittalk "�t�F�C�E�J�i�r�A�� : �ւ��A�Q���҂ɂ����\���̎q������񂾁`�B";
		end;
	}
}

1@gef.gat,115,201,4	script	�s�v�c�ȊŔ�#1	857,{
	mes "�]�������悤���]";
	next;
	switch(select("�L�����N�^�[","����")) {
	case 1:
		setarray '@menu$,"�A���q","�f�B�I�E�A�l���X","�t�F����","�I���h��","�u���[�g�E�n�[","����","�C�t�H�h�X","���`�F�j�G","�����q��","�W���[","�f�B���C","�t�F�C�E�J�i�r�A��","����̂���߂�";
		while(1) {
			set '@select,select(printarray('@menu$));
			if('@select == 13) {
				mes "�]����̂���߂��]";
				close;
			}
			mes "[�s�v�c�ȊŔ�]";
			mes '@menu$['@select];
			set '@prog,callfunc("#���@���i�s�x",'@select);
			set '@talk,4;
			if('@prog >= 1) '@talk--;
			if('@prog >= 2) '@talk--;
			if('@prog >= 4) '@talk--;
			if('@prog >= 7) '@talk--;
			if('@talk > 0) {
				mes "�@";
				mes "�܂����������o���Ȃ��b��";
				mes "�@"+ '@talk +"�@�قǂ���悤���B";
			}
			if('@talk == 0) {
				mes "^ff0000�R���v���[�g^000000";
				mes "�@";
				mes "�]�S�Ă̘b���m�F�o�����Ԃ��]";
			}
			next;
		}
	case 2:
		setarray '@str$,"���m�F","���m�F","���m�F","���m�F","���m�F";
		if(checkquest(114700) & 0x8) {
			set '@str$[0],"�������j";
			'@comp++;
		}
		if(checkquest(114701) & 0x8) {
			set '@str$[1],"�ςȉ̂��̂�����";
			'@comp++;
		}
		if(checkquest(114702) & 0x8) {
			set '@str$[2],"�킢�D���̃}�X�^�[";
			'@comp++;
		}
		if(checkquest(114703) & 0x8) {
			set '@str$[3],"�����ȔL";
			'@comp++;
		}
		if(checkquest(114704) & 0x8) {
			set '@str$[4],"�R�m";
			'@comp++;
		}
		mes "[�s�v�c�ȊŔ�]";
		mes "�]�����󋵁]";
		if('@comp == 5) {
			mes "�@";
			mes "^ff0000�R���v���[�g^000000";
		}
		next;
		set '@sel,select('@str$[0],'@str$[1],'@str$[2],'@str$[3],'@str$[4],"����̂���߂�") - 1;
		if('@sel == 5) {
			mes "�]����̂���߂��]";
			close;
		}
		set '@quest,114700 + '@sel;
		if(checkquest('@quest) && checkquest('@quest) & 0x8) {
			mes "�]���Ȃ��͊���";
			mes "�@"+ '@str$['@sel] +"��";
			mes "�@�������󂯂���������悤���]";
			close;
		} else {
			mes "�]�܂��������Ƃ��Ȃ��l�̂悤���]";
			close;
		}
	}
}

//==========================================
// ���̑�
//------------------------------------------
1@gef.gat,36,123,6	script	�ē��v��#1	705,{
	cutin "gef_soldier.bmp", 2;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���@�̓s�s^8B4513�Q�t�F��^000000��";
	mes "�悤�����I";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���݂̓Q�t�F�����@���J�Ò���";
	mes "�o������Â�������������܂��B";
	mes "^006400���@���^000000�ւ̎Q�������]�݂Ȃ�";
	mes "�Q�t�F��6�������ɂ���";
	mes "������ɍs���Ă݂Ă��������B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "�܂����@���J�Â��L�O����";
	mes "�Q�t�F���̂��������ɖ��@�̉ԉ΂�";
	mes "�ݒu����Ă��܂��̂őދ����邱�Ƃ�";
	mes "�Ȃ��Ǝv���܂��B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���j�Ɠ`�������Â�";
	mes "�Q�t�F�����@���͖`���҂̊F�����";
	mes "�����Ď��]�����܂���I";
	mes "����ł͊y�����ό��ɂȂ�܂��悤�I";
	close2;
	cutin "gef_soldier.bmp", 255;
	end;
}

1@gef.gat,123,203,4	script	�ē��v��#2	705,{
	cutin "gef_soldier.bmp", 2;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���@�̓s�s^8B4513�Q�t�F��^000000��";
	mes "�悤�����I";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���݂̓Q�t�F�����@���J�Ò���";
	mes "�o������Â�������������܂��B";
	mes "^006400���@���^000000�ւ̎Q�������]�݂Ȃ�";
	mes "�Q�t�F��6�������ɂ���";
	mes "������ɍs���Ă݂Ă��������B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "�܂����@���J�Â��L�O����";
	mes "�Q�t�F���̂��������ɖ��@�̉ԉ΂�";
	mes "�ݒu����Ă��܂��̂őދ����邱�Ƃ�";
	mes "�Ȃ��Ǝv���܂��B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���j�Ɠ`�������Â�";
	mes "�Q�t�F�����@���͖`���҂̊F�����";
	mes "�����Ď��]�����܂���I";
	mes "����ł͊y�����ό��ɂȂ�܂��悤�I";
	close2;
	cutin "gef_soldier.bmp", 255;
	end;
}

1@gef.gat,203,116,4	script	�ē��v��#4	705,{
	cutin "gef_soldier.bmp", 2;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���@�̓s�s^8B4513�Q�t�F��^000000��";
	mes "�悤�����I";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���݂̓Q�t�F�����@���J�Ò���";
	mes "�o������Â�������������܂��B";
	mes "^006400���@���^000000�ւ̎Q�������]�݂Ȃ�";
	mes "�Q�t�F��6�������ɂ���";
	mes "������ɍs���Ă݂Ă��������B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "�܂����@���J�Â��L�O����";
	mes "�Q�t�F���̂��������ɖ��@�̉ԉ΂�";
	mes "�ݒu����Ă��܂��̂őދ����邱�Ƃ�";
	mes "�Ȃ��Ǝv���܂��B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���j�Ɠ`�������Â�";
	mes "�Q�t�F�����@���͖`���҂̊F�����";
	mes "�����Ď��]�����܂���I";
	mes "����ł͊y�����ό��ɂȂ�܂��悤�I";
	close2;
	cutin "gef_soldier.bmp", 255;
	end;
}

1@gef.gat,116,203,5	script	�ē��v��#5	705,{
	viewpoint 1, 166, 168, 1, 0x32CD32;
	viewpoint 1, 72, 169, 2, 0x0000FF;
	viewpoint 1, 114, 143, 3, 0xFF8000;
	cutin "gef_soldier.bmp", 2;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���@�̓s�s^8B4513�Q�t�F��^000000��";
	mes "�悤�����I";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "���݁A�Q�t�F�����@���ɏ悶��";
	mes "^ff0000��������ޔy^000000��";
	mes "�o�v���Ă���悤�ł��B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "^32cd32����^000000�ɂ͕s�ǂ��A";
	mes "^FF8000�쑤^000000�ɂ͓D�_���A";
	mes "^0000FF����^000000�ɂ͂�������A";
	mes "���ꂼ��ڌ�����Ă���悤�ł��B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "��X���x���͍s���Ă��܂����A";
	mes "�����ӂ��������I";
	close2;
	cutin "gef_soldier.bmp", 255;
	end;
}

1@gef.gat,116,203,5	script(HIDDEN)	�ē��v��#6	705,{
	cutin "gef_soldier.bmp", 2;
	mes "[�Q�t�F�����@���ē��l]";
	mes "����̃Q�t�F�����@����";
	mes "�I�����܂����B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "�����ꂢ�������܂��āA";
	mes "���ɂ��肪�Ƃ��������܂��B";
	mes "���y���݂����������ł��傤���B";
	next;
	mes "[�Q�t�F�����@���ē��l]";
	mes "�Q�t�F�����@���^�c�ꓯ�A";
	mes "�F�l�Ɋy����ł���������悤�A";
	mes "����ɐ��i���Ă܂���܂��̂ŁA";
	mes "����J�Î��������҂��������I";
	close2;
	cutin "gef_soldier.bmp", 255;
	end;
}

1@gef.gat,124,173,4	script	�Q�t�F���j��#a1	49,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
		unittalk "�Q�t�F���Z�� : ���̋@��ɂ����o�������Ƃ����ȁc�c�B";
		end;
	case 1:
		unittalk "�Q�t�F���Z�� : ���@���̋G�߂ɂȂ�Ɛl�������ȁ`�B";
		end;
	case 2:
		unittalk "�Q�t�F���Z�� : ���̍΂Ŗ����ɓƐg�c�c���т����c�c�B";
		end;
	}
}

1@gef.gat,194,91,4	script	�Q�t�F���q��#a2	82,5,5,{
	end;
OnTouch:
	switch(rand(3)) {
	case 0:
		unittalk "�Q�t�F���q�� : �܂�Ȃ��I�@���Ղ�Ȃ̂ɁI";
		end;
	case 1:
		unittalk "�Q�t�F���q�� : �����y�������Ƃ͂Ȃ����ȁI";
		end;
	case 2:
		unittalk "�Q�t�F���q�� : �p�p�ɂ����Â������炨���ƁI";
		end;
	}
}

1@gef.gat,71,86,4	script	�Q�t�F����#a3	478,{}
1@gef.gat,73,84,4	script	�Q�t�F����#a4	879,{}
1@gef.gat,75,82,4	script	�Q�t�F����#a5	92,{}
1@gef.gat,68,79,6	script	�C�P�����`����#a6	751,{}
1@gef.gat,70,77,2	script	�j�`����#a7	869,{
	end;
OnTimer1000:
	hideonnpc getmdnpcname("�C�P�����`����#a6");
	hideonnpc getmdnpcname("�j�`����#a7");
	end;
OnTimer2000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �₵����c�c�l���݂���������]�v�Ɏ₵���B";
	end;
OnTimer4000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : �Ȃɕ|�����ƌ����Ă�́I";
	end;
OnTimer6000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �Q�t�F���ɗ���`���҂ɂ͂����j������͂���I�@�t�i���p����̂�I";
	end;
OnTimer8000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �����j�Ȃ�Ăǂ��ɂ����Ȃ����I";
	end;
OnTimer10000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �]�~�\�܂ŋؓ��ŏo���Ă�悤�Ȃ�������B���������Ȃ����I";
	end;
OnTimer12000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : ��������ĉԐ���̎������̐t�����т����߂����Ȃ�āc�c�B";
	end;
OnTimer14000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �������A��]���̂ĂĂ͂����Ȃ��c�c������߂Ȃ��ŁI�@�݂�ȁI";
	end;
OnTimer16000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �ӂ��c�c�������ˁB";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : �͂��c�c�������ˁB";
	end;
OnTimer18000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : ����H�@���I�@�������I�@�������ɂ����j�I";
	end;
OnTimer20000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : ����I�@�ǂ��ɁI";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : ���H�@�ǂ��H�@�ǂ��H";
	end;
OnTimer21000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �ق�I�@���̐l�A���̐l�I";
	hideoffnpc getmdnpcname("�C�P�����`����#a6");
	end;
OnTimer23000:
	unittalk getnpcid(0,getmdnpcname("�C�P�����`����#a6")),"�C�P�����`���� : �������ɖ��@�����炩�ȁc�c���킢���l�������ȁc�c�B";
	end;
OnTimer24000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : ����[�I�@�����������I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : ����A��΂������Ɍ������̂�I";
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �L���[�I�@������������I";
	end;
OnTimer26000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �ǁA�ǂ�����c�c�b�������Ă݂�H";
	end;
OnTimer28000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : ����͂��Ȃ�����傶��Ȃ��I�@�����b�������Ă݂Ă�I";
	end;
OnTimer30000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �����I�@�N���b�������Ă�I";
	end;
OnTimer32000:
	unittalk getnpcid(0,getmdnpcname("�C�P�����`����#a6")),"�C�P�����`���� : �������낻�뗈��͂��Ȃ񂾂��ǂȁc�c�B";
	end;
OnTimer34000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : !!�@�c�c�N����҂��Ă�݂����B";
	end;
OnTimer36000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : ���������Ĕޏ�?!";
	end;
OnTimer38000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : ����Ȃ̃_���`!!";
	hideoffnpc getmdnpcname("�j�`����#a7");
	end;
OnTimer40000:
	unittalk getnpcid(0,getmdnpcname("�j�`����#a7")),"�j�`���� : ���߂�A�҂������H";
	end;
OnTimer42000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �ǂ������I�@�j��B";
	end;
OnTimer44000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : �����̗F�B�݂����I";
	end;
OnTimer46000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : ��l�Ƃ��������E�ƁE���I";
	end;
OnTimer48000:
	unittalk getnpcid(0,getmdnpcname("�C�P�����`����#a6")),"�C�P�����`���� : �S�R�I�@����Ȃ��ƂȂ���A�}�C�n�j�[�I";
	emotion 3,getmdnpcname("�C�P�����`����#a6");
	end;
OnTimer49000:
	emotion 23, getmdnpcname("�Q�t�F����#a3");
	emotion 23, getmdnpcname("�Q�t�F����#a4");
	emotion 23, getmdnpcname("�Q�t�F����#a5");
	end;
OnTimer51000:
	emotion 3, getmdnpcname("�C�P�����`����#a6");
	unittalk getnpcid(0,getmdnpcname("�j�`����#a7")),"�j�`���� : �_�[�����c�c�B";
	emotion 3, getmdnpcname("�j�`����#a7");
	end;
OnTimer53000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �������ɂ͉��Ȃ�ĂȂ��݂����c�c�B";
	end;
OnTimer54000:
	emotion 3, getmdnpcname("�C�P�����`����#a6");
	end;
OnTimer55000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : ���傹�񂱂�ȃI�`���Ǝv�������c�c�B";
	emotion 3, getmdnpcname("�j�`����#a7");
	end;
OnTimer57000:
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �������̗F���A�i���ɁI";
	emotion 3, "�C�P�����`����#a6";
	end;
OnTimer58000:
	emotion 3, getmdnpcname("�j�`����#a7");
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a3")),"�Q�t�F���� : �������̗F���A�i���ɁI";
	emotion 28, getmdnpcname("�Q�t�F����#a3");
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a4")),"�Q�t�F���� : �������̗F���A�i���ɁI";
	emotion 28, getmdnpcname("�Q�t�F����#a4");
	unittalk getnpcid(0,getmdnpcname("�Q�t�F����#a5")),"�Q�t�F���� : �������̗F���A�i���ɁI";
	emotion 28, getmdnpcname("�Q�t�F����#a5");
	end;
OnTimer60000:
	emotion 3, getmdnpcname("�C�P�����`����#a6");
	end;
OnTimer61000:
	emotion 3, getmdnpcname("�j�`����#a7");
	end;
OnTimer64000:
	emotion 3, getmdnpcname("�j�`����#a7");
	end;
OnTimer90000:
OnStart:
	initnpctimer;
	end;
}

1@gef.gat,42,102,6	script	�Q�t�F���Z�l#a8	50,{
	mes "[�Q�t�F���Z�l]";
	mes "���@���̋G�߂͊ό��q�œ��키�ȁI";
	close;
}

1@gef.gat,103,100,6	script	�Q�t�F���Z�l#a9	54,{
	mes "[�Q�t�F���Z�l]";
	mes "���Ȃ��ւ����ȁ`�B";
	close;
}

1@gef.gat,128,93,4	script	�Q�t�F���Z�l#a10	979,{
	mes "[�Q�t�F���Z�l]";
	mes "���Q���҂̑I�肳�񂩂��H";
	mes "���𐷂�グ�Ă����";
	mes "���肪�Ƃ��ˁ`�I";
	close;
}

1@gef.gat,130,196,6	script	���@���ϗ���#c5	46,{
	mes "[���@���ϗ���]";
	mes "!!";
	mes "�Ȃ�ƁI�@���@�̂悤�ȉԉ΂��ȁI";
	mes "�ǂ�Ȏd�g�݂œ����Ă���̂�";
	mes "�C�ɂȂ邼�c�c�B";
	close;
}

1@gef.gat,137,190,6	script	���@���ϗ���#c6	67,{
	mes "[���@���ϗ���]";
	mes "���΂������I";
	mes "�Y��ȉԉ΂���R�������Ă��I";
	close;
}

1@gef.gat,149,196,6	script	���@���ϗ���#c8	47,{
	mes "[���@���ϗ���]";
	mes "�l���݂͋�肾���ǁA";
	mes "���@���͌������c�c�B";
	mes "���͂ǂ������炢���񂾁I";
	close;
}

1@gef.gat,136,188,6	script	���@���ϗ���#c10	771,{
	mes "[���@���ϗ���]";
	mes "�z�z�z�c�c";
	mes "����Ȃɂ͂��Ⴂ�ŁA";
	mes "�]�΂Ȃ��悤�ɂˁB";
	close;
}

1@gef.gat,110,195,4	script	���@���ϗ���#c12	49,{
	mes "[���@���ϗ���]";
	mes "������Ă�ȁ`�B";
	close;
}

1@gef.gat,104,189,4	script	���@���ϗ���#c14	66,{
	mes "[���@���ϗ���]";
	mes "�ǂ����悤�`�B";
	mes "�F�B�Ƃ͂��ꂿ�������`�B";
	close;
}

1@gef.gat,94,194,4	script	���@���ϗ���#c16	68,{
	mes "[���@���ϗ���]";
	mes "���������@���I";
	mes "�������ȁ`�A";
	mes "�����璆�ɖ��@�̉ԉ΂��������Ă�I";
	close;
}

1@gef.gat,52,155,6	script	���@���ϗ���#c28	69,{
	mes "[���@���ϗ���]";
	mes "���̐l�̔��F�X�e�L�I";
	mes "�킽�������߂��Ⴈ��������`�B";
	close;
}

1@gef.gat,55,142,4	script	���@���ϗ���#c30	70,{
	mes "[���@���ϗ���]";
	mes "���Z�l�I�@�������炵�Ă��������ȁI";
	close;
}

1@gef.gat,58,146,4	script	���@���ϗ���#c32	51,{
	mes "[���@���ϗ���]";
	mes "����A������Ƃ܂��Ă����`�I";
	mes "�y�킪�d���đ���Ȃ��񂾁`�I";
	close;
}

1@gef.gat,45,149,6	script	���@���ϗ���#c36	71,{
	mes "[���@���ϗ���]";
	mes "!!";
	mes "�Ȃ񂾂��������������I";
	mes "�a���Ɍ����Ă�̂�����I";
	close;
}

1@gef.gat,44,133,6	script	���@���ϗ���#c37	52,{
	mes "[���@���ϗ���]";
	mes "�E�H�I�I�I�`�I";
	mes "���V���Q���������������`�I";
	close;
}

1@gef.gat,45,126,6	script	���@���ϗ���#c38	48,{
	mes "[���@���ϗ���]";
	mes "����ɂ��́B";
	mes "��D�̖��@�����a�ł��ˁB";
	close;
}

1@gef.gat,44,118,6	script	���@���ϗ���#c39	73,{
	mes "[���@���ϗ���]";
	mes "���Ȃ������@���ɂ͏��߂ė����́H";
	close;
}

1@gef.gat,55,113,4	script	���@���ϗ���#c40	74,{
	mes "[���@���ϗ���]";
	mes "���Ղ�͂����ɂȂ��Ă��S����`�I";
	close;
}

1@gef.gat,50,107,6	script	���@���ϗ���#c41	54,{
	mes "[���@���ϗ���]";
	mes "�����V�C���ȁ[�B";
	close;
}

1@gef.gat,44,95,6	script	���@���ϗ���#c42	55,{
	mes "[���@���ϗ���]";
	mes "���͂ǂ��ɍs�������̂��B";
	mes "���₩�Ŋy�����̂��`�B";
	close;
}

1@gef.gat,52,83,6	script	���@���ϗ���#c43	56,{
	mes "[���@���ϗ���]";
	mes "�V�b�I�@�Â��ɁI";
	mes "���͊ϗ��҂ɕ���āA";
	mes "�����̌x�������Ă���̂��B";
	mes "�C�Â���Ȃ��悤���͂��Ă���B";
	close;
}

1@gef.gat,72,65,6	script	���@���ϗ���#c44	57,{
	mes "[���@���ϗ���]";
	mes "���₨��I�@�N�́I";
	mes "�c�c��H";
	mes "�����A���܂Ȃ��B�l�Ⴂ�̗l���B";
	mes "�m�荇���̖`���҂ɂ悭���Ă���B";
	close;
}

1@gef.gat,83,60,6	script	���@���ϗ���#c45	75,{
	mes "[���@���ϗ���]";
	mes "����`�c�c�B";
	mes "��l�Ƃ����̊Ԃɂ�";
	mes "���Ȃ��Ȃ���������c�c�B";
	mes "�͂��ꂿ��������Ȃ��B";
	close;
}

1@gef.gat,94,68,6	script	���@���ϗ���#c46	76,{
	mes "[���@���ϗ���]";
	mes "�ǂ��s����������񂾂낤�c�c�B";
	mes "�����A���������āI";
	mes "���̎q����Ȃ��H";
	close;
}

1@gef.gat,97,66,4	script	���@���ϗ���#c47	77,{
	mes "[���@���ϗ���]";
	mes "�ق�ƁI�@���̎q����I";
	mes "����ƌ������`�I";
	mes "�����l�������Ƃ͂��ꂿ�Ⴄ�ˁB";
	mes "�C��t���Ȃ��ƁI";
	close;
}

1@gef.gat,106,56,6	script	���@���ϗ���#c48	78,{
	mes "[���@���ϗ���]";
	mes "���Ղ�͂�����˂��`�B";
	mes "��҂������Ċ��C�������˂��`�B";
	mes "������Ԃ����Ⴄ�킟�`�B";
	close;
}

1@gef.gat,134,63,4	script	���@���ϗ���#c49	58,{
	mes "[���@���ϗ���]";
	mes "�����A���̖��I";
	mes "���킢���Ȃ��A�ЂƂ肩�Ȃ��B";
	mes "�������Ă݂悤���Ȃ��c�c�B";
	close;
}

1@gef.gat,145,47,4	script	���@���ϗ���#c50	106,{
	mes "[���@���ϗ���]";
	mes "����H�@�Q���҂̕��ł����H";
	mes "���͊ϗ��҂ɕϑ�����";
	mes "�����̌x�������Ă���̂ł���B";
	mes "�ق��̂��q�l�ɂ͓����ł���B";
	close;
}

1@gef.gat,154,55,4	script	���@���ϗ���#c51	59,{
	mes "[���@���ϗ���]";
	mes "���Ȃ������̎Q���҂ł����H";
	mes "�J�b�R�C�C�Ȃ��c�c�I";
	mes "�l�����͊撣���ĎQ�����Ă݂悤���ȁI";
	close;
}

1@gef.gat,147,65,5	script	���@���ϗ���#c52	60,{
	mes "[���@���ϗ���]";
	mes "�킵����������������Ⴂ�܂��Ȃ��B";
	mes "�����ƁA�����Ȃ������Ȃ��B";
	mes "���E�҂�����́A";
	mes "���������̂悤�Ȗڂ�";
	mes "�݂Ă͂����܂���ˁB";
	close;
}

1@gef.gat,163,76,4	script	���@���ϗ���#c53	79,{
	mes "[���@���ϗ���]";
	mes "�_���l������A";
	mes "�ǂ��ɂ�����������񂾂낤�B";
	mes "�Y��ȏ������D��������A";
	mes "�����̑������ɂ���Ǝv���񂾂��ǁB";
	close;
}

1@gef.gat,167,68,4	script	���@���ϗ���#c54	80,{
	mes "[���@���ϗ���]";
	mes "�H���������������A";
	mes "���@���͊y�����˂��I";
	mes "�܂��܂��H�ׂ��Ⴄ���`�I";
	close;
}

1@gef.gat,175,74,4	script	���@���ϗ���#c55	947,{
	mes "[���@���ϗ���]";
	mes "����͂������Q���҂ɉ�������H";
	mes "���N�̖��@����";
	mes "����̂��낢�炵�����I";
	close;
}

1@gef.gat,180,84,4	script	���@���ϗ���#c56	53,{
	mes "[���@���ϗ���]";
	mes "����ɂ��́I";
	mes "���@���A�y����ł�H";
	mes "���͂Ƃ��Ă��y������I";
	mes "������Ɖ����������ǁA";
	mes "�撣���ė����b�オ�����I";
	close;
}

1@gef.gat,189,97,4	script	���@���ϗ���#c57	62,{
	mes "[���@���ϗ���]";
	mes "��[���I";
	mes "�ꏏ�ɗV�ڂ���[�I";
	close;
}

1@gef.gat,194,110,4	script	���@���ϗ���#c58	107,{
	mes "[���@���ϗ���]";
	mes "�����`��A���������ē�����I";
	mes "�������A���̓X�ɂ�";
	mes "�炵�������Ă��Ȃ��I";
	mes "�����`��c�c�B";
	close;
}

1@gef.gat,185,107,6	script	���@���ϗ���#c59	108,{
	mes "[���@���ϗ���]";
	mes "���@����������";
	mes "�������蔲���o���Ă����̂��I";
	mes "�ǂ����A���̊����ȕϑ��B";
	mes "�N�ɂ��΂��܂��I";
	close;
}

1@gef.gat,189,120,4	script	���@���ϗ���#c60	61,{
	mes "[���@���ϗ���]";
	mes "�����A���Ȃ��I";
	mes "���l�̊��D�������ςȂ��������";
	mes "�������܂���ł�����?!";
	close;
}

1@gef.gat,152,120,4	script	���@���ϗ���#c62	123,{
	mes "[���@���ϗ���]";
	mes "���̂����ȁ`�I";
	mes "���͂ǂ����ɂ������I";
	close;
}

1@gef.gat,138,110,4	script	���@���ϗ���#c63	90,{
	mes "[���@���ϗ���]";
	mes "���āA���̉ԉ΁I";
	mes "����Ȃɋ߂��ŔR���Ă���̂ɁA";
	mes "�S���M���Ȃ��̂�B";
	mes "���@���Ă�������ˁB";
	close;
}

1@gef.gat,128,99,4	script	���@���ϗ���#c64	91,{
	mes "[���@���ϗ���]";
	mes "����ɂ��́I";
	mes "���Q�t�F�����ď��߂ė����́I";
	mes "�X�e�L�ȊX�ˁI";
	close;
}

1@gef.gat,105,109,6	script	���@���ϗ���#c65	92,{
	mes "[���@���ϗ���]";
	mes "���킟�c�c�B";
	mes "�l�������Ėڂ���肻���c�c�B";
	close;
}

1@gef.gat,96,122,6	script	���@���ϗ���#c66	93,{
	mes "[���@���ϗ���]";
	mes "����ɂ��́I";
	mes "���Ղ肽�̂����˂��I";
	close;
}

1@gef.gat,132,137,6	script	���@���ϗ���#c67	920,{
	mes "[���@���ϗ���]";
	mes "����Ȃɐl������Ȃ�āI";
	mes "���@�����Đl�C�Ȃ�ł��ˁB";
	close;
}

1@gef.gat,141,132,4	script	���@���ϗ���#c68	806,{
	mes "[���@���ϗ���]";
	mes "���₨��A�`���҂���B";
	mes "�΂�Ă��܂��܂������H";
	mes "���͊ϗ��҂ɕϑ�����";
	mes "�����̌x�������Ă���̂ł���B";
	mes "�������l���������狳���Ă��������ˁB";
	close;
}

1@gef.gat,124,72,4	script	���@���ϗ���#c69	807,{
	mes "[���@���ϗ���]";
	mes "����ɂ��́A�������V�C�ł��ˁB";
	mes "���Ղ�ł�����ˁB";
	mes "����ėǂ������ł��B";
	close;
}

1@gef.gat,130,49,6	script	���@���ϗ���#c70	808,{
	mes "[���@���ϗ���]";
	mes "���Ȃ��������ł��ˁB";
	mes "���@���̎Q���҂̕��ł����H";
	mes "���Ƃ������";
	mes "�����炵���܂��񂩁H";
	mes "�n�n�n�c�c�B��k�ł���B";
	close;
}

1@gef.gat,127,196,0	script	#���@���ԉ�_1	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 30;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 29;
	end;
}

1@gef.gat,146,175,0	script	#���@���ԉ�_2	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 62;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 22;
	end;
}

1@gef.gat,182,163,0	script	#���@���ԉ�_3	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 89;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 74;
	end;
}

1@gef.gat,183,126,0	script	#���@���ԉ�_4	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 97;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 92;
	end;
}

1@gef.gat,194,89,0	script	#���@���ԉ�_5	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 234;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 225;
	end;
}

1@gef.gat,141,56,0	script	#���@���ԉ�_6	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 256;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 258;
	end;
}

1@gef.gat,127,49,0	script	#���@���ԉ�_7	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 257;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 244;
	end;
}

1@gef.gat,123,75,0	script	#���@���ԉ�_8	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 92;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 29;
	end;
}

1@gef.gat,135,111,0	script	#���@���ԉ�_9	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 62;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 30;
	end;
}

1@gef.gat,134,145,0	script	#���@���ԉ�_10	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 234;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 89;
	end;
}

1@gef.gat,90,197,0	script	#���@���ԉ�_b1	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 28;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 258;
	end;
}

1@gef.gat,71,181,0	script	#���@���ԉ�_b2	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 97;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 29;
	end;
}

1@gef.gat,62,147,0	script	#���@���ԉ�_b3	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 195;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 116;
	end;
}

1@gef.gat,59,125,0	script	#���@���ԉ�_b4	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 32;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 62;
	end;
}

1@gef.gat,62,91,0	script	#���@���ԉ�_b5	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 92;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 30;
	end;
}

1@gef.gat,98,58,0	script	#���@���ԉ�_b6	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 225;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 234;
	end;
}

1@gef.gat,112,49,0	script	#���@���ԉ�_b7	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 28;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 89;
	end;
}

1@gef.gat,116,75,0	script	#���@���ԉ�_b8	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 257;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 94;
	end;
}

1@gef.gat,107,111,0	script	#���@���ԉ�_b9	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 244;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 255;
	end;
}

1@gef.gat,106,145,0	script	#���@���ԉ�_b10	139,{
OnStart:
	initnpctimer;
	end;
OnTimer7000:
	misceffect 92;
	end;
OnTimer20000:
	initnpctimer;
	misceffect 195;
	end;
}

1@gef.gat,124,65,4	script	�J�v���E��#gef	114,{
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂�";
	mes "�J�v���T�[�r�X��";
	mes "�����F�l�̂��΂ɂ��܂��B";
	mes "��������`���������܂��傤�H";
	next;
	switch(select("�q�ɃT�[�r�X -> 40zeny","�J�[�g�T�[�r�X","�I��")) {
	case 1:
		if(basicskillcheck() && getskilllv(1)<6 && getskilllv(5018)<1 ) {
			mes "[�J�v���E��]";
			mes "�q�ɂ͊�{�X�L�����x��6��";
			mes "�K�����Ă��痘�p�\�ƂȂ�܂��B";
		}
		if(Zeny < 40) {
			mes "[�J�v���E��]";
			mes "���q�l�A����������܂���B";
			mes "�q�ɗ��p������40Zeny�ł��B";
			close;
		}
		mes "[�J�v���E��]";
		mes "�q�ɂ��J���܂��B";
		close2;
		set Zeny,Zeny-40;
		openstorage;
		end;
	case 2:
		if(getbaseclass(Class) != CLASS_MC && Job != Job_SuperNovice && Job != Job_ExpandedSuperNovice) {
			mes "[�J�v���E��]";
			mes "�\���󂲂����܂���B";
			mes "�J�[�g�͏��l�Ƃ��̏�ʐE��p��";
			mes "�T�[�r�X�ł��B";
			close;
		}
		if(checkcart()) {
			mes "[�J�v���E��]";
			mes "���q�l�͌��݃J�[�g��";
			mes "���p����Ă��܂��B";
			close;
		}
		mes "[�J�v���E��]";
		mes "�J�[�g���p������800Zeny�ł��B";
		mes "�܂��A�J�[�g�𗘗p����ɂ�";
		mes "�u�v�b�V���J�[�g�v�X�L�����K�v�ł��B";
		mes "���̃X�L�����Ȃ��ƃJ�[�g�𗘗p";
		mes "�ł����ɂ������������Ă��܂��܂��B";
		mes "�����͂�낵���ł����H";
		next;
		if(select("���p����","������")==2) {
			mes "[�J�v���E��]";
			mes "���肪�Ƃ��������܂����B";
			mes "�܂������p���������܂��B";
			close;
		}
		if(Zeny<800) {
			mes "[�J�v���E��]";
			mes "���q�l�A����������܂���B";
			mes "�J�[�g���p������800Zeny�ł��B";
			close;
		}
		set Zeny,Zeny-800;
		set KAFRA_PIT,KAFRA_PIT+80;
		setcart;
		close;
	case 3:
		mes "[�J�v���E��]";
		mes "��X�J�v���T�[�r�X�́A��芮����";
		mes "�T�[�r�X�ƊǗ��Ɩ���ڎw��";
		mes "���q�l�����S���Ă����p����������悤";
		mes "�����őP��s�����Ă��܂��B";
		next;
		mes "[�J�v���E��]";
		mes "�i���j�J�v���T�[�r�X�������p��������";
		mes "���肪�Ƃ��������܂����B";
		close;
	}
}

1@gef.gat,196,111,3		shop	�����ޗ����l#gef	85,7482
1@gef_in.gat,30,178,4	shop	���폤�l#gefa		47,1750,1751,1101,1701,1201,1204,1207,1210,1213,1216,1601,1604,1607,1610
1@gef_in.gat,26,178,4	shop	�h��l#gef		66,2628,2101,2107,2401,2501,2230,2301,2303,2305,2321,2332
1@gef_in.gat,74,144,0	shop	���l#gef			66,911,910,912
1@gef_in.gat,77,167,0	shop	����l #gefa		68,1750,611,501,502,503,504,645,656,601,602,2241
1@gef_in.gat,77,173,0	shop	���@���l#gef		64,717,1601,1604,1607,1610,2232,2321,2332

1@gef.gat,193,152,4	script	�e�C�~���O���l#gef	124,{
	mes "[�e�C�~���O���l]";
	mes "�\���������܂���A���q�l�B";
	mes "�������܏��i�̍݌ɂ�";
	mes "�؂炵�Ă���܂��B";
	mes "����̓��ׂɂ��܂��Ă�";
	mes "����ƂȂ��Ă���܂��B";
	close;
}

1@gef_in.gat,110,172,0	script	�N���X�g�t�E�W���j�A#1	63,{
	mes "[�N���X�g�t�E�W���j�A]";
	mes "^8B4513�N���X�g�t��^000000��";
	mes "�b�艮�ւ悤�����B";
	mes "�����ł͐��B�Ɋ֘A����";
	mes "�S�Ă̕i����̔�������";
	mes "��������Ă��܂��B";
	next;
	mes "[�N���X�g�t�E�W���j�A]";
	mes "���̓Q�t�F���Ղ̊��Ԓ��ɂ�";
	mes "�Վ��x�ƂƂȂ��Ă��܂��B";
	mes "�y�������Ղ��I��������";
	mes "�܂����z�����������B";
	close;
}

1@gef.gat,182,59,0		warp	#gef_a1	2,2,1@gef_in.gat,106,177
1@gef.gat,43,85,0		warp	#gef_a2	2,2,1@gef_in.gat,70,138
1@gef_in.gat,106,181,0	warp	#gef_a3	2,2,1@gef.gat,178,63
1@gef_in.gat,70,132,0	warp	#gef_a4	2,2,1@gef.gat,46,88
1@gef_in.gat,70,158,0	warp	#gef_a5	2,2,1@gef_in.gat,70,146
1@gef_in.gat,70,149,0	warp	#gef_a6	2,2,1@gef_in.gat,70,161
1@gef_in.gat,28,156,0	warp	#gef_a7	2,2,1@gef.gat,101,138
1@gef.gat,98,141,0		warp	#gef_a8	2,2,1@gef_in.gat,28,160
