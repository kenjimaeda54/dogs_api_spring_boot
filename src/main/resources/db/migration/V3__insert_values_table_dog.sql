INSERT INTO DOG (breed, description, photos)
VALUES (
    'Caniche Anão',
    'O Caniche Anão é uma raça de cão pequena e elegante, conhecida por sua inteligência, pelagem encaracolada e natureza brincalhona. É uma das quatro variedades de Caniche reconhecidas, sendo as outras o Caniche Grande, o Caniche Médio e o Caniche Toy. Seu tamanho vária entre 25 e 28 centímetros de altura e pesa até cerca de 8kg,tem uma pelagem abundante, encaracolada e pode ser encontrada em diversas cores, como branco, preto, castanho, cinza e abrigo. A pelagem do Caniche é hipoalergênica, oque significa que produz menos alergias do que as outras raças.Tem um temperamento inteligente, dócil, brincalhão e muito apegado a família. É também um bom cão de guarda, pois e desconfiado com estranhos.Tem expectativa de vida 12 a 15 anos.Cão ativo que precisa de exercícios regulares para se manter saudável e feliz. Caminhadas diárias e brincadeiras no quintal são suficientes para atender as suas necessidades',
    '[\"https://ik.imagekit.io/yfosncxev/caniche%20anao/caniche_anao_1_IW9tmN_0T.jpg?updatedAt=1736681811328\", \"https://ik.imagekit.io/yfosncxev/caniche%20anao/caniche_anao_3_3RPNV_SnZ.jpeg?updatedAt=1736681810792\", \"https://ik.imagekit.io/yfosncxev/caniche%20anao/caniche_anao_2_wQsERZkCi.jpg?updatedAt=1736681810575\"]'
);

SET @last_dog_id = LAST_INSERT_ID();

