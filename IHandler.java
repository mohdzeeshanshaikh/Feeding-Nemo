public interface IHandler  
{
        public void handleLevelRequest(int request);
        public void setSuccessor(IHandler next);
}

