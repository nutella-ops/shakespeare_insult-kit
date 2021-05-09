;https://www.shakespeareswords.com/Public/Thesaurus.aspx?phrase=

(def adj1
    '[artless           
    bawdy              
    beslubbering       
    bootless           
    churlish            
    cockered            
    clouted   
    craven    
    currish   
    dankish   
    dissembling
    droning   
    errant    
    fawning   
    fobbing   
    froward   
    frothy  ;histy, yeasty, yesty  
    gleeking  
    goatish   
    gorbellied
    impertinent
    infectious
    jarring   
    loggerheaded
    lumpish   
    mammering 
    mangled   
    mewling   
    paunchy   
    pribbling 
    puking    
    puny      
    qualling  
    rank      
    reeky ;foul-smelling     
    roguish   
    ruttish   
    saucy     
    spleeny   
    spongy    
    surly     
    tottering 
    unmuzzled 
    vain      
    venomed   
    villainous
    warped    
    wayward   
    weedy     
    yeasty])

(def adj2
    '[base-court
    bat-fowling
    beef-witted
    beetle-headed
    boil-brained
    clapper-clawed
    clay-brained
    common-kissing
    crook-pated
    dismal-dreaming
    dizzy-eyed
    doghearted
    dread-bolted
    earth-vexing
    elf-skinned
    fat-kidneyed
    fen-sucked
    flap-mouthed
    fly-bitten
    folly-fallen
    fool-born
    full-gorged
    guts-griping
    half-faced
    hasty-witted
    hedge-born
    hell-hated
    idle-headed
    ill-breeding
    ill-nurtured
    knotty-pated
    milk-livered
    motley-minded ;bloody-minded
    onion-eyed
    plume-plucked
    pottle-deep
    pox-marked
    reeling-ripe
    rough-hewn
    rude-growing
    rump-fed
    shard-borne
    sheep-biting
    spur-galled
    swag-bellied
    tardy-gaited
    tickle-brained
    toad-spotted
    urchin-snouted
    weather-bitten])
    
(def noun3
    '[apple-john
    baggage
    barnacle
    bladder
    boar-pig
    bugbear
    bum-bailey
    canker-blossom
    clack-dish
    clotpole ;clotpoll, clotpole, clatpole, clodpole
    coxcomb
    codpiece
    death-token
    dewberry
    flap-dragon
    flax-wench
    flirt-gill
    foot-licker
    fustilarian
    giglot
    gudgeon
    haggard
    harpy
    hedge-pig
    horn-beast
    hugger-mugger
    joithead
    lewdster
    lout
    maggot-pie ;maggot pye, magpie
    malt-worm ;maltworm, tosspot
    mammet
    measle
    minnow
    miscreant
    moldwarp
    mumble-news
    nut-hook
    pigeon-egg
    pignut
    puttock
    pumpion
    ratsbane
    scut  ;short tail [as of a deer]
    skainsmate
    strumpet
    varlot
    vassal
    whey-face ;milk-face, pasty-face
    wagtail])

(def punctuation
    '[? ... ! !? .])

(defn burn [] 
    "generate a shakespearean insult"
    (format "Thou %s %s %s%s" (rand-nth adj1) (rand-nth adj2) (rand-nth noun3) (rand-nth punctuation)))

(println (burn))