INSERT INTO ATTRIBUTE (
    dog_id,
    affectionate_family,
    affectionate_children,
    affectionate_dogs,
    level_preparation_coat,
    fun,
    openness_to_strangers,
    level_adaptability,
    level_training,
    level_protection,
    energy,
    dilation
)
VALUES (
    @last_dog_id,
    5,
    3,
    4,
    5,
    3,
    5,
    3,
    3,
    3,
    5,
    3
);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Akita Japonês',
    'Acredita-se que os ancestrais do Akita Inu existam há milhares de anos, com origens que remontam a cães de caça da região montanhosa de Akita. Inicialmente, eles eram usados para caçar animais de grande porte, como ursos, javalis e veados. Ao longo dos séculos, o Akita também desempenhou outras funções, como cão de guarda, cão de combate (em períodos específicos da história japonesa) e, mais tarde, como cão de companhia. Durante o Período Edo (1603-1868), a raça ganhou destaque entre a nobreza japonesa, tornando-se um símbolo de status e proteção. A partir do século XX, esforços foram feitos para preservar e padronizar a raça, que quase foi extinta durante a Segunda Guerra Mundial. Grande e músculos. Os machos geralmente medem entre 64 e 70cm de altura na cernelha e pesam entre 34 e 54kg., As fêmeas medem entre 58 e 64cm Eles normalmente saio extremamente ligados a familia e aos seus donos',
    '[\"https://ik.imagekit.io/yfosncxev/Akita%20Japones/akita_2_tRcdVj6vd.jpg?updatedAt=1736681977974\", \"https://ik.imagekit.io/yfosncxev/Akita%20Japones/akita_1_rV9L-JX0L.png?updatedAt=1736681977294\", \"https://ik.imagekit.io/yfosncxev/Akita%20Japones/akita_3_T4xyVvaH_.jpg?updatedAt=1736681976554\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 4, 2, 1, 4, 2, 1, 3, 2, 3, 3, 2);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Bull Terrier',
    'O Bull Terrier foi desenvolvido na Inglaterra no século XIX, a partir do cruzamento entre o Buldogue Inglês Antigo (Old English Bulldog) e o Terrier Inglês Branco (White English Terrier), com o objetivo inicial de criar um cão para rinhas. Mais tarde, foram adicionadas outras raças, como o Dálmata, para refinar a aparência e o temperamento. Com a proibição das rinhas, o Bull Terrier passou a ser apreciado como cão de companhia. Sua caracterestica mais marcante e a cabeça longa e oval, sem stop. Possui um corpo músculo e bem balanceado Possui um tamanho geralmente entre 53 e 56 cm de altura na cernelha e pesam entre 25 e 30kg,geralmente as fêmeas são ligeiramente menores',
    '[\"https://ik.imagekit.io/yfosncxev/Bull%20Terrier/bull_terrier_3_xdB1hGV5D.jpg?updatedAt=1736682144027\", \"https://ik.imagekit.io/yfosncxev/Bull%20Terrier/bull_terrier_2_rtizg6HmeV.jpg?updatedAt=1736682144762\", \"https://ik.imagekit.io/yfosncxev/Bull%20Terrier/bull_terrier_1_4dcuiiebd.jpeg?updatedAt=1736779711148\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 4, 3, 2, 2, 5, 2, 3, 3, 3, 4, 2);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Chow Chow',
    'O Chow Chow é uma raça canina antiga, originária do norte da China. Conhecido por sua aparência majestosa, com uma juba espessa e uma língua azul-escura/preta, o Chow Chow tem uma história rica e um temperamento único. Acredita-se que o Chow Chow exista há mais de 2.000 anos, com origens que remontam à dinastia Han (206 a.C. - 220 d.C.). Ao longo de sua história, desempenhou diversas funções, como cão de guarda de templos, cão de caça, cão de tração e até mesmo como fonte de carne e peles em algumas regiões. Medio a grande, com uma estrutura compacta e musculosa.Os machos geralmente medem entre 48 e 56cm de altura na cernelha e pesam entre 25 e 32 kg. As femeasmedem entre 6 e 51 cm e pesam entre 20 e 27kg',
    '[\"https://ik.imagekit.io/yfosncxev/Chow%20Chow/chow_chow_2_mqRpGLhhV.jpg?updatedAt=1736682302066\", \"https://ik.imagekit.io/yfosncxev/Chow%20Chow/chow_chow_1_pP1exbjJE.jpg?updatedAt=1736682301221\", \"https://ik.imagekit.io/yfosncxev/Chow%20Chow/chow_chow_3_HmO0h1gYK.jpg?updatedAt=1736682301050\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 4, 2, 2, 5, 2, 1, 3, 2, 4, 3, 3);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Fox Paulistinha',
    'O Fox Paulistinha, também conhecido como Terrier Brasileiro, é uma raça canina genuinamente brasileira, reconhecida internacionalmente. Alegre, ativo e cheio de energia, o Fox Paulistinha é um ótimo companheiro para famílias ativas. A origem do Fox Paulistinha remonta ao século XIX, quando imigrantes europeus trouxeram para o Brasil pequenos terriers, principalmente da Europa. Esses cães foram cruzados com cães locais, resultando no desenvolvimento do Terrier Brasileiro. A raça era popular em fazendas e sítios, onde era utilizada para caçar pequenos roedores e como cão de guarda. Pequeno a medio porte. Machos geralmente medem entre 35 e 40cm de altura na cernelha e pesam entre 6 e 10kg.As fêmeas medem entre 33 e 38 cm e pesam entre 5 e 9kg',
    '[\"https://ik.imagekit.io/yfosncxev/Fox%20Paulistinha/fox_paulistinha_2_MHex8FqeJ.jpg?updatedAt=1736682518079\", \"https://ik.imagekit.io/yfosncxev/Fox%20Paulistinha/fox_paulistinha_1_t4WMzjLQF.jpg?updatedAt=1736682518145\", \"https://ik.imagekit.io/yfosncxev/Fox%20Paulistinha/fox_paulistinha_3_4JiS8L2ji.jpg?updatedAt=1736682517901\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 5, 4, 3, 2, 5, 3, 4, 4, 3, 4, 3);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Husky Siberiano',
    'O Husky Siberiano é uma raça canina originária da Sibéria, na Rússia, conhecida por sua beleza exuberante, resistência e capacidade de trabalho em climas frios. Eles foram originalmente criados pelo povo Chukchi como cães de trenó e companheiros. Medio porte. Machos 53-60 cm de altura e 20-27kg. Fêmeas 51-56 cm de altura e 16-23kg. O Husky Siberiano é um cão belo, enérgico e leal, mas que exige cuidados específicos e um dono ativo e dedicado. Antes de adquirir um, pesquise bastante sobre a raça e avalie se ela se encaixa no seu estilo de vida.',
    '[\"https://ik.imagekit.io/yfosncxev/Husky%20Siberiano/husky_seberiano_2_5VGHvdJp9.jpeg?updatedAt=1736682677640\", \"https://ik.imagekit.io/yfosncxev/Husky%20Siberiano/husky_seberiano_1_Nlx4_ZU4x.png?updatedAt=1736682677617\", \"https://ik.imagekit.io/yfosncxev/Husky%20Siberiano/husky_seberiano_3_wk0i9sAWL5.jpg?updatedAt=1736682676728\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 4, 3, 3, 4, 4, 2, 3, 2, 1, 5, 2);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Shih Tzu',
    'O Shih Tzu é uma raça de cão de companhia originária do Tibete, embora tenha se desenvolvido principalmente na China. O nome \"Shih Tzu\" significa \"cão leão\" em chinês, devido à sua aparência majestosa e pelagem exuberante. Acredita-se que o Shih Tzu exista há mais de mil anos, com origens que remontam ao Tibete, onde eram criados em mosteiros budistas. No século XVII, foram levados para a China e se tornaram os favoritos da realeza durante a dinastia Ming (1368-1644). Eram considerados cães sagrados e símbolos de status. Pequeno porte, classificado como cao de brinquedo. Geraalmente medem entre 20 e 28 cm de altura na cernelha e pesam entre 4 e 7kg',
    '[\"https://ik.imagekit.io/yfosncxev/Shih%20Tzu/shi_tzu_1_LcqqUIz83.jpg?updatedAt=1736682860698\", \"https://ik.imagekit.io/yfosncxev/Shih%20Tzu/shih_tzu_3_4Mk79FSz5.jpg?updatedAt=1736682860477\", \"https://ik.imagekit.io/yfosncxev/Shih%20Tzu/shih_tzu_2_IzotGguwc.jpg?updatedAt=1736682860522\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 5, 4, 4, 5, 4, 4, 5, 3, 2, 3, 3);

