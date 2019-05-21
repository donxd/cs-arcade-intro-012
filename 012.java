int[] sortByHeight(int[] a) {
    
    Integer [] heightsInOrder = getHeightsInOrder( a );

    return fillHeigths( a, heightsInOrder );
}

Integer [] getHeightsInOrder ( int [] group ){
    Integer [] heights = getHeights( group );
    Arrays.sort( heights );
    
    return heights;
}

Integer [] getHeights ( int [] group ){
    List<Integer> heights = new ArrayList<>();
    
    for ( int element : group ){
        if ( element != -1 ){
            heights.add( element );
        }
    }
    
    return heights.toArray( new Integer [ heights.size() ] );
}

int [] fillHeigths ( int [] group, Integer [] heightsInOrder ){
    int indexHeights = 0;
    for ( int i = 0; i < group.length; i++ ){
        if ( group[ i ] != -1 ){
            group[ i ] = heightsInOrder[ indexHeights++ ];
        }
    }
    
    return group;
}