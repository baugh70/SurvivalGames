public class Lobby implements Listener{
    ArrayList<Player> players = new ArrayList<>();
    
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        
        players.add(player);
    }
    
    public void onPlayerLeave(PlayerLeaveEvent){
        Player player = event.getPlayer();
        
        players.remove(player);
        
    }
    
    public void onPlayerKick(PlayerKickEvent event){
        Player player = event.getPlayer();
        
        players.remove(player);
    }
    
    public void onPlayerDropItem(PlayerDropItemEvent event){
        
        event.setCancelled(true);
    }
    
    public void onPlayerInteract(PlayerInteractEvent event){
        
        event.setCancelled(true);
    }
    
    public void onToggleFlightEvent(ToggleFlightEvent event){
        
        
    }
    
    public void on
}