INSERT INTO DOG (breed, description, photos)
VALUES (
    'Pastor Alemão',
    'O Pastor Alemão é uma raça canina originária da Alemanha, conhecida mundialmente por sua inteligência, lealdade, versatilidade e aptidão para o trabalho. É uma das raças mais populares e admiradas em todo o mundo. O Pastor Alemão surgiu no final do século XIX, na Alemanha, através do trabalho do Capitão Max von Stephanitz, que buscava criar um cão pastor ideal, combinando as melhores características dos cães pastores alemães da época. O objetivo era desenvolver um cão versátil, capaz de pastorear rebanhos, proteger propriedades e auxiliar em diversas outras tarefas. Grande porte. Os machos medem entre 60 e 65 cm de altura na cernelha e pesam entre 30 e 40kg. As fêmeas medem entre 55 e 60cm e pesam entre 22 e 32 kg',
    '[\"https://ik.imagekit.io/yfosncxev/Pastor%20Alemao/pastor_alemao_3_iQvYaapGH.jpeg?updatedAt=1736683009082\", \"https://ik.imagekit.io/yfosncxev/Pastor%20Alemao/pastor_alemao_2_6vcwodX-f.jpg?updatedAt=1736683008771\", \"https://ik.imagekit.io/yfosncxev/Pastor%20Alemao/pastor_alemao_1_BkupDUOrN.jpg?updatedAt=1736683008552\"]'
);

SET @last_dog_id = LAST_INSERT_ID();
INSERT INTO ATTRIBUTE (dog_id, affectionate_family, affectionate_children, affectionate_dogs, level_preparation_coat, fun, openness_to_strangers, level_adaptability, level_training, level_protection, energy, dilation)
VALUES (@last_dog_id, 5, 4, 3, 4, 3, 4, 4, 5, 4, 5, 3);
