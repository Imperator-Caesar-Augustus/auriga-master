//==============================================================================
// Nightmare Jitterbug Memorial Script
//==============================================================================
// JTB_1QUE�F0�`24�܂ŁB���[�v�|�C���g�̔����t���O�B��b�̐؂�ւ��B�����ԍ����i�[�B
// JTB_2QUE�F0�`7�܂ŁB���������̃{�X���j��C�x���g�p�B
// JTB_COUNT�F0�`10�܂ŁB����J�E���g�B�O�`�p�B
// JTB_DAILY�F0�`2�܂ŁB�A�C�O�A�����f�B�[�W���b�N�̈˗��p�B

//==========================================
// �y���c (1)
//------------------------------------------
moc_para01.gat,26,95,5	script	���G��#sara	10040,{
	cutin "roel01.bmp", 0;
	mes "[���G��]";
	mes "������p�ł����H";
	next;
	switch(select("�_���W�����̒T��","�y���_���g�̌���","�W�^�[�o�O�̉�̌���")) {
	case 1:
		if(Job < Job_RuneKnight || (BaseLevel <= 89 && Job == Job_Summoner)) {
			mes "[���G��]";
			mes "�V���ɖ`�������ɂ��Ă�������";
			mes "�T���Ă���̂ł����A";
			mes "�������킢�ɂȂ�܂��̂�";
			mes "�����̌o����ς�ł������";
			mes "���点�Ė���Ă��܂��B";
			next;
			cutin "roel01.bmp", 255;
			mes "�]�i�s�\�ȐE�Ƃ�";
			mes "�@3���E�Ƃ���ь��E�˔j����";
			mes "�@�X�[�p�[�m�[�r�X�̂悤��";
			mes "�@���x���g���������E�ƂƁA";
			mes "�@BaseLv90�ȏ�̃h�������ł��]";
			close;
		}
		if(checkquest(13183)) {
			cutin "roel02.bmp", 0;
			mes "[���G��]";
			mes strcharinfo(0)+ "�����";
			mes "�������ŃV�������V�[��";
			mes "�F�B�ɂȂ鎖���o���܂����B";
			next;
			mes "[���G��]";
			mes "���ǁA�Ō�͕ʂ�Ă��܂��܂�����";
			mes "�����ƁA�܂����ƐM���Ă��܂��B";
			mes "�{���ɂ��肪�Ƃ��������܂����B";
			delquest 13183;
			setquest 13181;
			delquest 13181;
			setquest 116509;
			compquest 116509;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(13181) & 0x8 && checkquest(116508) & 0x8 ) {
			cutin "roel01.bmp", 0;
			mes "[���G��]";
			mes "�����͂��肪�Ƃ��������܂����B";
			mes "��͂�V�������V�[�Ɖ��肠���̂�";
			mes "�����Ȃ�ł��傤���c�c�B";
			mes "�Ȃ�āA��C�̓_���ł���ˁI";
			mes "�厖�ȃM���h�����o�[�̂��߂ł��I";
			mes "�����撣��܂��傤�I";
			delquest 13181;
			setquest 116509;
			compquest 116509;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(13181)) {
			mes "[���G��]";
			mes "�ǂ������̂ł����H";
			mes "�������o������ׂɂ���";
			mes "���i�C������ɘb�������ĉ������B";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(checkquest(116508) & 0x8) {
			mes "[���G��]";
			mes "���߂ăV�������V�[�Əo�����";
			mes "���̖`���ȗ��A";
			mes "�s�v�c�Ȏ�������܂����B";
			next;
			mes "[���G��]";
			mes "�ڂ������Ƃ͂킩��܂��񂪁A";
			mes "���i�C������̃��[�v�|�[�^����";
			mes "�ꏊ�����ł͂Ȃ��A���Ԃ��ꏏ��";
			mes "�L�����Ă����炵����ł��B";
			next;
			mes "[���G��]";
			mes "�܂�A�V�������V�[�Əo�����";
			mes "���̎��̂��̏ꏊ�ցA";
			mes "������x�s����Ƃ������ł��I";
			next;
			mes "[���G��]";
			mes "�V�������V�[���{����";
			mes "�݂�Ȃƈꏏ��";
			mes "�����֋A���Ă����������͂��ł��B";
			next;
			mes "[���G��]";
			mes "������x�V�������V�[�ɉ�΁A";
			mes "�Ō�ɕʂꂸ�ɂ��ޕ��@��";
			mes "�����邩������܂���B";
			next;
			mes "[���G��]";
			mes "�����A�����f�łȂ����";
			mes "������x�ꏏ�ɂ��̋�Ԃɍs���A";
			mes "�V�������V�[���~���菕����";
			mes "���Ă��炦�܂��񂩁H";
			next;
			if(select("�͂�","������") == 2) {
				mes "[���G��]";
				mes "�����ł����B";
				close2;
				cutin "roel01.bmp", 255;
				end;
			}
			mes "[���G��]";
			mes "�������o������ׂɂ���";
			mes "���i�C������ɘb�������ĉ������B";
			setquest 13181;
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		mes "[���G��]";
		mes "�͂��߂܂��āB";
		mes "�j���I�[�Y�̔��H�M���h�̃����o�[�A";
		mes "���G���ł��I";
		next;
		mes "[���G��]";
		mes "�l�����͑O�M���h�}�X�^�[��";
		mes "�j���I�[�Y�l�����������Ƃ����A";
		mes "���m�̃_���W�����̒T���֏o�����܂��B";
		next;
		mes "[���G��]";
		mes "�������A�����͕s���ȏꏊ�̂���";
		mes "��葽���̐�͂��m�ۂ������Ǝv���A";
		mes "�Վ��̃M���h����";
		mes "��W���邱�Ƃɂ��܂����B";
		mes "�悩������Q�����Ē����܂��񂩁H";
		next;
		if(select("�͂�","������") == 2) {
			mes "[���G��]";
			mes "�����ł����c�c�c�O�ł��B";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		cutin "roel02.bmp", 0;
		mes "[���G��]";
		mes "���肪�Ƃ��������܂��B";
		mes "�j���I�[�Y�l�Ƃ����̂�";
		mes "^FF0000�j���I�[�Y�̔��H�M���h^000000��";
		mes "�O�M���h�}�X�^�[�ł��B";
		next;
		cutin "roel01.bmp", 0;
		mes "[���G��]";
		mes "�ނ͖`�����D���ŁA";
		mes "��ɐV�����X��_���W����������";
		mes "���������֗������Ă��܂��̂ŁA";
		mes "�M���h�����o�[�ł������Ȃ��Ȃ�";
		mes "�ނɉ���Ƃ͂ł��Ȃ�������ł��B";
		next;
		mes "[���G��]";
		mes "����ȃj���I�[�Y�l����A";
		mes "�������ʂ̎莆���͂��܂����B";
		mes "���ꂪ���̎莆�ł��B";
		next;
		mes "�]���Ȃ��͎莆���󂯎��A�J�����]";
		next;
		mes "^FF0000�]�M���h�݂̂�Ȃ�";
		mes "�@";
		mes "�@^FF0000����ف`�I�@�݂�Ȍ��C�ɂ��Ă�H";
		mes "�@^FF0000���͖����Ƃ��Ă����C����I";
		mes "�@^FF0000�`���̐�X�ŐV�������m�ɏo�����";
		mes "�@^FF0000�Ƃ��Ă��y������`�B�]^000000";
		next;
		mes "^FF0000�]���������A�`���̓r���Ŗʔ�������";
		mes "�@^FF0000�_���W�������������񂾁B";
		mes "�@^FF0000�Ƃ��Ă��s�v�c�ȕ��͋C�ŁA";
		mes "�@^FF0000���Ԃ�܂��N�ɂ���������Ă��Ȃ�";
		mes "�@^FF0000���m�̏ꏊ���Ǝv����!!";
		mes "�@^FF0000��������ˁ`�I�]^000000";
		next;
		mes "^FF0000�]����łˁA";
		mes "�@^FF0000�N�����������Ƃ̂Ȃ��ꏊ�Ȃ�";
		mes "�@^FF0000�ŏ��ɂ݂�ȂŒT���������Ȃ���";
		mes "�@^FF0000�v�����񂾁I�@�ƁA�����킯�Ȃ̂�";
		mes "�@^FF0000�݂�ȑ������ĂˁI�@�҂��Ă��`!!";
		mes "�@";
		mes "�@^FF0000�j���I�[�Y���]^000000";
		next;
		mes "�]�ǂݏI�����莆�����G���Ɏ�n�����]";
		next;
		mes "[���G��]";
		mes "���̎莆�����Ėl�́A";
		mes "�j���I�[�Y�l��";
		mes "^0000FF�M���h�����o�[�݂�Ȃ�";
		mes "^FF0000���m�̃_���W�����̍ŏ��̒T����";
		mes "^FF0000�o��������^000000�Ƃ����z���ɁA";
		mes "�ƂĂ����������̂ł��I";
		next;
		mes "[���G��]";
		mes "�����ǁA���}�X�^�[�̃��e���g�l��";
		mes "�U�X�S�z�����������₪���āI�@�ƁA";
		mes "�������{���Ă��܂����B";
		mes "���e���g�l�̓j���I�[�Y�l�̎��ƂȂ��";
		mes "�����{���Ă΂���Ȃ�ł��B";
		next;
		mes "[���G��]";
		mes "�{���Ă͂��܂����A";
		mes "�����ƃ��e���g�l��";
		mes "�j���I�[�Y�l���{���ɐS�z�Ȃ�ł��B";
		mes "����l�͕t�����������������ł����A";
		mes "�P���J����ق�";
		mes "�����ǂ��ƌ����܂����ˁB";
		next;
		mes "[���G��]";
		mes "�����A���낻�뎞�Ԃł��B";
		mes "�j���I�[�Y�l��";
		mes "���҂�������킯�ɂ͂����܂���B";
		mes "�j���I�[�Y�l���w�肵���W���ꏊ�́A";
		mes "���i�C������̃��[�v�|�[�^����";
		mes "�L�^���Ă���܂��B";
		next;
		mes "[���G��]";
		mes "�������o������ׂɂ���";
		mes "���i�C������ɘb�������ĉ������B";
		setquest 13181;
		close2;
		cutin "roel01.bmp", 255;
		end;
	case 2:
		cutin "roel01.bmp", 0;
		mes "[���G��]";
		mes "^ff0000�y���_���g�I�u�n�[���j�[[0]^000000��";
		mes "^ff0000�y���_���g�I�u�J�I�X[0]^000000�Ƃ���";
		mes "�A�N�Z�T���[��";
		mes "�������ł͂���܂��񂩁H";
		next;
		mes "[���G��]";
		mes "2�̃A�N�Z�T���[��";
		mes "�W�^�[�o�O�̉�50�������";
		mes "�A�N�Z�T���[��^ff0000����^000000�o�����ł��B";
		next;
		mes "[���G��]";
		mes "2����������ƁA�A";
		mes "���܂������\�ɂȂ����";
		mes "�~���~�����񂪌����Ă܂����B";
		mes "�m�����\�͂���Ȋ����ł��B";
		next;
		mes "[�y���_���g�I�u���C���X�g�[��[1]]";
		mes "All Status + 1";
		mes "�����E���@�U����";
		mes "�^����_���[�W + 6%";
		mes "���@�U�����󂯂����A";
		mes "���m���ŃI�[�g�X�y��";
		mes "[���C���X�g�[��]Lv1����";
		mes "�n��F�A�N�Z�T���[";
		mes "�h��F0";
		mes "�d�ʁF10";
		mes "�v�����x���F130";
		mes "�����F�O���E";
		next;
		mes "[���G��]";
		mes "�l�͂��̃y���_���g����ڌ������āA";
		mes "�~���~������ɗ����";
		mes "�����̕��@�������Ă�������̂ł����A";
		mes "�S�Ă̍ޗ��𑵂���̂�";
		mes "�ƂĂ�����āc�c�B";
		next;
		mes "[���G��]";
		mes "�����A��Ƃ��W�߂�ꂽ��";
		mes "�l�̂Ƃ���Ɏ����ė��Ă��������B";
		mes "�l�̓y���_���g���������";
		mes "����Ŗ����Ȃ̂ŁA";
		mes "�����i�͍����グ�܂��I";
		close2;
		cutin "roel01.bmp", 255;
		end;
	case 3:
		cutin "roel01.bmp", 0;
		mes "[���G��]";
		mes "�W�^�[�o�O�����ɓ���";
		mes "�W�^�[�o�O�̉�c�c�B";
		mes "���������Ď����Ă��܂����H";
		next;
		mes "[���G��]";
		mes "�����Ɏg����ޗ��炵���A";
		mes "�~���~������Ɏ����ė�����";
		mes "���܂�Ă��܂��܂��āc�c�B";
		next;
		mes "[���G��]";
		mes "�ł����A�Ȃ��Ȃ��W�܂�Ȃ���";
		mes "�����Ă����Ƃ���Ȃ�ł��I";
		next;
		mes "[���G��]";
		mes "�����ǂ�������A";
		mes "�j���I�[�Y�l���ߋ��ɏW�߂Ă���";
		mes "�험�i�ƌ������܂��񂩁H";
		next;
		mes "[���G��]";
		mes "�험�i�̒��ɂ���̂́c�c";
		mes "�M�K���g�{�E�A���̋|�A���Ƃ́c�c";
		mes "�`���ɖ𗧂A�C�e������";
		mes "�j���I�[�Y�l�̑z���o�̕i�܂ŁI";
		mes "�F�X����݂����ł���B";
		next;
		mes "[���G��]";
		mes "�W�^�[�o�O�̉��^FF00002��^000000�W�߂ė�����";
		mes "^FF0000�험�i�̒����烉���_����^000000";
		mes "^FF0000�ЂƂƌ������܂��傤�B^000000";
		next;
		if(select("��߂�","��������")==1) {
			mes "[���G��]";
			mes "�����ł����c�c�B";
			mes "�c�O�ł��B";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		if(countitem(6719) < 2) {
			mes "[���G��]";
			mes "����A��������Ȃ��悤�ł��ˁB";
			mes "�����ɂ�^FF0000�W�^�[�o�O�̉�^000000��";
			mes "^FF00002��^000000�K�v�ł��B";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		mes "[���G��]";
		mes "�m����2����܂��ˁB";
		mes "�ł́A��������n�����܂��傤�B";
		next;
		cutin "roel02.bmp", 0;
		mes "[���G��]";
		mes "�厖�Ɏg���Ă��������ˁB";
		mes "��������ƏW�߂Ă�����";
		mes "�܂��������܂��傤�I";
		delitem 6719,2;
		// �C�O�h���V���̎��A�C�O�h���V���̎�A�Â��J�[�h���A�X�v�����f�B�b�h�R�C���A��ʂ̂ǂ񂮂�A�󔠁A�M�K���g�{�E�A���̋|�A�j���I�[�Y�̃E�N����
		// ���Ă����v���[�g�A�n�[�h�v���[�g�A�A�C�O�̉ԏ���}�C�N�A�͂̃O���[�u�A�m�͂̃O���[�u�A�q���̃O���[�u
		// �̗͂̃O���[�u�A��p���̃O���[�u�A�K�^�̃O���[�u�A�j���I�[�Y�̗������O�A�A�C�O�̉ԏ���u���X���b�g�A�y���_���g�I�u�n�[���j�[
		setarray '@nameid,607,608,616,6081,6558,7444,18122,18123,1935,15100,15101,1990,2917,2918,2919,2920,2921,2922,2988,2989,2990;
		setarray '@amount,3,5,1,10,100,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1;
		setarray '@rate,50,50,30,150,80,200,10,40,20,20,20,20,30,20,20,20,20,80,20,20,10;
		set '@max,0;
		for(set '@i,0; '@i < getarraysize('@nameid); set '@i,'@i+1) set '@max,'@max+'@rate['@i];
		set '@rand,rand('@max);
		for(set '@i,0; '@i < getarraysize('@nameid); set '@i,'@i+1) {
			if('@i > 0)
				set '@rate['@i],'@rate['@i] + '@rate['@i-1];
			if('@rand < '@rate['@i]) {
				getitem '@nameid['@i],'@amount['@i];
				break;
			}
		}
		close2;
		cutin "roel02.bmp", 255;
		end;
	}
}

moc_para01.gat,29,95,5	script	���i�C��#sara	10039,{
	if(Job < Job_RuneKnight || (BaseLevel <= 89 && Job == Job_Summoner)) {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "���Ȃ����_���W�����̒T����";
		mes "�Q���������́H";
		mes "�ł��A���̂��Ȃ�����͕s���ˁB";
		mes "�������������Ȃ��Ă��痈�Ȃ����B";
		next;
		cutin "lunain01.bmp", 255;
		mes "�]�i�s�\�ȐE�Ƃ�";
		mes "�@3���E�Ƃ���ь��E�˔j����";
		mes "�@�X�[�p�[�m�[�r�X�̂悤��";
		mes "�@���x���g���������E�ƂƁA";
		mes "�@BaseLv90�ȏ�̃h�������ł��]";
		close;
	}
	if(checkquest(13181) ==0) {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "����ɂ��́B";
		mes "�Ȃɂ������������Ȋ�����Ă����ˁB";
		next;
		mes "[���i�C��]";
		mes "���B�͍�����";
		mes "�Ƃ���ꏊ�̒T���֍s���̂�B";
		mes "�ڂ����m�肽���Ȃ�";
		mes "���ɂ���^ff0000���G��^000000�ɘb�𕷂��Ƃ�����B";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
	if(checkquest(116509) & 0x8) {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "����ɂ��́B";
		mes "�����͂ǂ�����́H";
		set '@str$,"�O�`������";
	} else {
		cutin "lunain01.bmp", 0;
		mes "[���i�C��]";
		mes "���G���ɘb�������Ă����݂����ˁB";
		mes "���̓j���I�[�Y�̔��H�M���h�̃����o�[";
		mes "^ff0000���i�C��^000000��B";
		next;
		mes "[���i�C��]";
		mes "���Ȃ����ꏏ�ɍs���̂ˁB";
		mes "�����͂���������H";
	}
	next;
	switch(select("�_���W�����ɍs��",'@str$,"��߂�")) {
	case 1:
		if(checkquest(13182)) {
			if(checkquest(13182) & 0x2 && checkquest(118906) & 0x2) {
				mes "[���i�C��]";
				mes "�������[�v���g�p���邱�Ƃ�";
				mes "�\�ɂȂ�����B";
				delquest 13182;
				delquest 118906;
				close2;
				cutin "lunain01.bmp", 255;
				end;
			}
			mes "[���i�C��]";
			mes "���͎������[�v���g���Ȃ���B";
			mes "���ꂵ�Ă��玟��^ff0000�ߑO5���ȍ~^000000��";
			mes "�܂����ĂˁB";
			next;
			mes "[���i�C��]";
			mes "���ƁA�ߑO5���ȍ~�������Ƃ��Ă�";
			mes "�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ă��Ȃ��ꍇ��";
			mes "�������[�v���g���Ȃ����璍�ӂ��Ȃ����B";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		if(checkquest(13181) & 0x8) {
			mes "[���i�C��]";
			mes "^ff0000�����̃��[�v^000000�𗘗p����Ȃ�A";
			mes "��Ƀ��G���Ƙb�����ė��Ȃ����B";
			mes "�N�ɂł����p�������ɂ͍s���Ȃ��́B";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		if(getonlinepartymember() < 1) {
			mes "[���i�C��]";
			mes "^ff0000�p�[�e�B�[������^000000���Ă��Ȃ���";
			mes "���̐�ɂ͐i�߂Ȃ����B";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		set '@party$,getpartyname(getcharid(1));
		mes "[���i�C��]";
		mes "���[�v�|�[�^���͂��ł��J���邯��";
		mes "�ǂ�����́H";
		next;
		mes "^ff0000�]�������A���_���W�����쐬���^000000";
		mes "�@�p�[�e�B�[���[�_�[��ύX�����ꍇ";
		mes "�@����ɐi�s�ł��Ȃ��ꍇ��";
		mes "�@����܂��̂ł����ӂ��������]";
		next;
		if(getpartyleader(getcharid(1))==strcharinfo(0)) {
			switch(select("�����̃��[�v������","�����̃W�^�[�o�O����","�L�����Z��")) {
			case 1:
				if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
					mes "�p�[�e�B�[���F"+ '@party$;
					mes "^0000ffjitterbug ^000000-�\�񎸔s";
					close2;
					cutin "lunain01.bmp", 255;
					end;
				}
				if(getonlinepartymember() < 1) {
					mes "�p�[�e�B�[���F"+ '@party$;
					mes "�p�[�e�B�[���[�_�[�F"+strcharinfo(0)+"";
					mes "^0000ffjitterbug ^000000-�\�񎸔s";
					close2;
					cutin "lunain01.bmp", 255;
					end;
				}
				mes "[���i�C��]";
				mes "^ff0000�����̃��[�v�����������B";
				mes "^ff0000���������҂��ĂȂ����B^000000";
				close2;
				mdcreate "jitterbug";
				cutin "lunain01.bmp", 255;
				end;
			case 2:
				mes "[���i�C��]";
				mes "�킩������B";
				mes "���[�v�|�[�^�����J������";
				mes "�����Ă��傤�����B";
				next;
				mes "[���i�C��]";
				mes "���̎������[�v�͈�x�g����";
				mes "���ꂵ�Ă��玟��^ff0000�ߑO5���ȍ~^000000�ɂȂ�܂�";
				mes "������x�g�������o���Ȃ��́B";
				next;
				mes "[���i�C��]";
				mes "���ƁA�ߑO5���ȍ~�������Ƃ��Ă�";
				mes "�Ō�̓�������Ă���";
				mes "^ff00001����^000000�o�߂��Ă��Ȃ��ꍇ��";
				mes "�������[�v���g���Ȃ����璍�ӂ��Ȃ����B";
				next;
				switch(mdenter("jitterbug")) {
				case 0:
					cutin "lunain01.bmp", 255;
					set JTB_1QUE,0;
					setquest 13182;
					setquest 118906;
					delquest 116500;
					misceffect 316,"";
					misceffect 317,"";
					announce "�������A���_���W����[jitterbug] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
					donpcevent getmdnpcname("jitter_control1")+ "::OnStart";
					close;
				case 1:	// �p�[�e�B�[������
					mes "�]�p�[�e�B�[���̂݁A";
					mes "�@�������A���_���W������";
					mes "�@���ꂷ�邱�Ƃ��ł��܂��]";
					close;
				case 2:
					mes "[���i�C��]";
					mes "^ff0000�p�[�e�B�[���[�_�[^000000��";
					mes "^ff0000�������[�v^000000���������ĂȂ���B";
					close2;
					cutin "lunain01.bmp", 255;
					end;
				default:	// ���̑��G���[
					close;
				}
			case 3:
				mes "[���i�C��]";
				mes "��߂�̂ˁB�킩������B";
				mes "�������ł�����܂����āB";
				close2;
				cutin "lunain01.bmp", 255;
				end;
			}
		}
		switch(select("�����̃W�^�[�o�O����","�L�����Z��")) {
		case 1:
			mes "[���i�C��]";
			mes "�킩������B";
			mes "���[�v�|�[�^�����J������";
			mes "�����Ă��傤�����B";
			next;
			mes "[���i�C��]";
			mes "���̎������[�v�͈�x�g����";
			mes "���ꂵ�Ă��玟��^ff0000�ߑO5���ȍ~^000000�ɂȂ�܂�";
			mes "������x�g�������o���Ȃ��́B";
			next;
			mes "[���i�C��]";
			mes "���ƁA�ߑO5���ȍ~�������Ƃ��Ă�";
			mes "�Ō�̓�������Ă���";
			mes "^ff00001����^000000�o�߂��Ă��Ȃ��ꍇ��";
			mes "�������[�v���g���Ȃ����璍�ӂ��Ȃ����B";
			next;
			switch(mdenter("jitterbug")) {
			case 0:
				cutin "lunain01.bmp", 255;
				set JTB_1QUE,0;
				setquest 13182;
				setquest 118906;
				delquest 116500;
				misceffect 316,"";
				misceffect 317,"";
				announce "�������A���_���W����[jitterbug] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " ("+strcharinfo(0)+")", 0x9, 0x00ff99;
				donpcevent getmdnpcname("jitter_control1")+ "::OnStart";
				close;
			case 1:	// �p�[�e�B�[������
				mes "�]�p�[�e�B�[���̂݁A";
				mes "�@�������A���_���W������";
				mes "�@���ꂷ�邱�Ƃ��ł��܂��]";
				close;
			case 2:
				mes "[���i�C��]";
				mes "^ff0000�p�[�e�B�[���[�_�[^000000��";
				mes "^ff0000�������[�v^000000���������ĂȂ���B";
				close2;
				cutin "lunain01.bmp", 255;
				end;
			default:	// ���̑��G���[
				close;
			}
		case 2:
			mes "[���i�C��]";
			mes "��߂�̂ˁB�킩������B";
			mes "�������ł�����܂����āB";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
	case 2:
		mes "[���i�C��]";
		mes "���̃_���W�����̖`�����A";
		mes "���Ȃ������Ă��Ȃ��ꏊ��";
		mes "�����N�����Ă����̂��A";
		mes "�ǂ�ȉ�b������Ă����̂�";
		mes "�C�ɂȂ�Ȃ��H";
		next;
		mes "[���i�C��]";
		mes "���̃��[�v�|�[�^�����g����";
		mes "���Ȃ����{�����Ȃ������ꏊ��";
		mes "�����Ă����邱�Ƃ��ł����B";
		next;
		mes "[���i�C��]";
		mes "�ڂ����͂킩��Ȃ�����";
		mes "^ff0000���̃_���W��������A���Ă��邽�т�^000000";
		mes "���̃��[�v�|�[�^����";
		mes "�s�悪�����Ă�̂�ˁc�c�B";
		next;
		while(1) {
			mes "[���i�C��]";
			mes "�����A���Ă݂����b��I��ŁB";
			mes "���̘b���s��ꂽ�ꏊ�A���Ԃ�";
			mes "�����Ă�����B";
			next;
			setarray '@menu$,"^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","^808080���J��^000000","";
			switch(JTB_COUNT) {
			case 10:
				if(JTB_2QUE == 7) {
					if(checkquest(116530) & 0x8)
						set '@menu$[10],"�H�H�H";
					else
						set '@menu$[10],"^ff0000�H�H�H^000000";
				}
				if(checkquest(116529) & 0x8)
					set '@menu$[9],"�����Ȃ��J";
				else
					set '@menu$[9],"^0000ff�����Ȃ��J^000000";
			case 9:
				if(checkquest(116528) & 0x8)
					set '@menu$[8],"���Ԉȏ���������H";
				else
					set '@menu$[8],"^0000ff���Ԉȏ���������H^000000";
			case 8:
				if(checkquest(116527) & 0x8)
					set '@menu$[7],"�s�v�c�ȋ��ʓ_";
				else
					set '@menu$[7],"^0000ff�s�v�c�ȋ��ʓ_^000000";
			case 7:
				if(checkquest(116526) & 0x8)
					set '@menu$[6],"�s���Ȉꌾ";
				else
					set '@menu$[6],"^0000ff�s���Ȉꌾ^000000";
			case 6:
				if(checkquest(116525) & 0x8)
					set '@menu$[5],"�V�������V�[�̍s��";
				else
					set '@menu$[5],"^0000ff�V�������V�[�̍s��^000000";
			case 5:
				if(checkquest(116524) & 0x8)
					set '@menu$[4],"���킳�ꂽ�_��";
				else
					set '@menu$[4],"^0000ff���킳�ꂽ�_��^000000";
			case 4:
				if(checkquest(116523) & 0x8)
					set '@menu$[3],"�L�m�R�̂����́H";
				else
					set '@menu$[3],"^0000ff�L�m�R�̂����́H^000000";
			case 3:
				if(checkquest(116522) & 0x8)
					set '@menu$[2],"�����X�^�[�̗�����";
				else
					set '@menu$[2],"^0000ff�����X�^�[�̗�����^000000";
			case 2:
				if(checkquest(116521) & 0x8)
					set '@menu$[1],"��q�Ǝt��";
				else
					set '@menu$[1],"^0000ff��q�Ǝt��^000000";
			case 1:
				if(checkquest(116520) & 0x8)
					set '@menu$[0],"�s���_�ȋ^�f";
				else
					set '@menu$[0],"^0000ff�s���_�ȋ^�f^000000";
			case 0:
				break;
			}
			set '@x,0;
			set '@y,0;
			set '@i,select(printarray('@menu$));
			switch('@i) {
			case 1:
				if(JTB_COUNT >= '@i) {
					set '@x,198;
					set '@y,28;
				}
				break;
			case 2:
				if(JTB_COUNT >= '@i) {
					set '@x,292;
					set '@y,37;
				}
				break;
			case 3:
				if(JTB_COUNT >= '@i) {
					set '@x,111;
					set '@y,112;
				}
				break;
			case 4:
				if(JTB_COUNT >= '@i) {
					set '@x,209;
					set '@y,103;
				}
				break;
			case 5:
				if(JTB_COUNT >= '@i) {
					set '@x,285;
					set '@y,111;
				}
				break;
			case 6:
				if(JTB_COUNT >= '@i) {
					set '@x,26;
					set '@y,198;
				}
				break;
			case 7:
				if(JTB_COUNT >= '@i) {
					set '@x,106;
					set '@y,195;
				}
				break;
			case 8:
				if(JTB_COUNT >= '@i) {
					set '@x,282;
					set '@y,191;
				}
				break;
			case 9:
				if(JTB_COUNT >= '@i) {
					set '@x,25;
					set '@y,277;
				}
				break;
			case 10:
				if(JTB_COUNT >= '@i) {
					set '@x,110;
					set '@y,278;
				}
				break;
			case 11:
				if(JTB_COUNT >= '@i) {
					set '@x,28;
					set '@y,374;
				}
				break;
			}
			if('@x > 0 && '@y > 0) {
				if('@i <= 10) {
					mes "[���i�C��]";
					mes "�킩������B";
					mes "���[�v�|�[�^�����J������";
					mes "�����Ă��傤�����B";
				} else {
					mes "[���i�C��]";
					mes "���c�c�B";
					next;
					mes "[���i�C��]";
					mes "��������c�c";
					mes "�����ɌĂ΂�Ă�悤�ȁA";
					mes "�s�v�c�ȗ͂��������B";
					next;
					mes "[���i�C��]";
					mes "���̊����c�c";
					mes "������������A���̎q��";
					mes "�Ă�ł�̂����m��Ȃ��B";
					next;
					cutin "lunain01.bmp", 0;
					mes "[���i�C��]";
					mes strcharinfo(0)+"�B";
					mes "�����Ƃ��Ȃ����Ă�ł�̂ˁB";
					next;
					mes "[���i�C��]";
					mes "���肢�A�������[�v�|�[�^�����J������";
					mes "���̎q�ɉ�ɍs���Ă����āB";
				}
				misceffect 316,"";
				misceffect 317,"";
				close2;
				cutin "lunain01.bmp", 255;
				warp "jtb_01.gat",'@x,'@y;
				end;
			}
			mes "[���i�C��]";
			mes "���߂�Ȃ����B";
			mes "���͂����ɑ���Ȃ��݂����B";
			next;
			mes "[���i�C��]";
			mes "���̃_���W������`�����Ă����";
			mes "������������A�s����悤��";
			mes "�Ȃ邩���m��Ȃ����B";
			next;
			continue;
		}
	case 3:
		mes "[���i�C��]";
		mes "��߂�̂ˁB�킩������B";
		mes "�������ł�����܂����āB";
		close2;
		cutin "lunain01.bmp", 255;
		end;
	}
OnInit:
	waitingroom "�����̃W�^�[�o�O", 0;
	end;
}

//==========================================
// NPC�A�����X�^�[�A���[�v�|�[�^���F����
//------------------------------------------
1@jtb.gat,0,1,0		script	jitter_control1	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("1�ԕ����o��#JTB");
	initnpctimer getmdnpcname("�j���I�[�Y#01");
	end;
}
1@jtb.gat,0,2,0		script	jitter_control2	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("2�ԕ����o��#JTB");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control2")+"::OnKilled";
	areamonster '@map$,111,23,116,25,"�y��",3069,3,'@label$;
	areamonster '@map$,120,16,122,21,"�y��",3069,2,'@label$;
	areamonster '@map$,127,32,131,34,"�y��",3069,3,'@label$;
	areamonster '@map$,114,42,116,43,"�y��",3069,2,'@label$;
	initnpctimer;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control2")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("1�ԕ����o��#JTB");
		hideoffnpc getmdnpcname("2�ԕ����o��#JTB");
		announce "�]��֐i�ޓ������ꂽ�B�쓌�̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	}
	end;
OnTimer3000:
	announce "�M���h�����o�[�̘b�ɂ��ƁA���̃_���W�����͔��ɋ�Ԃ��s����Ȃ悤���B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer6000:
	announce "�����̑S�Ă̓G��|���ƁA���̕����ւ̓�����������Ă��܂��炵���B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	announce "�p�[�e�B�[�����o�[�Ƃ͂���Ȃ��悤�A������������O�Ɉړ����悤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
}
1@jtb.gat,0,3,0		script	jitter_control3	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("3�ԕ����o��#JTB");
	hideonnpc getmdnpcname("�A�C�O#03");
	hideonnpc getmdnpcname("���i�C��#03");
	hideonnpc getmdnpcname("�H�H�H#03");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control3")+"::OnKilled";
	areamonster '@map$,200,27,202,31,"�y��",3069,3,'@label$;
	areamonster '@map$,206,42,217,46,"�y��",3069,5,'@label$;
	areamonster '@map$,212,22,214,24,"�y��",3069,6,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control3")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("2�ԕ����o��#JTB");
		//3�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("�A�C�O#03");
		hideoffnpc getmdnpcname("���i�C��#03");
		initnpctimer getmdnpcname("���i�C��#03");
	}
	end;
}

1@jtb.gat,45,47,0	script	1�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control2")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),100,14;
	end;
}

1@jtb.gat,135,17,0	script	2�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control3")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),184,17;
	end;
}

1@jtb.gat,220,23,0	script	3�ԕ����o��#JTB	45,2,2,{
OnTouch:
	switch(.Route) {
	case 1:
		donpcevent getmdnpcname("jitter_control4")+"::OnStart";
		warp getmdmapname("1@jtb.gat"),270,13;
		end;
	case 2:
		donpcevent getmdnpcname("jitter_control7")+"::OnStart";
		warp getmdmapname("1@jtb.gat"),183,128;
		end;
	}
}

//==========================================
// NPC�A�����X�^�[�A���[�v�|�[�^���F�Ȃ��炩�ȓ�
//------------------------------------------
1@jtb.gat,0,4,0		script	jitter_control4	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("4�ԕ����o��#JTB");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control4")+"::OnKilled";
	areamonster '@map$,286,17,289,20,"�y��",3069,5,'@label$;
	areamonster '@map$,286,37,289,40,"�y��",3069,5,'@label$;
	areamonster '@map$,300,38,304,40,"�y��",3069,5,'@label$;
	areamonster '@map$,300,17,304,20,"�y��",3069,5,'@label$;
	initnpctimer;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control4")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("3�ԕ����o��#JTB");
		hideoffnpc getmdnpcname("4�ԕ����o��#JTB");
		announce "�]��֐i�ޓ������ꂽ�B�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	}
	end;
}
1@jtb.gat,0,5,0		script	jitter_control5	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("5�ԕ����o��#JTB");
	hideonnpc getmdnpcname("���G��#05");
	hideonnpc getmdnpcname("�Q���J#05");
	hideonnpc getmdnpcname("�����f�B�[�W���b�N#05");
	hideonnpc getmdnpcname("�A�C�O#05");
	hideonnpc getmdnpcname("���i�C��#05");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control5")+"::OnKilled";
	areamonster '@map$,25,98,30,102,"�y��",3069,5,'@label$;
	areamonster '@map$,25,110,30,114,"�y��",3069,5,'@label$;
	areamonster '@map$,25,126,30,130,"�y��",3069,5,'@label$;
	areamonster '@map$,39,98,45,102,"�y��",3069,5,'@label$;
	areamonster '@map$,39,126,45,130,"�y��",3069,5,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control5")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("4�ԕ����o��#JTB");
		//5�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("�A�C�O#05");
		hideoffnpc getmdnpcname("���i�C��#05");
		initnpctimer getmdnpcname("���i�C��#05");
	}
	end;
}

1@jtb.gat,0,6,0		script	jitter_control6	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("6�ԕ����o��#JTB");
	hideonnpc getmdnpcname("���G��#06");
	hideonnpc getmdnpcname("�Q���J#06");
	hideonnpc getmdnpcname("���i�C��#06");
	hideonnpc getmdnpcname("�����f�B�[�W���b�N#06");
	hideonnpc getmdnpcname("�A�C�O#06");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control6")+"::OnKilled";
	areamonster '@map$,104,115,106,118,"�y��",3069,5,'@label$;
	areamonster '@map$,113,94,115,97,"�y��",3069,5,'@label$;
	areamonster '@map$,113,113,115,115,"�y��",3069,5,'@label$;
	areamonster '@map$,113,129,116,131,"�y��",3069,5,'@label$;
	areamonster '@map$,125,108,128,112,"�y��",3069,5,'@label$;
	areamonster '@map$,115,117,117,119,"p�E�W�^�[�o�O",3109,1,'@label$;
	initnpctimer;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control6")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("5�ԕ����o��#JTB");
		//6�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("���G��#06");
		hideoffnpc getmdnpcname("�Q���J#06");
		hideoffnpc getmdnpcname("���i�C��#06");
		hideoffnpc getmdnpcname("�����f�B�[�W���b�N#06");
		hideoffnpc getmdnpcname("�A�C�O#06");
		initnpctimer getmdnpcname("�A�C�O#06");
	}
	end;
OnTimer3000:
	announce "��͂�A���������ɋ�Ԃ��s����Ȃ悤���B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer6000:
	announce "�����̑S�Ă̓G��|���ƁA���̕����ւ̓�����������Ă��܂����낤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	announce "�p�[�e�B�[�����o�[�Ƃ͂���Ȃ��悤�A������������O�Ɉړ����悤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
}

1@jtb.gat,306,47,0	script	4�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control5")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),11,102;
	end;
}

1@jtb.gat,39,133,0	script	5�ԕ����o��#JTB	45,2,2,{
OnTouch:
	mes "�]����܂ł̐퓬�œ���";
	mes "�@�o�����炾�낤���A";
	mes "�@���������ł����C������]";
	close2;
	donpcevent getmdnpcname("jitter_control6")+"::OnStart";
	setquest 116509;
	compquest 116509;
	if(getonlinepartymember() == 1) {
		set '@base1,500000;
		set '@base2,0;
		set '@base3,0;
	}
	if(getonlinepartymember() == 2) {
		set '@base1,1000000;
		set '@base2,0;
		set '@base3,0;
	}
	if(getonlinepartymember() == 3) {
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,500000;
	}
	if(getonlinepartymember() >= 4) {
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
	}
	getexp '@base1,0,1;
	getexp '@base2,0,1;
	getexp '@base3,0,1;
	warp getmdmapname("1@jtb.gat"),96,100;
	end;
}

1@jtb.gat,133,106,0	script	6�ԕ����o��#JTB	45,2,2,{
OnTouch:
	mes "�]��������_���W�����̊O��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����")==1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	if(JTB_COUNT < 5)
		set JTB_COUNT,JTB_COUNT+1;
	delquest 13181;
	setquest 116507;
	compquest 116507;
	if(getonlinepartymember() == 1) {
		set '@base1,1000000;
		set '@base2,0;
		set '@base3,0;
	}
	if(getonlinepartymember() == 2) {
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,0;
	}
	if(getonlinepartymember() == 3) {
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,500000;
	}
	if(getonlinepartymember() >= 4) {
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
	}
	getexp '@base1,0,1;
	getexp '@base2,0,1;
	getexp '@base3,0,1;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// NPC�A�����X�^�[�A���[�v�|�[�^���F��������
//------------------------------------------
1@jtb.gat,0,7,0		script	jitter_control7	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("7�ԕ����o��#JTB");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control7")+"::OnKilled";
	areamonster '@map$,195,111,197,114,"�y��",3069,5,'@label$;
	areamonster '@map$,202,127,205,129,"�y��",3069,5,'@label$;
	areamonster '@map$,214,119,217,124,"�y��",3069,5,'@label$;
	areamonster '@map$,211,97,215,99,"�y��",3069,5,'@label$;
	areamonster '@map$,184,98,187,104,"�y��",3069,5,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control7")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("3�ԕ����o��#JTB");
		hideoffnpc getmdnpcname("7�ԕ����o��#JTB");
		announce "�]��֐i�ޓ������ꂽ�B�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	}
	end;
}

1@jtb.gat,0,8,0		script	jitter_control8	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("8�ԕ����o��#JTB");
	hideonnpc getmdnpcname("�H�H�H#08");
	hideonnpc getmdnpcname("���M#08");
	hideonnpc getmdnpcname("�j���I�[�Y#08");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control8")+"::OnKilled";
	areamonster '@map$,283,108,287,110,"�y��",3069,6,'@label$;
	areamonster '@map$,295,101,297,104,"�y��",3069,6,'@label$;
	areamonster '@map$,292,126,288,128,"�y��",3069,6,'@label$;
	areamonster '@map$,302,122,304,125,"�y��",3069,6,'@label$;
	areamonster '@map$,275,122,278,125,"�y��",3069,6,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control8")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("7�ԕ����o��#JTB");
		//8�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("�H�H�H#08");
		hideoffnpc getmdnpcname("���M#08");
		hideoffnpc getmdnpcname("�j���I�[�Y#08");
		initnpctimer getmdnpcname("�j���I�[�Y#08");
	}
	end;
}

1@jtb.gat,0,9,0		script	jitter_control9	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("9�ԕ����o��#JTB");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control9")+"::OnKilled";
	areamonster '@map$,363,106,365,108,"�V���M���O�E�y��",3070,4,'@label$;
	areamonster '@map$,385,106,387,109,"�V���M���O�E�y��",3070,4,'@label$;
	areamonster '@map$,385,128,387,130,"�V���M���O�E�y��",3070,4,'@label$;
	areamonster '@map$,353,127,356,129,"�V���M���O�E�y��",3070,4,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control9")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("8�ԕ����o��#JTB");
		hideoffnpc getmdnpcname("9�ԕ����o��#JTB");
		announce "�]��֐i�ޓ������ꂽ�B�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	}
	end;
}

1@jtb.gat,0,10,0		script	jitter_control10	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("10�ԕ����o��#JTB");
	hideonnpc getmdnpcname("�V�������V�[#10");
	hideonnpc getmdnpcname("�j���I�[�Y#10");
	hideonnpc getmdnpcname("�~���~��#10");
	hideonnpc getmdnpcname("�A����#10");
	hideonnpc getmdnpcname("���G��#10");
	hideonnpc getmdnpcname("���i�C��#10");
	hideonnpc getmdnpcname("���e���g#10");
	hideonnpc getmdnpcname("�Q���J#10");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control10")+"::OnKilled";
	areamonster '@map$,26,217,29,218,"�X�C���O�E�y��",3071,4,'@label$;
	areamonster '@map$,38,208,41,212,"�X�C���O�E�y��",3071,4,'@label$;
	areamonster '@map$,29,194,33,196,"�X�C���O�E�y��",3071,4,'@label$;
	areamonster '@map$,18,186,21,189,"�X�C���O�E�y��",3071,4,'@label$;
	areamonster '@map$,40,184,44,187,"�X�C���O�E�y��",3071,4,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control10")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("9�ԕ����o��#JTB");
		//10�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("�V�������V�[#10");
		hideoffnpc getmdnpcname("�j���I�[�Y#10");
		initnpctimer getmdnpcname("�j���I�[�Y#10");
	}
	end;
}

1@jtb.gat,0,11,0		script	jitter_control11	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("11�ԕ����o��#JTB");
	hideonnpc getmdnpcname("�V�������V�[#11");
	hideonnpc getmdnpcname("���G��#11");
	hideonnpc getmdnpcname("���i�C��#11");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control11")+"::OnKilled";
	areamonster '@map$,109,205,111,208,"�L�X�~�[�E�y��",3072,5,'@label$;
	areamonster '@map$,122,213,124,215,"�L�X�~�[�E�y��",3072,5,'@label$;
	areamonster '@map$,114,189,118,192,"�L�X�~�[�E�y��",3072,5,'@label$;
	areamonster '@map$,122,192,126,203,"�L�X�~�[�E�y��",3072,5,'@label$;
	areamonster '@map$,101,184,103,188,"�L�X�~�[�E�y��",3072,5,'@label$;
	areamonster '@map$,115,195,125,210,"f�E�W�^�[�o�O",3108,1,'@label$;
	initnpctimer;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control11")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("10�ԕ����o��#JTB");
		//11�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("�V�������V�[#11");
		hideoffnpc getmdnpcname("���G��#11");
		hideoffnpc getmdnpcname("���i�C��#11");
		initnpctimer getmdnpcname("���i�C��#11");
	}
	end;
OnTimer3000:
	announce "��͂�A���������ɋ�Ԃ��s����Ȃ悤���B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer6000:
	announce "�����̑S�Ă̓G��|���ƁA���̕����ւ̓�����������Ă��܂����낤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer9000:
	stopnpctimer;
	announce "�p�[�e�B�[�����o�[�Ƃ͂���Ȃ��悤�A������������O�Ɉړ����悤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
}

1@jtb.gat,0,12,0		script	jitter_control12	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("12�ԕ����o��#JTB");
	hideonnpc getmdnpcname("�A�C�O#12");
	hideonnpc getmdnpcname("�A����#12");
	hideonnpc getmdnpcname("���M#12");
	hideonnpc getmdnpcname("���i�C��#12");
	hideonnpc getmdnpcname("���G��#12");
	hideonnpc getmdnpcname("�~���~��#12");
	hideonnpc getmdnpcname("�Q���J#12");
	hideonnpc getmdnpcname("�����f�B�[�W���b�N#12");
	hideonnpc getmdnpcname("�V�������V�[#12");
	hideonnpc getmdnpcname("�j���I�[�Y#12");
	hideonnpc getmdnpcname("���e���g#12");
	hideonnpc getmdnpcname("�y��#12a");
	hideonnpc getmdnpcname("�y��#12b");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control12")+"::OnKilled";
	areamonster '@map$,183,192,187,196,"�y��",3069,2,'@label$;
	areamonster '@map$,183,192,187,196,"�V���M���O�E�y��",3070,2,'@label$;
	areamonster '@map$,183,192,187,196,"�X�C���O�E�y��",3071,2,'@label$;
	areamonster '@map$,183,192,187,196,"�L�X�~�[�E�y��",3072,2,'@label$;
	areamonster '@map$,202,199,205,203,"�y��",3069,2,'@label$;
	areamonster '@map$,202,199,205,203,"�V���M���O�E�y��",3070,2,'@label$;
	areamonster '@map$,202,199,205,203,"�X�C���O�E�y��",3071,2,'@label$;
	areamonster '@map$,202,199,205,203,"�L�X�~�[�E�y��",3072,2,'@label$;
	areamonster '@map$,200,211,204,213,"�y��",3069,2,'@label$;
	areamonster '@map$,200,211,204,213,"�V���M���O�E�y��",3070,2,'@label$;
	areamonster '@map$,200,211,204,213,"�X�C���O�E�y��",3071,2,'@label$;
	areamonster '@map$,200,211,204,213,"�L�X�~�[�E�y��",3072,2,'@label$;
	areamonster '@map$,210,187,213,190,"�y��",3069,2,'@label$;
	areamonster '@map$,210,187,213,190,"�V���M���O�E�y��",3070,2,'@label$;
	areamonster '@map$,210,187,213,190,"�X�C���O�E�y��",3071,2,'@label$;
	areamonster '@map$,210,187,213,190,"�L�X�~�[�E�y��",3072,2,'@label$;
	areamonster '@map$,210,211,213,213,"�y��",3069,2,'@label$;
	areamonster '@map$,210,211,213,213,"�V���M���O�E�y��",3070,2,'@label$;
	areamonster '@map$,210,211,213,213,"�X�C���O�E�y��",3071,2,'@label$;
	areamonster '@map$,210,211,213,213,"�L�X�~�[�E�y��",3072,2,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control12")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("11�ԕ����o��#JTB");
		//12�ԕ���NPC�ɂ�hideoff
		hideoffnpc getmdnpcname("�A�C�O#12");
		hideoffnpc getmdnpcname("�A����#12");
		hideoffnpc getmdnpcname("���M#12");
		hideoffnpc getmdnpcname("���i�C��#12");
		hideoffnpc getmdnpcname("���G��#12");
		hideoffnpc getmdnpcname("�~���~��#12");
		hideoffnpc getmdnpcname("�Q���J#12");
		hideoffnpc getmdnpcname("�����f�B�[�W���b�N#12");
		hideoffnpc getmdnpcname("�V�������V�[#12");
		hideoffnpc getmdnpcname("�j���I�[�Y#12");
		hideoffnpc getmdnpcname("���e���g#12");
		initnpctimer getmdnpcname("���e���g#12");
	}
	end;
}

1@jtb.gat,0,9,0		script	jitter_control21	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("�g���l�������o��#JTB");
	hideonnpc getmdnpcname("�j���I�[�Y#21");
	hideonnpc getmdnpcname("���e���g#23");
	hideonnpc getmdnpcname("�Q���J#23");
	hideonnpc getmdnpcname("�~���~��#23");
	hideonnpc getmdnpcname("�A�C�O#23");
	hideonnpc getmdnpcname("���M#23");
	hideonnpc getmdnpcname("�A����#23");
	hideonnpc getmdnpcname("���i�C��#23");
	hideonnpc getmdnpcname("���G��#23");
	hideonnpc getmdnpcname("�����f�B�[�W���b�N#23");
	hideonnpc getmdnpcname("�V�������V�[#23");
	hideonnpc getmdnpcname("�y��#23");
	hideonnpc getmdnpcname("�y��#25");
	hideonnpc getmdnpcname("�j���I�[�Y#boss");
	initnpctimer getmdnpcname("�j���I�[�Y#22");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control21")+"::OnKilled";
	areamonster '@map$,287,293,290,295,"�y��",3069,5,'@label$;
	areamonster '@map$,296,293,299,295,"�y��",3069,5,'@label$;
	areamonster '@map$,304,293,309,295,"�V���M���O�E�y��",3070,5,'@label$;
	areamonster '@map$,315,293,320,295,"�V���M���O�E�y��",3070,5,'@label$;
	areamonster '@map$,356,322,359,325,"�X�C���O�E�y��",3071,5,'@label$;
	areamonster '@map$,356,331,359,334,"�X�C���O�E�y��",3071,5,'@label$;
	areamonster '@map$,356,348,359,351,"�L�X�~�[�E�y��",3072,5,'@label$;
	areamonster '@map$,351,356,355,359,"�L�X�~�[�E�y��",3072,5,'@label$;
	end;
OnKilled:
	set 'count,getmapmobs(getmdmapname("1@jtb.gat"),getmdnpcname("jitter_control21")+ "::OnKilled");
	if('count <= 0) {
		hideonnpc getmdnpcname("12�ԕ����o��#JTB");
		hideoffnpc getmdnpcname("�g���l�������o��#JTB");
		hideoffnpc getmdnpcname("�j���I�[�Y#21");
	}
	end;
}

1@jtb.gat,0,22,0		script	jitter_control22	-1,{
OnStart:
	if('flag)
		end;
	set 'flag,1;
	hideonnpc getmdnpcname("23�ԕ����o��#JTB");
	hideonnpc getmdnpcname("�V�������V�[#22");
	hideonnpc getmdnpcname("�y��#23");
	hideonnpc getmdnpcname("�j���I�[�Y#22");
	hideoffnpc getmdnpcname("�j���I�[�Y#boss");
	set '@map$,getmdmapname("1@jtb.gat");
	set '@label$,getmdnpcname("jitter_control22")+"::OnKilled";
	set 'boss, callmonster('@map$,324,327,"fff�E�W�^�[�o�O",3073,'@label$);
	areamonster '@map$,322,315,325,318,"�y��",3069,5;
	initnpctimer;
	end;
OnKilled:
	stopnpctimer;
	hideonnpc getmdnpcname("21�ԕ����o��#JTB");
	//END����NPC�ɂ�hideoff
	hideoffnpc getmdnpcname("���e���g#23");
	hideoffnpc getmdnpcname("�Q���J#23");
	hideoffnpc getmdnpcname("�~���~��#23");
	hideoffnpc getmdnpcname("�A�C�O#23");
	hideoffnpc getmdnpcname("���M#23");
	hideoffnpc getmdnpcname("�A����#23");
	hideoffnpc getmdnpcname("���i�C��#23");
	hideoffnpc getmdnpcname("���G��#23");
	hideoffnpc getmdnpcname("�����f�B�[�W���b�N#23");
	hideoffnpc getmdnpcname("�V�������V�[#23");
	hideoffnpc getmdnpcname("�y��#25");
	hideonnpc getmdnpcname("�j���I�[�Y#boss");
	hideoffnpc getmdnpcname("�j���I�[�Y#23");
	initnpctimer getmdnpcname("�j���I�[�Y#23");
	end;
OnTimer3000:
	announce "��͂�A���������ɋ�Ԃ��s����Ȃ悤���B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer6000:
	announce "fff�E�W�^�[�o�O��|���ƁA���̕����ւ̓�����������Ă��܂����낤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer9000:
	announce "�p�[�e�B�[�����o�[�Ƃ͂���Ȃ��悤�A������������O�Ɉړ����悤�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer16000:
	areamonster getmdmapname("1@jtb.gat"),328,322,331,327,"�V���M���O�E�y��",3070,5;
	end;
OnTimer23000:
	areamonster getmdmapname("1@jtb.gat"),318,336,323,339,"�X�C���O�E�y��",3071,5;
	end;
OnTimer30000:
	areamonster getmdmapname("1@jtb.gat"),313,322,317,327,"�L�X�~�[�E�y��",3072,5;
	end;
}

1@jtb.gat,209,133,0	script	7�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control8")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),277,95;
	end;
}

1@jtb.gat,307,122,0	script	8�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control9")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),359,97;
	end;
}

1@jtb.gat,386,133,0	script	9�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control10")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),13,214;
	end;
}

1@jtb.gat,49,196,0	script	10�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control11")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),95,201;
	end;
}

1@jtb.gat,133,197,0	script	11�ԕ����o��#JTB	45,2,2,{
OnTouch:
	mes "�]����܂ł̐퓬�œ���";
	mes "�@�o�����炾�낤���A";
	mes "�@���������ł����C������B�]";
	close2;
	donpcevent getmdnpcname("jitter_control12")+"::OnStart";
	setquest 116509;
	compquest 116509;
	set '@base3,0;
	set '@base4,0;
	set '@base5,0;
	set '@base6,0;
	set '@base7,0;
	set '@job2,0;
	set '@job3,0;
	set '@job4,0;
	switch(getonlinepartymember()) {
	case 1:
		set '@base1,1000000;
		set '@base2,500000;
		set '@job1,750000;
		break;
	case 2:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@job1,1000000;
		break;
	case 3:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,500000;
		set '@job1,1000000;
		set '@job2,250000;
		break;
	case 4:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@job1,1000000;
		set '@job2,500000;
		break;
	case 5:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,500000;
		set '@job1,1000000;
		set '@job2,750000;
		break;
	case 6:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		break;
	case 7:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,250000;
		break;
	case 8:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,500000;
		break;
	case 9:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,750000;
		break;
	case 10:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		break;
	case 11:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@base7,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		set '@job4,250000;
		break;
	case 12:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@base7,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		set '@job4,500000;
		break;
	}
	getexp '@base1,0,1;
	getexp '@base2,0,1;
	getexp '@base3,0,1;
	getexp '@base4,0,1;
	getexp '@base5,0,1;
	getexp '@base6,0,1;
	getexp '@base7,0,1;
	getexp 0,'@job1,1;
	getexp 0,'@job2,1;
	getexp 0,'@job3,1;
	getexp 0,'@job4,1;
	warp getmdmapname("1@jtb.gat"),181,198;
	end;
}

1@jtb.gat,218,203,0	script	12�ԕ����o��#JTB	45,2,2,{
OnTouch:
	donpcevent getmdnpcname("jitter_control21")+"::OnStart";
	warp getmdmapname("1@jtb.gat"),287,355;
	end;
}

1@jtb.gat,311,358,0	script	�g���l�������o��#JTB	45,2,2,{
OnTouch:
	warp getmdmapname("1@jtb.gat"),335,320;
	end;
}

//==========================================
// MD�o���F��������
//------------------------------------------
1@jtb.gat,391,30,0	script	23�ԕ����o��#JTB	45,2,2,{
	if(!checkquest(116500)) {
		switch(JTB_2QUE) {
		case 0:
			mes "�]�N���̐�����������]";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���M�N�A������Ƃ��������H";
			next;
			cutin "ragi03.bmp", 2;
			mes "[���M]";
			mes "�Ȃ�ł��傤���H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���͌N�ɂ��肢������񂾁B";
			mes "���̌�A��������";
			mes "�t�������Ă���Ȃ����ȁH";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�����A�\���܂����B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes strcharinfo(0) + "�ɂ�";
			mes "�b���������񂾂���";
			mes "�ǂ��ɂ��邩�ȁ`�c�c�B";
			next;
			cutin "nines01.bmp", 255;
			mes "�]�j���I�[�Y���������k�������悤���B";
			mes "�@�ڂ����b�𕷂��ׂ����낤���H�]";
			next;
			if(select("�b�𕷂��ɍs��","�b�𕷂��ɍs���Ȃ�") == 1) {
				mes "�]�j���I�[�Y�̏��֍s���Ă݂悤�]";
				close;
			}
			break;
		case 1:
			mes "�]�N���̐�����������]";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "�~���~���c�c�B";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "����A�ǂ������́H";
			mes "���������C���Ȃ�����Ȃ��B";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "����A���͑��k��������������񂾁B";
			mes "�~���~���͓����ǂ���";
			mes "����������@��";
			mes "�m��Ȃ����Ȃ��Ďv���āc�c�B";
			next;
			mes "[�A����]";
			mes "�c�c�{����";
			mes strcharinfo(0) + "�ɂ�";
			mes "���k�������񂾂���";
			mes "�Z�����������c�c�B";
			next;
			cutin "arang01.bmp", 255;
			mes "�]�A�������������k�������悤���B";
			mes "�@�ڂ����b�𕷂��ׂ����낤���H�]";
			next;
			if(select("�b�𕷂��ɍs��","�b�𕷂��ɍs���Ȃ�") == 1) {
				mes "�]�A�����̏��֍s���Ă݂悤�]";
				close;
			}
			break;
		case 2:
			mes "�]�N���̐�����������]";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "����Ŗ`���I���c�c�B";
			mes "�l�͉����A�݂Ȃ���̂�����";
			mes "���Ă��̂ł��傤���c�c�B";
			next;
			cutin "gelca03.bmp", 2;
			mes "[�Q���J]";
			mes "�ӂ��ӂ��Ӂ`�B";
			mes "���������Ⴂ�܂�����I";
			mes "���Y�݂̂悤�ł��ˁA���G���N�B";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�Q���J����!?";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "���̃��G���N�ɑ���Ȃ����́B";
			mes "����͕K�E�Z�ł��I";
			mes "�Ƃ����킯�ŁA���̌㎄�ƈꏏ��";
			mes "�K�E�Z�̗��K�����܂��񂩁H";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�K�E�Z�c�c�ł����H";
			mes "�悭�킩��܂��񂪁A";
			mes "�݂Ȃ���̂����ɂ��Ă�Ȃ�";
			mes "���肢���܂��I";
			next;
			cutin "roel01.bmp", 255;
			mes "�]���G���ƃQ���J��";
			mes "�@�K�E�Z�̗��K������炵���B";
			mes "�@��l�̃V�������V�[�ɑ΂���";
			mes "�@�C�����𕷂��o��";
			mes "�@�`�����X��������Ȃ��]";
			next;
			if(select("�b�𕷂��ɍs��","�b�𕷂��ɍs���Ȃ�") == 1) {
				mes "�]���G���̏��֍s���Ă݂悤�]";
				close;
			}
			break;
		case 3:
			mes "�]�N���̐�����������]";
			next;
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "���i�C���c�c�B";
			mes "���v�Ȃ́H";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���A�����H";
			next;
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "�����A�����߂������Ȃ́c�c�B";
			mes "���ɂ��������������Ȃ́c�c�B";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "����Ȏ��Ȃ����B";
			mes "���͂����ʂ�B";
			mes "�j���I�[�Y�l�ɂ������";
			mes "�ނ���A���������炢��B";
			next;
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "�ł��c�c�B";
			next;
			cutin "igu04.bmp", 255;
			mes "�]�A�C�O�ƃ��i�C����";
			mes "�@�����b���Ă���悤���B";
			mes "�@��l�̃V�������V�[�ɑ΂���";
			mes "�@�C�����𕷂��o��";
			mes "�@�`�����X��������Ȃ��]";
			next;
			if(select("�b�𕷂��ɍs��","�b�𕷂��ɍs���Ȃ�") == 1) {
				mes "�]�A�C�O�̏��֍s���Ă݂悤�]";
				close;
			}
			break;
		case 4:
			mes "�]�N���̐�����������]";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�ӂ��B";
			mes "�M���h�}�X�^�[��";
			mes "�y����˂��ȁB";
			next;
			cutin "rote01.bmp", 255;
			mes "�]���e���g����l�ɂȂ����B";
			mes "�@�݂�Ȃ��畷����";
			mes "�@�V�������V�[�ɑ΂���C������";
			mes "�@���e���g�ɓ`����";
			mes "�@�`�����X��������Ȃ��]";
			next;
			if(select("�b�𕷂��ɍs��","�b�𕷂��ɍs���Ȃ�") == 2) {
				mes "�]���e���g�̏��֍s���Ă݂悤�]";
				close;
			}
			break;
		case 5:
			break;
		case 6:
			break;
		default:
			break;
		}
	}
	mes "�]��������_���W�����̊O��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	compquest 13181;
	setquest 13183;
	compquest 13183;
	setquest 116508;
	compquest 116508;
	set '@base4,0;
	set '@base5,0;
	set '@base6,0;
	set '@base7,0;
	set '@base8,0;
	set '@job3,0;
	set '@job4,0;
	switch(getonlinepartymember()) {
	case 1:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,500000;
		set '@job1,1000000;
		set '@job2,250000;
		break;
	case 2:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@job1,1000000;
		set '@job2,500000;
		break;
	case 3:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,500000;
		set '@job1,1000000;
		set '@job2,750000;
		break;
	case 4:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		break;
	case 5:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,250000;
		break;
	case 6:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,500000;
		break;
	case 7:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,750000;
		break;
	case 8:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		break;
	case 9:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@base7,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		set '@job4,250000;
		break;
	case 10:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@base7,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		set '@job4,500000;
		break;
	case 11:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@base7,1000000;
		set '@base8,500000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		set '@job4,750000;
		break;
	case 12:
		set '@base1,1000000;
		set '@base2,1000000;
		set '@base3,1000000;
		set '@base4,1000000;
		set '@base5,1000000;
		set '@base6,1000000;
		set '@base7,1000000;
		set '@base8,1000000;
		set '@job1,1000000;
		set '@job2,1000000;
		set '@job3,1000000;
		set '@job4,1000000;
		break;
	}
	getexp '@base1,0,1;
	getexp '@base2,0,1;
	getexp '@base3,0,1;
	getexp '@base4,0,1;
	getexp '@base5,0,1;
	getexp '@base6,0,1;
	getexp '@base7,0,1;
	getexp '@base8,0,1;
	getexp 0,'@job1,1;
	getexp 0,'@job2,1;
	getexp 0,'@job3,1;
	getexp 0,'@job4,1;
	if(BaseLevel >= 180 && BaseLevel <= 199) {
		getexp (NextBaseExp / 100 * 2),0,0;
		unittalk getcharid(0), strcharinfo(0)+ ": -Base�o���l2%��ǉ��Ŋl�����܂���-",1;
	}
	getitem 6719,1;
	if(JTB_COUNT < 10)
		set JTB_COUNT,JTB_COUNT+1;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// 1�ԕ���NPC�F����
//------------------------------------------
1@jtb.gat,25,28,5	script	���e���g#01	630,{
	if(JTB_1QUE <= 0) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���H�@���O���Վ��̃M���h�����B";
		mes "���C������̂͂������A";
		mes "���̎ז������͂���Ȃ�B";
		close2;
		cutin "rote01.bmp", 255;
		end;
	} else {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�`�b�I";
		mes "���Ȃ񂾂��̃_���W�����́A";
		mes "����ł��Z�ݒ����Ă��₪��̂��H";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}

1@jtb.gat,31,28,4	script	�A�C�O#01	646,{
	if(JTB_1QUE <= 0) {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���Ȃ��炾�ˁH";
		mes "��낵���Ȃ́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�j���I�[�Y�͑��ς�炸�Ȃ́B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,23,26,5	script	�Q���J#01	629,{
	if(JTB_1QUE <= 0) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�V�l����ł����H";
		mes "��낵�����肢���܂��I";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	} else {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���̎׈��ȋC�c�c";
		mes "���Ȃ�ł��傤���H";
		mes "�׈��Ȃ�ł����ǁA";
		mes "���ӂ͊����Ȃ���ł��B";
		mes "�s�v�c�ł���ˁI";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}

1@jtb.gat,33,26,4	script	���M#01	647,{
	if(JTB_1QUE <= 0) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�N�͐V�l����ł����H";
		mes "�l�̓��M�B";
		mes "��낵�����肢���܂��˂��B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	} else {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�s�v�c�ȑ̌������܂����˂��B";
		mes "�����A���̋C�������̂ɂ�����";
		mes "�Ȃ��Ă��܂����悧�B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
}

1@jtb.gat,25,24,5	script	�~���~��#01	643,{
	if(JTB_1QUE <= 0) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���Ȃ����Վ��̃M���h���ˁH";
		mes "��낵���B";
		close2;
		cutin "min01.bmp", 255;
		end;
	} else {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����ȏꏊ�ɕ��R�ƌĂяo���Ȃ��";
		mes "�j���I�[�Y�͑��ς�炸�ˁc�c�B";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
}

1@jtb.gat,31,24,4	script	�A����#01	644,{
	if(JTB_1QUE <= 0) {
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "����ɂ��́I";
		mes "���̓A�������Ă����񂾁I";
		close2;
		cutin "arang01.bmp", 255;
		end;
	} else {
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�فA�{���ɗH�삾������";
		mes "�ǂ����悤�c�c�B";
		mes "�H��|���ȁc�c�B";
		close2;
		cutin "arang01.bmp", 255;
		end;
	}
}

1@jtb.gat,23,22,5	script	���i�C��#01	10039,{
	if(JTB_1QUE <= 0) {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "����A�����̂ˁB";
		mes "�Z���Ԃ����ǂ�낵���ˁB";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	} else {
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "���A���ꂪ�{���̃j���I�[�Y�l�I";
		mes "����Ɖ���c�c�B";
		mes "�j���I�[�Y�l�ɓ����";
		mes "�M���h�ɓ������b�オ��������B";
		close2;
		cutin "lunain02.bmp", 255;
		end;
	}
}

1@jtb.gat,34,22,4	script	���G��#01	10040,{
	if(JTB_1QUE <= 0) {
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�ꏏ�ɂ���΂�܂��傤�I";
		mes "��낵�����肢���܂��I";
		close2;
		cutin "rote01.bmp", 255;
		end;
	} else {
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�j���I�[�Y�l�c�c";
		mes "���߂Ă�����܂�����";
		mes "�{���Ƀ��e���g�l��";
		mes "�����ǂ���ł��ˁI";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}

1@jtb.gat,28,21,5	script	�����f�B�[�W���b�N#01	844,{
	if(JTB_1QUE <= 0) {
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�ʓ|���ȁB";
		mes "�B��Ă���̂��킩��Ȃ��̂��H";
		close;
	} else {
		mes "[�����f�B�[�W���b�N]";
		mes "���āA���Ȕy������悤����";
		mes "���͎��̎d�������邾�����B";
		mes "�z�Ƃ̖񑩂̂��߂ɂȁB";
		close;
	}
}

1@jtb.gat,28,30,5	script	�j���I�[�Y#01	625,{
	if(JTB_1QUE <= 0) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116507) || checkquest(116508))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,1;
				hideoffnpc getmdnpcname("1�ԕ����o��#JTB");
				announce "�]�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				mes "�]���Ȃ��͋L����T��Ȃ���";
				mes "�@����}�����Ƃɂ����]";
				close;
			}
		}
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�M���h����8�ԂɊ�Â��A";
		mes "�M���h�}�X�^�[�͂��̉����I";
		mes "���̂��O�̓M���h�����o�[��";
		mes "�����[�ł����Ȃ��I";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���A�����Ȃ́H";
		mes "���Ⴀ�A���e������";
		mes "�V�}�X�^�[�Ȃ񂾂ˁB";
		next;
		mes "[�j���I�[�Y]";
		mes "��낵���ˁA�V�}�X�^�[�B";
		mes "���߂܂��Ă݂̂�Ȃ�";
		mes "���ꂩ���낵���ˁ`�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���O�c�c���ɂȂɂ��������Ƃ�A";
		mes "�v�����Ƃ͂Ȃ��̂���!?";
		next;
		mes "[���e���g]";
		mes "�M���h�}�X�^�[�̂����ɘA�����񂱂���";
		mes "�����Ȃ�A�����Ă����Ǝv������";
		mes "�ʔ����ꏊ������������A";
		mes "�݂�Ȃŗ�������!?";
		mes "�ӂ������!!";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂񂲂߂�B";
		mes "���΂ɋ}���������ȂƎv�����񂾂���";
		mes "���e�Ȃ炫���Ɨ��Ă�������";
		mes "�M���Ă�����ˁ�";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�B���A���O�ȁc�c�B";
		next;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�ӂӁA���͖{���ʕ�҂���`�I";
		mes "�������̂��Ƃ�S�z���Ă����";
		mes "���肪�Ƃ��ˁA���e���g��";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���A�Ⴄ!!";
		mes "���͕ʂɂ��O��S�z��";
		mes "�����킯����Ȃ�!!";
		mes "�~���~����V�l�����o�[�����ȁc�c�B";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���[��A���ƐV�l�̂����ɂ���ȂƂ�";
		mes "���Ȃ��Ƃ͌���Ȃ����ǁA";
		mes "�ǂ��������͂낭�Ȃ��̂�";
		mes "�H�ׂĂȂ��͂������Č����āA";
		mes "�ɂ����ʂɔ����Ă����̂�";
		mes "�ǂ��̒N������ˁB";
		next;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����͖{������!?";
		mes "�ɂ��Ȃ�āA�v���Ԃ肾��`�I";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A�����R�����Ă�";
		mes "�d���Ȃ��ł���B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�t������ʂ̂ɂ���1�l��";
		mes "�����A���Ă����̂�";
		mes "�s�v�c��������ł���ˁ`�I";
		mes "�~���~������̂��b�𕷂��āA";
		mes "�[�����܂����I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Q���J�I";
		mes "�]�v�Ȃ��Ƃ͌����ȁI";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�ق�A����ł킩�����ł���H";
		mes "���e���g�͖{���ɂ��񂽂̂��Ƃ�";
		mes "�S�z���Ă�̂�B";
		next;
		mes "[�~���~��]";
		mes "���ɏo��ȂƂ͂���Ȃ����ǁA";
		mes "���e���g���炢�ɂ�";
		mes "�A�����Ă����Ȃ�����ˁB";
		next;
		mes "[�~���~��]";
		mes "���񂽂̂��Ƃ�S�z����b���A";
		mes "�������������";
		mes "�������̐g�ɂ��Ȃ��Ăق�����B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "��������[�I";
		mes "����Ƀ��e���g�A�S�z��������";
		mes "�X峂Ԃ����悤�Ȋ�ɂȂ��Ă�";
		mes "�|���񂾂�[�H";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�A�����A���O�܂�";
		mes "����Ȃ��Ƃ����̂���c�c�B";
		next;
		mes "[���e���g]";
		mes "�͂��c�c���̖�����";
		mes strcharinfo(0)+ "����";
		mes "�̂悤���ȁc�c�B";
		next;
		if(select("���e���g�̓c���f���Ȃ�ł���","�݂Ȃ���A�����ǂ���ł��ˁB") == 1) {
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c���f��!?";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "����A�悭�킩���Ă邶��Ȃ��B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�Ⴄ��`�I";
			mes "���e�̓e�����Ȃ��������";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "���O��Ȃ��c�c�B";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���܂�{��Ƃ��킪�������H";
			mes "���e���g�B";
		} else {
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�܂��A�m���ɒ��͈����ˁ[�ȁc�c�B";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "���e���g�ȊO�̊F�́A�ˁB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "!?";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "��k��B";
		}
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�N�\�b�I�@���͕��������c�c�B";
		mes "����Ńj���I�[�Y�B";
		mes "���̓��A�͂Ȃ�Ȃ�!?";
		mes "�����ɋ��邾���Ŗ���";
		mes "���������Ȃ��c�c�B";
		next;
		mes "[���e���g]";
		mes "�N���ɂ����ƌ����Ă���݂������B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "���݂̂�Ȃ����̓��A�̋�C�̂�����";
		mes "�Ȃ񂾂����C���Ȃ��ˁc�c�B";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�����ˁA���̓��A�͕��ʂ���Ȃ��B";
		mes "��������������ɖ߂낤�Ƃ�����A";
		mes "�s�v�c�ȗ͂ł݂��";
		mes "�o���o���ɂ��ꂽ���B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ�Ƃ��������Ă܂��W�܂ꂽ�̂�";
		mes "��Ղ��ȁB";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "���́A�t�������邩�畽�C�ł����ǁI";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�������ˁI";
		mes "�ł����ꂾ������Ȃ��񂾂�I";
		mes "���̓��A�ɂ͎������ȊO��";
		mes "��������݂����Ȃ񂾁B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�����A�������ĉ���!?";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����H";
		mes "���e�A�N�ɂ͕������Ȃ������H";
		mes "����������A����������";
		mes "�Ă�ł���悤�Ȃ񂾂��ǁB";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�c�c���A������Ă܂����B";
		next;
		cutin "arang02.bmp", 2;
		mes "[�A����]";
		mes "�H��c�c�H";
		next;
		cutin "arang01.bmp", 255;
		mes "[�H�H�H]";
		mes "�H����āc�c���H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�ȁA�Ȃ�!?";
		mes "���ɒ��ڐ����c�c�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���A���e�ɂ����������񂾂ˁ`�B";
		mes "�ǂ������ǂ������I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�e���F�F�F�F�F�b�I";
		mes "�����������Ƃ͑����������I";
		next;
		cutin "nines04.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�`�c�c";
		mes "����Ȃɋ݂�͂ނƋꂵ����`�H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���O�͈�x������";
		mes "�I�[�f�B���̓z�ɂł�";
		mes "����Ă����ׂ������Ȃ�!?";
		next;
		cutin "rote01.bmp", 255;
		mes "[�H�H�H]";
		mes "�c�c���߁B";
		misceffect 563,"";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c!!";
		mes "�n�k�Ȃ́I�@�݂�ȋC��t���āI";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "�t���I�@�����׈��ȋC�������܂��I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�N�\�b�I�@�Ƃɂ����o����T�����I";
		mes "�����͉������o�C����������I";
		mes "�퓬�̏����͑ӂ�Ȃ�I";
		set JTB_1QUE,1;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			hideoffnpc getmdnpcname("1�ԕ����o��#JTB");
			announce "�]�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		}
		close2;
		cutin "rote01.bmp", 255;
		end;
	} else {
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�����A�`���̂͂��܂肾�I";
		mes "���N���N����ˁI";
		close2;
		cutin "nines01.bmp", 255;
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			announce "�]�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

//==========================================
// 3�ԕ���NPC�F����
//------------------------------------------
1@jtb.gat,205,31,4	script	�H�H�H#03	10041,{
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "��A�g�����c�c�B";
	close2;
	cutin "shaloshi01.bmp", 255;
	end;
}

1@jtb.gat,200,28,5	script	�A�C�O#03	646,{
	if(JTB_1QUE <= 1) {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�������̐퓬�ł݂�Ȃ�";
		mes "�͂��ꂿ������́c�c�B";
		mes "�Ȃ�Ƃ����i�C���ƍ����ł�������";
		mes "�����݂�Ȃ������Ȃ��ƂȂ́c�c�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���̎q�A�ǂ����痈���񂾂낤�H";
		mes "�s�v�c�Ȏq�����ǁc�c";
		mes "�܂��͈��S�ȏ���";
		mes "�A��čs���Ă�����́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,203,28,4	script	���i�C��#03	10039,{
	if(JTB_1QUE <= 1) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116507) || checkquest(116508))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				while(1) {
					mes "�]�ǂ���̓��ɐi�����H�]";
					next;
					switch(select("�����l����","^0000ff�Ȃ��炩�ȓ�^000000","^ff0000��������(BaseLv120�ȏ�ŐN���\)^000000")) {
					case 1:
						continue;
					case 2:
						set .Route,1;
						break;
					case 3:
						if(BaseLevel <= 119) {
							mes "�]�M���̃��x���ł͑I���ł��܂���]";
							continue;
						}
						set .Route,2;
						break;
					}
					stopnpctimer;
					set JTB_1QUE,3;
					hideoffnpc getmdnpcname("3�ԕ����o��#JTB");
					announce "�]�쓌�̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
					mes "�]���Ȃ��͋L����T��Ȃ���";
					mes "�@����}�����Ƃɂ����]";
					close;
				}
			}
		}
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "����B���Ȃ��������������̂ˁB";
		mes "�A�C�O�[�I";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�ǂ��������́H�@���i�C���B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "�M���h�����o�[��";
		mes strcharinfo(0) + "��������B";
		next;
		cutin "igu03.bmp", 2;
		mes "[�A�C�O]";
		mes "�悩�����́I";
		mes "�������̐퓬�ł݂�ȂƂ͂���āA";
		mes "�S�ׂ������́B";
		next;
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l��������";
		mes "�ō��������񂾂��ǁA";
		mes "�o�J���G������Ȃ��ėǂ�������B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "����������";
		mes "�ǂ����ăo�J���G���Ȃ́H";
		next;
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "�o�J������B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�g���W���Ȃ��������Ȃ́c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����Ă����A�����N�̌��g(�l�Ԍ^)��";
		mes "����������l���Ɗ��Ⴂ����";
		mes "�����悤�Ƃ��āA�P��ꂽ�̂�H";
		mes "�o�J�ȊO�̉��҂ł��Ȃ�����Ȃ��B";
		next;
		cutin "lunain03.bmp", 255;
		mes "[�H�H�H]";
		mes "�����N�c�c�B";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			hideoffnpc getmdnpcname("�H�H�H#03");
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes strcharinfo(0) + "�A";
		mes "�A�C�O�A";
		mes "�Ȃɂ��������H";
		next;
		menu "���������ĂȂ�",-;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c���H";
		mes "�������������ĂȂ����ǁc�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "!!";
		mes "����c�c������ƁA";
		mes "���i�C���I�@���I";
		next;
		cutin "lunain04.bmp", 2;
		emotion 23,getmdnpcname("���i�C��#03");
		mes "[���i�C��]";
		mes "���H�@���Ⴀ��������!?";
		mes "���āA�l�ԁc�c!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�т����肵���́I";
		mes "�˂��A���삿���B";
		mes "�ǂ����炱���ɗ����́H";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�m��Ȃ��B";
		mes "�c�c�����������錾�t�A���������B";
		mes "�c�c�����痈�������B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���������Ė��q�Ȃ́H";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "������ƁA�A�C�O�I";
		mes "�ǂ�����Ă���ȏ������q���A";
		mes "����Ȏ����̋��Ԃ܂ł���Ă���̂�I";
		next;
		cutin "lunain03.bmp", 255;
		mes "[" + strcharinfo(0) + "]";
		mes "�j���I�[�Y�̗�����邵�c�c�B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "�������Ă�̂�B";
		mes "�j���I�[�Y�l�͓��ʂ������";
		mes "���܂��Ă邶��Ȃ��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�j���I�[�Y�c�c�̂��l�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l��m���Ă��!?";
		mes "���āA�L���b�I";
		misceffect 563,"";
		next;
		cutin "lunain01.bmp", 255;
		mes "[" + strcharinfo(0) + "]";
		mes "�Ƃ肠�����A�݂�Ȃƍ������悤�B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes strcharinfo(0) + "��";
		mes "�����ʂ�Ȃ́B";
		mes "�ł��A���̎q��������";
		mes "�u���čs���̂��댯�����A";
		mes "�ꏏ�ɘA��Ă����́B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����ˁB���ɒN�����Ȃ��݂��������A";
		mes "�j���I�[�Y�l��m���Ă�Ȃ�";
		mes "�Ȃ�����A�����Ă����Ȃ���B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���q�ɂȂ����獢�邵�A";
		mes "����Ȃ��ōs���́B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c��c�c�Ȃ��H";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����H�@�Ȃ������ƂȂ��H";
		mes "�����ƁA�����Ȃ́B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "����ȏꏊ�ɂ������炩�ȁH";
		mes "�肪�₦�Ă�́B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�s�v�c�Ȋ���������B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�ق�A�������Ȃ��Ă����B";
		mes "�ۂ��ۂ��Ȃ́�";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�c�c�ۂ��ۂ��B";
		mes "�c�c�Ȃ́B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "^ff0000��������^000000��^ff0000�Ȃ��炩�ȓ�^000000�A";
		mes "����2�����ˁB";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�����[�c�c�B���[��c�c";
		mes "�����������琦���͂�������́B";
		next;
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			cutin "igu02.bmp", 2;
			mes "[�A�C�O]";
			mes "�ǂ����ɐi�ނ��A�N�����̑�\�҂�";
			mes "���k���邩��҂��Ăė~�����́B";
			close2;
			cutin "lunain01.bmp", 255;
			end;
		}
		while(1) {
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes strcharinfo(0)+"�A";
			mes "�ǂ����������Ǝv���H";
			mes "^ff0000���������͐����͂�������^000000����";
			mes "���M���Ȃ��Ȃ�~�߂�����";
			mes "�����Ǝv���́c�c�B";
			next;
			switch(select("�����l����","^0000ff�Ȃ��炩�ȓ�^000000","^ff0000��������(BaseLv120�ȏ�ŐN���\)^000000")) {
			case 1:
				continue;
			case 2:
				cutin "igu01.bmp", 2;
				mes "[�A�C�O]";
				mes "����^ff0000�Ȃ��炩�ȓ�^000000�������Ǝv���́I";
				mes "��΁A�������Ȃ́I";
				next;
				cutin "lunain03.bmp", 2;
				mes "[���i�C��]";
				mes "����ς�^ff0000�Ȃ��炩�ȓ�^000000�������ˁB";
				mes "�������ɍs���܂���B";
				set .Route,1;
				break;
			case 3:
				if(BaseLevel <= 119) {
					cutin "igu05.bmp", 2;
					mes "[�A�C�O]";
					mes "�������̓��́A���ȗ\��������́B";
					mes "�~�߂Ă��������������́B";
					next;
					continue;
				}
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�댯��������Ȃ����ǁA";
				mes "�݂�Ȃ��邩������Ȃ�����";
				mes "����^ff0000��������^000000�������Ǝv���́B";
				next;
				cutin "lunain01.bmp", 2;
				mes "[���i�C��]";
				mes "^ff0000��������^000000�ɍs����";
				mes "�j���I�[�Y�l��������āA";
				mes "���̊��������Ă�C�������B";
				mes "�������ɍs���܂���B";
				set .Route,2;
				break;
			}
			break;
		}
		set JTB_1QUE,3;
		hideoffnpc getmdnpcname("3�ԕ����o��#JTB");
		announce "�]�쓌�̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		close2;
		cutin "lunain01.bmp", 255;
		end;
	} else {
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "���A�������߂���";
		mes "�������Ɛi�݂܂���B";
		close2;
		cutin "lunain01.bmp", 255;
		// ���[�_�[���ϔC�����ꍇ�̋~�ϑ[�u
		if(.Route == 0) {
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				while(1) {
					mes "�]�ǂ���̓��ɐi�����H�]";
					next;
					switch(select("�����l����","^0000ff�Ȃ��炩�ȓ�^000000","^ff0000��������(BaseLv120�ȏ�ŐN���\)^000000")) {
					case 1:
						continue;
					case 2:
						set .Route,1;
						break;
					case 3:
						if(BaseLevel <= 119) {
							mes "�]�M���̃��x���ł͑I���ł��܂���]";
							continue;
						}
						set .Route,2;
						break;
					}
					set JTB_1QUE,3;
					hideoffnpc getmdnpcname("3�ԕ����o��#JTB");
					announce "�]�쓌�̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
					close;
				}
			}
		} else {
			if(getpartyleader(getcharid(1)) != strcharinfo(0))
				announce "�]�쓌�̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		}
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

//==========================================
// 5�ԕ���NPC�F�Ȃ��炩�ȓ�
//------------------------------------------
1@jtb.gat,25,110,4	script	�A�C�O#05	646,{
	if(JTB_1QUE <= 3) {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���̎q�Ƃ͂��ꂿ������́c�c�B";
		mes "���������Ȃ��ƂȂ́c�c�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�����ɒ�������s�A�m�̉��c�c";
		mes "�����₵�����ȋȂɒ�������́B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,22,110,5	script	���i�C��#05	10039,{
	if(JTB_1QUE <= 3) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116507))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,5;
				hideoffnpc getmdnpcname("5�ԕ����o��#JTB");
				announce "�]�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				mes "�]���Ȃ��͋L����T��Ȃ���";
				mes "�@����}�����Ƃɂ����]";
				close;
			}
		}
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����Ȃ�P���Ă���Ȃ�āc�c�B";
		mes "�O�̂��߃q�[�����Ă�������A";
		mes "�����Ȃ��ł�ˁB";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			misceffect 313,getmdnpcname("�A�C�O#05");
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c�ǂ����悤�I";
		mes "�������̐퓬�ł��̎q��";
		mes "�͂��ꂽ�݂����Ȃ́c�c�I";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			misceffect 313,getmdnpcname("�A�C�O#05");
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "������A����{���Ȃ�!?";
		next;
		cutin "lunain01.bmp", 255;
		mes "[�H�H�H]";
		mes "���A���̐��́c�c�I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "����ς�A���i�C������I";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			hideoffnpc getmdnpcname("���G��#05");
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�Ȃ񂾁A�o�J���G�����B";
		next;
		cutin "roel04.bmp", 2;
		mes "[���G��]";
		mes "�������K�b�J�����ꂽ!?";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "���G���N�A�҂��Ă������[�c�c";
		mes "���I";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			hideoffnpc getmdnpcname("�Q���J#05");
			hideoffnpc getmdnpcname("�����f�B�[�W���b�N#05");
		}
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�Q���J���ꏏ�Ȃ񂾂ˁI";
		mes "�ǂ������́c�c�B";
		mes "�ł����́A����ǂ��낶��Ȃ��́I";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���A�Ȃɂ���������ł���!?";
		next;
		cutin "roel01.bmp", 255;
		mes "�]�A�C�O�̓��G���ƃQ���J��";
		mes "�@����܂ł̎�����������]";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�Ȃ�قǁc�c�B";
		next;
		cutin "roel01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
		mes "[�����f�B�[�W���b�N]";
		mes "���̏����炵�����Ȃ�A";
		mes "�����X�^�[�ƈꏏ��";
		mes "�ǂ����ɏ��������B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�W���b�N�A���̎q��������!?";
		mes "�����X�^�[�ƈꏏ���āc�c";
		mes "���������ĘA�ꋎ��ꂽ����";
		mes "���ƂȂ�!?";
		next;
		cutin "igu01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�ǂ����炩��������!?";
		next;
		cutin "igu01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�Ƃ͂��������Ɍ�����������ȁB";
		mes "�ǂ��ɍs�����̂��܂ł͂킩���B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���̎q�A�L�����Ȃ��݂���������";
		mes "�S�z�Ȃ́c�c";
		mes "���������Ă����Ȃ��ƂȂ́c�c�I";
		mes "�����Ă���Ă��肪�Ƃ��Ȃ́B";
		next;
		cutin "igu01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
		mes "[�����f�B�[�W���b�N]";
		mes "�C�ɂ���ȁB���ƔO�̂��߁A";
		mes "���̂��Ƃ𑼂̃����o�[�ɂ�";
		mes "�Љ�Ă���Ȃ����B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����B�����ƁA�����f�B�[�W���b�N��";
		mes "�j���I�[�Y�̔��H�M���h��";
		mes "�����o�[�Ȃ񂾂��ǁA";
		mes "��������č��͎����c�������Ă���";
		mes "����ۂۊy�c�̃����o�[�Ȃ́B";
		next;
		mes "[�A�C�O]";
		mes "�����p�������Ă���̂́A";
		mes "���d���̊֌W�炵���́B";
		next;
		cutin "igu01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes strcharinfo(0)+"�ł��B";
		mes "����A�Վ��̃M���h�����o�[�Ƃ���";
		mes "�Q�����܂����B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���̓Q���J�Ƃ����܂��I";
		mes "���e���g�t���̈�Ԓ�q�ł��I";
		mes "��͕K�E�Z�l�ĂƓǏ��ł��I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�Q���J����A�悭���e���g�l��";
		mes "�K�E�Z�̗��K�����Ă��܂����ˁI";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�͂��I�@�������̐���";
		mes "�^����ɂ���̂����ł��I";
		next;
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "���̖����ǂ��Ȃ̂�c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�l�͍ŋ߁A�j���I�[�Y�̔��H�M���h��";
		mes "���c�������G���Ƃ����܂��I";
		mes "�����f�B�[�W���b�N����A";
		mes "��낵�����肢���܂��I";
		next;
		cutin "roel01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c���͂��������B����������Ȃ��B";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�i�t�����Ɉ��A����������I�j";
		next;
		cutin "roel01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
		mes "[�����f�B�[�W���b�N]";
		mes "�Ƃ���ł��O�B�ɂ͒������Ȃ����H";
		mes "�s�A�m�̉����B";
		next;
		if(select("�s�A�m�̉��H","�����ɂ���������") == 1) {
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
			mes "[�����f�B�[�W���b�N]";
			mes strcharinfo(0)+"�ɂ�";
			mes "�������Ă��Ȃ��悤���ȁB";
			mes "���݂̂�Ȃ͂ǂ����H";
			next;
		} else {
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
			mes "[�����f�B�[�W���b�N]";
			mes "�������A���O�ɂ������������B";
			next;
		}
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "���������΂���������A";
		mes "�����o���̂��鉹��";
		mes "��������Ȃ���";
		mes "�v���Ă��̂�ˁB";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�������������ɂ����ǁA��������́B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "���[��H";
		mes "���ɂ͒������܂���B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�l�����ɂ́c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�Ƃ肠���������ł������ĂĂ�";
		mes "�d���Ȃ�����Ȃ��B";
		mes "���̉��̐��̂��m���߂邽�߂ɂ��A";
		mes "��ɐi�񂾕��������񂶂�Ȃ��́H";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�������ˁB���̎q������";
		mes "�����Ă����Ȃ��Ɓc�c�Ȃ́I";
		next;
		cutin "igu01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#05");
		mes "[�����f�B�[�W���b�N]";
		mes "�I�[�N���o�邩�X�l�C�N���o�邩";
		mes "�킩��Ȃ�����ȁB";
		mes "�C�����Đ�ɐi�ޕ���";
		mes "�ǂ����낤�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���ȋC�������܂��I";
		mes "�퓬���������Y��Ȃ��I";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�o�J���G�����Ȃ�ł���ȂɁA";
		mes "�̂����Ȃ̂�I";
		next;
		mes "[���i�C��]";
		mes "�c�c�ł��m���Ɍ��ȋC���������ˁB";
		mes "���O�̐S�Â���͂��Ă����Ȃ����B";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�i�Ȃ񂾂��񂾌����Ȃ���D�����Ȃ��I";
		mes "���i�C������I�j";
		set JTB_1QUE,5;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�݂Ȃ���I";
			mes "�����ɓ�������݂����ł���[�I";
			hideoffnpc getmdnpcname("5�ԕ����o��#JTB");
			announce "�]�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			close2;
			cutin "igu01.bmp", 255;
			end;
		}
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "���ȗ\���������ˁc�c�B";
		mes "���񂽂��C�����Ȃ�����ˁB";
		close2;
		cutin "igu01.bmp", 255;
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			announce "�]�k���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

1@jtb.gat,24,106,1	script	���G��#05	10040,{
	cutin "roel03.bmp", 2;
	mes "[���G��]";
	mes "�l�A�̂��特�y�ɂ͑a����ł���B";
	mes "������s�A�m�̉���";
	mes "������Ȃ��̂���";
	mes "����܂���c�c�I";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

1@jtb.gat,20,108,5	script	�Q���J#05	629,{
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�s�A�m�̉��c�c�B";
	mes "���`��A����ς�";
	mes "�������Ȃ��ł��ˁc�c�B";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}

1@jtb.gat,29,111,5	script	�����f�B�[�W���b�N#05	844,{
	emotion 9;
	mes "[�����f�B�[�W���b�N]";
	mes "���ȗ\��������c�c�B";
	mes "���f����Ȃ�B";
	close;
}

//==========================================
// 6�ԕ���NPC�F�Ȃ��炩�ȓ�
//------------------------------------------
1@jtb.gat,111,115,5	script	���G��#06	10040,{
	if(JTB_1QUE <= 5) {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���i�C������A���v�ł���!?";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "!?";
		mes "�ׁA�ʂɑ��v��I";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�i�����X�^�[��|�����������I�j";
		close2;
		cutin "roel04.bmp", 255;
		end;
	} else {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���i�C������I";
		mes "���������܂��傤�I";
		mes "�����A�}����!!";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "����c�c���I";
		mes "�ǂ��G���Ă�̂�A�G����!!";
		next;
		cutin "roel04.bmp", 2;
		mes "[���G��]";
		mes "�X�A�X�C�}�Z�Z�Z��������!!";
		close2;
		cutin "roel04.bmp", 255;
		end;
	}
}

1@jtb.gat,116,117,4	script	���i�C��#06	10039,{
	if(JTB_1QUE <= 5) {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���i�C������A���v�ł���!?";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "!?";
		mes "�ׁA�ʂɑ��v��I";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�i�����X�^�[��|�����������I�j";
		close2;
		cutin "roel04.bmp", 255;
		end;
	} else {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���i�C������I";
		mes "���������܂��傤�I";
		mes "�����A�}����!!";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "����c�c���I";
		mes "�ǂ��G���Ă�̂�A�G����!!";
		next;
		cutin "roel04.bmp", 2;
		mes "[���G��]";
		mes "�X�A�X�C�}�Z�Z�Z��������!!";
		close2;
		cutin "roel04.bmp", 255;
		end;
	}
}

1@jtb.gat,113,113,5	script	�Q���J#06	629,{
	if(JTB_1QUE <= 5) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�Ȃ��Ȃ��̋��G�ł����ˁI";
		mes strcharinfo(0)+"����I";
	} else {
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�t���c�c�t���c�c�I";
		next;
		mes "[�Q���J]";
		mes "�����ł���ˁc�c�I";
		mes "���A�M���Ă܂��I";
	}
	close2;
	cutin "gelca02.bmp", 255;
	end;
}

1@jtb.gat,115,113,4	script	�A�C�O#06	646,{
	if(JTB_1QUE <= 5) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116507))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,6;
				hideoffnpc getmdnpcname("6�ԕ����o��#JTB");
				announce "�]�쓌�̕��p����E�o���悤�]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				close;
			}
		}
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�Ȃ�Ƃ��Ȃ����c�c�́H";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		cutin "roel01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "���肵���烄�o�����������ȁB";
		next;
		menu "�������̉��͂��̃����X�^�[���H",-;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�����X�^�[���s�A�m�̉����o���Ȃ��";
		mes "�ʔ��������ł��ˁI";
		next;
		cutin "gelca01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "����A�Ⴄ�B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c�W���b�N�H�@�ǂ��������́H";
		next;
		cutin "igu01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "�����������s�A�m�̉���";
		mes "�����Ɖ����̕����璮���c�c";
		next;
		announce "�H�H�H : ���킠�������������������I", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�H�H�H]";
		mes "���킠�������������������I";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "!?";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "���̐��c�c���c�c�H";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�j���̐��������́c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�F������A����������ł����c�c!?";
		next;
		cutin "roel01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "�����B�]���ɒ��ڋ����悤��";
		mes "�������Ă����c�c�B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "���́c�c�݂Ȃ���B";
		mes "���̐��ł����ǁc�c�B";
		next;
		cutin "igu01.bmp", 255;
		announce "�H�H�H : ������������������!!", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�H�H�H]";
		mes "������������������!!";
		next;
		announce "�H�H�H : ��c�c�������b!!", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�H�H�H]";
		mes "��c�c�������b!!";
		next;
		announce "�H�H�H : �C���c�c�����������c�c�b!!�@��߂āc�c���c�c��c�c�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�H�H�H]";
		mes "�C���c�c�����������c�c�b!!";
		mes "��߂āc�c���c�c��c�c�B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���A���̐����Ă܂����c�c�B";
		next;
		cutin "roel01.bmp", 255;
		if(select("�j���I�[�Y!?","���e���g!?") == 1) {
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
			mes "[�����f�B�[�W���b�N]";
			mes "����A�Ⴄ�B���̐��́c�c�B";
			next;
		} else {
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
			mes "[�����f�B�[�W���b�N]";
			mes "���̉\�����c�c�����c�c�B";
			next;
		}
		announce "���e���g : �j���c�c�j���I�[�Y�[�[�[�[�b!!", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[���e���g]";
		mes "�j���c�c�j���I�[�Y�[�[�[�[�b!!";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "�n�b�L���������܂����c�c����ς�c�c";
		mes "����ς荡�̂́c�c�t���̐�!!";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���A��̉����N���Ă��!?";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l!?";
		mes "�j���I�[�Y�l�����ɂ����?!";
		mes "�Ԏ����Ă�!!";
		next;
		cutin "lunain01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "��������!!";
		mes "���炭�A������̐���";
		mes "�������Ă��Ȃ��B";
		next;
		announce "�����̐� : ���߁c�c��߁c�c�āc�c�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�����̐�]";
		mes "���߁c�c��߁c�c�āc�c�B";
		next;
		announce "�����̐� : �ǂ����āc�c�����Ԉ�c�c�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�����̐�]";
		mes "�ǂ����āc�c�����Ԉ�c�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���̐��c�c�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "!?";
		mes "���A�n�k�c�c!?";
		misceffect 563,"";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���A���ꂪ�c�c��!!";
		next;
		cutin "igu01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "���O��A��ӏ��Ɍł܂�!!";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "�h�ꂪ���񂾂񍓂��c�c!!";
		misceffect 563,"";
		next;
		cutin "gelca01.bmp", 255;
		announce "�j���I�[�Y : ���߂���c�c�ꏏ�Ɂc�c�񑩁c�c�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�j���I�[�Y]";
		mes "���߂���c�c�ꏏ�Ɂc�c�񑩁c�c�B";
		next;
		cutin "gelca01.bmp", 255;
		announce "�����̐� : ����c�c�C���c�c�B", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�����̐�]";
		mes "����c�c�C���c�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���̔߂������Ȑ��c�c����ς�c�c�B";
		next;
		cutin "igu01.bmp", 255;
		announce "�����̐� : �j���I�[�Y�b!!", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		mes "[�����̐�]";
		mes "�j���I�[�Y�b!!";
		next;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "!!";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�N�\�A�h�ꂪ�����Ȃ��Ă���!!";
		mes "���̂܂܂ł͊댯��!!";
		mes "��U�������痣��邼!!";
		misceffect 563,"";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�Ƃ����Ă��ǂ��Ɂc�c";
		mes "����!!";
		mes "����������A���������R��Ă܂�!!";
		mes "��������o��邩���c�c�B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�c�c�������ĂĂ�������!!";
		mes "�c�c�������V!�@�����e�b!!";
		next;
		cutin "gelca01.bmp", 255;
		mes "�]�Q���J�̗����e�ɂ��";
		mes "�@�l��l�ʂꂻ���Ȍ����J�����]";
		next;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "�A�C�c��ɉ�������������";
		mes "������񂪁c�c";
		mes "�Ƃ肠�������O�B�����ł�";
		mes "��ɂ�������o���!!";
		mes "���͂������T����";
		mes "�A��Ă���o��!!";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�ꏏ�ɍs���������ǁA";
		mes "����܂Ƃ��ɂȂ肻������";
		mes "�W���b�N�ɂ��肢����́c�c�B";
		mes "�j���I�[�Y�B���A���肢�Ȃ�!!";
		next;
		mes "[�A�C�O]";
		mes "�c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�A�C�O�A�ǂ���������!?";
		mes "�����~�܂��āc�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c���������������̎�";
		mes "���������֍s���Ă�����c�c";
		mes "�ǂ��Ȃ��Ă��񂾂낤�c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����ˁc�c�B";
		mes "�����A��蒼����Ȃ�c�c�B";
		next;
		cutin "lunain01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#06");
		mes "[�����f�B�[�W���b�N]";
		mes "�����Ă�!!�@�����s����!!";
		mes "�A�C�O!!�@���i�C��!!";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c���߂�Ȃ����Ȃ́B";
		mes "�݂�ȁA�}���ŒE�o����́I";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�Ȃ�ł���Ȃ��ƂɁc�c�B";
		mes "���B�A�Ȃɂ��Ԉ�������Ă����́H";
		set JTB_1QUE,6;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			hideoffnpc getmdnpcname("6�ԕ����o��#JTB");
			announce "�]�쓌�̕��p����E�o���悤�]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		}
		close2;
		cutin "lunain01.bmp", 255;
		end;
	} else {
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�c�c���������������̎�";
		mes "���������֍s���Ă�����c�c";
		mes "�ǂ��Ȃ��Ă��񂾂낤�c�c�B";
		close;
	}
	cutin "lunain01.bmp", 255;
	if(getpartyleader(getcharid(1)) != strcharinfo(0))
		announce "�]�쓌�̕��p����E�o���悤�]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
	end;
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

1@jtb.gat,117,115,5	script	�����f�B�[�W���b�N#06	844,{
	if(JTB_1QUE <= 5) {
		emotion 9;
		mes "[�����f�B�[�W���b�N]";
		mes "���ȗ\���قǓ�������̂��c�c�B";
		close2;
		cutin "igu02.bmp", 255;
		end;
	} else {
		emotion 9;
		mes "[�����f�B�[�W���b�N]";
		mes "�����A"+strcharinfo(0)+"";
		mes "���G���I";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�Ƃ肠�����h��͂����܂�����";
		mes "���O�B�̓��i�C���ƃQ���J��";
		mes "�l�q�����Ă����Ă���I";
		mes "�F��������������A";
		mes "���O�B�͏o���!!";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���������󋵂ŗ�Âł�������A";
		mes "�����炪���ꂵ�Ă���Ƃ�";
		mes "�v���Ȃ�����ȁc�c�B";
		mes "��Ԃ������邪�A���񂾁B";
		next;
		switch(select("���i�C���̗l�q������","�Q���J�̗l�q������","�A�C�O�̗l�q������")) {
		case 1:
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�ǂ����悤�c�c�ǂ����悤�c�c";
			mes "�j���I�[�Y�l�ɂ������̂��Ƃ���������";
			mes "���c�c�I";
			next;
			cutin "lunain01.bmp", 255;
			mes "["+strcharinfo(0)+"]";
			mes "���i�C���́A";
			mes "���̏��̎q�����ꂽ�Ƃ��A";
			mes "���������܂�����ˁH";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "^ff99cc�j���I�[�Y�l�͓��ʂ������";
			mes "���܂��Ă邶��Ȃ��B^000000���āB";
			mes "��������v�I";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�c�c�Ȃɂ���A���̃��m�}�l�H";
			next;
			cutin "lunain03.bmp", 2;
			mes "[���i�C��]";
			mes "�S�R���ĂȂ�����Ȃ��c�c�B";
			next;
			cutin "lunain03.bmp", 255;
			mes "�]���i�C���͏��������̒��q��";
			mes "�@���߂����悤���]";
			break;
		case 2:
			cutin "gelca04.bmp", 2;
			mes "[�Q���J]";
			mes strcharinfo(0)+"����!!";
			mes "�t���́c�c�t���͑��v�ł���ˁH";
			next;
			mes "[�Q���J]";
			mes "�t����������Ȃ��c�c";
			mes "�݂�ȁA�݂�ȁA���v�ł���ˁc�c!?";
			next;
			cutin "gelca04.bmp", 255;
			mes "["+strcharinfo(0)+"]";
			mes "�����Ƒ��v�B";
			mes "�����ăQ���J�̎t���Ȃ񂾂���B";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�����c�c�ł���ˁc�c�B";
			mes "�t���̂��ƐM���Ă����Ȃ���";
			mes "��Ԓ�q���i�ł�����ˁc�c�B";
			next;
			cutin "gelca03.bmp", 2;
			mes "[�Q���J]";
			mes "���肪�Ƃ��������܂��B";
			mes strcharinfo(0)+"����B";
			next;
			cutin "gelca03.bmp", 255;
			mes "�]�Q���J�͏������C��";
			mes "�@���߂����悤���]";
			break;
		case 3:
			emotion 9;
			mes "[�����f�B�[�W���b�N]";
			mes "���O���A�C�O�ɂ��Ă����̂��B";
			mes "�Ȃ�A���S���ȁB";
			mes "�ł́A���̓Q���J�����Ă������B";
			next;
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "��A����胋�i�C����";
			mes "�Q���J�̕����c�c�B";
			next;
			cutin "igu05.bmp", 255;
			mes "["+strcharinfo(0)+"]";
			mes "�g�̂��k���Ă���̂�";
			mes "����������S�z�Łc�c�B";
			next;
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "���c�c�B";
			next;
			cutin "igu02.bmp", 2;
			mes "[�A�C�O]";
			mes "���͂́A�o��������Ă��́B";
			mes strcharinfo(0)+"�A";
			mes "���肪�Ƃ��Ȃ́c�c�B";
			next;
			cutin "igu02.bmp", 255;
			mes "�]�A�C�O�̑̂̐k����";
			mes "�@�~�܂����悤���]";
			break;
		}
		close2;
		cutin "igu02.bmp", 255;
		end;
	}
}

//==========================================
// 8�ԕ���NPC�F��������
//------------------------------------------
1@jtb.gat,289,118,3	script	�H�H�H#08	10041,{
	if(JTB_1QUE <= 3) {
		cutin "shaloshi01.bmp", 2;
		mes "[�H�H�H]";
		mes "�j���I�[�Y�c�c�����B";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	} else {
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "����c�c�B";
		mes "�ǂ�����΋�����H";
		mes "�c�c�ǂ�����Ώ΂���H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}

1@jtb.gat,288,122,4	script	���M#08	647,{
	if(JTB_1QUE <= 3) {
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "����Ȏ�����";
		mes "�̂��̂��Č��C�������܂��傤�B";
		close2;
		cutin "ragi02.bmp", 255;
		end;
	} else {
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[������";
		mes "�����̋C����������";
		mes "�\���ł���Ɨǂ��ł��˂��B";
		close2;
		cutin "ragi02.bmp", 255;
		end;
	}
}

1@jtb.gat,283,121,5	script	�j���I�[�Y#08	625,{
	if(JTB_1QUE <= 3) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116508))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,8;
				hideoffnpc getmdnpcname("8�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				mes "�]���Ȃ��͋L����T��Ȃ���";
				mes "�@����}�����Ƃɂ����]";
				close;
			}
		}
		cutin "nines03.bmp", 2;
		emotion 2;
		mes "[�j���I�[�Y]";
		mes "���̉�����͂��܂��ɉ����`";
		mes "�G��邱�Ƃ��炩�Ȃ�Ȃ��`";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�������ł��˂��A�j���I�[�Y�l�B";
		next;
		cutin "nines02.bmp", 2;
		emotion 15;
		mes "[�j���I�[�Y]";
		mes "���肪�Ƃ��A���M�N�I";
		mes "����A" + strcharinfo(0) + "�I";
		mes "�N�������񂾂ˁ`�I";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "��H�@���킢���q��A��Ă���ˁI";
		mes "���̎q�͒N���ȁH";
		next;
		menu "���q�݂����Ȃ�ł�",-;
		mes "[�j���I�[�Y]";
		mes "����͂����Ȃ��ˁB";
		mes "�o���܂ňꏏ�ɍs�������B";
		mes "���삿���A";
		mes "�����O�͂Ȃ�Ă����̂��ȁH";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�c�c�V�������V�[�B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�V�������V�[���I";
		mes "���̓j���I�[�Y�B�ނ̓��M�N����B";
		mes "��낵���ˁA�V�������V�[�B";
		mes "�o���܂ł݂�Ȃňꏏ�ɍs�����ˁB";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "��낵�����肢���܂��ˁA";
		mes "�V�������V�[�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�Ƃ���ő��݂̂�Ȃ�";
		mes "�ꏏ����Ȃ��̂����H";
		next;
		menu "�A�C�O�ƃ��i�C���Ƃ͂��ꂽ",-;
		mes "[�j���I�[�Y]";
		mes "�Ȃ�قǁB";
		mes "���Ⴀ��l���T���Ȃ��Ƃ��ˁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�Ȃ񂾂������͕s�v�c�ȗ͂�";
		mes "�����ꏏ�ɂ��������o�[��";
		mes "���Ȃ��Ȃ����Ⴄ�񂾂�ˁB";
		mes "������������񂾁B";
		mes "�͂���Ȃ��悤�ɂ��Ȃ��ƂˁB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�̂Ŏv���o�����B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�Èłŕ����������̐��c�c�B";
		next;
		menu "���H",-;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�^���Âȏ��ŉ������������B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�̂������B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�j���I�[�Y���̂��Ă��B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c���y�ɏ����";
		mes "�c�c�m��Ȃ����t�����ς�";
		mes "�c�c����Ă����B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c���̒��̗F�B���Ă������t�A";
		mes "�c�c�F�B�Ɖ߂������X�A";
		mes "�c�c�������C�ɓ������B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�����F�B�ƈꏏ��";
		mes "�c�c�̂������Ǝv�����B";
		mes "�c�c������A���肢�����B";
		next;
		mes "[�V�������V�[]";
		mes "�c�c�F�B�������������āB";
		next;
		mes "[�V�������V�[]";
		mes "�c�c��������A";
		mes "�c�c�A�C�O�ƃ��i�C���������B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�Ȃ�قǁB";
		mes "�����������炻��͉��y�̐_�l���A";
		mes "�肢�������Ă��ꂽ�̂���";
		mes "����܂���˂��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "������������Ȃ��ˁB";
		mes "���y�̐_�l�ɂ́A";
		mes "�肢��z����͂��Ă��ꂽ��";
		mes "�����Ă��ꂽ�肷��";
		mes "�s�v�c�ȗ͂�����̂�������Ȃ��ˁB";
		next;
		mes "[�j���I�[�Y]";
		mes "���������΂������̉̂��A";
		mes "�˗���̑z���l�̒a���΂�";
		mes "�^����C���[�W�����ȂŁA";
		mes "�ނ̑z�����`���悤�ɂ���";
		mes "������񂾁B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���̋Ȃ𑡂�l�ɂ�";
		mes "�z�����`���Ƃ����Ȃ��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�^����ĂȂɁH";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[�A����ł��悧�B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "���ɂ��u�l���̗܁v��";
		mes "�u���̂������v�u�V�̘I�v�ȂǂƂ�";
		mes "�Ă΂�Ă܂��˂��B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���ꂢ�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�l�����܂𗬂��̂��ȁH";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�ǂ��Ȃ�ł��傤���B";
		mes "�l�����ł����A�l�Ƃ��Ă�";
		mes "�����⃂���X�^�[�������̂�";
		mes "�C�ɂȂ�܂��˂��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����⃂���X�^�[�͋����Ȃ��H";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�����͕s���ł����A���Ȃ��Ƃ��l��";
		mes "�����⃂���X�^�[���������Ƃ����b��";
		mes "���������Ƃ͂Ȃ��ł��˂��B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�܂𗬂��Ƃ������Ƃ�";
		mes "�������Ƃ����؋����낤���A";
		mes "����Ȗ����⃂���X�^�[������Ȃ�A";
		mes "���͂����ɗF�B�ɂȂꂻ�������";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "����Ȗ����⃂���X�^�[�Ȃ�A";
		mes "�ꏏ�ɉ̂��̂�����";
		mes "�y�����ł��傤�˂��B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�ǂ�������܁A������H";
		next;
		cutin "ragi03.bmp", 2;
		mes "[���M]";
		mes "����A�V�������V�[��";
		mes "���������Ƃ��Ȃ��̂ł����H";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����Ȃ��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�V�������V�[�B�܂͋������Ƃ���";
		mes "�������̂���Ȃ��񂾂�`�B";
		mes "�������ė������܂ɂ�";
		mes "�Ӗ����Ȃ�����ˁB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[��";
		mes "�܂𗬂��Ă݂�����ł��˂��B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�������A";
		mes "�V�������V�[������ǂ����B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�^��B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[��";
		mes "�����܂𗬂��鎞�܂ŁA";
		mes "���ꂪ�܂̂������Ď��ɂ��܂��傤�B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�킩�����B";
		next;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���������ˁA���M�N�I";
		mes "���M�N�Ȃ�";
		mes "�f���炵���N���E����~���X�g������";
		mes "�Ȃ��Ǝv����`�I";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł��l�́A�܂����΂炭";
		mes "�o�[�h�̂܂܂ł�������ł���˂��B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�͂́A�o�[�h�ł��̂������ˁI";
		mes "�E�Ƃ͂��܂�֌W�Ȃ�����";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�����ꏏ�ɉ̂������B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�������ˁ�";
		mes "���x�V�������V�[�ɂ�";
		mes "�̂����������Ă����悤�ˁI";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "���̎��݂͂�Ȃŉ̂��܂��傤�B";
		mes "�������A";
		mes strcharinfo(0)+ "�����";
		mes "�ꏏ�ɂł��悧�B";
		set JTB_1QUE,8;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			hideoffnpc getmdnpcname("8�ԕ����o��#JTB");
		}
		close2;
		cutin "ragi01.bmp", 255;
		end;
	} else {
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�����A�V�������V�[�Ƃ�";
		mes "�̂��Ă݂����ˁB";
		mes "�����Ɗy������B";
		close2;
		cutin "nines03.bmp", 255;
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

//==========================================
// 10�ԕ���NPC�F��������
//------------------------------------------
1@jtb.gat,38,197,4	script	�V�������V�[#10	10041,{
	if(JTB_1QUE <= 8) {
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�͂���Ȃ��悤�Ɏ�c�c�Ȃ��B";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	} else {
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���l���l���Ă��邱��";
		mes "�������Ȃ��H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}

1@jtb.gat,34,198,5	script	�j���I�[�Y#10	625,{
	if(JTB_1QUE <= 8) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116508))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,10;
				hideoffnpc getmdnpcname("10�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				mes "�]���Ȃ��͋L����T��Ȃ���";
				mes "�@����}�����Ƃɂ����]";
				close;
			}
		}
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes strcharinfo(0) + "�I";
		mes "�V�������V�[�I�@�ǂ������I";
		mes "�����������񂾂ˁ`�I";
		mes "���̐퓬�Ń��M�N�Ƃ�";
		mes "�͂���Ă��܂�����c�c�B";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		switch(select("���̂܂܉�b�𑱂���","���̃����o�[��T��")) {
		case 1:
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�j���I�[�Y�A";
			mes "���S�����炨���������́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "����!?�@������Ȃ��ƌ������H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c���������B";
			mes strcharinfo(0) + "�ɂ�";
			mes "�������Ȃ������H";
			next;
			menu "�������Ȃ�����",-;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c���������ăV�������V�[�ɂ�";
			mes "�l�̐S�̐�����������́H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c��������B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�H";
			mes "�ǂ����ĕ|�����Ă�́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�Ƃ肠�����V�������V�[��";
			mes "�l�̐S��ǂ߂邱�Ƃ�";
			mes "��U�݂�Ȃɂ͓����ɂ��āc�c";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�c�O�ˁA�������Ă������";
			mes "�~���~���������Ă�B";
			next;
			cutin "nines04.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�~���~��!?";
			mes "���A���̂܂ɂ����ɂ����񂾂�!?";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				hideoffnpc getmdnpcname("�~���~��#10");
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���������狏�����B";
			mes "�Ƃ肠���������o����񂾂��A";
			mes "�����Ɛ������Ȃ����B";
			mes "�������ɉ��l�����邩��B";
			next;
			cutin "min02.bmp", 255;
			mes "�]���ǁA�V�������V�[��";
			mes "�@�S�̐������ɏo���Ȃ��Ɩ񑩂��A";
			mes "�@���̘b�͈�U�A�I��邱�ƂɂȂ����]";
			next;
			mes "�]�l�̐S���ǂ߂�V�������V�[��";
			mes "�@�l�Ԃł͂Ȃ��̂��낤���c�c�]";
			set JTB_1QUE,10;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("10�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			}
			close2;
			cutin "nines01.bmp", 255;
			end;
		case 2:
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "��H�@���������琺�������I";
			mes "�N���������Ɍ������Ă��Ă�I";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���[���I�@����ς�j���I�[�Y�B���I";
			mes "�݂�ȁ`�j���I�[�Y�B��������[�I";
			mes strcharinfo(0) + "��";
			mes "�V�������V�[���ꏏ����I";
			next;
			cutin "lunain01.bmp", 2;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				hideoffnpc getmdnpcname("�A����#10");
			mes "[���i�C��]";
			mes "�V�������V�[�I�@�j���I�[�Y�l��";
			mes strcharinfo(0) + "��";
			mes "�ꏏ�������̂ˁB�悩������B";
			next;
			cutin "nines01.bmp", 2;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("���G��#10");
				hideoffnpc getmdnpcname("���i�C��#10");
				hideoffnpc getmdnpcname("���e���g#10");
				hideoffnpc getmdnpcname("�Q���J#10");
				hideoffnpc getmdnpcname("�~���~��#10");
			}
			mes "[�j���I�[�Y]";
			mes "�݂�Ȗ��������������H";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���v�B�݂�ȃP�K�Ƃ����ĂȂ���I";
			mes "�ł������X�^�[�������ς�����";
			mes "��ς������񂾂���I";
			next;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�q�[���[�͍Ō��";
			mes "�������̂���A�A�����I";
			mes "���̂悤�ɂˁI";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "�����܂Ōv�Z���Ă��Ȃ�āA";
			mes "�������j���I�[�Y�l!!";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "���̊��ɂ͊Ԃɍ����ĂȂ����ǂˁB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�������q�[���[���ƁA";
			mes "���͂ǂ��Ȃ��!?";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�t���́c�c�B";
			next;
			cutin "arang02.bmp", 2;
			mes "[�A����]";
			mes "�ŗ��������q�[���[�̃��C�o��!!";
			mes "�Ƃ��I";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�����������������ł�!!";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "����Ȃ������A";
			mes "���e���g�ɂܑ͖̖������B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c���e���A���C�o���ɂ�";
			mes strcharinfo(0) + "��";
			mes "�����������āB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�Ȃ�!?";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�~���~���͏������H";
			next;
			cutin "gelca04.bmp", 2;
			emotion 23,getmdnpcname("�Q���J#10");
			mes "[�Q���J]";
			mes "�����A������Ȃ��ł���!?";
			mes "������Ȃ��ƌ����Ă܂��񂩂���I";
			mes "�c�c���āA����H";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "������Ƒ҂��Ȃ�����!?";
			mes "���̎q�A���������āc�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			emotion 23,getmdnpcname("���i�C��#10");
			mes "[�V�������V�[]";
			mes "�c�c�₾�A����";
			mes "�����j���c�c�i���������j";
			next;
			cutin "lunain04.bmp", 2;
			emotion 19,getmdnpcname("���i�C��#10");
			mes "[���i�C��]";
			mes "�V�A�V�������V�[!!";
			mes "���Ȃ�����������";
			mes "�݂�Ȃ̍l���Ă��邱�Ƃ��킩���!?";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "���i�C������c�c";
			mes "�Ƃ肠�������̍ǂ��ł����O���Ȃ���";
			mes "�b���Ȃ��Ǝv���܂��c�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�Ղ́[�B";
			mes "�c�c��������B";
			mes "�c�c�S�̐��A�݂�Ȃɂ͕������Ȃ��H";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "���͕����������ƂȂ���c�c�B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c��������ς肱���Łc�c";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�j���I�[�Y�A";
			mes "�݂�Ȃǂ����ĕ|�����Ă�́H";
			next;
			mes "[�V�������V�[]";
			mes "�c�c�S�̐��A���������Ⴂ���Ȃ��́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�B";
			mes "�����݂�ȂƖ񑩂��悤�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�S�̐�����������̂�";
			mes "�ǂ����������A���ɂ͌��߂��Ȃ��B";
			next;
			mes "[�j���I�[�Y]";
			mes "�����ǁA�݂�ȐS�̒���";
			mes "�閧�Ɏv���Ă鎖��";
			mes "�Y��ł邱�Ƃ����邩������Ȃ��B";
			next;
			mes "[�j���I�[�Y]";
			mes "�S�̒����Ă����̂�";
			mes "�����������̂Ȃ񂾂�B";
			mes "������݂�Ȃ̐����������Ă��A";
			mes "���ɏo�����Ⴂ���Ȃ���B";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�S�̒��̃i�C�V�����o�����Ⴄ�ƁA";
			mes "�݂�Ȃ���������A�т����肵����A";
			mes "�߂����Ȃ����Ⴄ��������Ȃ�����ˁB";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c����B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�݂�ȁA���߂�Ȃ����B";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�����q���ˁA�V�������V�[�B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A�j���I�[�Y�c�c";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���e�B�c�c��łˁB";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�`�b�B����ɂ���!!";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "�o�J�o�J�����B";
			mes "��́A���̒��ǂ܂�č���̂�";
			mes "���e���g���炢�ł���B";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "�����葁����������o�āA";
			mes "�����C�ɓ��鎖�̕����厖����B";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�����ł��ˁc�c����ɖ{����A";
			mes "���������͂��������";
			mes "��ςȂ��Ƒ����ł����c�c�B";
			next;
			cutin "arang03.bmp", 2;
			mes "[�A����]";
			mes "�悭�l������A����";
			mes "�ǂ܂�Ă����邱�ƂȂ��";
			mes "�l�������ƂȂ�����!!";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�c�c��A�����ǂ܂�č��鎖�Ȃ��";
			mes "�ȁA�Ȃ��񂾂���c�c�B";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�i��������l��";
			mes "���i�C������̌����ɖG���Ă�́A";
			mes "�o�����Ⴄ�c�c!?�j";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�i�S���ǂ߂�Ƃ������Ƃ�";
			mes "�����A�l�Ԃ���Ȃ��c�c�̂��H�j";
			set JTB_1QUE,10;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("10�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			}
			close2;
			cutin "nines01.bmp", 255;
			end;
		}
	} else {
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�͋C�t�����̂��ȁB";
		mes "�V�������V�[�́c�c�B";
		close2;
		cutin "nines01.bmp", 255;
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

1@jtb.gat,38,191,4	script	�~���~��#10	643,{
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���̃K�L�c�c";
	mes "����ς��������ˁc�c�B";
	mes "�����ޗ��ɂ��Ă�낤������B";
	close2;
	cutin "min01.bmp", 255;
	end;
}

1@jtb.gat,34,193,5	script	���G��#10	10040,{
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�V�������V�[�c�c";
	mes "�����A���i�C�����񂩂�";
	mes "�b�͕����Ă��܂�������";
	mes "�{���ɕs�v�c�ȏ��̎q�ł��ˁB";
	close2;
	cutin "roel02.bmp", 255;
	end;
}

1@jtb.gat,40,193,4	script	�A����#10	644,{
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "���̐l�̍l���Ă邱�Ƃ�";
	mes "�킩��Ȃ�Đ����ȁ[�I";
	mes "�������K����΂ł��邩�ȁ[�H";
	close2;
	cutin "arang01.bmp", 255;
	end;
}

1@jtb.gat,40,198,3	script	���i�C��#10	10039,{
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�l�̐S��ǂޗ́c�c";
	mes "�́A�吹���œǂ񂾖{�ɂ�";
	mes "�����͐l�̐S��ǂ݁A�f�킷�c�c";
	mes "�Ȃ�ď����Ă�������ˁB";
	next;
	cutin "lunain03.bmp", 2;
	mes "[���i�C��]";
	mes "�V�������V�[�͂�������";
	mes "�j���I�[�Y�l�̐S��f�킷";
	mes "���������ĂƂ��납����H";
	close2;
	cutin "lunain02.bmp", 255;
	end;
}

1@jtb.gat,36,191,5	script	�Q���J#10	629,{
	cutin "gelca04.bmp", 2;
	mes "[�Q���J]";
	mes "�����t���̐S�̒���ǂ߂�΁c�c";
	mes "���A�����I�@���ł�����܂���I";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}

1@jtb.gat,31,194,5	script	���e���g#10	630,{
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���l�̐S��ǂ߂邾�Ɓc�c�H";
	mes "���̃K�L�c�c";
	mes "����A�܂����ȁc�c�B";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

//==========================================
// 11�ԕ���NPC�F��������
//------------------------------------------
1@jtb.gat,108,198,5	script	�V�������V�[#11	10041,{
	if(JTB_1QUE <= 10) {
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�݂�ȉ��䂵�Ă�c�c�B";
		mes "���v�H�@����H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	} else {
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�y���͗F�B����Ȃ��c�c�B";
		mes "���̗F�B�́c�c�N�H";
		close2;
		cutin "shaloshi01.bmp", 255;
		end;
	}
}

1@jtb.gat,110,196,5	script	���G��#11	10040,{
	if(JTB_1QUE <= 10) {
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�l�͑��v�ł��B";
		mes "�V�������V�[�����܂�������B";
		mes "�N������鎖���ł��Čւ炵���ł��B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�����X�^�[�ƗF�B�c�c�B";
		mes "�l�Ԃ��݂�ȃV�������V�[�݂�����";
		mes "�����X�^�[�ƗF�B�ɂȂ��Ȃ�A";
		mes "�����X�^�[�Ɛl�Ԃ���������";
		mes "���a�Ȑ��̒��ɂȂ��ł��傤�ˁB";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,112,196,3	script	���i�C��#11	10039,{
	if(JTB_1QUE <= 10) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116508))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,11;
				hideoffnpc getmdnpcname("11�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				mes "�]���Ȃ��͋L����T��Ȃ���";
				mes "�@����}�����Ƃɂ����]";
				close2;
				npcskillsupport 28,9999;
				heal 99999,0;
				end;
			}
		}
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "����A���̑傫�ȃ����X�^�[�c�c�B";
		mes "���܂ł����ς������������̂Ƃ�";
		mes "�i�Ⴂ�̋�����������c�c�B";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���G���B���i�C���B���䂵�Ă�B";
		mes "���v�H";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "���͕��C��B";
		mes "������ƃ��G���I";
		mes "���񂽉��䂵�Ă邶��Ȃ�!!";
		mes "���������Ȃ���!!";
		next;
		cutin "roel04.bmp", 2;
		mes "[���G��]";
		mes "�ځA�l�͑��v�ł��B";
		mes "���̂��炢�債�����Ɓc�c�B";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�������痈�Ȃ���!!";
		next;
		switch(select("�V�������V�[�̗l�q������","���G���̗l�q������")) {
		case 1:
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				misceffect 313,getmdnpcname("���G��#11");
			cutin "lunain04.bmp", 255;
			mes "�]�q�[������Ă��郍�G��������";
			mes "�@�V�������V�[�͔߂����Ɍ����J���]";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				misceffect 313,getmdnpcname("���G��#11");
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�y���A�O�͖\��Ȃ������̂ɁB";
			next;
			menu "�y�����ă����X�^�[�̖��O�H",-;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���y��������u�y���v�B";
			mes "���񂾂�A�\�ꂽ�肵�Ȃ������B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "������F�B�ɂȂ����B";
			mes "�ł��c�c�B";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�����X�^�[�ƗF�B��!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�ρH";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�V�������V�[�͂킩���ĂȂ�";
			mes "�݂��������猾�����ǁB";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ��B";
			mes "������͎��B�ɂƂ��ēG��B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�G�H";
			next;
			mes "[�V�������V�[]";
			mes "�G���ĉ��H";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�l�B�ɊQ���Ȃ�����c�c�ł��傤���B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�ȒP�ɂ����ƁA";
			mes "���B�ɒɂ����Ƃ�������";
			mes "���点���肷�鑊��B";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ��B";
			mes "������͎��B�ɂƂ��ēG��B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�ł��y���́A���ɒɂ����Ƃ�";
			mes "���邱�Ƃ��������ƂȂ��B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���܂ł͂���������";
			mes "��������Ȃ����ǁA";
			mes "���͈Ⴄ�ł���H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���A����";
			mes strcharinfo(0) + "�̔Ԃ�B";
			mes "�����ɍ���Ȃ����B";
			next;
			npcskillsupport 28,9999;
			heal 99999,0;
			cutin "lunain01.bmp", 255;
			mes "�]�V�������V�[�͉���";
			mes "�@�l������ł���悤���]";
			next;
			mes "�]���������悤�Ƃ�����";
			mes "�@���i�C���ɕ߂܂��Ă��܂����̂�";
			mes "�@�b���͓̂�������]";
			set JTB_1QUE,11;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("11�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			}
			close2;
			cutin "lunain02.bmp", 255;
			end;
		case 2:
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				misceffect 313,getmdnpcname("���G��#11");
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�܂������c�c��w�����āA";
			mes "�����X�^�[�ɂ����݂���!!";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				misceffect 313,getmdnpcname("���G��#11");
			cutin "roel04.bmp", 2;
			mes "[���G��]";
			mes "���A�����܂���!!";
			mes "�F����̖��ɗ��Ă�̂�";
			mes "�������Ă��c�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���i�C���B";
			mes "���匾���Ȃ��玡�Â��Ă�B";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "�D�����ł���ˁA";
			mes "���i�C������!!";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "���A���Ⴂ���Ȃ��ł��!!";
			mes "�q��1�l�̐��b��";
			mes "�ł��Ȃ��̂����āA";
			mes "�j���I�[�Y�l��";
			mes "�v��ꂽ���Ȃ�������!!";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�炪�Ԃ��B";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "���A���邳����ˁI";
			mes "�c�c����A������Ƃ��̓��A��";
			mes "����������!!";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���́A�����͓��A����Ȃ�����";
			mes "�����Ă��B";
			next;
			menu "�y���H",-;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���i�C���ƃA�C�O�ɉ�O�ɁA";
			mes "�����ς������B";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "�y������ł����B";
			mes "�l�͂܂�����������Ƃ�";
			mes "�Ȃ��C�����܂��ˁB";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���O�͂Ȃ����Ă�������A";
			mes "���������B";
			next;
			mes "[�V�������V�[]";
			mes "�y���y��������u�y���v�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���������Ă��̏����������X�^�[�H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���y���������B";
			mes "���񂾂�A�\�ꂽ�肵�Ȃ������B";
			next;
			mes "[�V�������V�[]";
			mes "������F�B�ɂȂ����B";
			mes "�ł��c�c�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�V�������V�[�͂킩���ĂȂ�";
			mes "�݂��������猾�����ǁB";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ��B";
			mes "������͎��B�ɂƂ��ēG��B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�G�H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�G���ĉ��H";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�l�B�ɊQ���Ȃ�����c�c�ł��傤���B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�ȒP�ɂ����ƁA";
			mes "���B�ɒɂ����Ƃ�������";
			mes "���点���肷�鑊��B";
			next;
			mes "[���i�C��]";
			mes "�����X�^�[�ƕ��a�I�ɂ��b����";
			mes "���������Ȃ�Ė����B";
			mes "������키�����Ȃ��̂�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�ł��y���́A���ɒɂ����Ƃ�";
			mes "���邱�Ƃ��������ƂȂ��B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "���܂ł͂���������";
			mes "��������Ȃ����ǁA";
			mes "���͈Ⴄ�ł���H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "���́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�B";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "���A�������I";
			next;
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�c�c�؁A�y���y���y���y��!!";
			next;
			menu "���G��!?",-;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "����c�c�Ȃɂ���Ă�̂�!?";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "���c�c����c�c";
			mes "�l���y���̂�����";
			mes "�V�������V�[����̂��F�B�ɂƁc�c�B";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "�Ӂ[��H";
			mes "���Ă��Ƃ́c�c";
			mes "�|�������Ȃ���ˁB";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				misceffect 85,getmdnpcname("���G��#11");
			cutin "roel03.bmp", 2;
			mes "[���G��]";
			mes "�y�c�c�y���[!?";
			next;
			cutin "lunain03.bmp", 2;
			mes "[���i�C��]";
			mes "��k��B";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "���A����";
			mes strcharinfo(0) + "�̔Ԃ�B";
			mes "�����ɍ���Ȃ����B";
			next;
			npcskillsupport 28,9999;
			heal 99999,0;
			cutin "lunain03.bmp", 255;
			mes "�]�V�������V�[�͉���";
			mes "�@�l������ł���悤���]";
			next;
			mes "�]�Ƃ肠�������͂�����";
			mes "�@���Ă����������������낤�]";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���͗F�B����Ȃ��c�c";
			mes "�ł��c�c�B";
			set JTB_1QUE,11;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("11�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			}
			close2;
			cutin "lunain02.bmp", 255;
			end;
		}
	} else {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����X�^�[���y�b�g�ɂ���l�����邯��";
		mes "����͗�O�ˁB";
		mes "����ς胂���X�^�[�͊댯��";
		mes "�F�B�ɂ͂Ȃ�Ȃ��̂�B";
		close2;
		cutin "lunain02.bmp", 255;
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

//==========================================
// 12�ԕ���NPC�F��������
//------------------------------------------
1@jtb.gat,192,205,5	script	�A�C�O#12	646,{
	if(JTB_1QUE <= 11) {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[�A����Ɖ���́I";
		mes "�����ŗǂ������́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[������ĂȂ��";
		mes "�����Ȃ��́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,201,203,4	script	�A����#12	644,{
	if(JTB_1QUE <= 11) {
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�悤�₭�݂�Ȃƍ����ł�����B";
		mes "�ł��A�V�������V�[��";
		mes "�������C�Ȃ������c�c�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "����ȁc�c";
		mes "���������F�B�ɂȂꂻ������";
		mes "�v���Ă��̂Ɂc�c�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,191,204,5	script	���M#12	647,{
	if(JTB_1QUE <= 11) {
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�݂Ȃ���Ƃ������ł��܂�����";
		mes "���낻��N���C�}�b�N�X�ł����˂��B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�ޏ��͕ʂ�ۂɈ��";
		mes "����z������ł��傤�˂��B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,192,202,5	script	���i�C��#12	10039,{
	if(JTB_1QUE <= 11) {
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "�݂�ȂƂ������ł������B";
		mes "�����A���ăV�����[�ł�";
		mes "���т�����ˁB";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "���̓j���I�[�Y�l��ǂ���B";
		mes "�V�������V�[�̎���";
		mes "�C�ɂȂ邵�ˁB";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,191,200,5	script	���G��#12	10040,{
	if(JTB_1QUE <= 11) {
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�݂Ȃ���ƍ����͏o���܂�����";
		mes "�܂��A���f�͋֕��ł��I";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "���A�ł�����������";
		mes "�܂����i�C������Ƀq�[�����c�c";
		mes "�c�c�ȁA���ł�����܂���I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���i�͉������񂾌����Ă�";
		mes "���e���g�l�ƃj���I�[�Y�l��";
		mes "����ς�e�F�Ȃ�ł��ˁI";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,199,200,4	script	�~���~��#12	643,{
	if(JTB_1QUE <= 11) {
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�����̎莆�ɏ悹����";
		mes "�z�C�z�C����ȏ��܂ŗ��āA";
		mes "�������\���l�D����ˁB";
		close2;
		cutin "igu01.bmp", 255;
		end;
	} else {
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�w�i�D�΂����l�ɂȂ���";
		mes "���e���g���܂��܂��q���ˁB";
		mes "�j���I�[�Y�̎��ɂȂ��";
		mes "�����Ɋ���I�ɓ����񂾂��́B";
		next;
		mes "[�~���~��]";
		mes "���ĂˁA���ꂶ�Ⴀ����";
		mes "�N���݂�������Ȃ��c�c�B";
		mes "���͂܂��܂��Ⴂ�񂾂���";
		mes "���Ⴂ������_����A";
		mes strcharinfo(0) + "�B";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
}

1@jtb.gat,199,204,4	script	�Q���J#12	629,{
	if(JTB_1QUE <= 11) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "����������N����n�k����";
		mes "�����̂���������";
		mes "�N�����Ă���悤��";
		mes "�C�����܂��񂩁H";
		next;
		mes "[�Q���J]";
		mes "�n�k���N����x��";
		mes "�܂�Ől�̋C�����݂�����";
		mes "���͋C���ς������A";
		mes "��Ԃ��s����ɂȂ��Ă�";
		mes "�C�������ł��B";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	} else {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�m���ɂ��̂܂ܐi�ނ̂�";
		mes "�댯�����m��܂���";
		mes "���͎t����M���܂��I";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�����āA���̎t���Ȃ�ł�����I";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}

1@jtb.gat,189,203,5	script	�����f�B�[�W���b�N#12	844,{
	if(JTB_1QUE <= 11) {
		mes "[�����f�B�[�W���b�N]";
		mes "�悤�₭�S�����������B";
		mes "�������Əo����T����";
		mes "�E�o���邼�B";
		close;
	} else {
		mes "[�����f�B�[�W���b�N]";
		mes "�����Ȃ�C�͂��Ă������c�c";
		mes "���e���g�̔��f�͈ӊO�������ȁB";
		mes "�����o�[�S�����댯�ɎN���I������";
		mes "�I�ԂƂ͎v��Ȃ��������B";
		close;
	}
}

1@jtb.gat,195,200,5	script	�V�������V�[#12	10041,{
	cutin "shaloshi03.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�B";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}

1@jtb.gat,195,206,4	script	�j���I�[�Y#12	625,{
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�n�k�̉񐔂������Ă����ˁB";
	mes "�݂�ȑ��v�����H";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

1@jtb.gat,198,206,4	script	���e���g#12	630,{
	if(JTB_1QUE <= 11) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			if(checkquest(116508))
				set '@str$,"�}��";
			if(select('@str$,"��b������") == 1) {
				stopnpctimer;
				set JTB_1QUE,12;
				hideoffnpc getmdnpcname("12�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
				mes "�]���Ȃ��͋L����T��Ȃ���";
				mes "�@����}�����Ƃɂ����]";
				close2;
				hideonnpc getmdnpcname("�j���I�[�Y#12");
				hideonnpc getmdnpcname("�V�������V�[#12");
				end;
			}
		}
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�����A�݂�ȑ҂āI";
		mes "�����ς����I";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		cutin "nines01.bmp", 2;
		misceffect 563,"";
		mes "[�j���I�[�Y]";
		mes "����I�@�܂��n�k!?";
		next;
		cutin "nines01.bmp", 255;
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�܂����ȁB";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "��Ԃ̕��󂪎n�܂��Ă���悤���B";
		next;
		switch(select("�ȒP�Ɍ����m�肽��","�ڍׂɌ����m�肽��")) {
		case 1:
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y�����c�c�{���Ă�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���̋�Ԃƃy���͉���";
			mes "�֌W������̂����H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���́c�c������邽�߂ɁA";
			mes "�݂�Ȃ��U�������́B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�ǂ��������Ƃ�!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c����́c�c�B";
			next;
			emotion 0,getmdnpcname("�V�������V�[#12");
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���c�c�H";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("�y��#12a");
				hideoffnpc getmdnpcname("�y��#12b");
			}
			emotion 6,getmdnpcname("�y��#12b");
			mes "[�y��]";
			mes "�y���y���y��!!";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "���������Ă�݂����ł��ˁc�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "����c�c�B";
			mes "�킩�����c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�H";
			mes "�y���͉��Č����Ă���񂾂��H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�j���I�[�Y�c�c�B";
			mes "�݂�ȁc�c�B";
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				misceffect 316,getmdnpcname("�V�������V�[#12");
				misceffect 317,getmdnpcname("�V�������V�[#12");
			}
			next;
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "�ǂ������́H";
			mes "�������߂������Ȋ炵�Ă�́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "���߂�Ȃ����c�c";
			mes "�΂��΂��c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�I";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideonnpc getmdnpcname("�V�������V�[#12");
				hideonnpc getmdnpcname("�y��#12a");
				hideonnpc getmdnpcname("�y��#12b");
			}
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "���̃����X�^�[�����܂���I";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "������A�n�k!?";
			misceffect 563,"";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���A�̗l�q������������!!";
			mes "������������o����!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�c�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c���e�A�~���~���A�W���b�N�B";
			mes "�݂�Ȃ����肢����ˁB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A���O�܂����c�c!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���̎q�ɖ񑩂�������B";
			mes "�̂̉̂����������Ă�������āB";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "������A���̎q���}���ɂ����Ă���ˁB";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�j���I�[�Y�l!!";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				hideonnpc getmdnpcname("�j���I�[�Y#12");
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c���̃o�J�b!!";
			mes "���O��!!�@�j���I�[�Y��ǂ���!!";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�S���A�C���������߂�I";
			mes "���f����񂶂�˂���!!";
			set JTB_1QUE,12;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("12�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			}
			close2;
			cutin "rote03.bmp", 255;
			end;
		case 2:
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "��̉����N���Ă�̂�����B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�H";
			mes "�ǂ������������H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y�����c�c�{���Ă�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�y���H";
			next;
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "�y�����āA���̏�����";
			mes "�����X�^�[�̂��ƂȂ́H";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���́c�c���̗F�B�c�c�B";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�܂������Ă�́H";
			mes "����̓����X�^�[�Ȃ́I";
			mes "�l�ԂƂ͗F�B�ɂȂ�Ȃ��̂�I";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���i�C���A�V�������V�[�̘b��";
			mes "�����Ă����悤�B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�j���I�[�Y�l�c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���́c�c������邽�߂ɁA";
			mes "�݂�Ȃ��U�������́B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�ǂ��������Ƃ�!?";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c����́c�c�B";
			next;
			emotion 0,getmdnpcname("�V�������V�[#12");
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�y���c�c�H";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("�y��#12a");
				hideoffnpc getmdnpcname("�y��#12b");
			}
			emotion 6,getmdnpcname("�y��#12b");
			mes "[�y��]";
			mes "�y���y���y��!!";
			next;
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "���������Ă�݂����ł��ˁc�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "����c�c�B";
			mes "�킩�����c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�H";
			mes "�y���͉��Č����Ă���񂾂��H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�j���I�[�Y�c�c�B";
			mes "�݂�ȁc�c�B";
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				misceffect 316,getmdnpcname("�V�������V�[#12");
				misceffect 317,getmdnpcname("�V�������V�[#12");
			}
			next;
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "�ǂ������́H";
			mes "�������߂������Ȋ炵�Ă�́c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "���߂�Ȃ����c�c";
			mes "�΂��΂��c�c�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�V�������V�[�I";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideonnpc getmdnpcname("�V�������V�[#12");
				hideonnpc getmdnpcname("�y��#12a");
				hideonnpc getmdnpcname("�y��#12b");
			}
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "���̃����X�^�[�����܂���I";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "������A�n�k!?";
			misceffect 563,"";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���A�̗l�q������������!!";
			mes "������������o����!!";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�c�c�B";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c���e�A�~���~���A�W���b�N�B";
			mes "�݂�Ȃ����肢����ˁB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A���O�܂����c�c!!";
			next;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���̗B��̎����͐l��";
			mes "�R���������Ƃ�";
			mes "�Ȃ����ƂȂ񂾂�ˁ�";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���̎q�ɖ񑩂�������B";
			mes "�̂̉̂����������Ă�������āB";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "������A���̎q���}���ɂ����Ă���ˁB";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "�j���I�[�Y�l!!";
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				hideonnpc getmdnpcname("�j���I�[�Y#12");
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "�V�������V�[���S�z�����A";
			mes "���̓j���I�[�Y��ǂ���!!";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���āc�c�ǂ����邩��";
			mes "���Ȃ��ɔC�����B";
			mes "�M���h�}�X�^�[�B";
			next;
			cutin "gelca04.bmp", 2;
			mes "[�Q���J]";
			mes "�t��!!";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c������܂ł��ˁ[����!!";
			next;
			menu "�s���܂��傤�I",-;
			cutin "roel04.bmp", 2;
			mes "[���G��]";
			mes "�ځA�l�͍��A�җ��";
			mes "�������Ă��܂�!!";
			next;
			cutin "roel04.bmp", 255;
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#12");
			mes "[�����f�B�[�W���b�N]";
			mes "�����܂ŊÂ���񂾂ƁA";
			mes "����������Ă������ȁB";
			next;
			mes "[�����f�B�[�W���b�N]";
			mes "�c�c�t���B";
			mes "���f�����͂���Ȃ�B";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "��[���I�@�͂肫���ďo���I";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�S���A�C���������߂�I";
			mes "���f����񂶂�˂���!!";
			set JTB_1QUE,12;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideoffnpc getmdnpcname("12�ԕ����o��#JTB");
				announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
			}
			close2;
			cutin "rote03.bmp", 255;
			end;
		}
	} else {
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�j���I�[�Y�̖�Y�c�c";
		mes "��������Ȏ��΂���";
		mes "���₪���āc�c�B";
		close2;
		cutin "rote03.bmp", 255;
		if(getpartyleader(getcharid(1)) != strcharinfo(0))
			announce "�]���̕��p���牜�֐i�����]", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		end;
	}
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

1@jtb.gat,194,200,5	script	�y��#12a	10047,{
	end;
}

1@jtb.gat,196,200,5	script	�y��#12b	10047,{
	end;
}

//==========================================
// �g���l�������F��������
//------------------------------------------
1@jtb.gat,318,358,5	script	�j���I�[�Y#21	625,{
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����c�c";
	mes strcharinfo(0) + "!?";
	next;
	menu "�o�܂�b��",-;
	mes "[�j���I�[�Y]";
	mes "�Ȃ�قǁB�݂�Ȏ���ǂ���";
	mes "�����Ɍ������Ă���Ă���񂾂ˁB";
	mes "��͂莝�ׂ����̂�";
	mes "�M���h�����o�[���ˁI";
	next;
	mes "[�j���I�[�Y]";
	mes "�ł͎������͐��";
	mes "�V�������V�[��T�����B";
	mes "�����N���邩�킩��Ȃ�����A";
	mes "�퓬���������͖Y�ꂸ�ɂˁB";
	next;
	mes "[�j���I�[�Y]";
	mes "�����������I";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

//==========================================
// 22�ԕ���NPC�F��������
//------------------------------------------
1@jtb.gat,324,327,4	script	�y��#22	10047,{
	mes "[�y��]";
	mes "�y���I�@�y���I";
	close;
}

1@jtb.gat,324,327,4	script	�y��#23	10048,{
}

1@jtb.gat,326,329,4	script	�V�������V�[#22	10041,{
	cutin "shaloshi03.bmp", 2;
	mes "[�V�������V�[]";
	mes "�ǂ����āc�c�B";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}

1@jtb.gat,320,323,5	script	�j���I�[�Y#22	625,{
	cutin "nines04.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�͂��A�͂��c�c";
	mes "�����A�������ɂ���̂́c�c�I";
	next;
	if(getpartyleader(getcharid(1)) == strcharinfo(0))
		stopnpctimer;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���A�������������B";
	mes "�����Ȃł�ƈ��S����񂾂��āB";
	mes "�j���I�[�Y�������Ă��ꂽ�B";
	next;
	cutin "shaloshi02.bmp", 255;
	mes "[�y��]";
	mes "�y���[�B";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y�����������́H";
	mes "���肪�Ƃ��B�ł��A";
	mes "�y���͎���菬�������疳������B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���������B";
	mes "�V�������V�[�̓��𕏂ł�̂́A";
	mes "���B�̓���������ˁB";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�j���I�[�Y�c�c";
	mes strcharinfo(0) + "�c�c";
	mes "�ǂ����āc�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�V�������V�[�A";
	mes "�N�Ƃ����Ƙb���������ĂˁB";
	next;
	mes "[�j���I�[�Y]";
	mes "���݂̂�Ȃ���������";
	mes "�������Ă�݂����Ȃ񂾂��ǁA";
	mes "�܂������Ă�̂��ȁH";
	mes "�����͖����₷���݂���������ˁB";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�����₷���c�c";
	mes "�݂�Ȃ�����Ȃ��̂�";
	mes "���̂�����������Ȃ��B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�V�������V�[�B";
	mes "���̂����������āA�ǂ������c�c";
	next;
	cutin "nines01.bmp", 255;
	mes "[�y��]";
	mes "�y�������������c�c";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���H";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���A���͑��v�B";
	mes "������c�c";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�c�c�y���͂Ȃ�āH";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "����A�ꋎ�낤�Ƃ���l�Ԃ�";
	mes "�����Ȃ����āc�c";
	mes "�c�c�y���H";
	next;
	if(getpartyleader(getcharid(1)) == strcharinfo(0))
		misceffect 173,getmdnpcname("�y��#22");
	cutin "shaloshi01.bmp", 255;
	mes "[�y��]";
	mes "�y���y���I�y���y��!!";
	next;
	if(getpartyleader(getcharid(1)) == strcharinfo(0))
		misceffect 173,getmdnpcname("�y��#22");
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�ǂ����悤�c�c";
	mes "�y���̗͂����܂��Ă����c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�y���A���������񂾁B";
	mes "���͌N�̗F�B��D�����肵�Ȃ���B";
	mes "���������V�������V�[�Ɓc�c�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�y���c�c���肢�c�c";
	mes "�b�𕷂��āc�c�B";
	next;
	cutin "shaloshi01.bmp", 255;
	mes "[�y��]";
	mes "�y���y���A�y���y���A�y���I";
	next;
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		misceffect 173,getmdnpcname("�y��#22");
		misceffect 90,getmdnpcname("�y��#23");
		misceffect 183,getmdnpcname("�y��#23");
		hideonnpc getmdnpcname("�y��#22");
		hideoffnpc getmdnpcname("�y��#23");
	}
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�y���̎p���c�c!!";
	mes "�c�c�ӂ��B�ǂ����A";
	mes "�����������Ȃ����Ċ������ˁB";
	mes "�d���Ȃ��A�킨���B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�ł��c�c";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�j���I�[�Y�c�c";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "����c�c�M����c�c";
	mes "������A�y�����~�߂āc�c�I";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�����I�@�������ɔC���āI";
	close2;
	cutin "nines03.bmp", 255;
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		announce "�j���I�[�Y : �V�������V�[�̗F�B�Ɏ�r�Ȑ^���͂������Ȃ����ǁA���͂���Ȃ��ƌ����Ă�ꍇ����Ȃ��ˁI", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		if(!sleep2(3000)) end;
		announce "�j���I�[�Y : �y��!!�@�N���~�߂āA�݂�ȂŘb���������񂾁I�@������c�c", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		if(!sleep2(3000)) end;
		announce "�j���I�[�Y : ���������S�͂ł�����!!", 0x9, 0xffff00, 0x0190, 16, 0, 0;
		if(!sleep2(3000)) end;
		donpcevent getmdnpcname("jitter_control22")+"::OnStart";
	}
	end;
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

1@jtb.gat,320,323,5	script	�j���I�[�Y#boss	625,{
	end;
OnStart:
	unittalk getnpcid(0,getmdnpcname("�j���I�[�Y#boss")),"�j���I�[�Y : �������͂��邩��A�S�z���p���I";
	initnpctimer;
OnTimer30000:
	set '@rnd,rand(1,5);
	switch('@rnd) {
	case 1:
		unittalk getnpcid(0,"�j���I�[�Y#boss"),"�j���I�[�Y : �o�i�i�������Ă��H�@����ȃo�i�i�I";
		break;
	case 2:
		unittalk getnpcid(0,"�j���I�[�Y#boss"),"�j���I�[�Y : �r�t���X�g�œ���H�ׂ��̂��B�@���j���[�̓��[�X�g�r�[�t�I";
		break;
	case 3:
		unittalk getnpcid(0,"�j���I�[�Y#boss"),"�j���I�[�Y : �W���o�̈Ӗ��H�@����Ȃ̃W���o�I";
		break;
	case 4:
		unittalk getnpcid(0,"�j���I�[�Y#boss"),"�j���I�[�Y : ���������I";
		break;
	case 5:
		unittalk getnpcid(0,"�j���I�[�Y#boss"),"�j���I�[�Y : ������Ƒ҂��āB�E�N�����̌����؂�ĉ��t���ł��Ȃ��c�c�B�̂ł��̂��Ă��������H";
		break;
	}
	emotion 2;
	set '@boss,getvariableofnpc('boss,getmdnpcname("jitter_control22"));
	mobuseskill '@boss, 89, 1, 0, 0, 63, 0, 0;	//�X�g�[���K�X�g
	mobuseskill '@boss, 664, 5, 0, 0, -1, 0, 0;	//���C�h�t���[�Y
	initnpctimer;
	end;
}

//==========================================
// 23�ԕ���NPC�F���������i22�ԂƓ����}�b�v�j
//------------------------------------------
1@jtb.gat,328,326,4	script	���e���g#23	630,{
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���O��I�@�������������c�c�B";
	mes "�S�z�����₪���āI";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

1@jtb.gat,330,328,4	script	�Q���J#23	629,{
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "����Ȃɋ������ȃ����X�^�[��";
	mes "�|���Ă��܂��Ȃ�āA";
	mes strcharinfo(0) + "�������";
	mes "����������ł��ˁI";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}

1@jtb.gat,329,323,4	script	�~���~��#23	643,{
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���Ȃ��A���\���̂ˁB";
	mes "������ȃ��e���g�ɕς����";
	mes "���������B";
	mes "�j���I�[�Y�������Ă����";
	mes "���肪�Ƃ��B";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}

1@jtb.gat,317,325,5	script	�A�C�O#23	646,{
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "���̃����X�^�[�c�c";
	mes "���ł���ȂɃV�������V�[�̎���";
	mes "��낤�Ƃ��Ă��񂾂낤�c�c�B";
	close2;
	cutin "igu01.bmp", 255;
	end;
}

1@jtb.gat,316,322,5	script	���M#23	647,{
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�������ł������B";
	mes "���̃����X�^�[�̏o�����F�c�c";
	mes "�����ƁA�V�������V�[����낤��";
	mes "�K����������ł��傤�˂��B";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}

1@jtb.gat,319,320,5	script	�A����#23	644,{
	cutin "arang02.bmp", 2;
	mes "[�A����]";
	mes "���������������Ŋi�D�ǂ�";
	mes "�����X�^�[�������ˁI";
	mes "����Ȃ̂�|�����Ⴄ�Ȃ��";
	mes strcharinfo(0) + "��";
	mes "�����Ȃ��I";
	close2;
	cutin "arang01.bmp", 255;
	end;
}

1@jtb.gat,319,328,5	script	���i�C��#23	10039,{
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "���A���\��邶��Ȃ��B";
	mes "���́A����Ƃ����ĂȂ��H";
	mes "�j���I�[�Y�l�̎��Ȃ�";
	mes "�q�[�����Ă�������B";
	close2;
	cutin "lunain01.bmp", 255;
	end;
}

1@jtb.gat,325,321,4	script	���G��#23	10040,{
	cutin "roel04.bmp", 2;
	mes "[���G��]";
	mes "�������ł������I";
	mes "�����Ƃ������ɂ����ɗ��Ă�";
	mes "�\���󂠂�܂���!!";
	close2;
	cutin "roel01.bmp", 255;
	end;
}

1@jtb.gat,322,321,4	script	�����f�B�[�W���b�N#23	844,{
	emotion 9;
	mes "[�����f�B�[�W���b�N]";
	mes "�����A���̃����X�^�[�͂܂�";
	mes "��������悤�����B";
	mes "�������Ă����Ɩʓ|���A";
	mes "�������Ǝ~�߂��h���Ă����B";
	close;
}

1@jtb.gat,324,327,4	script	�y��#25	10047,{
	mes "[�y��]";
	mes "�y�������c�c�B";
	close;
}

1@jtb.gat,326,329,4	script	�V�������V�[#23	10041,{
	cutin "shaloshi03.bmp", 2;
	mes "[�V�������V�[]";
	mes "�݂�ȁc�c�B";
	close2;
	cutin "shaloshi03.bmp", 255;
	end;
}

1@jtb.gat,320,323,5	script	�j���I�[�Y#23	625,{
	if(JTB_2QUE == 7)
		set '@str$,"�}��";
	if(select('@str$,"��b������") == 1) {
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		set JTB_1QUE,23;
		close2;
		initnpctimer getmdnpcname("�j���I�[�Y#end");
		mes "�]���Ȃ��͋L����T��Ȃ���";
		mes "�@����}�����Ƃɂ����]";
		misceffect 317,getmdnpcname("�V�������V�[#23");
		misceffect 317,getmdnpcname("�y��#25");
		close2;
		hideonnpc getmdnpcname("�V�������V�[#23");
		hideonnpc getmdnpcname("�y��#25");
		warp getmdmapname("1@jtb.gat"),360,23;
		end;
	}
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�ӂ��A�����Ԃ�ƃ^�t�������ˁB";
	mes "����ŏ����͑�l�����Ȃ邩�ȁH";
	next;
	if(getpartyleader(getcharid(1)) == strcharinfo(0))
		stopnpctimer;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "����ƌ������c�c!!";
	mes "���O��A���v��!!";
	next;
	switch(JTB_2QUE) {
	case 0:
		if(select("�ȒP�ɘb�𕷂�����","�ڂ����b�𕷂�����")) {
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "�Ƃ肠������������o�܂��傤�B";
			mes "�b�͂��ꂩ���B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A�������ȁB";
			mes "�������o������������˂��B";
			mes "�����Ɍ���������񂶂�Ȃ����H";
			next;
			cutin "rote01.bmp", 255;
			mes "�]�߂������ɘb���o���V�������V�[�B";
			mes "�@�V�������V�[�̘b����A";
			mes "�@�ޏ��͖��������N�ɍ��ꂽ";
			mes "�@�g�k�ł��邱�Ƃ����o�����]";
			next;
			mes "�]�j���I�[�Y�́A�V�������V�[��";
			mes "�@���H�M���h�Ɍ}���悤�ƒ�Ă��邪�A";
			mes "�@�M���h�����o�[�̔�����";
			mes "�@���ɗ₽�����̂������]";
			next;
			mes "�]�����Ɍ�����ꂽ�����̈Ӗ���";
			mes "�@�@�����V�������V�[��";
			mes "�@�������ɏ����Ă��܂����c�c�]";
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				misceffect 317,getmdnpcname("�V�������V�[#23");
				misceffect 317,getmdnpcname("�y��#25");
			}
			next;
			if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
				hideonnpc getmdnpcname("�V�������V�[#23");
				hideonnpc getmdnpcname("�y��#25");
			}
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c";
			next;
			mes "[���e���g]";
			mes "�`�b�c�c";
			mes "���O��A�������ƋA�邼�I";
			mes "��������B";
			set JTB_1QUE,23;
			close2;
			initnpctimer getmdnpcname("�j���I�[�Y#end");
			warp getmdmapname("1@jtb.gat"),360,23;
			end;
		} else {
			cutin "rote01.bmp", 255;
			mes "[�����f�B�[�W���b�N]";
			mes "���̃����X�^�[�A";
			mes "�������Ă������肩�H";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����œ|���ˁ[�ƁA";
			mes "�܂��P���Ă��邩���m��Ȃ����B";
			mes "�Ȃ�Ȃ�ޖ��E��̈����ƌĂ΂��";
			mes "���̗͂������Ă�낤���B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�_���I�@�y���͎��̗F�B�B";
			next;
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "�V�������V�[�c�c�B";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�����͎��ׂ̈�";
			mes "�y��������Ă��ꂽ��ԁc�c�B";
			mes "�y�����\��������A�������";
			mes "���̋�Ԃ������ĂȂ��Ȃ�B";
			mes "�����ɂ���S�����܂߂āB";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����̂��肩�c�c!!";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "�Ƃ肠������������o�܂��傤�B";
			mes "�b�͂��ꂩ���B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A�������ȁB";
			mes "�������o������������˂��B";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���炭�����ǁA";
			mes "���̋�Ԃ���E�o�ł��Ȃ�������";
			mes "���̎q�ɂ���񂶂�Ȃ�������H";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "�ǂ��������ƁH";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���̋�Ԃ̓y�̏�Ԃ𒲂ׂ��Ƃ��ɁA";
			mes "���󂵂������N�̊X�Ɠ������͂�";
			mes "���͂Ȃ��犴������B";
			next;
			mes "[�~���~��]";
			mes "�����đ�������n�k�B";
			mes "���̎q���s�������ɂ��Ă�����";
			mes "����V�����肵������";
			mes "�N�����Ă����悤�Ɍ������B";
			next;
			mes "[�~���~��]";
			mes "���̋�ԁA���Ȃ��̐��_�c�c";
			mes "�C�����Ƀ����N���Ă�񂶂�Ȃ��H";
			mes "�������ɋA���Ăق����Ȃ��A";
			mes "���Ȃ��������v���Ă邩��";
			mes "�o���������񂶂�Ȃ��̂�����B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c�B";
			next;
			mes "[�V�������V�[]";
			mes "���͂����F�B���~�������������B";
			mes "�݂�Ȃ�����߂����Ȃ��";
			mes "�Ȃ������c�c�B";
			next;
			mes "[�V�������V�[]";
			mes "�ł��A�o���������Ă��܂����B";
			mes "�݂�Ȃɖ��f�������c�c�B";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "��Ԃ����R�Ɏx�z����͂Ȃ�āc�c�B";
			mes "�����Ă��̖��͂̊����c�c";
			mes "���Ȃ��A��̉��҂Ȃ́H";
			mes "���ꂾ���L�����߂��Ă���悤�Ȃ�";
			mes "�����ł�����ˁH";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c���́c�c";
			next;
			mes "[�V�������V�[]";
			mes "���͎����̋��ԂŐ��܂ꂽ�����B";
			mes "���������N�ɍ��ꂽ";
			mes "��O�̎g�k�A�V�������V�[�B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�����A�����Č������I";
			mes "�����N����!?";
			next;
			cutin "rote03.bmp", 255;
			mes "[�����f�B�[�W���b�N]";
			mes "���������N�ɍ��ꂽ���݁B";
			mes "�������߁A�����̖��ƌ������Ƃ��납�B";
			mes "�c�c�Ȃ�قǁB";
			mes "����ŉ��������͂��������̂��B";
			next;
			cutin "lunain02.bmp", 2;
			mes "[���i�C��]";
			mes "�c�c�ǂ��������Ƃ�A����c�c�B";
			next;
			cutin "igu05.bmp", 2;
			mes "[�A�C�O]";
			mes "���������N�̎g�k�c�c!?";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "����ς肱���A�����Łc�c�I";
			next;
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "����͍���܂����˂��B";
			mes "�V�������V�[�Ɛ키���R��";
			mes "�ł��Ă��܂��܂����c�c�B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�ł��A���S���āB";
			mes "���͍��A�����N�Ƃ̌q����͂Ȃ��B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�q����͂Ȃ����āc�c";
			mes "�ǂ������������H";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "���������N���|���ꂽ�B";
			mes "������A�����N�Ƃ̌q���肪";
			mes "�Ȃ��Ȃ����B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "���Q�ڂ������ƌ����Ă₪��I";
			mes "����Șb�����ĂȂ����I";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "���̋�Ԃ͊O�Ƃ͎��Ԃ̗��ꂪ�Ⴄ�B";
			mes "�݂�ȂɂƂ��Ă͉ߋ������m��Ȃ���";
			mes "������������Ȃ��B";
			mes "���������N��|�����̂����āc�c�B";
			next;
			cutin "shaloshi01.bmp", 255;
			mes "�]�V�������V�[�͈�u";
			mes "�@������ɖڂ�������ƁA";
			mes "�@�����Ɏ�����߂����]";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "�c�c������A���͎��R�̐g�B";
			mes "�ł��A�������������Ď�����";
			mes "�ς��Ȃ��B";
			next;
			cutin "shaloshi01.bmp", 2;
			mes "[�V�������V�[]";
			mes "���͈���������c�c";
			mes "�ꏏ�ɋ����Ⴂ���Ȃ����āc�c";
			mes "�����v���āc�c������c�c�B";
			next;
			cutin "gelca02.bmp", 2;
			mes "[�Q���J]";
			mes "�V�������V�[�����c�c";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�˂��A���e�A�݂�ȁB";
			next;
			mes "[�j���I�[�Y]";
			mes "�c�c���͈������Ƃ��֌W�Ȃ��A";
			mes "���̃V�������V�[���D�������A";
			mes "���ꂩ����͂ɂȂ��Ă��������񂾁B";
			next;
			mes "[�j���I�[�Y]";
			mes "������c�c���̓V�������V�[��";
			mes "���H�M���h�Ɍ}�����ꂽ���B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�j���I�[�Y�A���O�c�c";
			mes "���������������Ă��邩�A";
			mes "�킩���Ă�̂�!?";
			next;
			mes "[���e���g]";
			mes "�����͈������B";
			mes "���O�͂������A";
			mes "��������������Ȃ�����";
			mes "�ۏ؂ł���̂��H";
			next;
			mes "[���e���g]";
			mes "�����N�̗͂��������āA";
			mes "����������������Ȃ����ĕۏ؂́H";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�c�c�����S���A�ӔC������B";
			mes "������V�������V�[���c�c";
			next;
			cutin "nines01.bmp", 255;
			mes "[�����f�B�[�W���b�N]";
			mes "�ň��̎��Ԃ�z�肵�Ă݂�B";
			mes "���O�̐ӔC������";
			mes "�ςޖ��ł͂Ȃ����낤�B";
			next;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�W���b�N�c�c";
			mes "�ŁA�ł��A���݂̂�Ȃ������Ɓc�c";
			next;
			cutin "nines01.bmp", 255;
			mes "�]�����ĉ������������Ƃ���";
			mes "�@�j���I�[�Y���Ղ邩�̂悤��";
			mes "�@�V�������V�[�������J�����]";
			next;
			cutin "shaloshi02.bmp", 2;
			mes "[�V�������V�[]";
			mes "�j���I�[�Y�A���肪�Ƃ��B";
			mes "�c�c�ł��B";
			next;
		}
		break;
	case 1:
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�A����ɂ݂�Ȃ��B";
		mes "����"+strcharinfo(0)+"��";
		mes "���v����B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�y���A���v�H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂�ˁA�y���������Ă��܂��āB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "������A�����͎��ɂ��邩��c�c�B";
		next;
		cutin "rote01.bmp", 255;
		mes "�]�j���I�[�Y�ƃV�������V�[��";
		mes "�@�b�����Ă���B�����ɑ��̃����o�[��";
		mes "�@�삯���Ă����]";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���̋�ԁA���O�����������҂�!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���́c�c";
		next;
		mes "[�V�������V�[]";
		mes "���͎����̋��ԂŐ��܂ꂽ�����B";
		mes "���������N�ɍ��ꂽ";
		mes "��O�̎g�k�A�V�������V�[�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�V�������V�[�̌��t�ɓ��h�����钆�A";
		mes "�@���M�����l�q���Ⴄ�C�������]";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�˂��A���e�A�݂�ȁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�c�c���͈������Ƃ��֌W�Ȃ��A";
		mes "���̃V�������V�[���D�������A";
		mes "���ꂩ����͂ɂȂ��Ă��������񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "������c�c���̓V�������V�[��";
		mes "���H�M���h�Ɍ}�����ꂽ���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�A���O�c�c";
		mes "���������������Ă��邩�A";
		mes "�킩���Ă�̂�!?";
		next;
		mes "[���e���g]";
		mes "�����͈������B";
		mes "���O�͂������A";
		mes "��������������Ȃ�����";
		mes "�ۏ؂ł���̂��H";
		next;
		mes "[���e���g]";
		mes "�����N�̗͂��������āA";
		mes "����������������Ȃ����ĕۏ؂́H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�c�c�����S���A�ӔC������B";
		mes "������V�������V�[���c�c";
		next;
		cutin "nines01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "�ň��̎��Ԃ�z�肵�Ă݂�B";
		mes "���O�̐ӔC������";
		mes "�ςޖ��ł͂Ȃ����낤�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�W���b�N�c�c";
		mes "�ŁA�ł��A���݂̂�Ȃ������Ɓc�c";
		next;
		cutin "nines01.bmp", 255;
		mes "�]�d�ꂵ�����ق������B";
		mes "�@����ƒN���������J�����]";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�l�͂����珬�����q���Ƃ͂����A";
		mes "������߂��܂���͍̂D������";
		mes "�Ȃ���ł���˂��B";
		mes "��͂菗���Ɉ�Ԏ������̂́A";
		mes "�Ί炾�Ǝv���܂����B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�Ƃ������ƂŖl�̓V�������V�[��";
		mes "���ԂɈ������荞�ނ��ƂɁA";
		mes "��[�ł��˂��B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���肪�Ƃ��A���M�I";
		next;
		cutin "nines03.bmp", 255;
		mes "�]����𕷂��A��u�V�������V�[��";
		mes "�@�\��ς�����C�������̂����̊�";
		mes "�@�V�������V�[�͂����������]";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���M�A�������B";
		mes "�c�c���肪�Ƃ��B";
		mes "�c�c�ł��B";
		next;
		break;
	case 2:
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�A����ɂ݂�Ȃ��B";
		mes "����"+strcharinfo(0)+"��";
		mes "���v����B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�y���A���v�H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂�ˁA�y���������Ă��܂��āB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "������A�����͎��ɂ��邩��c�c�B";
		next;
		cutin "rote01.bmp", 255;
		mes "�]�j���I�[�Y�ƃV�������V�[��";
		mes "�@�b�����Ă���B�����ɑ��̃����o�[��";
		mes "�@�삯���Ă����]";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���̋�ԁA���O�����������҂�!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���́c�c";
		next;
		mes "[�V�������V�[]";
		mes "���͎����̋��ԂŐ��܂ꂽ�����B";
		mes "���������N�ɍ��ꂽ";
		mes "��O�̎g�k�A�V�������V�[�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�V�������V�[�̌��t�ɓ��h�����钆�A";
		mes "�@�Ȃ����~���~���ƃA�����̗l�q��";
		mes "�@��a�����������]";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�˂��A���e�A�݂�ȁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�c�c���͈������Ƃ��֌W�Ȃ��A";
		mes "���̃V�������V�[���D�������A";
		mes "���ꂩ����͂ɂȂ��Ă��������񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "������c�c���̓V�������V�[��";
		mes "���H�M���h�Ɍ}�����ꂽ���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�A���O�c�c";
		mes "���������������Ă��邩�A";
		mes "�킩���Ă�̂�!?";
		next;
		mes "[���e���g]";
		mes "�����͈������B";
		mes "���O�͂������A";
		mes "��������������Ȃ�����";
		mes "�ۏ؂ł���̂��H";
		next;
		mes "[���e���g]";
		mes "�����N�̗͂��������āA";
		mes "����������������Ȃ����ĕۏ؂́H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�c�c�����S���A�ӔC������B";
		mes "������V�������V�[���c�c";
		next;
		cutin "nines01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "�ň��̎��Ԃ�z�肵�Ă݂�B";
		mes "���O�̐ӔC������";
		mes "�ςޖ��ł͂Ȃ����낤�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�W���b�N�c�c";
		mes "�ŁA�ł��A���݂̂�Ȃ������Ɓc�c";
		next;
		cutin "nines01.bmp", 255;
		mes "�]�d�ꂵ�����ق������B";
		mes "�@����ƒN���������J�����]";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�����V�������V�[�̂��o�����ɁA";
		mes "�~���~�����搶�ɂȂ��āA";
		mes "���������Ȃ��悤�ɋ������I";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�܂��A����W�͕K�v���낤���A";
		mes "���͕ʂɍ\��Ȃ����B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "������A���B��������肢!!";
		mes "�V�������V�[�����̃M���h��";
		mes "�M���h�����o�[�Ƃ��āA";
		mes "�F�߂Ă����āI�@���肢�I";
		next;
		cutin "nines03.bmp", 255;
		mes "�]����𕷂��A��u�V�������V�[��";
		mes "�@�\��ς�����C�������̂����̊�";
		mes "�@�V�������V�[�͂����������]";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�A�����A�~���~�����肪�Ƃ��B";
		mes "�c�c�M���ĖႦ�Ċ������B";
		mes "�c�c�ł��B";
		next;
		break;
	case 3:
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "����ƌ������c�c!!";
		mes "���O��A���v��!!";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�A����ɂ݂�Ȃ��B";
		mes "����"+strcharinfo(0)+"��";
		mes "���v����B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�y���A���v�H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂�ˁA�y���������Ă��܂��āB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "������A�����͎��ɂ��邩��c�c�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�j���I�[�Y�ƃV�������V�[��";
		mes "�@�b�����Ă���B�����ɑ��̃����o�[��";
		mes "�@�삯���Ă����]";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���̋�ԁA���O�����������҂�!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���́c�c";
		next;
		mes "[�V�������V�[]";
		mes "���͎����̋��ԂŐ��܂ꂽ�����B";
		mes "���������N�ɍ��ꂽ";
		mes "��O�̎g�k�A�V�������V�[�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�V�������V�[�̌��t�ɓ��h�����钆�A";
		mes "�@�Q���J�ƃ��G����";
		mes "�@�ڔz�������̂��������]";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�˂��A���e�A�݂�ȁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�c�c���͈������Ƃ��֌W�Ȃ��A";
		mes "���̃V�������V�[���D�������A";
		mes "���ꂩ����͂ɂȂ��Ă��������񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "������c�c���̓V�������V�[��";
		mes "���H�M���h�Ɍ}�����ꂽ���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�A���O�c�c";
		mes "���������������Ă��邩�A";
		mes "�킩���Ă�̂�!?";
		next;
		mes "[���e���g]";
		mes "�����͈������B";
		mes "���O�͂������A";
		mes "��������������Ȃ�����";
		mes "�ۏ؂ł���̂��H";
		next;
		mes "[���e���g]";
		mes "�����N�̗͂��������āA";
		mes "����������������Ȃ����ĕۏ؂́H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�c�c�����S���A�ӔC������B";
		mes "������V�������V�[���c�c";
		next;
		cutin "nines01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "�ň��̎��Ԃ�z�肵�Ă݂�B";
		mes "���O�̐ӔC������";
		mes "�ςޖ��ł͂Ȃ����낤�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�W���b�N�c�c";
		mes "�ŁA�ł��A���݂̂�Ȃ������Ɓc�c�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�d�ꂵ�����ق������B";
		mes "�@����ƒN���������J�����]";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�t���B";
		mes "�V�������V�[����񂪂����A";
		mes "�Ԉ�������ɐi�񂾂�c�c";
		mes "�����ӔC�������ē|���܂��B";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "�����玄��������肢���܂��B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�l���S�͂�";
		mes "�V�������V�[������~�߂܂��I";
		mes "�~�߂Č����܂�!!";
		next;
		mes "[���G��]";
		mes "�Q���J����Ɠ������A";
		mes "�l��������肢���܂�!!";
		next;
		cutin "roel01.bmp", 255;
		mes "�]����𕷂��A��u�V�������V�[��";
		mes "�@�\��ς�����C�������̂����̊ԁA";
		mes "�@�V�������V�[�͂����������]";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�Q���J�A���G���c�c���肪�Ƃ��B";
		mes "�c�c��l�̋C�����A�`������B";
		mes "�c�c�ł��B";
		next;
		break;
	case 4:
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�A����ɂ݂�Ȃ��B";
		mes "����"+strcharinfo(0)+"��";
		mes "���v����B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�y���A���v�H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂�ˁA�y���������Ă��܂��āB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "������A�����͎��ɂ��邩��c�c�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�j���I�[�Y�ƃV�������V�[��";
		mes "�@�b�����Ă���B�����ɑ��̃����o�[��";
		mes "�@�삯���Ă����]";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���̋�ԁA���O�����������҂�!?";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���́c�c";
		next;
		mes "[�V�������V�[]";
		mes "���͎����̋��ԂŐ��܂ꂽ�����B";
		mes "���������N�ɍ��ꂽ";
		mes "��O�̎g�k�A�V�������V�[�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�V�������V�[�̌��t�ɓ��h�����钆�A";
		mes "�@�A�C�O�ƃ��i�C����";
		mes "�@���ɗ��������Ă���悤�Ɍ������]";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�˂��A���e�A�݂�ȁB";
		next;
		mes "[�j���I�[�Y]";
		mes "�c�c���͈������Ƃ��֌W�Ȃ��A";
		mes "���̃V�������V�[���D�������A";
		mes "���ꂩ����͂ɂȂ��Ă��������񂾁B";
		next;
		mes "[�j���I�[�Y]";
		mes "������c�c���̓V�������V�[��";
		mes "���H�M���h�Ɍ}�����ꂽ���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�j���I�[�Y�A���O�c�c";
		mes "���������������Ă��邩�A";
		mes "�킩���Ă�̂�!?";
		next;
		mes "[���e���g]";
		mes "�����͈������B";
		mes "���O�͂������A";
		mes "��������������Ȃ�����";
		mes "�ۏ؂ł���̂��H";
		next;
		mes "[���e���g]";
		mes "�����N�̗͂��������āA";
		mes "����������������Ȃ����ĕۏ؂́H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�c�c�����S���A�ӔC������B";
		mes "������V�������V�[���c�c";
		next;
		cutin "nines01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "�ň��̎��Ԃ�z�肵�Ă݂�B";
		mes "���O�̐ӔC������";
		mes "�ςޖ��ł͂Ȃ����낤�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�W���b�N�c�c";
		mes "�ŁA�ł��A���݂̂�Ȃ������Ɓc�c";
		next;
		cutin "nines01.bmp", 255;
		mes "�]�d�ꂵ�����ق������B";
		mes "�@����ƒN���������J�����]";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�ӔC�A�ӔC���āc�c";
		mes "�����ꏏ�ɉ��Ƃ����Ă����Ă��炢��";
		mes "�������悳�����Ȃ�����c�c�B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���݂͂�ȍD�������ǁc�c";
		mes "���̒��ɂ���ς�";
		mes "�V�������V�[�����ė~�����́I";
		next;
		cutin "igu05.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "���̓A�C�O�Ɋ댯���y�΂Ȃ���΁A";
		mes "�A�C�O�̈ӌ��𑸏d�������B";
		mes "���ꂾ�����ȁB";
		next;
		mes "�]����𕷂��A��u�V�������V�[��";
		mes "�@�\��ς�����C�������̂����̊ԁA";
		mes "�@�V�������V�[�͂����������]";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�����f�B�W���b�N�A���v�B";
		mes "�댯�Ȗڂɂ��킹��C�͂Ȃ��B";
		mes "���i�C���A�A�C�O�c�c�B";
		mes "�����c�c2�l�͑�D���B";
		mes "�ł��c�c�B";
		next;
		break;
	case 5:
	case 6:
	case 7:
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�A����ɂ݂�Ȃ��B";
		mes "����"+strcharinfo(0)+"��";
		mes "���v����B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�y���A���v�H";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���߂�ˁA�y���������Ă��܂��āB";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "������A�����͎��ɂ��邩��c�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�킩���Ă�񂶂�ˁ[���B";
		mes "�Ȃ�A�b�͑�������B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���e�c�c�B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���O�炾���Ċ����Ă�͂����B";
		mes "�L���͂͂�����͂��ˁ[���A";
		mes "����Șb���������x��";
		mes "�J��Ԃ��Ă���Ă��Ƃ��B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���ꂱ���A�����Ɗւ���";
		mes "�낭�Ȃ��ƂɂȂ�Ȃ����Ă��Ƃ�";
		mes "�ؖ�����!!";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A�����͈������Ƃ�";
		mes "�֌W�Ȃ��񂶂�Ȃ��H";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�M���h�����o�[�ɂ��ւ��ƁA";
		mes "�낭�Ȃ��ƂɂȂ�Ȃ��l�Ԃ�����񂾂��H";
		mes "�˂��H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���́A��������c�c�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�����y�����A����ȏ�";
		mes "���f���������Ȃ��c�c�B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "����ȏ�H";
		mes "�������łɖ��f�������Ă�񂾂�!!";
		mes "�킩���Ă�̂���!?";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "������A���e���g�c�c";
		mes "�N�ɂ����f�����Ȃ��Ȃ�āA";
		mes "��������!!";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�l�Ԃƈ���������f�̓x�������A";
		mes "�S�R�Ⴄ����I";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�����Ɛl�Ԃ͈Ⴄ�c�c";
		mes "����͂悭�킩�����B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����肪��������ˁ[���B";
		mes "���̂��炢�f������ˁ[�ƂȁB";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�����������e���g�����A";
		mes "�M���h�}�X�^�[�����Ȃ�A";
		mes "�����o�[�̋C������";
		mes "�����͗����������Ȃ�����c�c�I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�n�b�I";
		mes "�����j���I�[�Y�݂����ȊÂ����ŁA";
		mes "����ȃz�C�z�C�������̃����X�^�[����";
		mes "�ȒP�ɒ��Ԃɂ��Ă�����A";
		mes "���̂����M���h�͕��󂷂邺�H";
		mes "����ł������̂���H";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���̂�����";
		mes "����Ȃ��ƂɂȂ�̂͌��B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���e���g�A���ꂶ�Ⴀ�܂��";
		mes "�V�������V�[�������߂Ă�";
		mes "�݂����Ȃ́c�c�B";
		mes "�V�������V�[�������́B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���������Ă�񂾁A�A�C�O�B";
		mes "���͎����������Ă��邾�����B";
		mes "�������������Ɋ���Ȃ�ĂȂ��񂾁A";
		mes "�������Ȃɂ��Ȃ�����B";
		next;
		cutin "rote01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "����������A�l�Ԃ������";
		mes "�푰�����ŕ��������߂���̂́A";
		mes "�������v�ł͂Ȃ����H";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�ǂ��������Ƃ��H";
		next;
		cutin "rote01.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#23");
		mes "[�����f�B�[�W���b�N]";
		mes "����𗝉����A�ӎv�̑a�ʂ�}���Ȃ�";
		mes "�čl�̗]�n�͂���A�Ƃ��������B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�݂�Ȃ̊���c�c�B";
		mes "�Ȃ�ƂȂ��c�c�킩��B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�������������̊���킩�낤��";
		mes "�������������̊�����킩��Ȃ����";
		mes "�Ӗ���������˂����c�c�I";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�t���B�V�������V�[��������";
		mes "�\��̕ω����R����������";
		mes "����͂���Ǝv�����Ƃ�";
		mes "����Ƃ���܂�����!!";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�����ł����ǁc�c";
		mes "�����\�����邱�Ƃ����Ȃ����ŁA";
		mes "�l�B�Ɠ����悤�Ɋ����";
		mes "����̂ł͂Ȃ��ł��傤���H";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�S�������Ă��̃K�L�Ɋ������Ƃ��āA";
		mes "��������S���A���ԂɂȂ�܂��傤����";
		mes "�ȒP�Ɍ�����Ǝv���Ă�̂��H";
		mes "���x���������A�����͈����Ȃ񂾂�!?";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "���Ȃ��Ƃ��l�́A";
		mes "������邱�Ƃ��킩�����ȏ�A";
		mes "����������Ƃ�������";
		mes "�؂�̂Ă邱�Ƃ͂ł��Ȃ��ł��˂��B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�������A�l�B�l�Ԃ�";
		mes "�U������ӎv���Ȃ��B";
		mes "�����āA���ǂ��Ȃ肽���Ɗ���Ă���B";
		next;
		mes "[���M]";
		mes "�����o�[�Ƃ��Č}����ɂ́A";
		mes "�\���ȏ�������Ȃ��ł����˂��B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�B";
		next;
		menu "�ǂ����ׂ����A�����������Ă���̂ł�",-;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c!?";
		next;
		mes "[���e���g]";
		mes "�Ȃ񂾁H";
		mes strcharinfo(0)+"�B";
		mes "���O�͐l�̐S���������C�s�ł�";
		mes "���Ă�̂��H";
		next;
		mes "[���e���g]";
		mes "����Ƃ��A�����̂悤��";
		mes "�l�̐S��ǂޗ͂ł������Ă���̂��H";
		next;
		mes "[���e���g]";
		mes "���������ΑO�����O��";
		mes "����Șb�����C�����邺�c�c�B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�܂��������O��́c�c";
		mes "�����������āc�c";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���[��߂��!!";
		mes "�n���n�������Ȃ��Ă����B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���ꂶ�Ⴀ�����܂��";
		mes "���҂݂ā[����˂���!!";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A���o�������̂ˁB";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ƃ͂�������͒P����";
		mes "�����o�[�����������";
		mes "�ȒP�Șb����ˁ[��!!";
		mes "�O�㖢���Ȃ�!!";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ̂ɁA���O�B�݂����Ɂc�c";
		mes "�z�C�z�C���Ȃ��";
		mes "�o����킯�ˁ[����c�c�B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�t���c�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�V�������V�[�B";
		mes "����̂��Ƃŕ�����������H";
		mes "�l�Ԃ��Ă����̂͂��̏�Ȃ��ʓ|�ŁA";
		mes "������݂����ɁA";
		mes "�C�̂����A���΂��肶��˂��B";
		mes "������z����񂳂�����B";
		next;
		mes "[���e���g]";
		mes "���̓x�ɁA��������΂�����c�c";
		mes "�����Ȃ��̂������āc�c";
		mes "���ɂ��̊�����ז��Ɋ����Ȃ���";
		mes "����ł������悤�Ƃ������̂��A";
		mes "�������l�Ԃ��B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�����炱���c�c";
		mes "�������Ƃ΂��肶��Ȃ��B";
		mes "�����ƌ��Ȃ��Ƃ������͂����B";
		mes "����ł�����̂��H";
		mes "����ł��c�c�������ƈꏏ�ɂ������̂��H";
		mes "������I�@�V�������V�[!!";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���e�B";
		next;
		mes "[�V�������V�[]";
		mes "���������̂Ɂc�c�B";
		mes "���̐S�c�c�ρc�c�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�V�������V�[�A���ꂪ����������";
		mes "����Ȃ񂾂�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���ꂪ�A�������c�c�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���e�A���c�c�B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�݂�ȂƗF�B�ɂȂ肽���c�c�I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���܂肾�ȁB";
		next;
		mes "[���e���g]";
		mes "�V�������V�[�B";
		mes "���O���M���h�����o�[�Ƃ��āA";
		mes "�����ɔF�߂�I";
		next;
		mes "[���e���g]";
		mes "�������I�@���B";
		mes "�M���h�����o�[�ɂȂ�������ɂ�";
		mes "�����Ȃ񂩂����珳�m���Ȃ�����ȁI";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�񑩂���B�����Ȃ񂩂��Ȃ��B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���A����Ƃ��ȁA";
		mes "���̐您�O�̎����A���́c�c";
		mes "�׌��Ɉ����z�������牴�Ɍ����B";
		mes "���̓M���h�}�X�^�[������ȁB";
		mes "�����o�[�����̂����̎d�����B";
		mes "����ȓz�͉������𐘂��Ă��I";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "���e�c�c�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�悩�����ˁA�V�������V�[�B";
		mes "�悤�����A�������̔��H�M���h�ցI";
		next;
		cutin "nines01.bmp", 255;
		mes "�]�M���h�����o�[�͊e�X";
		mes "�@�V�������V�[�ɑ΂�";
		mes "�@�j���̌��t�Ɣ���𑗂�]";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�݂�ȁA���肪�Ƃ��c�c�I";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "���A����c�c�B";
		next;
		cutin "shaloshi01.bmp", 255;
		mes "�]�M���h�����o�[���j�����钆";
		mes "�@�V�������V�[�̖j��";
		mes "�@��؂̎����`�����]";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�܁c�c�H";
		mes "�������͂��Ȃ̂Ɂc�c�B";
		mes "�߂����́c�c�H";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���͂́A���v����V�������V�[�B";
		mes "�܂͊��������ɂ��o��񂾁B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�����Ȃ񂾁c�c�B";
		mes "���߂āc�c�������B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "��͂�A�{���̗܂̔������ɂ�";
		mes "�l���̗܂Ƃ������΂�";
		mes "���Ȃ�Ȃ��悤�ł��˂��B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���āB";
		mes "�����ۂ��̂͏I���ɂ���";
		mes "���낻��E�o���邼�I";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���͈ꏏ�ɍs���Ȃ��B";
		next;
		mes "[�V�������V�[]";
		mes "�y�������ƒN�ɂ��ז����ꂸ��";
		mes "�ꏏ�ɋ��������Č����Ă�B";
		mes "�y�����厖�ȗF�B������A";
		mes "���΂炭�ꏏ�ɋ��Ă��������B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�������A�����̊Ԃ��ʂ�Ȃ񂾂ˁB";
		mes "�ł��c�c�܂�����ˁH";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "����B�����݂�Ȃɉ�����B";
		mes "������A�݂�ȁc�c�B";
		next;
		cutin "shaloshi04.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�܂��ˁB";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�����A�܂�����B";
		mes "�܂��ˁA�V�������V�[�B";
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			misceffect 317,getmdnpcname("�V�������V�[#23");
			misceffect 317,getmdnpcname("�y��#25");
		}
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
			hideonnpc getmdnpcname("�V�������V�[#23");
			hideonnpc getmdnpcname("�y��#25");
		}
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "��A�p�����ς񂾂�A�邩���";
		mes "�������Ə��������I";
		close2;
		set JTB_2QUE,6;
		cutin "rote01.bmp", 255;
		end;
	}
	mes "[�V�������V�[]";
	mes "���́A�����_�l��";
	mes "���肢�������Ă�������悤��";
	mes "���x�̓y���̖������Ȃ��Ă��������́B";
	mes "����͎��ɂ����o���Ȃ��c�c�B";
	next;
	mes "[�V�������V�[]";
	mes "�y���̖��c�c�B";
	mes "����͎��ƒN�ɂ��ז����ꂸ��";
	mes "�ꏏ�ɋ��������Č����Ă�B";
	mes "������c�c���߂�B���c�c�s���ˁB";
	next;
	mes "[�V�������V�[]";
	mes strcharinfo(0) + "���A";
	mes "�݂�Ȃ��c�c�B";
	mes "���ǂ����Ă���Ă��肪�Ƃ��c�c�B";
	next;
	cutin "shaloshi01.bmp", 255;
	mes "�]������������V�������V�[�̊炪";
	mes "�@�ƂĂ��₵���Ɍ������]";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�V�������V�[�c�c";
	mes "����Ȕ߂����������Ȃ�āA";
	mes "���͌�����c�c�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "���߂�Ȃ����c�c";
	mes "�c�c�΂��΂��B";
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		misceffect 317,getmdnpcname("�V�������V�[#23");
		misceffect 317,getmdnpcname("�y��#25");
	}
	next;
	if(getpartyleader(getcharid(1)) == strcharinfo(0)) {
		hideonnpc getmdnpcname("�V�������V�[#23");
		hideonnpc getmdnpcname("�y��#25");
	}
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�c�c";
	next;
	mes "[���e���g]";
	mes "�`�b�c�c";
	mes "���O��A�������ƋA�邼�I";
	mes "��������B";
	set JTB_1QUE,23;
	close2;
	initnpctimer getmdnpcname("�j���I�[�Y#end");
	warp getmdmapname("1@jtb.gat"),360,23;
	end;
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

//==========================================
// END�����F��������
//------------------------------------------
1@jtb.gat,370,26,5	script	�A����#end	644,{
	if(JTB_2QUE >= 6) {
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "���������J��Ԃ��Ƃ�";
		mes "������͂킩��Ȃ�����";
		mes "�V�������V�[�ƗF�B�ɂȂ��";
		mes "�{���ɗǂ������I";
		next;
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "���肪�Ƃ��ˁI";
		mes strcharinfo(0)+"�I";
		close2;
		cutin "arang03.bmp", 255;
		end;
	}
	if(JTB_2QUE == 1) {
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes strcharinfo(0)+"�c�c�B";
		next;
		menu "�ǂ������́H",-;
		mes "[�A����]";
		mes "���́A���́c�c�B";
		next;
		mes "[�A����]";
		mes "������Ƙb����������";
		mes "����񂾂��ǁc�c�B";
		next;
		if(select("������","�Z����") == 2) {
			cutin "arang03.bmp", 2;
			mes "[�A����]";
			mes "���c�c";
			mes "�������c�c";
			mes "�Z�����̂ɂ��߂�ˁB";
			close2;
			cutin "arang03.bmp", 255;
			end;
		}
		cutin "arang02.bmp", 2;
		mes "[�A����]";
		mes "�{��!?";
		mes "���Ⴀ�A���́c�c";
		mes "�������Ƙb���Â炢����";
		mes "�������ɗ��Ăق����ȁB";
		close2;
		warp getmdmapname("1@jtb.gat"),99,298;
		end;
	}
	cutin "arang03.bmp", 2;
	mes "[�A����]";
	mes "���G���ƗF�B�ɂȂ�����I";
	close2;
	cutin "arang03.bmp", 255;
	end;
}

1@jtb.gat,376,23,3	script	���G��#end	10040,{
	if(JTB_2QUE >= 6) {
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�V�������V�[�Ƃ�";
		mes "���΂炭�ʂ�邱�Ƃ�";
		mes "�Ȃ��Ă��܂��܂�����";
		mes "�܂����ƐM���Ă��܂��I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�V�������V�[��";
		mes "�M���h�����o�[�Ȃ�ł�����I";
		close2;
		cutin "roel01.bmp", 255;
		end;
	}
	if(JTB_2QUE == 2) {
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���A���傤�ǂ������ɁI";
		next;
		mes "[���G��]";
		mes "������Q���J�����";
		mes "��l�̕K�E�Z������ł��I";
		mes "�A�h�o�C�X�����������ł����A";
		mes "�悩�����猩�ɗ��Ă���܂��񂩁H";
		next;
		if(select("������","�Z����") == 2) {
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�����ł����c�c";
			mes "�c�O�ł����ǁA�܂��̋@���";
			mes "���肢���܂��I";
			close2;
			cutin "roel01.bmp", 255;
			end;
		}
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�{���ł���!?";
		mes "���肪�Ƃ��������܂��I";
		mes "���ꂶ�Ⴀ�A���������s���܂��傤�I";
		close2;
		warp getmdmapname("1@jtb.gat"),200,271;
		end;
	}
	cutin "roel03.bmp", 2;
	mes "[���G��]";
	mes "�A�����ƗF�B�ɂȂ�܂����I";
	mes "���x�A�ꏏ�Ƀ_���W������";
	mes "�`�����ɍs����ł���I";
	close2;
	cutin "roel01.bmp", 255;
	end;
}

1@jtb.gat,375,18,4	script	�A�C�O#end	646,{
	if(JTB_2QUE >= 6) {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[�����x��";
		mes "�����o���������́c�c�H";
		next;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�h�������Ǝv�����A";
		mes "�F�X�Ƃ��߂�Ȃ�������";
		mes "�v�����ǁc�c";
		mes "�Ō�͏Ί�ɂȂ�ėǂ������́I";
		close2;
		cutin "igu01.bmp", 255;
		end;
	}
	if(JTB_2QUE == 3) {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[�����Ȃ��Ȃ���";
		mes "���i�C�������݂������Ȃ́B";
		next;
		mes "[�A�C�O]";
		mes "���i�C���͋������Ă邯��";
		mes "���C�Â��Ă��������́I";
		mes "������Ƃ������ł͂Ȃ��Ă���́B";
		next;
		if(select("�A�C�O�ɂ��čs��","�撣���Ă�") == 2) {
			cutin "igu02.bmp", 2;
			mes "[�A�C�O]";
			mes "���肪�Ƃ��Ȃ́B";
			mes "���i�C�������C�ɂȂ��Ă����悤��";
			mes "�撣���Ă���́I";
			close2;
			cutin "igu01.bmp", 255;
			end;
		}
		mes "�]���Ȃ��̓A�C�O��";
		mes "�@����������čs�����Ƃɂ����]";
		close2;
		warp getmdmapname("1@jtb.gat"),13,384;
		end;
	}
	cutin "igu03.bmp", 2;
	mes "[�A�C�O]";
	mes "�����l�Ȃ́I";
	mes "�݂�Ȗ����ł悩�����́B";
	close2;
	cutin "igu01.bmp", 255;
	end;
}

1@jtb.gat,368,21,5	script	���e���g#end	630,{
	if(JTB_2QUE >= 6) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���O�ɂ͂����Ԃ񐢘b�ɂȂ����ȁB";
		mes "�L���͞B���Ȃ񂾂��A";
		mes "���O�����Ȃ���΁A����Ȍ�����";
		mes "�}�����Ȃ������낤��B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���́c�c";
		mes "���肪�Ƃ��ȁB";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
	if(JTB_2QUE == 4) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes strcharinfo(0)+"���B";
		mes "�ǂ��������̂��H";
		next;
		if(select("�b������","�Ȃ�ł��Ȃ�") == 2) {
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "����܂艴�̎ז�����Ȃ�B";
			mes "�`���͏I������񂾁B";
			mes "�����A��ȁB";
			close2;
			cutin "rote01.bmp", 255;
			end;
		}
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���ɘb�c�c�H";
		mes "�܂������A��Z�ɍς܂����B";
		close2;
		warp getmdmapname("1@jtb.gat"),108,377;
		end;
	}
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���͗Վ��̃M���h�����o�[";
	mes "�����m��˂����A";
	mes "�撣������ǂ������邩���ȁB";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

1@jtb.gat,366,20,5	script	�Q���J#end	629,{
	if(JTB_2QUE >= 6) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�����o�������x���c�c";
		mes "�܂�ŏ����݂����ł��ˁI";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�����Ƌ����Ȃ�܂��B";
	mes "�C�s���撣��Ȃ��ƁI";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}

1@jtb.gat,364,18,5	script	�~���~��#end	643,{
	if(JTB_2QUE >= 6) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���i�C���⃍�G����";
		mes "�ߋ��Ƀ��[�v����Ƃ���";
		mes "�Ƃ���܂ł͊o���Ă�݂����B";
		mes "�ł��A�ߋ��̎�������";
		mes "�ǂ��ɂ����Ȃ��̂�ˁB";
		next;
		mes "[�~���~��]";
		mes "�ӎ������ߋ��ɗ�������";
		mes "���ƂȂ̂�����H";
		mes "�܂������A������������������B";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���������ĂƎv����";
	mes "�V�������V�[�̔��̖т�";
	mes "���{���̎悵�Ă�������B";
	mes "�܂��͌����͂��Ă݂Ȃ��ƁB";
	next;
	emotion 29;
	mes "[�~���~��]";
	mes "�����ɂ͂܂�";
	mes "�������Ȃ��Ⴂ���Ȃ����̂�";
	mes "�������񂠂��ˁB";
	close2;
	cutin "min01.bmp", 255;
	end;
}

1@jtb.gat,373,25,3	script	���M#end	647,{
	if(JTB_2QUE >= 6) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�V�������V�[�ɂ������^���";
		mes "�悤�₭��ڂ��I�����悤�ł��ˁB";
		mes "�܂����ł͂Ȃ��A�΂������ł��āA";
		mes "�{���ɗǂ������ł��˂��B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�S��ǂ߂�Ƃ����̂�";
	mes "���Əꍇ�ɂ�肯��A�ł��˂��B";
	mes "�l�ɂ͂���ȗ͂��Ȃ��āA";
	mes "�ǂ������Ǝv���܂���B";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}

1@jtb.gat,373,16,3	script	���i�C��#end	10039,{
	if(JTB_2QUE >= 6) {
		cutin "lunain03.bmp", 2;
		mes "[���i�C��]";
		mes "������������V�������V�[��";
		mes "�������ƗF�B�ɂȂ肽����";
		mes "�������Ƃ��J��Ԃ���";
		mes "�����̂����m��Ȃ���ˁB";
		close2;
		cutin "lunain03.bmp", 255;
		end;
	}
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "���̎q���������āc�c";
	mes "�ȁA�Ȃ�ł��Ȃ���B";
	mes "���΂ɔ�ꂽ���A";
	mes "�����A���ċx�݂�����c�c�B";
	close2;
	cutin "lunain03.bmp", 255;
	end;
}

1@jtb.gat,367,13,5	script	�����f�B�[�W���b�N#end_	844,{
	if(JTB_2QUE >= 6) {
		mes "[�����f�B�[�W���b�N]";
		mes "���ԑk�s�c�c";
		mes "����l�������݂��Ȃ�������l�����";
		mes "�ߋ��̈ӎ��ւ̉�����c�c�H";
		close;
	}
	mes "[�����f�B�[�W���b�N]";
	mes "�B��Ă���̂����琺��������ȁI";
	mes "�܂������c�c�B";
	mes "�B��Ă���҂�������̂ɂ�";
	mes "����Ȃ�̏C�Ƃ��K�v���Ƃ����̂ɁB";
	mes "�c�c���O�͑債���z���ȁB";
	close;
}

1@jtb.gat,372,22,4	script	�j���I�[�Y#end	625,{
	if(JTB_1QUE <= 23) {
		if(JTB_2QUE == 7)
			set '@str$,"�}��";
		if(select('@str$,"��b������") == 1) {
			if(getpartyleader(getcharid(1)) == strcharinfo(0))
				stopnpctimer;
			set JTB_1QUE,24;
			if('flag != 1) {
				set 'flag,1;
				hideoffnpc getmdnpcname("23�ԕ����o��#JTB");
				mes "�]���̏o������O�ɏo�悤�]";
			}
			close;
		}
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�݂�ȁA�ЂƂ܂������l�B";
		mes "���낢�날�����ゾ���A����";
		mes "�����ŋx�e���ċA�낤�B";
		next;
		if(getpartyleader(getcharid(1)) == strcharinfo(0))
			stopnpctimer;
		if(JTB_2QUE >= 6) {
			cutin "arang03.bmp", 2;
			mes "[�A����]";
			mes "�{���A�{���ǂ�������`!!";
			next;
			cutin "gelca03.bmp", 2;
			mes "[�Q���J]";
			mes "�ǂ������ł��ˁA";
			mes "�A��������!!";
			next;
			cutin "arang02.bmp", 2;
			mes "[�A����]";
			mes "�������c�c";
			mes "����A�{���͂�����";
			mes "�s������������c�c�B";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "�܂������c�c���e���g��";
			mes "�M���h�}�X�^�[�ɂȂ��Ă���A";
			mes "�낭�Ȃ��ƂɂȂ�Ȃ���ˁB";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�M���h���̌�������܂����˂��B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "���O��c�c";
			mes "����Ȏ��΂�����o���Ă₪���āc�c�B";
			next;
			mes "[���e���g]";
			mes "��́I";
			mes "���̖��O�̂ǂ��������񂾂�!!";
			mes "�ō��Ɋi�D�ǂ�����ˁ[���I";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "�����ˁc�c";
			mes "�Ⴆ�΃V�������V�[���A";
			mes "�M���h�̖��O�𖼏��Ȃ���";
			mes "�����Ȃ��Ȃ�����ň��ˁB";
			next;
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "���͖����̗͂ō��ꂽ�����B";
			mes "�����āA���e���g�̒��K�E�M���h����";
			mes "�V�������V�[�B";
			next;
			mes "[�A�C�O]";
			mes "�������������A�Ȃ́H";
			next;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�A�C�O�A���Ă�ˁ�";
			next;
			cutin "arang01.bmp", 2;
			mes "[�A����]";
			mes "�����������L�������c�c�B";
			next;
			cutin "roel01.bmp", 2;
			mes "[���G��]";
			mes "�S�R�|���Ȃ��ł��ˁc�c!!";
			next;
			cutin "lunain01.bmp", 2;
			mes "[���i�C��]";
			mes "���肦�Ȃ���c�c�B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����c�c!!";
			next;
			cutin "gelca04.bmp", 2;
			mes "[�Q���J]";
			mes "�݂Ȃ���!!";
			mes "�_������Ȃ��ł���!!";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����Ă��!!�@�Q���J!!";
			next;
			cutin "gelca03.bmp", 2;
			mes "[�Q���J]";
			mes "�厖�ȃ|�C���g�A";
			mes "�����Y�ꂿ��_���ł���!!";
			next;
			mes "[�Q���J]";
			mes "�Ⴆ�΁c�c�����ł��ˁc�c";
			mes "�����̔Ԑl";
			mes "�i�f�B�����V�I���O�A���f�B�A�j";
			mes "�V�������V�[�Ƃ���!!";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "���܂�A�Q���J�c�c";
			mes "���O�Ɋ��҂��������o�J�������c�c�B";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "���������c�c";
			mes "���e���g�̒��K�E���ĉ���H";
			mes "���Ęb��ˁB";
			mes "���͑̂�\�����Č��t�A";
			mes "�m��Ȃ��񂶂�Ȃ�������B";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "���e���g�l�̖��O���A";
			mes "�ʂ̈Ӗ��ŗL���ɂȂ肻���ł��˂��B";
			next;
			cutin "ragi01.bmp", 255;
			mes "[�����f�B�[�W���b�N]";
			mes "�ǂ������ȃ��e���g�B";
			mes "�L���ɂȂ�邼�B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����Ƃ��悭�˂�!!";
			next;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���A�������A���e�`�I";
			mes "���x�܂��V�������V�[�������";
			mes "�݂�Ȃ̐E�ʂ����߂悤���";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c����[�˂��ȁB";
			mes "�����i�D�ǂ��E�ʂ�";
			mes "�S�����A�l���Ă���B";
			next;
			menu "����́c�c",-;
			cutin "rote01.bmp", 255;
			mes "[�S��]";
			mes "�p���I";
			next;
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "�Ȃ́�";
			close2;
			cutin "rote01.bmp", 255;
			set JTB_2QUE,7;
			set JTB_1QUE,24;
			if('flag != 1) {
				set 'flag,1;
				hideoffnpc getmdnpcname("23�ԕ����o��#JTB");
			}
			end;
		}
		cutin "rote01.bmp", 2;
		emotion 36,getmdnpcname("���e���g#end");
		mes "[���e���g]";
		mes "��������c�c";
		mes "�j���I�[�Y!!";
		mes "���O�������͂悭��";
		mes "����Ɂu���H�M���h�v�Ƃ�";
		mes "�����₪�����ȁI";
		next;
		cutin "nines04.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�����H";
		mes "�M���h�}�X�^�[�͕ς�������ǁc�c";
		mes "�����M���h���܂ŕύX�����̂����H";
		next;
		cutin "rote01.bmp", 2;
		emotion 32,getmdnpcname("���e���g#end");
		mes "[���e���g]";
		mes "�M���h�}�X�^�[���ς�����񂾁I";
		mes "�M���h�����ς���̂��A���ʂ���I";
		mes "���́c�c���`��B";
		mes "�A�����I�@���̖��O�c�c�B";
		next;
		emotion 54,getmdnpcname("�~���~��#end");
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�V�������O���v�����Ȃ��Ȃ�A";
		mes "���̂܂܂ɂ���΁H";
		next;
		emotion 52,getmdnpcname("���e���g#end");
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "����Ȃ��Ƃ͂ł��邩�I";
		mes "�����M���h�}�X�^�[�����ȁB";
		next;
		mes "[���e���g]";
		mes "�����A������!!";
		mes "���ꂩ���";
		mes "�u���e���g�̒��K�E�M���h�v���I";
		emotion 40,getmdnpcname("���e���g#end");
		next;
		emotion 57,getmdnpcname("�A�C�O#end");
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�ςȖ��O�A�Ȃ́B";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�t���炵���M���h���ł����!!";
		next;
		cutin "roel04.bmp", 2;
		mes "[���G��]";
		mes "���A���I�ł��ˁc�c�B";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "������_�T�b�I";
		next;
		cutin "rote01.bmp", 2;
		emotion 36,getmdnpcname("���e���g#end");
		mes "[���e���g]";
		mes "���邹�[!!";
		mes "�M���h�}�X�^�[�͉����I";
		mes "���茠�͉��ɂ���I";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�c�c�i�D�����B";
		next;
		emotion 29,getmdnpcname("�~���~��#end");
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "���̖��O�Ō�����Ă����Ȃ�";
		mes "���̓M���h��E�ނ����B";
		mes "����Ȗ��O�A����肽���Ȃ����́B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ񂾂ƁI";
		emotion 23,getmdnpcname("���e���g#end");
		next;
		cutin "min02.bmp", 255;
		mes "[�����f�B�[�W���b�N]";
		mes "���͌��X�M���h�����o�[�ł͂Ȃ����ȁB";
		mes "�D���ɂ����ĖႤ���B";
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#end_");
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "����Ȓp���������M���h������";
		mes "�ǂ��ɍs���Ă��ڗ����܂��˂��B";
		mes "���̂����ŃA�C�O�l�̐l�C�ɂ�";
		mes "�ςȉe�����o�Ȃ��Ɨǂ��ł����B";
		next;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "���͂́A���v�Ȃ́B";
		mes "�����c�c�B";
		emotion 14,getmdnpcname("�A�C�O#end");
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "���H�M���h�̕���";
		mes "������₷�����A�����";
		mes "�j���I�[�Y�l�̃Z���X��";
		mes "���閼�O�ŗǂ������̂ɁB";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�ł��܂��c�c";
		mes "����Ȗ��O�ɂȂ�Ȃ�";
		mes "���̎q������Ȃ���";
		mes "����Ӗ��A���������������ˁc�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���O��c�c";
		mes "�D�����茾���₪���āI";
		mes "�Ƃɂ��������͔�ꂽ������U���邼�I";
		mes "���e���g�̒��K�E�M���h�̖`���I���I";
		close2;
		cutin "rote01.bmp", 255;
		set JTB_1QUE,24;
		if('flag != 1) {
			set 'flag,1;
			hideoffnpc getmdnpcname("23�ԕ����o��#JTB");
		}
		end;
	}
	if(JTB_2QUE == 0) {
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�₠�A�N���B���傤�ǂ悩�����I";
		mes "���͂�����Ƙb���������Ƃ�";
		mes "����񂾂��ǁc�c�B";
		mes "�悩�����畷���Ă���Ȃ����ȁH";
		next;
		if(select("�͂�","������") == 2) {
			mes "[�j���I�[�Y]";
			mes "�c�O���Ȃ��c�c�B";
			mes "�C���ς������ł�������";
			mes "���������Ă����Ɗ������ȁB";
			close2;
			cutin "nines01.bmp", 255;
			end;
		}
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�{������!?";
		mes "���ꂶ�Ⴀ�A�ꏊ���ړ����悤���B";
		mes "����������B";
		close2;
		warp getmdmapname("1@jtb.gat"),13,274;
		end;
	}
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�v���Ԃ�ɒ��Ԃ����ƈꏏ����";
	mes "�y�����ȁB";
	close2;
	cutin "nines01.bmp", 255;
	end;
OnTimer3000:
	emotion 9;
	initnpctimer;
	end;
}

//==========================================
// 15�ԕ���NPC�F���������{�{�X���j��C�x���g
//------------------------------------------
1@jtb.gat,36,289,3	script	���M#15	647,{
	if(JTB_2QUE != 1) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes strcharinfo(0) + "����A";
		mes "�����l�ł��B";
		mes "�l���j���I�[�Y�l�ɌĂ΂��";
		mes "�����̂ł����A";
		mes "��������̂ł��傤���B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	} else {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�f���炵���Ȃ��ł��܂����ˁB";
		mes "�A�C�O�l�̃_���X��";
		mes "�ƂĂ��y���݂ł��˂��B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
}

1@jtb.gat,34,291,3	script	�j���I�[�Y#15	625,{
	if(JTB_2QUE != 1) {
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�₠�₠�A���M�N�A";
		mes strcharinfo(0) + "�B";
		mes "����ȂƂ���ɌĂяo���Ă��߂�ˁ`�B";
		mes "���͓�l�ɂ��肢������񂾁B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�Ȃ�ł��傤�B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����̖`�����Ȃɂ��������Ă��B";
		mes "�`���҂͖`���L���������肷�邾�낤�H";
		mes "���͂�������y�Ŏc���̂��D���Ȃ񂾁B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "����͑f���炵���ł��˂��B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����łˁA��l��";
		mes "�ȍ��̂���`�������ė~�����񂾁`�B";
		mes "�ǂ����ȁH";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�l�͍\��Ȃ��ł���B";
		mes "�j���I�[�Y�l�Ƃ�����艹�y�ɂ���";
		mes "���b�������������Ƃ���ł����B";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���M�N�I�@���肪�Ƃ��`�I";
		mes strcharinfo(0) + "��";
		mes "�ǂ��H�@���肢�ł���H";
		next;
		menu "��`��",-;
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "������`�I�@���肪�Ƃ��I";
		mes "�������������ǁA";
		mes "�ǂ�ȋȂɂ����炢���Ǝv���H";
		next;
		switch(select("���邢��","�Â���","��������")) {
		case 1:
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "���邢�Ȃ��I�@�����ˁI";
			mes "�`���͊y�������̂�����ˁI";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "allegramente�c�c�����ł��˂��B";
			mes "���H�M���h�ɂ҂�����ł��ˁB";
			next;
			menu "�A���O�������e�H",-;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�͂��Ballegramente�Ƃ�";
			mes "���y�p���";
			mes "���邭�A�y�����Ƃ����Ӗ��ł��B";
			next;
			menu "�Ȃ�ق�",-;
			cutin "nines03.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�悵�A�M���h�ɂ悭������";
			mes "���邢�Ȃɂ��悤�I";
			mes "���₩�ȃ����o�[�ɕ����Ȃ��A";
			mes "���C�ȋȂɂ��Ȃ��ƂˁI";
			break;
		case 2:
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�Â��Ȃ����B";
			mes "���܂ɂ͂��������̂����������B";
			mes "�`���͐F�X�Ȏ���������̂����ˁB";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "lamentabile�c�c�B";
			mes "�Ō�ɐ���オ�肪�~�����ł��˂��B";
			next;
			menu "�������^�[�r���H",-;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�͂��Blamentabile�Ƃ�";
			mes "���y�p���";
			mes "�߂����ɂƂ����Ӗ��ł��B";
			next;
			menu "�Ȃ�ق�",-;
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�������ˁB�Ō�ɐ���オ���āc�c";
			mes "�V�������V�[�Ƃ͈�U�ʂꂽ���ǁA";
			mes "�܂��o������";
			mes "�S�҂��ɂł���悤�ȁA";
			mes "����ȋȂ������ȁB";
			break;
		case 3:
			cutin "nines01.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�������Ȃ��I�@�Ȃ�قǁI";
			mes "����̖`�����������퓬��";
			mes "�������񂠂�������ˁ`�B";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "herzhaft�c�c�ł��˂��B";
			mes "�퓬���C���[�W�����Ȃ��ł������ł��B";
			next;
			menu "�w���c�n�t�g�H",-;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "�͂��Bherzhaft�Ƃ�";
			mes "���y�p���";
			mes "�E���ȁA�͋����Ƃ����Ӗ��ł��B";
			next;
			menu "�Ȃ�ق�",-;
			cutin "nines02.bmp", 2;
			mes "[�j���I�[�Y]";
			mes "�������퓬�̋ȁI";
			mes "���`��A�����ˁI";
			mes "�E���Ȗl���D�u�Ɛ���Ă�ȁI";
			mes "�ǂ��Ȃ��ł���������`�I";
			break;
		}
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "����A����I�@�C���[�W���N���Ă����I";
		mes "�����f�B��������ł����`�I";
		mes "���ꂩ�玄�͋Ȃ���邩��A";
		mes "���M�N�A���t����`���āI";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�킩��܂����B";
		next;
		cutin "nines01.bmp", 2;
		mes "[�j���I�[�Y]";
		mes strcharinfo(0) + "�ɂ�";
		mes "�̎����l���ė~�����ȁB";
		mes "���̎��ɏ����Ă��ꂽ��A";
		mes "�Ȃƍ��킹���B";
		next;
		cutin "nines01.bmp", 255;
		mes "�]���ƃy�����󂯎�����]";
		next;
		cutin "nines03.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "���񂾂�`�I";
		mes "�����A���M�N�B";
		mes "���B������΂낤�I";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�͂��B";
		next;
		cutin "ragi01.bmp", 255;
		mes "�]���������󂯎��������";
		mes "�@�v�����̎��������Ă݂悤�B";
		mes "�@�ŏ��͉������������]";
		setarray '@str$[1],"�V�������V�[�̎�","�j���I�[�Y�̎�","�����̎�";
		while(1) {
			next;
			switch('@succsess) {
			case 0:
				switch(select('@str$[1],'@str$[2],'@str$[3])) {
				case 1:
					mes "[" + strcharinfo(0) + "]";
					mes "�_���W�����ŏo�������̏����c�c";
					mes "�����̖��A�V�������V�[�c�c";
					mes "�ޏ��͗F�B���ق��������c�c";
					set '@song[1],1;
					set '@str$[1],"";
					break;
				case 2:
					mes "[" + strcharinfo(0) + "]";
					mes "���������ȑO�}�X�^�[�c�c";
					mes "�~���X�g�����̃j���I�[�Y�c�c";
					mes "�ނƒ��Ԃ̖`���L�c�c";
					set '@song[1],2;
					set '@str$[2],"";
					break;
				case 3:
					mes "[" + strcharinfo(0) + "]";
					mes "�Վ��œ��������H�M���h�c�c";
					mes "�`����" + strcharinfo(0) + "�c�c";
					mes "�V�����`���̎n�܂�c�c";
					set '@song[1],3;
					set '@str$[3],"";
					break;
				}
				next;
				mes "�]���ɂ��邷���";
				mes "�@�v���������t�������Ă����B";
				mes "�@���͉������������]";
				set '@succsess,'@succsess + 1;
				continue;
			case 1:
				switch(select('@str$[1],'@str$[2],'@str$[3])) {
				case 1:
					mes "[" + strcharinfo(0) + "]";
					mes "�_���W�����ŏo�������̏����c�c";
					mes "�����̖��A�V�������V�[�c�c";
					mes "�ޏ��͗F�B���ق��������c�c";
					set '@song[2],1;
					set '@str$[1],"";
					break;
				case 2:
					mes "[" + strcharinfo(0) + "]";
					mes "���������ȑO�}�X�^�[�c�c";
					mes "�~���X�g�����̃j���I�[�Y�c�c";
					mes "�ނƒ��Ԃ̖`���L�c�c";
					set '@song[2],2;
					set '@str$[2],"";
					break;
				case 3:
					mes "[" + strcharinfo(0) + "]";
					mes "�Վ��œ��������H�M���h�c�c";
					mes "�`����" + strcharinfo(0) + "�c�c";
					mes "�V�����`���̎n�܂�c�c";
					set '@song[2],3;
					set '@str$[3],"";
					break;
				}
				next;
				mes "�]���ɂ��邷���";
				mes "�@�v���������t�������Ă����B";
				mes "�@�Ō�̕��͂��������]";
				set '@succsess,'@succsess + 1;
				continue;
			case 2:
				switch(select('@str$[1],'@str$[2],'@str$[3])) {
				case 1:
					mes "[" + strcharinfo(0) + "]";
					mes "�_���W�����ŏo�������̏����c�c";
					mes "�����̖��A�V�������V�[�c�c";
					mes "�ޏ��͗F�B���ق��������c�c";
					set '@song[3],1;
					set '@str$[1],"";
					break;
				case 2:
					mes "[" + strcharinfo(0) + "]";
					mes "���������ȑO�}�X�^�[�c�c";
					mes "�~���X�g�����̃j���I�[�Y�c�c";
					mes "�ނƒ��Ԃ̖`���L�c�c";
					set '@song[3],2;
					set '@str$[2],"";
					break;
				case 3:
					mes "[" + strcharinfo(0) + "]";
					mes "�Վ��œ��������H�M���h�c�c";
					mes "�`����" + strcharinfo(0) + "�c�c";
					mes "�V�����`���̎n�܂�c�c";
					set '@song[3],3;
					set '@str$[3],"";
					break;
				}
				next;
				mes "�]���ɂ��邷���";
				mes "�@�v���������t�������Ă����B";
				mes "�@�̎����o���オ�����]";
				set '@succsess,'@succsess + 1;
				continue;
			case 3:
				next;
				cutin "nines01.bmp", 2;
				mes "[�j���I�[�Y]";
				mes strcharinfo(0) + "�`�I";
				mes "�Ȃ��ł�����`�I";
				mes strcharinfo(0) + "��";
				mes "�ł��������H";
				next;
				menu "�ł���",-;
				cutin "nines03.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�������I�@�����Č����āI";
				mes "�ǂ�ǂ�c�c";
				next;
				mes "[�j���I�[�Y]";
				mes "�c�c";
				next;
				mes "[�j���I�[�Y]";
				mes "�c�c";
				mes "�c�c�c�c";
				next;
				cutin "nines02.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�c�c";
				mes "�c�c�c�c";
				mes "�����ˁ`�I�@���΂炵��!!";
				next;
				cutin "nines03.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�����A���M�N�I";
				mes "���B������������f�B�[�ɏ悹��";
				mes "�̂��Ă݂悤����Ȃ����I";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "�͂��B����ł͉��t���n�߂܂��B";
				next;
				cutin "ragi02.bmp", 2;
				mes "[���M]";
				mes "���`�����`���`";
				mes "���H�M���h�̕���`";
				mes "�����Ȗ`���̕���`";
				for(set '@i,1; '@i<=3; set '@i,'@i+1) {
					next;
					switch('@song['@i]) {
					case 1:
						cutin "nines02.bmp", 2;
						mes "[�j���I�[�Y]";
						mes "�_���W�����ŏo�������̏����`";
						mes "�����̖��A�V�������V�[�`";
						mes "�ޏ��͗F�B���ق��������`";
						break;
					case 2:
						cutin "nines02.bmp", 2;
						mes "[�j���I�[�Y]";
						mes "���������ȑO�}�X�^�[�`";
						mes "�~���X�g�����̃j���I�[�Y�`";
						mes "�ނƒ��Ԃ̖`���L�`";
						break;
					case 3:
						cutin "nines02.bmp", 2;
						mes "[�j���I�[�Y]";
						mes "�Վ��œ��������H�M���h�`";
						mes "�`����" + strcharinfo(0) + "�`";
						mes "�V�����`���̎n�܂�`";
						break;
					}
				}
				next;
				cutin "ragi02.bmp", 2;
				mes "[���M]";
				mes "�������Ėl��͂܂�������";
				mes "���ԂƖ`�����J��Ԃ��`";
				mes "���`�����`���`";
				mes "���H�M���h�̕���`";
				next;
				cutin "nines01.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�c�c�ӂ��B";
				mes strcharinfo(0) + "�A";
				mes "�ǂ����ȁH";
				next;
				menu "�����ˁI",-;
				cutin "nines02.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�{�������H�@�������ȁI";
				mes "�����f���炵���Ǝv����I";
				mes "�ƂĂ��ǂ��Ȃ��ł����B";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "�l���A�j���I�[�Y�l��";
				mes strcharinfo(0) + "�����";
				mes "���삪���Ċ������ł��B";
				mes "���肪�Ƃ��������܂��B";
				next;
				cutin "nines03.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "���񂤂�A����";
				mes "3�l�ł���ȗǂ��Ȃ�����";
				mes "�喞������`!!";
				next;
				mes "[�j���I�[�Y]";
				mes strcharinfo(0) + "�A";
				mes "���M�N�A���肪�Ƃ��I";
				next;
				mes "[�j���I�[�Y]";
				mes "�����A��������";
				mes "�݂�Ȃɂ���I�ڂ��Ă��悤�I";
				mes "�A�C�O�ɂ��x���Ă����Ȃ��Ɓ`�I";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "�l���������܂��B";
				next;
				cutin "nines01.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�߂��Ă�����V�������V�[�ɂ�";
				mes "�������Ă����Ȃ��ƂˁI";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "�����ł��ˁB";
				mes "���̎��͑S���ŉ̂���悤��";
				mes "�݂�ȂɊo���Ă����Ȃ���";
				mes "�����܂���˂��B";
				next;
				cutin "nines03.bmp", 2;
				mes "[�j���I�[�Y]";
				mes "�������ˁ`�I";
				mes "�Ƃ��Ă��y���݂��I";
				close2;
				cutin "nines01.bmp", 255;
				set JTB_2QUE,1;
				setquest 116500;
				compquest 116500;
				end;
			}
		}
	} else {
		cutin "nines02.bmp", 2;
		mes "[�j���I�[�Y]";
		mes "�f�G�ȋȂ��ł��Ċ������ȁB";
		close2;
		cutin "nines01.bmp", 255;
		end;
	}
}

1@jtb.gat,24,304,0	script	#����15�ԕ����o��	45,2,2,{
	mes "�]�������烁���o�[������ꏊ��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	warp getmdmapname("1@jtb.gat"),353,42;
	end;
}

//==========================================
// 16�ԕ���NPC�F���������{�{�X���j��C�x���g
//------------------------------------------
1@jtb.gat,113,295,5	script	�~���~��#16	643,{
	if(JTB_2QUE != 2) {
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�Ƃ肠����";
		mes "�A�����̕����[������������A";
		mes "�A�����̘b���畷���Ă����āB";
		mes "���Ԃ񎄂Ɠ������e���Ǝv�����ǁB";
		close2;
		cutin "min02.bmp", 255;
		end;
	} else {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�ʓ|���������ˁB";
		mes "�c�c���肪�Ƃ��B�������B";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
}

1@jtb.gat,116,295,3	script	�A����#16	644,{
	if(JTB_2QUE != 2) {
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "���߂�ˁA������ƃ~���~����";
		mes strcharinfo(0)+"��";
		mes "�����Ă��炢�������Ƃ�����񂾁B";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�������傤��";
		mes strcharinfo(0)+"�̈ӌ���";
		mes "���������Ǝv���Ă����Ƃ����B";
		next;
		if(select("�V�������V�[�̎��H","���e���g�̃M���h���̎��H") == 2) {
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "��������B";
			mes "�A�C�c�̎��Ȃ�Ăǂ��ł������̂�B";
			mes "�{�C�ł������ȃM���h���ɂ�����";
			mes "�E�ނ��邾�������B";
			mes "��������Ȃ��āA���̃K�L�̎���B";
			next;
			menu "�V�������V�[�̎��H",-;
		}
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�����A�V�������V�[�̂��ƁB";
		mes "���͂ˁA�M���h�̒��ł�";
		mes "�������݂����Ȉʒu�Â�������A";
		mes "�V�������V�[�ɉ���āA";
		mes "���N��̏��̎q�̗F�B���ł���";
		mes "�����������񂾁B";
		next;
		mes "[�A����]";
		mes "�ł��V�������V�[�̐��̂��c�c";
		mes "�����N�̖����ĕ����āA";
		mes "�������т����肵���B";
		next;
		mes "[�A����]";
		mes "�x���ꂽ�I�@���ċC���ɂ��Ȃ������ǁA";
		mes "�����ƃV�������V�[�̋C�����𕷂���";
		mes "����݂�ȂŎ���Ă����Ȃ����������";
		mes "�v�����́B";
		next;
		mes "[�A����]";
		mes "������j���I�[�Y��";
		mes "�V�������V�[�ɁA";
		mes "�M���h�̃����o�[�����Č���������";
		mes "�����������B";
		next;
		mes "[�A����]";
		mes "�ł��A���e���g��";
		mes "�V�������V�[�̎������݂��������A";
		mes "�݂�Ȃ��{���͂ǂ��v���Ă�̂�";
		mes "������ƕs���ɂȂ��āc�c�B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "���͂��̃K�L������B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�����Ȃ񂾁c�c�B";
		next;
		mes "[�A����]";
		mes "�ł��~���~���A";
		mes "�K�L���Ȃ�ĂЂǂ���`�B";
		mes "�������Ɍ��t�����͔������I�@����";
		mes "�����Ă���Ă�̂Ɂ`�B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�����c�c�B�����ˁc�c�B";
		mes "�m���ɉ������t�͗ǂ��Ȃ���ˁB";
		mes "�������m����B";
		mes "�ł����̃K�c�c���̎q�A";
		mes "���̎������΂�����Č������̂�B";
		mes "����Ȏq�I";
		next;
		mes "[�~���~��]";
		mes "�܂�����ȍ΂���Ȃ��̂�I";
		mes "�������̎�����藐�����������B";
		mes "���Ԓm�炸�Ȃ̂ˁB";
		next;
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "�V�������V�[��";
		mes "���Ԓm�炸���Č������A";
		mes "�Y�܂ꂽ�āc�c�Ȃ񂶂�Ȃ����ȁB";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�Y�܂ꂽ�āH";
		next;
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "����B";
		mes "���������N���|����āA";
		mes "�x�z���������ꂽ���Ă��Ƃ́A";
		mes "�V�������V�[�����R�ɂȂ����̂�";
		mes "���Ȃ��Ƃ�����Ȑ̘̂b����Ȃ��͂��B";
		next;
		mes "[�A����]";
		mes "�ƌ������Ƃ́A";
		mes "���߂Ď���������Ă���";
		mes "���B�ɉ�܂ł��A�������Ԃ�";
		mes "�o���ĂȂ��񂶂�Ȃ����Ȃ��B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�Ȃ�قǂˁc�c�B";
		mes "�������Ƃ����炠�̎q�̕��m�炸��A";
		mes "�����ɂ�����������B";
		mes "���̎q�͎Y�܂ꂽ�ĂŁA";
		mes "�킩��Ȃ����΂���Ȃ̂ˁB";
		next;
		mes "[�~���~��]";
		mes "��������āA";
		mes "���΂��񔭌��͋����Ȃ����I";
		mes "�Y�܂ꂽ�ĂŐ��Ԃ�m��Ȃ��̂Ȃ�A";
		mes "�O��I�ɐ����������������āA";
		mes "���΂��񔭌���P�񂳂��Ă��I";
		next;
		cutin "arang02.bmp", 2;
		mes "[�A����]";
		mes "�����ƁA����A�������ˁI";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�����Ǝ��̎��𖼑O��";
		mes "�Ăׂ�悤�ɂȂ�̂Ȃ�A";
		mes "�݂�Ȃ��C�ɓ����Ă�݂��������A";
		mes "���̓M���h�����o�[�Ƃ���";
		mes "���̎q���}������Ă������Ǝv����B";
		next;
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "�{��!?�@�悩�����`�I";
		mes "�E�`�̃M���h�ɂ͗����";
		mes "���Z��������o���������񂾂���I";
		mes "�����Ƃ����q�ɂȂ��I";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "����łˁA�Վ������o�[��";
		mes strcharinfo(0)+"���猩�āA";
		mes "�V�������V�[�͊댯�Ȏq���Ǝv���H";
		next;
		if(select("�댯����Ȃ��Ǝv��","�댯���Ǝv��") == 1) {
			cutin "arang01.bmp", 255;
			mes "�]���Ȃ��̓V�������V�[��";
			mes "�@���ӂ������鎖�͂Ȃ��������Ƃ�A";
			mes "�@�F�B���ق����Ƃ����ޏ��̊肢��";
			mes "�@�����邱�Ƃ��o����̂͋��炭";
			mes "�@���̃M���h�����o�[�ȊO��";
			mes "�@�o���Ȃ��Ǝv�����Ƃ��l�ɓ`�����]";
			next;
		} else {
			cutin "arang01.bmp", 255;
			mes "�]���Ȃ��̓V�������V�[��";
			mes "�@�댯���Ǝv�������Ƃ�f���ɓ`��";
			mes "�@���̏�ŁA�悸�͔ޏ���";
			mes "�@�ǂ����∫�����Ƃɂ��āA";
			mes "�@���̃M���h�����o�[���������";
			mes "�@�����Ă�����K�v������̂ł́H��";
			mes "�@��l�ɓ`�����]";
			next;
		}
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "���������c�c";
		mes "����A�������ˁB";
		mes strcharinfo(0)+"��";
		mes "�����ʂ肾�ˁI";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�����ˁB";
		mes "�j���I�[�Y�������Ă��悤�ɁA";
		mes "���B���ŏ��ɂ����ɗ����̂Ȃ�A";
		mes "���̎q�Ɖ�������Ƃ�����̂�";
		mes "���B������������Ȃ���ˁB";
		next;
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "�悧���A���̕s���͐�����񂾁`�I";
		mes "���Ƃ͑��݂̂�Ȃ̋C������";
		mes "�����Ă݂Ȃ��Ƃ���ˁI";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "�Ƃ��Ƀ��e���g�ˁB";
		mes "�v���C�h���ז�����";
		mes "�{�S�ƈႤ���������N�Z�����邩��";
		mes "���Ȃ̂�ˁB";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�������ˁ`�B";
		mes "���Ɏ������M���h�����o�[�ɂ́c�c�B";
		next;
		mes "[�A����]";
		mes "������!!";
		mes strcharinfo(0)+"�A";
		mes "���e���g�̐����ɋ��͂��ė~���������I";
		mes "�������ɉB���{�����A";
		mes strcharinfo(0)+"�ɂ�";
		mes "�����Ă���邩������Ȃ����I";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�����ˁB���������B";
		mes "���e���g�������";
		mes strcharinfo(0)+"�̎��A";
		mes "�C�ɓ����Ă�݂��������B";
		next;
		cutin "arang02.bmp", 2;
		mes "[�A����]";
		mes "�����Ȃ񂾁I";
		mes "�S�R�킩��Ȃ������`�I";
		mes "���������˂��A�~���~���I";
		next;
		cutin "min03.bmp", 2;
		mes "[�~���~��]";
		mes "���N�̊����ă��c������B";
		mes strcharinfo(0)+"�Ƙb����";
		mes "����`���Ƒԓx���Ⴄ�̂�ˁB";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "�ǂ����ȁA";
		mes strcharinfo(0)+"�B";
		mes "���͂��Ă����H";
		next;
		menu "���͂���",-;
		cutin "arang02.bmp", 2;
		mes "[�A����]";
		mes "�ق�ƁH�@���肪�Ɓ`�I";
		mes "����ς莝�ׂ����̂�";
		mes "�Վ��ł��M���h�����o�[����ˁ`�I";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes strcharinfo(0)+"�A";
		mes "���肪�Ƃ��B������������������B";
		next;
		cutin "arang01.bmp", 2;
		mes "[�A����]";
		mes "^FF0000���e���g�̐����̑O�ɁA";
		mes "���̃����o�[�ɂ�";
		mes "�b�𕷂��Ă݂Ăق����ȁB^000000";
		mes "�݂�Ȃ̈ӌ���m���Ă����";
		mes "���e���g�Ƃ̘b��";
		mes "�X���[�Y�ɍs���Ǝv���́B";
		next;
		menu "�킩����",-;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�����ƌ��܂�����A";
		mes "���e���g�Ɋ��t�����O��";
		mes "�����������U���������ǂ������ˁB";
		next;
		mes "[�~���~��]";
		mes "���e���g����";
		mes "���C�Ɋ����s���Ƃ�������邩��A";
		mes "^FF0000���܂�Z���Ԃ̊Ԃ�";
		mes "���x�������o�[�ɘb��������̂�";
		mes "�ǂ��Ȃ���B^000000";
		next;
		mes "[�~���~��]";
		mes "^FF0000�\���Ɏ��Ԃ������āA";
		mes "�����o�[�ɘb�������āB^000000";
		mes "�ʓ|�������邯�ǁA���肢�ˁB";
		next;
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "���ꂶ�Ⴀ�A�܂����ƂŁI";
		mes strcharinfo(0)+"�A";
		mes "���񂾂�`�I";
		close2;
		cutin "arang03.bmp", 255;
		set JTB_2QUE,2;
		setquest 116500;
		compquest 116500;
		end;
	} else {
		cutin "arang03.bmp", 2;
		mes "[�A����]";
		mes "�悩������`�B";
		mes "��l�ɘb���܂ŕs���������񂾁`�B";
		mes "���肪�ƂˁI";
		close2;
		cutin "arang03.bmp", 255;
		end;
	}
}

1@jtb.gat,117,304,0	script	#����16�ԕ����o��	45,2,2,{
	mes "�]�������烁���o�[������ꏊ��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	warp getmdmapname("1@jtb.gat"),353,42;
	end;
}

//==========================================
// 17�ԕ���NPC�F���������{�{�X���j��C�x���g
//------------------------------------------
1@jtb.gat,197,284,5	script	�Q���J#17	629,{
	if(JTB_2QUE != 3) {
		cutin "roel01.bmp", 255;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�ǂ�ȕK�E�Z�ɂ��悤���Ȃ��B";
		mes "�t�����������邽�߂ɂ�";
		mes "���܂ł̕K�E�Z���";
		mes "�������悭���Ȃ��Ɓc�c�B";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	} else {
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes strcharinfo(0)+"����A";
		mes "���肪�Ƃ��������܂��I";
		mes "�������ŕK�E�Z���ł��܂����I";
		close2;
		cutin "roel02.bmp", 255;
		end;
	}
}

1@jtb.gat,204,284,4	script	���G��#17	10040,{
	if(JTB_2QUE != 3) {
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes strcharinfo(0)+"����";
		mes "�킴�킴���݂܂���I";
		next;
		mes "[���G��]";
		mes "�Q���J����A�l��̕K�E�Z��";
		mes strcharinfo(0)+"�����";
		mes "���Ă��炨���Ǝv����";
		mes "���Ăт�����ł���B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "������������ł����I";
		mes strcharinfo(0)+"����A";
		mes "��낵�����肢���܂��I";
		next;
		mes "[�Q���J]";
		mes "���G���N�Ɠ�l�Ő���Ă݂āA";
		mes "���݂��̗͂����킹���K�E�Z�������";
		mes "�������͂�苭���Ȃ���";
		mes "�C�Â����̂ł��B";
		next;
		mes "[�Q���J]";
		mes "�����ĕK�E�Z������āA";
		mes "�t���ɂ���I�ڂ���̂ł��I";
		mes "�t���ɔF�߂Ă��炤�ɂ�";
		mes "���������ł͂Ȃ��A";
		mes "�������悳���K�v�ł��I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�Ȃ�قǁI";
		mes "�ł́A�����Ƃ������悳�����˔�����";
		mes "���V�K�E�Z���l���܂��傤�I";
		next;
		mes "[���G��]";
		mes strcharinfo(0)+"�����";
		mes "�����C�Â����Ƃ��낪��������";
		mes "�A�h�o�C�X���肢���܂��I";
		next;
		menu "�킩����",-;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "��낵�����肢���܂��I";
		mes "�ł͂��������c�c";
		mes "�K�E�Z�Ŏg���X�L���Ȃ�ł����A";
		mes "���ɂ��܂��傤���B";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�����ł��ˁc�c";
		mes "�l�̓��C�����K�[�h�ł�����";
		mes "�h��n�̃X�L�������ӂł��B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�h��n�I�@�V�����ł��ˁI";
		mes "�m���ɐ키���߂�";
		mes "�퓬�X�L���̕K�E�Z���ǂ��ł����A";
		mes "���Ԃ����K�E�Z���X�e�L�ł��I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "����ł͕K�E�Z��";
		mes "�����⒇�Ԃ����";
		mes "�h��n�̋Z�ɂ��܂��傤���I";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�͂��I";
		mes "�����h��n�̃X�L�����g���āA";
		mes "��l�Ŋ��S�Ȃ�";
		mes "�S�ǂ̖h������������܂��傤�I";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�S�ǂ̖h��!!";
		mes "���΂炵�����������������ł��I";
		mes "�S�ǂƌ����΃I�[�g�K�[�h�ł��ˁB";
		mes "�l�͕K�E�Z��";
		mes "�I�[�g�K�[�h���g�������Ǝv���܂��I";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�ł͎��́c�c";
		next;
		if(select("����","���C���e����") == 2) {
			cutin "gelca04.bmp", 2;
			mes "[�Q���J]";
			mes "���C���e�����ł����H";
			mes "�m���ɂ����������X�L���ł����c�c�B";
			mes "�h��n�̃X�L����������ł��I";
			next;
			menu "���Ⴀ�c�c�����́H",-;
			mes "�c�c�I�@�����ł��ˁI";
		} else {
			cutin "gelca03.bmp", 2;
			mes "�����ł��ˁI";
		}
		mes "[�Q���J]";
		mes "�C���̖h��Ƃ����΋����I";
		mes "�����ɂ��܂��傤�I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "����ł�";
		mes "�l�̓I�[�g�K�[�h�A";
		mes "�Q���J����͋����ŁA";
		mes "�S�ǂ̖h������܂��傤�I";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�͂��I�ł́c�c";
		mes "�ǂ��炩��X�L�����g���܂����H";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�l�̓Q���J����̋�������";
		mes "����������������������Ǝv���܂��I";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�����`�I�@����";
		mes "���G���N�̃I�[�g�K�[�h���炪";
		mes "�����Ǝv���܂���!!";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�����ł����H";
		mes "���`��A�Y�݂܂��ˁc�c�B";
		mes "�������I�@����Ȏ������I";
		mes strcharinfo(0)+"�����";
		mes "���߂Ă��������܂��傤!!";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�����ł��ˁI�@����l�����";
		mes "�ǂ��炪�������悭������̂��A";
		mes strcharinfo(0)+"�����";
		mes "�ӌ������������ł�!!";
		next;
		if(select("���G���̃I�[�g�K�[�h����","�Q���J�̋�������") == 1) {
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�킩��܂����I";
			mes "�ł͂�����������Ă݂܂��傤�I";
			mes "���G���N�A�����܂���I";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "�͂�!!";
			next;
			emotion 44,getmdnpcname("���G��#17");
			cutin "roel01.bmp", 0;
			mes "[���G��]";
			mes "�S�ǂ̏��I";
			mes "���G�����I�[�g�K�[�h!!";
			misceffect 214,getmdnpcname("���G��#17");
			next;
			emotion 44,getmdnpcname("�Q���J#17");
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "���S�Ȃ�h��I";
			mes "�Q���J���j�m�^�E����!!";
			misceffect 203,getmdnpcname("�Q���J#17");
			next;
		} else {
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "�킩��܂����I";
			mes "�ł͂�����������Ă݂܂��傤�I";
			mes "���G���N�A�����܂���I";
			next;
			cutin "roel02.bmp", 2;
			mes "[���G��]";
			mes "�͂�!!";
			next;
			emotion 44,getmdnpcname("�Q���J#17");
			cutin "gelca01.bmp", 2;
			mes "[�Q���J]";
			mes "���S�Ȃ�h��I";
			mes "�Q���J���j�m�^�E����!!";
			misceffect 203,getmdnpcname("�Q���J#17");
			next;
			emotion 44,getmdnpcname("���G��#17");
			cutin "roel01.bmp", 0;
			mes "[���G��]";
			mes "�S�ǂ̏��I";
			mes "���G�����I�[�g�K�[�h!!";
			misceffect 214,getmdnpcname("���G��#17");
			next;
		}
		cutin "gelca01.bmp", 2;
		mes "[���G��&�Q���J]";
		mes "�N���X�I";
		misceffect 220,getmdnpcname("���G��#17");
		misceffect 220,getmdnpcname("�Q���J#17");
		next;
		cutin "roel01.bmp", 0;
		mes "[���G��&�Q���J]";
		mes "���͎��g�ƒ��Ԃ���鏂�ƂȂ�!!";
		misceffect 249,getmdnpcname("���G��#17");
		misceffect 374,getmdnpcname("�Q���J#17");
		misceffect 246,getmdnpcname("���G��#17");
		misceffect 13,getmdnpcname("�Q���J#17");
		misceffect 13,getmdnpcname("���G��#17");
		misceffect 336,getmdnpcname("���G��#17");
		misceffect 41,getmdnpcname("�Q���J#17");
		misceffect 41,getmdnpcname("���G��#17");
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�c�c�ӂ��B";
		mes "�ǂ��ł������A";
		mes strcharinfo(0)+"����B";
		next;
		menu "�ǂ��Ǝv��",-;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "!!�@���肪�Ƃ��������܂��I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "���܂����ˁI�@�Q���J����I";
		mes strcharinfo(0)+"����A";
		mes "�F�X�ӌ�������������";
		mes "���肪�Ƃ��������܂��I";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�͂��I�@����Ȃ�t����";
		mes "���i�_�������Ǝv���܂��I";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���e���g�l��";
		mes "�K�E�Z�ɂ͌��������Ƃ���";
		mes "�C���[�W������܂����A";
		mes "���ۂɂ͂ǂ�ȕ��Ȃ�ł����H";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�����ł��ˁA�t����";
		mes "�K�E�Z�ɂ͓��ɂ��邳���ł��ˁB";
		next;
		mes "[�Q���J]";
		mes "�K�E�Z�Ƃ́I";
		mes "�����Ƃ������Ɏg�����́I";
		mes "���������āA���̂����ƌ�������";
		mes "�����Ɏg�����Ȃ���悤�A";
		mes "���X�b�B���d�˂鎖�I";
		mes "���ꂪ�t���̋����ł��B";
		next;
		mes "[�Q���J]";
		mes "�����Ďt��������܂��A";
		mes "�A�[�N�r�V���b�v�ł���Ȃ���";
		mes "�ؗ̓g���[�j���O����������";
		mes "�����A�s���Ă����ł��I";
		next;
		mes "[�Q���J]";
		mes "���Ԃ����ɂ͐悸������";
		mes "�g�̂�b���ċ����Ȃ�Ȃ���";
		mes "�Ӗ����Ȃ�����ƁI";
		next;
		mes "[�Q���J]";
		mes "�����c�c";
		mes "��s��������Ƃ���΁A";
		mes "�A�[�N�r�V���b�v�̈ߑ��ł�";
		mes "�t���̒b�������ꂽ�f���炵��";
		mes "�勹�؂╠���؂�";
		mes "����Ȃ����ƂȂ�ł���ˁB";
		next;
		cutin "roel03.bmp", 2;
		mes "[���G��]";
		mes "�c�c���A�ؓ��̂��Ƃ�";
		mes "�l�ɂ͗ǂ��킩��܂��񂪁A";
		mes "�f���炵�������ł��ˁI";
		mes "�������A���e���g�l���Ȃ��B";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�͂��I�@�t����";
		mes "������ƌ�����������";
		mes "�������A���Ԏv���ł����A";
		mes "�f���炵�����ł��I";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�c�c������A";
		mes "�V�������V�[�����̎���";
		mes "�x�����Ă���̂��Ǝv���܂��B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���ԂɊ댯�����邩������Ȃ���";
		mes "�x������Ă���̂ł��ˁB";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�����Ƃ������Ǝv���܂��B";
		mes "�V�������V�[�����̎���";
		mes "�����Ȃ킯�ł͂Ȃ��Ǝv���܂��B";
		next;
		mes "[�Q���J]";
		mes "�Ӗ����Ȃ��A";
		mes "�l���������肷����ł͂Ȃ��̂ŁB";
		mes "���������̂�";
		mes "�������₷����ł����ǂˁB";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�Ȃ�قǁB�m���Ƀ}�X�^�[�Ƃ��āA";
		mes "�M���h�����o�[����邱�Ƃ�";
		mes "�ƂĂ��厖�Ȏ��ł��B";
		mes "���e���g�l�͂����";
		mes "�C�ɂ����Ă���������̂ł��傤�B";
		next;
		mes "[���G��]";
		mes "�l�����āA";
		mes "���Ԃ��댯�Ȗڂɍ����̂͌��ł��I";
		mes "�ł��A�l�ɂ̓V�������V�[����";
		mes "�݂�ȂɊ�Q��������Ƃ�";
		mes "�v���Ȃ��̂ł����c�c�B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "�����ł��ˁB���������v���܂��B";
		mes "�V�������V�[������";
		mes "���F�B���~���������������Ǝv���܂��B";
		mes "���́A�V�������V�[������";
		mes "�����ƐF�X�b�����������ł��B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���v�ł��A�Q���J����!!";
		mes "�V�������V�[�����";
		mes "�����Ɩ߂��Ă��܂�!!";
		next;
		mes "[���G��]";
		mes "�V�������V�[���񂪖߂��Ă���";
		mes "�������댯�Ȃ��Ƃ���������A";
		mes "���̎��͖l��̕K�E�Z��";
		mes "�݂�Ȃ����܂��傤�I";
		next;
		mes "[���G��]";
		mes "�������A";
		mes "�V�������V�[��������܂��I";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���G���N�c�c!!";
		mes "�����ł��ˁI�@��������";
		mes "�݂�Ȃ��A�V�������V�[������";
		mes "���܂��傤!!";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�����A�����ƌ��܂�����I";
		mes "�K�E�Z�̗��K�ł��I";
		mes "�l�炪�{���ɋ����Ȃ��";
		mes "���e���g�l��������";
		mes "���S���Ă�������ł��傤�I";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�����ł��ˁI";
		mes "�撣��܂��傤�I";
		close2;
		cutin "gelca01.bmp", 255;
		set JTB_2QUE,3;
		setquest 116500;
		compquest 116500;
		end;
	} else {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�K�E�Z����K���Ă��܂��I";
		mes "�������悭�A�����ċ����Ȃ邽�߂ɁI";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
}

1@jtb.gat,200,304,0	script	#����17�ԕ����o��	45,2,2,{
	mes "�]�������烁���o�[������ꏊ��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	warp getmdmapname("1@jtb.gat"),353,42;
	end;
}

//==========================================
// 18�ԕ���NPC�F���������{�{�X���j��C�x���g
//------------------------------------------
1@jtb.gat,32,376,5	script	���i�C��#18	10039,{
	if(JTB_2QUE != 4) {
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�ׁA�ʂɃV�������V�[�̎��Ȃ��";
		mes "�C�ɂ��ĂȂ����I";
		mes "�S�R���݂����Ȃ񂩂Ȃ��񂾂���I";
		close2;
		cutin "lunain04.bmp", 255;
		end;
	} else {
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "���͎��̂���ׂ����Ƃ���邾����B";
		mes "�o�J���G���ɂȂ񂩕����Ȃ���B";
		close2;
		cutin "lunain04.bmp", 255;
		end;
	}
}

1@jtb.gat,40,378,5	script	�����f�B�[�W���b�N#18	844,{
	if(JTB_2QUE != 4) {
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�������ȂǗ��ĂĂ��Ȃ��I";
		mes "�B��Ă���̂�";
		mes "�Ȃ݂����Ȃ��̂��I";
		close;
	} else {
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�ӂ�B���ɋC�Â��Ȃ��Ƃ�";
		mes "���̓�l���܂��܂����ȁB";
		close;
	}
}

1@jtb.gat,37,376,3	script	�A�C�O#18	646,{
	if(JTB_2QUE != 4) {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���i�C���c�c";
		mes "����Ȕ߂����炵�Ȃ��łȂ́B";
		mes "���܂Ŕ߂����Ȃ����Ⴄ�́B";
		next;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "�߂����Ȃ񂩂Ȃ��I�@�ʂ�";
		mes "�V�������V�[���s����������������";
		mes "�߂����Ȃ񂩂Ȃ��񂾂���I";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "����ς�V�������V�[�̎��Ȃ́B";
		mes "���i�C���������Ⴂ�����Ȃ́B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�Ȃɂ�c�c�A�C�O�̕���";
		mes "���������ɂȂ��Ă邶��Ȃ��́B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�����ĂȂ��́I�@���v�Ȃ́I";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�������ċ����ĂȂ��񂾂���I";
		next;
		if(select("����������","�����Ƃ��Ă���") == 1) {
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes "!?�@������ƁA";
			mes strcharinfo(0)+"�I";
			mes "���A����ȂƂ���ŉ����Ă�̂�I";
			next;
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "�ق�ƂȂ́B";
			mes strcharinfo(0)+"������́I";
			mes "�ǂ������́H";
			mes "�Ȃɂ��������́H�@�Ȃ́B";
			next;
		} else {
			cutin "igu02.bmp", 255;
			mes "["+strcharinfo(0)+"]";
			mes "�A�C�O�A���i�C���c�c";
			next;
			cutin "lunain04.bmp", 2;
			mes "[���i�C��]";
			mes strcharinfo(0)+"!!";
			mes "�ȁA�Ȃɂ�I�@�т����肷�邶��Ȃ��I";
			next;
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "�ǂ������́H";
			mes "�Ȃɂ��������́H�@�Ȃ́B";
			next;
		}
		menu "�V�������V�[�̎��Řb������",-;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�ʂɂ��̎q�����Ȃ��Ȃ���";
		mes "���݂����Ƃ��A����Ȃ��ƂȂ����I";
		mes "������ƐÂ��ɂȂ������炢��I";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "���i�C���c�c����A���݂�������";
		mes "�����Ă�悤�Ȃ��̂Ȃ́B";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "!!!!!!";
		mes "���A����Ȃ��ƃb�c�c�I";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c���݂������B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�}�ɂǂ����s�����Ⴄ�񂾂��́B";
		mes "���݂����Ɍ��܂��Ă邶��Ȃ��B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�������݂����́B";
		mes "�����������ǂ��Ȃꂽ�̂ɁB";
		next;
		menu "�����̖��Ȃ̂ɕ|���Ȃ��́H",-;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�s�v�c�ƕ|���͂Ȃ���ˁB";
		mes "�ł��A�ǂ�Ȃɒ��ǂ��Ȃꂽ�Ƃ��Ă�";
		mes "���̎q�͖����̖��c�c�B";
		mes "�m���ɑS���s�����Ȃ����ƌ������";
		mes "����Ȃ��Ƃ͂Ȃ���B";
		next;
		mes "[���i�C��]";
		mes "�ł����������P�����肵�Ȃ��������A";
		mes "�����X�^�[�Ƃ͗F�B�ɂȂ�Ȃ���";
		mes "�����Ǝv���Ă����ǁA";
		mes "����Ȃ��ƂȂ��̂�������Ȃ��B";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[��";
		mes "�F�B���~�������Ċ����";
		mes "�����Ɏ����������ꂽ�́B";
		mes "��������A�����������͗F�B�Ȃ́I";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�F�B�c�c�ł��c�c�B";
		mes "���́c�c";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�{���̓��i�C���͂����A";
		mes "�V�������V�[�̎��A�F�B���Ǝv���Ă�B";
		mes "������V�������V�[��";
		mes "���Ȃ��Ȃ��Ă��݂����́B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "�F�B�������ɍs���Ă��܂���";
		mes "���݂������ǁc�c";
		mes "�V�������V�[�Ƃ�";
		mes "�܂����悤�ȋC������́B";
		next;
		mes "[�A�C�O]";
		mes "������A�܂������A";
		mes "���̎��A���i�C���̋C������";
		mes "�`����΂����Ǝv���́B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�������c�c������ˁB";
		mes "�F�B�ɂȂ��Ƃ�����������";
		mes "�܂��悭�킩��Ȃ����ǁA";
		mes "�V�������V�[�����Ȃ��Ȃ���";
		mes "������Ƃ��݂����͎̂�����B";
		next;
		mes "[���i�C��]";
		mes "�܂���邩������Ȃ��Ȃ�A";
		mes "���̎��Y�ނ��Ƃɂ����B";
		mes "�������������";
		mes "���\���\������Ȃ񂩂��Ȃ��B";
		mes "���ɂ͂��Ȃ��Ⴂ���Ȃ�";
		mes "�厖�Ȃ��Ƃ����邩��B";
		next;
		menu "�厖�Ȃ��ƁH",-;
		cutin "lunain01.bmp", 2;
		mes "[���i�C��]";
		mes "������B";
		mes "���̃o�J���G���Ɠ����悤�ȖڕW�Ȃ��";
		mes "������ƕs�������ǁA";
		mes "�������ċ����Ȃ肽���́B";
		next;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l���A�݂�Ȃ�";
		mes "���邭�炢�����A�ˁB";
		mes "��������A�n�C�v���[�X�g���������";
		mes "����܂Ƃ��͂��Ƃ���B";
		next;
		cutin "igu03.bmp", 2;
		mes "[�A�C�O]";
		mes "���i�C���A�����������́I";
		next;
		mes "[�A�C�O]";
		mes "���Ⴀ�A���͂����Ƃ�����";
		mes "�݂�Ȃ����C�ɂ���";
		mes "�̂≹�y��x����A";
		mes "���E���ɓ͂�������́I";
		next;
		mes "[�A�C�O]";
		mes "�ǂ��������ɂ���V�������V�[�ɂ�";
		mes "�����Ɠ͂��͂��c�c�Ȃ́I";
		next;
		menu "�f�G�ȖڕW����",-;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "���肪�Ƃ��Ȃ́�";
		mes "�撣��́I";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�ׁA�ʂɁI";
		mes strcharinfo(0)+"��";
		mes "�J�߂��Ă��������Ȃ����I";
		mes "�c�c�݂�Ȃɂ͌���Ȃ��ł�B";
		mes "�i�C�V���Ȃ񂾂���ˁI";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "���낻��߂�Ȃ���";
		mes "�݂�ȐS�z����́B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�����ˁB�F�X�F������Ă��ʓ|����B";
		mes "�ʂɋ����ĂȂ񂩂Ȃ����ǁB";
		next;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "���Ⴀ"+strcharinfo(0)+"�B";
		mes "�������͐�ɖ߂�́I";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes strcharinfo(0)+"�I";
		mes "�]�v�Ȃ��Ƃ͌���Ȃ��ł�ˁI";
		mes "�킩���Ă���ˁI";
		next;
		cutin "lunain04.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "���v���B�����������肵�Ȃ��B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�W���b�N�c�c�I";
		mes "�܂��B��Ă��́H";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "!?!?";
		mes "�����A����A������ƁI";
		mes "���̘b�����Ă���!?";
		next;
		cutin "lunain04.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�t���B��l�̎���ւ̕ԓ���";
		mes "�����C�G�X���B";
		mes "���v���B�N�ɂ������B";
		mes "���S����Ƃ����B";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "���S�Ȃ�Ăł��Ȃ����I";
		mes "�����H�@��΂�����ˁI";
		mes "��΁A����Ȃ��ł�˂��I";
		next;
		cutin "lunain04.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�����B";
		mes "���i�C���A���O�������Ă�������";
		mes "�N�ɂ������B";
		next;
		cutin "lunain04.bmp", 2;
		mes "[���i�C��]";
		mes "�Ȃ��I�@�����ĂȂ񂩂��Ȃ������I";
		mes "���[�I";
		mes "�A�C�O�A�s���I";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�����A���i�C���҂��ĂȂ́I";
		mes strcharinfo(0)+"�A";
		mes "�W���b�N�A�܂���ŁI�@�Ȃ́I";
		next;
		cutin "igu02.bmp", 255;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�B��Ă��鎄�ɋC�Â��Ȃ��Ƃ́A";
		mes "���̓�l���܂��܂����ȁB";
		mes strcharinfo(0)+"�A";
		mes "���O�͋C�Â��Ă������낤�H";
		next;
		if(select("�C�t���Ă���","�C�t���Ȃ�����") == 1) {
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
			mes "[�����f�B�[�W���b�N]";
			mes "���������ȁB";
			next;
		} else {
			emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
			mes "[�����f�B�[�W���b�N]";
			mes "�t���A���O���܂��܂����ȁB";
			next;
		}
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�܂��A�����������ɂ��Ă��邩��";
		mes "��Ɍ����Ă������B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���͂��̏����ɂ��Ă�";
		mes "�ǂ��ł������B";
		mes "�����̖��ƌ����Ă�";
		mes "���ӂ�E�ӂ͊����Ȃ���������ȁB";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�A�C�O���C�ɓ����Ă�悤�����A";
		mes "��Q�������Ȃ��̂Ȃ��";
		mes "������͉������Ȃ��B";
		next;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "��������Ύ��͐키�B";
		mes "���ꂾ�����B";
		next;
		menu "�킩����",-;
		emotion 9,getmdnpcname("�����f�B�[�W���b�N#18");
		mes "[�����f�B�[�W���b�N]";
		mes "�ł͎����߂�Ƃ��悤�B";
		mes "�A�C�O���S�z���B";
		close2;
		cutin "igu02.bmp", 255;
		set JTB_2QUE,4;
		setquest 116500;
		compquest 116500;
		setquest 116501;
		end;
	} else {
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�V�������V�[�ɂ�";
		mes "���͓̉̂͂��͂��Ȃ́�";
		close2;
		cutin "igu02.bmp", 255;
		end;
	}
}

1@jtb.gat,35,390,0	script	#����18�ԕ����o��	45,2,2,{
	mes "�]�������烁���o�[������ꏊ��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	warp getmdmapname("1@jtb.gat"),353,42;
	end;
}

//==========================================
// 19�ԕ���NPC�F���������{�{�X���j��C�x���g
//------------------------------------------
1@jtb.gat,112,377,3	script	���e���g#19	630,{
	if(JTB_2QUE != 5) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes strcharinfo(0)+"�A";
		mes "�b���ĂȂ񂾁H";
		mes "���͖Z�����񂾁B��Z�ɗ��ނ��B";
		next;
		if(select("�P�������Ɍ���","�܂��͐��Ԙb������") == 1) {
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "���̖����̖��̎����B";
			mes "�Ȃ񂾁A���O���A�C�c��";
			mes "�C�ɓ����Ă���̂��B";
			next;
		} else {
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�Ȃ񂾁H";
			mes "����Ȑ��Ԙb�̂��߂�";
			mes "�����Ă񂾂񂶂�Ȃ��񂾂�H";
			next;
			mes "[���e���g]";
			mes "���͖Z�����ƌ����Ă�񂾁B";
			mes "�����p����b���B";
			next;
		}
		menu "�V�������V�[���M���h�ɓ���Ă�������",-;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���O�����c�c�B";
		mes "�ǂ����������A���l���Ȃ�";
		mes "�ȒP�Ɍ����₪���āc�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�������B�����͈������B";
		mes "�������A�����ɍ��ꂽ�g�k�B";
		mes "���������N��";
		mes "���߂��������B";
		next;
		mes "[���e���g]";
		mes "�����ꉞ�A���E�҂̒[���ꂾ�B";
		mes "���͖ł�����̂��ƐS���Ă���B";
		mes "�X�ɖ����̎g�k�Ƃ�����A";
		mes "���ʂ͑�������������̂��B";
		next;
		mes "[���e���g]";
		mes "������M���h�ɓ���邾�ƁH";
		mes "�L�蓾�Ȃ����낤�I";
		mes "����ł��ꉞ�M���h�}�X�^�[���B";
		mes "�����o�[�Ɋ댯���y�Ԃ�������Ȃ�";
		mes "�s���v�f���A�M���h��";
		mes "�}�������킯�ɂ͂����Ȃ��B";
		next;
		mes "[���e���g]";
		mes "�˂���"+strcharinfo(0)+"�B";
		mes "���O�̗v�]�͋p�����B";
		next;
		mes "[���e���g]";
		mes "�b�͂��ꂾ�����H";
		mes "������������߂邼�B";
		next;
		menu "�҂��Ă�������",-;
		mes "[���e���g]";
		mes "�Ȃ񂾁H�@�܂���������̂��H";
		mes "���x�����������͖Z�����񂾁B";
		mes "������Ȃ��b�͎��߂Ă����B";
		next;
		menu "�G�ӂ��Ȃ�����ł��댯�Ȃ̂��H",-;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���O���������ȁc�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����������B����ɓG�ӂ��Ȃ��Ƃ��A";
		mes "�ł��ׂ����݂��Ƃ����F����";
		mes "�Ȃɂ��ς��Ȃ��B";
		mes "���肪�����Ȃ�Ȃ����炾�B";
		next;
		mes "[���e���g]";
		mes "���E�҂Ƃ͂����������̂Ȃ񂾂�B";
		mes "���Ԃ���邽�߂ɕK�v�Ȏ����B";
		next;
		menu "���Ԃ��]�܂Ȃ��Ƃ��H",-;
		mes "[���e���g]";
		mes "���Ԃ��]�܂Ȃ��c�c���B";
		mes "�Վ������o�[�̂�����";
		mes "�m�����悤�Ȍ��������₪��B";
		next;
		mes "[���e���g]";
		mes "�����A�m���Ă���Ƃ��B";
		mes "�����炪���̖���";
		mes "�C�ɓ����Ă��鎖���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�j���I�[�Y�̓z��";
		mes "�{�C�ŃM���h�ɓ��ꂽ�����Ă��鎖���I";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�ł��ȁI�@���͉����}�X�^�[���I";
		mes "�����o�[���댯�Ȗڂ�";
		mes "���킹���ɂ͂����˂��I";
		next;
		mes "[���e���g]";
		mes "�������̖����̎g�k���A";
		mes "�ˑR�P���|�����Ă�����ǂ�����H";
		mes "���f���Ă���A�C�c���";
		mes "�����ɂ���Ă��܂����낤�I";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�����Ƃ͂����������������I";
		mes "�l�̐S��ǂ݁A���̌������Ă���B";
		mes "�����牴�琹�E�҂�";
		mes "�]�E�̎����炻����������A";
		mes "��������������߂̏C�Ƃ�����񂾁I";
		next;
		menu "�V�������V�[�̎�����������̂ł́H",-;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���Ɍ������邩�A���Ɓc�c�H";
		next;
		mes "[���e���g]";
		mes "�c�c�c�c";
		next;
		mes "[���e���g]";
		mes "�Ȃ񂾁H";
		mes "���O�͐l�̐S���������C�s�ł�";
		mes "���Ă�̂��H";
		next;
		mes "[���e���g]";
		mes "����Ƃ�";
		mes "���̈����̎g�k�̂悤��";
		mes "�l�̐S��ǂޗ͂ł������Ă���̂��H";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�������B";
		mes "���ɂ͂����킩���Ă���B";
		mes "���̖����̎g�k�A�V�������V�[��";
		mes "������x������Ȃǖ��������B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����͖{����";
		mes "�����A���Ԃ��~���������������B";
		next;
		mes "[���e���g]";
		mes "�����A������ƌ�����";
		mes "�����ȒP��";
		mes "�M���h�����o�[�ɂ��鎖��";
		mes "�ł��Ȃ����낤�B";
		next;
		mes "[���e���g]";
		mes "���������Q�Ȃ̂͂킩���Ă���B";
		mes "�������A�����A";
		mes "�S���ς���Ă��܂�����ǂ�����B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�����A������ˑR";
		mes "�l�Ԃ��P������ǂ�����񂾁I";
		next;
		menu "���̎��͂��Ȃ����݂�Ȃ����΂���",-;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�����A���̎��͎�邳�I";
		mes "�����������A����͖��������̎g�k�I";
		mes "��ʂ̃����X�^�[�Ƃ�";
		mes "���炩�ɋ������Ⴄ���낤�I";
		next;
		mes "[���e���g]";
		mes "����ɁA�܂�����";
		mes "�y���Ƃ��������X�^�[��";
		mes "��ʂɌ���邩�������I";
		next;
		mes "[���e���g]";
		mes "����l�łǂ������";
		mes "���ׂĂ̐l�Ԃ�����!?";
		next;
		menu "�Ȃ���l�Ŏ�낤�Ƃ���",-;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ�A���Ɓc�c!?";
		next;
		menu "���ԂƋ��ɐ키�Ƃ����I�����͂Ȃ��̂�",-;
		mes "[���e���g]";
		mes "�c�c";
		next;
		mes "[���e���g]";
		mes "�c�c�c�c";
		next;
		mes "[���e���g]";
		mes "�c�c�c�c�c�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���ԂƋ��Ɂc�c���B";
		mes "�킩������A�~�Q���B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�{���͂킩���Ă����񂾁B";
		mes "�ǂ������";
		mes "�����o�[�ɂƂ��āA";
		mes "���̖����̎g�k�ɂƂ��āA";
		mes "��ԗǂ������B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����ǂȁA";
		mes "���E�҂Ƃ��Ă̖��ʂȃv���C�h�Ƃ��A";
		mes "������Ƃ����Ӓn�Ƃ���";
		mes "��������Ȃ��t�����Ă����B";
		next;
		mes "[���e���g]";
		mes "����ɉ��́A";
		mes "���E�҂Ȃ�Ă���Ă邪";
		mes "�_�̗ނ�ϐM���Ă�킯����˂��B";
		mes "�ނ��듪�̌ł�����̂��̂��A����";
		mes "�����Ȃ��炢�����ȁB";
		next;
		mes "[���e���g]";
		mes "�c�c������̍�������������Ȃ�";
		mes "�ʔ�����������Ȃ����ȁc�c�B";
		next;
		menu "�ƌ������Ƃ�!?",-;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�܂��n�b�L����";
		mes "���߂��킯����˂���!?";
		next;
		mes "[���e���g]";
		mes "�c�c�����̘b���炢��";
		mes "�����Ă����Ď����I";
		next;
		menu "�����H",-,"���O�������Ă���Ȃ��Ƃ킩��Ȃ�",-;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�N�b�c�c�I";
		mes "�V�������V�[��!!";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "������!!�@���O���A";
		mes "�����̂��߂���Ȃ������!!";
		mes "�����ʔ��������Ǝv�������炾�I";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�t���B";
		mes "���q���������c�c�B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���������ΐ́A";
		mes "���̂��O�Ɍ���ꂽ����";
		mes "�����悤�Ȃ��Ƃ��������z�������ȁB";
		next;
		mes "[���e���g]";
		mes "�܂������O��";
		mes "�������Ƃ�������Ƃ͂ȁc�c�B";
		next;
		mes "[���e���g]";
		mes "�c�c�܂������B";
		mes strcharinfo(0)+"�A";
		mes "���O�Ƙb���Đ����؂ꂽ���B";
		next;
		mes "[���e���g]";
		mes "�Վ������o�[�̂��O��";
		mes "����Ȃ��ƌ����̂��������A";
		mes strcharinfo(0)+"�A";
		mes "���O�������o�[�ŗǂ�������B";
		next;
		cutin "rote04.bmp", 2;
		mes "[���e���g]";
		mes "�c�c���肪�ƂȁB";
		close2;
		cutin "rote04.bmp", 255;
		set JTB_2QUE,5;
		setquest 116500;
		compquest 116500;
		compquest 116501;
		end;
	} else {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "��ɖ߂�A���͌ォ��s���B";
		mes "�������̒��𐮗��������B";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
}

1@jtb.gat,109,390,0	script	#����19�ԕ����o��	45,2,2,{
	mes "�]�������烁���o�[������ꏊ��";
	mes "�@�ړ����邱�Ƃ��ł���悤���]";
	next;
	if(select("�ړ����Ȃ�","�ړ�����") == 1) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�ړ����悤�]";
	close2;
	warp getmdmapname("1@jtb.gat"),353,42;
	end;
}

//==========================================
// �O�`�F�s���_�ȋ^�f
//------------------------------------------
jtb_01.gat,198,31,5	script	�~���~��#03	643,{
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�j���I�[�Y�A�b������񂾂��ǁB";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�ǂ��������H�@�~���~���B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�ǂ��������H���āA���Ȃ��ˁI";
	mes "���̎�������ĘA��Ă�q�͒N��B";
	next;
	mes "[�~���~��]";
	mes "�܂����j���I�[�Y�c�c";
	mes "�Ƃ��Ƃ��{���̃����R���Ɂc�c�B";
	next;
	menu "�j���I�[�Y�̓����R���Ȃ́H",-;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes strcharinfo(0)+"�c�c";
	mes "�����Ȃ茻���";
	mes "�����R���Ƃ͍����Ȃ��I";
	mes "�m���ɂ��̎q�͉������ǂˁ�";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����ŁA�{����";
	mes "���̎q�͉��Ȃ́H";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���̎q�Ƃ͂��̓��A��";
	mes "�������������`�I";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c����ȏꏊ�ŁH";
	mes "�˂��A���ʂɍl���āA";
	mes "�������Ȃ�������H";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c�j���I�[�Y�B";
	mes "���̂��΂���A�N�H";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c���΂���H";
	next;
	mes "[�~���~��]";
	mes "�c�c�́H";
	mes "�܂����Ƃ͎v�����ǁc�c";
	mes "���̂���!?";
	next;
	menu "�����c�c",-;
	mes "[�~���~��]";
	mes "�c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�~���~���`�H";
	mes "���[���B";
	next;
	mes "[�j���I�[�Y]";
	mes "�����Ȃ��c�c�B";
	mes "���΂��񔭌������Ȃ�";
	mes "�V���b�N�������݂����B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c�H";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���̐l�ɂ��΂���Ȃ��";
	mes "�������Ⴞ�߂���[�H";
	next;
	mes "[�j���I�[�Y]";
	mes "���x��������A�߂��I�@����`�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c����Ȃ��B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���āc�c���[���A";
	mes "�~���~������[��B";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c�N���~���~���������!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A�������ɂ��̌Ăѕ���";
	mes "���ʂ������݂������ˁB";
	next;
	menu "�ӂ����ق��������̂ł́H",-;
	mes "[�j���I�[�Y]";
	mes "�������ˁB";
	mes "�~���~���ɂ��߂�Ȃ������悤�B";
	next;
	cutin "shaloshi01.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c���߂�Ȃ����B";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�~���~���A�ӂ����񂾂�";
	mes "����ȕ|����c�c";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "�Ⴄ���!!�@�����X�^�[��!!";
	mes "�����\���Ȃ�����!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������Ɓ`�B��������B";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "���c�c����ȂɘV���Č�����́c�c�H";
	next;
	cutin "min02.bmp", 255;
	mes "�]�~���~���͕�����\���Ȃ���";
	mes "�@�ԂԂꂢ�Ă���B";
	mes "�@�ǂ���瑊���V���b�N��";
	mes "�@�󂯂��悤���c�c�]";
	close2;
	if(!(checkquest(116520) & 0x8)) {
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		setquest 116520;
		compquest 116520;
	}
	end;
}

jtb_01.gat,205,31,4	script	�j���I�[�Y#03	625,{
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�~���~���͂܂��܂��Ⴂ�񂾂�B";
	close2;
	cutin "nines01.bmp", 255;
	end;
}

jtb_01.gat,204,33,4	script	�H�H�H#03	10041,{
	cutin "shaloshi02.bmp", 2;
	mes "[�H�H�H]";
	mes "�c�c���΂���B";
	mes "�c�c���o����H";
	close2;
	cutin "shaloshi02.bmp", 255;
	end;
}

jtb_01.gat,220,23,0	script	3�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F��q�Ǝt��
//------------------------------------------
jtb_01.gat,291,42,5	script	���e���g#04	630,{
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�K�E�Z�͂������B";
	mes "�m���ɓG�𑒂�A";
	mes "���Ԃ������邱�Ƃ��ł���B";
	mes "�Ȃɂ��A�i�D�ǂ�����H";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

jtb_01.gat,297,42,4	script	�Q���J#04	629,{
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�h�[���A�V�V���E���T��";
	mes "�Q���J�f�X�I";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�c�c���O�܂��ςȖ{�ǂ񂾂ȁH";
	next;
	cutin "gelca03.bmp", 2;
	mes "[�Q���J]";
	mes "�A�}�c�ō��l�C�̏����ł���I";
	mes "���O�͊m���c�c�B";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�c�c������";
	mes "���̂��O���Ă񂾂��킩�邩�H";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�ނށc�c";
	mes "�t������^�ʖڃI�[���������܂��B";
	next;
	mes "[�Q���J]";
	mes "���A"+strcharinfo(0)+"����B";
	mes "�����������̎t����";
	mes "��k�͒ʂ��܂��񂩂�";
	mes "�C�����Ă��������B";
	next;
	menu "�킩����",-;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�Q���J�A���O������������H";
	mes "���̓��A�c�c��������B";
	next;
	cutin "gelca02.bmp", 2;
	mes "[�Q���J]";
	mes "�����ł��ˁc�c";
	mes "���̂̒m��Ȃ��͂������܂��B";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���������������A";
	mes "�A�������ɗ���������ˁ[����ȁB";
	mes "�y�����K���Ă������B";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�����ł��ˁI";
	mes "�������t���ł��I";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes strcharinfo(0)+"��";
	mes "���������������邱�Ƃ����āA";
	mes "�����������Ȃ��������Ă���B";
	next;
	mes "[���e���g]";
	mes "�������A�Q���J!!";
	mes "���K�E�Z�i���o�[8��!!";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�͂��I";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "��͉������I";
	mes "���Ȃ���I�@�f���v�����C�g�I";
	misceffect 220,"���e���g#04";
	misceffect 40,"���e���g#04";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�䂪�́A�������҂�ł��ӂ�!!";
	mes "��d�̓V���n�ԁI";
	misceffect 330;
	misceffect 377;
	misceffect 203;
	next;
	cutin "gelca01.bmp", 255;
	mes "[���e���g&�Q���J]";
	mes "��Ɠ��̗́A�������łт�^����I";
	next;
	mes "[���e���g&�Q���J]";
	mes "���V!!�@�����U��!!�@�M���̓��W��!!";
	misceffect 85,"���e���g#04";
	misceffect 85;
	misceffect 226,"���e���g#04";
	misceffect 226;
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�ӂ��B���ς�炸�t���͐����ł���!!";
	next;
	mes "[�Q���J]";
	mes "���ʂ̂Ȃ��g�̂�";
	mes "���x�ȑ̏p�c�c���[��B";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�Ȃ񂾁H";
	next;
	cutin "gelca03.bmp", 2;
	mes "[�Q���J]";
	mes "�t��!!�@�A�[�N�r�V���b�v���";
	mes "��ΏC���̂ق��������ł���!!";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�t���B";
	mes "���͂��̊i�D���C�ɓ����Ă�񂾁B";
	mes "����ɒj���I�o���Ă��c�c";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�����Ȃ�����!!";
	mes strcharinfo(0)+"�����";
	mes "�ǂ��v���܂�!?";
	next;
	switch(select("�C��������","�A�[�N�r�V���b�v������")) {
	case 1:
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "�ق�!!";
		mes strcharinfo(0)+"�����";
		mes "�����Ă܂���!!";
		next;
		mes "[�Q���J]";
		mes "�b�������ꂽ�ؓ��ɂقƂ΂��銾!!";
		mes "����ɏ��邩�����悳��";
		mes "����܂����!?";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ񂾂��O�c�c�ؓ��t�F�`�Ȃ̂�!?";
		mes "����Ƃ��ϑԁc�c�B";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "�����ł���A�t��!!";
		mes "���͂�����Ƒ勹�؂ƕ����؂�";
		mes "�D���Ȃ����ł�!!";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�c�c�B";
		next;
		cutin "rote01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "����l�ɂ͂ǂ����A";
		mes "�ؓ��̑f���炵�������";
		mes "�K�v�����肻���ł��ˁI";
		break;
	case 2:
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes strcharinfo(0)+"�A";
		mes "�킩���Ă邶��ˁ[���B";
		next;
		cutin "gelca04.bmp", 2;
		mes "[�Q���J]";
		mes "���������Ă����ł���!!";
		next;
		mes "[�Q���J]";
		mes "�t���͂������悭�ċ����ł����ǁc�c";
		mes "����Ȃ����̂�����܂�!!";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "����̓Y�o��!!�@�I�o�ł�!!";
		mes "���ɒb�������ꂽ�g�̂́c�c�B";
		break;
	}
	next;
	cutin "gelca01.bmp", 255;
	mes "["+strcharinfo(0)+"]";
	mes "�i�c�c�������ޗ]�n���Ȃ��ق�";
	mes "�������������B�j";
	next;
	misceffect 194;
	cutin "gelca04.bmp", 2;
	mes "[�Q���J]";
	mes "�������I�@�t��!!";
	mes "�����Ȃ�`���b�v���č����ł���!?";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "���O�͋�������Ƙb�����������ɁA";
	mes "�ْ������Ȃ��������B";
	next;
	cutin "gelca02.bmp", 2;
	mes "[�Q���J]";
	mes "�����`�c�c�����܂���c�c�B";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�Ƃɂ����A���̓��A��";
	mes "���ʂ���˂�����ȁc�c�B";
	mes "�݂�Ȗ������Ƃ����񂾂��c�c�B";
	next;
	cutin "gelca02.bmp", 2;
	mes "[�Q���J]";
	mes "�t���A���K�E�Z�̑O��";
	mes "�ً}���W����K����ׂ��ł����ˁc�c�B";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�������ɁA���O�͂�����";
	mes "��@�������ׂ����ȁB";
	next;
	cutin "gelca02.bmp", 2;
	mes "[�Q���J]";
	mes "�͂����c�c�B";
	next;
	cutin "gelca02.bmp", 255;
	mes "["+strcharinfo(0)+"]";
	mes "�i����2�l�A�{���ɂ���";
	mes "�t��֌W���Ȃ��B�j";
	close2;
	if(!(checkquest(116521) & 0x8)) {
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		setquest 116521;
		compquest 116521;
	}
	end;
}

jtb_01.gat,306,47,0	script	4�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�����X�^�[�̗�����
//------------------------------------------
jtb_01.gat,115,113,4	script	�A�C�O#06	646,{
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�ŋ߂̓��b�X���⃉�C�u���Z������";
	mes "�`�����ł��Ȃ��������ǁA";
	mes "����ς肱������Ė`�������";
	mes "�C���������́I";
	mes "�j���I�[�Y�ɂ�������I";
	close2;
	cutin "igu01.bmp", 255;
	end;
}

jtb_01.gat,112,119,5	script	�~���~��#06	643,{
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�����͖{���ɕs�v�c�Ȃ��̂΂���ˁB";
	close2;
	cutin "min01.bmp", 255;
	end;
}

jtb_01.gat,111,115,5	script	�A����#06	644,{
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "��΂����Y�킾��ˁI";
	mes "���������̕�Η~�����Ȃ��B";
	close2;
	cutin "arang01.bmp", 255;
	end;
}

jtb_01.gat,116,117,4	script	���i�C��#06	10039,{
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�~���~���B";
	mes "����Ȃ񂾂Ǝv���H";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�����ˁc�c������������";
	mes "�����̐^��ɂ��������Ȃ���ˁB";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�����Y��Ȃ́�";
	next;
	menu "�ǂ��������́H",-;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "���A"+strcharinfo(0)+"�B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�������A���̏����������X�^�[��";
	mes "����𗎂Ƃ����́B";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "�^���胋�r�[���D�����Ȃ���";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�傫���͑������悤��";
	mes "�S�������ˁB";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�c�c�B";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "������ƁA�A�C�O�B";
	mes "�ǂ������̂�B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�c�c���H";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "�A�C�O�A�����Ă�́c�c�H";
	next;
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "���A����c�c�H";
	mes "�ǂ����Ď������Ă�́H";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����͂�����������������B";
	next;
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "���̐^��A�����Y�킾�Ȃ���";
	mes "���Ăāc�c�B";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "����B";
	next;
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "�ł��Ȃ�Ă������c�c";
	mes "�Y��Ȃ��������āA�C�Â����́B";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�ǂ��������ƁH";
	next;
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "���܂������Ȃ��񂾂��ǁc�c";
	mes "����ۂȂ́c�c�B";
	next;
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "�Y��Ȃ����ŁA���̐^��ɂ�";
	mes "�����䂩�����̂��Ȃ��́B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����͑����A�C�~�e�[�V����������";
	mes "����Ȃ�������H";
	next;
	menu "�C�~�e�[�V�����H",-;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�͑��i���Ă��ƂˁB";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "����A�^�삶��Ȃ��́H";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�����͏ڂ������ׂȂ���";
	mes "�킩��Ȃ����ǂˁB";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�����A�������肱��͎��R�ɍ��ꂽ";
	mes "���m�ł͂Ȃ����Ƃ͊m���ˁB";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "����c�c���悤���܂˂�";
	mes "���ꂽ�����Ȃ́c�c�B";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "�{�����A���g���X�J�X�J�݂�����";
	mes "�����y�����c�c���āA�~���~��!?";
	next;
	misceffect 3,"�~���~��#06";
	cutin "arang01.bmp", 255;
	mes "�]�~���~���͐^��������Ȃ�";
	mes "�@�n�ʂɒ@�������I�]";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�����Ȃ��������c�c!?";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�܂�ł��̏����������X�^�[��";
	mes "�����鎞�݂�����";
	mes "�������������́c�c�B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����ς肱��A�^��Ƃ͈Ⴄ�����ˁB";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "�ł��A�ǂ����Ă����";
	mes "�����X�^�[�������Ă��́H";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�������ɂ���̓~���~���ł�";
	mes "�킩��Ȃ��ł���B";
	next;
	menu "���̓��A�Ɗ֌W�����肻��",-;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes strcharinfo(0)+"�B";
	mes "���Ȃ��A�s������Ȃ��B";
	next;
	mes "[�~���~��]";
	mes "���̃����X�^�[�������Ă������Ƃ�";
	mes "�����������̃����X�^�[��";
	mes "�ގ��_������Ƃ��납��";
	mes "�����ƁA�����Ӗ�������͂���B";
	next;
	mes "[�~���~��]";
	mes "���̐^��̎���";
	mes "���ׂĂ݂�K�v�����肻���ˁB";
	close2;
	if(!(checkquest(116522) & 0x8)) {
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		setquest 116522;
		compquest 116522;
	}
	cutin "min01.bmp", 255;
	end;
}

jtb_01.gat,133,106,0	script	6�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�L�m�R�̂����́H
//------------------------------------------
jtb_01.gat,206,107,5	script	�~���~��#07	643,{
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����A"+strcharinfo(0)+"�B";
	next;
	menu "����ɂ���",-;
	mes "[�~���~��]";
	mes "�����A���߂Č�������";
	mes "�X���Ǝv�������ǁc�c";
	mes "���A�̂悤�ȋC�������ˁB";
	next;
	menu "�n�`�𒲍����ł����H",-;
	mes "[�~���~��]";
	mes "�����������Ċ���ƐA���Ƃ�";
	mes "�n�`�ɂ͏ڂ����̂�B";
	next;
	mes "[�~���~��]";
	mes "�ł��A�����̐A����y��";
	mes "���߂Ă݂���̂΂���ˁc�c";
	mes "�ŏ��͕��t�y���Ǝv�����̂ɁB";
	mes "���x�m�F���Ă��A�ςˁB";
	next;
	menu "�ρc�c�H",-;
	mes "[�~���~��]";
	mes "�����ˁA�Ⴆ��Ȃ�z���ŕ`����";
	mes "�G�̂悤�ȐA���Ɠy����c�c�B";
	mes "�����Ȃ�����c�c�B";
	next;
	mes "�]�~���~���͖T�ɐ����Ă���";
	mes "�@�L�m�R���̎悵���]";
	next;
	mes "[�~���~��]";
	mes "�����Ƃ���ǂ��v���H";
	next;
	switch(select("����������","���������Ȃ�����")) {
	case 1:
		mes "[�~���~��]";
		mes "�����ˁB�ŃL�m�R���L��";
		mes "�h�肳���Ȃ����c�c";
		mes "�����H�ׂĂ����v���Ǝv����B";
		break;
	case 2:
		mes "[�~���~��]";
		mes "����A����������B";
		mes "�ĊO��������������H";
		break;
	}
	mes "�����������ƂŁc�c�B";
	next;
	mes "[�~���~��]";
	mes "�͂��A�H�ׂāB";
	next;
	menu "��!?",-;
	cutin "min03.bmp", 2;
	mes "[�~���~��]";
	mes "����ȋ@��A�ő��ɂȂ����H";
	next;
	switch(select("�f��","�H�ׂĂ݂�")) {
	case 1:
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A�����ĐM�p�Ȃ��̂�����H";
		next;
		mes "[�~���~��]";
		mes "���v��A";
		mes "�����������玄�������Ă������B";
		next;
		mes "[�~���~��]";
		mes "�t�ɁA���ɉ����������Ƃ���";
		mes "�����Ă���鎩�M������Ȃ�";
		mes "�����H�ׂ邯�ǁH";
		next;
		cutin "min01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���܂�H�ׂ�C�͂��Ȃ����A";
		mes "����蒇�ǂ��Ȃ�";
		mes "�`�����X��������Ȃ��c�c�B�j";
		next;
		menu "���������܂�",-;
		mes "["+strcharinfo(0)+"]";
		mes "�i�c�c�����S�����Ȃ��B";
		mes "�����Ȃ��Ȃ����o�u���K����";
		mes "�H�ׂĂ���悤���c�c�B�j";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�Ȃ�قǁB";
		mes "����ς�łƂ��͂Ȃ��݂����ˁB";
		mes "�����H�ׂĂ݂悤������B";
		next;
		mes "[�~���~��]";
		mes "�c�c���������B";
		mes "�ł��̉����̌����ȑO�ɁA";
		mes "�������Ȃ���ˁc�c�B";
		next;
		mes "[�~���~��]";
		mes "�ł��H�����s������Ƃ肠�����A";
		mes "���̃L�m�R�͐H�ׂĂ����v�����ˁB";
		break;
	case 2:
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "�������ˁB�͂��A�H�ׂĂ݂āB";
		next;
		cutin "min01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̖��́c�c�B�j";
		next;
		mes "�]�������a���āA�������ɂ�";
		mes "�@���������Ƃ͌����Ȃ����������]";
		next;
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���H�@����Ȃɏa���́H";
		next;
		mes "[�~���~��]";
		mes "�H�ׂĂ݂鉿�l�͂��肻���ˁB";
		next;
		mes "[�~���~��]";
		mes "�c�c���������B";
		mes "����́c�c�ꖡ����������";
		mes "�܂܂�Ă���悤�ˁB";
		next;
		mes "[�~���~��]";
		mes "���͂ǂ񂮂�ɋ߂�������B";
		break;
	}
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����������A���肪�Ƃ��B";
	next;
	mes "[�~���~��]";
	mes "���Ȃ��̎������ƂȂ������������A";
	mes "����肱�̃L�m�R�ɂ���";
	mes "���������̂��傫����B";
	next;
	menu "���������Ď����ꂽ�H",-;
	cutin "min03.bmp", 2;
	mes "[�~���~��]";
	mes "���āA�ǂ�������H";
	next;
	mes "[�~���~��]";
	mes "�ł����ꂾ���͌����Ă�����B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���A���Ȃ��݂����Ȑl��";
	mes "��������Ȃ����B";
	next;
	mes "[�~���~��]";
	mes "���ꂶ�Ⴀ�ˁB";
	next;
	cutin "min01.bmp", 255;
	mes "�]�~���~���Ƃ̋������Ȃ�ƂȂ�";
	mes "�@�߂��Ȃ����C������]";
	close2;
	if(!(checkquest(116523) & 0x8)) {
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		setquest 116523;
		compquest 116523;
	}
	end;

}

jtb_01.gat,209,133,0	script	7�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F���킳�ꂽ�_��
//------------------------------------------
jtb_01.gat,290,114,4	script	�����f�B�[�W���b�N#08	844,{
	mes "[�����f�B�[�W���b�N]";
	mes "�_��̓��e���C�ɂȂ邩�H";
	mes "�c�c�܂��A���̂����킩�邩���ȁB";
	close;
}

jtb_01.gat,285,114,5	script	�j���I�[�Y#08	625,{
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����H�@���̂��ȁB";
	mes "�C�Â��΂܂���l����B";
	next;
	menu "����������",-;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A"+strcharinfo(0)+"�I";
	mes "�ǂ������`�A��l����Ȃ������I";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "�c�c�j���I�[�Y�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���̂��ȁB";
	mes "�ǂ����炩�����ĂԐ����c�c�B";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "�c�c���͂����܂񂼁B";
	next;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�₾�Ȃ��A�W���b�N�B";
	mes "���ꂪ���łɃc�b�R�~����H";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "����͂��Ă����B";
	mes "�����b���������B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������ˁ`�I";
	mes "���ɉ����p�Ȃ̂����H";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "���O�ƌ��킵���A��̌_��̘b���B";
	next;
	menu "�Ȃ��͂��������H",-;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�����B������A�C�ɂ��Ȃ��ŁB";
	mes "�ǂ����m���Ă����Ȃ�����";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "���O���C�ɂ��Ȃ��Ȃ�A";
	mes "������Ƃ��悤�B";
	next;
	mes "[�����f�B�[�W���b�N]";
	mes "����Ŗ{�肾���c�c";
	mes "���O���M���h�ɕ��A�������_�ŁA";
	mes "�_��͊��������B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A�������ˁB";
	mes "�ł��A������������";
	mes "�M���h�}�X�^�[����Ȃ��Ȃ������_�ŁA";
	mes "�_��I���ɂȂ�񂾂ˁB";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "�������ȁB";
	mes "�������A���͏󋵂��󋵂��B";
	mes "��̖񑩂͎��B";
	next;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������A�W���b�N��";
	mes "�Ƃ͂����܂����A�ی��Ƃ��Č��킵��";
	mes "�񑩂����ɗ��Ƃ͂˂��c�c�B";
	mes "�{���ɉ������ɗ���";
	mes "������Ȃ���ˁ`�I";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "���Ⴂ����ȁB";
	mes "���O�Ƃ͍�������������̂ƁA";
	mes "�A�������O����Ⴄ���߂��B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A�܂����W���b�N�c�c�I";
	mes "�����㐶�厖�Ɏ����Ă���";
	mes "�^�k�L�l�`���ق����̂����H";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "����ȕ�����������Ƃ����";
	mes "�ǂ�����Ɓc�c�B";
	next;
	switch(select("1�l�̎��₵���Ȃ�","�����ĐQ��Ƃ�")) {
	case 1:
		mes "[�����f�B�[�W���b�N]";
		mes "�����M���Ă���̂́A�����g�B";
		mes "�₵���Ɗ��������Ƃ͂Ȃ��B";
		mes "������l�`�͕K�v�Ȃ��ȁB";
		break;
	case 2:
		mes "[�����f�B�[�W���b�N]";
		mes "�Q��Ƃ����Ă��������N����";
		mes "�x�b�g�ŐQ���L�����Ȃ����ȁc�c�B";
		break;
	}
	next;
	mes "[�����f�B�[�W���b�N]";
	mes "�Ƃɂ����c�c�_��͏I��������";
	mes "�񑩂͎��B";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�킩������A�W���b�N�B���肪�Ƃ���";
	mes "���߂āc�c��낵���ˁB";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "�c�c�Ō�ɘV�k�S�Ȃ��猾�����A";
	mes "���̏����Ɗւ��̂�";
	mes "�~�߂��ق��������B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�c�c�B";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "���̏�������͕ʂ̈Ӗ���";
	mes "���������͂�������B";
	next;
	mes "[�����f�B�[�W���b�N]";
	mes "��������͖��̗́c�c�B";
	next;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����[�H";
	mes "�́A�K��Ȃ������H";
	mes "�^�킵���͈��Ƃ������Ăˁ�";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "����͂��O�̎��_���낤�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�Ƃɂ������v�I";
	mes "����M���Ă�A�W���b�N��";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "���Ƃ����񂾂��ȁc�c�B";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A�Â��b�͂����܂��ɂ���";
	mes "��ɐi�ނ�[�I";
	next;
	cutin "nines03.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes strcharinfo(0)+"�B";
	next;
	mes "�]�����o�����Ƃ���ƁA";
	mes "�@�����f�B�[�W���b�N��";
	mes "�@���������Ă����]";
	next;
	mes "[�����f�B�[�W���b�N]";
	mes "�c�c�������Ȃ����ɉ�����������";
	mes "���̂Ƃ��͗��ށB";
	next;
	mes "�]�W���b�N�̌��t�ɂ��Ȃ��������̂́A";
	mes "�@�������G�ȋC�����ɂȂ����]";
	close2;
	if(!(checkquest(116524) & 0x8)) {
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		getexp 500000,0,1;
		setquest 116524;
		compquest 116524;
	}
	end;
}

jtb_01.gat,307,122,0	script	8�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�V�������V�[�̍s��
//------------------------------------------
jtb_01.gat,31,197,5	script	�����f�B�[�W���b�N#10	844,{
}

jtb_01.gat,25,196,5	script	�A�C�O#10	646,{
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "����Ȃɂ�������W�܂����́B";
	mes "���̂܂܂݂�ȏW�܂�΂����́I";
	close2;
	cutin "igu01.bmp", 255;
	end;
}

jtb_01.gat,27,194,5	script	���M#10	647,{
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�~���N�̂ɂ����A���َq�̂ɂ����B";
	mes "�q���Ȃ��т��ł��傤�ˁB";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}

jtb_01.gat,28,197,4	script	�A����#10	644,{
	cutin "arang02.bmp", 2;
	mes "[�A����]";
	mes "�i�D�ǂ������X�^�[�o�Ă����Ł`��";
	mes "�|�������X�^�[�̓m�[�T���L���[�I";
	close2;
	cutin "arang02.bmp", 255;
	end;
}

jtb_01.gat,29,194,4	script	���e���g#10	630,{
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "���������A���̕��i�����O�����ȁB";
	mes "�������Əo���������邼�B";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

jtb_01.gat,23,200,5	script	�~���~��#10	643,{
	cutin "min02.bmp", 0;
	mes "[�~���~��]";
	mes "���̐��L���c�c";
	mes "�ǂ����Śk�����C�������B";
	close2;
	cutin "min02.bmp", 255;
	end;
}

jtb_01.gat,26,201,4	script	�j���I�[�Y#10	625,{
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "����H�@���A�̕��͋C���ς�����ˁB";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���͂̂ɂ������ς�����C�������ˁB";
	mes "�c�c�ނ���ɂ�������܂����̂�����B";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�Ȃ񂾂��Â��~���N��";
	mes "���َq�̂悤�Ȃɂ����ł�����ˁB";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����A���ɂ͏������L��";
	mes "�ɂ����Ɋ�������ˁB";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�����ڂ͂Ȃɂ��ς���ĂȂ���ȁH";
	mes "���΂ɂ��̕��i�ɂ��O���Ă������c�c�B";
	next;
	cutin "rote01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "�������낤�ȁB";
	mes "�Ȃ�ƌ����Ă����O�B�́A";
	mes "�����ꏊ�����x��";
	mes "�s�������Ă��邩��ȁB";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����ς�ˁB";
	mes "������ԂƂ����킯�ł��Ȃ����ǁA";
	mes "�����܂Ő����L���Ƃ���";
	mes "�킯�ł��Ȃ����������B";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�Ƃ������Ƃ͂���ȏ�̒T���́A";
	mes "���Ӗ��Ȃ̂ł��傤���˂��H";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�ǂ�������ˁB";
	mes "�����������Ƃ���΁A";
	mes "���ӂ����炩�̗��R��";
	mes "�ω����Ă���̂͊ԈႢ�Ȃ���B";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�����̎�����������̂ƁA";
	mes "�֌W������̂����ȁB";
	next;
	menu "���e���g���H",-;
	mes "[���e���g]";
	mes "�����A���O�����Ȏ�����������̂��B";
	next;
	cutin "arang02.bmp", 2;
	mes "[�A����]";
	mes "���͂����͒N���̎������ŁA";
	mes "�����߂�ꂽ�l�Ԃ̔����ɂ����";
	mes "�ω���e�����c�c�Ƃ��I";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�A�����c�c���O�A";
	mes "�Q���J�ɂ��Ȃ�e������ĂȂ����H";
	next;
	cutin "arang03.bmp", 2;
	mes "[�A����]";
	mes "���ւցI�@�Q���J�ɂ��̑O�؂肽�{��";
	mes "����ȓ��e�������񂾂�ˁI";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�Ƃ���ŋC�̂������ȁH";
	mes "���ɂ͌i�F�����X��";
	mes "����ł��Ă���悤��";
	mes "������񂾂�B";
	next;
	cutin "nines01.bmp", 255;
	mes "[�����f�B�[�W���b�N]";
	mes "�΂��āA�����̋C��";
	mes "���X�ɋ����Ȃ��Ă��Ă���悤���B";
	next;
	cutin "arang02.bmp", 2;
	mes "[�A����]";
	mes "�������ă����X�^�[!?";
	mes "�i�D�ǂ������X�^�[�Ȃ炢���Ȃ��I";
	mes "�킭�킭����";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "�ł��A���������X�^�[��";
	mes "������ƕ|�������c�c�B";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�A�����A�����������";
	mes "�������Ȃ����̂�����܂��悧�B";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "���A�ȂɂȂɂȂɂȂ�!?";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�Y�o��!!�@�����ł��B";
	mes "�����͂������ˁ`���ĂˁI";
	next;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���ˁA���M�N��";
	mes "�Ȃ玄�́c�c�B";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�A�����A�����X�^�[���";
	mes "��������ɓ|���B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�܂������c�c";
	mes "�j���I�[�Y�ƃ��M�������ƁA";
	mes "�ْ������Ȃ��Ȃ��ˁB";
	next;
	cutin "igu05.bmp", 2;
	mes "[�A�C�O]";
	mes "����c�c�B";
	next;
	menu "�ǂ��������H",-;
	mes "[�A�C�O]";
	mes "�݂�ȁI�@���̎q���c�c";
	mes "�V�������V�[�����Ȃ���!!";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���H�@�V�������V�[�Ȃ�";
	mes "���̕ӂ�Ɂc�c���Ȃ��ˁB";
	mes "���e���B�����̂��ȁH";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�c�c�����B";
	next;
	cutin "ragi02.bmp", 2;
	mes "[���M]";
	mes "�����ƔG�H�F�̋P�������c���P�N�`��";
	mes "�M���͂������ɏ������̂��`��";
	next;
	cutin "arang01.bmp", 2;
	mes "[�A����]";
	mes "���M�A�̂��ĂȂ��ŒT���Ȃ���!!";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "�V�������V�[�͉̂�";
	mes "�D���݂����ł�����˂��B";
	mes "�̂��̂��΁A�Ђ������";
	mes "�o�Ă��邩�Ǝv������ł��悧�B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���������΁A���̎q�c�c";
	mes "�D�������Ă������ɉ̂𕷂��Ă��A";
	mes "�Ί�̈�������ׂȂ��̂�";
	mes "�s�v�c�Ȃ̂�ˁB";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���������ǁc�c";
	mes "�ǂ�����ď΂��΂�����";
	mes "������Ȃ��񂶂�Ȃ����ȁB";
	next;
	mes "[�j���I�[�Y]";
	mes "�S�̒ꂩ��΂������Ƃ��Ȃ��B";
	mes "������A�΂������킩��Ȃ��B";
	mes "���ɂ͂����������񂾁B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�c�c���̎q�������A";
	mes "�΂���悤�ɂȂ��Ƃ����ȁc�c�Ȃ́B";
	next;
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "���̂��߂ɂ��A�l��j���I�[�Y�l��";
	mes "�撣��Ȃ��Ƃ����܂���˂��B";
	next;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������ˁA���M�N��";
	mes "���ꂶ�Ⴀ�A�����I";
	mes "�悸�͊����W���[�N����c�c�B";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�c�c���O��A�u���čs�����B";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "��k�����Ă΁`�I";
	mes "�҂��Ă�A���e�[!!";
	close2;
	if(!(checkquest(116525) & 0x8)) {
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 1000000,0,1;
		setquest 116525;
		compquest 116525;
	}
	cutin "nines01.bmp", 255;
	end;
}

jtb_01.gat,49,196,0	script	10�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�s���Ȉꌾ
//------------------------------------------
jtb_01.gat,106,198,5	script	���G��#11	10040,{
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�݂Ȃ���͖����ł��傤���c�c�B";
	mes "���������č�����������";
	mes "�ǂ������ł��ˁB";
	close2;
	cutin "roel01.bmp", 255;
	end;
}

jtb_01.gat,110,197,4	script	�A�C�O#11	646,{
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "���̎q�͂ǂ��ɍs����������́c�c�H";
	close2;
	cutin "igu01.bmp", 255;
	end;
}

jtb_01.gat,110,200,4	script	���i�C��#11	10039,{
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�������ꂽ��ˁB";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "���ς�炸�����炱����ɊF����A";
	mes "�U��U��ɂȂ��Ă���悤�ł��ˁB";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "����Ȃ��ł����܂ŗ����̂Ɂc�c";
	mes "�V�������V�[�����Ȃ��́c�c�B";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "���A���Ȃ��Ȃ���!?";
	mes "����!!�@���̎q�A";
	mes "���q�ɂȂ肷������Ȃ�!?";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "���āc�c�V�������V�[���āA";
	mes "���̎q�̖��O�Ȃ́H";
	next;
	menu "�j���I�[�Y���������瓚����",-;
	mes "[���i�C��]";
	mes "����Ȃɖ��O�������Ă�";
	mes "�����Ă���Ȃ������̂Ɂc�c�I";
	next;
	mes "[���i�C��]";
	mes "���ꂾ����j���I�[�Y�l��";
	mes "�߂Â����́A�����Ȃ̂�I";
	next;
	mes "[���i�C��]";
	mes "����ȏ��݂͂�ȁA";
	mes "���o�[�X�I�[�L�b�V����";
	mes "������΂����̂�!!";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "���͂́c�c���������ĂȂ́A";
	mes "���i�C���B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "���������΁c�c";
	mes "���A����ς��߂Ă����܂��B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�ǂ��������́H�@���G���B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�����c�c�Ȃ񂾂������X�^�[�̐���";
	mes "�����Ă���C�����āc�c�B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "����͂Ȃ��Ǝv���́B";
	mes "�݂�Ȋ撣���Đ���Ă���͂��Ȃ́B";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "����Ȃ񂾂���A";
	mes "�o�J���G�����ČĂ΂��̂�B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�c�c�ŁA�ł���ˁI";
	mes "�����܂����!!";
	next;
	menu "�C�̂�������Ȃ�����",-;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes strcharinfo(0)+"�܂�";
	mes "���G���̃o�J���������́H";
	next;
	menu "�W���b�N�����������ĂȂ������H",-;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "���������΁A�W���b�N�������Ă��́B";
	next;
	mes "[�A�C�O]";
	mes "�����̋C�����X��";
	mes "�����Ȃ��Ă��Ă�����āc�c�B";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�c�c�B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�c�c�B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�c�c�B";
	next;
	menu "�}���ō������������ǂ�",-;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�����ł��ˁA";
	mes "����͊ԈႢ����܂���!!";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�������ƃj���I�[�Y�l��T����";
	mes "�݂�ȂŒE�o������!!";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "����A�݂�Ȃƈꏏ��";
	mes "���̎q�������Ƃ݂����!!";
	close2;
	if(!(checkquest(116526) & 0x8)) {
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 1000000,0,1;
		setquest 116526;
		compquest 116526;
	}
	cutin "igu01.bmp", 255;
	end;
}

jtb_01.gat,133,197,0	script	11�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�s�v�c�ȋ��ʓ_
//------------------------------------------
jtb_01.gat,282,194,5	script	���G��#13	10040,{
	cutin "roel02.bmp", 2;
	mes "[���G��]";
	mes "�Q���J����͂����l�̖͋[���";
	mes "�t�������Ă�����ł��I";
	next;
	mes "[���G��]";
	mes "�l�͍��񂪏��߂Ă̎���Ȃ̂�";
	mes "����܂Ƃ��ɂȂ�Ȃ��悤�A";
	mes "�撣��܂��I";
	close2;
	cutin "roel02.bmp", 255;
	end;
}

jtb_01.gat,286,194,4	script	�Q���J#13	629,{
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�Ă��[����!!";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�I�[�g�K�[�h!!";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�c�c�ӂ��B";
	mes "���������G���N�I";
	mes "�����h��͂ł��ˁI";
	next;
	cutin "roel02.bmp", 2;
	mes "[���G��]";
	mes "�Q���J������������ł��B";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "����A"+strcharinfo(0)+"����B";
	mes "�����ŋC�Â��܂���ł�����I";
	mes "�������̖͋[��ǂ��ł����H";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�V�������V�[�������c�c";
	mes "���āA����H";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�c�c����H";
	mes "�V�������V�[�͂ǂ��ɁH";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�������܂Ŏ������̖͋[���";
	mes "���Ă����C��������ł����c�c�B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�܂����q�ɂȂ�����ł��傤��!?";
	mes "�����T���ɍs���Ȃ��Ɓc�c!!";
	next;
	cutin "gelca02.bmp", 2;
	mes "[�Q���J]";
	mes "���͂��ꂪ�G�̑_����������c�c�B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�c�c�B";
	next;
	cutin "gelca02.bmp", 2;
	mes "[�Q���J]";
	mes "���������W�J�̖{���A";
	mes "�ŋߓǂ񂾂�ł��c�c�B";
	next;
	menu "�������T���Ă���",-;
	cutin "gelca04.bmp", 2;
	mes "[�Q���J]";
	mes "�҂��Ă�������!!";
	mes "���������̂���X�A��S���Ɂc�c�B";
	next;
	cutin "roel04.bmp", 2;
	mes "[���G��]";
	mes "�����c�c";
	mes "����ȏ�|�����������̂�";
	mes "��߂܂��傤�I";
	next;
	cutin "gelca04.bmp", 2;
	mes "[�Q���J]";
	mes "���A�����܂���I";
	mes "�Ƃ肠�������͐l�����l���ł���";
	mes "����ɓ����̂͂�߂܂��傤�B";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�V�������V�[������";
	mes "�߂��Ă��邩������Ȃ����B";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "���A�����ł��ˁc�c�B";
	next;
	cutin "gelca03.bmp", 2;
	mes "[�Q���J]";
	mes "�V�������V�[�����A";
	mes "�����I�����猩����₷����";
	mes "�����ł���ˁB";
	next;
	cutin "gelca03.bmp", 255;
	mes "�]�m���ɃV�������V�[�͓����I���B";
	mes "�@���̒��ł��c�c�B�]";
	next;
	switch(select("���^���C�ɂȂ�","�����C�ɂȂ�","�������C�ɂȂ�")) {
	case 1:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���������΁c�c�O���͍��ŁA";
		mes "���͋��F�ł��ˁB";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���\�A�������ɍS�肪";
		mes "�����ł��傤���H";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "���������炵���ł�����ˁA";
		mes "�V�������V�[������";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "������������ǂ��ƕ���";
		mes "������Ȃ̂�������܂���ˁI";
		next;
		cutin "roel01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̔��̐F�A";
		mes "�ǂ����Ō����悤�ȁc�c�B�j";
		next;
		break;
	case 2:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�I�b�h�A�C���Ă�ł���ˁI";
		mes "�{�œǂ񂾂��Ƃ�����܂��B";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�I�b�h�A�C�Ƃ����Ɓc�c�B";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "���E�̊�ŐF���قȂ�";
		mes "���̂��Ƃł��I";
		next;
		cutin "roel02.bmp", 2;
		mes "[���G��]";
		mes "�Ȃ�قǁI";
		mes "�i�D�ǂ��Ȃ��I�@�I�b�h�A�C�B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�I�b�h�A�C���Ē�����������";
		mes "��ۂɎc��܂���ˁB";
		next;
		cutin "gelca01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̓��̐F�A";
		mes "�ǂ����Ō����悤�ȁc�c�B�j";
		next;
		break;
	case 3:
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���̕����A�ς���Ă܂���ˁB";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "���Ă����t�@�b�V����";
		mes "�Ȃ�ł��傤�ˁH";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "����́A�S�V�b�N�E�A���h�E�����[�^";
		mes "�Ƃ����t�@�b�V�����ł��I";
		mes "�S�X�����Ƃ��Ă΂�Ă��܂��ˁB";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�S�X�����c�c�I";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "��_�͐킢�ɂ������Ƃł���ˁB";
		mes "����ȂɃq���q�����Ă���";
		mes "���񂶂Ⴂ�����ł�!!";
		next;
		cutin "roel01.bmp", 2;
		mes "[���G��]";
		mes "�i���̕����A���i�C������ɂ�";
		mes "�������������Ȃ��c�c�I�j";
		next;
		cutin "gelca01.bmp", 255;
		mes "["+strcharinfo(0)+"]";
		mes "�i���̕����ɂ́A����";
		mes "�Ӗ�������񂾂낤���c�c�B�j";
		next;
		break;
	}
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�������c�c�V�������V�[�A";
	mes "�߂��Ă��܂���ˁB";
	next;
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "�d������܂���ˁB";
	mes "�݂�ȂŒT���ɍs���܂��傤!!";
	next;
	cutin "roel01.bmp", 2;
	mes "[���G��]";
	mes "�����ł��ˁB";
	mes "���܂ł������ɋ��Ă�";
	mes "�d���Ȃ��ł����c�c�B";
	close2;
	if(!(checkquest(116527) & 0x8)) {
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 1000000,0,1;
		setquest 116527;
		compquest 116527;
	}
	cutin "roel01.bmp", 255;
	end;
}

jtb_01.gat,307,195,0	script	13�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F���Ԉȏ���������H
//------------------------------------------
jtb_01.gat,30,279,4	script	�A�C�O#15	646,{
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "���͗��Ƃ������A";
	mes "�݂�Ȃƈꏏ�ɂ�������";
	mes "���������A�D���Ȃ́�";
	close2;
	cutin "igu01.bmp", 255;
	end;
}

jtb_01.gat,28,279,3	script	�V�������V�[#15	10041,{
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�����B";
	mes "�悭�킩��Ȃ��c�c�B";
	mes "�c�c�������Ă��������H";
	close2;
	cutin "shaloshi01.bmp", 255;
	end;
}

jtb_01.gat,29,283,4	script	���i�C��#15	10039,{
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�˂��A�A�C�O�B";
	next;
	cutin "igu01.bmp", 2;
	mes "[�A�C�O]";
	mes "�Ȃ��ɁH�@���i�C���B";
	next;
	mes "[�A�C�O]";
	mes "���A�V�������V�[�B";
	mes "������������A���������Ȃ��łˁB";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�����Ȃ��B";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "�����";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�j���I�[�Y�l���Ă���H";
	mes "�|�����n�j�q���Ă�H";
	next;
	menu "�|�����n�j�q�H",-;
	mes "[���i�C��]";
	mes "�сA�т����肵���I";
	mes strcharinfo(0)+"�A�����̂ˁB";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�|�����n�j�q���Ă̂́A";
	mes "�|�����݂����ɖ��Q�Ȃ�����";
	mes "����������̂͂����ɔ�т�";
	mes "�j���̂��Ƃ�B";
	next;
	cutin "igu04.bmp", 2;
	mes "[�A�C�O]";
	mes "���i�C���̓j���I�[�Y��";
	mes "���������Ζʂ������Ǝv�����ǁA";
	mes "����ς�C�Â����݂����Ȃ́B";
	next;
	cutin "igu04.bmp", 2;
	mes "[�A�C�O]";
	mes "�~���~�����킭�A�j���I�[�Y��";
	mes "�`����؂炵���́B";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "����ς肩���c�c�B";
	next;
	cutin "lunain03.bmp", 2;
	mes "[���i�C��]";
	mes "�j���I�[�Y�l��";
	mes "�`���ɂ��������Ȃ��Ƃ�";
	mes "�F�߂����Ȃ����ǁA";
	mes "����Ȋ�����ˁB";
	mes "�͂��c�c�B";
	next;
	menu "�j���I�[�Y���D���Ȃ́H",-;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "�c�c�B";
	next;
	cutin "igu03.bmp", 2;
	mes "[�A�C�O]";
	mes "�c�c���i�C���A�炪�Ԃ��́B";
	next;
	cutin "lunain04.bmp", 2;
	mes "[���i�C��]";
	mes "�c�c���A�D���Ƃ�����Ȃ���!!";
	mes "����A������Ɗ�Ɛ��i��";
	mes "�^�C�v���Ă������c�c�B";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "���i�C�����ăj���I�[�Y�݂����Ȑl��";
	mes "�D�݂Ȃ񂾂ˁ�";
	next;
	menu "�Ƃ���Ń��G���́H",-;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "���G���̓^�C�v����Ȃ��̂����Ă��ƁH";
	next;
	cutin "igu04.bmp", 2;
	mes "[�A�C�O]";
	mes "���񂤂�B���G���ƃ��i�C���A";
	mes "���������悳�������������ǁB";
	next;
	cutin "lunain03.bmp", 2;
	mes "[���i�C��]";
	mes "�����̂��q����܂ɁA";
	mes "�����͂���܂���B";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c���G���͂��q����܁B";
	next;
	cutin "igu04.bmp", 2;
	mes "[�A�C�O]";
	mes "�V�������V�[���ςȂ���";
	mes "�o�����������!!";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "���������B";
	mes "�Ƃ���ŃA�C�O��";
	mes "�C�ɂȂ��Ă�񂶂�Ȃ��́H";
	mes "�j���I�[�Y�l�̂��ƁB";
	next;
	cutin "igu04.bmp", 2;
	mes "[�A�C�O]";
	mes "�Ȃ́H";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "����H�@�Ⴄ�́H";
	next;
	cutin "igu04.bmp", 2;
	mes "[�A�C�O]";
	mes "�j���I�[�Y�̂��Ƃ�";
	mes "�m���ɍD���Ȃ́�";
	next;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "�ł���H";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "�ł��ł��A�݂�Ȃ��������炢";
	mes "�D���Ȃ́�";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�����݂�ȍD���B";
	next;
	cutin "lunain02.bmp", 2;
	mes "[���i�C��]";
	mes "��A�����c�c���݂̂�Ȃ́c�c";
	mes "��������Ȃ���B";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "��l�Ƃ����肪�Ƃ��Ȃ́�";
	mes "������D���Ȃ́�";
	next;
	cutin "igu02.bmp", 255;
	menu "�N�������o���͂Ȃ��Ɓc�c",-;
	cutin "lunain01.bmp", 2;
	mes "[���i�C��]";
	mes "����A"+strcharinfo(0)+"�B";
	mes "�̂����Ɍ����Ă��邯��";
	mes "���Ȃ��͂ǂ��Ȃ̂�H";
	next;
	cutin "igu03.bmp", 2;
	mes "[�A�C�O]";
	mes "���A"+strcharinfo(0)+"��";
	mes "�����o�������!?";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c���[���B";
	next;
	cutin "shaloshi02.bmp", 255;
	mes "["+strcharinfo(0)+"]";
	mes "���[���Ɓc�c�B";
	next;
	if(select("���A�j���I�[�Y�I","���ƒ�����H") == 1) {
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�j���I�[�Y�l!?";
		next;
		cutin "igu03.bmp", 2;
		mes "[�A�C�O]";
		mes "���A�j���I�[�Y�H";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c"+strcharinfo(0)+"��";
		mes "�����������B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�ǂ��Ŋo�����̂�A";
		mes "����Ȍ��t�c�c�B";
	} else {
		cutin "igu03.bmp", 2;
		mes "[�A�C�O]";
		mes "����Ȃɐ������e�Ȃ�!?";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�ׁA�ʂɋC�ɂȂ�킯����";
		mes "�Ȃ��񂾂���!!";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���i�C���A�����ÁX�B";
		next;
		cutin "shaloshi02.bmp", 255;
		mes "�]3�l�ɘb���Ă݂��]";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�ӂ����c�c�B";
		next;
		cutin "lunain02.bmp", 2;
		mes "[���i�C��]";
		mes "�c�c�B";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�悭�킩��Ȃ��B";
		next;
		cutin "shaloshi02.bmp", 255;
		mes "�]�A�C�O�͂킽�킽�ƍQ�āA";
		mes "�@���i�C���͌ł܂��Ă���A";
		mes "�@�V�������V�[�͕ς�炸�]";
		next;
		mes "�]����3�l�ɗ����b��";
		mes "�@�܂����������悤���c�c�]";
	}
	close2;
	if(!(checkquest(116528) & 0x8)) {
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 1000000,0,1;
		setquest 116528;
		compquest 116528;
	}
	cutin "shaloshi02.bmp", 255;
	end;
}

jtb_01.gat,47,302,0	script	15�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�����Ȃ��J
//------------------------------------------
jtb_01.gat,113,285,4	script	�~���~��#16	643,{
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "���܂ɂ͐̂��v���o���Č��̂�";
	mes "�����Ȃ���ˁB";
	close2;
	cutin "min01.bmp", 255;
	end;
}

jtb_01.gat,108,285,5	script	���e���g#16	630,{
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�j���I�[�Y��";
	mes "�����t���t���ǂ����ɍs��������";
	mes "�M���h���܂Ƃ߂�̂���ς��B";
	close2;
	cutin "rote01.bmp", 255;
	end;
}

jtb_01.gat,110,281,5	script	�j���I�[�Y#16	625,{
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�Ђ����Ԃ��3�l�������ˁB";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�v���Ԃ�Ȃ̂́A�N����";
	mes "�������킸�ɏo�čs�����������ǂ�!?";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�j�̃q�X�e���[�͏X�����B";
	mes "�قǂقǂɂȂ����ȁB";
	mes "����Ƃ����i������B";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "���i����˂��I";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����A���e���g�����i�[���̂�";
	mes "�̂��炶��Ȃ��B";
	next;
	menu "3�l�͐̂���̒m�肠���Ȃ́H",-;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "����A"+strcharinfo(0)+"�B";
	mes "�����ĂȂ������H";
	mes "�s�{�ӂȂ��玖���Ȃ̂�ˁB";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���ƃ��e��";
	mes "�̂͂悭������������ˁ`�I";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�v�����e���̓��߂���";
	mes "�Ԃ𔄂��Ă鏗�̎q�ɁA";
	mes "�ǂ��炪��ɍ�������";
	mes "OK�Ⴄ���������A���H";
	next;
	cutin "min03.bmp", 2;
	mes "[�~���~��]";
	mes "����Ƃ��j���I�[�Y��";
	mes "�����W���[�N���J���āA";
	mes "�܂����̃��e���g��";
	mes "��Ԋ����W���[�N���Ԃ₢��";
	mes "�A���̂��ƁH";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�Ȃ�ł��O��";
	mes "����Ȃɏڂ����o���Ă�񂾂�!?";
	next;
	cutin "nines02.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "��ɂ���ɂ��A";
	mes "���e�̊����W���[�N���������̂�";
	mes "���̈�񂾂��������ˁ`�I";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "��A��߂��!!";
	mes "����ȏ�͌����Ȃ�!!";
	next;
	cutin "min03.bmp", 2;
	mes "[�~���~��]";
	mes "��́c�c�Ö؂̎}�ŗV��ł鎞��";
	mes "�C�₵���b�Ƃ��H";
	mes "�Z�[�W�̂Ȃ�Ƃ����Ďq���Ă��";
	mes "�A�u���J�^�u���ŗV��ł�����A";
	mes "�����X�^�[����\�ꂵ��";
	mes "�{��ꂽ���Ƃ���������ˁB";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�ł����̂��A��";
	mes "��ʂ̃����X�^�[�̑Ώ��@���m�������A";
	mes "3�l�̘A�g�����܂ꂽ����";
	mes "���ʂ���Ȃ�������B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�����ˁB";
	mes "�ł������l����ƁA���̐V�l����B��";
	mes "���������b���Ă����Ȃ��Ƃ��߂ˁB";
	next;
	cutin "min02.bmp", 2;
	mes "[�~���~��]";
	mes "���̏�Ԃ���A";
	mes "�������Ď��ɋْ������Ȃ�������";
	mes "��S���ɂȂ肩�˂Ȃ����B";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�c�c�����B";
	mes "����ɂ�����ɁA���̂悤�ȋ�J��";
	mes "�����킹�����Ȃ����ȁB";
	next;
	menu "��J�H",-;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�c�c�B";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���H�@���e�̂�����J���āc�c";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������K�v������";
	mes "�󂫃r����Zeny���Ȃ�����A";
	mes "���b�_�t���b�O��|����";
	mes "�󂫃r�����W�߂���āA";
	mes "��ʂɃ��b�_�t���b�O���W�߂�";
	mes "���������邳��������ē{��ꂽ���H";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "��������Ȃ��āA";
	mes "�v�����e�����O�Ŏ��̊p��";
	mes "�X�s���O���X�����ėV��ł����ɁA";
	mes "�q���ɓ��̒n���̎��Ȃ��";
	mes "�ςȂ�������������";
	mes "���΂炭�΂����̂ɂ��ꂽ���ł��傤�H";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�ǂ������Ⴄ����!!";
	next;
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�c�c�̂������";
	mes "���̑f�s���������������ŁA";
	mes "�قڃ\���Ŋ������邵���Ȃ�����������";
	mes "�������񂾂�B";
	next;
	mes "[���e���g]";
	mes "1�l�̗͂�����E������B";
	mes "���͂��̃M���h�ɋ���N����";
	mes "�����m���Ă���B";
	mes "�����炱���A������ɂ�";
	mes "���݂����ɂȂ��Ăق����Ȃ��񂾁B";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�܁[���͂��܂����B";
	mes "�{���A���e���g�͐̂���";
	mes "�S�z�������ȂƂ��낪����̂�ˁB";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���������B";
	mes "���e�݂͐̂����ɂ�����l����Ȃ��B";
	mes "�����������邵�A����Ɂc�c";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "�������Ăق�A";
	mes strcharinfo(0)+"��A";
	mes "�M���h�݂̂�Ȃ�����񂾂����";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�c�c�t���b�B";
	mes "�����炱���������b���āA";
	mes "���ꂩ��������������肾!!";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�ف[��ƁA�f������Ȃ���ˁB";
	next;
	cutin "nines01.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���e�͒p���������艮���񂾂���ˁI";
	mes "�����A���낻��s������";
	mes "�������̑厖�Ȓ��Ԃ�T���ɁB";
	next;
	cutin "rote01.bmp", 2;
	mes "[���e���g]";
	mes "�j���I�[�Y�I�@���O���d�؂�Ȃ��I";
	next;
	cutin "min01.bmp", 2;
	mes "[�~���~��]";
	mes "�͂��͂��B";
	mes "�o�J�Ȓj���͕����Ă����čs�����A";
	mes strcharinfo(0)+"�B";
	next;
	cutin "nines03.bmp", 2;
	mes "[�j���I�[�Y]";
	mes "���A�������";
	mes strcharinfo(0)+"��";
	mes "���B�̑厖�Ȓ��Ԃ���`��";
	next;
	cutin "rote04.bmp", 2;
	mes "[���e���g]";
	mes "�t���B�܂��������B";
	mes "�����܂ŉ��B�ɕt���������񂾁B";
	mes "�ȒP�ɓr���ޏ�͂����˂���A";
	mes strcharinfo(0)+"�B";
	close2;
	if(!(checkquest(116529) & 0x8)) {
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 1000000,0,1;
		setquest 116529;
		compquest 116529;
	}
	cutin "rote04.bmp", 255;
	end;
}

jtb_01.gat,134,275,0	script	16�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �O�`�F�H�H�H
//------------------------------------------
jtb_01.gat,30,377,3	script	�y��#18	10047,{
	mes "[�y��]";
	mes "�y���y���B";
	next;
	switch(select("�y��!!","�y���[�H","�؂�؂�")) {
	case 1:
		mes "[�y��]";
		mes "�y���[��";
		close;
	case 2:
		mes "[�y��]";
		mes "�y���`�H�@�y���y�����H";
		close;
	case 3:
		mes "[�y��]";
		mes "�H";
		mes "�y���y���B";
		mes "�y�����A�y���y���`�B";
		next;
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�ǂ����ăy�����Ȃ߂�́H";
		mes "���������́H";
		next;
		cutin "shaloshi02.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c�������ׂĂ݂�c�c�B";
		next;
		cutin "shaloshi02.bmp", 255;
		emotion 19,"�y��#18";
		mes "[�y��]";
		mes "�y��!?";
		mes "�y���`�I�@�y���؃�!!";
		close;
	}
}

jtb_01.gat,28,378,5	script	�V�������V�[#18	10041,{
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes strcharinfo(0)+"�c�c";
	mes "���Ă��ꂽ�A�������B";
	next;
	mes "[�V�������V�[]";
	mes strcharinfo(0)+"��";
	mes "���Ƃ݂�ȁA���ǂ��Ȃ�悤��";
	mes "����΂��Ă��ꂽ�̒m���Ă�B";
	next;
	mes "[�V�������V�[]";
	mes "�����炱������";
	mes "�M���h�����o�[�ɂȂꂽ�B";
	mes "���肪�Ƃ��B";
	next;
	mes "[�V�������V�[]";
	mes "���ꂩ��Q���J�ɖ{���؂肽�肵�āA";
	mes "�������񌾗t�o�����B";
	mes "�O���b�����A���܂��Ȃ������ȁc�c�H";
	next;
	if(select("�ǂ��Ǝv��","�A�h�o�C�X����") == 1) {
		mes "[�V�������V�[]";
		mes "�悩�����B";
		mes "�ł��܂�������Ȃ����t�������āc�c�B";
		next;
	} else {
		cutin "shaloshi01.bmp", 2;
		mes "[�V�������V�[]";
		mes "�c�c���t���ē���B";
		mes "�ǂ�Ȃӂ��ɂ���΂����H";
		next;
		switch(select("�j���ۂ�������Ȃ�","�G��������Ȃ�","��������Ȃ�")) {
		case 1:
			mes "[�V�������V�[]";
			mes "�j���ۂ��H";
			mes "�j���ۂ����ǂ�Ȋ������낤�c�c�B";
			next;
			if(select("���e���g�݂����Ȋ���","�W���b�N�݂����Ȋ���") == 1) {
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "���e�݂����Ȋ����H";
				mes "����Ă݂�c�c�B";
				next;
				mes "[�V�������V�[]";
				mes "�����A���O���c�c�B";
				mes "�Ȃ񂾂��񂾂�";
				mes "���O�ɂ����f���������܂����ȁB";
				mes "�c�c";
				mes "���A���́c�c���ꂾ�B";
				mes "�c�c�T���L���[�c�c�ȁB";
				next;
			} else {
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "�����f�B�[�W���b�N�݂����Ȋ����H";
				mes "�����Ɓc�c";
				next;
				mes "[�V�������V�[]";
				mes "���O�ɂ͂��낢��Ɛ��b�ɂȂ����ȁB";
				mes "�ŏ��͂ǂ��Ȃ邱�Ƃ��Ǝv�������c�c";
				mes "���͗ǂ��F�B�����������̂��B";
				mes "���肪�Ƃ��B";
				next;
			}
			mes "[�V�������V�[]";
			mes "����Ȃ��񂶁H";
			mes "�j���ۂ����āA����c�c�B";
			next;
			break;
		case 2:
			mes "[�V�������V�[]";
			mes "�G���H";
			mes "�G�����Ăǂ�Ȋ������낤�c�c�B";
			next;
			switch(select("���i�C���݂����Ȋ���","�A�C�O�݂����Ȋ���","�Q���J�݂����Ȋ���","�A�����݂����Ȋ���","�~���~���݂����Ȋ���")) {
			case 1:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "���i�C���݂����Ȋ����H";
				mes "�����Ɓc�c";
				next;
				mes "[�V�������V�[]";
				mes "���A�����c�c!!";
				mes strcharinfo(0)+"�̎�";
				mes "�l���Ă�^�C�~���O��";
				mes "���傤�ǂ悭����̂�c�c�B";
				next;
				mes "[�V�������V�[]";
				mes "���A���ꂶ�Ⴀ��������";
				mes strcharinfo(0)+"�̎�";
				mes "�l���Ă�݂�������Ȃ��B";
				mes "�ׁA�ʂɂ����l���Ă�킯����";
				mes "�Ȃ��񂾂���ˁI";
				next;
				mes "[�V�������V�[]";
				mes "�c�c�ǂ��H";
				mes "���i�C���̘b�����A�^�����Ă݂��B";
				next;
				break;
			case 2:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "�A�C�O�݂����Ȋ����H";
				mes "�킩�����B";
				next;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"�Ȃ́�";
				mes "�ŋ߁A�̗̂��K���݂�ȂƂ��Ă�́B";
				mes "�܂����܂��̂��Ȃ����ǁA";
				mes "�ǂ������獡�x�ꏏ�ɉ̂��Ăق����́�";
				next;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"�ƈꏏ��";
				mes "�̂�����A�������y�����Ǝv���́�";
				next;
				mes "[�V�������V�[]";
				mes "�c�c�ǂ��H";
				mes "�A�C�O�̘b�����A�^�����Ă݂��B";
				next;
				break;
			case 3:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "�Q���J�݂����Ȋ����H";
				mes "�����Ɓc�c";
				next;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"����I";
				mes strcharinfo(0)+"�����";
				mes "�K�E�Z�Ƃ��l�������Ƃ���܂����H";
				mes "�����K�E�Z����肽���Ǝv���āA";
				mes "���ܐF�X�l���Ă��ł��I";
				next;
				mes "[�V�������V�[]";
				mes "�ǂ������獡�x�A";
				mes "��l�ŗ��K���܂��傤�I";
				mes "�A�h�o�C�X���Ă��������ˁI";
				next;
				mes "[�V�������V�[]";
				mes "�c�c�ǂ��H";
				mes "�Q���J�̘b�����A�^�����Ă݂��B";
				next;
				break;
			case 4:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "�A�����݂����Ȋ����H";
				mes "����Ă݂�B";
				next;
				mes "[�V�������V�[]";
				mes "���͂��܁A�����̗��K�����Ă�񂾂�B";
				mes "���͕ʂɁA�H�ו���H�ׂȂ��Ă�";
				mes "���C�Ȃ񂾂��ǂˁI";
				mes "���������H�ו���H�ׂ�ƁA";
				mes "�݂�ȍK���ȋC�����ɂȂ�񂾂��āB";
				next;
				mes "[�V�������V�[]";
				mes "������撣���ė��K���Ă�񂾁I";
				mes "���傤���ɂł�����A";
				mes strcharinfo(0)+"�ɂ�";
				mes "������������ˁI";
				next;
				mes "[�V�������V�[]";
				mes "�c�c�ǂ��H";
				mes "�A�����̘b�����A�^�����Ă݂��B";
				next;
				break;
			case 5:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "�~���~���݂����Ȋ����H";
				mes "�������ȁc�c";
				next;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"����Ȃ��B";
				mes "�����͂ǂ������́H";
				mes "����A�Ȃ񂾂����Ă�݂����ˁB";
				mes "������Ƃ��o����";
				mes "���ł�����ł����܂��傤���H";
				next;
				mes "[�V�������V�[]";
				mes "���������Ď��A";
				mes "�}�b�T�[�W�Ƃ����ӂȂ̂�ˁB";
				mes "�{�œǂ�Ńy���Ɨ��K�����̂�B";
				mes "�����A������Ƃ����ɍ���Ȃ����ȁB";
				next;
				mes "[�V�������V�[]";
				mes "�c�c�ǂ��H";
				mes "�~���~���̘b�����A�^�����Ă݂��B";
				next;
				break;
			}
			break;
		case 3:
			mes "[�V�������V�[]";
			mes "���H";
			mes "�����Ăǂ�Ȋ������낤�c�c�B";
			next;
			switch(select("�j���I�[�Y�݂����Ȋ���","���M�݂����Ȋ���","���G���݂����Ȋ���")) {
			case 1:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "�j���I�[�Y�݂����Ȋ����c�c";
				mes "�����Ɓc�c";
				next;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"�`�I";
				mes "�ŋ߁A���I���J�v���`�����Ė{��";
				mes "�ǂ񂾂񂾂�I";
				next;
				mes "[�V�������V�[]";
				mes "�̂���J�v���Z���^�[�ɓ`���";
				mes "�`���݂����Șb�Ȃ񂾂��āB";
				mes "�J�v�����񂪃J�b�R�悭����";
				mes "�h�L�h�L�����������`!!";
				mes "�{���̃J�v�������";
				mes "������Ȃ����������";
				next;
				break;
			case 2:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "���M�݂����Ȋ����c�c";
				mes "�������ȁc�c";
				next;
				mes "[�V�������V�[]";
				mes "����A"+strcharinfo(0)+"����B";
				mes "���̂������A�y���ɐ^�����������";
				mes "�y�����~�������Ă��܂��܂��āB";
				mes "����������Ȃ��ƌ����ƁA�y����";
				mes "�����̗͂Ő^������o������ł���B";
				next;
				mes "[�V�������V�[]";
				mes "�����Ă��܂��^�삾������ł����A";
				mes "�܂̂����ł�����˂��B";
				mes "�����Ă�������܂𗬂��Ă��A";
				mes "�����܂͏�����";
				mes "�Ί�ɂȂ����Ď��Ȃ�ł��ˁB";
				next;
				break;
			case 3:
				cutin "shaloshi02.bmp", 2;
				mes "[�V�������V�[]";
				mes "���G���݂����Ȋ����c�c";
				mes "�킩�����B";
				next;
				mes "[�V�������V�[]";
				mes strcharinfo(0)+"����I";
				mes "�����l�ł�!!�@����̖`���A";
				mes strcharinfo(0)+"�����";
				mes "���͂��������������ŁA";
				mes "�f���炵�����̂ɂȂ�܂����B";
				next;
				mes "[�V�������V�[]";
				mes "�M���h�݂̂�Ȃ̋C������";
				mes "���������ǁA���������C�����܂��B";
				mes strcharinfo(0)+"����A";
				mes "�{���ɂ��肪�Ƃ��������܂�!!";
				next;
				break;
			}
			mes "[�V�������V�[]";
			mes "����Ȃ��񂶁H";
			next;
			break;
		}
	}
	cutin "shaloshi01.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�B";
	mes "�݂�Ȃ̐^�������";
	mes "������A������ƒp���������c�c";
	next;
	cutin "shaloshi02.bmp", 2;
	mes "[�V�������V�[]";
	mes "�c�c�B";
	mes "����ς肢���̘b������";
	mes "��Ԏ��炵���H";
	mes "�c�c�������B�킩�����B";
	next;
	menu "�ǂ����Č��t���o�������́H",-;
	mes "[�V�������V�[]";
	mes "���͊O�̐��E�c�c";
	mes "�݂�Ȃ̏��ɍs���̖����݂����B";
	mes "�ł������O�̐��E�A�s���Ă݂����B";
	mes "���̎��̂��߂ɕ׋��c�c�B";
	next;
	mes "[�V�������V�[]";
	mes "����ƁA�݂�Ȃ��D��������";
	mes "�`������������݂�Ȃ��ĂԂ́B";
	mes "�莆���Ă������̂̏�������";
	mes "�j���I�[�Y�ɋ����Ă�������B";
	next;
	mes "[�V�������V�[]";
	mes "�����炪��΂�B";
	mes "�������񌾗t�A�o����";
	mes "�莆�������́B";
	next;
	cutin "shaloshi04.bmp", 2;
	mes "[�V�������V�[]";
	if(!(checkquest(116530) & 0x8)) {
		mes "���x"+strcharinfo(0)+"��";
		mes "���t�������āB";
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		getexp 3000000,0,1;
		setquest 116530;
		compquest 116530;
		setquest 201715;
	} else {
		mes strcharinfo(0)+"�A";
		mes "�܂����t�Ƃ��F�X�A�����ĂˁB";
	}
	close2;
	cutin "shaloshi04.bmp", 255;
	end;
}

jtb_01.gat,49,365,0	script	18�ԕ����o��	45,2,2,{
OnTouch:
	mes "�]�O�ɂł܂����H�]";
	next;
	if(select("�͂�","������")==2) {
		mes "�]���̏�ɗ��܂鎖�ɂ����]";
		close;
	}
	mes "�]�O�ɏo���]";
	close2;
	warp "moc_para01.gat",30,88;
	end;
}

//==========================================
// �y���c (2)
//------------------------------------------
moc_para01.gat,37,95,5	script	�Q���J#1	629,{
	if(checkquest(117055) & 0x8) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "����ɂ��́I";
		mes "�����͏C�s�ł����H�@�`���ł����H";
		mes "���͂܂����߂Ă��Ȃ��āc�c�B";
		mes "�Ƃ���Ŏ��ɉ���";
		mes "���p�ł��傤���H";
		next;
		switch(select("�t���ɂ���","�D���Ȃ��̂ɂ���","�t�����痊�܂ꂽ")) {
		case 1:
			mes "[�Q���J]";
			mes "�ӂӂӂӂӂӂӂӁc�c�B";
			mes strcharinfo(0)+ "������Ƃ��Ƃ��A";
			mes "�t���̑f���炵���Ƃ��������͂�";
			mes "�C�Â��Ă����悤�ł��ˁI";
			mes "�ł́A�����Ǝt���̖��͂�";
			mes "�m���Ă��������܂��傤�I";
			next;
			mes "[�Q���J]";
			mes "�t���ɂ��āA";
			mes "�ǂ̂��b�����������ł����H";
			next;
			switch(select("���i�ɂ���","�M���h�ɂ���","�v���o�ɂ���")) {
			case 1:
				mes "[�Q���J]";
				mes strcharinfo(0)+ "����B";
				mes "����A�Ȃ񂾂�������܂����H";
				next;
				cutin "gelca01.bmp", 255;
				mes "�]���芴���锒������";
				mes "�@�l�X�Ȍ`�̎�������B";
				mes "�@�����ɂ������ɂ����܂��Ƃ�";
				mes "�@�����Ȃ��悤�ȊG��";
				mes "�@����ɒ��J�ȕ�����";
				mes "�@���������ꂽ����";
				mes "�@�Q���J�������o�����]";
				next;
				cutin "gelca02.bmp", 2;
				mes "[�Q���J]";
				mes "���芴���邱�̊G������";
				mes "�t�������ڏ��������̂ł��B";
				mes "���ʂ̎��ł͍��Ȃ��ƌ����āA";
				mes "���̎��̍ޗ���T���ɂ����鏊��";
				mes "�`��������ł���B";
				next;
				cutin "gelca02.bmp", 255;
				mes "�]�����̊ԃQ���J�͎v���o�ɐZ������A";
				mes "�@���̎��ɖڂ𗎂Ƃ����]";
				next;
				cutin "gelca02.bmp", 2;
				mes "[�Q���J]";
				mes "�t���������ň˗����ꏊ������";
				mes "�撣���Ă��ꂽ�`���҂ɁA";
				mes "�������Ă�肽���ƌ�����";
				mes "������܏�݂����Ȃ��̂ł��B";
				mes "�c�O�Ȃ��炱�̏܏�";
				mes "���􂷂���͂܂���ł����ǁc�c�B";
				next;
				cutin "gelca01.bmp", 2;
				mes "[�Q���J]";
				mes "�撣��l�������������c�c";
				mes "�t���͂��̈�S�ł����";
				mes "������̂��Ǝv���܂��B";
				mes "����䂦�ɃV�������V�[������";
				mes "���߂Ɋ撣��݂�Ȃ����Ă���";
				mes "�h�������̂ł͂Ȃ����Ɓc�c�B";
				next;
				cutin "gelca03.bmp", 2;
				mes "[�Q���J]";
				mes "�Ȃ̂ŁA" +strcharinfo(0)+ "���񂪂��̎�";
				mes "���Ă���Ė{���ɗǂ�������";
				mes "���X�Ȃ��犴�ӂ��Ă��܂��B";
				mes "�x���Ȃ�܂������ǁc�c";
				mes "�{���ɂ��̎��́A���肪�Ƃ�";
				mes "�������܂����I";
				close2;
				cutin "gelca03.bmp", 255;
				end;
			case 2:
				mes "[�Q���J]";
				mes "�M���h�Ƃ����΁A�V�������V�[������";
				mes "�ꌏ�Ŏt���̂��Ƃ�";
				mes "��Ŏ҂̕����炸�����Ȃ���";
				mes "�������񂶂�Ȃ��ł����H";
				mes "�����A�t���̂��Ƃ��悭�m�鎄��";
				mes "�����v�������炢�ł�����B";
				next;
				cutin "gelca02.bmp", 2;
				mes "[�Q���J]";
				mes "���̗Z�ʂ̂Ȃ��͂��̊y���c�ł�";
				mes "�L���Ȃ�ł��B";
				mes "�ł��c�c";
				mes "�M���h�������ł����A�����N����";
				mes "�������������Ƃ��A�ӔC�����̂�";
				mes "�t���Ȃ�ł��c�c�B";
				next;
				mes "[�Q���J]";
				mes "������t���͒��Ԃɉ���";
				mes "��肪�N����\�������鎖����";
				mes "�ȒP�ɋ����邱�Ƃ��o����";
				mes "����ȕ��ɂ�����ǂ��";
				mes "�ԓx�ɂȂ��Ă��܂���ł���ˁc�c�B";
				next;
				cutin "gelca01.bmp", 2;
				mes "[�Q���J]";
				mes "�{���A�ʓ|�Ȏt���ł�����";
				mes strcharinfo(0)+ "����̂��Ƃ͋C�ɓ�����";
				mes "����݂����Ȃ̂ŁA������ǂ���";
				mes "���̕s�o���Ȓ�q�Ƃ��ǂ�";
				mes "��낵�����肢���܂���";
				close2;
				cutin "gelca01.bmp", 255;
				end;
			case 3:
				mes "[�Q���J]";
				mes "�t���ɑO�ɕ������b�ł���";
				mes "�t���͌��X�A�퓬�n�A�R���C�g��";
				mes "�L���Ȉ��������������ł��B";
				next;
				mes "[�Q���J]";
				mes "���ł͑����̐��E�҂����������������";
				mes "�킢�܂����ǁA�����̐��E�҂�";
				mes "�p�[�e�B�[�ő��l��⏕���������";
				mes "�D�悷��ׂ����Ƃ��������������A";
				mes "�키���炢�Ȃ�⏕���Ă����";
				mes "�����������������悤�ł��ˁB";
				next;
				mes "[�Q���J]";
				mes "�Ȃ̂Ɏt���͕⏕�����ނ���";
				mes "����G�Ɍ������Ă����āA";
				mes "���p�̃\�[�h���C�X��";
				mes "�����X�^�[��o�ł��邱�Ƃ�";
				mes "�D�悷�鎖�����������悤�ł��B";
				next;
				cutin "gelca02.bmp", 2;
				mes "[�Q���J]";
				mes "���ɂ��A���������b�ɂȂ��Ă���";
				mes "�v�����e���C���@�̐l�̎w���ɂ��A";
				mes "����݂��Ȃ�������c�c�B";
				mes "���̂��߁A��莙�Ƃ݂Ȃ���A";
				mes "���ǂ��̏C���@�����";
				mes "�ǂ��o����c�c";
				next;
				mes "[�Q���J]";
				mes "���ł����̏C���@�̕������Ƃ́A";
				mes "���܂蒇���ǂ�����܂���c�c�B";
				mes "�ǂ����̂̎t���͍��ɔ�ׂāA";
				mes "�����ɑ΂��ĒN�����ӗ~�������A";
				mes "���l�O�̖`���҂̈�l������";
				mes "�悤�ł��ˁB";
				next;
				mes "[�Q���J]";
				mes "����Ȓ�^FF0000���̕�^000000�ɏo����������ł��B";
				mes "���̕��́A�v�����e����̕���";
				mes "�����̂��Ă��������Ƃ��B";
				mes "���͑��̐l�����̏ꏊ��";
				mes "����悤�ł����ǁc�c�B";
				next;
				cutin "gelca03.bmp", 2;
				mes "[�Q���J]";
				mes "���ǁA�t���͂��̕��Əo��A";
				mes "�p�[�e�B�[�ŋ��͂���Ӗ���";
				mes "���낢��w�Ԃ��Ƃ��o�����悤�ł��B";
				mes "�o������������Ől�́A";
				mes "�ς�邱�Ƃ��o����񂾂ƁA";
				mes "�����������Ɍ���Ă���܂����B";
				next;
				mes "[�Q���J]";
				mes "�N���͂͂����茾���܂��񂪁A";
				mes strcharinfo(0)+ "����Ȃ炻�ꂪ�N����";
				mes "�킩��܂���ˁH";
				mes "�悭����l�͌��܂��Ă��܂����ǁA";
				mes "���܂���قǒ����������Č��t�́A";
				mes "���̂���l�ɂ����A�҂�����ł���";
				close2;
				cutin "gelca03.bmp", 255;
				end;
			}
		case 2:
			mes "[�Q���J]";
			mes "���̍D���Ȃ��́c�c�B";
			mes "����͂���ς�Y�o���I";
			mes "�C�s�̓G�c�c";
			next;
			mes "[�Q���J]";
			mes "�Â��f�U�[�g�ł�!!";
			mes "�Â��P�[�L�A�`���R���[�g!!";
			mes "�₦���A�C�X�N���[���Ƃ��A";
			mes "�l���������ōō��ł�!!";
			mes "���ɁA�R���h�Ŏt���ƈ���";
			mes "�V��̃t���[�c�W���[�X�B";
			next;
			mes "[�Q���J]";
			mes "���̖��͍��ł��Y��܂���c�c�B";
			mes "���x��" +strcharinfo(0)+ "�����F����Ƃ�";
			mes "�ꏏ�ɍs���āA���̖���";
			mes "������Ă݂����ł��ˁB";
			mes "���_�A�V�������V�[������";
			mes "��Έꏏ�Ɂ�";
			close2;
			cutin "gelca03.bmp", 255;
			end;
		case 3:
			mes "[�Q���J]";
			mes "���I�H";
			mes "�t�����玄�̘b�������";
			mes "�Ȃ��Ă���Ɨ��܂ꂽ��ł����H";
			mes "�����ł����c�c";
			mes "�c�c�B";
			next;
			cutin "gelca03.bmp", 2;
			mes "[�Q���J]";
			mes "�ł́A�ؓ��̂悳�����";
			mes "�}�b�X���ؓ��g�[�N�����ւ��邵��";
			mes "�Ȃ��悤�ł��ˁI";
			mes "�����ƕ����I��鍠�ɂ͐�΁A";
			mes "�ؓ�������ڂ��ς��͂��ł�!!";
			mes "�����͎v����������܂���!!";
			next;
			mes "�]���̌�Œ��ꒃ";
			mes "�@�Q���J����ؓ��ɂ���";
			mes "�@�������ꂽ�B";
			mes "�@";
			mes "�@�����̕ςȒm����";
			mes "�@^FF00001�オ����^000000�c�c�C������]";
			emotion 19,"";
			close2;
			cutin "gelca03.bmp", 255;
			end;
		}
	}
	if(JTB_2QUE == 7) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���c�c" +strcharinfo(0)+ "����I";
		mes "����ɂ��́B";
		mes "�����Ă��������I";
		mes "���ɂ����l�����̊w����";
		mes "�����Ă���̂͂����m";
		mes "�ł���ˁH";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "���͂���𕷂��āA";
		mes "�V�������V�[�����������ɁA";
		mes "���������Ă�����ł����ǁc�c";
		mes "���΂ɂ���̓_��������";
		mes "�t���ɓ{��ꂿ�Ⴂ�܂����B";
		next;
		mes "[�Q���J]";
		mes "�V�������V�[�����Ȃ炫����";
		mes "��т����Ȃ��̂������ɂ�";
		mes "�����ς������ł����ǁc�c";
		mes "���΂ɑf�����f���ł����ˁB";
		mes "�ł������V�������V�[������";
		mes "�����ɏ��҂��܂���I";
		next;
		cutin "gelca03.bmp", 2;
		mes "[�Q���J]";
		mes "���̎��͐���A";
		mes strcharinfo(0)+ "������ꏏ�ɏW�܂���";
		mes "�݂�Ȃł��̎��݂����ɂ܂��A";
		mes "�`���̑����ɏo������ꂽ��";
		mes "�����ł��ˁ�";
		setquest 117055;
		compquest 117055;
		close2;
		cutin "gelca02.bmp", 255;
		end;
	}
	if(checkquest(116508) & 0x8) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "���c�c" + strcharinfo(0) + "����I";
		mes "����ɂ��́B";
		next;
		cutin "gelca02.bmp", 2;
		mes "[�Q���J]";
		mes "���������A���͂ł��ˁB";
		mes "���̌�A����ς肱��Ȍ���";
		mes "�ǂ��Ȃ��񂶂�Ȃ������Ęb��";
		mes "�Ȃ�����ł��c�c�B";
		mes "�V�������V�[����񂾂��Ă����ƁA";
		mes "�{�S�͈�����͂��c�c�B";
		next;
		mes "[�Q���J]";
		mes "���ƁA���i�C������̃��[�v�|�[�^����";
		mes "���̎��̏ꏊ�Ǝ��Ԃ��L�����Ă���";
		mes "�����Ȃ̂ŁA�Ƃ肠��������x";
		mes "�C�s���Ă��������r���グ�Ă܂��A";
		mes "������x���̏ꏊ�ɍs�����Ƃ����b��";
		mes "���������܂����B";
		next;
		mes "[�Q���J]";
		mes "�Ȃ̂Ŏ��Ǝt���A���Ɖ��l����";
		mes "���̊y���c�ɖ߂��đ����𔃂����߂�";
		mes "�����W�߂ƏC�s�����˂ăo�C�g���B";
		mes "�j���I�[�Y�l�͈�l�ōl����������ƁA";
		mes "���B�Ƃ͍��͕ʍs�����Ƃ��Ă��܂��B";
		mes "����͗��΂Ɏd���Ȃ��ł��ˁc�c�B";
		next;
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�Ȃ̂ł܂�����" + strcharinfo(0) + "����";
		mes "���̏ꏊ�̒T���ɋ��͂��ėǂ��Ȃ�";
		mes "���̎��͐���A���B�ƈꏏ��";
		mes "�܂����̏ꏊ�ɍs���܂��傤�ˁI";
		mes "����܂łɎ������������r��";
		mes "�グ�Ă����܂�����B";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
	if(checkquest(13181)) {
		cutin "gelca01.bmp", 2;
		mes "[�Q���J]";
		mes "�Վ������o�[�Ƃ��āA";
		mes "���ꏏ���Ă���������";
		mes "�݂����ł��ˁI";
		mes "��낵�����肢���܂��I";
		close2;
		cutin "gelca01.bmp", 255;
		end;
	}
	cutin "gelca01.bmp", 2;
	mes "[�Q���J]";
	mes "��ɏC�s�A��ɏC�s�I";
	mes "�O�l���Ȃ��āA�܂Ɏt���I";
	mes "�������C�s�̓��ł��I";
	mes "�������撣��܂��I";
	close2;
	cutin "gelca01.bmp", 255;
	end;
}

moc_para01.gat,41,95,5	script	���e���g#1	630,{
	if(checkquest(117060) & 0x8) {
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "�Ȃ񂾁H";
		mes "����������Ɖɂ����Ɍ�����̂��H";
		mes "�c�c����ł��F�X�ƖZ�����񂾁B";
		mes "�����A�b�����肪�ق��������Ȃ�";
		mes "�����̃Q���J�ł����Ǝv�����B";
		next;
		switch(select("�d���Ƃ́H","��q�ɂ���","�j���I�[�Y�ɂ���")) {
		case 1:
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�ȒP�Ɍ����Ό�y��";
			mes "�w�����B";
			mes "�Ƃ肠���������I�ɁA";
			mes "�����������S�҂�s�����";
			mes "�`���҂��w�����邱�Ƃ�";
			mes "�Ȃ����񂾁B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�����ł��܂́A";
			mes "�V���̈����ƌĂ΂ꂽ���̉��A";
			mes "���e���g�l��";
			mes "�Ђ�����`���҂̓����y�ш������B";
			mes "�`�b�c�c�B";
			mes "�l���邾���ŃC���C�����Ă���B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�Ƃ͂����A�����̊֌W�҂�";
			mes "�����Ȃ�Ƃ��؂肪���邵�A";
			mes "����l�ł�����";
			mes "�Ђ�����Ɏd�����񂵂āA";
			mes "�����͐��Ԃ̌�������";
			mes "�����点�Ă��Ȃ��ƂȁB";
			next;
			mes "[���e���g]";
			mes "���ʓI�ɋ�J����̂́A";
			mes "�������݂����ɖ`���ɑ���";
			mes "��ꂽ�A�����B";
			mes "���͂��̂��Ƃ����Ƃ����ق�";
			mes "�m���Ă���c�c�B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�����炨�O�����܂�A";
			mes "���肪�Ђ�����������";
			mes "�ߓx�ɐ��b���Ă����肷��Ȃ�B";
			mes "���̎��ł������킦�Ȃ�";
			mes "�o����v���o���A��X������";
			mes "�����ɉe�����邩������Ȃ�����ȁB";
			close2;
			cutin "rote03.bmp", 255;
			end;
		case 2:
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�����A�܂����c�c";
			mes "���̒�q�ɂȂ肽���Ƃ�";
			mes "�ӂ��������R�Ő����������Ȃ�";
			mes "�o�債�Ă�����H";
			next;
			menu "�Q���J�ɂ��Ă��Ɠ`����",-;
			mes "[���e���g]";
			mes "�Ȃ񂾁A��q���Ă����̂�";
			mes "�Q���J�̂��Ƃ��B";
			mes "�A�C�c�͊m���ɉ��̈�Ԓ�q��";
			mes "�ԈႢ�Ȃ��B";
			mes "�Ƃ͂����A�A�C�c�ȊO�ɂ���";
			mes "��q���Ƃ�\����Ȃ����ǂȁB";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�����A����ȏ㑝���Ă�";
			mes "������Ǝt���炵�����Ƃ�";
			mes "���Ă�鎩�M���Ȃ����ȁB";
			mes "�Q���J�͒�q���������";
			mes "���ꂾ�����₩�ɂȂ��āA";
			mes "�y�������Ƃ������Ă邪�B";
			next;
			mes "[���e���g]";
			mes "��̃A�C�c�̏C���Ƃ��Ă̘r�O��";
			mes "�Ȃ��Ȃ��̂��̂Ȃ񂾂��A";
			mes "���̐��i���ǂ��ɂ��Ђ����Ă��܂�";
			mes "���͂𔭊��ł��Ă��Ȃ�������";
			mes "���Ȃ肠��B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "���������Ӗ��ł��A�C�c��";
			mes "�܂��܂��Ђ�������ĂƂ����ȁB";
			mes "�܂������B";
			mes "�Ղɗ�����������͈��";
			mes "���ɂȂ��炾�c�c�B";
			close2;
			cutin "rote01.bmp", 255;
			end;
		case 3:
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�j���I�[�Y���B";
			mes "�����Ȃ�c�c";
			mes "�V�������V�[�̕�����";
			mes "�]�E�������H";
			next;
			menu "��!?",-,"�A�܂����c�c",-;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c��k���B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�j���I�[�Y�Ȃ瑊�ς�炸�A";
			mes "�ǂ��łǂ����Ă�̂��������B";
			mes "�V�������V�[�������ɂ͂ǂ����A";
			mes "�܂��ǂ����̎����̋��Ԃ�";
			mes "���q�ɂȂ��Ă�炵���B";
			next;
			mes "[���e���g]";
			mes "�V�������V�[���M���h�����o�[��";
			mes "���������A�ő����̓A�C�c��";
			mes "���ꏊ���c�����₷���Ȃ����̂�";
			mes "����Ӗ��A��������Z���ȁB";
			next;
			menu "���ꏊ��c������K�v��q�˂�",-;
			mes "[���e���g]";
			mes "�t���A���R�̋^�₩�B";
			mes "�����Ȃ�΃A�C�c�͉�������";
			mes "�M���h�ɂƂ��āA";
			mes "���\��݂����Ȃ��񂾂���ȁB";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�c�c���\��͂킩�邾��H";
			mes "�Ȃ��Ă��������A�����Ă����";
			mes "�������������Ɉ��S�̃A�C�e�����B";
			mes "����Ȋ����ŁA���B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "���i�͕ʂɋ��Ă����Ȃ��Ă�";
			mes "���܂�Ȃ����A����������Ď���";
			mes "�A�C�c������Ƃ����̃M���h��";
			mes "���ɂ��܂��������Ƃ������B";
			mes "������������������ȁB";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�����牽���������Ƃ��A";
			mes "�A�C�c�������ɕ߂܂��ČĂі߂���";
			mes "��Ԃɂ��Ă��������񂾁B";
			mes "�����Ƃ��A�A�C�c����������";
			mes "�܂߂Ȑl�ԂȂ炱��ȐS�z��";
			mes "���p�Ȃ񂾂��c�c�B";
			next;
			cutin "rote01.bmp", 2;
			mes "[���e���g]";
			mes "�c�c�������肷�����ȁB";
			mes "�����������Ƃ͑������p���B";
			mes "���Ƀ~���~�������̘b�𕷂�����";
			mes "�f������Ȃ����́A�c���f�����̂ƁA";
			mes "���邳������ȁB";
			close2;
			cutin "rote01.bmp", 255;
			end;
		}
	}
	if(JTB_2QUE == 7) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�悤�A" +strcharinfo(0)+ "�B";
		mes "���̔��Â����A�ŉ�̂Ƃ�";
		mes "����ς�ꖡ�Ⴄ�ȁB";
		mes "���q�͂ǂ����H";
		next;
		if(select("�͂��A���C�ł�","�ŋ߃X�����v�C���Łc�c") == 1) {
			cutin "rote04.bmp", 2;
			mes "[���e���g]";
			mes "�������c�c�B";
			next;
			cutin "rote03.bmp", 2;
			mes "[���e���g]";
			mes "�Ȃ�ǂ��������B";
			mes "���O�ɂ͐F�X�Ɩ��f��";
			mes "�������܂�������ȁc�c�B";
			next;
		} else {
			cutin "rote04.bmp", 2;
			mes "[���e���g]";
			mes "�������c�c�B";
			next;
		}
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�Ƃ���Łc�c���B";
		mes "���O�̓A�C�c�ɂ��ꂩ��";
		mes "��ɍs���Ă���Ă邩�H";
		mes "�A�C�c�Ƃ͂܂�c�c";
		mes "�V�������V�[�̂��Ƃ��B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "������ɂ����Ċ���o���Ă邪";
		mes "���O���Վ������o�[�Ƃ͂����A";
		mes "�A�C�c�̂��Ƃ�m��l�ԂȂ񂾁B";
		mes "���X�ł������炨�O�̊��";
		mes "�����Ă���Ă���B";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�M�A�M���h�����o�[������";
		mes "�M���h�}�X�^�[�̉����Ȃɂ���";
		mes "�C�ɂ����Ă��Ȃ��Ƃ����Ȃ����ȁI";
		mes "�����炨�O��������������A";
		mes "���ɉ����Ȃ�������H";
		setquest 117060;
		compquest 117060;
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
	if(checkquest(116508) & 0x8) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "�����A���O���B";
		mes "���ɖ`���Ȃꂵ��";
		mes "���͋C�̂�������";
		mes "�v�������c�c�B";
		next;
		mes "[���e���g]";
		mes "�����ǂ����Ă�����";
		mes "����̂����Ċ炾�ȁB";
		mes "�ȒP�ɂ����Ƃ����œ��X�A";
		mes "�т̐H���グ�ɂȂ�Ȃ��悤";
		mes "�撣���Ă���Ă������B";
		next;
		cutin "rote03.bmp", 2;
		mes "[���e���g]";
		mes "���Ƃ͂܂��c�c";
		mes "���̘A�����ςɂ��C�ɂȂ���";
		mes "���������r���グ�Ă܂��A";
		mes "���̏ꏊ�ɒ��݂�����";
		mes "�����o���ĂĂȁB";
		next;
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���̂��߂ɂ͑����Ƃ�";
		mes "���낢��旧���̂��K�v�����ȁB";
		mes "����Ȃ킯�ł����ő��̃��c��";
		mes "���l�������Ă�񂾁B";
		mes "�ǂ�������炾���ł�";
		mes "�����Ă���Ă���B";
		next;
		mes "[���e���g]";
		mes "���ɃQ���J�̂�́A";
		mes "�����ŋߖZ�����Ă��܂葊���";
		mes "�o���Ă��Ȃ���Ԃ�����ȁB";
		mes "���x�ɂɂȂ������ɂł��A";
		mes "���̂����ɃA�C�c�̘b�����";
		mes "�Ȃ��Ă��炦��Ə����邺�B";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
	if(checkquest(13181)) {
		cutin "rote01.bmp", 2;
		mes "[���e���g]";
		mes "���m�̏ꏊ������A";
		mes "���f����Ȃ�H";
		mes "�Վ������o�[�Ƃ͂����A";
		mes "�厖�Ȑ�͂Ȃ񂾂���ȁB";
		close2;
		cutin "rote01.bmp", 255;
		end;
	}
	cutin "rote03.bmp", 2;
	mes "[���e���g]";
	mes "�������c�c�I";
	mes "�̐S�Ȏ��ɃA�C�c��";
	mes "�����������B";
	mes "�l�̓s�����l���Ȃ���";
	mes "��������F���ɂ��Ƃ�";
	mes "����Ȃ���!?";
	next;
	mes "[���e���g]";
	mes "�c�c�Ȃ񂾁H";
	mes "���͂��܏������̋�����";
	mes "�����񂾁B";
	mes "�p���Ȃ��Ȃ痣��Ă�������";
	mes "�����Ǝv�����B";
	close2;
	cutin "rote03.bmp", 255;
	end;
}

moc_para01.gat,17,95,5	script	�~���~��#1	643,{
	if(checkquest(117065) & 0x8) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����A��������";
		mes "�����������Ȋ�����Ă����ˁB";
		mes "�X���[�T�C�Y�ƔN��ȊO�Ȃ�A";
		mes "�����Ă����邱�Ƃ�";
		mes "��Ԃ����ł͂Ȃ���ˁB";
		next;
		switch(select("�~���~���ɂ���","�����X�^�[�̌����ɂ���","���e���g�ɂ���")) {
		case 1:
			mes "[�~���~��]";
			mes "�Ȃ��ɁH";
			mes "���ɂ��Ēm�肽���́H";
			mes "���Ȃ������D���ˁB";
			mes "�܂�������B";
			mes "���X�m��Ȃ�������Ȃ��񂾂��B";
			mes "���̉��ɂ��ĕ��������́H";
			next;
			if(select("�ǂ����Ċy���c�ɁH","���̃}���g�̕tⳂ́H") == 1) {
				mes "[�~���~��]";
				mes "���������y���c�ɂ���̂�";
				mes "���錤������`���Ăق�����";
				mes "����ꂽ�����B";
				next;
				mes "[�~���~��]";
				mes "���X���͎R�ŕ�炵�Ȃ���";
				mes "�L�m�R���͔|���Č��������Ă����́B";
				mes "�����c�c�v���悤�Ɍ�����";
				mes "�i�܂Ȃ������̂�ˁB";
				mes "������C���]�������˂āA";
				mes "�`�����邱�Ƃɂ����́B";
				next;
				mes "[�~���~��]";
				mes "�Ƃ����Ă����ʂ̖`������Ȃ�";
				mes "���̒T���S�𖞂����悤�ȁA";
				mes "�`�����ǂ������̂�˂��B";
				mes "������A�󏭂ȃ����X�^�[��T���āA";
				mes "�`�����邱�Ƃ�ړI�ɂ���";
				mes "^ff0000���A�����X�^�[�T�����D��^000000�ɓ�������B";
				next;
				cutin "min02.bmp", 2;
				mes "[�~���~��]";
				mes "�������ꂪ����Ӗ��A";
				mes "�^�̂���������ł��傤�ˁB";
				mes "���̓��D��ł��̓�l��";
				mes "�o����Ă��܂����̂�˂��B";
				mes "���̓�l���Ă����͖̂��_�A";
				mes "���e���g�ƃj���I�[�Y�ˁB";
				next;
				mes "[�~���~��]";
				mes "���̂����A�󏭂ȃ����X�^�[�Ƃ�";
				mes "���Ȃ�̊m���ŉ���Ƃ��o������B";
				mes "���A�Ŗ{�Ƃł���L�m�R�̌������";
				mes "�����X�^�[�̌����̂ق����A";
				mes "�ʔ����悤�ɐi�񂾂�B";
				mes "�{���]�|�ȋC�����邯�ǁB";
				next;
				mes "[�~���~��]";
				mes "���A�ŋC�����΁c�c";
				mes "��Ɋ󏭂ȃ����X�^�[�Ɋւ��āA";
				mes "�搶�ƌĂ΂�郌�x���܂�";
				mes "�m�������Ă����́B";
				mes "�Ƃ͂����A�L�m�R�̌�����";
				mes "���肸�ɑ����Ă�����H";
				next;
				cutin "min01.bmp", 2;
				mes "[�~���~��]";
				mes "�Ƃɂ�������Ȃ킯�ō���";
				mes "�����X�^�[�Ɋւ��錤����";
				mes "��`���Ăق����Ɨv�������";
				mes "�����ɂ���̂�B";
				mes "������肪����Ƃ���΁A";
				mes "��q�����Ȃ��_���炢�˂��B";
				close2;
				cutin "min01.bmp", 255;
				end;
			} else {
				mes "[�~���~��]";
				mes "�����A�}���g�̗��ɓ\����";
				mes "�tⳁc�c���̓|�X�g�E�C�b�g����";
				mes "�����񂾂���������H";
				mes "���ꂪ�C�ɂȂ�̂ˁB";
				next;
				mes "[�~���~��]";
				mes "�y���c�ň˗�����Ă���";
				mes "�����ȊO�ɁA�����̂��߂�";
				mes "�������s���Ă���́B";
				mes "�����ˁA���Ȃ������ɂ�";
				mes "�������苳���Ă������B";
				next;
				cutin "min02.bmp", 2;
				mes "[�~���~��]";
				mes "���͂܂������V�����Z�p��";
				mes "�J���̂��߂̌��������Ă���̂�B";
				mes "���ꂪ���������炩�Ȃ�";
				mes "�֗��ɂȂ�͂���B";
				next;
				mes "[�~���~��]";
				mes "�����Ώۂ͖��͂̊p��";
				mes "���m�̌��ЁA�����čŌ��";
				mes "���̂������c�c�B";
				next;
				mes "[�~���~��]";
				mes "���̕t�������ɖ���";
				mes "�Ñ�̋Z�p��ǂ݉����Ȃ���";
				mes "���͂̊p���璊�o�������͂�";
				mes "���m�̌��Ђɒ������ނ́B";
				next;
				cutin "min01.bmp", 2;
				mes "[�~���~��]";
				mes "�������ꂪ���̗\�z�ʂ�ɐ���������";
				mes "�ǂ�Ȗc��ȏ������R�Ɉ��k����";
				mes "�D���Ȏ��Ɏ��R�Ɏ��o�����̏o����";
				mes "���@�̃��������o���オ���I";
				mes "�ǂ��A�֗����Ǝv��Ȃ��H";
				close2;
				cutin "min01.bmp", 255;
				end;
			}
		case 2:
			mes "[�~���~��]";
			mes "���`��A�����ˁB";
			mes "���΂ɏڂ����b�͏o���Ȃ�����";
			mes "�y���c�ł͖`���҂̈琬�����";
			mes "�ȒP�Ȉ˗����犄��Ƙr���K�v��";
			mes "�˗��𐿂������\��Ȃ̂�ˁB";
			next;
			mes "[�~���~��]";
			mes "���̂��߂ɂ�������x�A";
			mes "�댯�ȃ����X�^�[�̐����n��";
			mes "�����Ȃǂ̃f�[�^�����W������";
			mes "�݂����Ȃ̂�ˁB";
			next;
			mes "[�~���~��]";
			mes "���ɐ������̖`���ҒB�̂��߂�";
			mes "���炩���ߊ댯�ȗv�f��`��";
			mes "���O�ɏ����\�Ȃ悤�ɁA";
			mes "���Ă��������݂����B";
			mes "�܂��A���l�Ƃ��Ă͐���";
			mes "�]�v�Ȃ����b���Ċ���������B";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���Ȃ����`���҂Ȃ�";
			mes "�Ȃ�ƂȂ����̌����������Ƃ�";
			mes "������񂶂�Ȃ�������B";
			mes "�`�����ė\�z�O�̏o������";
			mes "���̊댯�ɂ������ł��A";
			mes "�ׂ邱�Ƃ�����ł��傤�H";
			next;
			mes "[�~���~��]";
			mes "���������o�����đ����ق���";
			mes "��X�ɂȂ��āA�����Ă��邾�낤��";
			mes "�����Ă���������Ƃ����o���Ȃ���";
			mes "�����������Ƃ��ɍ��܂��₷���́B";
			mes "�Ⴆ�Ζ{�����Ȃ������X�^�[��";
			mes "�P��ꂽ���Ƃ��ˁB";
			next;
			mes "[�~���~��]";
			mes "���������~�b�h�K���h�̊O�܂�";
			mes "�o�����Ƃ�����`���҂Ȃ�A";
			mes "���ɂ�����x�̓K���\�͂�";
			mes "������Ă���Ǝv���̂�ˁB";
			mes "�����܂ŉߕی�ɂ��Ȃ��Ă��B";
			next;
			mes "[�~���~��]";
			mes "�܂��A����͑S�Ď��̎�ς�B";
			mes "����Ɉ˗�����Ă���ȏ�A";
			mes "���͊y���c�̎w�j�ɏ]��������B";
			mes "���̑���Ȃ�ׂ����m��";
			mes "�ڍׂȃf�[�^���o���悤��";
			mes "�w�߂Ă����B";
			close2;
			cutin "min02.bmp", 255;
			end;
		case 3:
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���e���g�ˁc�c�B";
			mes "�������̊y���c�œ���";
			mes "���������ɂȂ����̂�";
			mes "���̓��e���g�Ȃ̂�ˁB";
			next;
			mes "[�~���~��]";
			mes "������ɂ�����������";
			mes "�����Ă��āA�l�肪����Ȃ������";
			mes "�����؂�o���ꂽ�킯�B";
			mes "���ǂ��̂܂܂����ŁA";
			mes "�����𑱂��邱�Ƃ�";
			mes "�Ȃ����񂾂��ǁB";
			next;
			mes "[�~���~��]";
			mes "������A�\���ƃp�[�e�B�[�ł�";
			mes "�����X�^�[�����Ɋւ���";
			mes "��Փx�����̈˗����������񂾂���";
			mes "�܂����̊w���ɂ��ē�����";
			mes "������l���W�߂�̂�";
			mes "��������̂�B";
			next;
			mes "[�~���~��]";
			mes "�����玄��肱��������";
			mes "���e���g�ɑ��k�����킯�B";
			mes "�����󂢎����Ȃ�ׂ�";
			mes "�����̖`���҂��W�߂�ɂ�";
			mes "�ǂ������炢��������H";
			mes "���ĂˁB";
			next;
			mes "[�~���~��]";
			mes "�������烍�e���g�̓z�A";
			mes "�������Ȋ炵�Ă�����������B";
			mes "�~���~���Ȃ炱���ŕڎ�����";
			mes "^ff0000�����l�Ƃ��Ă�!!^000000����";
			mes "����ł�Ε��D���ȓz���A";
			mes "��������񂶂�Ȃ����H���āB";
			next;
			cutin "min01.bmp", 2;
			mes "[�~���~��]";
			mes "���̌㖳�_���e���g��";
			mes "���d�u���̈Ӗ������߂�";
			mes "�X�|�A�G�N�X�v���[�W������";
			mes "�H��킹�Ă�������B";
			next;
			cutin "min02.bmp", 2;
			mes "[�~���~��]";
			mes "���ǂ��̂��A�Ől���W�܂����񂾂���";
			mes "���̂�������{�点��ƕ|������";
			mes "�{�点�Ă͂����Ȃ��I�݂�����";
			mes "���͋C�ɂȂ����̂�����";
			mes "�[�������Ȃ���B";
			next;
			mes "[�~���~��]";
			mes "�܂������c�c";
			mes "���e���g�Ɋւ���";
			mes "�낭�Ȗڂɂ���Ȃ���ˁB";
			close2;
			cutin "min02.bmp", 255;
			end;
		}
	}
	if(JTB_2QUE == 7) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����c�c";
		mes strcharinfo(0)+ "����Ȃ��B";
		mes "���߂Ă����ł�������B";
		mes "�����l�B";
		next;
		mes "[�~���~��]";
		mes "�܂������̋C������e���g��";
		mes "�����ł���Ƃ͎v��Ȃ�������B";
		mes "�t���������������ł���A";
		mes "�������߂Ă������炢�������̂ɁB";
		mes "�悭�������ˁB";
		next;
		mes "[�~���~��]";
		mes "�Ƃ͂����A���ꂩ�炪�{���̈Ӗ���";
		mes "��ςȂ̂͊ԈႢ�Ȃ��ł��傤�ˁB";
		mes "���܂ł̓M���h�����o�[���肾����";
		mes "���ꂩ�炠�̎q�A���̐l�Ԃ�";
		mes "�ڂɐG���@������Ȃ邩��";
		mes "����Ȃ����B";
		next;
		cutin "min03.bmp", 2;
		mes "[�~���~��]";
		mes "�܂��A�ň����e���g�ɑS��";
		mes "�����t����Ζ��Ȃ��͂������B";
		mes "���Ȃ��̓M���h�ɂ܂�";
		mes "�Q���������Ȃ����炢�ł�";
		mes "�V�тɗ���Ƃ������H";
		mes "���}���邵�B";
		setquest 117065;
		compquest 117065;
		close2;
		cutin "min03.bmp", 255;
		end;
	}
	if(checkquest(116508) & 0x8) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "����B";
		mes strcharinfo(0) + "�B";
		mes "�������ŉ�ƂȂ񂾂�";
		mes "�ςȊ����ˁB";
		next;
		mes "[�~���~��]";
		mes "�Ƃ肠�����V�������V�[�̌���";
		mes "�܂��F�X�Ɩ�肪���肻���ˁB";
		mes "���ɐV�����M���h�}�X�^�[��";
		mes "�U�����Ȃ��Ɩ������Ǝv����B";
		next;
		cutin "min02.bmp", 2;
		mes "[�~���~��]";
		mes "���e���g���Č����ڒʂ�A";
		mes "�C������i�������ς�B";
		mes "���ɁA�M���h�����o�[�ɉ���";
		mes "�댯������ԉ\�������邱�Ƃɂ�";
		mes "���ȁ`��q���Ȃ̂�ˁB";
		next;
		mes "[�~���~��]";
		mes "�܂��A�����͂��̎q�Ȃ��";
		mes "�F�X����������d�����Ȃ��񂾂��ǁB";
		mes "�Ȃɂ͂Ƃ����ꂱ���ł�������";
		mes "�F�X�Ƙb���Ă݂��Ƃ���ŁA";
		mes "����̋�_�ł����Ȃ����B";
		mes "�Ƃɂ����c�c";
		next;
		mes "[�~���~��]";
		mes "���i�C���̃��[�v�|�[�^����";
		mes "���Ԃ��L�����Ă���݂��������A";
		mes "��������܂����p���ĒN����";
		mes "���e���g���܂߁A���݂̂�Ȃ�";
		mes "�������邵���Ȃ��񂶂�Ȃ�������H";
		close2;
		cutin "min02.bmp", 255;
		end;
	}
	if(checkquest(13181)) {
		cutin "min01.bmp", 2;
		mes "[�~���~��]";
		mes "���Ȃ������D���ˁB";
		mes "���ɂ���Z���Ԃ��낤���ǁA";
		mes "��낵�����肢�����B";
		close2;
		cutin "min01.bmp", 255;
		end;
	}
	mes "[�~���~��]";
	mes "���[���ĂƁB";
	mes "�����������̌����A";
	mes "�����͐i�W���邩����H";
	mes "�����������낻��";
	mes "���̒i�K�ɐi�݂�����ˁB";
	close2;
	cutin "min01.bmp", 255;
	end;
}

moc_para01.gat,41,76,3	script	���M#1	647,{
	if(checkquest(117070) & 0x8) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "���A�A�C�O�l�̐V�Ȃ�";
		mes "�̎����l���Ă����ł����A";
		mes "�����C���X�s���[�V������";
		mes "�ق�����ł���˂��B";
		mes "�ǂ������玄�Ɏ��₵��";
		mes "����܂��񂩁H";
		next;
		switch(select("���M�ɂ���","�V�Ȃɂ���","�A�C�O�ɂ���")) {
		case 1:
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "�����ł��˂��B";
			mes "�l���g�̂��Ƃɂ���";
			mes "���߂Ă��b�����邱�Ƃ�";
			mes "�����ǂ��̎����v��������";
			mes "����܂���B";
			mes "���ɂ��Ă��b���܂��傤�B";
			next;
			if(select("���M�̃w�A�X�^�C���ɂ���","�̂𒮂����Ăق���") == 1) {
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "�l�̂��̔��̓A���x���^�ɂ���";
				mes "������e�t�ɐ����Ă��������܂����B";
				mes "�Ȃ������̔��e�t�A���p����Ȃ�";
				mes "����؂邽�߂����Ő؂�̂�";
				mes "�s�v�c�ł͂����ł����B";
				next;
				cutin "ragi02.bmp", 2;
				mes "[���M]";
				mes "�r�͗ǂ����C�ɓ����Ă���̂ł����A";
				mes "�����̔��e�t�ɔ��^�͂��C���ɂȂ�̂�";
				mes "���܂ɕςȔ��`�ɂ���邱�Ƃ�";
				mes "����݂����ł��悧�B";
				mes "���������Ӗ��ł͖l�̔��^��";
				mes "�^���ǂ������̂ł��傤�˂��B";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "���ƁA���̔��̐F�͖l�̏�������";
				mes "����ۂۊy�c�Ƀs�b�^���̐F��";
				mes "�l�I�ɂ��Ȃ�C�ɓ�����";
				mes "�����ł���˂��B";
				mes "���Ȃ݂ɂ��̐F�͓V�R�ł��B";
				mes "���߂��킯�ł͂Ȃ���ł��悧�B";
				next;
				mes "[���M]";
				mes "���������΃^���|�|�̉Ԍ��t��";
				mes "^0000FF���̐M��^000000�������ł��B";
				mes "�Â�����A�^���|�|�̖Ȗт�";
				mes "���肢�����Ă������Ƃ���";
				mes "���̂悤�ȉԌ��t��";
				mes "�Ȃ����Ƃ�����������܂��B";
				next;
				mes "[���M]";
				mes "���ɂ������A�K���c�c";
				mes "�܂��A�ʗ��Ƃ����Ӗ�������܂��B";
				mes "�ł��l�͕ʗ��Ƃ����̂�";
				mes "�Ăщ���߂̈ꎞ�̖񑩂���";
				mes "�l���Ă��܂�����l��������ł�";
				mes "�����Ӗ��ł͂Ȃ��Ǝv���Ă��܂���B";
				next;
				mes "[���M]";
				mes "�Ȃɂ͂Ƃ�����c�c";
				mes "������K���Ƃ������t�͂܂���";
				mes "�A�C�O�l�̉̂̂悤��";
				mes "����ۂۊy�c�̈���ɂȂꂽ���Ƃ�";
				mes "�l�͐S����ւ�Ɏv���܂���B";
				close2;
				cutin "ragi01.bmp", 255;
				end;
			} else {
				cutin "ragi03.bmp", 2;
				mes "[���M]";
				mes "�����A�l�̉̂��ł����H";
				mes "�m���ɖl�̐E�Ƃ̓o�[�h����";
				mes "�A�C�O�l�̂��߂ɉ̎���ǂ�";
				mes "�����Ă��܂����c�c";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "���͂���ۂۊy�c�ɏ������Ă���";
				mes "�����̂��߂�";
				mes "�����ɍ�Ȃ����Ȃ�̂�";
				mes "�܂��Ȃ���ԂȂ�ł���ˁc�c�B";
				mes "��ɖl�̓A�C�O�l�̉̎��̍쐬��";
				mes "�S���Ă��܂�����B";
				next;
				cutin "ragi02.bmp", 2;
				mes "[���M]";
				mes "���������ō쎌��Ȃ����̂�";
				mes "�N���ɒ����Ă���������悤��";
				mes "�Ȃ肽���Ƃ͎v���Ă����ł����A";
				mes "�Ȃ��Ȃ����y�̐_�l��";
				mes "����Ă��Ȃ���ł���˂��B";
				next;
				mes "[���M]";
				mes "�Ƃ͂����l���o�[�h�̂͂�����B";
				mes "�����Ƃ�������ۂۊy�c��";
				mes "���K�����o�[�Ƃ���";
				mes "�ō��̉̂���Ȃ��Ă݂܂��悧�B";
				next;
				cutin "ragi01.bmp", 2;
				mes "[���M]";
				mes "�Ȃ̂Ő\����Ȃ��ł����A";
				mes "���̂Ƃ�������܂Ŗl�̉̂�";
				mes "���y���݁A�Ƃ������Ƃ�";
				mes "���肢���܂��B";
				close2;
				cutin "ragi01.bmp", 255;
				end;
			}
		case 2:
			mes "[���M]";
			mes "�A�C�O�l�̐V�ȂȂ̂ł���";
			mes "���������Ȃ̂Ń����N�Ɋւ���";
			mes "�̂���낤���Ȃƍl���Ă�����";
			mes "�����ł���˂��B";
			next;
			mes "[���M]";
			mes "�Ƃ����Ă������̕��ł͂Ȃ��A";
			mes "���������N�̌��g�̕��ł��B";
			mes "�����l����" +strcharinfo(0)+ "����̕���";
			mes "�悭�����m���Ƃ͎v���܂����c�c�B";
			next;
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "���������N�Ɋւ���̂ɂ��Ă�";
			mes "���炭���낢��Ȑl����ނ�";
			mes "���邱�Ƃ͖��炩�ł����B";
			mes "����Ȃ�l�͖��������N��";
			mes "���g�̕����ނɂ����ق���";
			mes "�ʔ������ł�����B";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "���Ƀ����N�̌��g��";
			mes "�V�g�^�Ɛl�Ԍ^�B";
			mes "�����N�ɂ�萶�ݏo���ꂽ";
			mes "�����X�^�[�Ɋւ�炸�A";
			mes "�Ȃ��V�g�Ɛl�Ԃ̌`���ł���";
			mes "�K�v�������ł��傤�˂��B";
			next;
			mes "[���M]";
			mes "�����N���ǂ����Č��g�����̂悤��";
			mes "�`�ɑn�������̂��A�l�ɂƂ���";
			mes "���Ȃ苻���̂����ނł��B";
			mes "�܂��A�����N�̌��g�Ɍ��炸";
			mes "�l�ɂƂ��Ă��̐��E�͂ƂĂ������[��";
			mes "�ώ@�ΏۂȂ�ł����B";
			next;
			mes "[���M]";
			mes "����������߂��������Ȃǂ�";
			mes "���܂��̎��ƋȂɗZ��������";
			mes "��X�A�����������Ƃ��������񂾂�";
			mes "���p�����悤�ȉ̂ɏo�����";
			mes "�����ȂƎv���Ă��܂��B";
			next;
			mes "[���M]";
			mes "�����l����Ɩ`���҂Ƃ����E�Ƃ�";
			mes "�C�Â��Ȃ������ɐF�X�ƁA";
			mes "���E�̓��o������";
			mes "�ւ���Ă���B��̐E�Ƃ���";
			mes "����܂���˂��B";
			close2;
			cutin "ragi01.bmp", 255;
			end;
		case 3:
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "�A�C�O�l�ɂ��āA�ł����B";
			mes "�����ł��˂��B";
			mes "�l������ۂۊy�c��";
			mes "���c���邫�������ɂȂ����̂�";
			mes "�ԈႢ�Ȃ��A�C�O�l�ł��ˁB";
			next;
			mes "[���M]";
			mes "�A�C�O�l�Ə��߂ĉ�������̂��Ƃ�";
			mes "���ł��N���ɉ����Ă��܂��B";
			mes "�A�C�O�l���������I���āA";
			mes "�C�Y���[�h�ɖ߂��Ă������ɁA";
			mes "�l���A�C�O�l���}���邽�߂�";
			mes "���̍`�ɋ�����ł��B";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "���A�����Y��Ă��܂������l��";
			mes "�S���ɂ���A�C�O�t�@���N���u�A";
			mes "�C�Y���[�h�x���̉�Ȃ�ł��悧�B";
			mes "�Ȃ̂ł��̓�����Ƃ���";
			mes "��ԂɃA�C�O�l�����}�����܂����B";
			next;
			mes "[���M]";
			mes "�Ƃ͂����A�C�O�l�͐l�C�҂ł�����";
			mes "�A�C�O�l����ڌ��悤�ƁA�`��";
			mes "�������l������Łc�c�B";
			mes "�����A�C�O�l�ɂ͖l�̎p�Ȃ�";
			mes "������Ȃ����낤�ȂƁA";
			mes "���߂Ă�����ł����c�c�B";
			next;
			mes "[���M]";
			mes "�A�C�O�l�͂���Ȓ��ł��A�l�̎p��";
			mes "�������茩���Ă��ꂽ��ł��B";
			mes "���̎��͖{���Ɋ����������ł��悧�B";
			mes "�c�c�Ƃ����킯�ł��ꂪ����������";
			mes "�A�C�O�l�Ɛe�����Ȃ�A";
			mes "���݂ɂ�����܂��B";
			next;
			mes "[���M]";
			mes "�����ŋ߂ǂ��ɂ��l���g���A";
			mes "�A�C�O�l�̗͂ɂȂ�Ȃ�����������";
			mes "�����̖��͂����������ʂ�";
			mes "������ł���˂��B";
			next;
			mes "[���M]";
			mes "�Ȃ̂ł��߂ĉ̂��炢�͂�";
			mes "�쎌���撣���Ă����ł����A";
			mes "��͂�S�ɗ]�T���Ȃ����炩";
			mes "�Ȃ��Ȃ����܂������܂���B";
			mes "���������̂ł��悧�B";
			next;
			cutin "ragi02.bmp", 2;
			mes "[���M]";
			mes "�Ƃ���Łc�c";
			mes "���܂ł̘b�A�M���܂������H";
			mes "�S�Ă̂��b�ɂ͂�����x�A";
			mes "��������U�������e���܂߂�";
			mes "���ꂽ�\��������܂��B";
			next;
			cutin "ragi01.bmp", 2;
			mes "[���M]";
			mes "���Ȃ��Ƃ��l�͂���ł�";
			mes "�o�[�h�ł�����˂��B";
			mes "���܂茾�t�ʂ�ɂƂ炸��";
			mes "���������Ă����Ă��������ˁB";
			mes "���ɃA�C�O�l�ɂ�";
			mes "�������p�ł��肢���܂��B";
			close2;
			cutin "ragi01.bmp", 255;
			end;
		}
	}
	if(JTB_2QUE == 7) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "����ɂ��́B";
		mes strcharinfo(0)+ "����B";
		mes "���߂āA�����l�ł����B";
		next;
		mes "[���M]";
		mes "���̃��e���g�l���������l��";
		mes "���ꍛ�ꂵ�܂����悧�B";
		mes strcharinfo(0)+ "����͖`���҂ł͂Ȃ��A";
		mes "�Q�d�Ȃǂ̒n�ʂ̂ق���";
		mes "�������̂ł͂Ȃ��ł��傤���B";
		next;
		mes "[���M]";
		mes "�Ƃ͂����{���ɑ�ςȂ̂�";
		mes "���ꂩ��Ȃ�ł���˂��B";
		mes "����Ȃ��Ƃ������Ȃ���A";
		mes "�l���g�̓V�������V�[��";
		mes "�ǂ����������������Ă����̂�";
		mes "�y���݂łȂ�܂��񂪁B";
		next;
		cutin "ragi02.bmp", 2;
		mes "[���M]";
		mes "�h���������ƃA�C�f�B�A�Ƃ����̂�";
		mes "�����Ɍ͊����Ă��܂��܂����B";
		mes "���������Ӗ��ł��l�́A";
		mes strcharinfo(0)+ "������܂߂ĊF�����";
		mes "������Ƃɂ͍��ł�";
		mes "���ӂ��Ă��܂��悧�B";
		setquest 117070;
		compquest 117070;
		close2;
		cutin "ragi02.bmp", 255;
		end;
	}
	if(checkquest(116508) & 0x8) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes strcharinfo(0) + "����B";
		mes "�������`���ɍs�����";
		mes "�\��ł����H";
		next;
		cutin "ragi03.bmp", 2;
		mes "[���M]";
		mes "����ɂ��Ă��c�c";
		mes "�����Ă܂����B";
		mes "����Ȍ��t���s�b�^����";
		mes "�W�J�ɂȂ��Ă��܂��˂��B";
		next;
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "�Ƃ͂����l�̓��e���g�l��";
		mes "�������Ƃ������Ƃ�����";
		mes "�v����ł���˂��B";
		mes "�����Ȃ�΃����X�^�[�̎��";
		mes "���t����悤�Ȃ��̂ł����B";
		next;
		mes "[���M]";
		mes "�����A�A�C�O�l�����Ă����";
		mes "�l�l�Ƃ��Ă͂�͂�A";
		mes "�V�������V�[�̂��Ƃ��Ȃ�Ƃ�";
		mes "�o���Ȃ����̂��Ɠ���";
		mes "�Y�܂��Ă͂���̂ł����c�c";
		mes "���ʂ͏o�Ă��܂���B";
		next;
		mes "[���M]";
		mes "�Ƃ肠�������i�C�������";
		mes "���[�v�|�[�^���ŉ��x�����̏ꏊ��";
		mes "�ʂ��āA�F���񂪔[���ł���悤��";
		mes "�𓚂�������܂Ŋ撣�邵��";
		mes "�Ȃ��悤�ł��˂��c�c�B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
	if(checkquest(13181)) {
		cutin "ragi01.bmp", 2;
		mes "[���M]";
		mes "����ɂ��́B";
		mes "�Z���Ԃł����A";
		mes "��낵�����肢���܂��ˁB";
		mes "���Ȃ��̊���A";
		mes "�y���݂ɂ��Ă��܂��悧�B";
		close2;
		cutin "ragi01.bmp", 255;
		end;
	}
	cutin "ragi01.bmp", 2;
	mes "[���M]";
	mes "���̔��͉���峂̂悤�Ɂc�c";
	mes "�ӂށA�������ɉ̎���";
	mes "峂͂��܂�ǂ��Ȃ��C��";
	mes "���܂��˂��B";
	mes "���ɉ������邩�ȁc�c�B";
	close2;
	cutin "ragi01.bmp", 255;
	end;
}

//==========================================
// �f�C���[�N�G�X�g
//------------------------------------------
moc_para01.gat,44,81,3	script	�����f�B�[�W���b�N#1	648,8,8,{
	if(JTB_DAILY == 2) {
		mes "[�����f�B�[�W���b�N]";
		mes "�c�c�B";
		mes "�����͂ǂ�����H";
		next;
		switch(select("�˗����󂯂�","�˗���񍐂���","���ʕ�V�ɂ���","�˗���j������","�b������")) {
		case 1:
			if(BaseLevel >= 140) {
				mes "[�����f�B�[�W���b�N]";
				mes "�c�O�������O�Ɉ˗��ł�����̂�";
				mes "�����悤���B";
				mes "���̈˗��͂�����x���܂����r�O��";
				mes "�����o�[�Ɉ˗�����K�v������B";
				mes "���ꂪ�N���C�A���g�����";
				mes "�w��������d�����Ȃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "������𗧂Ă�΂����炪������";
				mes "�ƌ������悤�ɁA�ׂ����񑩂��Ƃ�";
				mes "����͂��낢�댈�߂��Ă���B";
				mes "���̂��߂��O�Ɉ˗����邱�Ƃ�";
				mes "�����o���Ȃ�����A";
				mes "�����Ă����Ă���B";
				next;
				mes "�]^ff0000�����f�B�[�W���b�N�̈˗���";
				mes "�@BaseLv140�ȏ�ł͎󂯂邱�Ƃ�";
				mes "�@�ł��܂���^000000�]";
				close;
			}
			if(checkquest(96800)) {
				if(!(checkquest(96800) & 0x2)) {
					mes "[�����f�B�[�W���b�N]";
					mes "�����̕��̎d���͏I�����悤���ȁB";
					mes "�����������X�^�[�Ƃ�������";
					mes "�����Ȃ茻�ꂽ�肷�邩��";
					mes "���S���鎖�͂ł��Ȃ��B";
					mes "�܂��ɂȂƂ��ɗ��ށB";
					close;
				}
			}
			if(checkquest(96801)) {
				mes "[�����f�B�[�W���b�N]";
				mes "�ǂ������H�@�˗���Y�ꂽ�̂��H";
				mes "�d�����Ȃ��z���ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���O�ɗ��񂾓��e��";
				mes "^FF0000�^�i�g�X�^���[^000000��";
				mes "^FF0000�Ԃ߂��";
				mes "���s�����";
				mes "�ی삷���^000000��";
				mes "20�C�|���Ă��炢�����B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�A�C�O�ɂ͋C�Â����Ȃ�B";
				mes "��낵�����ށB";
				close;
			}
			if(checkquest(96802)) {
				mes "[�����f�B�[�W���b�N]";
				mes "�ǂ������H�@�˗���Y�ꂽ�̂��H";
				mes "�d�����Ȃ��z���ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���O�ɗ��񂾓��e��";
				mes "^FF0000�t���C����_�a^000000��";
				mes "^FF0000���@���x���N";
				mes "�A�C�V��";
				mes "�G�L�I^000000��";
				mes "20�C�|���Ă��炢�����B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�A�C�O�ɂ͋C�Â����Ȃ�B";
				mes "��낵�����ށB";
				close;
			}
			if(checkquest(96803)) {
				mes "[�����f�B�[�W���b�N]";
				mes "�ǂ������H�@�˗���Y�ꂽ�̂��H";
				mes "�d�����Ȃ��z���ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���O�ɗ��񂾓��e��";
				mes "^FF0000�����Ȃ���^000000��";
				mes "^FF0000�]���r�X���[�^�[";
				mes "���M�b�h�]���r";
				mes "�o���V�[^000000��";
				mes "20�C�|���Ă��炢�����B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�A�C�O�ɂ͋C�Â����Ȃ�B";
				mes "��낵�����ށB";
				close;
			}
			if(checkquest(96804)) {
				mes "[�����f�B�[�W���b�N]";
				mes "�ǂ������H�@�˗���Y�ꂽ�̂��H";
				mes "�d�����Ȃ��z���ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���O�ɗ��񂾓��e��";
				mes "^FF0000�A�r�X���C�N^000000��";
				mes "^FF0000�O���[���y���X";
				mes "�u���[�I�V�h�X";
				mes "���b�h�y���X^000000��";
				mes "20�C�|���Ă��炢�����B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�A�C�O�ɂ͋C�Â����Ȃ�B";
				mes "��낵�����ށB";
				close;
			}
			if(checkquest(96801) & 0x4 || checkquest(96802) & 0x4 || checkquest(96803) & 0x4 || checkquest(96804) & 0x4) {
				mes "[�����f�B�[�W���b�N]";
				mes "�B���ς݂̈˗�������悤���ȁB";
				mes "�܂��͂�������񍐂��Ă���B";
				close;
			}
			mes "[�����f�B�[�W���b�N]";
			mes "���܂�A��Ԃ�������ȁB";
			mes "�˗����e�����A";
			mes "�A�C�O���s�������ȏꏊ�𒆐S��";
			mes "�����X�^�[�����炵�Ă��Ăق����B";
			next;
			mes "[�����f�B�[�W���b�N]";
			mes "�A�C�O���s�������ȏꏊ�͂������B";
			mes "4���邪�A�ǂ��ɍs������";
			mes "�͂����肵�Ă��Ȃ��B";
			mes "�ꍇ�ɂ���Ă͓k�J�ɋA��";
			mes "�\���͂��邪�O�̂��߂��B";
			next;
			set '@sel,(select("�^�i�g�X�^���[","�t���C����_�a","�����Ȃ���","�A�r�X���C�N"));
			switch('@sel) {
			case 1:
				mes "[�����f�B�[�W���b�N]";
				mes "^FF0000�^�i�g�X�^���[^000000�͈�Ԗʓ|�ȏꏊ���B";
				mes "���̕���V���e�ނ���S�z����ȁB";
				mes "���͖񑩂����j���B";
				mes "�܂��A���̂��A�ō���A";
				mes "�F�X�ʓ|�Ȃ񂾂��c�c�B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "^FF0000�^�i�g�X�^���[^000000�ł�";
				mes "^FF0000�Ԃ߂��";
				mes "���s�����";
				mes "�ی삷���^000000";
				break;
			case 2:
				mes "[�����f�B�[�W���b�N]";
				mes "�A�C�O�̒T���̓��w����";
				mes "�t���C����_�a�ɂ܂ŋy�Ԃ悤���ȁB";
				mes "�����c�c�A�C�O���T���Ă���^FF0000���̐l��^000000��";
				mes "�ǂ��Ŕ�������Ă����������Ȃ��B";
				mes "�Ƃ����킯�ňȉ��̃����X�^�[��";
				mes "�����𗊂ށB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "^FF0000�t���C����_�a^000000�ł�";
				mes "^FF0000���@���x���N";
				mes "�A�C�V��";
				mes "�G�L�I^000000";
				break;
			case 3:
				mes "[�����f�B�[�W���b�N]";
				mes "���ʂ̖`���҂Ȃ�";
				mes "���݂���m��Ȃ�^FF0000�����Ȃ���^000000�B";
				mes "�������A�C�O�͒��ڂ��n�߂Ă���B";
				mes "�܂������c�c�ʓ|�Ȃ��Ƃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "^FF0000�����Ȃ���^000000�ł�";
				mes "^FF0000�]���r�X���[�^�[";
				mes "���M�b�h�]���r";
				mes "�o���V�[^000000";
				break;
			case 4:
				mes "[�����f�B�[�W���b�N]";
				mes "^FF0000�A�r�X���C�N^000000�ɂ��A�C�O��";
				mes "�˗��������ė����̂��c�c�B";
				mes "���������ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "^FF0000�A�r�X���C�N^000000�ł�";
				mes "^FF0000�O���[���y���X";
				mes "�u���[�I�V�h�X";
				mes "���b�h�y���X^000000";
				break;
			}
			mes "��20�C�������Ă��炢�����B";
			mes "���߂邩�H";
			next;
			if(select("�󂯂�","��߂�") == 2) {
				mes "[�����f�B�[�W���b�N]";
				mes "�������B";
				mes "�C���ς������܂����Ă���B";
				close;
			}
			mes "[�����f�B�[�W���b�N]";
			mes "������B";
			mes "��낵�����ނ��B";
			mes "���Ɣ閧�����̂��Y���ȁB";
			switch('@sel) {
			case 1:
				setquest 96801;
				break;
			case 2:
				setquest 96802;
				break;
			case 3:
				setquest 96803;
				break;
			case 4:
				setquest 96804;
				break;
			}
			close;
		case 2:
			set '@quest,0;
			if(checkquest(96801) & 0x4) {
				set '@quest,96801;
			}
			if(checkquest(96802) & 0x4) {
				set '@quest,96802;
			}
			if(checkquest(96803) & 0x4) {
				set '@quest,96803;
			}
			if(checkquest(96804) & 0x4) {
				set '@quest,96804;
			}
			if('@quest == 0) {
				mes "[�����f�B�[�W���b�N]";
				mes "���������A";
				mes "�������Ă���˗��͖����悤�����H";
				mes "������x�悭�m�F���Ă݂Ă���B";
				close;
			}
			mes "[�����f�B�[�W���b�N]";
			mes "�˗��͏�肭���Ȃ��Ă��ꂽ�悤���ȁB";
			mes "���������B��������B";
			mes "����͕�V���A�󂯎���Ă���";
			next;
			if(select("�󂯎��","�󂯎��Ȃ�") == 2) {
				mes "[�����f�B�[�W���b�N]";
				mes "�Ȃ񂾁H�@�Ȃɂ�����̂��H";
				mes "�܂������A�󂯎�肽���Ȃ�����";
				mes "�����Ă���B";
				close;
			}
			delquest '@quest;
			switch('@quest) {
			case 96801:
				setquest 96811;
				break;
			case 96802:
				setquest 96812;
				break;
			case 96803:
				setquest 96813;
				break;
			case 96804:
				setquest 96814;
				break;
			}
			setquest 96800;
			if(BaseLevel >= 90) {
				set '@base1,1000000;
			}
			if(BaseLevel >= 100) {
				set '@base2,1000000;
				set '@base3,1000000;
			}
			if(BaseLevel >= 110) {
				set '@base4,1000000;
				set '@base5,1000000;
			}
			if(BaseLevel >= 120) {
				set '@base6,1000000;
				set '@base7,1000000;
			}
			if(BaseLevel >= 130) {
				set '@base8,1000000;
				set '@base9,1000000;
			}
			getexp '@base1,0,1;
			getexp '@base2,0,1;
			getexp '@base3,0,1;
			getexp '@base4,0,1;
			getexp '@base5,0,1;
			getexp '@base6,0,1;
			getexp '@base7,0,1;
			getexp '@base8,0,1;
			getexp '@base9,0,1;
			mes "[�����f�B�[�W���b�N]";
			mes "���b�ɂȂ����B";
			mes "�܂��ǂ��������`���Ă���B";
			close;
		case 3:
			set '@quest,0;
			set '@quest,'@quest+checkquest(96811);
			set '@quest,'@quest+checkquest(96812);
			set '@quest,'@quest+checkquest(96813);
			set '@quest,'@quest+checkquest(96814);
			set '@quest,'@quest+checkquest(96816);
			set '@quest,'@quest+checkquest(96817);
			set '@quest,'@quest+checkquest(96818);
			set '@quest,'@quest+checkquest(96819);
			if('@quest <= 7) {
				mes "[�����f�B�[�W���b�N]";
				mes "���ƃA�C�O�̈˗��A";
				mes "^FF0000���ꂼ��4��ނ��ׂĂ�";
				mes "������������^000000���ʕ�V����낤�B";
				mes "�������e���C�ɂȂ�Ȃ�";
				mes "���ƃA�C�O�̈˗���B�����Ă���B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���ׂĂ��Ȃ��̂͑�ς��낤�B";
				mes "�����A���̋�J�Ɍ�������";
				mes "��V�͖񑩂���B";
				mes "���̋C���������璧��ł݂Ă���B";
				close;
			} else if('@quest == 8) {
				// ���ʕ�V
				mes "[�����f�B�[�W���b�N]";
				close;
			} else if('@quest == 64) {
				// ���ʕ�V
				mes "[�����f�B�[�W���b�N]";
				close;
			}
		case 4:
			mes "[�����f�B�[�W���b�N]";
			mes "�˗������d����j���������̂��H";
			mes "�t���A�܂������B";
			mes "���O�ɂ͂��O�̎������񂾂낤�B";
			next;
			mes "[�����f�B�[�W���b�N]";
			mes "�j���̕��@��2��ނ���B";
			mes "�D���ȕ���I�ׁB";
			next;
			if(select("�˗��̔j��","�񍐋L�^�̔j��") == 1) {
				set '@quest,0;
				set '@quest,'@quest+checkquest(96801);
				set '@quest,'@quest+checkquest(96802);
				set '@quest,'@quest+checkquest(96803);
				set '@quest,'@quest+checkquest(96804);
				if('@quest == 0) {
					mes "[�����f�B�[�W���b�N]";
					mes "���������A";
					mes "�˗����Ă���d���͖����悤�����H";
					mes "������x�悭�m�F���Ă݂Ă���B";
					close;
				}
				mes "[�����f�B�[�W���b�N]";
				mes "�˗��̔j����";
				mes "�����O���󂯂Ă���˗���";
				mes "^FF0000�������Ă�����̂��܂߁A";
				mes "�S�Ă�j�����邱�ƂɂȂ�B^000000";
				mes "�񍐋L�^�����c��`�ɂȂ�ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�������Ă���˗���j�����Ă��܂���";
				mes "��V��n�����Ƃ��ł��Ȃ��Ȃ邼�B";
				mes "^FF0000�������Ă���˗��͐�ɕ񍐂�����";
				mes "��V���󂯎���Ă���A";
				mes "�˗��̔j�������Ă���B^000000";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�{���Ɉ˗���j�����Ă��������H";
				next;
				if(select("�͂�","������") == 2) {
					mes "[�����f�B�[�W���b�N]";
					mes "�������A�����Ă���邩�B";
					mes "������B";
					mes "���Ԃ��������Ă��\��Ȃ�����";
					mes "�˗��̐��s�ɂ������Ă���B";
					close;
				}
				delquest 96801;
				delquest 96802;
				delquest 96803;
				delquest 96804;
				mes "[�����f�B�[�W���b�N]";
				mes "���O�Ɉ˗������d���͎�艺�����B";
				mes "�܂��C����������";
				mes "���������Ă���B";
				close;
			} else {
				set '@quest,0;
				set '@quest,'@quest+checkquest(96811);
				set '@quest,'@quest+checkquest(96812);
				set '@quest,'@quest+checkquest(96813);
				set '@quest,'@quest+checkquest(96814);
				if('@quest == 0) {
					mes "[�����f�B�[�W���b�N]";
					mes "���������A";
					mes "�������Ă���񍐂̋L�^��";
					mes "�����悤�����H";
					mes "������x�悭�m�F���Ă݂Ă���B";
					close;
				}
				mes "[�����f�B�[�W���b�N]";
				mes "�񍐋L�^�̔j����";
				mes "�����O��^FF0000�񍐂��Ă���˗���";
				mes "�S�Ă�j�����邱�ƂɂȂ�B^000000";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�񍐂�j�����Ă��܂���";
				mes "^FF0000���ʕ�V�𓾂邽�߂ɂ�";
				mes "4��ނ̈˗����ׂĂ��A";
				mes "������x�ŏ�����";
				mes "����������K�v������B^000000";
				next;
				mes "�]�񍐋L�^�̔j����";
				mes "^FF0000�@�����񍐂��s�����N�G�X�g��";
				mes "�@�S�ď������܂��B^000000";
				mes "�@���ʕ�V�𓾂邽�߂ɂ́A";
				mes "^FF0000�@�ēx4��ނ̃N�G�X�g���󂯁A";
				mes "�@��������K�v������܂�^000000�]";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�{���ɕ񍐋L�^��j�����Ă��������H";
				next;
				if(select("�͂�","������") == 2) {
					mes "[�����f�B�[�W���b�N]";
					mes "�킩�����B";
					mes "��������";
					mes "�˗��̐��s�ɂ������Ă���B";
					close;
				}
				delquest 96811;
				delquest 96812;
				delquest 96813;
				delquest 96814;
				mes "[�����f�B�[�W���b�N]";
				mes "���O���񍐂����L�^��";
				mes "�S�Ĕj�������B";
				mes "�܂��C����������˗����󂯂Ă���B";
				close;
			}
		case 5:
			mes "[�����f�B�[�W���b�N]";
			mes "�����A�܂������O�c�c";
			mes "���ɋ���������̂��H";
			mes "�t���B";
			mes "���܂��������ނ�";
			mes "��ςȂ��ƂɂȂ邼�B";
			next;
			switch(select("����������","�˗��ɂ��ĕ���","����ɂ��ĕ���","�񑩂Ƃ́H")) {
			case 1:
				mes "[�����f�B�[�W���b�N]";
				mes "�c�O�����c�c";
				mes "���͂��O�ɋ����͂Ȃ��B";
				mes "�䂦�ɁA��邱�Ƃ��Ȃ��B";
				mes "�����������Ƃ��B";
				close;
			case 2:
				mes "[�����f�B�[�W���b�N]";
				mes "���̎��Ƃ������Ƃ��c�c";
				mes "��������Ȉ˗����󂯂Ă��܂����B";
				mes "�M�p��肪���邩��";
				mes "�_�񂵂��z�̍s�����s���Ƃ͂���";
				mes "��x�_�񂵂����e��r����";
				mes "�����o���킯�ɂ������Ȃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "����ɉ����A";
				mes "���̃v���C�h�������Ȃ��B";
				mes "�_������Ƃ������t��";
				mes "�]���̂��Ƃ��Ȃ�����";
				mes "�s��Ȃ��̂��|���V�[���B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�Ƃ͂������O�̂悤�Ȗ`���҂�";
				mes "�˗��̈ꕔ��C���邱�Ƃ��ł���";
				mes "�ǂ������B";
				mes "��d�_�񂪑ʖڂƂ͌_�񏑂�";
				mes "�����ĂȂ����������͂Ȃ��B";
				close;
			case 3:
				mes "[�����f�B�[�W���b�N]";
				mes "�����A���̐��ŐM������̂�";
				mes "�����Ȃ����B";
				mes "�M����񑩂̂悤�Ȃ��̂�";
				mes "�S���Ӗ��̂Ȃ����Ƃ��B";
				mes "���؂�����A�j�邱�Ƃ�";
				mes "���ɁA�ȒP������ȁB";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�����炱���c�c";
				mes "�����M����͎̂������g��";
				mes "������������������B";
				mes "���l���x���邪";
				mes "�������g���x���Ȃ��B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "����ɖ񑩂�M����";
				mes "���؂���ƈ⍦���c������";
				mes "���낢��ʓ|�����A";
				mes "����͕�V�����������";
				mes "�񕜂��邱�Ƃ��ł���B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "�t���A���ʂɂ���ׂ肷�������B";
				mes "�Ƃɂ������͈ȏ�̂悤��";
				mes "�l���Ă���Ƃ������Ƃ��B";
				mes "����𗝉�����Ƃ��A";
				mes "�]���Ƃ��v���Ă��Ȃ��B";
				mes "���������������Ăق����B";
				close;
			case 4:
				mes "[�����f�B�[�W���b�N]";
				mes "�񑩂ɂ��āc�c���ƁH";
				mes "��������̂��O�ɘb���K�v��";
				mes "����Ƃ����񂾁H";
				mes "���܂�F�������";
				mes "�g��łڂ����ƂɂȂ邼�B";
				next;
				mes "[�����f�B�[�W���b�N]";
				mes "���͎d���Ȃ��\�ɏo�Ă��邪�A";
				mes "�e�̒��Ő����čs���̂�";
				mes "�{���A���̐��������B";
				mes "�䂦�ɕK�v�Ȃ��ƈȊO��";
				mes "���ɘb������͂Ȃ��B";
				close;
			}
		}
	}
	if(JTB_DAILY == 0) {
		if(Job < Job_RuneKnight || (BaseLevel <= 89 && Job == Job_Summoner)) {
			mes "[�����f�B�[�W���b�N]";
			mes "���͍��A";
			mes "�˗����󂯂Ă����l����T���̂�";
			mes "�Z�����񂾁B";
			mes "�ז������Ȃ��ł���B";
			next;
			mes "�]^ff0000�����f�B�[�W���b�N�̈˗���";
			mes "�@3���E�A4���E�A�e�T�A�O�A���x���I���A";
			mes "�@���E�˔j�����X�[�p�[�m�[�r�X�A";
			mes "�@����A�\�E�����[�p�[�A";
			mes "�@BaseLv90�ȏ�̃h�������̂�";
			mes "�@�󂯂鎖���\�ł�^000000�]";
			close;
		}
		mes "[�����f�B�[�W���b�N]";
		mes "�����H";
		mes "���ĕ�����Ȃ����H";
		mes "���͍��A�Z�����񂾁B";
		mes "�ז������Ȃ��ł���B";
		close;
	}	else {
		emotion 0;
		mes "[�����f�B�[�W���b�N]";
		mes "���O���c�c�B";
		mes "�j���I�[�Y�̌��ȗ����ȁB";
		mes "���ЂȂ悤�ŉ���肾�B";
		next;
		emotion 0;
		mes "[�����f�B�[�W���b�N]";
		mes "�ǂ������A�s�v�c�����Ȋ�����āB";
		mes "���̎p�ɉ΂������ł�";
		mes "����̂��H";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�����A���̎��͎p���B���Ă�������ȁB";
		mes "���̎p�͏��߂Č���̂��B";
		mes "����Ȃ��Ƃ͎v�����䖝���Ă���B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���āA�{��Ȃ񂾂��c�c�B";
		mes "���O�̘r��������ŗ��݂�����B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "�������A���O�̓A�C�O�̈˗���";
		mes "�󂯂Ă���񂾂낤�H";
		mes "�����ő��k���B";
		mes "�A�C�O�̈˗����������Ȃ���ł����B";
		mes "������̈˗���������";
		mes "���s���Ăق����̂��B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���̈˗����󂯂Ă����Ȃ�";
		mes "���_�A���������V���o���B";
		mes "�A�C�O����̕�V�Ƃ͕ʂɂ��B";
		mes "���O�ɂƂ��Ă����̘b��";
		mes "�������e�ł͂Ȃ��͂����B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "����l���Ȃ��Ă����B";
		mes "�A�C�O�̈˗�������������ł�";
		mes "���̈˗�����������B";
		mes "���ꂾ�����B";
		mes "�ȒP�Ȃ��Ƃ��낤�H";
		next;
		if(select("��`��","��`��Ȃ�") == 2) {
			emotion 0;
			mes "[�����f�B�[�W���b�N]";
			mes "�������B��Ԃ������������ȁB";
			mes "���̘b�͖Y��Ă���B";
			close;
		}
		mes "[�����f�B�[�W���b�N]";
		mes "�������A��`���Ă���邩�B";
		mes "������B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "������_�����A�C�����Ăق����B";
		mes "������̈˗��ɂ��Ă����A";
		mes "�A�C�O�ɂ͔閧���B";
		mes "�����˗����e��b������";
		mes "���O�̐g���ǂ��Ȃ邩�͕ۏ؂��Ȃ��B";
		next;
		mes "[�����f�B�[�W���b�N]";
		mes "���ꂶ��A�������ł�����";
		mes "�b�������Ă���B";
		set JTB_DAILY,2;
		close;
	}
OnTouch:
	if(JTB_DAILY == 1) {
		emotion 0;
		mes "[�����f�B�[�W���b�N]";
		mes "�����B";
		mes "�����̂��O�c�c�B";
		mes "������Ǝ��̏��܂ŗ��Ă���B";
		close;
	}
	end;
}

moc_para01.gat,17,77,5	script	�A�C�O#1	646,{
	if(JTB_DAILY >= 1) {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����ɂ��́I";
		mes "���������ꂵ���C���Ȃ́�";
		mes "���߂ĕ���ŉ̂������݂����ɁA";
		mes "�ƂĂ��V�N�Ȋ����Ȃ́I";
		next;
		switch(select("�˗����󂯂�","�˗���񍐂���","�˗���j������","�b������")) {
		case 1:
			if(BaseLevel >= 140) {
				cutin "igu02.bmp", 2;
				mes "[�A�C�O]";
				mes "���肪�Ƃ��Ȃ́�";
				mes "�ł����̈˗��͑��̐l�ɂ���";
				mes "���肢���Ă��܂����́B";
				mes "�����玄�ȊO�ō����Ă���l��";
				mes "�����Ă����Ăق����́B";
				next;
				cutin "igu02.bmp", 255;
				mes "�]^ff0000�A�C�O�̈˗���";
				mes "�@BaseLv140�ȏ�ł͎󂯂邱�Ƃ�";
				mes "�@�ł��܂���^000000�]";
				close;
			}
			if(checkquest(96815)) {
				if(!(checkquest(96815) & 0x2)) {
					mes "[�A�C�O]";
					mes "���肪�Ƃ��Ȃ́B";
					mes "�ł��A���ׂĂ�������΂��肾���A";
					mes "�����������Ԃ��o�߂��Ă���";
					mes "���肢�������́B";
					close2;
					cutin "igu01.bmp", 255;
					end;
				}
			}
			if(checkquest(13107)) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�^�i�g�X�^���[��";
				mes "�댯�ȏꏊ������";
				mes "�C��t���ĒT�����ė~�����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			if(checkquest(13108)) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�t���C����_�a��";
				mes "�댯�ȏꏊ������";
				mes "�C��t���ĒT�����ė~�����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			if(checkquest(13109)) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�����Ȃ�����";
				mes "�댯�ȏꏊ������";
				mes "�C��t���ĒT�����ė~�����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			if(checkquest(13110)) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�A�r�X���C�N��";
				mes "�댯�ȏꏊ������";
				mes "�C��t���ĒT�����ė~�����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			if(checkquest(13111) || checkquest(13112) || checkquest(13113) || checkquest(13114)) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�T���͏I������́H";
				mes "�܂��͌��ʂ�񍐂��Ăق����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			if(checkquest(116508) == 0) {
				cutin "igu03.bmp", 2;
				mes "[�A�C�O]";
				mes "���̐l��T���Ă����́H";
				mes "���肪�ƁA�Ȃ́�";
				next;
				cutin "igu01.bmp", 2;
				mes "[�A�C�O]";
				mes "�����T���Ă���l��";
				mes "����������T�����ĉ���Ă���";
				mes "�`���҂Ȃ́B�����͎���";
				mes "�c�A�[����A���Ă��邱��ɂ�";
				mes "�����ɖ߂��Ă���͂��Ȃ̂ɁA";
				mes "����͂��Ȃ�����S�z�Ȃ́B";
				next;
			} else {
				cutin "igu03.bmp", 2;
				mes "[�A�C�O]";
				mes "�j���I�[�Y��T���Ă����́H";
				mes "���肪�ƁA�Ȃ́�";
				next;
				cutin "igu01.bmp", 2;
				mes "[�A�C�O]";
				mes "�j���I�[�Y�͂����͎���";
				mes "�c�A�[����A���Ă��邱��ɂ�";
				mes "�����ɖ߂��Ă���͂��Ȃ̂ɁA";
				mes "����͂��Ȃ�����S�z�Ȃ́B";
				next;
			}
			mes "[�A�C�O]";
			mes "�m���ɂ�����ƕ��Q�Ȃ�";
			mes "����l�Ȃ񂾂��ǁc�c������A";
			mes "���̐l�������������Ă����ꏊ��";
			mes "�T���Ă݂ė~�����́B";
			mes "�C�ɓ������ꏊ�ɂ͉��x���s���l������";
			mes "�����������狏�邩������Ȃ��́I";
			next;
			cutin "igu04.bmp", 2;
			mes "[�A�C�O]";
			mes "�����ƁA���̃��X�g��";
			mes "�����Ȗ`���҂̐l���畷����";
			mes "���̐l�������������Ă����ꏊ�Ȃ́B";
			next;
			set '@sel,select("�^�i�g�X�^���[�T��","�t���C����_�a�T��","�����Ȃ����T��","�A�r�X���C�N�T��");
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			switch('@sel) {
			case 1:
				mes "�^�i�g�X�^���[�c�c�B";
				break;
			case 2:
				mes "�t���C����_�a�c�c�B";
				break;
			case 3:
				mes "�����Ȃ����c�c�B";
				break;
			case 4:
				mes "�A�r�X���C�N�c�c�B";
				break;
			}
			mes "�����Ȃ炠�̐l�����邩������Ȃ��́I";
			mes "���肢�ł���H";
			next;
			if(select("�󂯂�","��߂�") == 2) {
				cutin "igu05.bmp", 2;
				mes "[�A�C�O]";
				mes "�Ȃ́c�c�H";
				mes "�c�O�Ȃ́c�c�B";
				mes "�C���ς������܂�";
				mes "���������Ăق����́B";
				close2;
				cutin "igu05.bmp", 255;
				end;
			}
			mes "[�A�C�O]";
			mes "���肪�ƂȂ́I";
			mes "�댯�ȏꏊ������";
			mes "�C��t���ĒT�����ė~�����́B";
			switch('@sel) {
			case 1:
				setquest 13107;
				break;
			case 2:
				setquest 13108;
				break;
			case 3:
				setquest 13109;
				break;
			case 4:
				setquest 13110;
				break;
			}
			close2;
			cutin "igu01.bmp", 255;
			end;
		case 2:
			set '@quest,0;
			if(checkquest(13111)) {
				set '@quest,13111;
			}
			if(checkquest(13112)) {
				set '@quest,13112;
			}
			if(checkquest(13113)) {
				set '@quest,13113;
			}
			if(checkquest(13114)) {
				set '@quest,13114;
			}
			if('@quest == 0) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�Ȃ́H";
				mes "�������Ă���˗��͖����݂����B";
				mes "������x�悭�m�F���Ă݂Ăق����́B";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "��������Ȃ����I";
			mes "���̐l�͌�����Ȃ�����";
			mes "�݂��������ǁA";
			mes "���Ȃ��������ɋA���Ă��Ă��ꂽ����";
			mes "�ǂ������́�";
			next;
			mes "[�A�C�O]";
			mes "�˗��̂����n�������񂾂��ǁA";
			mes "��V��n���Ă������H";
			next;
			if(select("�͂�","������") == 2) {
				cutin "igu04.bmp", 2;
				mes "[�A�C�O]";
				mes "�Ȃ́H";
				mes "��V���󂯎���悤�ɂȂ�����";
				mes "�܂����Ăق����́�";
				close2;
				cutin "igu04.bmp", 255;
				end;
			}
			setquest 96815;
			delquest '@quest;
			switch('@quest) {
			case 13111:
				setquest 96816;
				break;
			case 13112:
				setquest 96817;
				break;
			case 13113:
				setquest 96818;
				break;
			case 13114:
				setquest 96819;
				break;
			}
			getexp 500000,0,0;
			getexp 500000,0,0;
			cutin "igu02.bmp", 2;
			mes "[�A�C�O]";
			mes "�{���ɂ��肪�ƂȂ́I";
			mes "�܂��ǂ��������`���Ăق����́�";
			close2;
			cutin "igu02.bmp", 255;
			end;
		case 3:
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "�˗��������d����j������́H";
			mes "�Z���������́H";
			mes "���߂�ˁA���肪�Ƃ��Ȃ́B";
			next;
			mes "[�A�C�O]";
			mes "�j���̕��@��2��ނ���́B";
			mes "�D���ȕ���I��ŁB";
			next;
			if(select("�˗��̔j��","�񍐋L�^�̔j��") == 1) {
				set '@quest,0;
				set '@quest,'@quest+checkquest(13107);
				set '@quest,'@quest+checkquest(13108);
				set '@quest,'@quest+checkquest(13109);
				set '@quest,'@quest+checkquest(13110);
				set '@quest,'@quest+checkquest(13111);
				set '@quest,'@quest+checkquest(13112);
				set '@quest,'@quest+checkquest(13113);
				set '@quest,'@quest+checkquest(13114);
				if('@quest == 0) {
					cutin "igu04.bmp", 2;
					mes "[�A�C�O]";
					mes "�Ȃ́H";
					mes "�˗��������d���͖����݂����B";
					mes "������x�悭�m�F���Ă݂Ăق����́B";
					close2;
					cutin "igu04.bmp", 255;
					end;
				}
				mes "[�A�C�O]";
				mes "�˗��̔j����";
				mes "�����Ȃ����󂯂Ă���˗���";
				mes "^FF0000�������Ă�����̂��܂߁A";
				mes "�S�Ă�j�����邱�ƂɂȂ�́B^000000";
				mes "�񍐋L�^�͎c��́B";
				next;
				mes "[�A�C�O]";
				mes "�������Ă���˗���j�����Ă��܂���";
				mes "��V��n�����Ƃ��ł��Ȃ��Ȃ�́B";
				mes "^FF0000�������Ă���˗��͐�ɕ񍐂�����";
				mes "��V���󂯎���Ă���A";
				mes "�˗��̔j�������Ăق����́B^000000";
				next;
				mes "[�A�C�O]";
				mes "�{���Ɉ˗���j�����Ă������H";
				next;
				if(select("�͂�","������") == 2) {
					cutin "igu02.bmp", 2;
					mes "[�A�C�O]";
					mes "�����Ă����́H";
					mes "�Z�����̂ɁA���肪�Ƃ��Ȃ́I";
					mes "���Ԃ��������Ă��\��Ȃ�����";
					mes "���肢�������́B";
					close2;
					cutin "igu02.bmp", 255;
					end;
				}
				delquest 13107;
				delquest 13108;
				delquest 13109;
				delquest 13110;
				delquest 13111;
				delquest 13112;
				delquest 13113;
				delquest 13114;
				mes "[�A�C�O]";
				mes "�˗��������d���͎�艺�����́B";
				mes "�܂��C����������";
				mes "��`���Ă����Ɗ������́I";
				close2;
				cutin "igu01.bmp", 255;
				end;
			} else {
				set '@quest,0;
				set '@quest,'@quest+checkquest(96816);
				set '@quest,'@quest+checkquest(96817);
				set '@quest,'@quest+checkquest(96818);
				set '@quest,'@quest+checkquest(96819);
				if('@quest == 0) {
					cutin "igu04.bmp", 2;
					mes "[�A�C�O]";
					mes "�Ȃ́H";
					mes "�������Ă���񍐂̋L�^��";
					mes "�����݂����B";
					mes "������x�悭�m�F���Ă݂Ăق����́B";
					close2;
					cutin "igu04.bmp", 255;
					end;
				}
				mes "[�A�C�O]";
				mes "�񍐋L�^�̔j����";
				mes "�����Ȃ���^FF0000�񍐂��Ă���˗���";
				mes "�S�Ă�j�����邱�ƂɂȂ�́B^000000";
				next;
				cutin "igu02.bmp", 255;
				mes "�]�񍐋L�^�̔j����";
				mes "^FF0000�@�����񍐂��s�����N�G�X�g��";
				mes "�@�S�ď������܂��B^000000";
				mes "�@���ʕ�V�𓾂邽�߂ɂ́A";
				mes "^FF0000�@�ēx4��ނ̃N�G�X�g���󂯁A";
				mes "�@��������K�v������܂�^000000�]";
				next;
				cutin "igu01.bmp", 2;
				mes "[�A�C�O]";
				mes "�{���ɕ񍐋L�^��j�����Ă������H";
				next;
				if(select("�͂�","������") == 2) {
					mes "[�A�C�O]";
					mes "�񍐋L�^�̔j���͂�߂��́B";
					mes "���Ԃ��������Ă��\��Ȃ�����A";
					mes "�F�X�ȏ���T���Ăق����́B";
					close2;
					cutin "igu01.bmp", 255;
					end;
				}
				delquest 96816;
				delquest 96817;
				delquest 96818;
				delquest 96819;
				mes "[�A�C�O]";
				mes "���Ȃ����񍐂����L�^��";
				mes "�S�Ĕj�������́B";
				mes "�܂��C����������";
				mes "��`���Ă����Ɗ������́I";
				close2;
				cutin "igu01.bmp", 255;
				end;
			}
		case 4:
			cutin "igu01.bmp", 2;
			mes "[�A�C�O]";
			mes "�����c���𖱂߂邽��ۂۊy�c��";
			mes "���E�̂����ȏꏊ������Ȃ���A";
			mes "�l�X�ɖ����̉��y��`����M���h�Ȃ́�";
			next;
			cutin "igu02.bmp", 2;
			mes "[�A�C�O]";
			mes "���ۂɎ������͖̉̂��@�ł͂Ȃ����ǁA";
			mes "�l�X�̗͂ɂȂ�̂͊m���Ȃ��ƂȂ́B";
			mes "�����Ď��������݂�Ȃ���A";
			mes "���t��Ί�Ō��C�����Ă���́B";
			mes "�������̉̂͂��������";
			mes "���E�������Ă���́�";
			close2;
			cutin "igu02.bmp", 255;
			end;
		}
	}
	if(Job < Job_RuneKnight || (BaseLevel <= 89 && Job == Job_Summoner)) {
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "����ɂ��́�";
		mes "�y���c�̖`���҂�";
		mes "�D�����l�΂��肾�ƕ������́B";
		mes "�����ǂ������玄�̂��肢��";
		mes "�����Ă����l��T���Ă���́B";
		next;
		cutin "igu04.bmp", 2;
		mes "[�A�C�O]";
		mes "�ł����Ȃ��ɂ͂܂�";
		mes "���肢�ł������ɂȂ��́c�c�B";
		mes "�ƂĂ��댯�Ȉ˗�������A";
		mes "�������������Ȃ��Ă���";
		mes "���̂��肢�𕷂��Ăق����́I";
		next;
		cutin "igu04.bmp", 255;
		mes "�]^ff0000�A�C�O�̈˗���";
		mes "�@3���E�A4���E�A�e�T�A�O�A���x���I���A";
		mes "�@���E�˔j�����X�[�p�[�m�[�r�X�A";
		mes "�@����A�\�E�����[�p�[�A";
		mes "�@BaseLv90�ȏ�̃h�������̂�";
		mes "�@�󂯂鎖���\�ł�^000000�]";
		close;
	}
	if(checkquest(116508) == 0) {
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "����ɂ��́�";
		mes "�y���c�̖`���҂�";
		mes "�D�����l�΂��肾�ƕ������́B";
		mes "�����ǂ������玄�̂��肢��";
		mes "�����Ăق����̂Ȃ́B";
		next;
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�悸�͎��ȏЉ�Ȃ́B";
		mes "����^FF0000����ۂۊy�c^000000�̒c����C����Ă���";
		mes "^FF0000�A�C�O^000000�Ȃ́�";
		next;
		mes "[�A�C�O]";
		mes "���͒������C�u�c�A�[����";
		mes "���A���Ă����Ƃ���Ȃ́B";
		mes "�s���������������炢";
		mes "�����ȏꏊ�ŉ̂��Ă����́�";
		mes "�������������";
		mes "�N���ɘb�������Ȃ�Ȃ��H";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "���͖��񂻂��Ȃ́B";
		mes "������A������^����ɉ����";
		mes "���̘b�����������l������񂾂��ǁA";
		mes "���̐l�ɉ�ɍs������";
		mes "���̐l�Ɏb���O����s����";
		mes "�킩��Ȃ����Č���ꂽ�́B";
		next;
		mes "[�A�C�O]";
		mes "������c�c";
		mes "�y���c�ɗ��݂ɂ����́c�c�B";
		mes "���̐l��T���Ă����������āB";
		mes "�����ǁc�c";
		next;
		mes "[�A�C�O]";
		mes "�s���s���̐l��T���Ă����A";
		mes "�S���҂����Ȃ����A�l�������Ȃ����A";
		mes "�݂�ȖZ�����Ƃ����āA";
		mes "�S�R����ɂ��Ă���Ȃ��́B";
		mes "������Ƃ����đ҂̂��������A";
		mes "���ڈ˗������鎖�ɂ����́I";
		next;
		mes "[�A�C�O]";
		mes "�c�c�����܂Řb�𕷂��Ă��ꂽ�̂�";
		mes "���Ȃ������߂ĂȂ́B";
		mes "�������I";
		mes "���f�����m�ł��Ȃ���";
		mes "����̈˗������肢�������́B";
		mes "���肢�Ȃ́c�c�I";
		next;
	}	else {
		cutin "igu02.bmp", 2;
		mes "[�A�C�O]";
		mes "�v���Ԃ�Ȃ́�";
		mes "���C�����ł悩�����́I";
		next;
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "���������ςȂ́I";
		mes "�j���I�[�Y���܂��ǂ�����";
		mes "���Ȃ��Ȃ���������́I";
		next;
		mes "[�A�C�O]";
		mes "�y���c�Ƀj���I�[�Y��";
		mes "�T���Ă����悤��";
		mes "���݂ɂ����񂾂���";
		mes "�S���҂����Ȃ��ĖZ��������";
		mes "�f��ꂿ������́c�c�B";
		next;
		cutin "igu01.bmp", 2;
		mes "[�A�C�O]";
		mes "������c�c�����Œ��ځA";
		mes "�`���҂̐l�ɂ��肢���鎖�ɂ����́I";
		next;
		mes "[�A�C�O]";
		mes "���Ȃ��Ȃ���͂��\���������S�Ȃ́I";
		mes "���f��������Ȃ����ǁA";
		mes "�����ǂ������玄�̂��肢��";
		mes "�����Ăق����́B";
		mes "���肢�Ȃ́c�c�B";
		next;
	}
	if(select("��`��","��`��Ȃ�") == 2) {
		cutin "igu05.bmp", 2;
		mes "[�A�C�O]";
		mes "�Ȃ́c�c�H";
		mes "���߂�Ȃ����c�c�B";
		mes "���Ȃ��ɂ��s��������́B";
		mes "�b�𕷂��Ă����";
		mes "���肪�Ƃ��Ȃ́c�c�B";
		close2;
		cutin "igu05.bmp", 255;
		end;
	}
	cutin "igu03.bmp", 2;
	mes "[�A�C�O]";
	mes "�悩�����I�@�����󂯂Ă����";
	mes "�Ƃ��Ă��������́I";
	mes "���̎��ɂ͂��Ȃ�����";
	mes "�����l�����Ȃ��́c�c�B";
	next;
	cutin "igu02.bmp", 2;
	mes "[�A�C�O]";
	mes "�˗����󂯂鏀�����ł�����";
	mes "������x�b�������ė~�����́B";
	mes "�˗����e�𐮗����āA";
	mes "�ڂ����b������́B";
	close2;
	cutin "igu02.bmp", 255;
	set JTB_DAILY,1;
	end;
}

thana_step.gat,167,292,5	script	�`���҂̍���#1	649,{
	if(checkquest(13107)) {
		mes "�]�N�������܂��Ă������Ղ����邪�A";
		mes "�@�N�Ȃ̂��͂킩��Ȃ��B";
		mes "�@�߂��ăA�C�O�ɕ񍐂��悤�]";
		delquest 13107;
		setquest 13111;
		close;
	}
	mes "�]�N�������܂��Ă������Ղ�����]";
	close;
}

ra_san05.gat,265,69,5	script	�`���҂̍���#2	649,{
	if(checkquest(13108)) {
		mes "�]�N�������܂��Ă������Ղ����邪�A";
		mes "�@�N�Ȃ̂��͂킩��Ȃ��B";
		mes "�@�߂��ăA�C�O�ɕ񍐂��悤�]";
		delquest 13108;
		setquest 13112;
		close;
	}
	mes "�]�N�������܂��Ă������Ղ�����]";
	close;
}

abbey02.gat,155,290,5	script	�`���҂̍���#3	649,{
	if(checkquest(13109)) {
		mes "�]�N�������܂��Ă������Ղ����邪�A";
		mes "�@�N�Ȃ̂��͂킩��Ȃ��B";
		mes "�@�߂��ăA�C�O�ɕ񍐂��悤�]";
		delquest 13109;
		setquest 13113;
		close;
	}
	mes "�]�N�������܂��Ă������Ղ�����]";
	close;
}

abyss_03.gat,102,140,5	script	�`���҂̍���#4	649,{
	if(checkquest(13110)) {
		mes "�]�N�������܂��Ă������Ղ����邪�A";
		mes "�@�N�Ȃ̂��͂킩��Ȃ��B";
		mes "�@�߂��ăA�C�O�ɕ񍐂��悤�]";
		delquest 13110;
		setquest 13114;
		close;
	}
	mes "�]�N�������܂��Ă������Ղ�����]";
	close;
}
